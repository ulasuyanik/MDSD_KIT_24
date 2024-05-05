/**
 */
package mdsd.component_based.impl;

import mdsd.component_based.Component_basedPackage;
import mdsd.component_based.EAssemblyContext;
import mdsd.component_based.ERole;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ERole</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.impl.ERoleImpl#getRoleOf <em>Role Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ERoleImpl extends MinimalEObjectImpl.Container implements ERole {
	/**
	 * The cached value of the '{@link #getRoleOf() <em>Role Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleOf()
	 * @generated
	 * @ordered
	 */
	protected EAssemblyContext roleOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ERoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Component_basedPackage.Literals.EROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAssemblyContext getRoleOf() {
		if (roleOf != null && roleOf.eIsProxy()) {
			InternalEObject oldRoleOf = (InternalEObject) roleOf;
			roleOf = (EAssemblyContext) eResolveProxy(oldRoleOf);
			if (roleOf != oldRoleOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Component_basedPackage.EROLE__ROLE_OF,
							oldRoleOf, roleOf));
			}
		}
		return roleOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAssemblyContext basicGetRoleOf() {
		return roleOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleOf(EAssemblyContext newRoleOf) {
		EAssemblyContext oldRoleOf = roleOf;
		roleOf = newRoleOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_basedPackage.EROLE__ROLE_OF, oldRoleOf,
					roleOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Component_basedPackage.EROLE__ROLE_OF:
			if (resolve)
				return getRoleOf();
			return basicGetRoleOf();
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
		case Component_basedPackage.EROLE__ROLE_OF:
			setRoleOf((EAssemblyContext) newValue);
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
		case Component_basedPackage.EROLE__ROLE_OF:
			setRoleOf((EAssemblyContext) null);
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
		case Component_basedPackage.EROLE__ROLE_OF:
			return roleOf != null;
		}
		return super.eIsSet(featureID);
	}

} //ERoleImpl
