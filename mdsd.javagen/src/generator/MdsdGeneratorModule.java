package generator;
 
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;
 
public class MdsdGeneratorModule extends AbstractGenericResourceRuntimeModule {
 
    @Override
    protected String getLanguageName() {
        return "mdsd.component_based.presentation.Component_basedEditor";
    }
 
    @Override
    protected String getFileExtensions() {
        return "component_based";
    }
 
    public Class<? extends IGenerator> bindIGenerator() {
        return MdsdGenerator.class;
    }
 
    public Class<? extends ResourceSet> bindResourceSet() {
        return ResourceSetImpl.class;
    }
 
}
