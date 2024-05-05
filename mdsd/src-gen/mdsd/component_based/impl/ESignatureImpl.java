/**
 */
package mdsd.component_based.impl;

import java.util.Collection;

import mdsd.component_based.Component_basedPackage;
import mdsd.component_based.EParameter;
import mdsd.component_based.EService;
import mdsd.component_based.ESignature;
import mdsd.component_based.PossibleReturnTypes;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ESignature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.impl.ESignatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link mdsd.component_based.impl.ESignatureImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link mdsd.component_based.impl.ESignatureImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link mdsd.component_based.impl.ESignatureImpl#getCorrespondsTo <em>Corresponds To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ESignatureImpl extends MinimalEObjectImpl.Container implements ESignature {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected static final PossibleReturnTypes RETURN_TYPE_EDEFAULT = PossibleReturnTypes.VOID;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected PossibleReturnTypes returnType = RETURN_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<EParameter> parameter;

	/**
	 * The cached value of the '{@link #getCorrespondsTo() <em>Corresponds To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrespondsTo()
	 * @generated
	 * @ordered
	 */
	protected EList<EService> correspondsTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Component_basedPackage.Literals.ESIGNATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_basedPackage.ESIGNATURE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PossibleReturnTypes getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnType(PossibleReturnTypes newReturnType) {
		PossibleReturnTypes oldReturnType = returnType;
		returnType = newReturnType == null ? RETURN_TYPE_EDEFAULT : newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_basedPackage.ESIGNATURE__RETURN_TYPE,
					oldReturnType, returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EParameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<EParameter>(EParameter.class, this,
					Component_basedPackage.ESIGNATURE__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EService> getCorrespondsTo() {
		if (correspondsTo == null) {
			correspondsTo = new EObjectResolvingEList<EService>(EService.class, this,
					Component_basedPackage.ESIGNATURE__CORRESPONDS_TO);
		}
		return correspondsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Component_basedPackage.ESIGNATURE__PARAMETER:
			return ((InternalEList<?>) getParameter()).basicRemove(otherEnd, msgs);
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
		case Component_basedPackage.ESIGNATURE__NAME:
			return getName();
		case Component_basedPackage.ESIGNATURE__RETURN_TYPE:
			return getReturnType();
		case Component_basedPackage.ESIGNATURE__PARAMETER:
			return getParameter();
		case Component_basedPackage.ESIGNATURE__CORRESPONDS_TO:
			return getCorrespondsTo();
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
		case Component_basedPackage.ESIGNATURE__NAME:
			setName((String) newValue);
			return;
		case Component_basedPackage.ESIGNATURE__RETURN_TYPE:
			setReturnType((PossibleReturnTypes) newValue);
			return;
		case Component_basedPackage.ESIGNATURE__PARAMETER:
			getParameter().clear();
			getParameter().addAll((Collection<? extends EParameter>) newValue);
			return;
		case Component_basedPackage.ESIGNATURE__CORRESPONDS_TO:
			getCorrespondsTo().clear();
			getCorrespondsTo().addAll((Collection<? extends EService>) newValue);
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
		case Component_basedPackage.ESIGNATURE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Component_basedPackage.ESIGNATURE__RETURN_TYPE:
			setReturnType(RETURN_TYPE_EDEFAULT);
			return;
		case Component_basedPackage.ESIGNATURE__PARAMETER:
			getParameter().clear();
			return;
		case Component_basedPackage.ESIGNATURE__CORRESPONDS_TO:
			getCorrespondsTo().clear();
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
		case Component_basedPackage.ESIGNATURE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Component_basedPackage.ESIGNATURE__RETURN_TYPE:
			return returnType != RETURN_TYPE_EDEFAULT;
		case Component_basedPackage.ESIGNATURE__PARAMETER:
			return parameter != null && !parameter.isEmpty();
		case Component_basedPackage.ESIGNATURE__CORRESPONDS_TO:
			return correspondsTo != null && !correspondsTo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", returnType: ");
		result.append(returnType);
		result.append(')');
		return result.toString();
	}

} //ESignatureImpl
