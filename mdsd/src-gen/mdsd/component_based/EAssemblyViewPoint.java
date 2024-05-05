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
 *   <li>{@link mdsd.component_based.EAssemblyViewPoint#getAssemblyviewtype <em>Assemblyviewtype</em>}</li>
 * </ul>
 *
 * @see mdsd.component_based.Component_basedPackage#getEAssemblyViewPoint()
 * @model
 * @generated
 */
public interface EAssemblyViewPoint extends EViewPoint {
	/**
	 * Returns the value of the '<em><b>Assemblyviewtype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assemblyviewtype</em>' containment reference.
	 * @see #setAssemblyviewtype(EAssemblyViewType)
	 * @see mdsd.component_based.Component_basedPackage#getEAssemblyViewPoint_Assemblyviewtype()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EAssemblyViewType getAssemblyviewtype();

	/**
	 * Sets the value of the '{@link mdsd.component_based.EAssemblyViewPoint#getAssemblyviewtype <em>Assemblyviewtype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assemblyviewtype</em>' containment reference.
	 * @see #getAssemblyviewtype()
	 * @generated
	 */
	void setAssemblyviewtype(EAssemblyViewType value);

} // EAssemblyViewPoint
