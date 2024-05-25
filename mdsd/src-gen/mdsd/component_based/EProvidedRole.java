/**
 */
package mdsd.component_based;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EProvided Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.EProvidedRole#getLinkedFrom <em>Linked From</em>}</li>
 *   <li>{@link mdsd.component_based.EProvidedRole#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see mdsd.component_based.Component_basedPackage#getEProvidedRole()
 * @model
 * @generated
 */
public interface EProvidedRole extends ERole {
	/**
	 * Returns the value of the '<em><b>Linked From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mdsd.component_based.EAssemblyConnector#getLinkFrom <em>Link From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked From</em>' reference.
	 * @see #setLinkedFrom(EAssemblyConnector)
	 * @see mdsd.component_based.Component_basedPackage#getEProvidedRole_LinkedFrom()
	 * @see mdsd.component_based.EAssemblyConnector#getLinkFrom
	 * @model opposite="linkFrom"
	 * @generated
	 */
	EAssemblyConnector getLinkedFrom();

	/**
	 * Sets the value of the '{@link mdsd.component_based.EProvidedRole#getLinkedFrom <em>Linked From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linked From</em>' reference.
	 * @see #getLinkedFrom()
	 * @generated
	 */
	void setLinkedFrom(EAssemblyConnector value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mdsd.component_based.Component_basedPackage#getEProvidedRole_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mdsd.component_based.EProvidedRole#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // EProvidedRole
