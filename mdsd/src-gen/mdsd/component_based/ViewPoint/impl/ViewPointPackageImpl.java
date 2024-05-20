/**
 */
package mdsd.component_based.ViewPoint.impl;

import mdsd.component_based.Component_basedPackage;

import mdsd.component_based.ViewPoint.EAssemblyViewPoint;
import mdsd.component_based.ViewPoint.EDeploymentViewPoint;
import mdsd.component_based.ViewPoint.ESystemIndependentViewPoint;
import mdsd.component_based.ViewPoint.EViewPoint;
import mdsd.component_based.ViewPoint.ViewPointFactory;
import mdsd.component_based.ViewPoint.ViewPointPackage;

import mdsd.component_based.impl.Component_basedPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewPointPackageImpl extends EPackageImpl implements ViewPointPackage {
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
	private EClass eSystemIndependentViewPointEClass = null;

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
	 * @see mdsd.component_based.ViewPoint.ViewPointPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ViewPointPackageImpl() {
		super(eNS_URI, ViewPointFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ViewPointPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ViewPointPackage init() {
		if (isInited)
			return (ViewPointPackage) EPackage.Registry.INSTANCE.getEPackage(ViewPointPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredViewPointPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ViewPointPackageImpl theViewPointPackage = registeredViewPointPackage instanceof ViewPointPackageImpl
				? (ViewPointPackageImpl) registeredViewPointPackage
				: new ViewPointPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Component_basedPackage.eNS_URI);
		Component_basedPackageImpl theComponent_basedPackage = (Component_basedPackageImpl) (registeredPackage instanceof Component_basedPackageImpl
				? registeredPackage
				: Component_basedPackage.eINSTANCE);

		// Create package meta-data objects
		theViewPointPackage.createPackageContents();
		theComponent_basedPackage.createPackageContents();

		// Initialize created meta-data
		theViewPointPackage.initializePackageContents();
		theComponent_basedPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theViewPointPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ViewPointPackage.eNS_URI, theViewPointPackage);
		return theViewPointPackage;
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
	public ViewPointFactory getViewPointFactory() {
		return (ViewPointFactory) getEFactoryInstance();
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
		eViewPointEClass = createEClass(EVIEW_POINT);

		eAssemblyViewPointEClass = createEClass(EASSEMBLY_VIEW_POINT);
		createEReference(eAssemblyViewPointEClass, EASSEMBLY_VIEW_POINT__ASSEMBLYVIEWTYPE);

		eDeploymentViewPointEClass = createEClass(EDEPLOYMENT_VIEW_POINT);
		createEReference(eDeploymentViewPointEClass, EDEPLOYMENT_VIEW_POINT__ENVIRONMENTVIEWTYPE);
		createEReference(eDeploymentViewPointEClass, EDEPLOYMENT_VIEW_POINT__ALLOCATIONVIEWTYPE);

		eSystemIndependentViewPointEClass = createEClass(ESYSTEM_INDEPENDENT_VIEW_POINT);
		createEReference(eSystemIndependentViewPointEClass, ESYSTEM_INDEPENDENT_VIEW_POINT__REPOSITORYVIEWTYPE);
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

		// Obtain other dependent packages
		Component_basedPackage theComponent_basedPackage = (Component_basedPackage) EPackage.Registry.INSTANCE
				.getEPackage(Component_basedPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eAssemblyViewPointEClass.getESuperTypes().add(this.getEViewPoint());
		eDeploymentViewPointEClass.getESuperTypes().add(this.getEViewPoint());
		eSystemIndependentViewPointEClass.getESuperTypes().add(this.getEViewPoint());

		// Initialize classes, features, and operations; add parameters
		initEClass(eViewPointEClass, EViewPoint.class, "EViewPoint", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(eAssemblyViewPointEClass, EAssemblyViewPoint.class, "EAssemblyViewPoint", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEAssemblyViewPoint_Assemblyviewtype(), theComponent_basedPackage.getEAssemblyViewType(), null,
				"assemblyviewtype", null, 1, 1, EAssemblyViewPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eDeploymentViewPointEClass, EDeploymentViewPoint.class, "EDeploymentViewPoint", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEDeploymentViewPoint_Environmentviewtype(),
				theComponent_basedPackage.getEEnvironmentViewType(), null, "environmentviewtype", null, 1, 1,
				EDeploymentViewPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEDeploymentViewPoint_Allocationviewtype(), theComponent_basedPackage.getEAllocationViewType(),
				null, "allocationviewtype", null, 1, 1, EDeploymentViewPoint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eSystemIndependentViewPointEClass, ESystemIndependentViewPoint.class, "ESystemIndependentViewPoint",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESystemIndependentViewPoint_Repositoryviewtype(),
				theComponent_basedPackage.getERepositoryViewType(), null, "repositoryviewtype", null, 1, 1,
				ESystemIndependentViewPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ViewPointPackageImpl
