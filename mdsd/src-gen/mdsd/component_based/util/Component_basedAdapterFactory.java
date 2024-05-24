/**
 */
package mdsd.component_based.util;

import mdsd.component_based.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mdsd.component_based.Component_basedPackage
 * @generated
 */
public class Component_basedAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Component_basedPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component_basedAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Component_basedPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Component_basedSwitch<Adapter> modelSwitch = new Component_basedSwitch<Adapter>() {
		@Override
		public Adapter caseERepository(ERepository object) {
			return createERepositoryAdapter();
		}

		@Override
		public Adapter caseESignature(ESignature object) {
			return createESignatureAdapter();
		}

		@Override
		public Adapter caseEComponent(EComponent object) {
			return createEComponentAdapter();
		}

		@Override
		public Adapter caseEInterface(EInterface object) {
			return createEInterfaceAdapter();
		}

		@Override
		public Adapter caseEParameter(EParameter object) {
			return createEParameterAdapter();
		}

		@Override
		public Adapter caseEService(EService object) {
			return createEServiceAdapter();
		}

		@Override
		public Adapter caseEAssemblyContext(EAssemblyContext object) {
			return createEAssemblyContextAdapter();
		}

		@Override
		public Adapter caseECompositeComponent(ECompositeComponent object) {
			return createECompositeComponentAdapter();
		}

		@Override
		public Adapter caseESystem(ESystem object) {
			return createESystemAdapter();
		}

		@Override
		public Adapter caseEAssemblyConnector(EAssemblyConnector object) {
			return createEAssemblyConnectorAdapter();
		}

		@Override
		public Adapter caseEContainer(EContainer object) {
			return createEContainerAdapter();
		}

		@Override
		public Adapter caseELink(ELink object) {
			return createELinkAdapter();
		}

		@Override
		public Adapter caseEAllocationContext(EAllocationContext object) {
			return createEAllocationContextAdapter();
		}

		@Override
		public Adapter caseERequiredDelegationConnector(ERequiredDelegationConnector object) {
			return createERequiredDelegationConnectorAdapter();
		}

		@Override
		public Adapter caseEProvidedDelegationConnector(EProvidedDelegationConnector object) {
			return createEProvidedDelegationConnectorAdapter();
		}

		@Override
		public Adapter caseEDelegationConnector(EDelegationConnector object) {
			return createEDelegationConnectorAdapter();
		}

		@Override
		public Adapter caseERole(ERole object) {
			return createERoleAdapter();
		}

		@Override
		public Adapter caseERequiredRole(ERequiredRole object) {
			return createERequiredRoleAdapter();
		}

		@Override
		public Adapter caseEProvidedRole(EProvidedRole object) {
			return createEProvidedRoleAdapter();
		}

		@Override
		public Adapter caseEEnvironmentViewType(EEnvironmentViewType object) {
			return createEEnvironmentViewTypeAdapter();
		}

		@Override
		public Adapter caseEAllocationViewType(EAllocationViewType object) {
			return createEAllocationViewTypeAdapter();
		}

		@Override
		public Adapter caseEAssemblyViewType(EAssemblyViewType object) {
			return createEAssemblyViewTypeAdapter();
		}

		@Override
		public Adapter caseERepositoryViewType(ERepositoryViewType object) {
			return createERepositoryViewTypeAdapter();
		}

		@Override
		public Adapter caseEViewPoint(EViewPoint object) {
			return createEViewPointAdapter();
		}

		@Override
		public Adapter caseESystemIndependentViewPoint(ESystemIndependentViewPoint object) {
			return createESystemIndependentViewPointAdapter();
		}

		@Override
		public Adapter caseEAssemblyViewPoint(EAssemblyViewPoint object) {
			return createEAssemblyViewPointAdapter();
		}

		@Override
		public Adapter caseEDeploymentViewPoint(EDeploymentViewPoint object) {
			return createEDeploymentViewPointAdapter();
		}

		@Override
		public Adapter caseEBehaviourDescription(EBehaviourDescription object) {
			return createEBehaviourDescriptionAdapter();
		}

		@Override
		public Adapter caseEInternalAction(EInternalAction object) {
			return createEInternalActionAdapter();
		}

		@Override
		public Adapter caseEExternalCall(EExternalCall object) {
			return createEExternalCallAdapter();
		}

		@Override
		public Adapter caseEBranch(EBranch object) {
			return createEBranchAdapter();
		}

		@Override
		public Adapter caseELoop(ELoop object) {
			return createELoopAdapter();
		}

