/**
 */
package mdsd.component_based;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EBehaviour Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.EBehaviourDescription#getInternalAction <em>Internal Action</em>}</li>
 *   <li>{@link mdsd.component_based.EBehaviourDescription#getLoop <em>Loop</em>}</li>
 *   <li>{@link mdsd.component_based.EBehaviourDescription#getBranch <em>Branch</em>}</li>
 *   <li>{@link mdsd.component_based.EBehaviourDescription#getExternalCall <em>External Call</em>}</li>
 * </ul>
 *
 * @see mdsd.component_based.Component_basedPackage#getEBehaviourDescription()
 * @model
 * @generated
 */
public interface EBehaviourDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Action</b></em>' containment reference list.
	 * The list contents are of type {@link mdsd.component_based.EInternalAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Action</em>' containment reference list.
	 * @see mdsd.component_based.Component_basedPackage#getEBehaviourDescription_InternalAction()
	 * @model containment="true"
	 * @generated
	 */
	EList<EInternalAction> getInternalAction();

	/**
	 * Returns the value of the '<em><b>Loop</b></em>' containment reference list.
	 * The list contents are of type {@link mdsd.component_based.ELoop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop</em>' containment reference list.
	 * @see mdsd.component_based.Component_basedPackage#getEBehaviourDescription_Loop()
	 * @model containment="true"
	 * @generated
	 */
	EList<ELoop> getLoop();

	/**
	 * Returns the value of the '<em><b>Branch</b></em>' containment reference list.
	 * The list contents are of type {@link mdsd.component_based.EBranch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch</em>' containment reference list.
	 * @see mdsd.component_based.Component_basedPackage#getEBehaviourDescription_Branch()
	 * @model containment="true"
	 * @generated
	 */
	EList<EBranch> getBranch();

	/**
	 * Returns the value of the '<em><b>External Call</b></em>' containment reference list.
	 * The list contents are of type {@link mdsd.component_based.EExternalCall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Call</em>' containment reference list.
	 * @see mdsd.component_based.Component_basedPackage#getEBehaviourDescription_ExternalCall()
	 * @model containment="true"
	 * @generated
	 */
	EList<EExternalCall> getExternalCall();

} // EBehaviourDescription
