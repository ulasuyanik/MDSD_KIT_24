/**
 *
 * $Id$
 */
package mdsd.component_based.validation;

import mdsd.component_based.EComponent;
import mdsd.component_based.EInterface;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link mdsd.component_based.ERepositoryViewType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ERepositoryViewTypeValidator {
	boolean validate();

	boolean validateShowsComponents(EList<EComponent> value);

	boolean validateShowsInterfaces(EList<EInterface> value);
}
