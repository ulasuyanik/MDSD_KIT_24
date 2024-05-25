/**
 */
package mdsd.component_based.util;

import mdsd.component_based.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see mdsd.component_based.Component_basedPackage
 * @generated
 */
public class Component_basedSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Component_basedPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component_basedSwitch() {
		if (modelPackage == null) {
			modelPackage = Component_basedPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case Component_basedPackage.EREPOSITORY: {
			ERepository eRepository = (ERepository) theEObject;
			T result = caseERepository(eRepository);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Component_basedPackage.ESIGNATURE: {
			ESignature eSignature = (ESignature) theEObject;
			T result = caseESignature(eSignature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Component_basedPackage.ECOMPONENT: {
			EComponent eComponent = (EComponent) theEObject;
			T result = caseEComponent(eComponent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Component_basedPackage.EINTERFACE: {
			EInterface eInterface = (EInterface) theEObject;
			T result = caseEInterface(eInterface);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Component_basedPackage.EPARAMETER: {
			EParameter eParameter = (EParameter) theEObject;
			T result = caseEParameter(eParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Component_basedPackage.ESERVICE: {
			EService eService = (EService) theEObject;
			T result = caseEService(eService);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Component_basedPackage.EASSEMBLY_CONTEXT: {
			EAssemblyContext eAssemblyContext = (EAssemblyContext) theEObject;
			T result = caseEAssemblyContext(eAssemblyContext);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Component_basedPackage.ECOMPOSITE_COMPONENT: {
			ECompositeComponent eCompositeComponent = (ECompositeComponent) theEObject;
			T result = caseECompositeComponent(eCompositeComponent);
			if (result == null)
				result = caseEComponent(eCompositeComponent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Component_basedPackage.ESYSTEM: {
			ESystem eSystem = (ESystem) theEObject;
			T result = caseESystem(eSystem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Component_basedPackage.EASSEMBLY_CONNECTOR: {
			EAssemblyConnector eAssemblyConnector = (EAssemblyConnector) theEObject;
			T result = caseEAssemblyConnector(eAssemblyConnector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Component_basedPackage.ECONTAINER: {
			EContainer eContainer = (EContainer) theEObject;
			T result = caseEContainer(eContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Component_basedPackage.ELINK: {
			ELink eLink = (ELink) theEObject;
			T result = caseELink(eLink);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Component_basedPackage.EALLOCATION_CONTEXT: {
			EAllocationContext eAllocationContext = (EAllocationContext) theEObject;
			T result = caseEAllocationContext(eAllocationContext);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Component_basedPackage.EREQUIRED_DELEGATION_CONNECTOR: {
			ERequiredDelegationConnector eRequiredDelegationConnector = (ERequiredDelegationConnector) theEObject;
			T result = caseERequiredDelegationConnector(eRequiredDelegationConnector);
			if (result == null)
				result = caseEDelegationConnector(eRequiredDelegationConnector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Component_basedPackage.EPROVIDED_DELEGATION_CONNECTOR: {
			EProvidedDelegationConnector eProvidedDelegationConnector = (EProvidedDelegationConnector) theEObject;
			T result = caseEProvidedDelegationConnector(eProvidedDelegationConnector);
			if (result == null)
				result = caseEDelegationConnector(eProvidedDelegationConnector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Component_basedPackage.EDELEGATION_CONNECTOR: {
			EDelegationConnector eDelegationConnector = (EDelegationConnector) theEObject;
			T result = caseEDelegationConnector(eDelegationConnector);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Component_basedPackage.EROLE: {
			ERole eRole = (ERole) theEObject;
			T result = caseERole(eRole);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Component_basedPackage.EREQUIRED_ROLE: {
			ERequiredRole eRequiredRole = (ERequiredRole) theEObject;
			T result = caseERequiredRole(eRequiredRole);
			if (result == null)
				result = caseERole(eRequiredRole);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Component_basedPackage.EPROVIDED_ROLE: {
			EProvidedRole eProvidedRole = (EProvidedRole) theEObject;
			T result = caseEProvidedRole(eProvidedRole);
			if (result == null)
				result = caseERole(eProvidedRole);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Component_basedPackage.EENVIRONMENT_VIEW_TYPE: {
			EEnvironmentViewType eEnvironmentViewType = (EEnvironmentViewType) theEObject;
			T result = caseEEnvironmentViewType(eEnvironmentViewType);
			if (result == null)
				result = caseEViewType(eEnvironmentViewType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Component_basedPackage.EALLOCATION_VIEW_TYPE: {
			EAllocationViewType eAllocationViewType = (EAllocationViewType) theEObject;
			T result = caseEAllocationViewType(eAllocationViewType);
			if (result == null)
				result = caseEViewType(eAllocationViewType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Component_basedPackage.EASSEMBLY_VIEW_TYPE: {
			EAssemblyViewType eAssemblyViewType = (EAssemblyViewType) theEObject;
			T result = caseEAssemblyViewType(eAssemblyViewType);
			if (result == null)
				result = caseEViewType(eAssemblyViewType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Component_basedPackage.EREPOSITORY_VIEW_TYPE: {
			ERepositoryViewType eRepositoryViewType = (ERepositoryViewType) theEObject;
			T result = caseERepositoryViewType(eRepositoryViewType);
			if (result == null)
				result = caseEViewType(eRepositoryViewType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Component_basedPackage.EVIEW_POINT: {
			EViewPoint eViewPoint = (EViewPoint) theEObject;
			T result = caseEViewPoint(eViewPoint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Component_basedPackage.ESYSTEM_INDEPENDENT_VIEW_POINT: {
			ESystemIndependentViewPoint eSystemIndependentViewPoint = (ESystemIndependentViewPoint) theEObject;
			T result = caseESystemIndependentViewPoint(eSystemIndependentViewPoint);
			if (result == null)
				result = caseEViewPoint(eSystemIndependentViewPoint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Component_basedPackage.EASSEMBLY_VIEW_POINT: {
			EAssemblyViewPoint eAssemblyViewPoint = (EAssemblyViewPoint) theEObject;
			T result = caseEAssemblyViewPoint(eAssemblyViewPoint);
			if (result == null)
				result = caseEViewPoint(eAssemblyViewPoint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Component_basedPackage.EDEPLOYMENT_VIEW_POINT: {
			EDeploymentViewPoint eDeploymentViewPoint = (EDeploymentViewPoint) theEObject;
			T result = caseEDeploymentViewPoint(eDeploymentViewPoint);
			if (result == null)
				result = caseEViewPoint(eDeploymentViewPoint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Component_basedPackage.EBEHAVIOUR_DESCRIPTION: {
			EBehaviourDescription eBehaviourDescription = (EBehaviourDescription) theEObject;
			T result = caseEBehaviourDescription(eBehaviourDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Component_basedPackage.EINTERNAL_ACTION: {
			EInternalAction eInternalAction = (EInternalAction) theEObject;
			T result = caseEInternalAction(eInternalAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Component_basedPackage.EEXTERNAL_CALL: {
			EExternalCall eExternalCall = (EExternalCall) theEObject;
			T result = caseEExternalCall(eExternalCall);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Component_basedPackage.EBRANCH: {
			EBranch eBranch = (EBranch) theEObject;
			T result = caseEBranch(eBranch);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Component_basedPackage.ELOOP: {
			ELoop eLoop = (ELoop) theEObject;
			T result = caseELoop(eLoop);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Component_basedPackage.EVIEW_TYPE: {
			EViewType eViewType = (EViewType) theEObject;
			T result = caseEViewType(eViewType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Component_basedPackage.EROOT: {
			ERoot eRoot = (ERoot) theEObject;
			T result = caseERoot(eRoot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ERepository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ERepository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseERepository(ERepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ESignature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ESignature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESignature(ESignature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EComponent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EComponent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEComponent(EComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EInterface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EInterface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEInterface(EInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EParameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEParameter(EParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EService</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EService</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEService(EService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EAssembly Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EAssembly Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAssemblyContext(EAssemblyContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EComposite Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EComposite Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseECompositeComponent(ECompositeComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ESystem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ESystem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESystem(ESystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EAssembly Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EAssembly Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAssemblyConnector(EAssemblyConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EContainer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EContainer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEContainer(EContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ELink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ELink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseELink(ELink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EAllocation Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EAllocation Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAllocationContext(EAllocationContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ERequired Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ERequired Delegation Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseERequiredDelegationConnector(ERequiredDelegationConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EProvided Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EProvided Delegation Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEProvidedDelegationConnector(EProvidedDelegationConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDelegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDelegation Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDelegationConnector(EDelegationConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ERole</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ERole</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseERole(ERole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ERequired Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ERequired Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseERequiredRole(ERequiredRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EProvided Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EProvided Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEProvidedRole(EProvidedRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EEnvironment View Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEnvironment View Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEEnvironmentViewType(EEnvironmentViewType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EAllocation View Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EAllocation View Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAllocationViewType(EAllocationViewType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EAssembly View Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EAssembly View Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAssemblyViewType(EAssemblyViewType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ERepository View Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ERepository View Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseERepositoryViewType(ERepositoryViewType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EView Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EView Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEViewPoint(EViewPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ESystem Independent View Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ESystem Independent View Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESystemIndependentViewPoint(ESystemIndependentViewPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EAssembly View Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EAssembly View Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAssemblyViewPoint(EAssemblyViewPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EDeployment View Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDeployment View Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDeploymentViewPoint(EDeploymentViewPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EBehaviour Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EBehaviour Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEBehaviourDescription(EBehaviourDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EInternal Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EInternal Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEInternalAction(EInternalAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EExternal Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EExternal Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEExternalCall(EExternalCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EBranch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EBranch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEBranch(EBranch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ELoop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ELoop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseELoop(ELoop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EView Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EView Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEViewType(EViewType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ERoot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ERoot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseERoot(ERoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Component_basedSwitch
