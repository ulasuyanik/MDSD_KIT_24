/**
 */
package mdsd.component_based.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import mdsd.component_based.Component_basedPackage;
import mdsd.component_based.EAssemblyContext;
import mdsd.component_based.EAssemblyViewType;
import mdsd.component_based.EComponent;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EAssembly View Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.impl.EAssemblyViewTypeImpl#getMainArtifacts <em>Main Artifacts</em>}</li>
 *   <li>{@link mdsd.component_based.impl.EAssemblyViewTypeImpl#getShowsComponents <em>Shows Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EAssemblyViewTypeImpl extends MinimalEObjectImpl.Container implements EAssemblyViewType {
	/**
	 * The cached value of the '{@link #getMainArtifacts() <em>Main Artifacts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainArtifacts()
	 * @generated
	 * @ordered
	 */
	protected EList<EAssemblyContext> mainArtifacts;

	/**
	 * The cached value of the '{@link #getShowsComponents() <em>Shows Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowsComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<EComponent> showsComponents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EAssemblyViewTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Component_basedPackage.Literals.EASSEMBLY_VIEW_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EAssemblyContext> getMainArtifacts() {
		if (mainArtifacts == null) {
			mainArtifacts = new EObjectContainmentEList<EAssemblyContext>(EAssemblyContext.class, this,
					Component_basedPackage.EASSEMBLY_VIEW_TYPE__MAIN_ARTIFACTS);
		}
		return mainArtifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EComponent> getShowsComponents() {
		if (showsComponents == null) {
			showsComponents = new EObjectResolvingEList<EComponent>(EComponent.class, this,
					Component_basedPackage.EASSEMBLY_VIEW_TYPE__SHOWS_COMPONENTS);
		}
		return showsComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void showComponentConnections() {
		throw new UnsupportedOperationException(); // FIXME Unimplemented http://www.example.org/component_based!EAssemblyViewType!showComponentConnections()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Component_basedPackage.EASSEMBLY_VIEW_TYPE__MAIN_ARTIFACTS:
			return ((InternalEList<?>) getMainArtifacts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Component_basedPackage.EASSEMBLY_VIEW_TYPE__MAIN_ARTIFACTS:
			return getMainArtifacts();
		case Component_basedPackage.EASSEMBLY_VIEW_TYPE__SHOWS_COMPONENTS:
			return getShowsComponents();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Component_basedPackage.EASSEMBLY_VIEW_TYPE__MAIN_ARTIFACTS:
			getMainArtifacts().clear();
			getMainArtifacts().addAll((Collection<? extends EAssemblyContext>) newValue);
			return;
		case Component_basedPackage.EASSEMBLY_VIEW_TYPE__SHOWS_COMPONENTS:
			getShowsComponents().clear();
			getShowsComponents().addAll((Collection<? extends EComponent>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Component_basedPackage.EASSEMBLY_VIEW_TYPE__MAIN_ARTIFACTS:
			getMainArtifacts().clear();
			return;
		case Component_basedPackage.EASSEMBLY_VIEW_TYPE__SHOWS_COMPONENTS:
			getShowsComponents().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Component_basedPackage.EASSEMBLY_VIEW_TYPE__MAIN_ARTIFACTS:
			return mainArtifacts != null && !mainArtifacts.isEmpty();
		case Component_basedPackage.EASSEMBLY_VIEW_TYPE__SHOWS_COMPONENTS:
			return showsComponents != null && !showsComponents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case Component_basedPackage.EASSEMBLY_VIEW_TYPE___SHOW_COMPONENT_CONNECTIONS:
			showComponentConnections();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //EAssemblyViewTypeImpl
