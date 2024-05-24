/**
 */
package mdsd.component_based;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EDeployment View Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.EDeploymentViewPoint#getEnvironmentViewType <em>Environment View Type</em>}</li>
 *   <li>{@link mdsd.component_based.EDeploymentViewPoint#getAllocationViewType <em>Allocation View Type</em>}</li>
 * </ul>
 *
 * @see mdsd.component_based.Component_basedPackage#getEDeploymentViewPoint()
 * @model
 * @generated
 */
public interface EDeploymentViewPoint extends EViewPoint {
	/**
	 * Returns the value of the '<em><b>Environment View Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment View Type</em>' containment reference.
	 * @see #setEnvironmentViewType(EEnvironmentViewType)
	 * @see mdsd.component_based.Component_basedPackage#getEDeploymentViewPoint_EnvironmentViewType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EEnvironmentViewType getEnvironmentViewType();

	/**
	 * Sets the value of the '{@link mdsd.component_based.EDeploymentViewPoint#getEnvironmentViewType <em>Environment View Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment View Type</em>' containment reference.
	 * @see #getEnvironmentViewType()
	 * @generated
	 */
	void setEnvironmentViewType(EEnvironmentViewType value);

	/**
	 * Returns the value of the '<em><b>Allocation View Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation View Type</em>' containment reference.
	 * @see #setAllocationViewType(EAllocationViewType)
	 * @see mdsd.component_based.Component_basedPackage#getEDeploymentViewPoint_AllocationViewType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EAllocationViewType getAllocationViewType();

	/**
	 * Sets the value of the '{@link mdsd.component_based.EDeploymentViewPoint#getAllocationViewType <em>Allocation View Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocation View Type</em>' containment reference.
	 * @see #getAllocationViewType()
	 * @generated
	 */
	void setAllocationViewType(EAllocationViewType value);

} // EDeploymentViewPoint
