/**
 */
package mdsd.component_based;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAssembly View Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.EAssemblyViewPoint#getAssemblyViewType <em>Assembly View Type</em>}</li>
 * </ul>
 *
 * @see mdsd.component_based.Component_basedPackage#getEAssemblyViewPoint()
 * @model
 * @generated
 */
public interface EAssemblyViewPoint extends EViewPoint {
	/**
	 * Returns the value of the '<em><b>Assembly View Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly View Type</em>' containment reference.
	 * @see #setAssemblyViewType(EAssemblyViewType)
	 * @see mdsd.component_based.Component_basedPackage#getEAssemblyViewPoint_AssemblyViewType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EAssemblyViewType getAssemblyViewType();

	/**
	 * Sets the value of the '{@link mdsd.component_based.EAssemblyViewPoint#getAssemblyViewType <em>Assembly View Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly View Type</em>' containment reference.
	 * @see #getAssemblyViewType()
	 * @generated
	 */
	void setAssemblyViewType(EAssemblyViewType value);

} // EAssemblyViewPoint
