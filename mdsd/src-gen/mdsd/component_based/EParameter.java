/**
 */
package mdsd.component_based;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EParameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.EParameter#getName <em>Name</em>}</li>
 *   <li>{@link mdsd.component_based.EParameter#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see mdsd.component_based.Component_basedPackage#getEParameter()
 * @model
 * @generated
 */
public interface EParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mdsd.component_based.Component_basedPackage#getEParameter_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mdsd.component_based.EParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Boolean"</code>.
	 * The literals are from the enumeration {@link mdsd.component_based.PossibleParameterTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mdsd.component_based.PossibleParameterTypes
	 * @see #setType(PossibleParameterTypes)
	 * @see mdsd.component_based.Component_basedPackage#getEParameter_Type()
	 * @model default="Boolean" required="true"
	 * @generated
	 */
	PossibleParameterTypes getType();

	/**
	 * Sets the value of the '{@link mdsd.component_based.EParameter#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mdsd.component_based.PossibleParameterTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(PossibleParameterTypes value);

} // EParameter
