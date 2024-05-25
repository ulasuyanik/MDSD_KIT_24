/**
 */
package mdsd.component_based;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ERequired Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.ERequiredRole#getLinkedTo <em>Linked To</em>}</li>
 *   <li>{@link mdsd.component_based.ERequiredRole#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see mdsd.component_based.Component_basedPackage#getERequiredRole()
 * @model
 * @generated
 */
public interface ERequiredRole extends ERole {
	/**
	 * Returns the value of the '<em><b>Linked To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mdsd.component_based.EAssemblyConnector#getLinkTo <em>Link To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked To</em>' reference.
	 * @see #setLinkedTo(EAssemblyConnector)
	 * @see mdsd.component_based.Component_basedPackage#getERequiredRole_LinkedTo()
	 * @see mdsd.component_based.EAssemblyConnector#getLinkTo
	 * @model opposite="linkTo"
	 * @generated
	 */
	EAssemblyConnector getLinkedTo();

	/**
	 * Sets the value of the '{@link mdsd.component_based.ERequiredRole#getLinkedTo <em>Linked To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linked To</em>' reference.
	 * @see #getLinkedTo()
	 * @generated
	 */
	void setLinkedTo(EAssemblyConnector value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mdsd.component_based.Component_basedPackage#getERequiredRole_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mdsd.component_based.ERequiredRole#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ERequiredRole
