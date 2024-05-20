/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 * using:
 *   /mdsd/model/component_based.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package mdsd.component_based.ViewPoint;

import mdsd.component_based.Component_basedPackage;
// import mdsd.component_based.ViewPoint.ViewPointTables;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;

/**
 * ViewPointTables provides the dispatch tables for the ViewPoint for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class ViewPointTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(ViewPointPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_component_based = IdManager.getNsURIPackageId("http://www.example.org/component_based", null, Component_basedPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_EAllocationViewType = ViewPointTables.PACKid_http_c_s_s_www_example_org_s_component_based.getClassId("EAllocationViewType", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_EAssemblyViewType = ViewPointTables.PACKid_http_c_s_s_www_example_org_s_component_based.getClassId("EAssemblyViewType", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_EEnvironmentViewType = ViewPointTables.PACKid_http_c_s_s_www_example_org_s_component_based.getClassId("EEnvironmentViewType", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ERepositoryViewType = ViewPointTables.PACKid_http_c_s_s_www_example_org_s_component_based.getClassId("ERepositoryViewType", 0);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			ViewPointTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ViewPointTables::TypeParameters and all preceding sub-packages.
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

		public static final EcoreExecutorType _EAssemblyViewPoint = new EcoreExecutorType(ViewPointPackage.Literals.EASSEMBLY_VIEW_POINT, PACKAGE, 0);
		public static final EcoreExecutorType _EDeploymentViewPoint = new EcoreExecutorType(ViewPointPackage.Literals.EDEPLOYMENT_VIEW_POINT, PACKAGE, 0);
		public static final EcoreExecutorType _ESystemIndependentViewPoint = new EcoreExecutorType(ViewPointPackage.Literals.ESYSTEM_INDEPENDENT_VIEW_POINT, PACKAGE, 0);
		public static final EcoreExecutorType _EViewPoint = new EcoreExecutorType(ViewPointPackage.Literals.EVIEW_POINT, PACKAGE, 0 | ExecutorType.ABSTRACT);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_EAssemblyViewPoint,
			_EDeploymentViewPoint,
			_ESystemIndependentViewPoint,
			_EViewPoint
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ViewPointTables::Types and all preceding sub-packages.
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

		private static final ExecutorFragment _EAssemblyViewPoint__EAssemblyViewPoint = new ExecutorFragment(Types._EAssemblyViewPoint, ViewPointTables.Types._EAssemblyViewPoint);
		private static final ExecutorFragment _EAssemblyViewPoint__EViewPoint = new ExecutorFragment(Types._EAssemblyViewPoint, ViewPointTables.Types._EViewPoint);
		private static final ExecutorFragment _EAssemblyViewPoint__OclAny = new ExecutorFragment(Types._EAssemblyViewPoint, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EAssemblyViewPoint__OclElement = new ExecutorFragment(Types._EAssemblyViewPoint, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EDeploymentViewPoint__EDeploymentViewPoint = new ExecutorFragment(Types._EDeploymentViewPoint, ViewPointTables.Types._EDeploymentViewPoint);
		private static final ExecutorFragment _EDeploymentViewPoint__EViewPoint = new ExecutorFragment(Types._EDeploymentViewPoint, ViewPointTables.Types._EViewPoint);
		private static final ExecutorFragment _EDeploymentViewPoint__OclAny = new ExecutorFragment(Types._EDeploymentViewPoint, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EDeploymentViewPoint__OclElement = new ExecutorFragment(Types._EDeploymentViewPoint, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ESystemIndependentViewPoint__ESystemIndependentViewPoint = new ExecutorFragment(Types._ESystemIndependentViewPoint, ViewPointTables.Types._ESystemIndependentViewPoint);
		private static final ExecutorFragment _ESystemIndependentViewPoint__EViewPoint = new ExecutorFragment(Types._ESystemIndependentViewPoint, ViewPointTables.Types._EViewPoint);
		private static final ExecutorFragment _ESystemIndependentViewPoint__OclAny = new ExecutorFragment(Types._ESystemIndependentViewPoint, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ESystemIndependentViewPoint__OclElement = new ExecutorFragment(Types._ESystemIndependentViewPoint, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EViewPoint__EViewPoint = new ExecutorFragment(Types._EViewPoint, ViewPointTables.Types._EViewPoint);
		private static final ExecutorFragment _EViewPoint__OclAny = new ExecutorFragment(Types._EViewPoint, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EViewPoint__OclElement = new ExecutorFragment(Types._EViewPoint, OCLstdlibTables.Types._OclElement);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ViewPointTables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of ViewPointTables::Parameters and all preceding sub-packages.
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

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ViewPointTables::Operations and all preceding sub-packages.
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

		public static final ExecutorProperty _EAssemblyViewPoint__assemblyviewtype = new EcoreExecutorProperty(ViewPointPackage.Literals.EASSEMBLY_VIEW_POINT__ASSEMBLYVIEWTYPE, Types._EAssemblyViewPoint, 0);

		public static final ExecutorProperty _EDeploymentViewPoint__allocationviewtype = new EcoreExecutorProperty(ViewPointPackage.Literals.EDEPLOYMENT_VIEW_POINT__ALLOCATIONVIEWTYPE, Types._EDeploymentViewPoint, 0);
		public static final ExecutorProperty _EDeploymentViewPoint__environmentviewtype = new EcoreExecutorProperty(ViewPointPackage.Literals.EDEPLOYMENT_VIEW_POINT__ENVIRONMENTVIEWTYPE, Types._EDeploymentViewPoint, 1);

		public static final ExecutorProperty _ESystemIndependentViewPoint__repositoryviewtype = new EcoreExecutorProperty(ViewPointPackage.Literals.ESYSTEM_INDEPENDENT_VIEW_POINT__REPOSITORYVIEWTYPE, Types._ESystemIndependentViewPoint, 0);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ViewPointTables::Properties and all preceding sub-packages.
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

		private static final ExecutorFragment /*@NonNull*/ [] _EAssemblyViewPoint =
			{
				Fragments._EAssemblyViewPoint__OclAny /* 0 */,
				Fragments._EAssemblyViewPoint__OclElement /* 1 */,
				Fragments._EAssemblyViewPoint__EViewPoint /* 2 */,
				Fragments._EAssemblyViewPoint__EAssemblyViewPoint /* 3 */
			};
		private static final int /*@NonNull*/ [] __EAssemblyViewPoint = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EDeploymentViewPoint =
			{
				Fragments._EDeploymentViewPoint__OclAny /* 0 */,
				Fragments._EDeploymentViewPoint__OclElement /* 1 */,
				Fragments._EDeploymentViewPoint__EViewPoint /* 2 */,
				Fragments._EDeploymentViewPoint__EDeploymentViewPoint /* 3 */
			};
		private static final int /*@NonNull*/ [] __EDeploymentViewPoint = { 1,1,1,1 };

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

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._EAssemblyViewPoint.initFragments(_EAssemblyViewPoint, __EAssemblyViewPoint);
			Types._EDeploymentViewPoint.initFragments(_EDeploymentViewPoint, __EDeploymentViewPoint);
			Types._ESystemIndependentViewPoint.initFragments(_ESystemIndependentViewPoint, __ESystemIndependentViewPoint);
			Types._EViewPoint.initFragments(_EViewPoint, __EViewPoint);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ViewPointTables::TypeFragments and all preceding sub-packages.
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

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._EAssemblyViewPoint__EAssemblyViewPoint.initOperations(_EAssemblyViewPoint__EAssemblyViewPoint);
			Fragments._EAssemblyViewPoint__EViewPoint.initOperations(_EAssemblyViewPoint__EViewPoint);
			Fragments._EAssemblyViewPoint__OclAny.initOperations(_EAssemblyViewPoint__OclAny);
			Fragments._EAssemblyViewPoint__OclElement.initOperations(_EAssemblyViewPoint__OclElement);

			Fragments._EDeploymentViewPoint__EDeploymentViewPoint.initOperations(_EDeploymentViewPoint__EDeploymentViewPoint);
			Fragments._EDeploymentViewPoint__EViewPoint.initOperations(_EDeploymentViewPoint__EViewPoint);
			Fragments._EDeploymentViewPoint__OclAny.initOperations(_EDeploymentViewPoint__OclAny);
			Fragments._EDeploymentViewPoint__OclElement.initOperations(_EDeploymentViewPoint__OclElement);

			Fragments._ESystemIndependentViewPoint__ESystemIndependentViewPoint.initOperations(_ESystemIndependentViewPoint__ESystemIndependentViewPoint);
			Fragments._ESystemIndependentViewPoint__EViewPoint.initOperations(_ESystemIndependentViewPoint__EViewPoint);
			Fragments._ESystemIndependentViewPoint__OclAny.initOperations(_ESystemIndependentViewPoint__OclAny);
			Fragments._ESystemIndependentViewPoint__OclElement.initOperations(_ESystemIndependentViewPoint__OclElement);

			Fragments._EViewPoint__EViewPoint.initOperations(_EViewPoint__EViewPoint);
			Fragments._EViewPoint__OclAny.initOperations(_EViewPoint__OclAny);
			Fragments._EViewPoint__OclElement.initOperations(_EViewPoint__OclElement);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ViewPointTables::FragmentOperations and all preceding sub-packages.
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

		private static final ExecutorProperty /*@NonNull*/ [] _EAssemblyViewPoint = {
			ViewPointTables.Properties._EAssemblyViewPoint__assemblyviewtype,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EDeploymentViewPoint = {
			ViewPointTables.Properties._EDeploymentViewPoint__allocationviewtype,
			ViewPointTables.Properties._EDeploymentViewPoint__environmentviewtype,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ESystemIndependentViewPoint = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			ViewPointTables.Properties._ESystemIndependentViewPoint__repositoryviewtype
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EViewPoint = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._EAssemblyViewPoint__EAssemblyViewPoint.initProperties(_EAssemblyViewPoint);
			Fragments._EDeploymentViewPoint__EDeploymentViewPoint.initProperties(_EDeploymentViewPoint);
			Fragments._ESystemIndependentViewPoint__ESystemIndependentViewPoint.initProperties(_ESystemIndependentViewPoint);
			Fragments._EViewPoint__EViewPoint.initProperties(_EViewPoint);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ViewPointTables::FragmentProperties and all preceding sub-packages.
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

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of ViewPointTables::EnumerationLiterals and all preceding sub-packages.
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
		new ViewPointTables();
	}

	private ViewPointTables() {
		super(ViewPointPackage.eNS_URI);
	}
}
