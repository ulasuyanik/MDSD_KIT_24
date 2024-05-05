/**
 *
 * $Id$
 */
package mdsd.component_based.validation;

import mdsd.component_based.EContainer;
import mdsd.component_based.ELink;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link mdsd.component_based.EEnvironmentViewType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface EEnvironmentViewTypeValidator {
	boolean validate();

	boolean validateShowsContainers(EList<EContainer> value);

	boolean validateShowsLinks(EList<ELink> value);
}
