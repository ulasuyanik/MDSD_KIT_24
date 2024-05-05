/**
 *
 * $Id$
 */
package mdsd.component_based.validation;

import mdsd.component_based.EParameter;
import mdsd.component_based.EService;
import mdsd.component_based.PossibleReturnTypes;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link mdsd.component_based.ESignature}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ESignatureValidator {
	boolean validate();

	boolean validateName(String value);

	boolean validateReturnType(PossibleReturnTypes value);

	boolean validateParameter(EList<EParameter> value);

	boolean validateCorrespondsTo(EList<EService> value);
}
