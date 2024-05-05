/**
 */
package mdsd.component_based.impl;

import java.util.Collection;

import mdsd.component_based.Component_basedPackage;
import mdsd.component_based.EAllocationContext;
import mdsd.component_based.EAssemblyContext;
import mdsd.component_based.EContainer;
import mdsd.component_based.ESystem;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EAllocation Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.impl.EAllocationContextImpl#getControls <em>Controls</em>}</li>
 *   <li>{@link mdsd.component_based.impl.EAllocationContextImpl#getSpecifiesFor <em>Specifies For</em>}</li>
 *   <li>{@link mdsd.component_based.impl.EAllocationContextImpl#getSpecifies <em>Specifies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EAllocationContextImpl extends MinimalEObjectImpl.Container implements EAllocationContext {
	/**
	 * The cached value of the '{@link #getControls() <em>Controls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControls()
	 * @generated
	 * @ordered
	 */
	protected EList<EContainer> controls;

	/**
	 * The cached value of the '{@link #getSpecifiesFor() <em>Specifies For</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecifiesFor()
	 * @generated
	 * @ordered
	 */
	protected EList<ESystem> specifiesFor;

	/**
	 * The cached value of the '{@link #getSpecifies() <em>Specifies</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecifies()
	 * @generated
	 * @ordered
	 */
	protected EAssemblyContext specifies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EAllocationContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Component_basedPackage.Literals.EALLOCATION_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EContainer> getControls() {
		if (controls == null) {
			controls = new EObjectResolvingEList<EContainer>(EContainer.class, this,
					Component_basedPackage.EALLOCATION_CONTEXT__CONTROLS);
		}
		return controls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ESystem> getSpecifiesFor() {
		if (specifiesFor == null) {
			specifiesFor = new EObjectResolvingEList<ESystem>(ESystem.class, this,
					Component_basedPackage.EALLOCATION_CONTEXT__SPECIFIES_FOR);
		}
		return specifiesFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAssemblyContext getSpecifies() {
		if (specifies != null && specifies.eIsProxy()) {
			InternalEObject oldSpecifies = (InternalEObject) specifies;
			specifies = (EAssemblyContext) eResolveProxy(oldSpecifies);
			if (specifies != oldSpecifies) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Component_basedPackage.EALLOCATION_CONTEXT__SPECIFIES, oldSpecifies, specifies));
			}
		}
		return specifies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAssemblyContext basicGetSpecifies() {
		return specifies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecifies(EAssemblyContext newSpecifies) {
		EAssemblyContext oldSpecifies = specifies;
		specifies = newSpecifies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_basedPackage.EALLOCATION_CONTEXT__SPECIFIES,
					oldSpecifies, specifies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Component_basedPackage.EALLOCATION_CONTEXT__CONTROLS:
			return getControls();
		case Component_basedPackage.EALLOCATION_CONTEXT__SPECIFIES_FOR:
			return getSpecifiesFor();
		case Component_basedPackage.EALLOCATION_CONTEXT__SPECIFIES:
			if (resolve)
				return getSpecifies();
			return basicGetSpecifies();
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
		case Component_basedPackage.EALLOCATION_CONTEXT__CONTROLS:
			getControls().clear();
			getControls().addAll((Collection<? extends EContainer>) newValue);
			return;
		case Component_basedPackage.EALLOCATION_CONTEXT__SPECIFIES_FOR:
			getSpecifiesFor().clear();
			getSpecifiesFor().addAll((Collection<? extends ESystem>) newValue);
			return;
		case Component_basedPackage.EALLOCATION_CONTEXT__SPECIFIES:
			setSpecifies((EAssemblyContext) newValue);
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
		case Component_basedPackage.EALLOCATION_CONTEXT__CONTROLS:
			getControls().clear();
			return;
		case Component_basedPackage.EALLOCATION_CONTEXT__SPECIFIES_FOR:
			getSpecifiesFor().clear();
			return;
		case Component_basedPackage.EALLOCATION_CONTEXT__SPECIFIES:
			setSpecifies((EAssemblyContext) null);
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
		case Component_basedPackage.EALLOCATION_CONTEXT__CONTROLS:
			return controls != null && !controls.isEmpty();
		case Component_basedPackage.EALLOCATION_CONTEXT__SPECIFIES_FOR:
			return specifiesFor != null && !specifiesFor.isEmpty();
		case Component_basedPackage.EALLOCATION_CONTEXT__SPECIFIES:
			return specifies != null;
		}
		return super.eIsSet(featureID);
	}

} //EAllocationContextImpl
