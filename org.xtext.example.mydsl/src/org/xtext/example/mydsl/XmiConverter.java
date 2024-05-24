package org.xtext.example.mydsl;

import java.io.IOException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResourceSet;
import com.google.inject.Injector;
import java.io.File;

public class XmiConverter {

	public static void main(String[] args) {
        // Example usage:
        String inputFilePath = "C:\\Users\\Baris Kizilcelik\\Desktop\\MDSD\\org.xtext.example.mydsl\\src\\org\\xtext\\example\\mydsl\\MyDsl.xtext";  // Change with actual file path
        String outputFilePath = "C:\\Users\\Baris Kizilcelik\\Desktop\\MDSD\\org.xtext.example.mydsl\\src\\org\\xtext\\example\\mydsl\\MyFile.xmi";  // Change with desired output path
        
        // Verify the input file exists
        File inputFile = new File(inputFilePath);
        if (!inputFile.exists()) {
            System.err.println("Input file does not exist: " + inputFilePath);
            return;
        }
        
        MyDslStandaloneSetup.doSetup();
        Injector injector = new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
		
        XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
        
        // Convert the input file path to a proper file URI
        URI uri = URI.createFileURI(inputFilePath);
        
        // Load the Xtext resource
        Resource xtextResource = resourceSet.getResource(uri, true);
        
        // Check if the resource is loaded correctly
        if (xtextResource == null || xtextResource.getContents().isEmpty()) {
            System.err.println("Failed to load resource or resource is empty: " + inputFilePath);
            return;
        }
        
        // Resolve all proxies in the Xtext resource
        EcoreUtil.resolveAll(xtextResource);
        
        // Create a new resource for the XMI output
        Resource xmiResource = resourceSet.createResource(URI.createFileURI(outputFilePath));
        
        // Add the content of the Xtext resource to the XMI resource
        xmiResource.getContents().add(xtextResource.getContents().get(0));
        
        try {
            // Save the XMI resource
            xmiResource.save(null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    

    public static void convertToXMI(String inputFilePath, String outputFilePath) {
        // Initialize the language environment
        Injector injector = new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
        XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
        
        

        // Convert file paths to URIs
        URI inputURI = URI.createFileURI(inputFilePath);
        URI outputURI = URI.createFileURI(outputFilePath);

        try {
            // Load the Xtext resource
            Resource xtextResource = resourceSet.getResource(inputURI, true);
            EcoreUtil.resolveAll(xtextResource);

            if (xtextResource.getContents().isEmpty()) {
                throw new IllegalStateException("The Xtext resource is empty. No contents to convert.");
            }

            // Create an XMI resource and add the contents of the Xtext resource
            Resource xmiResource = resourceSet.createResource(outputURI);
            xmiResource.getContents().add(xtextResource.getContents().get(0));

            xmiResource.save(null);
            System.out.println("Conversion successful. XMI file created at: " + outputFilePath);
        } catch (IOException e) {
            System.err.println("Failed to save XMI file: " + e.getMessage());
            e.printStackTrace();
        } catch (IllegalStateException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
