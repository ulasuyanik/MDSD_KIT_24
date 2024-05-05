/**
 */
package mdsd.component_based.impl;

import java.util.Collection;

import mdsd.component_based.Component_basedPackage;
import mdsd.component_based.EAssemblyContext;
import mdsd.component_based.ECompositeComponent;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EComposite Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.impl.ECompositeComponentImpl#getEncapsulates <em>Encapsulates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ECompositeComponentImpl extends EComponentImpl implements ECompositeComponent {
	/**
	 * The cached value of the '{@link #getEncapsulates() <em>Encapsulates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncapsulates()
	 * @generated
	 * @ordered
	 */
	protected EList<EAssemblyContext> encapsulates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ECompositeComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Component_basedPackage.Literals.ECOMPOSITE_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EAssemblyContext> getEncapsulates() {
		if (encapsulates == null) {
			encapsulates = new EObjectWithInverseResolvingEList.ManyInverse<EAssemblyContext>(EAssemblyContext.class,
					this, Component_basedPackage.ECOMPOSITE_COMPONENT__ENCAPSULATES,
					Component_basedPackage.EASSEMBLY_CONTEXT__ENCAPSULATED_BY_COMPONENT);
		}
		return encapsulates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Component_basedPackage.ECOMPOSITE_COMPONENT__ENCAPSULATES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getEncapsulates()).basicAdd(otherEnd, msgs);
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
		case Component_basedPackage.ECOMPOSITE_COMPONENT__ENCAPSULATES:
			return ((InternalEList<?>) getEncapsulates()).basicRemove(otherEnd, msgs);
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
		case Component_basedPackage.ECOMPOSITE_COMPONENT__ENCAPSULATES:
			return getEncapsulates();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Component_basedPackage.ECOMPOSITE_COMPONENT__ENCAPSULATES:
			getEncapsulates().clear();
			getEncapsulates().addAll((Collection<? extends EAssemblyContext>) newValue);
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
		case Component_basedPackage.ECOMPOSITE_COMPONENT__ENCAPSULATES:
			getEncapsulates().clear();
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
		case Component_basedPackage.ECOMPOSITE_COMPONENT__ENCAPSULATES:
			return encapsulates != null && !encapsulates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ECompositeComponentImpl
