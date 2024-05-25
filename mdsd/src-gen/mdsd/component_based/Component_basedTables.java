/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /mdsd/model/component_based.ecore
 * using:
 *   /mdsd/model/component_based.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package mdsd.component_based;

// import mdsd.component_based.Component_basedPackage;
// import mdsd.component_based.Component_basedTables;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * Component_basedTables provides the dispatch tables for the component_based for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class Component_basedTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(Component_basedPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_component_based = IdManager.getNsURIPackageId("http://www.example.org/component_based", null, Component_basedPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = Component_basedTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_EAllocationContext = Component_basedTables.PACKid_http_c_s_s_www_example_org_s_component_based.getClassId("EAllocationContext", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_EAllocationViewType = Component_basedTables.PACKid_http_c_s_s_www_example_org_s_component_based.getClassId("EAllocationViewType", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_EAssemblyConnector = Component_basedTables.PACKid_http_c_s_s_www_example_org_s_component_based.getClassId("EAssemblyConnector", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_EAssemblyContext = Component_basedTables.PACKid_http_c_s_s_www_example_org_s_component_based.getClassId("EAssemblyContext", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_EAssemblyViewPoint = Component_basedTables.PACKid_http_c_s_s_www_example_org_s_component_based.getClassId("EAssemblyViewPoint", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_EAssemblyViewType = Component_basedTables.PACKid_http_c_s_s_www_example_org_s_component_based.getClassId("EAssemblyViewType", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_EBehaviourDescription = Component_basedTables.PACKid_http_c_s_s_www_example_org_s_component_based.getClassId("EBehaviourDescription", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_EBranch = Component_basedTables.PACKid_http_c_s_s_www_example_org_s_component_based.getClassId("EBranch", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_EComponent = Component_basedTables.PACKid_http_c_s_s_www_example_org_s_component_based.getClassId("EComponent", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ECompositeComponent = Component_basedTables.PACKid_http_c_s_s_www_example_org_s_component_based.getClassId("ECompositeComponent", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_EContainer = Component_basedTables.PACKid_http_c_s_s_www_example_org_s_component_based.getClassId("EContainer", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_EDeploymentViewPoint = Component_basedTables.PACKid_http_c_s_s_www_example_org_s_component_based.getClassId("EDeploymentViewPoint", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_EEnvironmentViewType = Component_basedTables.PACKid_http_c_s_s_www_example_org_s_component_based.getClassId("EEnvironmentViewType", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_EExternalCall = Component_basedTables.PACKid_http_c_s_s_www_example_org_s_component_based.getClassId("EExternalCall", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_EInterface = Component_basedTables.PACKid_http_c_s_s_www_example_org_s_component_based.getClassId("EInterface", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_EInternalAction = Component_basedTables.PACKid_http_c_s_s_www_example_org_s_component_based.getClassId("EInternalAction", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ELink = Component_basedTables.PACKid_http_c_s_s_www_example_org_s_component_based.getClassId("ELink", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ELoop = Component_basedTables.PACKid_http_c_s_s_www_example_org_s_component_based.getClassId("ELoop", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_EParameter = Component_basedTables.PACKid_http_c_s_s_www_example_org_s_component_based.getClassId("EParameter", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_EProvidedDelegationConnector = Component_basedTables.PACKid_http_c_s_s_www_example_org_s_component_based.getClassId("EProvidedDelegationConnector", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_EProvidedRole = Component_basedTables.PACKid_http_c_s_s_www_example_org_s_component_based.getClassId("EProvidedRole", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ERepository = Component_basedTables.PACKid_http_c_s_s_www_example_org_s_component_based.getClassId("ERepository", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ERepositoryViewType = Component_basedTables.PACKid_http_c_s_s_www_example_org_s_component_based.getClassId("ERepositoryViewType", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ERequiredDelegationConnector = Component_basedTables.PACKid_http_c_s_s_www_example_org_s_component_based.getClassId("ERequiredDelegationConnector", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ERequiredRole = Component_basedTables.PACKid_http_c_s_s_www_example_org_s_component_based.getClassId("ERequiredRole", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ERole = Component_basedTables.PACKid_http_c_s_s_www_example_org_s_component_based.getClassId("ERole", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_EService = Component_basedTables.PACKid_http_c_s_s_www_example_org_s_component_based.getClassId("EService", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ESignature = Component_basedTables.PACKid_http_c_s_s_www_example_org_s_component_based.getClassId("ESignature", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ESystem = Component_basedTables.PACKid_http_c_s_s_www_example_org_s_component_based.getClassId("ESystem", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ESystemIndependentViewPoint = Component_basedTables.PACKid_http_c_s_s_www_example_org_s_component_based.getClassId("ESystemIndependentViewPoint", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_PossibleParameterTypes = Component_basedTables.PACKid_http_c_s_s_www_example_org_s_component_based.getEnumerationId("PossibleParameterTypes");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_PossibleReturnTypes = Component_basedTables.PACKid_http_c_s_s_www_example_org_s_component_based.getEnumerationId("PossibleReturnTypes");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_EAllocationContext = TypeId.BAG.getSpecializedId(Component_basedTables.CLSSid_EAllocationContext, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_EAssemblyContext = TypeId.BAG.getSpecializedId(Component_basedTables.CLSSid_EAssemblyContext, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_EAssemblyViewType = TypeId.BAG.getSpecializedId(Component_basedTables.CLSSid_EAssemblyViewType, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_EComponent = TypeId.BAG.getSpecializedId(Component_basedTables.CLSSid_EComponent, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_EContainer = TypeId.BAG.getSpecializedId(Component_basedTables.CLSSid_EContainer, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_EEnvironmentViewType = TypeId.BAG.getSpecializedId(Component_basedTables.CLSSid_EEnvironmentViewType, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_EExternalCall = TypeId.BAG.getSpecializedId(Component_basedTables.CLSSid_EExternalCall, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_EInterface = TypeId.BAG.getSpecializedId(Component_basedTables.CLSSid_EInterface, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_EProvidedDelegationConnector = TypeId.BAG.getSpecializedId(Component_basedTables.CLSSid_EProvidedDelegationConnector, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ERepositoryViewType = TypeId.BAG.getSpecializedId(Component_basedTables.CLSSid_ERepositoryViewType, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ERequiredDelegationConnector = TypeId.BAG.getSpecializedId(Component_basedTables.CLSSid_ERequiredDelegationConnector, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ERole = TypeId.BAG.getSpecializedId(Component_basedTables.CLSSid_ERole, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_ESignature = TypeId.BAG.getSpecializedId(Component_basedTables.CLSSid_ESignature, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_EAllocationContext = TypeId.ORDERED_SET.getSpecializedId(Component_basedTables.CLSSid_EAllocationContext, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_EAssemblyContext = TypeId.ORDERED_SET.getSpecializedId(Component_basedTables.CLSSid_EAssemblyContext, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_EBranch = TypeId.ORDERED_SET.getSpecializedId(Component_basedTables.CLSSid_EBranch, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_EComponent = TypeId.ORDERED_SET.getSpecializedId(Component_basedTables.CLSSid_EComponent, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ECompositeComponent = TypeId.ORDERED_SET.getSpecializedId(Component_basedTables.CLSSid_ECompositeComponent, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_EContainer = TypeId.ORDERED_SET.getSpecializedId(Component_basedTables.CLSSid_EContainer, true, ValueUtil.integerValueOf(2), ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_EContainer_0 = TypeId.ORDERED_SET.getSpecializedId(Component_basedTables.CLSSid_EContainer, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_EExternalCall = TypeId.ORDERED_SET.getSpecializedId(Component_basedTables.CLSSid_EExternalCall, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_EInterface = TypeId.ORDERED_SET.getSpecializedId(Component_basedTables.CLSSid_EInterface, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_EInterface_0 = TypeId.ORDERED_SET.getSpecializedId(Component_basedTables.CLSSid_EInterface, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_EInternalAction = TypeId.ORDERED_SET.getSpecializedId(Component_basedTables.CLSSid_EInternalAction, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ELink = TypeId.ORDERED_SET.getSpecializedId(Component_basedTables.CLSSid_ELink, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ELoop = TypeId.ORDERED_SET.getSpecializedId(Component_basedTables.CLSSid_ELoop, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_EParameter = TypeId.ORDERED_SET.getSpecializedId(Component_basedTables.CLSSid_EParameter, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ERepository = TypeId.ORDERED_SET.getSpecializedId(Component_basedTables.CLSSid_ERepository, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ERole = TypeId.ORDERED_SET.getSpecializedId(Component_basedTables.CLSSid_ERole, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_EService = TypeId.ORDERED_SET.getSpecializedId(Component_basedTables.CLSSid_EService, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ESignature = TypeId.ORDERED_SET.getSpecializedId(Component_basedTables.CLSSid_ESignature, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ESystem = TypeId.ORDERED_SET.getSpecializedId(Component_basedTables.CLSSid_ESystem, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_ESystem_0 = TypeId.ORDERED_SET.getSpecializedId(Component_basedTables.CLSSid_ESystem, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_EContainer = TypeId.SEQUENCE.getSpecializedId(Component_basedTables.CLSSid_EContainer, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_EInterface = TypeId.SEQUENCE.getSpecializedId(Component_basedTables.CLSSid_EInterface, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_ERole = TypeId.SEQUENCE.getSpecializedId(Component_basedTables.CLSSid_ERole, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_EService = TypeId.SEQUENCE.getSpecializedId(Component_basedTables.CLSSid_EService, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_CLSSid_ESignature = TypeId.SEQUENCE.getSpecializedId(Component_basedTables.CLSSid_ESignature, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_EAssemblyContext = TypeId.SET.getSpecializedId(Component_basedTables.CLSSid_EAssemblyContext, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_EContainer = TypeId.SET.getSpecializedId(Component_basedTables.CLSSid_EContainer, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_ERequiredRole = TypeId.SET.getSpecializedId(Component_basedTables.CLSSid_ERequiredRole, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			Component_basedTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Component_basedTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _EAllocationContext = new EcoreExecutorType(Component_basedPackage.Literals.EALLOCATION_CONTEXT, PACKAGE, 0);
		public static final EcoreExecutorType _EAllocationViewType = new EcoreExecutorType(Component_basedPackage.Literals.EALLOCATION_VIEW_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _EAssemblyConnector = new EcoreExecutorType(Component_basedPackage.Literals.EASSEMBLY_CONNECTOR, PACKAGE, 0);
		public static final EcoreExecutorType _EAssemblyContext = new EcoreExecutorType(Component_basedPackage.Literals.EASSEMBLY_CONTEXT, PACKAGE, 0);
		public static final EcoreExecutorType _EAssemblyViewPoint = new EcoreExecutorType(Component_basedPackage.Literals.EASSEMBLY_VIEW_POINT, PACKAGE, 0);
		public static final EcoreExecutorType _EAssemblyViewType = new EcoreExecutorType(Component_basedPackage.Literals.EASSEMBLY_VIEW_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _EBehaviourDescription = new EcoreExecutorType(Component_basedPackage.Literals.EBEHAVIOUR_DESCRIPTION, PACKAGE, 0);
		public static final EcoreExecutorType _EBranch = new EcoreExecutorType(Component_basedPackage.Literals.EBRANCH, PACKAGE, 0);
		public static final EcoreExecutorType _EComponent = new EcoreExecutorType(Component_basedPackage.Literals.ECOMPONENT, PACKAGE, 0);
		public static final EcoreExecutorType _ECompositeComponent = new EcoreExecutorType(Component_basedPackage.Literals.ECOMPOSITE_COMPONENT, PACKAGE, 0);
		public static final EcoreExecutorType _EContainer = new EcoreExecutorType(Component_basedPackage.Literals.ECONTAINER, PACKAGE, 0);
		public static final EcoreExecutorType _EDelegationConnector = new EcoreExecutorType(Component_basedPackage.Literals.EDELEGATION_CONNECTOR, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _EDeploymentViewPoint = new EcoreExecutorType(Component_basedPackage.Literals.EDEPLOYMENT_VIEW_POINT, PACKAGE, 0);
		public static final EcoreExecutorType _EEnvironmentViewType = new EcoreExecutorType(Component_basedPackage.Literals.EENVIRONMENT_VIEW_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _EExternalCall = new EcoreExecutorType(Component_basedPackage.Literals.EEXTERNAL_CALL, PACKAGE, 0);
		public static final EcoreExecutorType _EInterface = new EcoreExecutorType(Component_basedPackage.Literals.EINTERFACE, PACKAGE, 0);
		public static final EcoreExecutorType _EInternalAction = new EcoreExecutorType(Component_basedPackage.Literals.EINTERNAL_ACTION, PACKAGE, 0);
		public static final EcoreExecutorType _ELink = new EcoreExecutorType(Component_basedPackage.Literals.ELINK, PACKAGE, 0);
		public static final EcoreExecutorType _ELoop = new EcoreExecutorType(Component_basedPackage.Literals.ELOOP, PACKAGE, 0);
		public static final EcoreExecutorType _EParameter = new EcoreExecutorType(Component_basedPackage.Literals.EPARAMETER, PACKAGE, 0);
		public static final EcoreExecutorType _EProvidedDelegationConnector = new EcoreExecutorType(Component_basedPackage.Literals.EPROVIDED_DELEGATION_CONNECTOR, PACKAGE, 0);
		public static final EcoreExecutorType _EProvidedRole = new EcoreExecutorType(Component_basedPackage.Literals.EPROVIDED_ROLE, PACKAGE, 0);
		public static final EcoreExecutorType _ERepository = new EcoreExecutorType(Component_basedPackage.Literals.EREPOSITORY, PACKAGE, 0);
		public static final EcoreExecutorType _ERepositoryViewType = new EcoreExecutorType(Component_basedPackage.Literals.EREPOSITORY_VIEW_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _ERequiredDelegationConnector = new EcoreExecutorType(Component_basedPackage.Literals.EREQUIRED_DELEGATION_CONNECTOR, PACKAGE, 0);
		public static final EcoreExecutorType _ERequiredRole = new EcoreExecutorType(Component_basedPackage.Literals.EREQUIRED_ROLE, PACKAGE, 0);
		public static final EcoreExecutorType _ERole = new EcoreExecutorType(Component_basedPackage.Literals.EROLE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _EService = new EcoreExecutorType(Component_basedPackage.Literals.ESERVICE, PACKAGE, 0);
		public static final EcoreExecutorType _ESignature = new EcoreExecutorType(Component_basedPackage.Literals.ESIGNATURE, PACKAGE, 0);
		public static final EcoreExecutorType _ESystem = new EcoreExecutorType(Component_basedPackage.Literals.ESYSTEM, PACKAGE, 0);
		public static final EcoreExecutorType _ESystemIndependentViewPoint = new EcoreExecutorType(Component_basedPackage.Literals.ESYSTEM_INDEPENDENT_VIEW_POINT, PACKAGE, 0);
		public static final EcoreExecutorType _EViewPoint = new EcoreExecutorType(Component_basedPackage.Literals.EVIEW_POINT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _EViewType = new EcoreExecutorType(Component_basedPackage.Literals.EVIEW_TYPE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _EVoid = new EcoreExecutorType("EVoid", PACKAGE, 0);
		public static final EcoreExecutorEnumeration _PossibleParameterTypes = new EcoreExecutorEnumeration(Component_basedPackage.Literals.POSSIBLE_PARAMETER_TYPES, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _PossibleReturnTypes = new EcoreExecutorEnumeration(Component_basedPackage.Literals.POSSIBLE_RETURN_TYPES, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_EAllocationContext,
			_EAllocationViewType,
			_EAssemblyConnector,
			_EAssemblyContext,
			_EAssemblyViewPoint,
			_EAssemblyViewType,
			_EBehaviourDescription,
			_EBranch,
			_EComponent,
			_ECompositeComponent,
			_EContainer,
			_EDelegationConnector,
			_EDeploymentViewPoint,
			_EEnvironmentViewType,
			_EExternalCall,
			_EInterface,
			_EInternalAction,
			_ELink,
			_ELoop,
			_EParameter,
			_EProvidedDelegationConnector,
			_EProvidedRole,
			_ERepository,
			_ERepositoryViewType,
			_ERequiredDelegationConnector,
			_ERequiredRole,
			_ERole,
			_EService,
			_ESignature,
			_ESystem,
			_ESystemIndependentViewPoint,
			_EViewPoint,
			_EViewType,
			_EVoid,
			_PossibleParameterTypes,
			_PossibleReturnTypes
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Component_basedTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _EAllocationContext__EAllocationContext = new ExecutorFragment(Types._EAllocationContext, Component_basedTables.Types._EAllocationContext);
		private static final ExecutorFragment _EAllocationContext__OclAny = new ExecutorFragment(Types._EAllocationContext, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EAllocationContext__OclElement = new ExecutorFragment(Types._EAllocationContext, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EAllocationViewType__EAllocationViewType = new ExecutorFragment(Types._EAllocationViewType, Component_basedTables.Types._EAllocationViewType);
		private static final ExecutorFragment _EAllocationViewType__EViewType = new ExecutorFragment(Types._EAllocationViewType, Component_basedTables.Types._EViewType);
		private static final ExecutorFragment _EAllocationViewType__OclAny = new ExecutorFragment(Types._EAllocationViewType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EAllocationViewType__OclElement = new ExecutorFragment(Types._EAllocationViewType, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EAssemblyConnector__EAssemblyConnector = new ExecutorFragment(Types._EAssemblyConnector, Component_basedTables.Types._EAssemblyConnector);
		private static final ExecutorFragment _EAssemblyConnector__OclAny = new ExecutorFragment(Types._EAssemblyConnector, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EAssemblyConnector__OclElement = new ExecutorFragment(Types._EAssemblyConnector, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EAssemblyContext__EAssemblyContext = new ExecutorFragment(Types._EAssemblyContext, Component_basedTables.Types._EAssemblyContext);
		private static final ExecutorFragment _EAssemblyContext__OclAny = new ExecutorFragment(Types._EAssemblyContext, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EAssemblyContext__OclElement = new ExecutorFragment(Types._EAssemblyContext, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EAssemblyViewPoint__EAssemblyViewPoint = new ExecutorFragment(Types._EAssemblyViewPoint, Component_basedTables.Types._EAssemblyViewPoint);
		private static final ExecutorFragment _EAssemblyViewPoint__EViewPoint = new ExecutorFragment(Types._EAssemblyViewPoint, Component_basedTables.Types._EViewPoint);
		private static final ExecutorFragment _EAssemblyViewPoint__OclAny = new ExecutorFragment(Types._EAssemblyViewPoint, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EAssemblyViewPoint__OclElement = new ExecutorFragment(Types._EAssemblyViewPoint, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EAssemblyViewType__EAssemblyViewType = new ExecutorFragment(Types._EAssemblyViewType, Component_basedTables.Types._EAssemblyViewType);
		private static final ExecutorFragment _EAssemblyViewType__EViewType = new ExecutorFragment(Types._EAssemblyViewType, Component_basedTables.Types._EViewType);
		private static final ExecutorFragment _EAssemblyViewType__OclAny = new ExecutorFragment(Types._EAssemblyViewType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EAssemblyViewType__OclElement = new ExecutorFragment(Types._EAssemblyViewType, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EBehaviourDescription__EBehaviourDescription = new ExecutorFragment(Types._EBehaviourDescription, Component_basedTables.Types._EBehaviourDescription);
		private static final ExecutorFragment _EBehaviourDescription__OclAny = new ExecutorFragment(Types._EBehaviourDescription, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EBehaviourDescription__OclElement = new ExecutorFragment(Types._EBehaviourDescription, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EBranch__EBranch = new ExecutorFragment(Types._EBranch, Component_basedTables.Types._EBranch);
		private static final ExecutorFragment _EBranch__OclAny = new ExecutorFragment(Types._EBranch, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EBranch__OclElement = new ExecutorFragment(Types._EBranch, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EComponent__EComponent = new ExecutorFragment(Types._EComponent, Component_basedTables.Types._EComponent);
		private static final ExecutorFragment _EComponent__OclAny = new ExecutorFragment(Types._EComponent, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EComponent__OclElement = new ExecutorFragment(Types._EComponent, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ECompositeComponent__EComponent = new ExecutorFragment(Types._ECompositeComponent, Component_basedTables.Types._EComponent);
		private static final ExecutorFragment _ECompositeComponent__ECompositeComponent = new ExecutorFragment(Types._ECompositeComponent, Component_basedTables.Types._ECompositeComponent);
		private static final ExecutorFragment _ECompositeComponent__OclAny = new ExecutorFragment(Types._ECompositeComponent, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ECompositeComponent__OclElement = new ExecutorFragment(Types._ECompositeComponent, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EContainer__EContainer = new ExecutorFragment(Types._EContainer, Component_basedTables.Types._EContainer);
		private static final ExecutorFragment _EContainer__OclAny = new ExecutorFragment(Types._EContainer, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EContainer__OclElement = new ExecutorFragment(Types._EContainer, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EDelegationConnector__EDelegationConnector = new ExecutorFragment(Types._EDelegationConnector, Component_basedTables.Types._EDelegationConnector);
		private static final ExecutorFragment _EDelegationConnector__OclAny = new ExecutorFragment(Types._EDelegationConnector, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EDelegationConnector__OclElement = new ExecutorFragment(Types._EDelegationConnector, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EDeploymentViewPoint__EDeploymentViewPoint = new ExecutorFragment(Types._EDeploymentViewPoint, Component_basedTables.Types._EDeploymentViewPoint);
		private static final ExecutorFragment _EDeploymentViewPoint__EViewPoint = new ExecutorFragment(Types._EDeploymentViewPoint, Component_basedTables.Types._EViewPoint);
		private static final ExecutorFragment _EDeploymentViewPoint__OclAny = new ExecutorFragment(Types._EDeploymentViewPoint, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EDeploymentViewPoint__OclElement = new ExecutorFragment(Types._EDeploymentViewPoint, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EEnvironmentViewType__EEnvironmentViewType = new ExecutorFragment(Types._EEnvironmentViewType, Component_basedTables.Types._EEnvironmentViewType);
		private static final ExecutorFragment _EEnvironmentViewType__EViewType = new ExecutorFragment(Types._EEnvironmentViewType, Component_basedTables.Types._EViewType);
		private static final ExecutorFragment _EEnvironmentViewType__OclAny = new ExecutorFragment(Types._EEnvironmentViewType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EEnvironmentViewType__OclElement = new ExecutorFragment(Types._EEnvironmentViewType, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EExternalCall__EExternalCall = new ExecutorFragment(Types._EExternalCall, Component_basedTables.Types._EExternalCall);
		private static final ExecutorFragment _EExternalCall__OclAny = new ExecutorFragment(Types._EExternalCall, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EExternalCall__OclElement = new ExecutorFragment(Types._EExternalCall, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EInterface__EInterface = new ExecutorFragment(Types._EInterface, Component_basedTables.Types._EInterface);
		private static final ExecutorFragment _EInterface__OclAny = new ExecutorFragment(Types._EInterface, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EInterface__OclElement = new ExecutorFragment(Types._EInterface, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EInternalAction__EInternalAction = new ExecutorFragment(Types._EInternalAction, Component_basedTables.Types._EInternalAction);
		private static final ExecutorFragment _EInternalAction__OclAny = new ExecutorFragment(Types._EInternalAction, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EInternalAction__OclElement = new ExecutorFragment(Types._EInternalAction, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ELink__ELink = new ExecutorFragment(Types._ELink, Component_basedTables.Types._ELink);
		private static final ExecutorFragment _ELink__OclAny = new ExecutorFragment(Types._ELink, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ELink__OclElement = new ExecutorFragment(Types._ELink, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ELoop__ELoop = new ExecutorFragment(Types._ELoop, Component_basedTables.Types._ELoop);
		private static final ExecutorFragment _ELoop__OclAny = new ExecutorFragment(Types._ELoop, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ELoop__OclElement = new ExecutorFragment(Types._ELoop, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EParameter__EParameter = new ExecutorFragment(Types._EParameter, Component_basedTables.Types._EParameter);
		private static final ExecutorFragment _EParameter__OclAny = new ExecutorFragment(Types._EParameter, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EParameter__OclElement = new ExecutorFragment(Types._EParameter, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EProvidedDelegationConnector__EDelegationConnector = new ExecutorFragment(Types._EProvidedDelegationConnector, Component_basedTables.Types._EDelegationConnector);
		private static final ExecutorFragment _EProvidedDelegationConnector__EProvidedDelegationConnector = new ExecutorFragment(Types._EProvidedDelegationConnector, Component_basedTables.Types._EProvidedDelegationConnector);
		private static final ExecutorFragment _EProvidedDelegationConnector__OclAny = new ExecutorFragment(Types._EProvidedDelegationConnector, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EProvidedDelegationConnector__OclElement = new ExecutorFragment(Types._EProvidedDelegationConnector, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EProvidedRole__EProvidedRole = new ExecutorFragment(Types._EProvidedRole, Component_basedTables.Types._EProvidedRole);
		private static final ExecutorFragment _EProvidedRole__ERole = new ExecutorFragment(Types._EProvidedRole, Component_basedTables.Types._ERole);
		private static final ExecutorFragment _EProvidedRole__OclAny = new ExecutorFragment(Types._EProvidedRole, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EProvidedRole__OclElement = new ExecutorFragment(Types._EProvidedRole, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ERepository__ERepository = new ExecutorFragment(Types._ERepository, Component_basedTables.Types._ERepository);
		private static final ExecutorFragment _ERepository__OclAny = new ExecutorFragment(Types._ERepository, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ERepository__OclElement = new ExecutorFragment(Types._ERepository, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ERepositoryViewType__ERepositoryViewType = new ExecutorFragment(Types._ERepositoryViewType, Component_basedTables.Types._ERepositoryViewType);
		private static final ExecutorFragment _ERepositoryViewType__EViewType = new ExecutorFragment(Types._ERepositoryViewType, Component_basedTables.Types._EViewType);
		private static final ExecutorFragment _ERepositoryViewType__OclAny = new ExecutorFragment(Types._ERepositoryViewType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ERepositoryViewType__OclElement = new ExecutorFragment(Types._ERepositoryViewType, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ERequiredDelegationConnector__EDelegationConnector = new ExecutorFragment(Types._ERequiredDelegationConnector, Component_basedTables.Types._EDelegationConnector);
		private static final ExecutorFragment _ERequiredDelegationConnector__ERequiredDelegationConnector = new ExecutorFragment(Types._ERequiredDelegationConnector, Component_basedTables.Types._ERequiredDelegationConnector);
		private static final ExecutorFragment _ERequiredDelegationConnector__OclAny = new ExecutorFragment(Types._ERequiredDelegationConnector, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ERequiredDelegationConnector__OclElement = new ExecutorFragment(Types._ERequiredDelegationConnector, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ERequiredRole__ERequiredRole = new ExecutorFragment(Types._ERequiredRole, Component_basedTables.Types._ERequiredRole);
		private static final ExecutorFragment _ERequiredRole__ERole = new ExecutorFragment(Types._ERequiredRole, Component_basedTables.Types._ERole);
		private static final ExecutorFragment _ERequiredRole__OclAny = new ExecutorFragment(Types._ERequiredRole, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ERequiredRole__OclElement = new ExecutorFragment(Types._ERequiredRole, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ERole__ERole = new ExecutorFragment(Types._ERole, Component_basedTables.Types._ERole);
		private static final ExecutorFragment _ERole__OclAny = new ExecutorFragment(Types._ERole, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ERole__OclElement = new ExecutorFragment(Types._ERole, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EService__EService = new ExecutorFragment(Types._EService, Component_basedTables.Types._EService);
		private static final ExecutorFragment _EService__OclAny = new ExecutorFragment(Types._EService, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EService__OclElement = new ExecutorFragment(Types._EService, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ESignature__ESignature = new ExecutorFragment(Types._ESignature, Component_basedTables.Types._ESignature);
		private static final ExecutorFragment _ESignature__OclAny = new ExecutorFragment(Types._ESignature, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ESignature__OclElement = new ExecutorFragment(Types._ESignature, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ESystem__ESystem = new ExecutorFragment(Types._ESystem, Component_basedTables.Types._ESystem);
		private static final ExecutorFragment _ESystem__OclAny = new ExecutorFragment(Types._ESystem, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ESystem__OclElement = new ExecutorFragment(Types._ESystem, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ESystemIndependentViewPoint__ESystemIndependentViewPoint = new ExecutorFragment(Types._ESystemIndependentViewPoint, Component_basedTables.Types._ESystemIndependentViewPoint);
		private static final ExecutorFragment _ESystemIndependentViewPoint__EViewPoint = new ExecutorFragment(Types._ESystemIndependentViewPoint, Component_basedTables.Types._EViewPoint);
		private static final ExecutorFragment _ESystemIndependentViewPoint__OclAny = new ExecutorFragment(Types._ESystemIndependentViewPoint, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ESystemIndependentViewPoint__OclElement = new ExecutorFragment(Types._ESystemIndependentViewPoint, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EViewPoint__EViewPoint = new ExecutorFragment(Types._EViewPoint, Component_basedTables.Types._EViewPoint);
		private static final ExecutorFragment _EViewPoint__OclAny = new ExecutorFragment(Types._EViewPoint, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EViewPoint__OclElement = new ExecutorFragment(Types._EViewPoint, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EViewType__EViewType = new ExecutorFragment(Types._EViewType, Component_basedTables.Types._EViewType);
		private static final ExecutorFragment _EViewType__OclAny = new ExecutorFragment(Types._EViewType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EViewType__OclElement = new ExecutorFragment(Types._EViewType, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EVoid__EVoid = new ExecutorFragment(Types._EVoid, Component_basedTables.Types._EVoid);
		private static final ExecutorFragment _EVoid__OclAny = new ExecutorFragment(Types._EVoid, OCLstdlibTables.Types._OclAny);

		private static final ExecutorFragment _PossibleParameterTypes__OclAny = new ExecutorFragment(Types._PossibleParameterTypes, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PossibleParameterTypes__OclElement = new ExecutorFragment(Types._PossibleParameterTypes, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PossibleParameterTypes__OclEnumeration = new ExecutorFragment(Types._PossibleParameterTypes, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _PossibleParameterTypes__OclType = new ExecutorFragment(Types._PossibleParameterTypes, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _PossibleParameterTypes__PossibleParameterTypes = new ExecutorFragment(Types._PossibleParameterTypes, Component_basedTables.Types._PossibleParameterTypes);

		private static final ExecutorFragment _PossibleReturnTypes__OclAny = new ExecutorFragment(Types._PossibleReturnTypes, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _PossibleReturnTypes__OclElement = new ExecutorFragment(Types._PossibleReturnTypes, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _PossibleReturnTypes__OclEnumeration = new ExecutorFragment(Types._PossibleReturnTypes, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _PossibleReturnTypes__OclType = new ExecutorFragment(Types._PossibleReturnTypes, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _PossibleReturnTypes__PossibleReturnTypes = new ExecutorFragment(Types._PossibleReturnTypes, Component_basedTables.Types._PossibleReturnTypes);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Component_basedTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Component_basedTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final ExecutorOperation _EAllocationViewType__showComponentAllocations = new ExecutorOperation("showComponentAllocations", TypeUtil.EMPTY_PARAMETER_TYPES, Types._EAllocationViewType,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _EAssemblyViewType__showComponentConnections = new ExecutorOperation("showComponentConnections", TypeUtil.EMPTY_PARAMETER_TYPES, Types._EAssemblyViewType,
			0, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Component_basedTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _EAllocationContext__controls = new EcoreExecutorProperty(Component_basedPackage.Literals.EALLOCATION_CONTEXT__CONTROLS, Types._EAllocationContext, 0);
		public static final ExecutorProperty _EAllocationContext__specifies = new EcoreExecutorProperty(Component_basedPackage.Literals.EALLOCATION_CONTEXT__SPECIFIES, Types._EAllocationContext, 1);
		public static final ExecutorProperty _EAllocationContext__specifiesFor = new EcoreExecutorProperty(Component_basedPackage.Literals.EALLOCATION_CONTEXT__SPECIFIES_FOR, Types._EAllocationContext, 2);
		public static final ExecutorProperty _EAllocationContext__EAllocationViewType__includes = new ExecutorPropertyWithImplementation("EAllocationViewType", Types._EAllocationContext, 3, new EcoreLibraryOppositeProperty(Component_basedPackage.Literals.EALLOCATION_VIEW_TYPE__INCLUDES));

		public static final ExecutorProperty _EAllocationViewType__includes = new EcoreExecutorProperty(Component_basedPackage.Literals.EALLOCATION_VIEW_TYPE__INCLUDES, Types._EAllocationViewType, 0);
		public static final ExecutorProperty _EAllocationViewType__EDeploymentViewPoint__allocationViewType = new ExecutorPropertyWithImplementation("EDeploymentViewPoint", Types._EAllocationViewType, 1, new EcoreLibraryOppositeProperty(Component_basedPackage.Literals.EDEPLOYMENT_VIEW_POINT__ALLOCATION_VIEW_TYPE));

		public static final ExecutorProperty _EAssemblyConnector__linkFrom = new EcoreExecutorProperty(Component_basedPackage.Literals.EASSEMBLY_CONNECTOR__LINK_FROM, Types._EAssemblyConnector, 0);
		public static final ExecutorProperty _EAssemblyConnector__linkTo = new EcoreExecutorProperty(Component_basedPackage.Literals.EASSEMBLY_CONNECTOR__LINK_TO, Types._EAssemblyConnector, 1);
		public static final ExecutorProperty _EAssemblyConnector__name = new EcoreExecutorProperty(Component_basedPackage.Literals.EASSEMBLY_CONNECTOR__NAME, Types._EAssemblyConnector, 2);

		public static final ExecutorProperty _EAssemblyContext__allocated = new EcoreExecutorProperty(Component_basedPackage.Literals.EASSEMBLY_CONTEXT__ALLOCATED, Types._EAssemblyContext, 0);
		public static final ExecutorProperty _EAssemblyContext__encapsulatedByComponent = new EcoreExecutorProperty(Component_basedPackage.Literals.EASSEMBLY_CONTEXT__ENCAPSULATED_BY_COMPONENT, Types._EAssemblyContext, 1);
		public static final ExecutorProperty _EAssemblyContext__encapsulatedBySystem = new EcoreExecutorProperty(Component_basedPackage.Literals.EASSEMBLY_CONTEXT__ENCAPSULATED_BY_SYSTEM, Types._EAssemblyContext, 2);
		public static final ExecutorProperty _EAssemblyContext__instantiates = new EcoreExecutorProperty(Component_basedPackage.Literals.EASSEMBLY_CONTEXT__INSTANTIATES, Types._EAssemblyContext, 3);
		public static final ExecutorProperty _EAssemblyContext__name = new EcoreExecutorProperty(Component_basedPackage.Literals.EASSEMBLY_CONTEXT__NAME, Types._EAssemblyContext, 4);
		public static final ExecutorProperty _EAssemblyContext__roles = new EcoreExecutorProperty(Component_basedPackage.Literals.EASSEMBLY_CONTEXT__ROLES, Types._EAssemblyContext, 5);
		public static final ExecutorProperty _EAssemblyContext__EAllocationContext__specifies = new ExecutorPropertyWithImplementation("EAllocationContext", Types._EAssemblyContext, 6, new EcoreLibraryOppositeProperty(Component_basedPackage.Literals.EALLOCATION_CONTEXT__SPECIFIES));
		public static final ExecutorProperty _EAssemblyContext__EAssemblyViewType__mainArtifacts = new ExecutorPropertyWithImplementation("EAssemblyViewType", Types._EAssemblyContext, 7, new EcoreLibraryOppositeProperty(Component_basedPackage.Literals.EASSEMBLY_VIEW_TYPE__MAIN_ARTIFACTS));
		public static final ExecutorProperty _EAssemblyContext__ERole__roleOf = new ExecutorPropertyWithImplementation("ERole", Types._EAssemblyContext, 8, new EcoreLibraryOppositeProperty(Component_basedPackage.Literals.EROLE__ROLE_OF));

		public static final ExecutorProperty _EAssemblyViewPoint__assemblyViewType = new EcoreExecutorProperty(Component_basedPackage.Literals.EASSEMBLY_VIEW_POINT__ASSEMBLY_VIEW_TYPE, Types._EAssemblyViewPoint, 0);

		public static final ExecutorProperty _EAssemblyViewType__mainArtifacts = new EcoreExecutorProperty(Component_basedPackage.Literals.EASSEMBLY_VIEW_TYPE__MAIN_ARTIFACTS, Types._EAssemblyViewType, 0);
		public static final ExecutorProperty _EAssemblyViewType__showsComponents = new EcoreExecutorProperty(Component_basedPackage.Literals.EASSEMBLY_VIEW_TYPE__SHOWS_COMPONENTS, Types._EAssemblyViewType, 1);
		public static final ExecutorProperty _EAssemblyViewType__EAssemblyViewPoint__assemblyViewType = new ExecutorPropertyWithImplementation("EAssemblyViewPoint", Types._EAssemblyViewType, 2, new EcoreLibraryOppositeProperty(Component_basedPackage.Literals.EASSEMBLY_VIEW_POINT__ASSEMBLY_VIEW_TYPE));

		public static final ExecutorProperty _EBehaviourDescription__branch = new EcoreExecutorProperty(Component_basedPackage.Literals.EBEHAVIOUR_DESCRIPTION__BRANCH, Types._EBehaviourDescription, 0);
		public static final ExecutorProperty _EBehaviourDescription__externalCall = new EcoreExecutorProperty(Component_basedPackage.Literals.EBEHAVIOUR_DESCRIPTION__EXTERNAL_CALL, Types._EBehaviourDescription, 1);
		public static final ExecutorProperty _EBehaviourDescription__internalAction = new EcoreExecutorProperty(Component_basedPackage.Literals.EBEHAVIOUR_DESCRIPTION__INTERNAL_ACTION, Types._EBehaviourDescription, 2);
		public static final ExecutorProperty _EBehaviourDescription__loop = new EcoreExecutorProperty(Component_basedPackage.Literals.EBEHAVIOUR_DESCRIPTION__LOOP, Types._EBehaviourDescription, 3);
		public static final ExecutorProperty _EBehaviourDescription__EComponent__behaviourDescription = new ExecutorPropertyWithImplementation("EComponent", Types._EBehaviourDescription, 4, new EcoreLibraryOppositeProperty(Component_basedPackage.Literals.ECOMPONENT__BEHAVIOUR_DESCRIPTION));

		public static final ExecutorProperty _EBranch__EBehaviourDescription__branch = new ExecutorPropertyWithImplementation("EBehaviourDescription", Types._EBranch, 0, new EcoreLibraryOppositeProperty(Component_basedPackage.Literals.EBEHAVIOUR_DESCRIPTION__BRANCH));

		public static final ExecutorProperty _EComponent__behaviourDescription = new EcoreExecutorProperty(Component_basedPackage.Literals.ECOMPONENT__BEHAVIOUR_DESCRIPTION, Types._EComponent, 0);
		public static final ExecutorProperty _EComponent__name = new EcoreExecutorProperty(Component_basedPackage.Literals.ECOMPONENT__NAME, Types._EComponent, 1);
		public static final ExecutorProperty _EComponent__provides = new EcoreExecutorProperty(Component_basedPackage.Literals.ECOMPONENT__PROVIDES, Types._EComponent, 2);
		public static final ExecutorProperty _EComponent__providesDirectly = new EcoreExecutorProperty(Component_basedPackage.Literals.ECOMPONENT__PROVIDES_DIRECTLY, Types._EComponent, 3);
		public static final ExecutorProperty _EComponent__providesInterfaceTo = new EcoreExecutorProperty(Component_basedPackage.Literals.ECOMPONENT__PROVIDES_INTERFACE_TO, Types._EComponent, 4);
		public static final ExecutorProperty _EComponent__requires = new EcoreExecutorProperty(Component_basedPackage.Literals.ECOMPONENT__REQUIRES, Types._EComponent, 5);
		public static final ExecutorProperty _EComponent__usesInterfaceFrom = new EcoreExecutorProperty(Component_basedPackage.Literals.ECOMPONENT__USES_INTERFACE_FROM, Types._EComponent, 6);
		public static final ExecutorProperty _EComponent__EAssemblyContext__instantiates = new ExecutorPropertyWithImplementation("EAssemblyContext", Types._EComponent, 7, new EcoreLibraryOppositeProperty(Component_basedPackage.Literals.EASSEMBLY_CONTEXT__INSTANTIATES));
		public static final ExecutorProperty _EComponent__EAssemblyViewType__showsComponents = new ExecutorPropertyWithImplementation("EAssemblyViewType", Types._EComponent, 8, new EcoreLibraryOppositeProperty(Component_basedPackage.Literals.EASSEMBLY_VIEW_TYPE__SHOWS_COMPONENTS));
		public static final ExecutorProperty _EComponent__ERepository__component = new ExecutorPropertyWithImplementation("ERepository", Types._EComponent, 9, new EcoreLibraryOppositeProperty(Component_basedPackage.Literals.EREPOSITORY__COMPONENT));
		public static final ExecutorProperty _EComponent__ERepositoryViewType__showsComponents = new ExecutorPropertyWithImplementation("ERepositoryViewType", Types._EComponent, 10, new EcoreLibraryOppositeProperty(Component_basedPackage.Literals.EREPOSITORY_VIEW_TYPE__SHOWS_COMPONENTS));

		public static final ExecutorProperty _ECompositeComponent__encapsulates = new EcoreExecutorProperty(Component_basedPackage.Literals.ECOMPOSITE_COMPONENT__ENCAPSULATES, Types._ECompositeComponent, 0);

		public static final ExecutorProperty _EContainer__connectedTo = new EcoreExecutorProperty(Component_basedPackage.Literals.ECONTAINER__CONNECTED_TO, Types._EContainer, 0);
		public static final ExecutorProperty _EContainer__name = new EcoreExecutorProperty(Component_basedPackage.Literals.ECONTAINER__NAME, Types._EContainer, 1);
		public static final ExecutorProperty _EContainer__EAllocationContext__controls = new ExecutorPropertyWithImplementation("EAllocationContext", Types._EContainer, 2, new EcoreLibraryOppositeProperty(Component_basedPackage.Literals.EALLOCATION_CONTEXT__CONTROLS));
		public static final ExecutorProperty _EContainer__EAssemblyContext__allocated = new ExecutorPropertyWithImplementation("EAssemblyContext", Types._EContainer, 3, new EcoreLibraryOppositeProperty(Component_basedPackage.Literals.EASSEMBLY_CONTEXT__ALLOCATED));
		public static final ExecutorProperty _EContainer__EEnvironmentViewType__showsContainers = new ExecutorPropertyWithImplementation("EEnvironmentViewType", Types._EContainer, 4, new EcoreLibraryOppositeProperty(Component_basedPackage.Literals.EENVIRONMENT_VIEW_TYPE__SHOWS_CONTAINERS));
		public static final ExecutorProperty _EContainer__ESystem__containsContainers = new ExecutorPropertyWithImplementation("ESystem", Types._EContainer, 5, new EcoreLibraryOppositeProperty(Component_basedPackage.Literals.ESYSTEM__CONTAINS_CONTAINERS));

		public static final ExecutorProperty _EDeploymentViewPoint__allocationViewType = new EcoreExecutorProperty(Component_basedPackage.Literals.EDEPLOYMENT_VIEW_POINT__ALLOCATION_VIEW_TYPE, Types._EDeploymentViewPoint, 0);
		public static final ExecutorProperty _EDeploymentViewPoint__environmentViewType = new EcoreExecutorProperty(Component_basedPackage.Literals.EDEPLOYMENT_VIEW_POINT__ENVIRONMENT_VIEW_TYPE, Types._EDeploymentViewPoint, 1);

		public static final ExecutorProperty _EEnvironmentViewType__showsContainers = new EcoreExecutorProperty(Component_basedPackage.Literals.EENVIRONMENT_VIEW_TYPE__SHOWS_CONTAINERS, Types._EEnvironmentViewType, 0);
		public static final ExecutorProperty _EEnvironmentViewType__showsLinks = new EcoreExecutorProperty(Component_basedPackage.Literals.EENVIRONMENT_VIEW_TYPE__SHOWS_LINKS, Types._EEnvironmentViewType, 1);
		public static final ExecutorProperty _EEnvironmentViewType__EDeploymentViewPoint__environmentViewType = new ExecutorPropertyWithImplementation("EDeploymentViewPoint", Types._EEnvironmentViewType, 2, new EcoreLibraryOppositeProperty(Component_basedPackage.Literals.EDEPLOYMENT_VIEW_POINT__ENVIRONMENT_VIEW_TYPE));

		public static final ExecutorProperty _EExternalCall__to = new EcoreExecutorProperty(Component_basedPackage.Literals.EEXTERNAL_CALL__TO, Types._EExternalCall, 0);
		public static final ExecutorProperty _EExternalCall__EBehaviourDescription__externalCall = new ExecutorPropertyWithImplementation("EBehaviourDescription", Types._EExternalCall, 1, new EcoreLibraryOppositeProperty(Component_basedPackage.Literals.EBEHAVIOUR_DESCRIPTION__EXTERNAL_CALL));

		public static final ExecutorProperty _EInterface__name = new EcoreExecutorProperty(Component_basedPackage.Literals.EINTERFACE__NAME, Types._EInterface, 0);
		public static final ExecutorProperty _EInterface__providedByComponent = new EcoreExecutorProperty(Component_basedPackage.Literals.EINTERFACE__PROVIDED_BY_COMPONENT, Types._EInterface, 1);
		public static final ExecutorProperty _EInterface__providedBySystem = new EcoreExecutorProperty(Component_basedPackage.Literals.EINTERFACE__PROVIDED_BY_SYSTEM, Types._EInterface, 2);
		public static final ExecutorProperty _EInterface__requiredByComponent = new EcoreExecutorProperty(Component_basedPackage.Literals.EINTERFACE__REQUIRED_BY_COMPONENT, Types._EInterface, 3);
		public static final ExecutorProperty _EInterface__requiredBySystem = new EcoreExecutorProperty(Component_basedPackage.Literals.EINTERFACE__REQUIRED_BY_SYSTEM, Types._EInterface, 4);
		public static final ExecutorProperty _EInterface__resultsIn = new EcoreExecutorProperty(Component_basedPackage.Literals.EINTERFACE__RESULTS_IN, Types._EInterface, 5);
		public static final ExecutorProperty _EInterface__signature = new EcoreExecutorProperty(Component_basedPackage.Literals.EINTERFACE__SIGNATURE, Types._EInterface, 6);
		public static final ExecutorProperty _EInterface__EProvidedDelegationConnector__linkFrom = new ExecutorPropertyWithImplementation("EProvidedDelegationConnector", Types._EInterface, 7, new EcoreLibraryOppositeProperty(Component_basedPackage.Literals.EPROVIDED_DELEGATION_CONNECTOR__LINK_FROM));
		public static final ExecutorProperty _EInterface__ERepository__interface = new ExecutorPropertyWithImplementation("ERepository", Types._EInterface, 8, new EcoreLibraryOppositeProperty(Component_basedPackage.Literals.EREPOSITORY__INTERFACE));
		public static final ExecutorProperty _EInterface__ERepositoryViewType__showsInterfaces = new ExecutorPropertyWithImplementation("ERepositoryViewType", Types._EInterface, 9, new EcoreLibraryOppositeProperty(Component_basedPackage.Literals.EREPOSITORY_VIEW_TYPE__SHOWS_INTERFACES));
		public static final ExecutorProperty _EInterface__ERequiredDelegationConnector__linkTo = new ExecutorPropertyWithImplementation("ERequiredDelegationConnector", Types._EInterface, 10, new EcoreLibraryOppositeProperty(Component_basedPackage.Literals.EREQUIRED_DELEGATION_CONNECTOR__LINK_TO));

		public static final ExecutorProperty _EInternalAction__EBehaviourDescription__internalAction = new ExecutorPropertyWithImplementation("EBehaviourDescription", Types._EInternalAction, 0, new EcoreLibraryOppositeProperty(Component_basedPackage.Literals.EBEHAVIOUR_DESCRIPTION__INTERNAL_ACTION));

		public static final ExecutorProperty _ELink__connects = new EcoreExecutorProperty(Component_basedPackage.Literals.ELINK__CONNECTS, Types._ELink, 0);
		public static final ExecutorProperty _ELink__name = new EcoreExecutorProperty(Component_basedPackage.Literals.ELINK__NAME, Types._ELink, 1);
		public static final ExecutorProperty _ELink__EEnvironmentViewType__showsLinks = new ExecutorPropertyWithImplementation("EEnvironmentViewType", Types._ELink, 2, new EcoreLibraryOppositeProperty(Component_basedPackage.Literals.EENVIRONMENT_VIEW_TYPE__SHOWS_LINKS));

		public static final ExecutorProperty _ELoop__EBehaviourDescription__loop = new ExecutorPropertyWithImplementation("EBehaviourDescription", Types._ELoop, 0, new EcoreLibraryOppositeProperty(Component_basedPackage.Literals.EBEHAVIOUR_DESCRIPTION__LOOP));

		public static final ExecutorProperty _EParameter__name = new EcoreExecutorProperty(Component_basedPackage.Literals.EPARAMETER__NAME, Types._EParameter, 0);
		public static final ExecutorProperty _EParameter__type = new EcoreExecutorProperty(Component_basedPackage.Literals.EPARAMETER__TYPE, Types._EParameter, 1);
		public static final ExecutorProperty _EParameter__ESignature__parameter = new ExecutorPropertyWithImplementation("ESignature", Types._EParameter, 2, new EcoreLibraryOppositeProperty(Component_basedPackage.Literals.ESIGNATURE__PARAMETER));

		public static final ExecutorProperty _EProvidedDelegationConnector__linkFrom = new EcoreExecutorProperty(Component_basedPackage.Literals.EPROVIDED_DELEGATION_CONNECTOR__LINK_FROM, Types._EProvidedDelegationConnector, 0);
		public static final ExecutorProperty _EProvidedDelegationConnector__linkTo = new EcoreExecutorProperty(Component_basedPackage.Literals.EPROVIDED_DELEGATION_CONNECTOR__LINK_TO, Types._EProvidedDelegationConnector, 1);

		public static final ExecutorProperty _EProvidedRole__linkedFrom = new EcoreExecutorProperty(Component_basedPackage.Literals.EPROVIDED_ROLE__LINKED_FROM, Types._EProvidedRole, 0);
		public static final ExecutorProperty _EProvidedRole__name = new EcoreExecutorProperty(Component_basedPackage.Literals.EPROVIDED_ROLE__NAME, Types._EProvidedRole, 1);
		public static final ExecutorProperty _EProvidedRole__EProvidedDelegationConnector__linkTo = new ExecutorPropertyWithImplementation("EProvidedDelegationConnector", Types._EProvidedRole, 2, new EcoreLibraryOppositeProperty(Component_basedPackage.Literals.EPROVIDED_DELEGATION_CONNECTOR__LINK_TO));

		public static final ExecutorProperty _ERepository__component = new EcoreExecutorProperty(Component_basedPackage.Literals.EREPOSITORY__COMPONENT, Types._ERepository, 0);
		public static final ExecutorProperty _ERepository__interface = new EcoreExecutorProperty(Component_basedPackage.Literals.EREPOSITORY__INTERFACE, Types._ERepository, 1);
		public static final ExecutorProperty _ERepository__ESystem__containsRepos = new ExecutorPropertyWithImplementation("ESystem", Types._ERepository, 2, new EcoreLibraryOppositeProperty(Component_basedPackage.Literals.ESYSTEM__CONTAINS_REPOS));

		public static final ExecutorProperty _ERepositoryViewType__showsComponents = new EcoreExecutorProperty(Component_basedPackage.Literals.EREPOSITORY_VIEW_TYPE__SHOWS_COMPONENTS, Types._ERepositoryViewType, 0);
		public static final ExecutorProperty _ERepositoryViewType__showsInterfaces = new EcoreExecutorProperty(Component_basedPackage.Literals.EREPOSITORY_VIEW_TYPE__SHOWS_INTERFACES, Types._ERepositoryViewType, 1);
		public static final ExecutorProperty _ERepositoryViewType__ESystemIndependentViewPoint__repositoryViewType = new ExecutorPropertyWithImplementation("ESystemIndependentViewPoint", Types._ERepositoryViewType, 2, new EcoreLibraryOppositeProperty(Component_basedPackage.Literals.ESYSTEM_INDEPENDENT_VIEW_POINT__REPOSITORY_VIEW_TYPE));

		public static final ExecutorProperty _ERequiredDelegationConnector__linkFrom = new EcoreExecutorProperty(Component_basedPackage.Literals.EREQUIRED_DELEGATION_CONNECTOR__LINK_FROM, Types._ERequiredDelegationConnector, 0);
		public static final ExecutorProperty _ERequiredDelegationConnector__linkTo = new EcoreExecutorProperty(Component_basedPackage.Literals.EREQUIRED_DELEGATION_CONNECTOR__LINK_TO, Types._ERequiredDelegationConnector, 1);

		public static final ExecutorProperty _ERequiredRole__linkedTo = new EcoreExecutorProperty(Component_basedPackage.Literals.EREQUIRED_ROLE__LINKED_TO, Types._ERequiredRole, 0);
		public static final ExecutorProperty _ERequiredRole__name = new EcoreExecutorProperty(Component_basedPackage.Literals.EREQUIRED_ROLE__NAME, Types._ERequiredRole, 1);
		public static final ExecutorProperty _ERequiredRole__ERequiredDelegationConnector__linkFrom = new ExecutorPropertyWithImplementation("ERequiredDelegationConnector", Types._ERequiredRole, 2, new EcoreLibraryOppositeProperty(Component_basedPackage.Literals.EREQUIRED_DELEGATION_CONNECTOR__LINK_FROM));

		public static final ExecutorProperty _ERole__roleOf = new EcoreExecutorProperty(Component_basedPackage.Literals.EROLE__ROLE_OF, Types._ERole, 0);
		public static final ExecutorProperty _ERole__EAssemblyContext__roles = new ExecutorPropertyWithImplementation("EAssemblyContext", Types._ERole, 1, new EcoreLibraryOppositeProperty(Component_basedPackage.Literals.EASSEMBLY_CONTEXT__ROLES));
		public static final ExecutorProperty _ERole__EInterface__resultsIn = new ExecutorPropertyWithImplementation("EInterface", Types._ERole, 2, new EcoreLibraryOppositeProperty(Component_basedPackage.Literals.EINTERFACE__RESULTS_IN));

		public static final ExecutorProperty _EService__name = new EcoreExecutorProperty(Component_basedPackage.Literals.ESERVICE__NAME, Types._EService, 0);
		public static final ExecutorProperty _EService__EComponent__providesDirectly = new ExecutorPropertyWithImplementation("EComponent", Types._EService, 1, new EcoreLibraryOppositeProperty(Component_basedPackage.Literals.ECOMPONENT__PROVIDES_DIRECTLY));
		public static final ExecutorProperty _EService__EExternalCall__to = new ExecutorPropertyWithImplementation("EExternalCall", Types._EService, 2, new EcoreLibraryOppositeProperty(Component_basedPackage.Literals.EEXTERNAL_CALL__TO));
		public static final ExecutorProperty _EService__ESignature__correspondsTo = new ExecutorPropertyWithImplementation("ESignature", Types._EService, 3, new EcoreLibraryOppositeProperty(Component_basedPackage.Literals.ESIGNATURE__CORRESPONDS_TO));

		public static final ExecutorProperty _ESignature__correspondsTo = new EcoreExecutorProperty(Component_basedPackage.Literals.ESIGNATURE__CORRESPONDS_TO, Types._ESignature, 0);
		public static final ExecutorProperty _ESignature__name = new EcoreExecutorProperty(Component_basedPackage.Literals.ESIGNATURE__NAME, Types._ESignature, 1);
		public static final ExecutorProperty _ESignature__parameter = new EcoreExecutorProperty(Component_basedPackage.Literals.ESIGNATURE__PARAMETER, Types._ESignature, 2);
		public static final ExecutorProperty _ESignature__returnType = new EcoreExecutorProperty(Component_basedPackage.Literals.ESIGNATURE__RETURN_TYPE, Types._ESignature, 3);
		public static final ExecutorProperty _ESignature__EInterface__signature = new ExecutorPropertyWithImplementation("EInterface", Types._ESignature, 4, new EcoreLibraryOppositeProperty(Component_basedPackage.Literals.EINTERFACE__SIGNATURE));

		public static final ExecutorProperty _ESystem__containsContainers = new EcoreExecutorProperty(Component_basedPackage.Literals.ESYSTEM__CONTAINS_CONTAINERS, Types._ESystem, 0);
		public static final ExecutorProperty _ESystem__containsRepos = new EcoreExecutorProperty(Component_basedPackage.Literals.ESYSTEM__CONTAINS_REPOS, Types._ESystem, 1);
		public static final ExecutorProperty _ESystem__encapsulates = new EcoreExecutorProperty(Component_basedPackage.Literals.ESYSTEM__ENCAPSULATES, Types._ESystem, 2);
		public static final ExecutorProperty _ESystem__name = new EcoreExecutorProperty(Component_basedPackage.Literals.ESYSTEM__NAME, Types._ESystem, 3);
		public static final ExecutorProperty _ESystem__provides = new EcoreExecutorProperty(Component_basedPackage.Literals.ESYSTEM__PROVIDES, Types._ESystem, 4);
		public static final ExecutorProperty _ESystem__requires = new EcoreExecutorProperty(Component_basedPackage.Literals.ESYSTEM__REQUIRES, Types._ESystem, 5);
		public static final ExecutorProperty _ESystem__EAllocationContext__specifiesFor = new ExecutorPropertyWithImplementation("EAllocationContext", Types._ESystem, 6, new EcoreLibraryOppositeProperty(Component_basedPackage.Literals.EALLOCATION_CONTEXT__SPECIFIES_FOR));

		public static final ExecutorProperty _ESystemIndependentViewPoint__repositoryViewType = new EcoreExecutorProperty(Component_basedPackage.Literals.ESYSTEM_INDEPENDENT_VIEW_POINT__REPOSITORY_VIEW_TYPE, Types._ESystemIndependentViewPoint, 0);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Component_basedTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _EAllocationContext =
			{
				Fragments._EAllocationContext__OclAny /* 0 */,
				Fragments._EAllocationContext__OclElement /* 1 */,
				Fragments._EAllocationContext__EAllocationContext /* 2 */
			};
		private static final int /*@NonNull*/ [] __EAllocationContext = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EAllocationViewType =
			{
				Fragments._EAllocationViewType__OclAny /* 0 */,
				Fragments._EAllocationViewType__OclElement /* 1 */,
				Fragments._EAllocationViewType__EViewType /* 2 */,
				Fragments._EAllocationViewType__EAllocationViewType /* 3 */
			};
		private static final int /*@NonNull*/ [] __EAllocationViewType = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EAssemblyConnector =
			{
				Fragments._EAssemblyConnector__OclAny /* 0 */,
				Fragments._EAssemblyConnector__OclElement /* 1 */,
				Fragments._EAssemblyConnector__EAssemblyConnector /* 2 */
			};
		private static final int /*@NonNull*/ [] __EAssemblyConnector = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EAssemblyContext =
			{
				Fragments._EAssemblyContext__OclAny /* 0 */,
				Fragments._EAssemblyContext__OclElement /* 1 */,
				Fragments._EAssemblyContext__EAssemblyContext /* 2 */
			};
		private static final int /*@NonNull*/ [] __EAssemblyContext = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EAssemblyViewPoint =
			{
				Fragments._EAssemblyViewPoint__OclAny /* 0 */,
				Fragments._EAssemblyViewPoint__OclElement /* 1 */,
				Fragments._EAssemblyViewPoint__EViewPoint /* 2 */,
				Fragments._EAssemblyViewPoint__EAssemblyViewPoint /* 3 */
			};
		private static final int /*@NonNull*/ [] __EAssemblyViewPoint = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EAssemblyViewType =
			{
				Fragments._EAssemblyViewType__OclAny /* 0 */,
				Fragments._EAssemblyViewType__OclElement /* 1 */,
				Fragments._EAssemblyViewType__EViewType /* 2 */,
				Fragments._EAssemblyViewType__EAssemblyViewType /* 3 */
			};
		private static final int /*@NonNull*/ [] __EAssemblyViewType = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EBehaviourDescription =
			{
				Fragments._EBehaviourDescription__OclAny /* 0 */,
				Fragments._EBehaviourDescription__OclElement /* 1 */,
				Fragments._EBehaviourDescription__EBehaviourDescription /* 2 */
			};
		private static final int /*@NonNull*/ [] __EBehaviourDescription = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EBranch =
			{
				Fragments._EBranch__OclAny /* 0 */,
				Fragments._EBranch__OclElement /* 1 */,
				Fragments._EBranch__EBranch /* 2 */
			};
		private static final int /*@NonNull*/ [] __EBranch = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EComponent =
			{
				Fragments._EComponent__OclAny /* 0 */,
				Fragments._EComponent__OclElement /* 1 */,
				Fragments._EComponent__EComponent /* 2 */
			};
		private static final int /*@NonNull*/ [] __EComponent = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ECompositeComponent =
			{
				Fragments._ECompositeComponent__OclAny /* 0 */,
				Fragments._ECompositeComponent__OclElement /* 1 */,
				Fragments._ECompositeComponent__EComponent /* 2 */,
				Fragments._ECompositeComponent__ECompositeComponent /* 3 */
			};
		private static final int /*@NonNull*/ [] __ECompositeComponent = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EContainer =
			{
				Fragments._EContainer__OclAny /* 0 */,
				Fragments._EContainer__OclElement /* 1 */,
				Fragments._EContainer__EContainer /* 2 */
			};
		private static final int /*@NonNull*/ [] __EContainer = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EDelegationConnector =
			{
				Fragments._EDelegationConnector__OclAny /* 0 */,
				Fragments._EDelegationConnector__OclElement /* 1 */,
				Fragments._EDelegationConnector__EDelegationConnector /* 2 */
			};
		private static final int /*@NonNull*/ [] __EDelegationConnector = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EDeploymentViewPoint =
			{
				Fragments._EDeploymentViewPoint__OclAny /* 0 */,
				Fragments._EDeploymentViewPoint__OclElement /* 1 */,
				Fragments._EDeploymentViewPoint__EViewPoint /* 2 */,
				Fragments._EDeploymentViewPoint__EDeploymentViewPoint /* 3 */
			};
		private static final int /*@NonNull*/ [] __EDeploymentViewPoint = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EEnvironmentViewType =
			{
				Fragments._EEnvironmentViewType__OclAny /* 0 */,
				Fragments._EEnvironmentViewType__OclElement /* 1 */,
				Fragments._EEnvironmentViewType__EViewType /* 2 */,
				Fragments._EEnvironmentViewType__EEnvironmentViewType /* 3 */
			};
		private static final int /*@NonNull*/ [] __EEnvironmentViewType = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EExternalCall =
			{
				Fragments._EExternalCall__OclAny /* 0 */,
				Fragments._EExternalCall__OclElement /* 1 */,
				Fragments._EExternalCall__EExternalCall /* 2 */
			};
		private static final int /*@NonNull*/ [] __EExternalCall = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EInterface =
			{
				Fragments._EInterface__OclAny /* 0 */,
				Fragments._EInterface__OclElement /* 1 */,
				Fragments._EInterface__EInterface /* 2 */
			};
		private static final int /*@NonNull*/ [] __EInterface = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EInternalAction =
			{
				Fragments._EInternalAction__OclAny /* 0 */,
				Fragments._EInternalAction__OclElement /* 1 */,
				Fragments._EInternalAction__EInternalAction /* 2 */
			};
		private static final int /*@NonNull*/ [] __EInternalAction = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ELink =
			{
				Fragments._ELink__OclAny /* 0 */,
				Fragments._ELink__OclElement /* 1 */,
				Fragments._ELink__ELink /* 2 */
			};
		private static final int /*@NonNull*/ [] __ELink = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ELoop =
			{
				Fragments._ELoop__OclAny /* 0 */,
				Fragments._ELoop__OclElement /* 1 */,
				Fragments._ELoop__ELoop /* 2 */
			};
		private static final int /*@NonNull*/ [] __ELoop = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EParameter =
			{
				Fragments._EParameter__OclAny /* 0 */,
				Fragments._EParameter__OclElement /* 1 */,
				Fragments._EParameter__EParameter /* 2 */
			};
		private static final int /*@NonNull*/ [] __EParameter = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EProvidedDelegationConnector =
			{
				Fragments._EProvidedDelegationConnector__OclAny /* 0 */,
				Fragments._EProvidedDelegationConnector__OclElement /* 1 */,
				Fragments._EProvidedDelegationConnector__EDelegationConnector /* 2 */,
				Fragments._EProvidedDelegationConnector__EProvidedDelegationConnector /* 3 */
			};
		private static final int /*@NonNull*/ [] __EProvidedDelegationConnector = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EProvidedRole =
			{
				Fragments._EProvidedRole__OclAny /* 0 */,
				Fragments._EProvidedRole__OclElement /* 1 */,
				Fragments._EProvidedRole__ERole /* 2 */,
				Fragments._EProvidedRole__EProvidedRole /* 3 */
			};
		private static final int /*@NonNull*/ [] __EProvidedRole = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ERepository =
			{
				Fragments._ERepository__OclAny /* 0 */,
				Fragments._ERepository__OclElement /* 1 */,
				Fragments._ERepository__ERepository /* 2 */
			};
		private static final int /*@NonNull*/ [] __ERepository = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ERepositoryViewType =
			{
				Fragments._ERepositoryViewType__OclAny /* 0 */,
				Fragments._ERepositoryViewType__OclElement /* 1 */,
				Fragments._ERepositoryViewType__EViewType /* 2 */,
				Fragments._ERepositoryViewType__ERepositoryViewType /* 3 */
			};
		private static final int /*@NonNull*/ [] __ERepositoryViewType = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ERequiredDelegationConnector =
			{
				Fragments._ERequiredDelegationConnector__OclAny /* 0 */,
				Fragments._ERequiredDelegationConnector__OclElement /* 1 */,
				Fragments._ERequiredDelegationConnector__EDelegationConnector /* 2 */,
				Fragments._ERequiredDelegationConnector__ERequiredDelegationConnector /* 3 */
			};
		private static final int /*@NonNull*/ [] __ERequiredDelegationConnector = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ERequiredRole =
			{
				Fragments._ERequiredRole__OclAny /* 0 */,
				Fragments._ERequiredRole__OclElement /* 1 */,
				Fragments._ERequiredRole__ERole /* 2 */,
				Fragments._ERequiredRole__ERequiredRole /* 3 */
			};
		private static final int /*@NonNull*/ [] __ERequiredRole = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ERole =
			{
				Fragments._ERole__OclAny /* 0 */,
				Fragments._ERole__OclElement /* 1 */,
				Fragments._ERole__ERole /* 2 */
			};
		private static final int /*@NonNull*/ [] __ERole = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EService =
			{
				Fragments._EService__OclAny /* 0 */,
				Fragments._EService__OclElement /* 1 */,
				Fragments._EService__EService /* 2 */
			};
		private static final int /*@NonNull*/ [] __EService = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ESignature =
			{
				Fragments._ESignature__OclAny /* 0 */,
				Fragments._ESignature__OclElement /* 1 */,
				Fragments._ESignature__ESignature /* 2 */
			};
		private static final int /*@NonNull*/ [] __ESignature = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ESystem =
			{
				Fragments._ESystem__OclAny /* 0 */,
				Fragments._ESystem__OclElement /* 1 */,
				Fragments._ESystem__ESystem /* 2 */
			};
		private static final int /*@NonNull*/ [] __ESystem = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ESystemIndependentViewPoint =
			{
				Fragments._ESystemIndependentViewPoint__OclAny /* 0 */,
				Fragments._ESystemIndependentViewPoint__OclElement /* 1 */,
				Fragments._ESystemIndependentViewPoint__EViewPoint /* 2 */,
				Fragments._ESystemIndependentViewPoint__ESystemIndependentViewPoint /* 3 */
			};
		private static final int /*@NonNull*/ [] __ESystemIndependentViewPoint = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EViewPoint =
			{
				Fragments._EViewPoint__OclAny /* 0 */,
				Fragments._EViewPoint__OclElement /* 1 */,
				Fragments._EViewPoint__EViewPoint /* 2 */
			};
		private static final int /*@NonNull*/ [] __EViewPoint = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EViewType =
			{
				Fragments._EViewType__OclAny /* 0 */,
				Fragments._EViewType__OclElement /* 1 */,
				Fragments._EViewType__EViewType /* 2 */
			};
		private static final int /*@NonNull*/ [] __EViewType = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EVoid =
			{
				Fragments._EVoid__OclAny /* 0 */,
				Fragments._EVoid__EVoid /* 1 */
			};
		private static final int /*@NonNull*/ [] __EVoid = { 1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PossibleParameterTypes =
			{
				Fragments._PossibleParameterTypes__OclAny /* 0 */,
				Fragments._PossibleParameterTypes__OclElement /* 1 */,
				Fragments._PossibleParameterTypes__OclType /* 2 */,
				Fragments._PossibleParameterTypes__OclEnumeration /* 3 */,
				Fragments._PossibleParameterTypes__PossibleParameterTypes /* 4 */
			};
		private static final int /*@NonNull*/ [] __PossibleParameterTypes = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _PossibleReturnTypes =
			{
				Fragments._PossibleReturnTypes__OclAny /* 0 */,
				Fragments._PossibleReturnTypes__OclElement /* 1 */,
				Fragments._PossibleReturnTypes__OclType /* 2 */,
				Fragments._PossibleReturnTypes__OclEnumeration /* 3 */,
				Fragments._PossibleReturnTypes__PossibleReturnTypes /* 4 */
			};
		private static final int /*@NonNull*/ [] __PossibleReturnTypes = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._EAllocationContext.initFragments(_EAllocationContext, __EAllocationContext);
			Types._EAllocationViewType.initFragments(_EAllocationViewType, __EAllocationViewType);
			Types._EAssemblyConnector.initFragments(_EAssemblyConnector, __EAssemblyConnector);
			Types._EAssemblyContext.initFragments(_EAssemblyContext, __EAssemblyContext);
			Types._EAssemblyViewPoint.initFragments(_EAssemblyViewPoint, __EAssemblyViewPoint);
			Types._EAssemblyViewType.initFragments(_EAssemblyViewType, __EAssemblyViewType);
			Types._EBehaviourDescription.initFragments(_EBehaviourDescription, __EBehaviourDescription);
			Types._EBranch.initFragments(_EBranch, __EBranch);
			Types._EComponent.initFragments(_EComponent, __EComponent);
			Types._ECompositeComponent.initFragments(_ECompositeComponent, __ECompositeComponent);
			Types._EContainer.initFragments(_EContainer, __EContainer);
			Types._EDelegationConnector.initFragments(_EDelegationConnector, __EDelegationConnector);
			Types._EDeploymentViewPoint.initFragments(_EDeploymentViewPoint, __EDeploymentViewPoint);
			Types._EEnvironmentViewType.initFragments(_EEnvironmentViewType, __EEnvironmentViewType);
			Types._EExternalCall.initFragments(_EExternalCall, __EExternalCall);
			Types._EInterface.initFragments(_EInterface, __EInterface);
			Types._EInternalAction.initFragments(_EInternalAction, __EInternalAction);
			Types._ELink.initFragments(_ELink, __ELink);
			Types._ELoop.initFragments(_ELoop, __ELoop);
			Types._EParameter.initFragments(_EParameter, __EParameter);
			Types._EProvidedDelegationConnector.initFragments(_EProvidedDelegationConnector, __EProvidedDelegationConnector);
			Types._EProvidedRole.initFragments(_EProvidedRole, __EProvidedRole);
			Types._ERepository.initFragments(_ERepository, __ERepository);
			Types._ERepositoryViewType.initFragments(_ERepositoryViewType, __ERepositoryViewType);
			Types._ERequiredDelegationConnector.initFragments(_ERequiredDelegationConnector, __ERequiredDelegationConnector);
			Types._ERequiredRole.initFragments(_ERequiredRole, __ERequiredRole);
			Types._ERole.initFragments(_ERole, __ERole);
			Types._EService.initFragments(_EService, __EService);
			Types._ESignature.initFragments(_ESignature, __ESignature);
			Types._ESystem.initFragments(_ESystem, __ESystem);
			Types._ESystemIndependentViewPoint.initFragments(_ESystemIndependentViewPoint, __ESystemIndependentViewPoint);
			Types._EViewPoint.initFragments(_EViewPoint, __EViewPoint);
			Types._EViewType.initFragments(_EViewType, __EViewType);
			Types._EVoid.initFragments(_EVoid, __EVoid);
			Types._PossibleParameterTypes.initFragments(_PossibleParameterTypes, __PossibleParameterTypes);
			Types._PossibleReturnTypes.initFragments(_PossibleReturnTypes, __PossibleReturnTypes);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Component_basedTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _EAllocationContext__EAllocationContext = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EAllocationContext__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EAllocationContext__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EAllocationViewType__EAllocationViewType = {
			Component_basedTables.Operations._EAllocationViewType__showComponentAllocations /* showComponentAllocations() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EAllocationViewType__EViewType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EAllocationViewType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EAllocationViewType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EAssemblyConnector__EAssemblyConnector = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EAssemblyConnector__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EAssemblyConnector__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EAssemblyContext__EAssemblyContext = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EAssemblyContext__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EAssemblyContext__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EAssemblyViewPoint__EAssemblyViewPoint = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EAssemblyViewPoint__EViewPoint = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EAssemblyViewPoint__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EAssemblyViewPoint__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EAssemblyViewType__EAssemblyViewType = {
			Component_basedTables.Operations._EAssemblyViewType__showComponentConnections /* showComponentConnections() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EAssemblyViewType__EViewType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EAssemblyViewType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EAssemblyViewType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EBehaviourDescription__EBehaviourDescription = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EBehaviourDescription__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EBehaviourDescription__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EBranch__EBranch = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EBranch__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EBranch__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EComponent__EComponent = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EComponent__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EComponent__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ECompositeComponent__ECompositeComponent = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ECompositeComponent__EComponent = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ECompositeComponent__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ECompositeComponent__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EContainer__EContainer = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EContainer__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EContainer__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EDelegationConnector__EDelegationConnector = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EDelegationConnector__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EDelegationConnector__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EDeploymentViewPoint__EDeploymentViewPoint = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EDeploymentViewPoint__EViewPoint = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EDeploymentViewPoint__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EDeploymentViewPoint__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EEnvironmentViewType__EEnvironmentViewType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EEnvironmentViewType__EViewType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EEnvironmentViewType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EEnvironmentViewType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EExternalCall__EExternalCall = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EExternalCall__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EExternalCall__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EInterface__EInterface = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EInterface__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EInterface__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EInternalAction__EInternalAction = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EInternalAction__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EInternalAction__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ELink__ELink = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ELink__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ELink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ELoop__ELoop = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ELoop__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ELoop__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EParameter__EParameter = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EParameter__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EParameter__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EProvidedDelegationConnector__EProvidedDelegationConnector = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EProvidedDelegationConnector__EDelegationConnector = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EProvidedDelegationConnector__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EProvidedDelegationConnector__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EProvidedRole__EProvidedRole = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EProvidedRole__ERole = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EProvidedRole__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EProvidedRole__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ERepository__ERepository = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ERepository__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ERepository__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ERepositoryViewType__ERepositoryViewType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ERepositoryViewType__EViewType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ERepositoryViewType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ERepositoryViewType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ERequiredDelegationConnector__ERequiredDelegationConnector = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ERequiredDelegationConnector__EDelegationConnector = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ERequiredDelegationConnector__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ERequiredDelegationConnector__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ERequiredRole__ERequiredRole = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ERequiredRole__ERole = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ERequiredRole__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ERequiredRole__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ERole__ERole = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ERole__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ERole__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EService__EService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EService__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EService__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ESignature__ESignature = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ESignature__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ESignature__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ESystem__ESystem = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ESystem__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ESystem__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ESystemIndependentViewPoint__ESystemIndependentViewPoint = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ESystemIndependentViewPoint__EViewPoint = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ESystemIndependentViewPoint__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ESystemIndependentViewPoint__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EViewPoint__EViewPoint = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EViewPoint__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EViewPoint__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EViewType__EViewType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EViewType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EViewType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EVoid__EVoid = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EVoid__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PossibleParameterTypes__PossibleParameterTypes = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PossibleParameterTypes__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PossibleParameterTypes__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PossibleParameterTypes__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PossibleParameterTypes__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _PossibleReturnTypes__PossibleReturnTypes = {};
		private static final ExecutorOperation /*@NonNull*/ [] _PossibleReturnTypes__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PossibleReturnTypes__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PossibleReturnTypes__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _PossibleReturnTypes__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._EAllocationContext__EAllocationContext.initOperations(_EAllocationContext__EAllocationContext);
			Fragments._EAllocationContext__OclAny.initOperations(_EAllocationContext__OclAny);
			Fragments._EAllocationContext__OclElement.initOperations(_EAllocationContext__OclElement);

			Fragments._EAllocationViewType__EAllocationViewType.initOperations(_EAllocationViewType__EAllocationViewType);
			Fragments._EAllocationViewType__EViewType.initOperations(_EAllocationViewType__EViewType);
			Fragments._EAllocationViewType__OclAny.initOperations(_EAllocationViewType__OclAny);
			Fragments._EAllocationViewType__OclElement.initOperations(_EAllocationViewType__OclElement);

			Fragments._EAssemblyConnector__EAssemblyConnector.initOperations(_EAssemblyConnector__EAssemblyConnector);
			Fragments._EAssemblyConnector__OclAny.initOperations(_EAssemblyConnector__OclAny);
			Fragments._EAssemblyConnector__OclElement.initOperations(_EAssemblyConnector__OclElement);

			Fragments._EAssemblyContext__EAssemblyContext.initOperations(_EAssemblyContext__EAssemblyContext);
			Fragments._EAssemblyContext__OclAny.initOperations(_EAssemblyContext__OclAny);
			Fragments._EAssemblyContext__OclElement.initOperations(_EAssemblyContext__OclElement);

			Fragments._EAssemblyViewPoint__EAssemblyViewPoint.initOperations(_EAssemblyViewPoint__EAssemblyViewPoint);
			Fragments._EAssemblyViewPoint__EViewPoint.initOperations(_EAssemblyViewPoint__EViewPoint);
			Fragments._EAssemblyViewPoint__OclAny.initOperations(_EAssemblyViewPoint__OclAny);
			Fragments._EAssemblyViewPoint__OclElement.initOperations(_EAssemblyViewPoint__OclElement);

			Fragments._EAssemblyViewType__EAssemblyViewType.initOperations(_EAssemblyViewType__EAssemblyViewType);
			Fragments._EAssemblyViewType__EViewType.initOperations(_EAssemblyViewType__EViewType);
			Fragments._EAssemblyViewType__OclAny.initOperations(_EAssemblyViewType__OclAny);
			Fragments._EAssemblyViewType__OclElement.initOperations(_EAssemblyViewType__OclElement);

			Fragments._EBehaviourDescription__EBehaviourDescription.initOperations(_EBehaviourDescription__EBehaviourDescription);
			Fragments._EBehaviourDescription__OclAny.initOperations(_EBehaviourDescription__OclAny);
			Fragments._EBehaviourDescription__OclElement.initOperations(_EBehaviourDescription__OclElement);

			Fragments._EBranch__EBranch.initOperations(_EBranch__EBranch);
			Fragments._EBranch__OclAny.initOperations(_EBranch__OclAny);
			Fragments._EBranch__OclElement.initOperations(_EBranch__OclElement);

			Fragments._EComponent__EComponent.initOperations(_EComponent__EComponent);
			Fragments._EComponent__OclAny.initOperations(_EComponent__OclAny);
			Fragments._EComponent__OclElement.initOperations(_EComponent__OclElement);

			Fragments._ECompositeComponent__EComponent.initOperations(_ECompositeComponent__EComponent);
			Fragments._ECompositeComponent__ECompositeComponent.initOperations(_ECompositeComponent__ECompositeComponent);
			Fragments._ECompositeComponent__OclAny.initOperations(_ECompositeComponent__OclAny);
			Fragments._ECompositeComponent__OclElement.initOperations(_ECompositeComponent__OclElement);

			Fragments._EContainer__EContainer.initOperations(_EContainer__EContainer);
			Fragments._EContainer__OclAny.initOperations(_EContainer__OclAny);
			Fragments._EContainer__OclElement.initOperations(_EContainer__OclElement);

			Fragments._EDelegationConnector__EDelegationConnector.initOperations(_EDelegationConnector__EDelegationConnector);
			Fragments._EDelegationConnector__OclAny.initOperations(_EDelegationConnector__OclAny);
			Fragments._EDelegationConnector__OclElement.initOperations(_EDelegationConnector__OclElement);

			Fragments._EDeploymentViewPoint__EDeploymentViewPoint.initOperations(_EDeploymentViewPoint__EDeploymentViewPoint);
			Fragments._EDeploymentViewPoint__EViewPoint.initOperations(_EDeploymentViewPoint__EViewPoint);
			Fragments._EDeploymentViewPoint__OclAny.initOperations(_EDeploymentViewPoint__OclAny);
			Fragments._EDeploymentViewPoint__OclElement.initOperations(_EDeploymentViewPoint__OclElement);

			Fragments._EEnvironmentViewType__EEnvironmentViewType.initOperations(_EEnvironmentViewType__EEnvironmentViewType);
			Fragments._EEnvironmentViewType__EViewType.initOperations(_EEnvironmentViewType__EViewType);
			Fragments._EEnvironmentViewType__OclAny.initOperations(_EEnvironmentViewType__OclAny);
			Fragments._EEnvironmentViewType__OclElement.initOperations(_EEnvironmentViewType__OclElement);

			Fragments._EExternalCall__EExternalCall.initOperations(_EExternalCall__EExternalCall);
			Fragments._EExternalCall__OclAny.initOperations(_EExternalCall__OclAny);
			Fragments._EExternalCall__OclElement.initOperations(_EExternalCall__OclElement);

			Fragments._EInterface__EInterface.initOperations(_EInterface__EInterface);
			Fragments._EInterface__OclAny.initOperations(_EInterface__OclAny);
			Fragments._EInterface__OclElement.initOperations(_EInterface__OclElement);

			Fragments._EInternalAction__EInternalAction.initOperations(_EInternalAction__EInternalAction);
			Fragments._EInternalAction__OclAny.initOperations(_EInternalAction__OclAny);
			Fragments._EInternalAction__OclElement.initOperations(_EInternalAction__OclElement);

			Fragments._ELink__ELink.initOperations(_ELink__ELink);
			Fragments._ELink__OclAny.initOperations(_ELink__OclAny);
			Fragments._ELink__OclElement.initOperations(_ELink__OclElement);

			Fragments._ELoop__ELoop.initOperations(_ELoop__ELoop);
			Fragments._ELoop__OclAny.initOperations(_ELoop__OclAny);
			Fragments._ELoop__OclElement.initOperations(_ELoop__OclElement);

			Fragments._EParameter__EParameter.initOperations(_EParameter__EParameter);
			Fragments._EParameter__OclAny.initOperations(_EParameter__OclAny);
			Fragments._EParameter__OclElement.initOperations(_EParameter__OclElement);

			Fragments._EProvidedDelegationConnector__EDelegationConnector.initOperations(_EProvidedDelegationConnector__EDelegationConnector);
			Fragments._EProvidedDelegationConnector__EProvidedDelegationConnector.initOperations(_EProvidedDelegationConnector__EProvidedDelegationConnector);
			Fragments._EProvidedDelegationConnector__OclAny.initOperations(_EProvidedDelegationConnector__OclAny);
			Fragments._EProvidedDelegationConnector__OclElement.initOperations(_EProvidedDelegationConnector__OclElement);

			Fragments._EProvidedRole__EProvidedRole.initOperations(_EProvidedRole__EProvidedRole);
			Fragments._EProvidedRole__ERole.initOperations(_EProvidedRole__ERole);
			Fragments._EProvidedRole__OclAny.initOperations(_EProvidedRole__OclAny);
			Fragments._EProvidedRole__OclElement.initOperations(_EProvidedRole__OclElement);

			Fragments._ERepository__ERepository.initOperations(_ERepository__ERepository);
			Fragments._ERepository__OclAny.initOperations(_ERepository__OclAny);
			Fragments._ERepository__OclElement.initOperations(_ERepository__OclElement);

			Fragments._ERepositoryViewType__ERepositoryViewType.initOperations(_ERepositoryViewType__ERepositoryViewType);
			Fragments._ERepositoryViewType__EViewType.initOperations(_ERepositoryViewType__EViewType);
			Fragments._ERepositoryViewType__OclAny.initOperations(_ERepositoryViewType__OclAny);
			Fragments._ERepositoryViewType__OclElement.initOperations(_ERepositoryViewType__OclElement);

			Fragments._ERequiredDelegationConnector__EDelegationConnector.initOperations(_ERequiredDelegationConnector__EDelegationConnector);
			Fragments._ERequiredDelegationConnector__ERequiredDelegationConnector.initOperations(_ERequiredDelegationConnector__ERequiredDelegationConnector);
			Fragments._ERequiredDelegationConnector__OclAny.initOperations(_ERequiredDelegationConnector__OclAny);
			Fragments._ERequiredDelegationConnector__OclElement.initOperations(_ERequiredDelegationConnector__OclElement);

			Fragments._ERequiredRole__ERequiredRole.initOperations(_ERequiredRole__ERequiredRole);
			Fragments._ERequiredRole__ERole.initOperations(_ERequiredRole__ERole);
			Fragments._ERequiredRole__OclAny.initOperations(_ERequiredRole__OclAny);
			Fragments._ERequiredRole__OclElement.initOperations(_ERequiredRole__OclElement);

			Fragments._ERole__ERole.initOperations(_ERole__ERole);
			Fragments._ERole__OclAny.initOperations(_ERole__OclAny);
			Fragments._ERole__OclElement.initOperations(_ERole__OclElement);

			Fragments._EService__EService.initOperations(_EService__EService);
			Fragments._EService__OclAny.initOperations(_EService__OclAny);
			Fragments._EService__OclElement.initOperations(_EService__OclElement);

			Fragments._ESignature__ESignature.initOperations(_ESignature__ESignature);
			Fragments._ESignature__OclAny.initOperations(_ESignature__OclAny);
			Fragments._ESignature__OclElement.initOperations(_ESignature__OclElement);

			Fragments._ESystem__ESystem.initOperations(_ESystem__ESystem);
			Fragments._ESystem__OclAny.initOperations(_ESystem__OclAny);
			Fragments._ESystem__OclElement.initOperations(_ESystem__OclElement);

			Fragments._ESystemIndependentViewPoint__ESystemIndependentViewPoint.initOperations(_ESystemIndependentViewPoint__ESystemIndependentViewPoint);
			Fragments._ESystemIndependentViewPoint__EViewPoint.initOperations(_ESystemIndependentViewPoint__EViewPoint);
			Fragments._ESystemIndependentViewPoint__OclAny.initOperations(_ESystemIndependentViewPoint__OclAny);
			Fragments._ESystemIndependentViewPoint__OclElement.initOperations(_ESystemIndependentViewPoint__OclElement);

			Fragments._EViewPoint__EViewPoint.initOperations(_EViewPoint__EViewPoint);
			Fragments._EViewPoint__OclAny.initOperations(_EViewPoint__OclAny);
			Fragments._EViewPoint__OclElement.initOperations(_EViewPoint__OclElement);

			Fragments._EViewType__EViewType.initOperations(_EViewType__EViewType);
			Fragments._EViewType__OclAny.initOperations(_EViewType__OclAny);
			Fragments._EViewType__OclElement.initOperations(_EViewType__OclElement);

			Fragments._EVoid__EVoid.initOperations(_EVoid__EVoid);
			Fragments._EVoid__OclAny.initOperations(_EVoid__OclAny);

			Fragments._PossibleParameterTypes__OclAny.initOperations(_PossibleParameterTypes__OclAny);
			Fragments._PossibleParameterTypes__OclElement.initOperations(_PossibleParameterTypes__OclElement);
			Fragments._PossibleParameterTypes__OclEnumeration.initOperations(_PossibleParameterTypes__OclEnumeration);
			Fragments._PossibleParameterTypes__OclType.initOperations(_PossibleParameterTypes__OclType);
			Fragments._PossibleParameterTypes__PossibleParameterTypes.initOperations(_PossibleParameterTypes__PossibleParameterTypes);

			Fragments._PossibleReturnTypes__OclAny.initOperations(_PossibleReturnTypes__OclAny);
			Fragments._PossibleReturnTypes__OclElement.initOperations(_PossibleReturnTypes__OclElement);
			Fragments._PossibleReturnTypes__OclEnumeration.initOperations(_PossibleReturnTypes__OclEnumeration);
			Fragments._PossibleReturnTypes__OclType.initOperations(_PossibleReturnTypes__OclType);
			Fragments._PossibleReturnTypes__PossibleReturnTypes.initOperations(_PossibleReturnTypes__PossibleReturnTypes);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Component_basedTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _EAllocationContext = {
			Component_basedTables.Properties._EAllocationContext__controls,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Component_basedTables.Properties._EAllocationContext__specifies,
			Component_basedTables.Properties._EAllocationContext__specifiesFor
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EAllocationViewType = {
			Component_basedTables.Properties._EAllocationViewType__includes,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EAssemblyConnector = {
			Component_basedTables.Properties._EAssemblyConnector__linkFrom,
			Component_basedTables.Properties._EAssemblyConnector__linkTo,
			Component_basedTables.Properties._EAssemblyConnector__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EAssemblyContext = {
			Component_basedTables.Properties._EAssemblyContext__allocated,
			Component_basedTables.Properties._EAssemblyContext__encapsulatedByComponent,
			Component_basedTables.Properties._EAssemblyContext__encapsulatedBySystem,
			Component_basedTables.Properties._EAssemblyContext__instantiates,
			Component_basedTables.Properties._EAssemblyContext__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Component_basedTables.Properties._EAssemblyContext__roles
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EAssemblyViewPoint = {
			Component_basedTables.Properties._EAssemblyViewPoint__assemblyViewType,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EAssemblyViewType = {
			Component_basedTables.Properties._EAssemblyViewType__mainArtifacts,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Component_basedTables.Properties._EAssemblyViewType__showsComponents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EBehaviourDescription = {
			Component_basedTables.Properties._EBehaviourDescription__branch,
			Component_basedTables.Properties._EBehaviourDescription__externalCall,
			Component_basedTables.Properties._EBehaviourDescription__internalAction,
			Component_basedTables.Properties._EBehaviourDescription__loop,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EBranch = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EComponent = {
			Component_basedTables.Properties._EComponent__behaviourDescription,
			Component_basedTables.Properties._EComponent__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Component_basedTables.Properties._EComponent__provides,
			Component_basedTables.Properties._EComponent__providesDirectly,
			Component_basedTables.Properties._EComponent__providesInterfaceTo,
			Component_basedTables.Properties._EComponent__requires,
			Component_basedTables.Properties._EComponent__usesInterfaceFrom
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ECompositeComponent = {
			Component_basedTables.Properties._EComponent__behaviourDescription,
			Component_basedTables.Properties._ECompositeComponent__encapsulates,
			Component_basedTables.Properties._EComponent__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Component_basedTables.Properties._EComponent__provides,
			Component_basedTables.Properties._EComponent__providesDirectly,
			Component_basedTables.Properties._EComponent__providesInterfaceTo,
			Component_basedTables.Properties._EComponent__requires,
			Component_basedTables.Properties._EComponent__usesInterfaceFrom
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EContainer = {
			Component_basedTables.Properties._EContainer__connectedTo,
			Component_basedTables.Properties._EContainer__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EDelegationConnector = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EDeploymentViewPoint = {
			Component_basedTables.Properties._EDeploymentViewPoint__allocationViewType,
			Component_basedTables.Properties._EDeploymentViewPoint__environmentViewType,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EEnvironmentViewType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Component_basedTables.Properties._EEnvironmentViewType__showsContainers,
			Component_basedTables.Properties._EEnvironmentViewType__showsLinks
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EExternalCall = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Component_basedTables.Properties._EExternalCall__to
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EInterface = {
			Component_basedTables.Properties._EInterface__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Component_basedTables.Properties._EInterface__providedByComponent,
			Component_basedTables.Properties._EInterface__providedBySystem,
			Component_basedTables.Properties._EInterface__requiredByComponent,
			Component_basedTables.Properties._EInterface__requiredBySystem,
			Component_basedTables.Properties._EInterface__resultsIn,
			Component_basedTables.Properties._EInterface__signature
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EInternalAction = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ELink = {
			Component_basedTables.Properties._ELink__connects,
			Component_basedTables.Properties._ELink__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ELoop = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EParameter = {
			Component_basedTables.Properties._EParameter__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Component_basedTables.Properties._EParameter__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EProvidedDelegationConnector = {
			Component_basedTables.Properties._EProvidedDelegationConnector__linkFrom,
			Component_basedTables.Properties._EProvidedDelegationConnector__linkTo,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EProvidedRole = {
			Component_basedTables.Properties._EProvidedRole__linkedFrom,
			Component_basedTables.Properties._EProvidedRole__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Component_basedTables.Properties._ERole__roleOf
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ERepository = {
			Component_basedTables.Properties._ERepository__component,
			Component_basedTables.Properties._ERepository__interface,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ERepositoryViewType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Component_basedTables.Properties._ERepositoryViewType__showsComponents,
			Component_basedTables.Properties._ERepositoryViewType__showsInterfaces
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ERequiredDelegationConnector = {
			Component_basedTables.Properties._ERequiredDelegationConnector__linkFrom,
			Component_basedTables.Properties._ERequiredDelegationConnector__linkTo,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ERequiredRole = {
			Component_basedTables.Properties._ERequiredRole__linkedTo,
			Component_basedTables.Properties._ERequiredRole__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Component_basedTables.Properties._ERole__roleOf
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ERole = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Component_basedTables.Properties._ERole__roleOf
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EService = {
			Component_basedTables.Properties._EService__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ESignature = {
			Component_basedTables.Properties._ESignature__correspondsTo,
			Component_basedTables.Properties._ESignature__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Component_basedTables.Properties._ESignature__parameter,
			Component_basedTables.Properties._ESignature__returnType
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ESystem = {
			Component_basedTables.Properties._ESystem__containsContainers,
			Component_basedTables.Properties._ESystem__containsRepos,
			Component_basedTables.Properties._ESystem__encapsulates,
			Component_basedTables.Properties._ESystem__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Component_basedTables.Properties._ESystem__provides,
			Component_basedTables.Properties._ESystem__requires
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ESystemIndependentViewPoint = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Component_basedTables.Properties._ESystemIndependentViewPoint__repositoryViewType
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EViewPoint = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EViewType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EVoid = {};

		private static final ExecutorProperty /*@NonNull*/ [] _PossibleParameterTypes = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _PossibleReturnTypes = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._EAllocationContext__EAllocationContext.initProperties(_EAllocationContext);
			Fragments._EAllocationViewType__EAllocationViewType.initProperties(_EAllocationViewType);
			Fragments._EAssemblyConnector__EAssemblyConnector.initProperties(_EAssemblyConnector);
			Fragments._EAssemblyContext__EAssemblyContext.initProperties(_EAssemblyContext);
			Fragments._EAssemblyViewPoint__EAssemblyViewPoint.initProperties(_EAssemblyViewPoint);
			Fragments._EAssemblyViewType__EAssemblyViewType.initProperties(_EAssemblyViewType);
			Fragments._EBehaviourDescription__EBehaviourDescription.initProperties(_EBehaviourDescription);
			Fragments._EBranch__EBranch.initProperties(_EBranch);
			Fragments._EComponent__EComponent.initProperties(_EComponent);
			Fragments._ECompositeComponent__ECompositeComponent.initProperties(_ECompositeComponent);
			Fragments._EContainer__EContainer.initProperties(_EContainer);
			Fragments._EDelegationConnector__EDelegationConnector.initProperties(_EDelegationConnector);
			Fragments._EDeploymentViewPoint__EDeploymentViewPoint.initProperties(_EDeploymentViewPoint);
			Fragments._EEnvironmentViewType__EEnvironmentViewType.initProperties(_EEnvironmentViewType);
			Fragments._EExternalCall__EExternalCall.initProperties(_EExternalCall);
			Fragments._EInterface__EInterface.initProperties(_EInterface);
			Fragments._EInternalAction__EInternalAction.initProperties(_EInternalAction);
			Fragments._ELink__ELink.initProperties(_ELink);
			Fragments._ELoop__ELoop.initProperties(_ELoop);
			Fragments._EParameter__EParameter.initProperties(_EParameter);
			Fragments._EProvidedDelegationConnector__EProvidedDelegationConnector.initProperties(_EProvidedDelegationConnector);
			Fragments._EProvidedRole__EProvidedRole.initProperties(_EProvidedRole);
			Fragments._ERepository__ERepository.initProperties(_ERepository);
			Fragments._ERepositoryViewType__ERepositoryViewType.initProperties(_ERepositoryViewType);
			Fragments._ERequiredDelegationConnector__ERequiredDelegationConnector.initProperties(_ERequiredDelegationConnector);
			Fragments._ERequiredRole__ERequiredRole.initProperties(_ERequiredRole);
			Fragments._ERole__ERole.initProperties(_ERole);
			Fragments._EService__EService.initProperties(_EService);
			Fragments._ESignature__ESignature.initProperties(_ESignature);
			Fragments._ESystem__ESystem.initProperties(_ESystem);
			Fragments._ESystemIndependentViewPoint__ESystemIndependentViewPoint.initProperties(_ESystemIndependentViewPoint);
			Fragments._EViewPoint__EViewPoint.initProperties(_EViewPoint);
			Fragments._EViewType__EViewType.initProperties(_EViewType);
			Fragments._EVoid__EVoid.initProperties(_EVoid);
			Fragments._PossibleParameterTypes__PossibleParameterTypes.initProperties(_PossibleParameterTypes);
			Fragments._PossibleReturnTypes__PossibleReturnTypes.initProperties(_PossibleReturnTypes);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Component_basedTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _PossibleParameterTypes__BOOLEAN = new EcoreExecutorEnumerationLiteral(Component_basedPackage.Literals.POSSIBLE_PARAMETER_TYPES.getEEnumLiteral("BOOLEAN"), Types._PossibleParameterTypes, 0);
		public static final EcoreExecutorEnumerationLiteral _PossibleParameterTypes__CHAR = new EcoreExecutorEnumerationLiteral(Component_basedPackage.Literals.POSSIBLE_PARAMETER_TYPES.getEEnumLiteral("CHAR"), Types._PossibleParameterTypes, 1);
		public static final EcoreExecutorEnumerationLiteral _PossibleParameterTypes__DATE = new EcoreExecutorEnumerationLiteral(Component_basedPackage.Literals.POSSIBLE_PARAMETER_TYPES.getEEnumLiteral("DATE"), Types._PossibleParameterTypes, 2);
		public static final EcoreExecutorEnumerationLiteral _PossibleParameterTypes__DOUBLE = new EcoreExecutorEnumerationLiteral(Component_basedPackage.Literals.POSSIBLE_PARAMETER_TYPES.getEEnumLiteral("DOUBLE"), Types._PossibleParameterTypes, 3);
		public static final EcoreExecutorEnumerationLiteral _PossibleParameterTypes__FLOAT = new EcoreExecutorEnumerationLiteral(Component_basedPackage.Literals.POSSIBLE_PARAMETER_TYPES.getEEnumLiteral("FLOAT"), Types._PossibleParameterTypes, 4);
		public static final EcoreExecutorEnumerationLiteral _PossibleParameterTypes__LIST = new EcoreExecutorEnumerationLiteral(Component_basedPackage.Literals.POSSIBLE_PARAMETER_TYPES.getEEnumLiteral("LIST"), Types._PossibleParameterTypes, 5);
		public static final EcoreExecutorEnumerationLiteral _PossibleParameterTypes__INT = new EcoreExecutorEnumerationLiteral(Component_basedPackage.Literals.POSSIBLE_PARAMETER_TYPES.getEEnumLiteral("INT"), Types._PossibleParameterTypes, 6);
		public static final EcoreExecutorEnumerationLiteral _PossibleParameterTypes__LONG = new EcoreExecutorEnumerationLiteral(Component_basedPackage.Literals.POSSIBLE_PARAMETER_TYPES.getEEnumLiteral("LONG"), Types._PossibleParameterTypes, 7);
		public static final EcoreExecutorEnumerationLiteral _PossibleParameterTypes__MAP = new EcoreExecutorEnumerationLiteral(Component_basedPackage.Literals.POSSIBLE_PARAMETER_TYPES.getEEnumLiteral("MAP"), Types._PossibleParameterTypes, 8);
		public static final EcoreExecutorEnumerationLiteral _PossibleParameterTypes__STRING = new EcoreExecutorEnumerationLiteral(Component_basedPackage.Literals.POSSIBLE_PARAMETER_TYPES.getEEnumLiteral("STRING"), Types._PossibleParameterTypes, 9);
		public static final EcoreExecutorEnumerationLiteral _PossibleParameterTypes__EOBJECT = new EcoreExecutorEnumerationLiteral(Component_basedPackage.Literals.POSSIBLE_PARAMETER_TYPES.getEEnumLiteral("EOBJECT"), Types._PossibleParameterTypes, 10);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _PossibleParameterTypes = {
			_PossibleParameterTypes__BOOLEAN,
			_PossibleParameterTypes__CHAR,
			_PossibleParameterTypes__DATE,
			_PossibleParameterTypes__DOUBLE,
			_PossibleParameterTypes__FLOAT,
			_PossibleParameterTypes__LIST,
			_PossibleParameterTypes__INT,
			_PossibleParameterTypes__LONG,
			_PossibleParameterTypes__MAP,
			_PossibleParameterTypes__STRING,
			_PossibleParameterTypes__EOBJECT
		};

		public static final EcoreExecutorEnumerationLiteral _PossibleReturnTypes__BOOLEAN = new EcoreExecutorEnumerationLiteral(Component_basedPackage.Literals.POSSIBLE_RETURN_TYPES.getEEnumLiteral("BOOLEAN"), Types._PossibleReturnTypes, 0);
		public static final EcoreExecutorEnumerationLiteral _PossibleReturnTypes__CHAR = new EcoreExecutorEnumerationLiteral(Component_basedPackage.Literals.POSSIBLE_RETURN_TYPES.getEEnumLiteral("CHAR"), Types._PossibleReturnTypes, 1);
		public static final EcoreExecutorEnumerationLiteral _PossibleReturnTypes__DATE = new EcoreExecutorEnumerationLiteral(Component_basedPackage.Literals.POSSIBLE_RETURN_TYPES.getEEnumLiteral("DATE"), Types._PossibleReturnTypes, 2);
		public static final EcoreExecutorEnumerationLiteral _PossibleReturnTypes__DOUBLE = new EcoreExecutorEnumerationLiteral(Component_basedPackage.Literals.POSSIBLE_RETURN_TYPES.getEEnumLiteral("DOUBLE"), Types._PossibleReturnTypes, 3);
		public static final EcoreExecutorEnumerationLiteral _PossibleReturnTypes__FLOAT = new EcoreExecutorEnumerationLiteral(Component_basedPackage.Literals.POSSIBLE_RETURN_TYPES.getEEnumLiteral("FLOAT"), Types._PossibleReturnTypes, 4);
		public static final EcoreExecutorEnumerationLiteral _PossibleReturnTypes__LIST = new EcoreExecutorEnumerationLiteral(Component_basedPackage.Literals.POSSIBLE_RETURN_TYPES.getEEnumLiteral("LIST"), Types._PossibleReturnTypes, 5);
		public static final EcoreExecutorEnumerationLiteral _PossibleReturnTypes__INT = new EcoreExecutorEnumerationLiteral(Component_basedPackage.Literals.POSSIBLE_RETURN_TYPES.getEEnumLiteral("INT"), Types._PossibleReturnTypes, 6);
		public static final EcoreExecutorEnumerationLiteral _PossibleReturnTypes__LONG = new EcoreExecutorEnumerationLiteral(Component_basedPackage.Literals.POSSIBLE_RETURN_TYPES.getEEnumLiteral("LONG"), Types._PossibleReturnTypes, 7);
		public static final EcoreExecutorEnumerationLiteral _PossibleReturnTypes__MAP = new EcoreExecutorEnumerationLiteral(Component_basedPackage.Literals.POSSIBLE_RETURN_TYPES.getEEnumLiteral("MAP"), Types._PossibleReturnTypes, 8);
		public static final EcoreExecutorEnumerationLiteral _PossibleReturnTypes__STRING = new EcoreExecutorEnumerationLiteral(Component_basedPackage.Literals.POSSIBLE_RETURN_TYPES.getEEnumLiteral("STRING"), Types._PossibleReturnTypes, 9);
		public static final EcoreExecutorEnumerationLiteral _PossibleReturnTypes__VOID = new EcoreExecutorEnumerationLiteral(Component_basedPackage.Literals.POSSIBLE_RETURN_TYPES.getEEnumLiteral("VOID"), Types._PossibleReturnTypes, 10);
		public static final EcoreExecutorEnumerationLiteral _PossibleReturnTypes__EOBJECT = new EcoreExecutorEnumerationLiteral(Component_basedPackage.Literals.POSSIBLE_RETURN_TYPES.getEEnumLiteral("EOBJECT"), Types._PossibleReturnTypes, 11);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _PossibleReturnTypes = {
			_PossibleReturnTypes__BOOLEAN,
			_PossibleReturnTypes__CHAR,
			_PossibleReturnTypes__DATE,
			_PossibleReturnTypes__DOUBLE,
			_PossibleReturnTypes__FLOAT,
			_PossibleReturnTypes__LIST,
			_PossibleReturnTypes__INT,
			_PossibleReturnTypes__LONG,
			_PossibleReturnTypes__MAP,
			_PossibleReturnTypes__STRING,
			_PossibleReturnTypes__VOID,
			_PossibleReturnTypes__EOBJECT
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._PossibleParameterTypes.initLiterals(_PossibleParameterTypes);
			Types._PossibleReturnTypes.initLiterals(_PossibleReturnTypes);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Component_basedTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new Component_basedTables();
	}

	private Component_basedTables() {
		super(Component_basedPackage.eNS_URI);
	}
}
