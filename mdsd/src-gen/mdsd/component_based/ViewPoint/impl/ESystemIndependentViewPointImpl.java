/**
 */
package mdsd.component_based.ViewPoint.impl;

import mdsd.component_based.ERepositoryViewType;

import mdsd.component_based.ViewPoint.ESystemIndependentViewPoint;
import mdsd.component_based.ViewPoint.ViewPointPackage;

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
 *   <li>{@link mdsd.component_based.ViewPoint.impl.ESystemIndependentViewPointImpl#getRepositoryviewtype <em>Repositoryviewtype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ESystemIndependentViewPointImpl extends MinimalEObjectImpl.Container
		implements ESystemIndependentViewPoint {
	/**
	 * The cached value of the '{@link #getRepositoryviewtype() <em>Repositoryviewtype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositoryviewtype()
	 * @generated
	 * @ordered
	 */
	protected ERepositoryViewType repositoryviewtype;

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
		return ViewPointPackage.Literals.ESYSTEM_INDEPENDENT_VIEW_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ERepositoryViewType getRepositoryviewtype() {
		return repositoryviewtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepositoryviewtype(ERepositoryViewType newRepositoryviewtype,
			NotificationChain msgs) {
		ERepositoryViewType oldRepositoryviewtype = repositoryviewtype;
		repositoryviewtype = newRepositoryviewtype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ViewPointPackage.ESYSTEM_INDEPENDENT_VIEW_POINT__REPOSITORYVIEWTYPE, oldRepositoryviewtype,
					newRepositoryviewtype);
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
	public void setRepositoryviewtype(ERepositoryViewType newRepositoryviewtype) {
		if (newRepositoryviewtype != repositoryviewtype) {
			NotificationChain msgs = null;
			if (repositoryviewtype != null)
				msgs = ((InternalEObject) repositoryviewtype).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ViewPointPackage.ESYSTEM_INDEPENDENT_VIEW_POINT__REPOSITORYVIEWTYPE,
						null, msgs);
			if (newRepositoryviewtype != null)
				msgs = ((InternalEObject) newRepositoryviewtype).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ViewPointPackage.ESYSTEM_INDEPENDENT_VIEW_POINT__REPOSITORYVIEWTYPE,
						null, msgs);
			msgs = basicSetRepositoryviewtype(newRepositoryviewtype, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ViewPointPackage.ESYSTEM_INDEPENDENT_VIEW_POINT__REPOSITORYVIEWTYPE, newRepositoryviewtype,
					newRepositoryviewtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ViewPointPackage.ESYSTEM_INDEPENDENT_VIEW_POINT__REPOSITORYVIEWTYPE:
			return basicSetRepositoryviewtype(null, msgs);
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
		case ViewPointPackage.ESYSTEM_INDEPENDENT_VIEW_POINT__REPOSITORYVIEWTYPE:
			return getRepositoryviewtype();
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
		case ViewPointPackage.ESYSTEM_INDEPENDENT_VIEW_POINT__REPOSITORYVIEWTYPE:
			setRepositoryviewtype((ERepositoryViewType) newValue);
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
		case ViewPointPackage.ESYSTEM_INDEPENDENT_VIEW_POINT__REPOSITORYVIEWTYPE:
			setRepositoryviewtype((ERepositoryViewType) null);
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
		case ViewPointPackage.ESYSTEM_INDEPENDENT_VIEW_POINT__REPOSITORYVIEWTYPE:
			return repositoryviewtype != null;
		}
		return super.eIsSet(featureID);
	}

} //ESystemIndependentViewPointImpl
