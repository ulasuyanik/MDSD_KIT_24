/**
 */
package mdsd.component_based;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAllocation Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.EAllocationContext#getControls <em>Controls</em>}</li>
 *   <li>{@link mdsd.component_based.EAllocationContext#getSpecifiesFor <em>Specifies For</em>}</li>
 *   <li>{@link mdsd.component_based.EAllocationContext#getSpecifies <em>Specifies</em>}</li>
 * </ul>
 *
 * @see mdsd.component_based.Component_basedPackage#getEAllocationContext()
 * @model
 * @generated
 */
public interface EAllocationContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Controls</b></em>' reference list.
	 * The list contents are of type {@link mdsd.component_based.EContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls</em>' reference list.
	 * @see mdsd.component_based.Component_basedPackage#getEAllocationContext_Controls()
	 * @model
	 * @generated
	 */
	EList<EContainer> getControls();

	/**
	 * Returns the value of the '<em><b>Specifies For</b></em>' reference list.
	 * The list contents are of type {@link mdsd.component_based.ESystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specifies For</em>' reference list.
	 * @see mdsd.component_based.Component_basedPackage#getEAllocationContext_SpecifiesFor()
	 * @model required="true"
	 * @generated
	 */
	EList<ESystem> getSpecifiesFor();

	/**
	 * Returns the value of the '<em><b>Specifies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specifies</em>' reference.
	 * @see #setSpecifies(EAssemblyContext)
	 * @see mdsd.component_based.Component_basedPackage#getEAllocationContext_Specifies()
	 * @model required="true"
	 * @generated
	 */
	EAssemblyContext getSpecifies();

	/**
	 * Sets the value of the '{@link mdsd.component_based.EAllocationContext#getSpecifies <em>Specifies</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specifies</em>' reference.
	 * @see #getSpecifies()
	 * @generated
	 */
	void setSpecifies(EAssemblyContext value);

} // EAllocationContext
