package generator;
 
import org.eclipse.xtext.ISetup;
 
import com.google.inject.Guice;
import com.google.inject.Injector;
 
public class MdsdGeneratorSetup implements ISetup {
 
    @Override
    public Injector createInjectorAndDoEMFRegistration() {
        return Guice.createInjector(new MdsdGeneratorModule());
    }
 
}