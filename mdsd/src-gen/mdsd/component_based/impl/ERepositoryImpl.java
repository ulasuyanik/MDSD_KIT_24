/**
 */
package mdsd.component_based.impl;

import java.util.Collection;

import mdsd.component_based.Component_basedPackage;
import mdsd.component_based.EComponent;
import mdsd.component_based.EInterface;
import mdsd.component_based.ERepository;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ERepository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.impl.ERepositoryImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link mdsd.component_based.impl.ERepositoryImpl#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ERepositoryImpl extends MinimalEObjectImpl.Container implements ERepository {
	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<EComponent> component;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<EInterface> interface_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ERepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Component_basedPackage.Literals.EREPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EComponent> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<EComponent>(EComponent.class, this,
					Component_basedPackage.EREPOSITORY__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EInterface> getInterface() {
		if (interface_ == null) {
			interface_ = new EObjectContainmentEList<EInterface>(EInterface.class, this,
					Component_basedPackage.EREPOSITORY__INTERFACE);
		}
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Component_basedPackage.EREPOSITORY__COMPONENT:
			return ((InternalEList<?>) getComponent()).basicRemove(otherEnd, msgs);
		case Component_basedPackage.EREPOSITORY__INTERFACE:
			return ((InternalEList<?>) getInterface()).basicRemove(otherEnd, msgs);
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
		case Component_basedPackage.EREPOSITORY__COMPONENT:
			return getComponent();
		case Component_basedPackage.EREPOSITORY__INTERFACE:
			return getInterface();
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
		case Component_basedPackage.EREPOSITORY__COMPONENT:
			getComponent().clear();
			getComponent().addAll((Collection<? extends EComponent>) newValue);
			return;
		case Component_basedPackage.EREPOSITORY__INTERFACE:
			getInterface().clear();
			getInterface().addAll((Collection<? extends EInterface>) newValue);
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
		case Component_basedPackage.EREPOSITORY__COMPONENT:
			getComponent().clear();
			return;
		case Component_basedPackage.EREPOSITORY__INTERFACE:
			getInterface().clear();
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
		case Component_basedPackage.EREPOSITORY__COMPONENT:
			return component != null && !component.isEmpty();
		case Component_basedPackage.EREPOSITORY__INTERFACE:
			return interface_ != null && !interface_.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ERepositoryImpl
