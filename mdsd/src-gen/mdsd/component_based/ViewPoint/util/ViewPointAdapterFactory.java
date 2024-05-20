/**
 */
package mdsd.component_based.ViewPoint.util;

import mdsd.component_based.ViewPoint.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mdsd.component_based.ViewPoint.ViewPointPackage
 * @generated
 */
public class ViewPointAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ViewPointPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewPointAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ViewPointPackage.eINSTANCE;
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
	protected ViewPointSwitch<Adapter> modelSwitch = new ViewPointSwitch<Adapter>() {
		@Override
		public Adapter caseEViewPoint(EViewPoint object) {
			return createEViewPointAdapter();
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
		public Adapter caseESystemIndependentViewPoint(ESystemIndependentViewPoint object) {
			return createESystemIndependentViewPointAdapter();
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
	 * Creates a new adapter for an object of class '{@link mdsd.component_based.ViewPoint.EViewPoint <em>EView Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdsd.component_based.ViewPoint.EViewPoint
	 * @generated
	 */
	public Adapter createEViewPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdsd.component_based.ViewPoint.EAssemblyViewPoint <em>EAssembly View Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdsd.component_based.ViewPoint.EAssemblyViewPoint
	 * @generated
	 */
	public Adapter createEAssemblyViewPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdsd.component_based.ViewPoint.EDeploymentViewPoint <em>EDeployment View Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdsd.component_based.ViewPoint.EDeploymentViewPoint
	 * @generated
	 */
	public Adapter createEDeploymentViewPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mdsd.component_based.ViewPoint.ESystemIndependentViewPoint <em>ESystem Independent View Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mdsd.component_based.ViewPoint.ESystemIndependentViewPoint
	 * @generated
	 */
	public Adapter createESystemIndependentViewPointAdapter() {
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

} //ViewPointAdapterFactory
