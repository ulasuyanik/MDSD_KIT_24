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
import mdsd.component_based.EProvidedDelegationConnector;
import mdsd.component_based.EProvidedRole;
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
 * An implementation of the model object '<em><b>EProvided Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.impl.EProvidedDelegationConnectorImpl#getLinkFrom <em>Link From</em>}</li>
 *   <li>{@link mdsd.component_based.impl.EProvidedDelegationConnectorImpl#getLinkTo <em>Link To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EProvidedDelegationConnectorImpl extends EDelegationConnectorImpl implements EProvidedDelegationConnector {
	/**
	 * The cached value of the '{@link #getLinkFrom() <em>Link From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkFrom()
	 * @generated
	 * @ordered
	 */
	protected EInterface linkFrom;

	/**
	 * The cached value of the '{@link #getLinkTo() <em>Link To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkTo()
	 * @generated
	 * @ordered
	 */
	protected EProvidedRole linkTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EProvidedDelegationConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Component_basedPackage.Literals.EPROVIDED_DELEGATION_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EInterface getLinkFrom() {
		if (linkFrom != null && linkFrom.eIsProxy()) {
			InternalEObject oldLinkFrom = (InternalEObject) linkFrom;
			linkFrom = (EInterface) eResolveProxy(oldLinkFrom);
			if (linkFrom != oldLinkFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Component_basedPackage.EPROVIDED_DELEGATION_CONNECTOR__LINK_FROM, oldLinkFrom, linkFrom));
			}
		}
		return linkFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EInterface basicGetLinkFrom() {
		return linkFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkFrom(EInterface newLinkFrom) {
		EInterface oldLinkFrom = linkFrom;
		linkFrom = newLinkFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Component_basedPackage.EPROVIDED_DELEGATION_CONNECTOR__LINK_FROM, oldLinkFrom, linkFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EProvidedRole getLinkTo() {
		if (linkTo != null && linkTo.eIsProxy()) {
			InternalEObject oldLinkTo = (InternalEObject) linkTo;
			linkTo = (EProvidedRole) eResolveProxy(oldLinkTo);
			if (linkTo != oldLinkTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Component_basedPackage.EPROVIDED_DELEGATION_CONNECTOR__LINK_TO, oldLinkTo, linkTo));
			}
		}
		return linkTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EProvidedRole basicGetLinkTo() {
		return linkTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkTo(EProvidedRole newLinkTo) {
		EProvidedRole oldLinkTo = linkTo;
		linkTo = newLinkTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Component_basedPackage.EPROVIDED_DELEGATION_CONNECTOR__LINK_TO, oldLinkTo, linkTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean providedConstraint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "EProvidedDelegationConnector::providedConstraint";
		try {
			/**
			 *
			 * inv providedConstraint:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.linkFrom.providedBySystem->size() > 0 or
			 *         self.linkFrom.providedByComponent->exists(x |
			 *           x.oclIsKindOf(ECompositeComponent)) = true
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Component_basedPackage.Literals.EPROVIDED_DELEGATION_CONNECTOR___PROVIDED_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Component_basedTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ EInterface linkFrom_0 = this.getLinkFrom();
				final /*@NonInvalid*/ List<ESystem> providedBySystem = linkFrom_0.getProvidedBySystem();
				final /*@NonInvalid*/ OrderedSetValue BOXED_providedBySystem = idResolver
						.createOrderedSetOfAll(Component_basedTables.ORD_CLSSid_ESystem, providedBySystem);
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE
						.evaluate(BOXED_providedBySystem);
				final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE
						.evaluate(executor, size, Component_basedTables.INT_0).booleanValue();
				final /*@NonInvalid*/ Boolean result;
				if (gt) {
					result = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ List<EComponent> providedByComponent = linkFrom_0.getProvidedByComponent();
					final /*@NonInvalid*/ OrderedSetValue BOXED_providedByComponent = idResolver
							.createOrderedSetOfAll(Component_basedTables.ORD_CLSSid_EComponent, providedByComponent);
					/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
					Iterator<Object> ITERATOR_x = BOXED_providedByComponent.iterator();
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
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_component_based_c_c_ECompositeComponent_0 = idResolver
								.getClass(Component_basedTables.CLSSid_ECompositeComponent, null);
						final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE
								.evaluate(executor, x, TYP_component_based_c_c_ECompositeComponent_0).booleanValue();
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
		case Component_basedPackage.EPROVIDED_DELEGATION_CONNECTOR__LINK_FROM:
			if (resolve)
				return getLinkFrom();
			return basicGetLinkFrom();
		case Component_basedPackage.EPROVIDED_DELEGATION_CONNECTOR__LINK_TO:
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
		case Component_basedPackage.EPROVIDED_DELEGATION_CONNECTOR__LINK_FROM:
			setLinkFrom((EInterface) newValue);
			return;
		case Component_basedPackage.EPROVIDED_DELEGATION_CONNECTOR__LINK_TO:
			setLinkTo((EProvidedRole) newValue);
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
		case Component_basedPackage.EPROVIDED_DELEGATION_CONNECTOR__LINK_FROM:
			setLinkFrom((EInterface) null);
			return;
		case Component_basedPackage.EPROVIDED_DELEGATION_CONNECTOR__LINK_TO:
			setLinkTo((EProvidedRole) null);
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
		case Component_basedPackage.EPROVIDED_DELEGATION_CONNECTOR__LINK_FROM:
			return linkFrom != null;
		case Component_basedPackage.EPROVIDED_DELEGATION_CONNECTOR__LINK_TO:
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
		case Component_basedPackage.EPROVIDED_DELEGATION_CONNECTOR___PROVIDED_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
			return providedConstraint((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //EProvidedDelegationConnectorImpl
