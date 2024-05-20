/**
 */
package mdsd.component_based.ViewPoint.impl;

import mdsd.component_based.ViewPoint.*;

import org.eclipse.emf.ecore.EClass;
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
public class ViewPointFactoryImpl extends EFactoryImpl implements ViewPointFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ViewPointFactory init() {
		try {
			ViewPointFactory theViewPointFactory = (ViewPointFactory) EPackage.Registry.INSTANCE
					.getEFactory(ViewPointPackage.eNS_URI);
			if (theViewPointFactory != null) {
				return theViewPointFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ViewPointFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewPointFactoryImpl() {
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
		case ViewPointPackage.EASSEMBLY_VIEW_POINT:
			return createEAssemblyViewPoint();
		case ViewPointPackage.EDEPLOYMENT_VIEW_POINT:
			return createEDeploymentViewPoint();
		case ViewPointPackage.ESYSTEM_INDEPENDENT_VIEW_POINT:
			return createESystemIndependentViewPoint();
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
	public ViewPointPackage getViewPointPackage() {
		return (ViewPointPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ViewPointPackage getPackage() {
		return ViewPointPackage.eINSTANCE;
	}

} //ViewPointFactoryImpl
