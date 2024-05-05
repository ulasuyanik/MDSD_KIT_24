/**
 */
package mdsd.component_based.impl;

import java.util.Collection;

import mdsd.component_based.Component_basedPackage;
import mdsd.component_based.EBehaviourDescription;
import mdsd.component_based.EBranch;
import mdsd.component_based.EExternalCall;
import mdsd.component_based.EInternalAction;
import mdsd.component_based.ELoop;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EBehaviour Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.impl.EBehaviourDescriptionImpl#getInternalAction <em>Internal Action</em>}</li>
 *   <li>{@link mdsd.component_based.impl.EBehaviourDescriptionImpl#getLoop <em>Loop</em>}</li>
 *   <li>{@link mdsd.component_based.impl.EBehaviourDescriptionImpl#getBranch <em>Branch</em>}</li>
 *   <li>{@link mdsd.component_based.impl.EBehaviourDescriptionImpl#getExternalCall <em>External Call</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EBehaviourDescriptionImpl extends MinimalEObjectImpl.Container implements EBehaviourDescription {
	/**
	 * The cached value of the '{@link #getInternalAction() <em>Internal Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalAction()
	 * @generated
	 * @ordered
	 */
	protected EList<EInternalAction> internalAction;

	/**
	 * The cached value of the '{@link #getLoop() <em>Loop</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoop()
	 * @generated
	 * @ordered
	 */
	protected EList<ELoop> loop;

	/**
	 * The cached value of the '{@link #getBranch() <em>Branch</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranch()
	 * @generated
	 * @ordered
	 */
	protected EList<EBranch> branch;

	/**
	 * The cached value of the '{@link #getExternalCall() <em>External Call</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalCall()
	 * @generated
	 * @ordered
	 */
	protected EList<EExternalCall> externalCall;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EBehaviourDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Component_basedPackage.Literals.EBEHAVIOUR_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EInternalAction> getInternalAction() {
		if (internalAction == null) {
			internalAction = new EObjectContainmentEList<EInternalAction>(EInternalAction.class, this,
					Component_basedPackage.EBEHAVIOUR_DESCRIPTION__INTERNAL_ACTION);
		}
		return internalAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ELoop> getLoop() {
		if (loop == null) {
			loop = new EObjectContainmentEList<ELoop>(ELoop.class, this,
					Component_basedPackage.EBEHAVIOUR_DESCRIPTION__LOOP);
		}
		return loop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EBranch> getBranch() {
		if (branch == null) {
			branch = new EObjectContainmentEList<EBranch>(EBranch.class, this,
					Component_basedPackage.EBEHAVIOUR_DESCRIPTION__BRANCH);
		}
		return branch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EExternalCall> getExternalCall() {
		if (externalCall == null) {
			externalCall = new EObjectContainmentEList<EExternalCall>(EExternalCall.class, this,
					Component_basedPackage.EBEHAVIOUR_DESCRIPTION__EXTERNAL_CALL);
		}
		return externalCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Component_basedPackage.EBEHAVIOUR_DESCRIPTION__INTERNAL_ACTION:
			return ((InternalEList<?>) getInternalAction()).basicRemove(otherEnd, msgs);
		case Component_basedPackage.EBEHAVIOUR_DESCRIPTION__LOOP:
			return ((InternalEList<?>) getLoop()).basicRemove(otherEnd, msgs);
		case Component_basedPackage.EBEHAVIOUR_DESCRIPTION__BRANCH:
			return ((InternalEList<?>) getBranch()).basicRemove(otherEnd, msgs);
		case Component_basedPackage.EBEHAVIOUR_DESCRIPTION__EXTERNAL_CALL:
			return ((InternalEList<?>) getExternalCall()).basicRemove(otherEnd, msgs);
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
		case Component_basedPackage.EBEHAVIOUR_DESCRIPTION__INTERNAL_ACTION:
			return getInternalAction();
		case Component_basedPackage.EBEHAVIOUR_DESCRIPTION__LOOP:
			return getLoop();
		case Component_basedPackage.EBEHAVIOUR_DESCRIPTION__BRANCH:
			return getBranch();
		case Component_basedPackage.EBEHAVIOUR_DESCRIPTION__EXTERNAL_CALL:
			return getExternalCall();
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
		case Component_basedPackage.EBEHAVIOUR_DESCRIPTION__INTERNAL_ACTION:
			getInternalAction().clear();
			getInternalAction().addAll((Collection<? extends EInternalAction>) newValue);
			return;
		case Component_basedPackage.EBEHAVIOUR_DESCRIPTION__LOOP:
			getLoop().clear();
			getLoop().addAll((Collection<? extends ELoop>) newValue);
			return;
		case Component_basedPackage.EBEHAVIOUR_DESCRIPTION__BRANCH:
			getBranch().clear();
			getBranch().addAll((Collection<? extends EBranch>) newValue);
			return;
		case Component_basedPackage.EBEHAVIOUR_DESCRIPTION__EXTERNAL_CALL:
			getExternalCall().clear();
			getExternalCall().addAll((Collection<? extends EExternalCall>) newValue);
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
		case Component_basedPackage.EBEHAVIOUR_DESCRIPTION__INTERNAL_ACTION:
			getInternalAction().clear();
			return;
		case Component_basedPackage.EBEHAVIOUR_DESCRIPTION__LOOP:
			getLoop().clear();
			return;
		case Component_basedPackage.EBEHAVIOUR_DESCRIPTION__BRANCH:
			getBranch().clear();
			return;
		case Component_basedPackage.EBEHAVIOUR_DESCRIPTION__EXTERNAL_CALL:
			getExternalCall().clear();
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
		case Component_basedPackage.EBEHAVIOUR_DESCRIPTION__INTERNAL_ACTION:
			return internalAction != null && !internalAction.isEmpty();
		case Component_basedPackage.EBEHAVIOUR_DESCRIPTION__LOOP:
			return loop != null && !loop.isEmpty();
		case Component_basedPackage.EBEHAVIOUR_DESCRIPTION__BRANCH:
			return branch != null && !branch.isEmpty();
		case Component_basedPackage.EBEHAVIOUR_DESCRIPTION__EXTERNAL_CALL:
			return externalCall != null && !externalCall.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EBehaviourDescriptionImpl
