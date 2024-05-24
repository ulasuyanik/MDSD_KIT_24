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
 *   <li>{@link mdsd.component_based.impl.EDeploymentViewPointImpl#getEnvironmentViewType <em>Environment View Type</em>}</li>
 *   <li>{@link mdsd.component_based.impl.EDeploymentViewPointImpl#getAllocationViewType <em>Allocation View Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EDeploymentViewPointImpl extends MinimalEObjectImpl.Container implements EDeploymentViewPoint {
	/**
	 * The cached value of the '{@link #getEnvironmentViewType() <em>Environment View Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironmentViewType()
	 * @generated
	 * @ordered
	 */
	protected EEnvironmentViewType environmentViewType;

	/**
	 * The cached value of the '{@link #getAllocationViewType() <em>Allocation View Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationViewType()
	 * @generated
	 * @ordered
	 */
	protected EAllocationViewType allocationViewType;

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
	public EEnvironmentViewType getEnvironmentViewType() {
		return environmentViewType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvironmentViewType(EEnvironmentViewType newEnvironmentViewType,
			NotificationChain msgs) {
		EEnvironmentViewType oldEnvironmentViewType = environmentViewType;
		environmentViewType = newEnvironmentViewType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Component_basedPackage.EDEPLOYMENT_VIEW_POINT__ENVIRONMENT_VIEW_TYPE, oldEnvironmentViewType,
					newEnvironmentViewType);
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
	public void setEnvironmentViewType(EEnvironmentViewType newEnvironmentViewType) {
		if (newEnvironmentViewType != environmentViewType) {
			NotificationChain msgs = null;
			if (environmentViewType != null)
				msgs = ((InternalEObject) environmentViewType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Component_basedPackage.EDEPLOYMENT_VIEW_POINT__ENVIRONMENT_VIEW_TYPE,
						null, msgs);
			if (newEnvironmentViewType != null)
				msgs = ((InternalEObject) newEnvironmentViewType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Component_basedPackage.EDEPLOYMENT_VIEW_POINT__ENVIRONMENT_VIEW_TYPE,
						null, msgs);
			msgs = basicSetEnvironmentViewType(newEnvironmentViewType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Component_basedPackage.EDEPLOYMENT_VIEW_POINT__ENVIRONMENT_VIEW_TYPE, newEnvironmentViewType,
					newEnvironmentViewType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAllocationViewType getAllocationViewType() {
		return allocationViewType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllocationViewType(EAllocationViewType newAllocationViewType,
			NotificationChain msgs) {
		EAllocationViewType oldAllocationViewType = allocationViewType;
		allocationViewType = newAllocationViewType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Component_basedPackage.EDEPLOYMENT_VIEW_POINT__ALLOCATION_VIEW_TYPE, oldAllocationViewType,
					newAllocationViewType);
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
	public void setAllocationViewType(EAllocationViewType newAllocationViewType) {
		if (newAllocationViewType != allocationViewType) {
			NotificationChain msgs = null;
			if (allocationViewType != null)
				msgs = ((InternalEObject) allocationViewType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Component_basedPackage.EDEPLOYMENT_VIEW_POINT__ALLOCATION_VIEW_TYPE,
						null, msgs);
			if (newAllocationViewType != null)
				msgs = ((InternalEObject) newAllocationViewType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Component_basedPackage.EDEPLOYMENT_VIEW_POINT__ALLOCATION_VIEW_TYPE,
						null, msgs);
			msgs = basicSetAllocationViewType(newAllocationViewType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Component_basedPackage.EDEPLOYMENT_VIEW_POINT__ALLOCATION_VIEW_TYPE, newAllocationViewType,
					newAllocationViewType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Component_basedPackage.EDEPLOYMENT_VIEW_POINT__ENVIRONMENT_VIEW_TYPE:
			return basicSetEnvironmentViewType(null, msgs);
		case Component_basedPackage.EDEPLOYMENT_VIEW_POINT__ALLOCATION_VIEW_TYPE:
			return basicSetAllocationViewType(null, msgs);
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
		case Component_basedPackage.EDEPLOYMENT_VIEW_POINT__ENVIRONMENT_VIEW_TYPE:
			return getEnvironmentViewType();
		case Component_basedPackage.EDEPLOYMENT_VIEW_POINT__ALLOCATION_VIEW_TYPE:
			return getAllocationViewType();
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
		case Component_basedPackage.EDEPLOYMENT_VIEW_POINT__ENVIRONMENT_VIEW_TYPE:
			setEnvironmentViewType((EEnvironmentViewType) newValue);
			return;
		case Component_basedPackage.EDEPLOYMENT_VIEW_POINT__ALLOCATION_VIEW_TYPE:
			setAllocationViewType((EAllocationViewType) newValue);
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
		case Component_basedPackage.EDEPLOYMENT_VIEW_POINT__ENVIRONMENT_VIEW_TYPE:
			setEnvironmentViewType((EEnvironmentViewType) null);
			return;
		case Component_basedPackage.EDEPLOYMENT_VIEW_POINT__ALLOCATION_VIEW_TYPE:
			setAllocationViewType((EAllocationViewType) null);
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
		case Component_basedPackage.EDEPLOYMENT_VIEW_POINT__ENVIRONMENT_VIEW_TYPE:
			return environmentViewType != null;
		case Component_basedPackage.EDEPLOYMENT_VIEW_POINT__ALLOCATION_VIEW_TYPE:
			return allocationViewType != null;
		}
		return super.eIsSet(featureID);
	}

} //EDeploymentViewPointImpl
