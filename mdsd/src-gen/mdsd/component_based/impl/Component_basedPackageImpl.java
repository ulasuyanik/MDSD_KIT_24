/**
 */
package mdsd.component_based.impl;

import mdsd.component_based.Component_basedFactory;
import mdsd.component_based.Component_basedPackage;
import mdsd.component_based.EAllocationContext;
import mdsd.component_based.EAllocationViewType;
import mdsd.component_based.EAssemblyConnector;
import mdsd.component_based.EAssemblyContext;
import mdsd.component_based.EAssemblyViewPoint;
import mdsd.component_based.EAssemblyViewType;
import mdsd.component_based.EBehaviourDescription;
import mdsd.component_based.EBranch;
import mdsd.component_based.EComponent;
import mdsd.component_based.ECompositeComponent;
import mdsd.component_based.EContainer;
import mdsd.component_based.EDelegationConnector;
import mdsd.component_based.EDeploymentViewPoint;
import mdsd.component_based.EEnvironmentViewType;
import mdsd.component_based.EExternalCall;
import mdsd.component_based.EInterface;
import mdsd.component_based.EInternalAction;
import mdsd.component_based.ELink;
import mdsd.component_based.ELoop;
import mdsd.component_based.EParameter;
import mdsd.component_based.EProvidedDelegationConnector;
import mdsd.component_based.EProvidedRole;
import mdsd.component_based.ERepository;
import mdsd.component_based.ERepositoryViewType;
import mdsd.component_based.ERequiredDelegationConnector;
import mdsd.component_based.ERequiredRole;
import mdsd.component_based.ERole;
import mdsd.component_based.EService;
import mdsd.component_based.ESignature;
import mdsd.component_based.ESystem;
import mdsd.component_based.ESystemIndependentViewPoint;
import mdsd.component_based.EViewPoint;
import mdsd.component_based.PossibleParameterTypes;
import mdsd.component_based.PossibleReturnTypes;

