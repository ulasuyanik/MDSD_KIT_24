/**
 */
package mdsd.component_based.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import mdsd.component_based.Component_basedPackage;
import mdsd.component_based.Component_basedTables;
import mdsd.component_based.EComponent;
import mdsd.component_based.EInterface;
import mdsd.component_based.ERole;
import mdsd.component_based.ESignature;
import mdsd.component_based.ESystem;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
 * An implementation of the model object '<em><b>EInterface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.impl.EInterfaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link mdsd.component_based.impl.EInterfaceImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link mdsd.component_based.impl.EInterfaceImpl#getResultsIn <em>Results In</em>}</li>
 *   <li>{@link mdsd.component_based.impl.EInterfaceImpl#getProvidedByComponent <em>Provided By Component</em>}</li>
 *   <li>{@link mdsd.component_based.impl.EInterfaceImpl#getProvidedBySystem <em>Provided By System</em>}</li>
 *   <li>{@link mdsd.component_based.impl.EInterfaceImpl#getRequiredByComponent <em>Required By Component</em>}</li>
 *   <li>{@link mdsd.component_based.impl.EInterfaceImpl#getRequiredBySystem <em>Required By System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EInterfaceImpl extends MinimalEObjectImpl.Container implements EInterface {
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
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected EList<ESignature> signature;

	/**
	 * The cached value of the '{@link #getResultsIn() <em>Results In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsIn()
	 * @generated
	 * @ordered
	 */
	protected EList<ERole> resultsIn;

	/**
	 * The cached value of the '{@link #getProvidedByComponent() <em>Provided By Component</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedByComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<EComponent> providedByComponent;

	/**
	 * The cached value of the '{@link #getProvidedBySystem() <em>Provided By System</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedBySystem()
	 * @generated
	 * @ordered
	 */
	protected EList<ESystem> providedBySystem;

	/**
	 * The cached value of the '{@link #getRequiredByComponent() <em>Required By Component</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredByComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<EComponent> requiredByComponent;

	/**
	 * The cached value of the '{@link #getRequiredBySystem() <em>Required By System</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredBySystem()
	 * @generated
	 * @ordered
	 */
	protected EList<ESystem> requiredBySystem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Component_basedPackage.Literals.EINTERFACE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Component_basedPackage.EINTERFACE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ESignature> getSignature() {
		if (signature == null) {
			signature = new EObjectContainmentEList<ESignature>(ESignature.class, this,
					Component_basedPackage.EINTERFACE__SIGNATURE);
		}
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ERole> getResultsIn() {
		if (resultsIn == null) {
			resultsIn = new EObjectResolvingEList<ERole>(ERole.class, this,
					Component_basedPackage.EINTERFACE__RESULTS_IN);
		}
		return resultsIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EComponent> getProvidedByComponent() {
		if (providedByComponent == null) {
			providedByComponent = new EObjectWithInverseResolvingEList.ManyInverse<EComponent>(EComponent.class, this,
					Component_basedPackage.EINTERFACE__PROVIDED_BY_COMPONENT,
					Component_basedPackage.ECOMPONENT__PROVIDES);
		}
		return providedByComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ESystem> getProvidedBySystem() {
		if (providedBySystem == null) {
			providedBySystem = new EObjectWithInverseResolvingEList.ManyInverse<ESystem>(ESystem.class, this,
					Component_basedPackage.EINTERFACE__PROVIDED_BY_SYSTEM, Component_basedPackage.ESYSTEM__PROVIDES);
		}
		return providedBySystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EComponent> getRequiredByComponent() {
		if (requiredByComponent == null) {
			requiredByComponent = new EObjectWithInverseResolvingEList.ManyInverse<EComponent>(EComponent.class, this,
					Component_basedPackage.EINTERFACE__REQUIRED_BY_COMPONENT,
					Component_basedPackage.ECOMPONENT__REQUIRES);
		}
		return requiredByComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ESystem> getRequiredBySystem() {
		if (requiredBySystem == null) {
			requiredBySystem = new EObjectWithInverseResolvingEList.ManyInverse<ESystem>(ESystem.class, this,
					Component_basedPackage.EINTERFACE__REQUIRED_BY_SYSTEM, Component_basedPackage.ESYSTEM__REQUIRES);
		}
		return requiredBySystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean interfaceRequiredByConstraint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "EInterface::interfaceRequiredByConstraint";
		try {
			/**
			 *
			 * inv interfaceRequiredByConstraint:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.requiredByComponent->size() > 0 implies
			 *         self.resultsIn->exists(x | x.oclIsKindOf(ERequiredRole))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Component_basedPackage.Literals.EINTERFACE___INTERFACE_REQUIRED_BY_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Component_basedTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<EComponent> requiredByComponent = this.getRequiredByComponent();
					final /*@NonInvalid*/ OrderedSetValue BOXED_requiredByComponent = idResolver
							.createOrderedSetOfAll(Component_basedTables.ORD_CLSSid_EComponent, requiredByComponent);
					final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE
							.evaluate(BOXED_requiredByComponent);
					final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE
							.evaluate(executor, size, Component_basedTables.INT_0).booleanValue();
					final /*@Thrown*/ Boolean result;
					if (!gt) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						final /*@NonInvalid*/ List<ERole> resultsIn = this.getResultsIn();
						final /*@NonInvalid*/ OrderedSetValue BOXED_resultsIn = idResolver
								.createOrderedSetOfAll(Component_basedTables.ORD_CLSSid_ERole, resultsIn);
						/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
						Iterator<Object> ITERATOR_x = BOXED_resultsIn.iterator();
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
							/*@NonInvalid*/ ERole x = (ERole) ITERATOR_x.next();
							/**
							 * x.oclIsKindOf(ERequiredRole)
							 */
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_component_based_c_c_ERequiredRole = idResolver
									.getClass(Component_basedTables.CLSSid_ERequiredRole, null);
							final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE
									.evaluate(executor, x, TYP_component_based_c_c_ERequiredRole).booleanValue();
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
						if (exists == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							if (exists == null) {
								result = null;
							} else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, Component_basedTables.INT_0)
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
	public boolean interfaceProvidedByConstraint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "EInterface::interfaceProvidedByConstraint";
		try {
			/**
			 *
			 * inv interfaceProvidedByConstraint:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.providedByComponent->size() > 0 implies
			 *         self.resultsIn->exists(x | x.oclIsKindOf(EProvidedRole))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Component_basedPackage.Literals.EINTERFACE___INTERFACE_PROVIDED_BY_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Component_basedTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<EComponent> providedByComponent = this.getProvidedByComponent();
					final /*@NonInvalid*/ OrderedSetValue BOXED_providedByComponent = idResolver
							.createOrderedSetOfAll(Component_basedTables.ORD_CLSSid_EComponent, providedByComponent);
					final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE
							.evaluate(BOXED_providedByComponent);
					final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE
							.evaluate(executor, size, Component_basedTables.INT_0).booleanValue();
					final /*@Thrown*/ Boolean result;
					if (!gt) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						final /*@NonInvalid*/ List<ERole> resultsIn = this.getResultsIn();
						final /*@NonInvalid*/ OrderedSetValue BOXED_resultsIn = idResolver
								.createOrderedSetOfAll(Component_basedTables.ORD_CLSSid_ERole, resultsIn);
						/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
						Iterator<Object> ITERATOR_x = BOXED_resultsIn.iterator();
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
							/*@NonInvalid*/ ERole x = (ERole) ITERATOR_x.next();
							/**
							 * x.oclIsKindOf(EProvidedRole)
							 */
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_component_based_c_c_EProvidedRole = idResolver
									.getClass(Component_basedTables.CLSSid_EProvidedRole, null);
							final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE
									.evaluate(executor, x, TYP_component_based_c_c_EProvidedRole).booleanValue();
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
						if (exists == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							if (exists == null) {
								result = null;
							} else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, Component_basedTables.INT_0)
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Component_basedPackage.EINTERFACE__PROVIDED_BY_COMPONENT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getProvidedByComponent()).basicAdd(otherEnd,
					msgs);
		case Component_basedPackage.EINTERFACE__PROVIDED_BY_SYSTEM:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getProvidedBySystem()).basicAdd(otherEnd, msgs);
		case Component_basedPackage.EINTERFACE__REQUIRED_BY_COMPONENT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRequiredByComponent()).basicAdd(otherEnd,
					msgs);
		case Component_basedPackage.EINTERFACE__REQUIRED_BY_SYSTEM:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRequiredBySystem()).basicAdd(otherEnd, msgs);
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
		case Component_basedPackage.EINTERFACE__SIGNATURE:
			return ((InternalEList<?>) getSignature()).basicRemove(otherEnd, msgs);
		case Component_basedPackage.EINTERFACE__PROVIDED_BY_COMPONENT:
			return ((InternalEList<?>) getProvidedByComponent()).basicRemove(otherEnd, msgs);
		case Component_basedPackage.EINTERFACE__PROVIDED_BY_SYSTEM:
			return ((InternalEList<?>) getProvidedBySystem()).basicRemove(otherEnd, msgs);
		case Component_basedPackage.EINTERFACE__REQUIRED_BY_COMPONENT:
			return ((InternalEList<?>) getRequiredByComponent()).basicRemove(otherEnd, msgs);
		case Component_basedPackage.EINTERFACE__REQUIRED_BY_SYSTEM:
			return ((InternalEList<?>) getRequiredBySystem()).basicRemove(otherEnd, msgs);
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
		case Component_basedPackage.EINTERFACE__NAME:
			return getName();
		case Component_basedPackage.EINTERFACE__SIGNATURE:
			return getSignature();
		case Component_basedPackage.EINTERFACE__RESULTS_IN:
			return getResultsIn();
		case Component_basedPackage.EINTERFACE__PROVIDED_BY_COMPONENT:
			return getProvidedByComponent();
		case Component_basedPackage.EINTERFACE__PROVIDED_BY_SYSTEM:
			return getProvidedBySystem();
		case Component_basedPackage.EINTERFACE__REQUIRED_BY_COMPONENT:
			return getRequiredByComponent();
		case Component_basedPackage.EINTERFACE__REQUIRED_BY_SYSTEM:
			return getRequiredBySystem();
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
		case Component_basedPackage.EINTERFACE__NAME:
			setName((String) newValue);
			return;
		case Component_basedPackage.EINTERFACE__SIGNATURE:
			getSignature().clear();
			getSignature().addAll((Collection<? extends ESignature>) newValue);
			return;
		case Component_basedPackage.EINTERFACE__RESULTS_IN:
			getResultsIn().clear();
			getResultsIn().addAll((Collection<? extends ERole>) newValue);
			return;
		case Component_basedPackage.EINTERFACE__PROVIDED_BY_COMPONENT:
			getProvidedByComponent().clear();
			getProvidedByComponent().addAll((Collection<? extends EComponent>) newValue);
			return;
		case Component_basedPackage.EINTERFACE__PROVIDED_BY_SYSTEM:
			getProvidedBySystem().clear();
			getProvidedBySystem().addAll((Collection<? extends ESystem>) newValue);
			return;
		case Component_basedPackage.EINTERFACE__REQUIRED_BY_COMPONENT:
			getRequiredByComponent().clear();
			getRequiredByComponent().addAll((Collection<? extends EComponent>) newValue);
			return;
		case Component_basedPackage.EINTERFACE__REQUIRED_BY_SYSTEM:
			getRequiredBySystem().clear();
			getRequiredBySystem().addAll((Collection<? extends ESystem>) newValue);
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
		case Component_basedPackage.EINTERFACE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Component_basedPackage.EINTERFACE__SIGNATURE:
			getSignature().clear();
			return;
		case Component_basedPackage.EINTERFACE__RESULTS_IN:
			getResultsIn().clear();
			return;
		case Component_basedPackage.EINTERFACE__PROVIDED_BY_COMPONENT:
			getProvidedByComponent().clear();
			return;
		case Component_basedPackage.EINTERFACE__PROVIDED_BY_SYSTEM:
			getProvidedBySystem().clear();
			return;
		case Component_basedPackage.EINTERFACE__REQUIRED_BY_COMPONENT:
			getRequiredByComponent().clear();
			return;
		case Component_basedPackage.EINTERFACE__REQUIRED_BY_SYSTEM:
			getRequiredBySystem().clear();
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
		case Component_basedPackage.EINTERFACE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Component_basedPackage.EINTERFACE__SIGNATURE:
			return signature != null && !signature.isEmpty();
		case Component_basedPackage.EINTERFACE__RESULTS_IN:
			return resultsIn != null && !resultsIn.isEmpty();
		case Component_basedPackage.EINTERFACE__PROVIDED_BY_COMPONENT:
			return providedByComponent != null && !providedByComponent.isEmpty();
		case Component_basedPackage.EINTERFACE__PROVIDED_BY_SYSTEM:
			return providedBySystem != null && !providedBySystem.isEmpty();
		case Component_basedPackage.EINTERFACE__REQUIRED_BY_COMPONENT:
			return requiredByComponent != null && !requiredByComponent.isEmpty();
		case Component_basedPackage.EINTERFACE__REQUIRED_BY_SYSTEM:
			return requiredBySystem != null && !requiredBySystem.isEmpty();
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
		case Component_basedPackage.EINTERFACE___INTERFACE_REQUIRED_BY_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
			return interfaceRequiredByConstraint((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case Component_basedPackage.EINTERFACE___INTERFACE_PROVIDED_BY_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
			return interfaceProvidedByConstraint((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(')');
		return result.toString();
	}

} //EInterfaceImpl
