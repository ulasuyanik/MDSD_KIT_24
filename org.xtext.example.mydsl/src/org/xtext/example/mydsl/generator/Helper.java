package org.xtext.example.mydsl.generator;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

public class Helper {
	public static void saveRecourceAsXmi( Resource resource) {

        try {
            Map<String, String> saveOptions = new HashMap<String, String>();
            Resource xmiResource = new XMIResourceImpl(URI.createURI(resource.getURI().toString().replace("mydsl", "mydslxmi")));
            xmiResource.getContents().add(resource.getContents().get(0));
            saveOptions.put(org.eclipse.emf.ecore.xmi.XMLResource.OPTION_ENCODING, "UTF-8");
            xmiResource.save(saveOptions);
            System.out.println("Xmi file created..");
        } catch (IOException e) {
            System.out.println("Durind saving Xmi file filename.myextension error has been occued.");
            e.printStackTrace();
        }        
    }
}
