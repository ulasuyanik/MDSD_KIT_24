/**
 */
package mdsd.component_based.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import mdsd.component_based.Component_basedPackage;
import mdsd.component_based.Component_basedTables;
import mdsd.component_based.EComponent;
import mdsd.component_based.EInterface;
import mdsd.component_based.ERequiredDelegationConnector;
import mdsd.component_based.ERequiredRole;
import mdsd.component_based.ESystem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ERequired Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.impl.ERequiredDelegationConnectorImpl#getLinkFrom <em>Link From</em>}</li>
 *   <li>{@link mdsd.component_based.impl.ERequiredDelegationConnectorImpl#getLinkTo <em>Link To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ERequiredDelegationConnectorImpl extends EDelegationConnectorImpl implements ERequiredDelegationConnector {
	/**
	 * The cached value of the '{@link #getLinkFrom() <em>Link From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkFrom()
	 * @generated
	 * @ordered
	 */
	protected ERequiredRole linkFrom;

	/**
	 * The cached value of the '{@link #getLinkTo() <em>Link To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkTo()
	 * @generated
	 * @ordered
	 */
	protected EInterface linkTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ERequiredDelegationConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Component_basedPackage.Literals.EREQUIRED_DELEGATION_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ERequiredRole getLinkFrom() {
		if (linkFrom != null && linkFrom.eIsProxy()) {
			InternalEObject oldLinkFrom = (InternalEObject) linkFrom;
			linkFrom = (ERequiredRole) eResolveProxy(oldLinkFrom);
			if (linkFrom != oldLinkFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Component_basedPackage.EREQUIRED_DELEGATION_CONNECTOR__LINK_FROM, oldLinkFrom, linkFrom));
			}
		}
		return linkFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERequiredRole basicGetLinkFrom() {
		return linkFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkFrom(ERequiredRole newLinkFrom) {
		ERequiredRole oldLinkFrom = linkFrom;
		linkFrom = newLinkFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Component_basedPackage.EREQUIRED_DELEGATION_CONNECTOR__LINK_FROM, oldLinkFrom, linkFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EInterface getLinkTo() {
		if (linkTo != null && linkTo.eIsProxy()) {
			InternalEObject oldLinkTo = (InternalEObject) linkTo;
			linkTo = (EInterface) eResolveProxy(oldLinkTo);
			if (linkTo != oldLinkTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Component_basedPackage.EREQUIRED_DELEGATION_CONNECTOR__LINK_TO, oldLinkTo, linkTo));
			}
		}
		return linkTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EInterface basicGetLinkTo() {
		return linkTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkTo(EInterface newLinkTo) {
		EInterface oldLinkTo = linkTo;
		linkTo = newLinkTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Component_basedPackage.EREQUIRED_DELEGATION_CONNECTOR__LINK_TO, oldLinkTo, linkTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean requiredConstraint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "ERequiredDelegationConnector::requiredConstraint";
		try {
			/**
			 *
			 * inv requiredConstraint:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.linkTo.requiredBySystem->size() > 0 or
			 *         self.linkTo.requiredByComponent->exists(x |
			 *           x.oclIsKindOf(ECompositeComponent)) = true
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Component_basedPackage.Literals.EREQUIRED_DELEGATION_CONNECTOR___REQUIRED_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Component_basedTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ EInterface linkTo_0 = this.getLinkTo();
				final /*@NonInvalid*/ List<ESystem> requiredBySystem = linkTo_0.getRequiredBySystem();
				final /*@NonInvalid*/ OrderedSetValue BOXED_requiredBySystem = idResolver
						.createOrderedSetOfAll(Component_basedTables.ORD_CLSSid_ESystem, requiredBySystem);
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE
						.evaluate(BOXED_requiredBySystem);
				final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE
						.evaluate(executor, size, Component_basedTables.INT_0).booleanValue();
				final /*@NonInvalid*/ Boolean result;
				if (gt) {
					result = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ List<EComponent> requiredByComponent = linkTo_0.getRequiredByComponent();
					final /*@NonInvalid*/ OrderedSetValue BOXED_requiredByComponent = idResolver
							.createOrderedSetOfAll(Component_basedTables.ORD_CLSSid_EComponent, requiredByComponent);
					/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
					Iterator<Object> ITERATOR_x = BOXED_requiredByComponent.iterator();
					/*@NonInvalid*/ Boolean exists;
					while (true) {
						if (!ITERATOR_x.hasNext()) {
							if (accumulator == ValueUtil.FALSE_VALUE) {
								exists = ValueUtil.FALSE_VALUE;
							} else {
								throw (InvalidValueException) accumulator;
							}
							break;
						}
						/*@NonInvalid*/ EComponent x = (EComponent) ITERATOR_x.next();
						/**
						 * x.oclIsKindOf(ECompositeComponent)
						 */
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_component_based_c_c_ECompositeComponent = idResolver
								.getClass(Component_basedTables.CLSSid_ECompositeComponent, null);
						final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE
								.evaluate(executor, x, TYP_component_based_c_c_ECompositeComponent).booleanValue();
						//
						if (oclIsKindOf) { // Normal successful body evaluation result
							exists = ValueUtil.TRUE_VALUE;
							break; // Stop immediately
						} else if (!oclIsKindOf) { // Normal unsuccessful body evaluation result
							; // Carry on
						} else { // Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
						}
					}
					final /*@NonInvalid*/ boolean eq = exists == Boolean.TRUE;
					if (eq) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						result = ValueUtil.FALSE_VALUE;
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, result, Component_basedTables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Component_basedPackage.EREQUIRED_DELEGATION_CONNECTOR__LINK_FROM:
			if (resolve)
				return getLinkFrom();
			return basicGetLinkFrom();
		case Component_basedPackage.EREQUIRED_DELEGATION_CONNECTOR__LINK_TO:
			if (resolve)
				return getLinkTo();
			return basicGetLinkTo();
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
		case Component_basedPackage.EREQUIRED_DELEGATION_CONNECTOR__LINK_FROM:
			setLinkFrom((ERequiredRole) newValue);
			return;
		case Component_basedPackage.EREQUIRED_DELEGATION_CONNECTOR__LINK_TO:
			setLinkTo((EInterface) newValue);
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
		case Component_basedPackage.EREQUIRED_DELEGATION_CONNECTOR__LINK_FROM:
			setLinkFrom((ERequiredRole) null);
			return;
		case Component_basedPackage.EREQUIRED_DELEGATION_CONNECTOR__LINK_TO:
			setLinkTo((EInterface) null);
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
		case Component_basedPackage.EREQUIRED_DELEGATION_CONNECTOR__LINK_FROM:
			return linkFrom != null;
		case Component_basedPackage.EREQUIRED_DELEGATION_CONNECTOR__LINK_TO:
			return linkTo != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case Component_basedPackage.EREQUIRED_DELEGATION_CONNECTOR___REQUIRED_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
			return requiredConstraint((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ERequiredDelegationConnectorImpl
