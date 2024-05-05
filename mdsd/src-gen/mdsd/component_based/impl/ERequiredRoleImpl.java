/**
 */
package mdsd.component_based.impl;

import mdsd.component_based.Component_basedPackage;
import mdsd.component_based.EAssemblyConnector;
import mdsd.component_based.ERequiredRole;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ERequired Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.impl.ERequiredRoleImpl#getLinkedTo <em>Linked To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ERequiredRoleImpl extends ERoleImpl implements ERequiredRole {
	/**
	 * The cached value of the '{@link #getLinkedTo() <em>Linked To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedTo()
	 * @generated
	 * @ordered
	 */
	protected EAssemblyConnector linkedTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ERequiredRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Component_basedPackage.Literals.EREQUIRED_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAssemblyConnector getLinkedTo() {
		if (linkedTo != null && linkedTo.eIsProxy()) {
			InternalEObject oldLinkedTo = (InternalEObject) linkedTo;
			linkedTo = (EAssemblyConnector) eResolveProxy(oldLinkedTo);
			if (linkedTo != oldLinkedTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Component_basedPackage.EREQUIRED_ROLE__LINKED_TO, oldLinkedTo, linkedTo));
			}
		}
		return linkedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAssemblyConnector basicGetLinkedTo() {
		return linkedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkedTo(EAssemblyConnector newLinkedTo, NotificationChain msgs) {
		EAssemblyConnector oldLinkedTo = linkedTo;
		linkedTo = newLinkedTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Component_basedPackage.EREQUIRED_ROLE__LINKED_TO, oldLinkedTo, newLinkedTo);
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
	public void setLinkedTo(EAssemblyConnector newLinkedTo) {
		if (newLinkedTo != linkedTo) {
			NotificationChain msgs = null;
			if (linkedTo != null)
				msgs = ((InternalEObject) linkedTo).eInverseRemove(this,
						Component_basedPackage.EASSEMBLY_CONNECTOR__LINK_TO, EAssemblyConnector.class, msgs);
			if (newLinkedTo != null)
				msgs = ((InternalEObject) newLinkedTo).eInverseAdd(this,
						Component_basedPackage.EASSEMBLY_CONNECTOR__LINK_TO, EAssemblyConnector.class, msgs);
			msgs = basicSetLinkedTo(newLinkedTo, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_basedPackage.EREQUIRED_ROLE__LINKED_TO,
					newLinkedTo, newLinkedTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Component_basedPackage.EREQUIRED_ROLE__LINKED_TO:
			if (linkedTo != null)
				msgs = ((InternalEObject) linkedTo).eInverseRemove(this,
						Component_basedPackage.EASSEMBLY_CONNECTOR__LINK_TO, EAssemblyConnector.class, msgs);
			return basicSetLinkedTo((EAssemblyConnector) otherEnd, msgs);
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
		case Component_basedPackage.EREQUIRED_ROLE__LINKED_TO:
			return basicSetLinkedTo(null, msgs);
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
		case Component_basedPackage.EREQUIRED_ROLE__LINKED_TO:
			if (resolve)
				return getLinkedTo();
			return basicGetLinkedTo();
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
		case Component_basedPackage.EREQUIRED_ROLE__LINKED_TO:
			setLinkedTo((EAssemblyConnector) newValue);
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
		case Component_basedPackage.EREQUIRED_ROLE__LINKED_TO:
			setLinkedTo((EAssemblyConnector) null);
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
		case Component_basedPackage.EREQUIRED_ROLE__LINKED_TO:
			return linkedTo != null;
		}
		return super.eIsSet(featureID);
	}

} //ERequiredRoleImpl
