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
 *   <li>{@link mdsd.component_based.ESystemIndependentViewPoint#getRepositoryviewtype <em>Repositoryviewtype</em>}</li>
 * </ul>
 *
 * @see mdsd.component_based.Component_basedPackage#getESystemIndependentViewPoint()
 * @model
 * @generated
 */
public interface ESystemIndependentViewPoint extends EViewPoint {
	/**
	 * Returns the value of the '<em><b>Repositoryviewtype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repositoryviewtype</em>' containment reference.
	 * @see #setRepositoryviewtype(ERepositoryViewType)
	 * @see mdsd.component_based.Component_basedPackage#getESystemIndependentViewPoint_Repositoryviewtype()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ERepositoryViewType getRepositoryviewtype();

	/**
	 * Sets the value of the '{@link mdsd.component_based.ESystemIndependentViewPoint#getRepositoryviewtype <em>Repositoryviewtype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repositoryviewtype</em>' containment reference.
	 * @see #getRepositoryviewtype()
	 * @generated
	 */
	void setRepositoryviewtype(ERepositoryViewType value);

} // ESystemIndependentViewPoint
