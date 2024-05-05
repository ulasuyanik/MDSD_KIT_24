/**
 */
package mdsd.component_based.impl;

import mdsd.component_based.Component_basedPackage;
import mdsd.component_based.EAssemblyConnector;
import mdsd.component_based.EProvidedRole;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EProvided Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.impl.EProvidedRoleImpl#getLinkedFrom <em>Linked From</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EProvidedRoleImpl extends ERoleImpl implements EProvidedRole {
	/**
	 * The cached value of the '{@link #getLinkedFrom() <em>Linked From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedFrom()
	 * @generated
	 * @ordered
	 */
	protected EAssemblyConnector linkedFrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EProvidedRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Component_basedPackage.Literals.EPROVIDED_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAssemblyConnector getLinkedFrom() {
		if (linkedFrom != null && linkedFrom.eIsProxy()) {
			InternalEObject oldLinkedFrom = (InternalEObject) linkedFrom;
			linkedFrom = (EAssemblyConnector) eResolveProxy(oldLinkedFrom);
			if (linkedFrom != oldLinkedFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Component_basedPackage.EPROVIDED_ROLE__LINKED_FROM, oldLinkedFrom, linkedFrom));
			}
		}
		return linkedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAssemblyConnector basicGetLinkedFrom() {
		return linkedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkedFrom(EAssemblyConnector newLinkedFrom, NotificationChain msgs) {
		EAssemblyConnector oldLinkedFrom = linkedFrom;
		linkedFrom = newLinkedFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Component_basedPackage.EPROVIDED_ROLE__LINKED_FROM, oldLinkedFrom, newLinkedFrom);
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
	public void setLinkedFrom(EAssemblyConnector newLinkedFrom) {
		if (newLinkedFrom != linkedFrom) {
			NotificationChain msgs = null;
			if (linkedFrom != null)
				msgs = ((InternalEObject) linkedFrom).eInverseRemove(this,
						Component_basedPackage.EASSEMBLY_CONNECTOR__LINK_FROM, EAssemblyConnector.class, msgs);
			if (newLinkedFrom != null)
				msgs = ((InternalEObject) newLinkedFrom).eInverseAdd(this,
						Component_basedPackage.EASSEMBLY_CONNECTOR__LINK_FROM, EAssemblyConnector.class, msgs);
			msgs = basicSetLinkedFrom(newLinkedFrom, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_basedPackage.EPROVIDED_ROLE__LINKED_FROM,
					newLinkedFrom, newLinkedFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Component_basedPackage.EPROVIDED_ROLE__LINKED_FROM:
			if (linkedFrom != null)
				msgs = ((InternalEObject) linkedFrom).eInverseRemove(this,
						Component_basedPackage.EASSEMBLY_CONNECTOR__LINK_FROM, EAssemblyConnector.class, msgs);
			return basicSetLinkedFrom((EAssemblyConnector) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Component_basedPackage.EPROVIDED_ROLE__LINKED_FROM:
			return basicSetLinkedFrom(null, msgs);
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
		case Component_basedPackage.EPROVIDED_ROLE__LINKED_FROM:
			if (resolve)
				return getLinkedFrom();
			return basicGetLinkedFrom();
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
		case Component_basedPackage.EPROVIDED_ROLE__LINKED_FROM:
			setLinkedFrom((EAssemblyConnector) newValue);
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
		case Component_basedPackage.EPROVIDED_ROLE__LINKED_FROM:
			setLinkedFrom((EAssemblyConnector) null);
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
		case Component_basedPackage.EPROVIDED_ROLE__LINKED_FROM:
			return linkedFrom != null;
		}
		return super.eIsSet(featureID);
	}

} //EProvidedRoleImpl
