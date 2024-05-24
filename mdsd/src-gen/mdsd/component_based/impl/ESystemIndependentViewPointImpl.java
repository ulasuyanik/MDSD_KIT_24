/**
 */
package mdsd.component_based.impl;

import mdsd.component_based.Component_basedPackage;
import mdsd.component_based.ERepositoryViewType;
import mdsd.component_based.ESystemIndependentViewPoint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ESystem Independent View Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.impl.ESystemIndependentViewPointImpl#getRepositoryViewType <em>Repository View Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ESystemIndependentViewPointImpl extends MinimalEObjectImpl.Container
		implements ESystemIndependentViewPoint {
	/**
	 * The cached value of the '{@link #getRepositoryViewType() <em>Repository View Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositoryViewType()
	 * @generated
	 * @ordered
	 */
	protected ERepositoryViewType repositoryViewType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESystemIndependentViewPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Component_basedPackage.Literals.ESYSTEM_INDEPENDENT_VIEW_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ERepositoryViewType getRepositoryViewType() {
		return repositoryViewType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepositoryViewType(ERepositoryViewType newRepositoryViewType,
			NotificationChain msgs) {
		ERepositoryViewType oldRepositoryViewType = repositoryViewType;
		repositoryViewType = newRepositoryViewType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Component_basedPackage.ESYSTEM_INDEPENDENT_VIEW_POINT__REPOSITORY_VIEW_TYPE, oldRepositoryViewType,
					newRepositoryViewType);
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
	public void setRepositoryViewType(ERepositoryViewType newRepositoryViewType) {
		if (newRepositoryViewType != repositoryViewType) {
			NotificationChain msgs = null;
			if (repositoryViewType != null)
				msgs = ((InternalEObject) repositoryViewType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- Component_basedPackage.ESYSTEM_INDEPENDENT_VIEW_POINT__REPOSITORY_VIEW_TYPE,
						null, msgs);
			if (newRepositoryViewType != null)
				msgs = ((InternalEObject) newRepositoryViewType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- Component_basedPackage.ESYSTEM_INDEPENDENT_VIEW_POINT__REPOSITORY_VIEW_TYPE,
						null, msgs);
			msgs = basicSetRepositoryViewType(newRepositoryViewType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Component_basedPackage.ESYSTEM_INDEPENDENT_VIEW_POINT__REPOSITORY_VIEW_TYPE, newRepositoryViewType,
					newRepositoryViewType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Component_basedPackage.ESYSTEM_INDEPENDENT_VIEW_POINT__REPOSITORY_VIEW_TYPE:
			return basicSetRepositoryViewType(null, msgs);
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
		case Component_basedPackage.ESYSTEM_INDEPENDENT_VIEW_POINT__REPOSITORY_VIEW_TYPE:
			return getRepositoryViewType();
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
		case Component_basedPackage.ESYSTEM_INDEPENDENT_VIEW_POINT__REPOSITORY_VIEW_TYPE:
			setRepositoryViewType((ERepositoryViewType) newValue);
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
		case Component_basedPackage.ESYSTEM_INDEPENDENT_VIEW_POINT__REPOSITORY_VIEW_TYPE:
			setRepositoryViewType((ERepositoryViewType) null);
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
		case Component_basedPackage.ESYSTEM_INDEPENDENT_VIEW_POINT__REPOSITORY_VIEW_TYPE:
			return repositoryViewType != null;
		}
		return super.eIsSet(featureID);
	}

} //ESystemIndependentViewPointImpl
