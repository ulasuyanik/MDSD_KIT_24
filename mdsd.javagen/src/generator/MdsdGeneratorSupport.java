package generator;
 
import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport;
 
import com.google.inject.Module;
 
public class MdsdGeneratorSupport extends AbstractGenericResourceSupport {
 
    @Override
    protected Module createGuiceModule() {
        return new MdsdGeneratorModule();
    }
}