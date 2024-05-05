/**
 */
package mdsd.component_based.impl;

import mdsd.component_based.Component_basedPackage;
import mdsd.component_based.EAllocationViewType;
import mdsd.component_based.EDeploymentViewPoint;
import mdsd.component_based.EEnvironmentViewType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EDeployment View Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.impl.EDeploymentViewPointImpl#getEnvironmentviewtype <em>Environmentviewtype</em>}</li>
 *   <li>{@link mdsd.component_based.impl.EDeploymentViewPointImpl#getAllocationviewtype <em>Allocationviewtype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EDeploymentViewPointImpl extends MinimalEObjectImpl.Container implements EDeploymentViewPoint {
	/**
	 * The cached value of the '{@link #getEnvironmentviewtype() <em>Environmentviewtype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironmentviewtype()
	 * @generated
	 * @ordered
	 */
	protected EEnvironmentViewType environmentviewtype;

	/**
	 * The cached value of the '{@link #getAllocationviewtype() <em>Allocationviewtype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationviewtype()
	 * @generated
	 * @ordered
	 */
	protected EAllocationViewType allocationviewtype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EDeploymentViewPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Component_basedPackage.Literals.EDEPLOYMENT_VIEW_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnvironmentViewType getEnvironmentviewtype() {
		return environmentviewtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvironmentviewtype(EEnvironmentViewType newEnvironmentviewtype,
			NotificationChain msgs) {
		EEnvironmentViewType oldEnvironmentviewtype = environmentviewtype;
		environmentviewtype = newEnvironmentviewtype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Component_basedPackage.EDEPLOYMENT_VIEW_POINT__ENVIRONMENTVIEWTYPE, oldEnvironmentviewtype,
					newEnvironmentviewtype);
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
	public void setEnvironmentviewtype(EEnvironmentViewType newEnvironmentviewtype) {
		if (newEnvironmentviewtype != environmentviewtype) {
			NotificationChain msgs = null;
			if (environmentviewtype != null)
				msgs = ((InternalEObject) environmentviewtype).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Component_basedPackage.EDEPLOYMENT_VIEW_POINT__ENVIRONMENTVIEWTYPE,
						null, msgs);
			if (newEnvironmentviewtype != null)
				msgs = ((InternalEObject) newEnvironmentviewtype).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Component_basedPackage.EDEPLOYMENT_VIEW_POINT__ENVIRONMENTVIEWTYPE,
						null, msgs);
			msgs = basicSetEnvironmentviewtype(newEnvironmentviewtype, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Component_basedPackage.EDEPLOYMENT_VIEW_POINT__ENVIRONMENTVIEWTYPE, newEnvironmentviewtype,
					newEnvironmentviewtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAllocationViewType getAllocationviewtype() {
		return allocationviewtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllocationviewtype(EAllocationViewType newAllocationviewtype,
			NotificationChain msgs) {
		EAllocationViewType oldAllocationviewtype = allocationviewtype;
		allocationviewtype = newAllocationviewtype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Component_basedPackage.EDEPLOYMENT_VIEW_POINT__ALLOCATIONVIEWTYPE, oldAllocationviewtype,
					newAllocationviewtype);
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
	public void setAllocationviewtype(EAllocationViewType newAllocationviewtype) {
		if (newAllocationviewtype != allocationviewtype) {
			NotificationChain msgs = null;
			if (allocationviewtype != null)
				msgs = ((InternalEObject) allocationviewtype).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Component_basedPackage.EDEPLOYMENT_VIEW_POINT__ALLOCATIONVIEWTYPE,
						null, msgs);
			if (newAllocationviewtype != null)
				msgs = ((InternalEObject) newAllocationviewtype).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Component_basedPackage.EDEPLOYMENT_VIEW_POINT__ALLOCATIONVIEWTYPE,
						null, msgs);
			msgs = basicSetAllocationviewtype(newAllocationviewtype, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Component_basedPackage.EDEPLOYMENT_VIEW_POINT__ALLOCATIONVIEWTYPE, newAllocationviewtype,
					newAllocationviewtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Component_basedPackage.EDEPLOYMENT_VIEW_POINT__ENVIRONMENTVIEWTYPE:
			return basicSetEnvironmentviewtype(null, msgs);
		case Component_basedPackage.EDEPLOYMENT_VIEW_POINT__ALLOCATIONVIEWTYPE:
			return basicSetAllocationviewtype(null, msgs);
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
		case Component_basedPackage.EDEPLOYMENT_VIEW_POINT__ENVIRONMENTVIEWTYPE:
			return getEnvironmentviewtype();
		case Component_basedPackage.EDEPLOYMENT_VIEW_POINT__ALLOCATIONVIEWTYPE:
			return getAllocationviewtype();
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
		case Component_basedPackage.EDEPLOYMENT_VIEW_POINT__ENVIRONMENTVIEWTYPE:
			setEnvironmentviewtype((EEnvironmentViewType) newValue);
			return;
		case Component_basedPackage.EDEPLOYMENT_VIEW_POINT__ALLOCATIONVIEWTYPE:
			setAllocationviewtype((EAllocationViewType) newValue);
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
		case Component_basedPackage.EDEPLOYMENT_VIEW_POINT__ENVIRONMENTVIEWTYPE:
			setEnvironmentviewtype((EEnvironmentViewType) null);
			return;
		case Component_basedPackage.EDEPLOYMENT_VIEW_POINT__ALLOCATIONVIEWTYPE:
			setAllocationviewtype((EAllocationViewType) null);
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
		case Component_basedPackage.EDEPLOYMENT_VIEW_POINT__ENVIRONMENTVIEWTYPE:
			return environmentviewtype != null;
		case Component_basedPackage.EDEPLOYMENT_VIEW_POINT__ALLOCATIONVIEWTYPE:
			return allocationviewtype != null;
		}
		return super.eIsSet(featureID);
	}

} //EDeploymentViewPointImpl