import mdsd.component_based.util.Component_basedValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Component_basedPackageImpl extends EPackageImpl implements Component_basedPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eAssemblyContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eCompositeComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eAssemblyConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eAllocationContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eRequiredDelegationConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eProvidedDelegationConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eDelegationConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eRequiredRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eProvidedRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eEnvironmentViewTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eAllocationViewTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eAssemblyViewTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eRepositoryViewTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eViewPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eSystemIndependentViewPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eAssemblyViewPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eDeploymentViewPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eBehaviourDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eInternalActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eExternalCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eBranchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eLoopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum possibleReturnTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum possibleParameterTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eVoidEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see mdsd.component_based.Component_basedPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Component_basedPackageImpl() {
		super(eNS_URI, Component_basedFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Component_basedPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Component_basedPackage init() {
		if (isInited)
			return (Component_basedPackage) EPackage.Registry.INSTANCE.getEPackage(Component_basedPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredComponent_basedPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Component_basedPackageImpl theComponent_basedPackage = registeredComponent_basedPackage instanceof Component_basedPackageImpl
				? (Component_basedPackageImpl) registeredComponent_basedPackage
				: new Component_basedPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theComponent_basedPackage.createPackageContents();

		// Initialize created meta-data
		theComponent_basedPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theComponent_basedPackage, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
				return Component_basedValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theComponent_basedPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Component_basedPackage.eNS_URI, theComponent_basedPackage);
		return theComponent_basedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getERepository() {
		return eRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getERepository_Component() {
		return (EReference) eRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getERepository_Interface() {
		return (EReference) eRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getESignature() {
		return eSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getESignature_Name() {
		return (EAttribute) eSignatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getESignature_ReturnType() {
		return (EAttribute) eSignatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getESignature_Parameter() {
		return (EReference) eSignatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getESignature_CorrespondsTo() {
		return (EReference) eSignatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEComponent() {
		return eComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEComponent_Name() {
		return (EAttribute) eComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEComponent_ProvidesInterfaceTo() {
		return (EReference) eComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEComponent_BehaviourDescription() {
		return (EReference) eComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEComponent_UsesInterfaceFrom() {
		return (EReference) eComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEComponent_ProvidesDirectly() {
		return (EReference) eComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEComponent_Provides() {
		return (EReference) eComponentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEComponent_Requires() {
		return (EReference) eComponentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEComponent__ProvidesConstraint__DiagnosticChain_Map() {
		return eComponentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEInterface() {
		return eInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEInterface_Name() {
		return (EAttribute) eInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEInterface_Signature() {
		return (EReference) eInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEInterface_ResultsIn() {
		return (EReference) eInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEInterface_ProvidedByComponent() {
		return (EReference) eInterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEInterface_ProvidedBySystem() {
		return (EReference) eInterfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEInterface_RequiredByComponent() {
		return (EReference) eInterfaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEInterface_RequiredBySystem() {
		return (EReference) eInterfaceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEInterface__InterfaceRequiredByConstraint__DiagnosticChain_Map() {
		return eInterfaceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEInterface__InterfaceProvidedByConstraint__DiagnosticChain_Map() {
		return eInterfaceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEParameter() {
		return eParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEParameter_Name() {
		return (EAttribute) eParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEParameter_Type() {
		return (EAttribute) eParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEService() {
		return eServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEAssemblyContext() {
		return eAssemblyContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEAssemblyContext_Name() {
		return (EAttribute) eAssemblyContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEAssemblyContext_Roles() {
		return (EReference) eAssemblyContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEAssemblyContext_Allocated() {
		return (EReference) eAssemblyContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEAssemblyContext_EncapsulatedByComponent() {
		return (EReference) eAssemblyContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEAssemblyContext_EncapsulatedBySystem() {
		return (EReference) eAssemblyContextEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEAssemblyContext_Instantiates() {
		return (EReference) eAssemblyContextEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEAssemblyContext__EncapsulationConstraint__DiagnosticChain_Map() {
		return eAssemblyContextEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEAssemblyContext__ConnectorConstraint__DiagnosticChain_Map() {
		return eAssemblyContextEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEAssemblyContext__ProvidesRole__DiagnosticChain_Map() {
		return eAssemblyContextEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEAssemblyContext__RequiresRole__DiagnosticChain_Map() {
		return eAssemblyContextEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getECompositeComponent() {
		return eCompositeComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getECompositeComponent_Encapsulates() {
		return (EReference) eCompositeComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getESystem() {
		return eSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getESystem_Provides() {
		return (EReference) eSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getESystem_Requires() {
		return (EReference) eSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getESystem_Encapsulates() {
		return (EReference) eSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEAssemblyConnector() {
		return eAssemblyConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEAssemblyConnector_LinkFrom() {
		return (EReference) eAssemblyConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEAssemblyConnector_LinkTo() {
		return (EReference) eAssemblyConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEContainer() {
		return eContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEContainer_Name() {
		return (EAttribute) eContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEContainer_ConnectedTo() {
		return (EReference) eContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getELink() {
		return eLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getELink_Name() {
		return (EAttribute) eLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getELink_Connects() {
		return (EReference) eLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEAllocationContext() {
		return eAllocationContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEAllocationContext_Controls() {
		return (EReference) eAllocationContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEAllocationContext_SpecifiesFor() {
		return (EReference) eAllocationContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEAllocationContext_Specifies() {
		return (EReference) eAllocationContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getERequiredDelegationConnector() {
		return eRequiredDelegationConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getERequiredDelegationConnector_LinkFrom() {
		return (EReference) eRequiredDelegationConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getERequiredDelegationConnector_LinkTo() {
		return (EReference) eRequiredDelegationConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getERequiredDelegationConnector__RequiredConstraint__DiagnosticChain_Map() {
		return eRequiredDelegationConnectorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEProvidedDelegationConnector() {
		return eProvidedDelegationConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEProvidedDelegationConnector_LinkFrom() {
		return (EReference) eProvidedDelegationConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEProvidedDelegationConnector_LinkTo() {
		return (EReference) eProvidedDelegationConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEProvidedDelegationConnector__ProvidedConstraint__DiagnosticChain_Map() {
		return eProvidedDelegationConnectorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEDelegationConnector() {
		return eDelegationConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getERole() {
		return eRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getERole_RoleOf() {
		return (EReference) eRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getERequiredRole() {
		return eRequiredRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getERequiredRole_LinkedTo() {
		return (EReference) eRequiredRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEProvidedRole() {
		return eProvidedRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEProvidedRole_LinkedFrom() {
		return (EReference) eProvidedRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEEnvironmentViewType() {
		return eEnvironmentViewTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEnvironmentViewType_ShowsContainers() {
		return (EReference) eEnvironmentViewTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEEnvironmentViewType_ShowsLinks() {
		return (EReference) eEnvironmentViewTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEAllocationViewType() {
		return eAllocationViewTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEAllocationViewType_Includes() {
		return (EReference) eAllocationViewTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEAllocationViewType__ShowComponentAllocations() {
		return eAllocationViewTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEAssemblyViewType() {
		return eAssemblyViewTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEAssemblyViewType_MainArtifacts() {
		return (EReference) eAssemblyViewTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEAssemblyViewType_ShowsComponents() {
		return (EReference) eAssemblyViewTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEAssemblyViewType__ShowComponentConnections() {
		return eAssemblyViewTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getERepositoryViewType() {
		return eRepositoryViewTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getERepositoryViewType_ShowsComponents() {
		return (EReference) eRepositoryViewTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getERepositoryViewType_ShowsInterfaces() {
		return (EReference) eRepositoryViewTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEViewPoint() {
		return eViewPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getESystemIndependentViewPoint() {
		return eSystemIndependentViewPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getESystemIndependentViewPoint_Repositoryviewtype() {
		return (EReference) eSystemIndependentViewPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEAssemblyViewPoint() {
		return eAssemblyViewPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEAssemblyViewPoint_Assemblyviewtype() {
		return (EReference) eAssemblyViewPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEDeploymentViewPoint() {
		return eDeploymentViewPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEDeploymentViewPoint_Environmentviewtype() {
		return (EReference) eDeploymentViewPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEDeploymentViewPoint_Allocationviewtype() {
		return (EReference) eDeploymentViewPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEBehaviourDescription() {
		return eBehaviourDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEBehaviourDescription_InternalAction() {
		return (EReference) eBehaviourDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEBehaviourDescription_Loop() {
		return (EReference) eBehaviourDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEBehaviourDescription_Branch() {
		return (EReference) eBehaviourDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEBehaviourDescription_ExternalCall() {
		return (EReference) eBehaviourDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEInternalAction() {
		return eInternalActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEExternalCall() {
		return eExternalCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEExternalCall_To() {
		return (EReference) eExternalCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEBranch() {
		return eBranchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getELoop() {
		return eLoopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPossibleReturnTypes() {
		return possibleReturnTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPossibleParameterTypes() {
		return possibleParameterTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEVoid() {
		return eVoidEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component_basedFactory getComponent_basedFactory() {
		return (Component_basedFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		eRepositoryEClass = createEClass(EREPOSITORY);
		createEReference(eRepositoryEClass, EREPOSITORY__COMPONENT);
		createEReference(eRepositoryEClass, EREPOSITORY__INTERFACE);

		eSignatureEClass = createEClass(ESIGNATURE);
		createEAttribute(eSignatureEClass, ESIGNATURE__NAME);
		createEAttribute(eSignatureEClass, ESIGNATURE__RETURN_TYPE);
		createEReference(eSignatureEClass, ESIGNATURE__PARAMETER);
		createEReference(eSignatureEClass, ESIGNATURE__CORRESPONDS_TO);

		eComponentEClass = createEClass(ECOMPONENT);
		createEAttribute(eComponentEClass, ECOMPONENT__NAME);
		createEReference(eComponentEClass, ECOMPONENT__PROVIDES_INTERFACE_TO);
		createEReference(eComponentEClass, ECOMPONENT__BEHAVIOUR_DESCRIPTION);
		createEReference(eComponentEClass, ECOMPONENT__USES_INTERFACE_FROM);
		createEReference(eComponentEClass, ECOMPONENT__PROVIDES_DIRECTLY);
		createEReference(eComponentEClass, ECOMPONENT__PROVIDES);
		createEReference(eComponentEClass, ECOMPONENT__REQUIRES);
		createEOperation(eComponentEClass, ECOMPONENT___PROVIDES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		eInterfaceEClass = createEClass(EINTERFACE);
		createEAttribute(eInterfaceEClass, EINTERFACE__NAME);
		createEReference(eInterfaceEClass, EINTERFACE__SIGNATURE);
		createEReference(eInterfaceEClass, EINTERFACE__RESULTS_IN);
		createEReference(eInterfaceEClass, EINTERFACE__PROVIDED_BY_COMPONENT);
		createEReference(eInterfaceEClass, EINTERFACE__PROVIDED_BY_SYSTEM);
		createEReference(eInterfaceEClass, EINTERFACE__REQUIRED_BY_COMPONENT);
		createEReference(eInterfaceEClass, EINTERFACE__REQUIRED_BY_SYSTEM);
		createEOperation(eInterfaceEClass, EINTERFACE___INTERFACE_REQUIRED_BY_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
		createEOperation(eInterfaceEClass, EINTERFACE___INTERFACE_PROVIDED_BY_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		eParameterEClass = createEClass(EPARAMETER);
		createEAttribute(eParameterEClass, EPARAMETER__NAME);
		createEAttribute(eParameterEClass, EPARAMETER__TYPE);

		eServiceEClass = createEClass(ESERVICE);

		eAssemblyContextEClass = createEClass(EASSEMBLY_CONTEXT);
		createEAttribute(eAssemblyContextEClass, EASSEMBLY_CONTEXT__NAME);
		createEReference(eAssemblyContextEClass, EASSEMBLY_CONTEXT__ROLES);
		createEReference(eAssemblyContextEClass, EASSEMBLY_CONTEXT__ALLOCATED);
		createEReference(eAssemblyContextEClass, EASSEMBLY_CONTEXT__ENCAPSULATED_BY_COMPONENT);
		createEReference(eAssemblyContextEClass, EASSEMBLY_CONTEXT__ENCAPSULATED_BY_SYSTEM);
		createEReference(eAssemblyContextEClass, EASSEMBLY_CONTEXT__INSTANTIATES);
		createEOperation(eAssemblyContextEClass, EASSEMBLY_CONTEXT___ENCAPSULATION_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
		createEOperation(eAssemblyContextEClass, EASSEMBLY_CONTEXT___CONNECTOR_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
		createEOperation(eAssemblyContextEClass, EASSEMBLY_CONTEXT___PROVIDES_ROLE__DIAGNOSTICCHAIN_MAP);
		createEOperation(eAssemblyContextEClass, EASSEMBLY_CONTEXT___REQUIRES_ROLE__DIAGNOSTICCHAIN_MAP);

		eCompositeComponentEClass = createEClass(ECOMPOSITE_COMPONENT);
		createEReference(eCompositeComponentEClass, ECOMPOSITE_COMPONENT__ENCAPSULATES);

		eSystemEClass = createEClass(ESYSTEM);
		createEReference(eSystemEClass, ESYSTEM__PROVIDES);
		createEReference(eSystemEClass, ESYSTEM__REQUIRES);
		createEReference(eSystemEClass, ESYSTEM__ENCAPSULATES);

		eAssemblyConnectorEClass = createEClass(EASSEMBLY_CONNECTOR);
		createEReference(eAssemblyConnectorEClass, EASSEMBLY_CONNECTOR__LINK_TO);
		createEReference(eAssemblyConnectorEClass, EASSEMBLY_CONNECTOR__LINK_FROM);

		eContainerEClass = createEClass(ECONTAINER);
		createEAttribute(eContainerEClass, ECONTAINER__NAME);
		createEReference(eContainerEClass, ECONTAINER__CONNECTED_TO);

		eLinkEClass = createEClass(ELINK);
		createEAttribute(eLinkEClass, ELINK__NAME);
		createEReference(eLinkEClass, ELINK__CONNECTS);

		eAllocationContextEClass = createEClass(EALLOCATION_CONTEXT);
		createEReference(eAllocationContextEClass, EALLOCATION_CONTEXT__CONTROLS);
		createEReference(eAllocationContextEClass, EALLOCATION_CONTEXT__SPECIFIES_FOR);
		createEReference(eAllocationContextEClass, EALLOCATION_CONTEXT__SPECIFIES);

		eRequiredDelegationConnectorEClass = createEClass(EREQUIRED_DELEGATION_CONNECTOR);
		createEReference(eRequiredDelegationConnectorEClass, EREQUIRED_DELEGATION_CONNECTOR__LINK_FROM);
		createEReference(eRequiredDelegationConnectorEClass, EREQUIRED_DELEGATION_CONNECTOR__LINK_TO);
		createEOperation(eRequiredDelegationConnectorEClass,
				EREQUIRED_DELEGATION_CONNECTOR___REQUIRED_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		eProvidedDelegationConnectorEClass = createEClass(EPROVIDED_DELEGATION_CONNECTOR);
		createEReference(eProvidedDelegationConnectorEClass, EPROVIDED_DELEGATION_CONNECTOR__LINK_FROM);
		createEReference(eProvidedDelegationConnectorEClass, EPROVIDED_DELEGATION_CONNECTOR__LINK_TO);
		createEOperation(eProvidedDelegationConnectorEClass,
				EPROVIDED_DELEGATION_CONNECTOR___PROVIDED_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		eDelegationConnectorEClass = createEClass(EDELEGATION_CONNECTOR);

		eRoleEClass = createEClass(EROLE);
		createEReference(eRoleEClass, EROLE__ROLE_OF);

		eRequiredRoleEClass = createEClass(EREQUIRED_ROLE);
		createEReference(eRequiredRoleEClass, EREQUIRED_ROLE__LINKED_TO);

		eProvidedRoleEClass = createEClass(EPROVIDED_ROLE);
		createEReference(eProvidedRoleEClass, EPROVIDED_ROLE__LINKED_FROM);

		eEnvironmentViewTypeEClass = createEClass(EENVIRONMENT_VIEW_TYPE);
		createEReference(eEnvironmentViewTypeEClass, EENVIRONMENT_VIEW_TYPE__SHOWS_CONTAINERS);
		createEReference(eEnvironmentViewTypeEClass, EENVIRONMENT_VIEW_TYPE__SHOWS_LINKS);

		eAllocationViewTypeEClass = createEClass(EALLOCATION_VIEW_TYPE);
		createEReference(eAllocationViewTypeEClass, EALLOCATION_VIEW_TYPE__INCLUDES);
		createEOperation(eAllocationViewTypeEClass, EALLOCATION_VIEW_TYPE___SHOW_COMPONENT_ALLOCATIONS);

		eAssemblyViewTypeEClass = createEClass(EASSEMBLY_VIEW_TYPE);
		createEReference(eAssemblyViewTypeEClass, EASSEMBLY_VIEW_TYPE__MAIN_ARTIFACTS);
		createEReference(eAssemblyViewTypeEClass, EASSEMBLY_VIEW_TYPE__SHOWS_COMPONENTS);
		createEOperation(eAssemblyViewTypeEClass, EASSEMBLY_VIEW_TYPE___SHOW_COMPONENT_CONNECTIONS);

		eRepositoryViewTypeEClass = createEClass(EREPOSITORY_VIEW_TYPE);
		createEReference(eRepositoryViewTypeEClass, EREPOSITORY_VIEW_TYPE__SHOWS_COMPONENTS);
		createEReference(eRepositoryViewTypeEClass, EREPOSITORY_VIEW_TYPE__SHOWS_INTERFACES);

		eViewPointEClass = createEClass(EVIEW_POINT);

		eSystemIndependentViewPointEClass = createEClass(ESYSTEM_INDEPENDENT_VIEW_POINT);
		createEReference(eSystemIndependentViewPointEClass, ESYSTEM_INDEPENDENT_VIEW_POINT__REPOSITORYVIEWTYPE);

		eAssemblyViewPointEClass = createEClass(EASSEMBLY_VIEW_POINT);
		createEReference(eAssemblyViewPointEClass, EASSEMBLY_VIEW_POINT__ASSEMBLYVIEWTYPE);

		eDeploymentViewPointEClass = createEClass(EDEPLOYMENT_VIEW_POINT);
		createEReference(eDeploymentViewPointEClass, EDEPLOYMENT_VIEW_POINT__ENVIRONMENTVIEWTYPE);
		createEReference(eDeploymentViewPointEClass, EDEPLOYMENT_VIEW_POINT__ALLOCATIONVIEWTYPE);

		eBehaviourDescriptionEClass = createEClass(EBEHAVIOUR_DESCRIPTION);
		createEReference(eBehaviourDescriptionEClass, EBEHAVIOUR_DESCRIPTION__INTERNAL_ACTION);
		createEReference(eBehaviourDescriptionEClass, EBEHAVIOUR_DESCRIPTION__LOOP);
		createEReference(eBehaviourDescriptionEClass, EBEHAVIOUR_DESCRIPTION__BRANCH);
		createEReference(eBehaviourDescriptionEClass, EBEHAVIOUR_DESCRIPTION__EXTERNAL_CALL);

		eInternalActionEClass = createEClass(EINTERNAL_ACTION);

		eExternalCallEClass = createEClass(EEXTERNAL_CALL);
		createEReference(eExternalCallEClass, EEXTERNAL_CALL__TO);

		eBranchEClass = createEClass(EBRANCH);

		eLoopEClass = createEClass(ELOOP);

		// Create enums
		possibleReturnTypesEEnum = createEEnum(POSSIBLE_RETURN_TYPES);
		possibleParameterTypesEEnum = createEEnum(POSSIBLE_PARAMETER_TYPES);

		// Create data types
		eVoidEDataType = createEDataType(EVOID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eCompositeComponentEClass.getESuperTypes().add(this.getEComponent());
		eRequiredDelegationConnectorEClass.getESuperTypes().add(this.getEDelegationConnector());
		eProvidedDelegationConnectorEClass.getESuperTypes().add(this.getEDelegationConnector());
		eRequiredRoleEClass.getESuperTypes().add(this.getERole());
		eProvidedRoleEClass.getESuperTypes().add(this.getERole());
		eSystemIndependentViewPointEClass.getESuperTypes().add(this.getEViewPoint());
		eAssemblyViewPointEClass.getESuperTypes().add(this.getEViewPoint());
		eDeploymentViewPointEClass.getESuperTypes().add(this.getEViewPoint());

		// Initialize classes, features, and operations; add parameters
		initEClass(eRepositoryEClass, ERepository.class, "ERepository", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getERepository_Component(), this.getEComponent(), null, "component", null, 0, -1,
				ERepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERepository_Interface(), this.getEInterface(), null, "interface", null, 0, -1,
				ERepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eSignatureEClass, ESignature.class, "ESignature", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getESignature_Name(), ecorePackage.getEString(), "name", null, 1, 1, ESignature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESignature_ReturnType(), this.getPossibleReturnTypes(), "returnType", "Void", 1, 1,
				ESignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getESignature_Parameter(), this.getEParameter(), null, "parameter", null, 0, -1,
				ESignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESignature_CorrespondsTo(), this.getEService(), null, "correspondsTo", null, 0, -1,
				ESignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eComponentEClass, EComponent.class, "EComponent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEComponent_Name(), ecorePackage.getEString(), "name", null, 1, 1, EComponent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEComponent_ProvidesInterfaceTo(), this.getEComponent(),
				this.getEComponent_UsesInterfaceFrom(), "providesInterfaceTo", null, 0, -1, EComponent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEComponent_BehaviourDescription(), this.getEBehaviourDescription(), null,
				"behaviourDescription", null, 0, 1, EComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEComponent_UsesInterfaceFrom(), this.getEComponent(),
				this.getEComponent_ProvidesInterfaceTo(), "usesInterfaceFrom", null, 0, -1, EComponent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEComponent_ProvidesDirectly(), this.getEService(), null, "providesDirectly", null, 0, -1,
				EComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEComponent_Provides(), this.getEInterface(), this.getEInterface_ProvidedByComponent(),
				"provides", null, 0, -1, EComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEComponent_Requires(), this.getEInterface(), this.getEInterface_RequiredByComponent(),
				"requires", null, 0, -1, EComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getEComponent__ProvidesConstraint__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "providesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eInterfaceEClass, EInterface.class, "EInterface", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEInterface_Name(), ecorePackage.getEString(), "name", null, 1, 1, EInterface.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEInterface_Signature(), this.getESignature(), null, "signature", null, 0, -1,
				EInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEInterface_ResultsIn(), this.getERole(), null, "resultsIn", null, 0, -1, EInterface.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEInterface_ProvidedByComponent(), this.getEComponent(), this.getEComponent_Provides(),
				"providedByComponent", null, 0, -1, EInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEInterface_ProvidedBySystem(), this.getESystem(), this.getESystem_Provides(),
				"providedBySystem", null, 0, -1, EInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEInterface_RequiredByComponent(), this.getEComponent(), this.getEComponent_Requires(),
				"requiredByComponent", null, 0, -1, EInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEInterface_RequiredBySystem(), this.getESystem(), this.getESystem_Requires(),
				"requiredBySystem", null, 0, -1, EInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getEInterface__InterfaceRequiredByConstraint__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "interfaceRequiredByConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEInterface__InterfaceProvidedByConstraint__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "interfaceProvidedByConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eParameterEClass, EParameter.class, "EParameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEParameter_Name(), ecorePackage.getEString(), "name", null, 1, 1, EParameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEParameter_Type(), this.getPossibleParameterTypes(), "type", "Boolean", 1, 1,
				EParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(eServiceEClass, EService.class, "EService", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eAssemblyContextEClass, EAssemblyContext.class, "EAssemblyContext", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEAssemblyContext_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				EAssemblyContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getEAssemblyContext_Roles(), this.getERole(), null, "roles", null, 0, -1, EAssemblyContext.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAssemblyContext_Allocated(), this.getEContainer(), null, "allocated", null, 0, 1,
				EAssemblyContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAssemblyContext_EncapsulatedByComponent(), this.getECompositeComponent(),
				this.getECompositeComponent_Encapsulates(), "encapsulatedByComponent", null, 0, -1,
				EAssemblyContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAssemblyContext_EncapsulatedBySystem(), this.getESystem(), this.getESystem_Encapsulates(),
				"encapsulatedBySystem", null, 0, -1, EAssemblyContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAssemblyContext_Instantiates(), this.getEComponent(), null, "instantiates", null, 0, -1,
				EAssemblyContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getEAssemblyContext__EncapsulationConstraint__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "encapsulationConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEAssemblyContext__ConnectorConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"connectorConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEAssemblyContext__ProvidesRole__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"providesRole", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEAssemblyContext__RequiresRole__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"requiresRole", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eCompositeComponentEClass, ECompositeComponent.class, "ECompositeComponent", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getECompositeComponent_Encapsulates(), this.getEAssemblyContext(),
				this.getEAssemblyContext_EncapsulatedByComponent(), "encapsulates", null, 0, -1,
				ECompositeComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eSystemEClass, ESystem.class, "ESystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESystem_Provides(), this.getEInterface(), this.getEInterface_ProvidedBySystem(), "provides",
				null, 1, -1, ESystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESystem_Requires(), this.getEInterface(), this.getEInterface_RequiredBySystem(), "requires",
				null, 0, -1, ESystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESystem_Encapsulates(), this.getEAssemblyContext(),
				this.getEAssemblyContext_EncapsulatedBySystem(), "encapsulates", null, 0, -1, ESystem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eAssemblyConnectorEClass, EAssemblyConnector.class, "EAssemblyConnector", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEAssemblyConnector_LinkTo(), this.getERequiredRole(), this.getERequiredRole_LinkedTo(),
				"linkTo", null, 1, 1, EAssemblyConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAssemblyConnector_LinkFrom(), this.getEProvidedRole(), this.getEProvidedRole_LinkedFrom(),
				"linkFrom", null, 1, 1, EAssemblyConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eContainerEClass, EContainer.class, "EContainer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEContainer_Name(), ecorePackage.getEString(), "name", null, 1, 1, EContainer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEContainer_ConnectedTo(), this.getELink(), this.getELink_Connects(), "connectedTo", null, 0,
				-1, EContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eLinkEClass, ELink.class, "ELink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getELink_Name(), ecorePackage.getEString(), "name", null, 1, 1, ELink.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getELink_Connects(), this.getEContainer(), this.getEContainer_ConnectedTo(), "connects", null, 2,
				-1, ELink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eAllocationContextEClass, EAllocationContext.class, "EAllocationContext", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEAllocationContext_Controls(), this.getEContainer(), null, "controls", null, 0, -1,
				EAllocationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAllocationContext_SpecifiesFor(), this.getESystem(), null, "specifiesFor", null, 1, -1,
				EAllocationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAllocationContext_Specifies(), this.getEAssemblyContext(), null, "specifies", null, 1, 1,
				EAllocationContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eRequiredDelegationConnectorEClass, ERequiredDelegationConnector.class,
				"ERequiredDelegationConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getERequiredDelegationConnector_LinkFrom(), this.getERequiredRole(), null, "linkFrom", null, 1,
				1, ERequiredDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERequiredDelegationConnector_LinkTo(), this.getEInterface(), null, "linkTo", null, 1, 1,
				ERequiredDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getERequiredDelegationConnector__RequiredConstraint__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "requiredConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eProvidedDelegationConnectorEClass, EProvidedDelegationConnector.class,
				"EProvidedDelegationConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEProvidedDelegationConnector_LinkFrom(), this.getEInterface(), null, "linkFrom", null, 1, 1,
				EProvidedDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEProvidedDelegationConnector_LinkTo(), this.getEProvidedRole(), null, "linkTo", null, 1, 1,
				EProvidedDelegationConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getEProvidedDelegationConnector__ProvidedConstraint__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "providedConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eDelegationConnectorEClass, EDelegationConnector.class, "EDelegationConnector", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eRoleEClass, ERole.class, "ERole", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getERole_RoleOf(), this.getEAssemblyContext(), null, "roleOf", null, 0, 1, ERole.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eRequiredRoleEClass, ERequiredRole.class, "ERequiredRole", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getERequiredRole_LinkedTo(), this.getEAssemblyConnector(), this.getEAssemblyConnector_LinkTo(),
				"linkedTo", null, 0, 1, ERequiredRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eProvidedRoleEClass, EProvidedRole.class, "EProvidedRole", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEProvidedRole_LinkedFrom(), this.getEAssemblyConnector(),
				this.getEAssemblyConnector_LinkFrom(), "linkedFrom", null, 0, 1, EProvidedRole.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(eEnvironmentViewTypeEClass, EEnvironmentViewType.class, "EEnvironmentViewType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEnvironmentViewType_ShowsContainers(), this.getEContainer(), null, "showsContainers", null,
				0, -1, EEnvironmentViewType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEEnvironmentViewType_ShowsLinks(), this.getELink(), null, "showsLinks", null, 0, -1,
				EEnvironmentViewType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eAllocationViewTypeEClass, EAllocationViewType.class, "EAllocationViewType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEAllocationViewType_Includes(), this.getEAllocationContext(), null, "includes", null, 0, -1,
				EAllocationViewType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getEAllocationViewType__ShowComponentAllocations(), null, "showComponentAllocations", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(eAssemblyViewTypeEClass, EAssemblyViewType.class, "EAssemblyViewType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEAssemblyViewType_MainArtifacts(), this.getEAssemblyContext(), null, "mainArtifacts", null, 0,
				-1, EAssemblyViewType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAssemblyViewType_ShowsComponents(), this.getEComponent(), null, "showsComponents", null, 0,
				-1, EAssemblyViewType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getEAssemblyViewType__ShowComponentConnections(), null, "showComponentConnections", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(eRepositoryViewTypeEClass, ERepositoryViewType.class, "ERepositoryViewType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getERepositoryViewType_ShowsComponents(), this.getEComponent(), null, "showsComponents", null, 0,
				-1, ERepositoryViewType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getERepositoryViewType_ShowsInterfaces(), this.getEInterface(), null, "showsInterfaces", null, 0,
				-1, ERepositoryViewType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eViewPointEClass, EViewPoint.class, "EViewPoint", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eSystemIndependentViewPointEClass, ESystemIndependentViewPoint.class, "ESystemIndependentViewPoint",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESystemIndependentViewPoint_Repositoryviewtype(), this.getERepositoryViewType(), null,
				"repositoryviewtype", null, 1, 1, ESystemIndependentViewPoint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eAssemblyViewPointEClass, EAssemblyViewPoint.class, "EAssemblyViewPoint", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEAssemblyViewPoint_Assemblyviewtype(), this.getEAssemblyViewType(), null, "assemblyviewtype",
				null, 1, 1, EAssemblyViewPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eDeploymentViewPointEClass, EDeploymentViewPoint.class, "EDeploymentViewPoint", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEDeploymentViewPoint_Environmentviewtype(), this.getEEnvironmentViewType(), null,
				"environmentviewtype", null, 1, 1, EDeploymentViewPoint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEDeploymentViewPoint_Allocationviewtype(), this.getEAllocationViewType(), null,
				"allocationviewtype", null, 1, 1, EDeploymentViewPoint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eBehaviourDescriptionEClass, EBehaviourDescription.class, "EBehaviourDescription", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEBehaviourDescription_InternalAction(), this.getEInternalAction(), null, "internalAction",
				null, 0, -1, EBehaviourDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEBehaviourDescription_Loop(), this.getELoop(), null, "loop", null, 0, -1,
				EBehaviourDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEBehaviourDescription_Branch(), this.getEBranch(), null, "branch", null, 0, -1,
				EBehaviourDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEBehaviourDescription_ExternalCall(), this.getEExternalCall(), null, "externalCall", null, 0,
				-1, EBehaviourDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eInternalActionEClass, EInternalAction.class, "EInternalAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eExternalCallEClass, EExternalCall.class, "EExternalCall", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEExternalCall_To(), this.getEService(), null, "to", null, 1, 1, EExternalCall.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eBranchEClass, EBranch.class, "EBranch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eLoopEClass, ELoop.class, "ELoop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(possibleReturnTypesEEnum, PossibleReturnTypes.class, "PossibleReturnTypes");
		addEEnumLiteral(possibleReturnTypesEEnum, PossibleReturnTypes.BOOLEAN);
		addEEnumLiteral(possibleReturnTypesEEnum, PossibleReturnTypes.CHAR);
		addEEnumLiteral(possibleReturnTypesEEnum, PossibleReturnTypes.DATE);
		addEEnumLiteral(possibleReturnTypesEEnum, PossibleReturnTypes.DOUBLE);
		addEEnumLiteral(possibleReturnTypesEEnum, PossibleReturnTypes.FLOAT);
		addEEnumLiteral(possibleReturnTypesEEnum, PossibleReturnTypes.LIST);
		addEEnumLiteral(possibleReturnTypesEEnum, PossibleReturnTypes.INT);
		addEEnumLiteral(possibleReturnTypesEEnum, PossibleReturnTypes.LONG);
		addEEnumLiteral(possibleReturnTypesEEnum, PossibleReturnTypes.MAP);
		addEEnumLiteral(possibleReturnTypesEEnum, PossibleReturnTypes.STRING);
		addEEnumLiteral(possibleReturnTypesEEnum, PossibleReturnTypes.VOID);
		addEEnumLiteral(possibleReturnTypesEEnum, PossibleReturnTypes.EOBJECT);

		initEEnum(possibleParameterTypesEEnum, PossibleParameterTypes.class, "PossibleParameterTypes");
		addEEnumLiteral(possibleParameterTypesEEnum, PossibleParameterTypes.BOOLEAN);
		addEEnumLiteral(possibleParameterTypesEEnum, PossibleParameterTypes.CHAR);
		addEEnumLiteral(possibleParameterTypesEEnum, PossibleParameterTypes.DATE);
		addEEnumLiteral(possibleParameterTypesEEnum, PossibleParameterTypes.DOUBLE);
		addEEnumLiteral(possibleParameterTypesEEnum, PossibleParameterTypes.FLOAT);
		addEEnumLiteral(possibleParameterTypesEEnum, PossibleParameterTypes.LIST);
		addEEnumLiteral(possibleParameterTypesEEnum, PossibleParameterTypes.INT);
		addEEnumLiteral(possibleParameterTypesEEnum, PossibleParameterTypes.LONG);
		addEEnumLiteral(possibleParameterTypesEEnum, PossibleParameterTypes.MAP);
		addEEnumLiteral(possibleParameterTypesEEnum, PossibleParameterTypes.STRING);
		addEEnumLiteral(possibleParameterTypesEEnum, PossibleParameterTypes.EOBJECT);

		// Initialize data types
		initEDataType(eVoidEDataType, Void.class, "EVoid", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source, new String[] {});
		addAnnotation(eComponentEClass, source, new String[] { "constraints", "providesConstraint" });
		addAnnotation(eInterfaceEClass, source, new String[] { "constraints", "interfaceProvidedByConstraint" });
		addAnnotation(eAssemblyContextEClass, source, new String[] { "constraints", "requiresRole" });
		addAnnotation(eRequiredDelegationConnectorEClass, source, new String[] { "constraints", "requiredConstraint" });
		addAnnotation(eProvidedDelegationConnectorEClass, source, new String[] { "constraints", "providedConstraint" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(getEComponent__ProvidesConstraint__DiagnosticChain_Map(), source, new String[] { "body",
				" self.provides -> size() > 0 implies self.provides.signature.correspondsTo -> size() > 0" });
		addAnnotation(getEInterface__InterfaceRequiredByConstraint__DiagnosticChain_Map(), source, new String[] {
				"body",
				"self.requiredByComponent -> size() > 0 implies self.resultsIn -> exists(x|x.oclIsKindOf(ERequiredRole))" });
		addAnnotation(getEInterface__InterfaceProvidedByConstraint__DiagnosticChain_Map(), source, new String[] {
				"body",
				"self.providedByComponent -> size() > 0 implies self.resultsIn -> exists(x|x.oclIsKindOf(EProvidedRole))" });
		addAnnotation(getEAssemblyContext__EncapsulationConstraint__DiagnosticChain_Map(), source, new String[] {
				"body",
				"self -> select(x| self.encapsulatedBySystem -> size() = 0 and self.encapsulatedByComponent -> size() > 0).allocated -> size() = 0 = true" });
		addAnnotation(getEAssemblyContext__ConnectorConstraint__DiagnosticChain_Map(), source, new String[] { "body",
				"let x:EAssemblyContext = self , y: EAssemblyContext = self in y.roles->oclAsType(ERequiredRole)->select(element|x.roles->oclAsType(EProvidedRole).linkedFrom.linkTo) -> size() > 0 implies x.allocated = y.allocated or x.allocated -> select(element|y.allocated.connectedTo.connects) -> size() > 0" });
		addAnnotation(getEAssemblyContext__ProvidesRole__DiagnosticChain_Map(), source, new String[] { "body",
				"self.instantiates.provides->notEmpty() implies self.instantiates.provides.resultsIn->exists(x|x.oclIsKindOf(EProvidedRole)) = true" });
		addAnnotation(getEAssemblyContext__RequiresRole__DiagnosticChain_Map(), source, new String[] { "body",
				"self.instantiates.requires->notEmpty() implies self.instantiates.requires.resultsIn->exists(x|x.oclIsKindOf(ERequiredRole)) = true" });
		addAnnotation(getERequiredDelegationConnector__RequiredConstraint__DiagnosticChain_Map(), source, new String[] {
				"body",
				"self.linkTo.requiredBySystem -> size() > 0 or self.linkTo.requiredByComponent -> exists(x|x.oclIsKindOf(ECompositeComponent)) = true" });
		addAnnotation(getEProvidedDelegationConnector__ProvidedConstraint__DiagnosticChain_Map(), source, new String[] {
				"body",
				"self.linkFrom.providedBySystem -> size() > 0 or self.linkFrom.providedByComponent -> exists(x|x.oclIsKindOf(ECompositeComponent)) = true" });
	}

} //Component_basedPackageImpl
