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
 *   <li>{@link mdsd.component_based.EDeploymentViewPoint#getEnvironmentviewtype <em>Environmentviewtype</em>}</li>
 *   <li>{@link mdsd.component_based.EDeploymentViewPoint#getAllocationviewtype <em>Allocationviewtype</em>}</li>
 * </ul>
 *
 * @see mdsd.component_based.Component_basedPackage#getEDeploymentViewPoint()
 * @model
 * @generated
 */
public interface EDeploymentViewPoint extends EViewPoint {
	/**
	 * Returns the value of the '<em><b>Environmentviewtype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environmentviewtype</em>' containment reference.
	 * @see #setEnvironmentviewtype(EEnvironmentViewType)
	 * @see mdsd.component_based.Component_basedPackage#getEDeploymentViewPoint_Environmentviewtype()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EEnvironmentViewType getEnvironmentviewtype();

	/**
	 * Sets the value of the '{@link mdsd.component_based.EDeploymentViewPoint#getEnvironmentviewtype <em>Environmentviewtype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environmentviewtype</em>' containment reference.
	 * @see #getEnvironmentviewtype()
	 * @generated
	 */
	void setEnvironmentviewtype(EEnvironmentViewType value);

	/**
	 * Returns the value of the '<em><b>Allocationviewtype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocationviewtype</em>' containment reference.
	 * @see #setAllocationviewtype(EAllocationViewType)
	 * @see mdsd.component_based.Component_basedPackage#getEDeploymentViewPoint_Allocationviewtype()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EAllocationViewType getAllocationviewtype();

	/**
	 * Sets the value of the '{@link mdsd.component_based.EDeploymentViewPoint#getAllocationviewtype <em>Allocationviewtype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocationviewtype</em>' containment reference.
	 * @see #getAllocationviewtype()
	 * @generated
	 */
	void setAllocationviewtype(EAllocationViewType value);

} // EDeploymentViewPoint
