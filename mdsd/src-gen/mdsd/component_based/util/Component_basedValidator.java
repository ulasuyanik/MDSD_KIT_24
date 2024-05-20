/**
 */
package mdsd.component_based.util;

import java.util.Map;

import mdsd.component_based.*;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see mdsd.component_based.Component_basedPackage
 * @generated
 */
public class Component_basedValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Component_basedValidator INSTANCE = new Component_basedValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "mdsd.component_based";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Provides Constraint' of 'EComponent'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ECOMPONENT__PROVIDES_CONSTRAINT = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Interface Required By Constraint' of 'EInterface'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EINTERFACE__INTERFACE_REQUIRED_BY_CONSTRAINT = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Interface Provided By Constraint' of 'EInterface'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EINTERFACE__INTERFACE_PROVIDED_BY_CONSTRAINT = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Encapsulation Constraint' of 'EAssembly Context'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EASSEMBLY_CONTEXT__ENCAPSULATION_CONSTRAINT = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Connector Constraint' of 'EAssembly Context'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EASSEMBLY_CONTEXT__CONNECTOR_CONSTRAINT = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Provides Role' of 'EAssembly Context'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EASSEMBLY_CONTEXT__PROVIDES_ROLE = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Requires Role' of 'EAssembly Context'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EASSEMBLY_CONTEXT__REQUIRES_ROLE = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Required Constraint' of 'ERequired Delegation Connector'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EREQUIRED_DELEGATION_CONNECTOR__REQUIRED_CONSTRAINT = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Provided Constraint' of 'EProvided Delegation Connector'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPROVIDED_DELEGATION_CONNECTOR__PROVIDED_CONSTRAINT = 9;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 9;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component_basedValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return Component_basedPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case Component_basedPackage.EREPOSITORY:
			return validateERepository((ERepository) value, diagnostics, context);
		case Component_basedPackage.ESIGNATURE:
			return validateESignature((ESignature) value, diagnostics, context);
		case Component_basedPackage.ECOMPONENT:
			return validateEComponent((EComponent) value, diagnostics, context);
		case Component_basedPackage.EINTERFACE:
			return validateEInterface((EInterface) value, diagnostics, context);
		case Component_basedPackage.EPARAMETER:
			return validateEParameter((EParameter) value, diagnostics, context);
		case Component_basedPackage.ESERVICE:
			return validateEService((EService) value, diagnostics, context);
		case Component_basedPackage.EASSEMBLY_CONTEXT:
			return validateEAssemblyContext((EAssemblyContext) value, diagnostics, context);
		case Component_basedPackage.ECOMPOSITE_COMPONENT:
			return validateECompositeComponent((ECompositeComponent) value, diagnostics, context);
		case Component_basedPackage.ESYSTEM:
			return validateESystem((ESystem) value, diagnostics, context);
		case Component_basedPackage.EASSEMBLY_CONNECTOR:
			return validateEAssemblyConnector((EAssemblyConnector) value, diagnostics, context);
		case Component_basedPackage.ECONTAINER:
			return validateEContainer((EContainer) value, diagnostics, context);
		case Component_basedPackage.ELINK:
			return validateELink((ELink) value, diagnostics, context);
		case Component_basedPackage.EALLOCATION_CONTEXT:
			return validateEAllocationContext((EAllocationContext) value, diagnostics, context);
		case Component_basedPackage.EREQUIRED_DELEGATION_CONNECTOR:
			return validateERequiredDelegationConnector((ERequiredDelegationConnector) value, diagnostics, context);
		case Component_basedPackage.EPROVIDED_DELEGATION_CONNECTOR:
			return validateEProvidedDelegationConnector((EProvidedDelegationConnector) value, diagnostics, context);
		case Component_basedPackage.EDELEGATION_CONNECTOR:
			return validateEDelegationConnector((EDelegationConnector) value, diagnostics, context);
		case Component_basedPackage.EROLE:
			return validateERole((ERole) value, diagnostics, context);
		case Component_basedPackage.EREQUIRED_ROLE:
			return validateERequiredRole((ERequiredRole) value, diagnostics, context);
		case Component_basedPackage.EPROVIDED_ROLE:
			return validateEProvidedRole((EProvidedRole) value, diagnostics, context);
		case Component_basedPackage.EENVIRONMENT_VIEW_TYPE:
			return validateEEnvironmentViewType((EEnvironmentViewType) value, diagnostics, context);
		case Component_basedPackage.EALLOCATION_VIEW_TYPE:
			return validateEAllocationViewType((EAllocationViewType) value, diagnostics, context);
		case Component_basedPackage.EASSEMBLY_VIEW_TYPE:
			return validateEAssemblyViewType((EAssemblyViewType) value, diagnostics, context);
		case Component_basedPackage.EREPOSITORY_VIEW_TYPE:
			return validateERepositoryViewType((ERepositoryViewType) value, diagnostics, context);
		case Component_basedPackage.EBEHAVIOUR_DESCRIPTION:
			return validateEBehaviourDescription((EBehaviourDescription) value, diagnostics, context);
		case Component_basedPackage.EINTERNAL_ACTION:
			return validateEInternalAction((EInternalAction) value, diagnostics, context);
		case Component_basedPackage.EASSEMBLY_VIEW_POINT:
			return validateEAssemblyViewPoint((EAssemblyViewPoint) value, diagnostics, context);
		case Component_basedPackage.EEXTERNAL_CALL:
			return validateEExternalCall((EExternalCall) value, diagnostics, context);
		case Component_basedPackage.EVIEW_POINT:
			return validateEViewPoint((EViewPoint) value, diagnostics, context);
		case Component_basedPackage.EDEPLOYMENT_VIEW_POINT:
			return validateEDeploymentViewPoint((EDeploymentViewPoint) value, diagnostics, context);
		case Component_basedPackage.ESYSTEM_INDEPENDENT_VIEW_POINT:
			return validateESystemIndependentViewPoint((ESystemIndependentViewPoint) value, diagnostics, context);
		case Component_basedPackage.EBRANCH:
			return validateEBranch((EBranch) value, diagnostics, context);
		case Component_basedPackage.ELOOP:
			return validateELoop((ELoop) value, diagnostics, context);
		case Component_basedPackage.POSSIBLE_RETURN_TYPES:
			return validatePossibleReturnTypes((PossibleReturnTypes) value, diagnostics, context);
		case Component_basedPackage.POSSIBLE_PARAMETER_TYPES:
			return validatePossibleParameterTypes((PossibleParameterTypes) value, diagnostics, context);
		case Component_basedPackage.EVOID:
			return validateEVoid((Void) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateERepository(ERepository eRepository, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eRepository, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESignature(ESignature eSignature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eSignature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEComponent(EComponent eComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eComponent, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(eComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(eComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(eComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(eComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(eComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(eComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(eComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(eComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEComponent_providesConstraint(eComponent, diagnostics, context);
		return result;
	}

	/**
	 * Validates the providesConstraint constraint of '<em>EComponent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEComponent_providesConstraint(EComponent eComponent, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return eComponent.providesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEInterface(EInterface eInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eInterface, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(eInterface, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(eInterface, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(eInterface, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(eInterface, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(eInterface, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(eInterface, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(eInterface, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(eInterface, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEInterface_interfaceProvidedByConstraint(eInterface, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEInterface_interfaceRequiredByConstraint(eInterface, diagnostics, context);
		return result;
	}

	/**
	 * Validates the interfaceProvidedByConstraint constraint of '<em>EInterface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEInterface_interfaceProvidedByConstraint(EInterface eInterface, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return eInterface.interfaceProvidedByConstraint(diagnostics, context);
	}

	/**
	 * Validates the interfaceRequiredByConstraint constraint of '<em>EInterface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEInterface_interfaceRequiredByConstraint(EInterface eInterface, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return eInterface.interfaceRequiredByConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEParameter(EParameter eParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEService(EService eService, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eService, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEAssemblyContext(EAssemblyContext eAssemblyContext, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eAssemblyContext, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(eAssemblyContext, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(eAssemblyContext, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(eAssemblyContext, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(eAssemblyContext, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(eAssemblyContext, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(eAssemblyContext, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(eAssemblyContext, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(eAssemblyContext, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEAssemblyContext_requiresRole(eAssemblyContext, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEAssemblyContext_encapsulationConstraint(eAssemblyContext, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEAssemblyContext_connectorConstraint(eAssemblyContext, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEAssemblyContext_providesRole(eAssemblyContext, diagnostics, context);
		return result;
	}

	/**
	 * Validates the requiresRole constraint of '<em>EAssembly Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEAssemblyContext_requiresRole(EAssemblyContext eAssemblyContext, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return eAssemblyContext.requiresRole(diagnostics, context);
	}

	/**
	 * Validates the encapsulationConstraint constraint of '<em>EAssembly Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEAssemblyContext_encapsulationConstraint(EAssemblyContext eAssemblyContext,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return eAssemblyContext.encapsulationConstraint(diagnostics, context);
	}

	/**
	 * Validates the connectorConstraint constraint of '<em>EAssembly Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEAssemblyContext_connectorConstraint(EAssemblyContext eAssemblyContext,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return eAssemblyContext.connectorConstraint(diagnostics, context);
	}

	/**
	 * Validates the providesRole constraint of '<em>EAssembly Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEAssemblyContext_providesRole(EAssemblyContext eAssemblyContext, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return eAssemblyContext.providesRole(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateECompositeComponent(ECompositeComponent eCompositeComponent, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eCompositeComponent, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(eCompositeComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(eCompositeComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(eCompositeComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(eCompositeComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(eCompositeComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(eCompositeComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(eCompositeComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(eCompositeComponent, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEComponent_providesConstraint(eCompositeComponent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESystem(ESystem eSystem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eSystem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEAssemblyConnector(EAssemblyConnector eAssemblyConnector, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eAssemblyConnector, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEContainer(EContainer eContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateELink(ELink eLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eLink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEAllocationContext(EAllocationContext eAllocationContext, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eAllocationContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateERequiredDelegationConnector(ERequiredDelegationConnector eRequiredDelegationConnector,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eRequiredDelegationConnector, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(eRequiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(eRequiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(eRequiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(eRequiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(eRequiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(eRequiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(eRequiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(eRequiredDelegationConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateERequiredDelegationConnector_requiredConstraint(eRequiredDelegationConnector, diagnostics,
					context);
		return result;
	}

	/**
	 * Validates the requiredConstraint constraint of '<em>ERequired Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateERequiredDelegationConnector_requiredConstraint(
			ERequiredDelegationConnector eRequiredDelegationConnector, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return eRequiredDelegationConnector.requiredConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEProvidedDelegationConnector(EProvidedDelegationConnector eProvidedDelegationConnector,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(eProvidedDelegationConnector, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(eProvidedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(eProvidedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(eProvidedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(eProvidedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(eProvidedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(eProvidedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(eProvidedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(eProvidedDelegationConnector, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEProvidedDelegationConnector_providedConstraint(eProvidedDelegationConnector, diagnostics,
					context);
		return result;
	}

	/**
	 * Validates the providedConstraint constraint of '<em>EProvided Delegation Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEProvidedDelegationConnector_providedConstraint(
			EProvidedDelegationConnector eProvidedDelegationConnector, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return eProvidedDelegationConnector.providedConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEDelegationConnector(EDelegationConnector eDelegationConnector, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eDelegationConnector, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateERole(ERole eRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eRole, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateERequiredRole(ERequiredRole eRequiredRole, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eRequiredRole, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEProvidedRole(EProvidedRole eProvidedRole, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eProvidedRole, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEEnvironmentViewType(EEnvironmentViewType eEnvironmentViewType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eEnvironmentViewType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEAllocationViewType(EAllocationViewType eAllocationViewType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eAllocationViewType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEAssemblyViewType(EAssemblyViewType eAssemblyViewType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eAssemblyViewType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateERepositoryViewType(ERepositoryViewType eRepositoryViewType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eRepositoryViewType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEBehaviourDescription(EBehaviourDescription eBehaviourDescription,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eBehaviourDescription, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEInternalAction(EInternalAction eInternalAction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eInternalAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEAssemblyViewPoint(EAssemblyViewPoint eAssemblyViewPoint, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eAssemblyViewPoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEExternalCall(EExternalCall eExternalCall, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eExternalCall, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEViewPoint(EViewPoint eViewPoint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eViewPoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEDeploymentViewPoint(EDeploymentViewPoint eDeploymentViewPoint, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eDeploymentViewPoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESystemIndependentViewPoint(ESystemIndependentViewPoint eSystemIndependentViewPoint,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eSystemIndependentViewPoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEBranch(EBranch eBranch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eBranch, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateELoop(ELoop eLoop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eLoop, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePossibleReturnTypes(PossibleReturnTypes possibleReturnTypes, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePossibleParameterTypes(PossibleParameterTypes possibleParameterTypes,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEVoid(Void eVoid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Component_basedValidator
