/**
 */
package mdsd.component_based.impl;

import mdsd.component_based.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Component_basedFactoryImpl extends EFactoryImpl implements Component_basedFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Component_basedFactory init() {
		try {
			Component_basedFactory theComponent_basedFactory = (Component_basedFactory) EPackage.Registry.INSTANCE
					.getEFactory(Component_basedPackage.eNS_URI);
			if (theComponent_basedFactory != null) {
				return theComponent_basedFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Component_basedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component_basedFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Component_basedPackage.EREPOSITORY:
			return createERepository();
		case Component_basedPackage.ESIGNATURE:
			return createESignature();
		case Component_basedPackage.ECOMPONENT:
			return createEComponent();
		case Component_basedPackage.EINTERFACE:
			return createEInterface();
		case Component_basedPackage.EPARAMETER:
			return createEParameter();
		case Component_basedPackage.ESERVICE:
			return createEService();
		case Component_basedPackage.EASSEMBLY_CONTEXT:
			return createEAssemblyContext();
		case Component_basedPackage.ECOMPOSITE_COMPONENT:
			return createECompositeComponent();
		case Component_basedPackage.ESYSTEM:
			return createESystem();
		case Component_basedPackage.EASSEMBLY_CONNECTOR:
			return createEAssemblyConnector();
		case Component_basedPackage.ECONTAINER:
			return createEContainer();
		case Component_basedPackage.ELINK:
			return createELink();
		case Component_basedPackage.EALLOCATION_CONTEXT:
			return createEAllocationContext();
		case Component_basedPackage.EREQUIRED_DELEGATION_CONNECTOR:
			return createERequiredDelegationConnector();
		case Component_basedPackage.EPROVIDED_DELEGATION_CONNECTOR:
			return createEProvidedDelegationConnector();
		case Component_basedPackage.EREQUIRED_ROLE:
			return createERequiredRole();
		case Component_basedPackage.EPROVIDED_ROLE:
			return createEProvidedRole();
		case Component_basedPackage.EENVIRONMENT_VIEW_TYPE:
			return createEEnvironmentViewType();
		case Component_basedPackage.EALLOCATION_VIEW_TYPE:
			return createEAllocationViewType();
		case Component_basedPackage.EASSEMBLY_VIEW_TYPE:
			return createEAssemblyViewType();
		case Component_basedPackage.EREPOSITORY_VIEW_TYPE:
			return createERepositoryViewType();
		case Component_basedPackage.EBEHAVIOUR_DESCRIPTION:
			return createEBehaviourDescription();
		case Component_basedPackage.EINTERNAL_ACTION:
			return createEInternalAction();
		case Component_basedPackage.EASSEMBLY_VIEW_POINT:
			return createEAssemblyViewPoint();
		case Component_basedPackage.EEXTERNAL_CALL:
			return createEExternalCall();
		case Component_basedPackage.EDEPLOYMENT_VIEW_POINT:
			return createEDeploymentViewPoint();
		case Component_basedPackage.ESYSTEM_INDEPENDENT_VIEW_POINT:
			return createESystemIndependentViewPoint();
		case Component_basedPackage.EBRANCH:
			return createEBranch();
		case Component_basedPackage.ELOOP:
			return createELoop();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case Component_basedPackage.POSSIBLE_RETURN_TYPES:
			return createPossibleReturnTypesFromString(eDataType, initialValue);
		case Component_basedPackage.POSSIBLE_PARAMETER_TYPES:
			return createPossibleParameterTypesFromString(eDataType, initialValue);
		case Component_basedPackage.EVOID:
			return createEVoidFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case Component_basedPackage.POSSIBLE_RETURN_TYPES:
			return convertPossibleReturnTypesToString(eDataType, instanceValue);
		case Component_basedPackage.POSSIBLE_PARAMETER_TYPES:
			return convertPossibleParameterTypesToString(eDataType, instanceValue);
		case Component_basedPackage.EVOID:
			return convertEVoidToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ERepository createERepository() {
		ERepositoryImpl eRepository = new ERepositoryImpl();
		return eRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ESignature createESignature() {
		ESignatureImpl eSignature = new ESignatureImpl();
		return eSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EComponent createEComponent() {
		EComponentImpl eComponent = new EComponentImpl();
		return eComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EInterface createEInterface() {
		EInterfaceImpl eInterface = new EInterfaceImpl();
		return eInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EParameter createEParameter() {
		EParameterImpl eParameter = new EParameterImpl();
		return eParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EService createEService() {
		EServiceImpl eService = new EServiceImpl();
		return eService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAssemblyContext createEAssemblyContext() {
		EAssemblyContextImpl eAssemblyContext = new EAssemblyContextImpl();
		return eAssemblyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ECompositeComponent createECompositeComponent() {
		ECompositeComponentImpl eCompositeComponent = new ECompositeComponentImpl();
		return eCompositeComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ESystem createESystem() {
		ESystemImpl eSystem = new ESystemImpl();
		return eSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAssemblyConnector createEAssemblyConnector() {
		EAssemblyConnectorImpl eAssemblyConnector = new EAssemblyConnectorImpl();
		return eAssemblyConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EContainer createEContainer() {
		EContainerImpl eContainer = new EContainerImpl();
		return eContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ELink createELink() {
		ELinkImpl eLink = new ELinkImpl();
		return eLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAllocationContext createEAllocationContext() {
		EAllocationContextImpl eAllocationContext = new EAllocationContextImpl();
		return eAllocationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ERequiredDelegationConnector createERequiredDelegationConnector() {
		ERequiredDelegationConnectorImpl eRequiredDelegationConnector = new ERequiredDelegationConnectorImpl();
		return eRequiredDelegationConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EProvidedDelegationConnector createEProvidedDelegationConnector() {
		EProvidedDelegationConnectorImpl eProvidedDelegationConnector = new EProvidedDelegationConnectorImpl();
		return eProvidedDelegationConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ERequiredRole createERequiredRole() {
		ERequiredRoleImpl eRequiredRole = new ERequiredRoleImpl();
		return eRequiredRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EProvidedRole createEProvidedRole() {
		EProvidedRoleImpl eProvidedRole = new EProvidedRoleImpl();
		return eProvidedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnvironmentViewType createEEnvironmentViewType() {
		EEnvironmentViewTypeImpl eEnvironmentViewType = new EEnvironmentViewTypeImpl();
		return eEnvironmentViewType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAllocationViewType createEAllocationViewType() {
		EAllocationViewTypeImpl eAllocationViewType = new EAllocationViewTypeImpl();
		return eAllocationViewType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAssemblyViewType createEAssemblyViewType() {
		EAssemblyViewTypeImpl eAssemblyViewType = new EAssemblyViewTypeImpl();
		return eAssemblyViewType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ERepositoryViewType createERepositoryViewType() {
		ERepositoryViewTypeImpl eRepositoryViewType = new ERepositoryViewTypeImpl();
		return eRepositoryViewType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EBehaviourDescription createEBehaviourDescription() {
		EBehaviourDescriptionImpl eBehaviourDescription = new EBehaviourDescriptionImpl();
		return eBehaviourDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EInternalAction createEInternalAction() {
		EInternalActionImpl eInternalAction = new EInternalActionImpl();
		return eInternalAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAssemblyViewPoint createEAssemblyViewPoint() {
		EAssemblyViewPointImpl eAssemblyViewPoint = new EAssemblyViewPointImpl();
		return eAssemblyViewPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EExternalCall createEExternalCall() {
		EExternalCallImpl eExternalCall = new EExternalCallImpl();
		return eExternalCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDeploymentViewPoint createEDeploymentViewPoint() {
		EDeploymentViewPointImpl eDeploymentViewPoint = new EDeploymentViewPointImpl();
		return eDeploymentViewPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ESystemIndependentViewPoint createESystemIndependentViewPoint() {
		ESystemIndependentViewPointImpl eSystemIndependentViewPoint = new ESystemIndependentViewPointImpl();
		return eSystemIndependentViewPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EBranch createEBranch() {
		EBranchImpl eBranch = new EBranchImpl();
		return eBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ELoop createELoop() {
		ELoopImpl eLoop = new ELoopImpl();
		return eLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PossibleReturnTypes createPossibleReturnTypesFromString(EDataType eDataType, String initialValue) {
		PossibleReturnTypes result = PossibleReturnTypes.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPossibleReturnTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PossibleParameterTypes createPossibleParameterTypesFromString(EDataType eDataType, String initialValue) {
		PossibleParameterTypes result = PossibleParameterTypes.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPossibleParameterTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Void createEVoidFromString(EDataType eDataType, String initialValue) {
		return (Void) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEVoidToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component_basedPackage getComponent_basedPackage() {
		return (Component_basedPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Component_basedPackage getPackage() {
		return Component_basedPackage.eINSTANCE;
	}

} //Component_basedFactoryImpl
