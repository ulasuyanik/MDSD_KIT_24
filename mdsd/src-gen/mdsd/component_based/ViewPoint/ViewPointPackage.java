/**
 */
package mdsd.component_based.ViewPoint;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mdsd.component_based.ViewPoint.ViewPointFactory
 * @model kind="package"
 * @generated
 */
public interface ViewPointPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ViewPoint";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/component_based/ViewPoint";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "VP";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ViewPointPackage eINSTANCE = mdsd.component_based.ViewPoint.impl.ViewPointPackageImpl.init();

	/**
	 * The meta object id for the '{@link mdsd.component_based.ViewPoint.EViewPoint <em>EView Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdsd.component_based.ViewPoint.EViewPoint
	 * @see mdsd.component_based.ViewPoint.impl.ViewPointPackageImpl#getEViewPoint()
	 * @generated
	 */
	int EVIEW_POINT = 0;

	/**
	 * The number of structural features of the '<em>EView Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIEW_POINT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>EView Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIEW_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mdsd.component_based.ViewPoint.impl.EAssemblyViewPointImpl <em>EAssembly View Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdsd.component_based.ViewPoint.impl.EAssemblyViewPointImpl
	 * @see mdsd.component_based.ViewPoint.impl.ViewPointPackageImpl#getEAssemblyViewPoint()
	 * @generated
	 */
	int EASSEMBLY_VIEW_POINT = 1;

	/**
	 * The feature id for the '<em><b>Assemblyviewtype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASSEMBLY_VIEW_POINT__ASSEMBLYVIEWTYPE = EVIEW_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EAssembly View Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASSEMBLY_VIEW_POINT_FEATURE_COUNT = EVIEW_POINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EAssembly View Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EASSEMBLY_VIEW_POINT_OPERATION_COUNT = EVIEW_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mdsd.component_based.ViewPoint.impl.EDeploymentViewPointImpl <em>EDeployment View Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdsd.component_based.ViewPoint.impl.EDeploymentViewPointImpl
	 * @see mdsd.component_based.ViewPoint.impl.ViewPointPackageImpl#getEDeploymentViewPoint()
	 * @generated
	 */
	int EDEPLOYMENT_VIEW_POINT = 2;

	/**
	 * The feature id for the '<em><b>Environmentviewtype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDEPLOYMENT_VIEW_POINT__ENVIRONMENTVIEWTYPE = EVIEW_POINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Allocationviewtype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDEPLOYMENT_VIEW_POINT__ALLOCATIONVIEWTYPE = EVIEW_POINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EDeployment View Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDEPLOYMENT_VIEW_POINT_FEATURE_COUNT = EVIEW_POINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>EDeployment View Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDEPLOYMENT_VIEW_POINT_OPERATION_COUNT = EVIEW_POINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mdsd.component_based.ViewPoint.impl.ESystemIndependentViewPointImpl <em>ESystem Independent View Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mdsd.component_based.ViewPoint.impl.ESystemIndependentViewPointImpl
	 * @see mdsd.component_based.ViewPoint.impl.ViewPointPackageImpl#getESystemIndependentViewPoint()
	 * @generated
	 */
	int ESYSTEM_INDEPENDENT_VIEW_POINT = 3;

	/**
	 * The feature id for the '<em><b>Repositoryviewtype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESYSTEM_INDEPENDENT_VIEW_POINT__REPOSITORYVIEWTYPE = EVIEW_POINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ESystem Independent View Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESYSTEM_INDEPENDENT_VIEW_POINT_FEATURE_COUNT = EVIEW_POINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>ESystem Independent View Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESYSTEM_INDEPENDENT_VIEW_POINT_OPERATION_COUNT = EVIEW_POINT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link mdsd.component_based.ViewPoint.EViewPoint <em>EView Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EView Point</em>'.
	 * @see mdsd.component_based.ViewPoint.EViewPoint
	 * @generated
	 */
	EClass getEViewPoint();

	/**
	 * Returns the meta object for class '{@link mdsd.component_based.ViewPoint.EAssemblyViewPoint <em>EAssembly View Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAssembly View Point</em>'.
	 * @see mdsd.component_based.ViewPoint.EAssemblyViewPoint
	 * @generated
	 */
	EClass getEAssemblyViewPoint();

	/**
	 * Returns the meta object for the containment reference '{@link mdsd.component_based.ViewPoint.EAssemblyViewPoint#getAssemblyviewtype <em>Assemblyviewtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assemblyviewtype</em>'.
	 * @see mdsd.component_based.ViewPoint.EAssemblyViewPoint#getAssemblyviewtype()
	 * @see #getEAssemblyViewPoint()
	 * @generated
	 */
	EReference getEAssemblyViewPoint_Assemblyviewtype();

	/**
	 * Returns the meta object for class '{@link mdsd.component_based.ViewPoint.EDeploymentViewPoint <em>EDeployment View Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EDeployment View Point</em>'.
	 * @see mdsd.component_based.ViewPoint.EDeploymentViewPoint
	 * @generated
	 */
	EClass getEDeploymentViewPoint();

	/**
	 * Returns the meta object for the containment reference '{@link mdsd.component_based.ViewPoint.EDeploymentViewPoint#getEnvironmentviewtype <em>Environmentviewtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Environmentviewtype</em>'.
	 * @see mdsd.component_based.ViewPoint.EDeploymentViewPoint#getEnvironmentviewtype()
	 * @see #getEDeploymentViewPoint()
	 * @generated
	 */
	EReference getEDeploymentViewPoint_Environmentviewtype();

	/**
	 * Returns the meta object for the containment reference '{@link mdsd.component_based.ViewPoint.EDeploymentViewPoint#getAllocationviewtype <em>Allocationviewtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Allocationviewtype</em>'.
	 * @see mdsd.component_based.ViewPoint.EDeploymentViewPoint#getAllocationviewtype()
	 * @see #getEDeploymentViewPoint()
	 * @generated
	 */
	EReference getEDeploymentViewPoint_Allocationviewtype();

	/**
	 * Returns the meta object for class '{@link mdsd.component_based.ViewPoint.ESystemIndependentViewPoint <em>ESystem Independent View Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ESystem Independent View Point</em>'.
	 * @see mdsd.component_based.ViewPoint.ESystemIndependentViewPoint
	 * @generated
	 */
	EClass getESystemIndependentViewPoint();

	/**
	 * Returns the meta object for the containment reference '{@link mdsd.component_based.ViewPoint.ESystemIndependentViewPoint#getRepositoryviewtype <em>Repositoryviewtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repositoryviewtype</em>'.
	 * @see mdsd.component_based.ViewPoint.ESystemIndependentViewPoint#getRepositoryviewtype()
	 * @see #getESystemIndependentViewPoint()
	 * @generated
	 */
	EReference getESystemIndependentViewPoint_Repositoryviewtype();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ViewPointFactory getViewPointFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mdsd.component_based.ViewPoint.EViewPoint <em>EView Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdsd.component_based.ViewPoint.EViewPoint
		 * @see mdsd.component_based.ViewPoint.impl.ViewPointPackageImpl#getEViewPoint()
		 * @generated
		 */
		EClass EVIEW_POINT = eINSTANCE.getEViewPoint();

		/**
		 * The meta object literal for the '{@link mdsd.component_based.ViewPoint.impl.EAssemblyViewPointImpl <em>EAssembly View Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdsd.component_based.ViewPoint.impl.EAssemblyViewPointImpl
		 * @see mdsd.component_based.ViewPoint.impl.ViewPointPackageImpl#getEAssemblyViewPoint()
		 * @generated
		 */
		EClass EASSEMBLY_VIEW_POINT = eINSTANCE.getEAssemblyViewPoint();

		/**
		 * The meta object literal for the '<em><b>Assemblyviewtype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EASSEMBLY_VIEW_POINT__ASSEMBLYVIEWTYPE = eINSTANCE.getEAssemblyViewPoint_Assemblyviewtype();

		/**
		 * The meta object literal for the '{@link mdsd.component_based.ViewPoint.impl.EDeploymentViewPointImpl <em>EDeployment View Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdsd.component_based.ViewPoint.impl.EDeploymentViewPointImpl
		 * @see mdsd.component_based.ViewPoint.impl.ViewPointPackageImpl#getEDeploymentViewPoint()
		 * @generated
		 */
		EClass EDEPLOYMENT_VIEW_POINT = eINSTANCE.getEDeploymentViewPoint();

		/**
		 * The meta object literal for the '<em><b>Environmentviewtype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDEPLOYMENT_VIEW_POINT__ENVIRONMENTVIEWTYPE = eINSTANCE
				.getEDeploymentViewPoint_Environmentviewtype();

		/**
		 * The meta object literal for the '<em><b>Allocationviewtype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDEPLOYMENT_VIEW_POINT__ALLOCATIONVIEWTYPE = eINSTANCE.getEDeploymentViewPoint_Allocationviewtype();

		/**
		 * The meta object literal for the '{@link mdsd.component_based.ViewPoint.impl.ESystemIndependentViewPointImpl <em>ESystem Independent View Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mdsd.component_based.ViewPoint.impl.ESystemIndependentViewPointImpl
		 * @see mdsd.component_based.ViewPoint.impl.ViewPointPackageImpl#getESystemIndependentViewPoint()
		 * @generated
		 */
		EClass ESYSTEM_INDEPENDENT_VIEW_POINT = eINSTANCE.getESystemIndependentViewPoint();

		/**
		 * The meta object literal for the '<em><b>Repositoryviewtype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESYSTEM_INDEPENDENT_VIEW_POINT__REPOSITORYVIEWTYPE = eINSTANCE
				.getESystemIndependentViewPoint_Repositoryviewtype();

	}

} //ViewPointPackage
