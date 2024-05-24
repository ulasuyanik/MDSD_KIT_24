/**
 */
package mdsd.component_based;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ESystem Independent View Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.ESystemIndependentViewPoint#getRepositoryViewType <em>Repository View Type</em>}</li>
 * </ul>
 *
 * @see mdsd.component_based.Component_basedPackage#getESystemIndependentViewPoint()
 * @model
 * @generated
 */
public interface ESystemIndependentViewPoint extends EViewPoint {
	/**
	 * Returns the value of the '<em><b>Repository View Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository View Type</em>' containment reference.
	 * @see #setRepositoryViewType(ERepositoryViewType)
	 * @see mdsd.component_based.Component_basedPackage#getESystemIndependentViewPoint_RepositoryViewType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ERepositoryViewType getRepositoryViewType();

	/**
	 * Sets the value of the '{@link mdsd.component_based.ESystemIndependentViewPoint#getRepositoryViewType <em>Repository View Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository View Type</em>' containment reference.
	 * @see #getRepositoryViewType()
	 * @generated
	 */
	void setRepositoryViewType(ERepositoryViewType value);

} // ESystemIndependentViewPoint
