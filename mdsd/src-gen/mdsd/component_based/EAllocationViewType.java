/**
 */
package mdsd.component_based;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAllocation View Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.EAllocationViewType#getIncludes <em>Includes</em>}</li>
 * </ul>
 *
 * @see mdsd.component_based.Component_basedPackage#getEAllocationViewType()
 * @model
 * @generated
 */
public interface EAllocationViewType extends EViewType {
	/**
	 * Returns the value of the '<em><b>Includes</b></em>' containment reference list.
	 * The list contents are of type {@link mdsd.component_based.EAllocationContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes</em>' containment reference list.
	 * @see mdsd.component_based.Component_basedPackage#getEAllocationViewType_Includes()
	 * @model containment="true"
	 * @generated
	 */
	EList<EAllocationContext> getIncludes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void showComponentAllocations();

} // EAllocationViewType
