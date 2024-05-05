/**
 */
package mdsd.component_based.impl;

import mdsd.component_based.Component_basedPackage;
import mdsd.component_based.EAssemblyConnector;
import mdsd.component_based.EProvidedRole;
import mdsd.component_based.ERequiredRole;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EAssembly Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.impl.EAssemblyConnectorImpl#getLinkTo <em>Link To</em>}</li>
 *   <li>{@link mdsd.component_based.impl.EAssemblyConnectorImpl#getLinkFrom <em>Link From</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EAssemblyConnectorImpl extends MinimalEObjectImpl.Container implements EAssemblyConnector {
	/**
	 * The cached value of the '{@link #getLinkTo() <em>Link To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkTo()
	 * @generated
	 * @ordered
	 */
	protected ERequiredRole linkTo;

	/**
	 * The cached value of the '{@link #getLinkFrom() <em>Link From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkFrom()
	 * @generated
	 * @ordered
	 */
	protected EProvidedRole linkFrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EAssemblyConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Component_basedPackage.Literals.EASSEMBLY_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EProvidedRole getLinkFrom() {
		if (linkFrom != null && linkFrom.eIsProxy()) {
			InternalEObject oldLinkFrom = (InternalEObject) linkFrom;
			linkFrom = (EProvidedRole) eResolveProxy(oldLinkFrom);
			if (linkFrom != oldLinkFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Component_basedPackage.EASSEMBLY_CONNECTOR__LINK_FROM, oldLinkFrom, linkFrom));
			}
		}
		return linkFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EProvidedRole basicGetLinkFrom() {
		return linkFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkFrom(EProvidedRole newLinkFrom, NotificationChain msgs) {
		EProvidedRole oldLinkFrom = linkFrom;
		linkFrom = newLinkFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Component_basedPackage.EASSEMBLY_CONNECTOR__LINK_FROM, oldLinkFrom, newLinkFrom);
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
	public void setLinkFrom(EProvidedRole newLinkFrom) {
		if (newLinkFrom != linkFrom) {
			NotificationChain msgs = null;
			if (linkFrom != null)
				msgs = ((InternalEObject) linkFrom).eInverseRemove(this,
						Component_basedPackage.EPROVIDED_ROLE__LINKED_FROM, EProvidedRole.class, msgs);
			if (newLinkFrom != null)
				msgs = ((InternalEObject) newLinkFrom).eInverseAdd(this,
						Component_basedPackage.EPROVIDED_ROLE__LINKED_FROM, EProvidedRole.class, msgs);
			msgs = basicSetLinkFrom(newLinkFrom, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_basedPackage.EASSEMBLY_CONNECTOR__LINK_FROM,
					newLinkFrom, newLinkFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ERequiredRole getLinkTo() {
		if (linkTo != null && linkTo.eIsProxy()) {
			InternalEObject oldLinkTo = (InternalEObject) linkTo;
			linkTo = (ERequiredRole) eResolveProxy(oldLinkTo);
			if (linkTo != oldLinkTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Component_basedPackage.EASSEMBLY_CONNECTOR__LINK_TO, oldLinkTo, linkTo));
			}
		}
		return linkTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERequiredRole basicGetLinkTo() {
		return linkTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkTo(ERequiredRole newLinkTo, NotificationChain msgs) {
		ERequiredRole oldLinkTo = linkTo;
		linkTo = newLinkTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Component_basedPackage.EASSEMBLY_CONNECTOR__LINK_TO, oldLinkTo, newLinkTo);
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
	public void setLinkTo(ERequiredRole newLinkTo) {
		if (newLinkTo != linkTo) {
			NotificationChain msgs = null;
			if (linkTo != null)
				msgs = ((InternalEObject) linkTo).eInverseRemove(this, Component_basedPackage.EREQUIRED_ROLE__LINKED_TO,
						ERequiredRole.class, msgs);
			if (newLinkTo != null)
				msgs = ((InternalEObject) newLinkTo).eInverseAdd(this, Component_basedPackage.EREQUIRED_ROLE__LINKED_TO,
						ERequiredRole.class, msgs);
			msgs = basicSetLinkTo(newLinkTo, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_basedPackage.EASSEMBLY_CONNECTOR__LINK_TO,
					newLinkTo, newLinkTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Component_basedPackage.EASSEMBLY_CONNECTOR__LINK_TO:
			if (linkTo != null)
				msgs = ((InternalEObject) linkTo).eInverseRemove(this, Component_basedPackage.EREQUIRED_ROLE__LINKED_TO,
						ERequiredRole.class, msgs);
			return basicSetLinkTo((ERequiredRole) otherEnd, msgs);
		case Component_basedPackage.EASSEMBLY_CONNECTOR__LINK_FROM:
			if (linkFrom != null)
				msgs = ((InternalEObject) linkFrom).eInverseRemove(this,
						Component_basedPackage.EPROVIDED_ROLE__LINKED_FROM, EProvidedRole.class, msgs);
			return basicSetLinkFrom((EProvidedRole) otherEnd, msgs);
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
		case Component_basedPackage.EASSEMBLY_CONNECTOR__LINK_TO:
			return basicSetLinkTo(null, msgs);
		case Component_basedPackage.EASSEMBLY_CONNECTOR__LINK_FROM:
			return basicSetLinkFrom(null, msgs);
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
		case Component_basedPackage.EASSEMBLY_CONNECTOR__LINK_TO:
			if (resolve)
				return getLinkTo();
			return basicGetLinkTo();
		case Component_basedPackage.EASSEMBLY_CONNECTOR__LINK_FROM:
			if (resolve)
				return getLinkFrom();
			return basicGetLinkFrom();
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
		case Component_basedPackage.EASSEMBLY_CONNECTOR__LINK_TO:
			setLinkTo((ERequiredRole) newValue);
			return;
		case Component_basedPackage.EASSEMBLY_CONNECTOR__LINK_FROM:
			setLinkFrom((EProvidedRole) newValue);
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
		case Component_basedPackage.EASSEMBLY_CONNECTOR__LINK_TO:
			setLinkTo((ERequiredRole) null);
			return;
		case Component_basedPackage.EASSEMBLY_CONNECTOR__LINK_FROM:
			setLinkFrom((EProvidedRole) null);
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
		case Component_basedPackage.EASSEMBLY_CONNECTOR__LINK_TO:
			return linkTo != null;
		case Component_basedPackage.EASSEMBLY_CONNECTOR__LINK_FROM:
			return linkFrom != null;
		}
		return super.eIsSet(featureID);
	}

} //EAssemblyConnectorImpl
