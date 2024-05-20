/**
 */
package mdsd.component_based.ViewPoint.impl;

import mdsd.component_based.EAssemblyViewType;

import mdsd.component_based.ViewPoint.EAssemblyViewPoint;
import mdsd.component_based.ViewPoint.ViewPointPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EAssembly View Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.ViewPoint.impl.EAssemblyViewPointImpl#getAssemblyviewtype <em>Assemblyviewtype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EAssemblyViewPointImpl extends MinimalEObjectImpl.Container implements EAssemblyViewPoint {
	/**
	 * The cached value of the '{@link #getAssemblyviewtype() <em>Assemblyviewtype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyviewtype()
	 * @generated
	 * @ordered
	 */
	protected EAssemblyViewType assemblyviewtype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EAssemblyViewPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewPointPackage.Literals.EASSEMBLY_VIEW_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAssemblyViewType getAssemblyviewtype() {
		return assemblyviewtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssemblyviewtype(EAssemblyViewType newAssemblyviewtype, NotificationChain msgs) {
		EAssemblyViewType oldAssemblyviewtype = assemblyviewtype;
		assemblyviewtype = newAssemblyviewtype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ViewPointPackage.EASSEMBLY_VIEW_POINT__ASSEMBLYVIEWTYPE, oldAssemblyviewtype, newAssemblyviewtype);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssemblyviewtype(EAssemblyViewType newAssemblyviewtype) {
		if (newAssemblyviewtype != assemblyviewtype) {
			NotificationChain msgs = null;
			if (assemblyviewtype != null)
				msgs = ((InternalEObject) assemblyviewtype).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ViewPointPackage.EASSEMBLY_VIEW_POINT__ASSEMBLYVIEWTYPE, null, msgs);
			if (newAssemblyviewtype != null)
				msgs = ((InternalEObject) newAssemblyviewtype).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ViewPointPackage.EASSEMBLY_VIEW_POINT__ASSEMBLYVIEWTYPE, null, msgs);
			msgs = basicSetAssemblyviewtype(newAssemblyviewtype, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ViewPointPackage.EASSEMBLY_VIEW_POINT__ASSEMBLYVIEWTYPE, newAssemblyviewtype, newAssemblyviewtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ViewPointPackage.EASSEMBLY_VIEW_POINT__ASSEMBLYVIEWTYPE:
			return basicSetAssemblyviewtype(null, msgs);
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
		case ViewPointPackage.EASSEMBLY_VIEW_POINT__ASSEMBLYVIEWTYPE:
			return getAssemblyviewtype();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ViewPointPackage.EASSEMBLY_VIEW_POINT__ASSEMBLYVIEWTYPE:
			setAssemblyviewtype((EAssemblyViewType) newValue);
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
		case ViewPointPackage.EASSEMBLY_VIEW_POINT__ASSEMBLYVIEWTYPE:
			setAssemblyviewtype((EAssemblyViewType) null);
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
		case ViewPointPackage.EASSEMBLY_VIEW_POINT__ASSEMBLYVIEWTYPE:
			return assemblyviewtype != null;
		}
		return super.eIsSet(featureID);
	}

} //EAssemblyViewPointImpl
