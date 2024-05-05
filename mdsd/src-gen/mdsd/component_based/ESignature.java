/**
 */
package mdsd.component_based;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ESignature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.ESignature#getName <em>Name</em>}</li>
 *   <li>{@link mdsd.component_based.ESignature#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link mdsd.component_based.ESignature#getParameter <em>Parameter</em>}</li>
 *   <li>{@link mdsd.component_based.ESignature#getCorrespondsTo <em>Corresponds To</em>}</li>
 * </ul>
 *
 * @see mdsd.component_based.Component_basedPackage#getESignature()
 * @model
 * @generated
 */
public interface ESignature extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mdsd.component_based.Component_basedPackage#getESignature_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mdsd.component_based.ESignature#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' attribute.
	 * The default value is <code>"Void"</code>.
	 * The literals are from the enumeration {@link mdsd.component_based.PossibleReturnTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' attribute.
	 * @see mdsd.component_based.PossibleReturnTypes
	 * @see #setReturnType(PossibleReturnTypes)
	 * @see mdsd.component_based.Component_basedPackage#getESignature_ReturnType()
	 * @model default="Void" required="true"
	 * @generated
	 */
	PossibleReturnTypes getReturnType();

	/**
	 * Sets the value of the '{@link mdsd.component_based.ESignature#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' attribute.
	 * @see mdsd.component_based.PossibleReturnTypes
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(PossibleReturnTypes value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link mdsd.component_based.EParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see mdsd.component_based.Component_basedPackage#getESignature_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<EParameter> getParameter();

	/**
	 * Returns the value of the '<em><b>Corresponds To</b></em>' reference list.
	 * The list contents are of type {@link mdsd.component_based.EService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corresponds To</em>' reference list.
	 * @see mdsd.component_based.Component_basedPackage#getESignature_CorrespondsTo()
	 * @model
	 * @generated
	 */
	EList<EService> getCorrespondsTo();

} // ESignature
