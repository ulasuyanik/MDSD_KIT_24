/**
 */
package mdsd.component_based;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mdsd.component_based.Component_basedPackage
 * @generated
 */
public interface Component_basedFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Component_basedFactory eINSTANCE = mdsd.component_based.impl.Component_basedFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>ERepository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ERepository</em>'.
	 * @generated
	 */
	ERepository createERepository();

	/**
	 * Returns a new object of class '<em>ESignature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ESignature</em>'.
	 * @generated
	 */
	ESignature createESignature();

	/**
	 * Returns a new object of class '<em>EComponent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EComponent</em>'.
	 * @generated
	 */
	EComponent createEComponent();

	/**
	 * Returns a new object of class '<em>EInterface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EInterface</em>'.
	 * @generated
	 */
	EInterface createEInterface();

	/**
	 * Returns a new object of class '<em>EParameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EParameter</em>'.
	 * @generated
	 */
	EParameter createEParameter();

	/**
	 * Returns a new object of class '<em>EService</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EService</em>'.
	 * @generated
	 */
	EService createEService();

	/**
	 * Returns a new object of class '<em>EAssembly Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EAssembly Context</em>'.
	 * @generated
	 */
	EAssemblyContext createEAssemblyContext();

	/**
	 * Returns a new object of class '<em>EComposite Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EComposite Component</em>'.
	 * @generated
	 */
	ECompositeComponent createECompositeComponent();

	/**
	 * Returns a new object of class '<em>ESystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ESystem</em>'.
	 * @generated
	 */
	ESystem createESystem();

	/**
	 * Returns a new object of class '<em>EAssembly Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EAssembly Connector</em>'.
	 * @generated
	 */
	EAssemblyConnector createEAssemblyConnector();

	/**
	 * Returns a new object of class '<em>EContainer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EContainer</em>'.
	 * @generated
	 */
	EContainer createEContainer();

	/**
	 * Returns a new object of class '<em>ELink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ELink</em>'.
	 * @generated
	 */
	ELink createELink();

	/**
	 * Returns a new object of class '<em>EAllocation Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EAllocation Context</em>'.
	 * @generated
	 */
	EAllocationContext createEAllocationContext();

	/**
	 * Returns a new object of class '<em>ERequired Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ERequired Delegation Connector</em>'.
	 * @generated
	 */
	ERequiredDelegationConnector createERequiredDelegationConnector();

	/**
	 * Returns a new object of class '<em>EProvided Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EProvided Delegation Connector</em>'.
	 * @generated
	 */
	EProvidedDelegationConnector createEProvidedDelegationConnector();

	/**
	 * Returns a new object of class '<em>ERequired Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ERequired Role</em>'.
	 * @generated
	 */
	ERequiredRole createERequiredRole();

	/**
	 * Returns a new object of class '<em>EProvided Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EProvided Role</em>'.
	 * @generated
	 */
	EProvidedRole createEProvidedRole();

	/**
	 * Returns a new object of class '<em>EEnvironment View Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEnvironment View Type</em>'.
	 * @generated
	 */
	EEnvironmentViewType createEEnvironmentViewType();

	/**
	 * Returns a new object of class '<em>EAllocation View Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EAllocation View Type</em>'.
	 * @generated
	 */
	EAllocationViewType createEAllocationViewType();

	/**
	 * Returns a new object of class '<em>EAssembly View Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EAssembly View Type</em>'.
	 * @generated
	 */
	EAssemblyViewType createEAssemblyViewType();

	/**
	 * Returns a new object of class '<em>ERepository View Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ERepository View Type</em>'.
	 * @generated
	 */
	ERepositoryViewType createERepositoryViewType();

	/**
	 * Returns a new object of class '<em>EBehaviour Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EBehaviour Description</em>'.
	 * @generated
	 */
	EBehaviourDescription createEBehaviourDescription();

	/**
	 * Returns a new object of class '<em>EInternal Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EInternal Action</em>'.
	 * @generated
	 */
	EInternalAction createEInternalAction();

	/**
	 * Returns a new object of class '<em>EAssembly View Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EAssembly View Point</em>'.
	 * @generated
	 */
	EAssemblyViewPoint createEAssemblyViewPoint();

	/**
	 * Returns a new object of class '<em>EExternal Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EExternal Call</em>'.
	 * @generated
	 */
	EExternalCall createEExternalCall();

	/**
	 * Returns a new object of class '<em>EDeployment View Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EDeployment View Point</em>'.
	 * @generated
	 */
	EDeploymentViewPoint createEDeploymentViewPoint();

	/**
	 * Returns a new object of class '<em>ESystem Independent View Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ESystem Independent View Point</em>'.
	 * @generated
	 */
	ESystemIndependentViewPoint createESystemIndependentViewPoint();

	/**
	 * Returns a new object of class '<em>EBranch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EBranch</em>'.
	 * @generated
	 */
	EBranch createEBranch();

	/**
	 * Returns a new object of class '<em>ELoop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ELoop</em>'.
	 * @generated
	 */
	ELoop createELoop();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Component_basedPackage getComponent_basedPackage();

} //Component_basedFactory
