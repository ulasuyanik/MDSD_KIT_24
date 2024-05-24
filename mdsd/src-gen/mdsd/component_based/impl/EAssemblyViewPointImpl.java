/**
 */
package mdsd.component_based.impl;

import mdsd.component_based.Component_basedPackage;
import mdsd.component_based.EAssemblyViewPoint;
import mdsd.component_based.EAssemblyViewType;

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
 *   <li>{@link mdsd.component_based.impl.EAssemblyViewPointImpl#getAssemblyViewType <em>Assembly View Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EAssemblyViewPointImpl extends MinimalEObjectImpl.Container implements EAssemblyViewPoint {
	/**
	 * The cached value of the '{@link #getAssemblyViewType() <em>Assembly View Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyViewType()
	 * @generated
	 * @ordered
	 */
	protected EAssemblyViewType assemblyViewType;

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
		return Component_basedPackage.Literals.EASSEMBLY_VIEW_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAssemblyViewType getAssemblyViewType() {
		return assemblyViewType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssemblyViewType(EAssemblyViewType newAssemblyViewType, NotificationChain msgs) {
		EAssemblyViewType oldAssemblyViewType = assemblyViewType;
		assemblyViewType = newAssemblyViewType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Component_basedPackage.EASSEMBLY_VIEW_POINT__ASSEMBLY_VIEW_TYPE, oldAssemblyViewType,
					newAssemblyViewType);
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
	public void setAssemblyViewType(EAssemblyViewType newAssemblyViewType) {
		if (newAssemblyViewType != assemblyViewType) {
			NotificationChain msgs = null;
			if (assemblyViewType != null)
				msgs = ((InternalEObject) assemblyViewType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Component_basedPackage.EASSEMBLY_VIEW_POINT__ASSEMBLY_VIEW_TYPE, null,
						msgs);
			if (newAssemblyViewType != null)
				msgs = ((InternalEObject) newAssemblyViewType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Component_basedPackage.EASSEMBLY_VIEW_POINT__ASSEMBLY_VIEW_TYPE, null,
						msgs);
			msgs = basicSetAssemblyViewType(newAssemblyViewType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Component_basedPackage.EASSEMBLY_VIEW_POINT__ASSEMBLY_VIEW_TYPE, newAssemblyViewType,
					newAssemblyViewType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Component_basedPackage.EASSEMBLY_VIEW_POINT__ASSEMBLY_VIEW_TYPE:
			return basicSetAssemblyViewType(null, msgs);
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
		case Component_basedPackage.EASSEMBLY_VIEW_POINT__ASSEMBLY_VIEW_TYPE:
			return getAssemblyViewType();
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
		case Component_basedPackage.EASSEMBLY_VIEW_POINT__ASSEMBLY_VIEW_TYPE:
			setAssemblyViewType((EAssemblyViewType) newValue);
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
		case Component_basedPackage.EASSEMBLY_VIEW_POINT__ASSEMBLY_VIEW_TYPE:
			setAssemblyViewType((EAssemblyViewType) null);
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
		case Component_basedPackage.EASSEMBLY_VIEW_POINT__ASSEMBLY_VIEW_TYPE:
			return assemblyViewType != null;
		}
		return super.eIsSet(featureID);
	}

} //EAssemblyViewPointImpl