		@Override
		public Adapter caseEViewType(EViewType object) {
			return createEViewTypeAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdsd.component_based.ERepository <em>ERepository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdsd.component_based.ERepository
	 * @generated
	 */
	public Adapter createERepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdsd.component_based.ESignature <em>ESignature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdsd.component_based.ESignature
	 * @generated
	 */
	public Adapter createESignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdsd.component_based.EComponent <em>EComponent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdsd.component_based.EComponent
	 * @generated
	 */
	public Adapter createEComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdsd.component_based.EInterface <em>EInterface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdsd.component_based.EInterface
	 * @generated
	 */
	public Adapter createEInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdsd.component_based.EParameter <em>EParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdsd.component_based.EParameter
	 * @generated
	 */
	public Adapter createEParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdsd.component_based.EService <em>EService</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdsd.component_based.EService
	 * @generated
	 */
	public Adapter createEServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdsd.component_based.EAssemblyContext <em>EAssembly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdsd.component_based.EAssemblyContext
	 * @generated
	 */
	public Adapter createEAssemblyContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdsd.component_based.ECompositeComponent <em>EComposite Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdsd.component_based.ECompositeComponent
	 * @generated
	 */
	public Adapter createECompositeComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdsd.component_based.ESystem <em>ESystem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdsd.component_based.ESystem
	 * @generated
	 */
	public Adapter createESystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdsd.component_based.EAssemblyConnector <em>EAssembly Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdsd.component_based.EAssemblyConnector
	 * @generated
	 */
	public Adapter createEAssemblyConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdsd.component_based.EContainer <em>EContainer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdsd.component_based.EContainer
	 * @generated
	 */
	public Adapter createEContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdsd.component_based.ELink <em>ELink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdsd.component_based.ELink
	 * @generated
	 */
	public Adapter createELinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdsd.component_based.EAllocationContext <em>EAllocation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdsd.component_based.EAllocationContext
	 * @generated
	 */
	public Adapter createEAllocationContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdsd.component_based.ERequiredDelegationConnector <em>ERequired Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdsd.component_based.ERequiredDelegationConnector
	 * @generated
	 */
	public Adapter createERequiredDelegationConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdsd.component_based.EProvidedDelegationConnector <em>EProvided Delegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdsd.component_based.EProvidedDelegationConnector
	 * @generated
	 */
	public Adapter createEProvidedDelegationConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdsd.component_based.EDelegationConnector <em>EDelegation Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdsd.component_based.EDelegationConnector
	 * @generated
	 */
	public Adapter createEDelegationConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdsd.component_based.ERole <em>ERole</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdsd.component_based.ERole
	 * @generated
	 */
	public Adapter createERoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdsd.component_based.ERequiredRole <em>ERequired Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdsd.component_based.ERequiredRole
	 * @generated
	 */
	public Adapter createERequiredRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdsd.component_based.EProvidedRole <em>EProvided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdsd.component_based.EProvidedRole
	 * @generated
	 */
	public Adapter createEProvidedRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdsd.component_based.EEnvironmentViewType <em>EEnvironment View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdsd.component_based.EEnvironmentViewType
	 * @generated
	 */
	public Adapter createEEnvironmentViewTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdsd.component_based.EAllocationViewType <em>EAllocation View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdsd.component_based.EAllocationViewType
	 * @generated
	 */
	public Adapter createEAllocationViewTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdsd.component_based.EAssemblyViewType <em>EAssembly View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdsd.component_based.EAssemblyViewType
	 * @generated
	 */
	public Adapter createEAssemblyViewTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdsd.component_based.ERepositoryViewType <em>ERepository View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdsd.component_based.ERepositoryViewType
	 * @generated
	 */
	public Adapter createERepositoryViewTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdsd.component_based.EViewPoint <em>EView Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdsd.component_based.EViewPoint
	 * @generated
	 */
	public Adapter createEViewPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdsd.component_based.ESystemIndependentViewPoint <em>ESystem Independent View Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdsd.component_based.ESystemIndependentViewPoint
	 * @generated
	 */
	public Adapter createESystemIndependentViewPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdsd.component_based.EAssemblyViewPoint <em>EAssembly View Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdsd.component_based.EAssemblyViewPoint
	 * @generated
	 */
	public Adapter createEAssemblyViewPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdsd.component_based.EDeploymentViewPoint <em>EDeployment View Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdsd.component_based.EDeploymentViewPoint
	 * @generated
	 */
	public Adapter createEDeploymentViewPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdsd.component_based.EBehaviourDescription <em>EBehaviour Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdsd.component_based.EBehaviourDescription
	 * @generated
	 */
	public Adapter createEBehaviourDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdsd.component_based.EInternalAction <em>EInternal Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdsd.component_based.EInternalAction
	 * @generated
	 */
	public Adapter createEInternalActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdsd.component_based.EExternalCall <em>EExternal Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdsd.component_based.EExternalCall
	 * @generated
	 */
	public Adapter createEExternalCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdsd.component_based.EBranch <em>EBranch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdsd.component_based.EBranch
	 * @generated
	 */
	public Adapter createEBranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdsd.component_based.ELoop <em>ELoop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdsd.component_based.ELoop
	 * @generated
	 */
	public Adapter createELoopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdsd.component_based.EViewType <em>EView Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdsd.component_based.EViewType
	 * @generated
	 */
	public Adapter createEViewTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Component_basedAdapterFactory
