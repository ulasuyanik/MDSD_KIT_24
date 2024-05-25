/**
 */
package mdsd.component_based;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ERoot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.ERoot#getEviewpoint <em>Eviewpoint</em>}</li>
 *   <li>{@link mdsd.component_based.ERoot#getEviewtype <em>Eviewtype</em>}</li>
 *   <li>{@link mdsd.component_based.ERoot#getEparameter <em>Eparameter</em>}</li>
 *   <li>{@link mdsd.component_based.ERoot#getEsignature <em>Esignature</em>}</li>
 *   <li>{@link mdsd.component_based.ERoot#getEdelegationconnector <em>Edelegationconnector</em>}</li>
 *   <li>{@link mdsd.component_based.ERoot#getErole <em>Erole</em>}</li>
 *   <li>{@link mdsd.component_based.ERoot#getElink <em>Elink</em>}</li>
 *   <li>{@link mdsd.component_based.ERoot#getEcontainer <em>Econtainer</em>}</li>
 *   <li>{@link mdsd.component_based.ERoot#getEassemblyconnector <em>Eassemblyconnector</em>}</li>
 *   <li>{@link mdsd.component_based.ERoot#getEassemblycontext <em>Eassemblycontext</em>}</li>
 *   <li>{@link mdsd.component_based.ERoot#getEcomponent <em>Ecomponent</em>}</li>
 *   <li>{@link mdsd.component_based.ERoot#getEservice <em>Eservice</em>}</li>
 *   <li>{@link mdsd.component_based.ERoot#getEinterface <em>Einterface</em>}</li>
 *   <li>{@link mdsd.component_based.ERoot#getEsystem <em>Esystem</em>}</li>
 *   <li>{@link mdsd.component_based.ERoot#getErepository <em>Erepository</em>}</li>
 *   <li>{@link mdsd.component_based.ERoot#getEbehaviourdescription <em>Ebehaviourdescription</em>}</li>
 *   <li>{@link mdsd.component_based.ERoot#getEexternalcall <em>Eexternalcall</em>}</li>
 *   <li>{@link mdsd.component_based.ERoot#getEinternalaction <em>Einternalaction</em>}</li>
 *   <li>{@link mdsd.component_based.ERoot#getEbranch <em>Ebranch</em>}</li>
 *   <li>{@link mdsd.component_based.ERoot#getEloop <em>Eloop</em>}</li>
 *   <li>{@link mdsd.component_based.ERoot#getEcompositecomponent <em>Ecompositecomponent</em>}</li>
 *   <li>{@link mdsd.component_based.ERoot#getEallocationcontext <em>Eallocationcontext</em>}</li>
 * </ul>
 *
 * @see mdsd.component_based.Component_basedPackage#getERoot()
 * @model
 * @generated
 */
public interface ERoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Eviewpoint</b></em>' containment reference list.
	 * The list contents are of type {@link mdsd.component_based.EViewPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eviewpoint</em>' containment reference list.
	 * @see mdsd.component_based.Component_basedPackage#getERoot_Eviewpoint()
	 * @model containment="true"
	 * @generated
	 */
	EList<EViewPoint> getEviewpoint();

	/**
	 * Returns the value of the '<em><b>Eviewtype</b></em>' containment reference list.
	 * The list contents are of type {@link mdsd.component_based.EViewType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eviewtype</em>' containment reference list.
	 * @see mdsd.component_based.Component_basedPackage#getERoot_Eviewtype()
	 * @model containment="true"
	 * @generated
	 */
	EList<EViewType> getEviewtype();

	/**
	 * Returns the value of the '<em><b>Eparameter</b></em>' containment reference list.
	 * The list contents are of type {@link mdsd.component_based.EParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eparameter</em>' containment reference list.
	 * @see mdsd.component_based.Component_basedPackage#getERoot_Eparameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<EParameter> getEparameter();

	/**
	 * Returns the value of the '<em><b>Esignature</b></em>' containment reference list.
	 * The list contents are of type {@link mdsd.component_based.ESignature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Esignature</em>' containment reference list.
	 * @see mdsd.component_based.Component_basedPackage#getERoot_Esignature()
	 * @model containment="true"
	 * @generated
	 */
	EList<ESignature> getEsignature();

	/**
	 * Returns the value of the '<em><b>Edelegationconnector</b></em>' containment reference list.
	 * The list contents are of type {@link mdsd.component_based.EDelegationConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edelegationconnector</em>' containment reference list.
	 * @see mdsd.component_based.Component_basedPackage#getERoot_Edelegationconnector()
	 * @model containment="true"
	 * @generated
	 */
	EList<EDelegationConnector> getEdelegationconnector();

	/**
	 * Returns the value of the '<em><b>Erole</b></em>' containment reference list.
	 * The list contents are of type {@link mdsd.component_based.ERole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erole</em>' containment reference list.
	 * @see mdsd.component_based.Component_basedPackage#getERoot_Erole()
	 * @model containment="true"
	 * @generated
	 */
	EList<ERole> getErole();

	/**
	 * Returns the value of the '<em><b>Elink</b></em>' containment reference list.
	 * The list contents are of type {@link mdsd.component_based.ELink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elink</em>' containment reference list.
	 * @see mdsd.component_based.Component_basedPackage#getERoot_Elink()
	 * @model containment="true"
	 * @generated
	 */
	EList<ELink> getElink();

	/**
	 * Returns the value of the '<em><b>Econtainer</b></em>' containment reference list.
	 * The list contents are of type {@link mdsd.component_based.EContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Econtainer</em>' containment reference list.
	 * @see mdsd.component_based.Component_basedPackage#getERoot_Econtainer()
	 * @model containment="true"
	 * @generated
	 */
	EList<EContainer> getEcontainer();

	/**
	 * Returns the value of the '<em><b>Eassemblyconnector</b></em>' containment reference list.
	 * The list contents are of type {@link mdsd.component_based.EAssemblyConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eassemblyconnector</em>' containment reference list.
	 * @see mdsd.component_based.Component_basedPackage#getERoot_Eassemblyconnector()
	 * @model containment="true"
	 * @generated
	 */
	EList<EAssemblyConnector> getEassemblyconnector();

	/**
	 * Returns the value of the '<em><b>Eassemblycontext</b></em>' containment reference list.
	 * The list contents are of type {@link mdsd.component_based.EAssemblyContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eassemblycontext</em>' containment reference list.
	 * @see mdsd.component_based.Component_basedPackage#getERoot_Eassemblycontext()
	 * @model containment="true"
	 * @generated
	 */
	EList<EAssemblyContext> getEassemblycontext();

	/**
	 * Returns the value of the '<em><b>Ecomponent</b></em>' containment reference list.
	 * The list contents are of type {@link mdsd.component_based.EComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecomponent</em>' containment reference list.
	 * @see mdsd.component_based.Component_basedPackage#getERoot_Ecomponent()
	 * @model containment="true"
	 * @generated
	 */
	EList<EComponent> getEcomponent();

	/**
	 * Returns the value of the '<em><b>Eservice</b></em>' containment reference list.
	 * The list contents are of type {@link mdsd.component_based.EService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eservice</em>' containment reference list.
	 * @see mdsd.component_based.Component_basedPackage#getERoot_Eservice()
	 * @model containment="true"
	 * @generated
	 */
	EList<EService> getEservice();

	/**
	 * Returns the value of the '<em><b>Einterface</b></em>' containment reference list.
	 * The list contents are of type {@link mdsd.component_based.EInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Einterface</em>' containment reference list.
	 * @see mdsd.component_based.Component_basedPackage#getERoot_Einterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<EInterface> getEinterface();

	/**
	 * Returns the value of the '<em><b>Esystem</b></em>' containment reference list.
	 * The list contents are of type {@link mdsd.component_based.ESystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Esystem</em>' containment reference list.
	 * @see mdsd.component_based.Component_basedPackage#getERoot_Esystem()
	 * @model containment="true"
	 * @generated
	 */
	EList<ESystem> getEsystem();

	/**
	 * Returns the value of the '<em><b>Erepository</b></em>' containment reference list.
	 * The list contents are of type {@link mdsd.component_based.ERepository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erepository</em>' containment reference list.
	 * @see mdsd.component_based.Component_basedPackage#getERoot_Erepository()
	 * @model containment="true"
	 * @generated
	 */
	EList<ERepository> getErepository();

	/**
	 * Returns the value of the '<em><b>Ebehaviourdescription</b></em>' containment reference list.
	 * The list contents are of type {@link mdsd.component_based.EBehaviourDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ebehaviourdescription</em>' containment reference list.
	 * @see mdsd.component_based.Component_basedPackage#getERoot_Ebehaviourdescription()
	 * @model containment="true"
	 * @generated
	 */
	EList<EBehaviourDescription> getEbehaviourdescription();

	/**
	 * Returns the value of the '<em><b>Eexternalcall</b></em>' containment reference list.
	 * The list contents are of type {@link mdsd.component_based.EExternalCall}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eexternalcall</em>' containment reference list.
	 * @see mdsd.component_based.Component_basedPackage#getERoot_Eexternalcall()
	 * @model containment="true"
	 * @generated
	 */
	EList<EExternalCall> getEexternalcall();

	/**
	 * Returns the value of the '<em><b>Einternalaction</b></em>' containment reference list.
	 * The list contents are of type {@link mdsd.component_based.EInternalAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Einternalaction</em>' containment reference list.
	 * @see mdsd.component_based.Component_basedPackage#getERoot_Einternalaction()
	 * @model containment="true"
	 * @generated
	 */
	EList<EInternalAction> getEinternalaction();

	/**
	 * Returns the value of the '<em><b>Ebranch</b></em>' containment reference list.
	 * The list contents are of type {@link mdsd.component_based.EBranch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ebranch</em>' containment reference list.
	 * @see mdsd.component_based.Component_basedPackage#getERoot_Ebranch()
	 * @model containment="true"
	 * @generated
	 */
	EList<EBranch> getEbranch();

	/**
	 * Returns the value of the '<em><b>Eloop</b></em>' containment reference list.
	 * The list contents are of type {@link mdsd.component_based.ELoop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eloop</em>' containment reference list.
	 * @see mdsd.component_based.Component_basedPackage#getERoot_Eloop()
	 * @model containment="true"
	 * @generated
	 */
	EList<ELoop> getEloop();

	/**
	 * Returns the value of the '<em><b>Ecompositecomponent</b></em>' containment reference list.
	 * The list contents are of type {@link mdsd.component_based.ECompositeComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecompositecomponent</em>' containment reference list.
	 * @see mdsd.component_based.Component_basedPackage#getERoot_Ecompositecomponent()
	 * @model containment="true"
	 * @generated
	 */
	EList<ECompositeComponent> getEcompositecomponent();

	/**
	 * Returns the value of the '<em><b>Eallocationcontext</b></em>' containment reference list.
	 * The list contents are of type {@link mdsd.component_based.EAllocationContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eallocationcontext</em>' containment reference list.
	 * @see mdsd.component_based.Component_basedPackage#getERoot_Eallocationcontext()
	 * @model containment="true"
	 * @generated
	 */
	EList<EAllocationContext> getEallocationcontext();

} // ERoot
