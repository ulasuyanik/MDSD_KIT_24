/**
 */
package mdsd.component_based;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EExternal Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.EExternalCall#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see mdsd.component_based.Component_basedPackage#getEExternalCall()
 * @model
 * @generated
 */
public interface EExternalCall extends EObject {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(EService)
	 * @see mdsd.component_based.Component_basedPackage#getEExternalCall_To()
	 * @model required="true"
	 * @generated
	 */
	EService getTo();

	/**
	 * Sets the value of the '{@link mdsd.component_based.EExternalCall#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(EService value);

} // EExternalCall
