/**
 */
package mdsd.component_based.impl;

import java.util.Collection;

import mdsd.component_based.Component_basedPackage;
import mdsd.component_based.EAssemblyContext;
import mdsd.component_based.EInterface;
import mdsd.component_based.ESystem;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ESystem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.impl.ESystemImpl#getProvides <em>Provides</em>}</li>
 *   <li>{@link mdsd.component_based.impl.ESystemImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link mdsd.component_based.impl.ESystemImpl#getEncapsulates <em>Encapsulates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ESystemImpl extends MinimalEObjectImpl.Container implements ESystem {
	/**
	 * The cached value of the '{@link #getProvides() <em>Provides</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvides()
	 * @generated
	 * @ordered
	 */
	protected EList<EInterface> provides;

	/**
	 * The cached value of the '{@link #getRequires() <em>Requires</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequires()
	 * @generated
	 * @ordered
	 */
	protected EList<EInterface> requires;

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
	protected ESystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Component_basedPackage.Literals.ESYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EInterface> getProvides() {
		if (provides == null) {
			provides = new EObjectWithInverseResolvingEList.ManyInverse<EInterface>(EInterface.class, this,
					Component_basedPackage.ESYSTEM__PROVIDES, Component_basedPackage.EINTERFACE__PROVIDED_BY_SYSTEM);
		}
		return provides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EInterface> getRequires() {
		if (requires == null) {
			requires = new EObjectWithInverseResolvingEList.ManyInverse<EInterface>(EInterface.class, this,
					Component_basedPackage.ESYSTEM__REQUIRES, Component_basedPackage.EINTERFACE__REQUIRED_BY_SYSTEM);
		}
		return requires;
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
					this, Component_basedPackage.ESYSTEM__ENCAPSULATES,
					Component_basedPackage.EASSEMBLY_CONTEXT__ENCAPSULATED_BY_SYSTEM);
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
		case Component_basedPackage.ESYSTEM__PROVIDES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getProvides()).basicAdd(otherEnd, msgs);
		case Component_basedPackage.ESYSTEM__REQUIRES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRequires()).basicAdd(otherEnd, msgs);
		case Component_basedPackage.ESYSTEM__ENCAPSULATES:
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
		case Component_basedPackage.ESYSTEM__PROVIDES:
			return ((InternalEList<?>) getProvides()).basicRemove(otherEnd, msgs);
		case Component_basedPackage.ESYSTEM__REQUIRES:
			return ((InternalEList<?>) getRequires()).basicRemove(otherEnd, msgs);
		case Component_basedPackage.ESYSTEM__ENCAPSULATES:
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
		case Component_basedPackage.ESYSTEM__PROVIDES:
			return getProvides();
		case Component_basedPackage.ESYSTEM__REQUIRES:
			return getRequires();
		case Component_basedPackage.ESYSTEM__ENCAPSULATES:
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
		case Component_basedPackage.ESYSTEM__PROVIDES:
			getProvides().clear();
			getProvides().addAll((Collection<? extends EInterface>) newValue);
			return;
		case Component_basedPackage.ESYSTEM__REQUIRES:
			getRequires().clear();
			getRequires().addAll((Collection<? extends EInterface>) newValue);
			return;
		case Component_basedPackage.ESYSTEM__ENCAPSULATES:
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
		case Component_basedPackage.ESYSTEM__PROVIDES:
			getProvides().clear();
			return;
		case Component_basedPackage.ESYSTEM__REQUIRES:
			getRequires().clear();
			return;
		case Component_basedPackage.ESYSTEM__ENCAPSULATES:
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
		case Component_basedPackage.ESYSTEM__PROVIDES:
			return provides != null && !provides.isEmpty();
		case Component_basedPackage.ESYSTEM__REQUIRES:
			return requires != null && !requires.isEmpty();
		case Component_basedPackage.ESYSTEM__ENCAPSULATES:
			return encapsulates != null && !encapsulates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ESystemImpl
