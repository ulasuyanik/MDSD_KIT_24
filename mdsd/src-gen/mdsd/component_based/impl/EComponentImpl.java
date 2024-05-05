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
import mdsd.component_based.EBehaviourDescription;
import mdsd.component_based.EComponent;
import mdsd.component_based.EInterface;
import mdsd.component_based.EService;
import mdsd.component_based.ESignature;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;

import org.eclipse.ocl.pivot.values.SequenceValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EComponent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.impl.EComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link mdsd.component_based.impl.EComponentImpl#getProvidesInterfaceTo <em>Provides Interface To</em>}</li>
 *   <li>{@link mdsd.component_based.impl.EComponentImpl#getBehaviourDescription <em>Behaviour Description</em>}</li>
 *   <li>{@link mdsd.component_based.impl.EComponentImpl#getUsesInterfaceFrom <em>Uses Interface From</em>}</li>
 *   <li>{@link mdsd.component_based.impl.EComponentImpl#getProvidesDirectly <em>Provides Directly</em>}</li>
 *   <li>{@link mdsd.component_based.impl.EComponentImpl#getProvides <em>Provides</em>}</li>
 *   <li>{@link mdsd.component_based.impl.EComponentImpl#getRequires <em>Requires</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EComponentImpl extends MinimalEObjectImpl.Container implements EComponent {
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
	 * The cached value of the '{@link #getProvidesInterfaceTo() <em>Provides Interface To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidesInterfaceTo()
	 * @generated
	 * @ordered
	 */
	protected EList<EComponent> providesInterfaceTo;

	/**
	 * The cached value of the '{@link #getBehaviourDescription() <em>Behaviour Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviourDescription()
	 * @generated
	 * @ordered
	 */
	protected EBehaviourDescription behaviourDescription;

	/**
	 * The cached value of the '{@link #getUsesInterfaceFrom() <em>Uses Interface From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesInterfaceFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<EComponent> usesInterfaceFrom;

	/**
	 * The cached value of the '{@link #getProvidesDirectly() <em>Provides Directly</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidesDirectly()
	 * @generated
	 * @ordered
	 */
	protected EList<EService> providesDirectly;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Component_basedPackage.Literals.ECOMPONENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Component_basedPackage.ECOMPONENT__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EComponent> getProvidesInterfaceTo() {
		if (providesInterfaceTo == null) {
			providesInterfaceTo = new EObjectWithInverseResolvingEList.ManyInverse<EComponent>(EComponent.class, this,
					Component_basedPackage.ECOMPONENT__PROVIDES_INTERFACE_TO,
					Component_basedPackage.ECOMPONENT__USES_INTERFACE_FROM);
		}
		return providesInterfaceTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EBehaviourDescription getBehaviourDescription() {
		return behaviourDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBehaviourDescription(EBehaviourDescription newBehaviourDescription,
			NotificationChain msgs) {
		EBehaviourDescription oldBehaviourDescription = behaviourDescription;
		behaviourDescription = newBehaviourDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Component_basedPackage.ECOMPONENT__BEHAVIOUR_DESCRIPTION, oldBehaviourDescription,
					newBehaviourDescription);
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
	public void setBehaviourDescription(EBehaviourDescription newBehaviourDescription) {
		if (newBehaviourDescription != behaviourDescription) {
			NotificationChain msgs = null;
			if (behaviourDescription != null)
				msgs = ((InternalEObject) behaviourDescription).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Component_basedPackage.ECOMPONENT__BEHAVIOUR_DESCRIPTION, null, msgs);
			if (newBehaviourDescription != null)
				msgs = ((InternalEObject) newBehaviourDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Component_basedPackage.ECOMPONENT__BEHAVIOUR_DESCRIPTION, null, msgs);
			msgs = basicSetBehaviourDescription(newBehaviourDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Component_basedPackage.ECOMPONENT__BEHAVIOUR_DESCRIPTION, newBehaviourDescription,
					newBehaviourDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EComponent> getUsesInterfaceFrom() {
		if (usesInterfaceFrom == null) {
			usesInterfaceFrom = new EObjectWithInverseResolvingEList.ManyInverse<EComponent>(EComponent.class, this,
					Component_basedPackage.ECOMPONENT__USES_INTERFACE_FROM,
					Component_basedPackage.ECOMPONENT__PROVIDES_INTERFACE_TO);
		}
		return usesInterfaceFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EService> getProvidesDirectly() {
		if (providesDirectly == null) {
			providesDirectly = new EObjectResolvingEList<EService>(EService.class, this,
					Component_basedPackage.ECOMPONENT__PROVIDES_DIRECTLY);
		}
		return providesDirectly;
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
					Component_basedPackage.ECOMPONENT__PROVIDES,
					Component_basedPackage.EINTERFACE__PROVIDED_BY_COMPONENT);
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
					Component_basedPackage.ECOMPONENT__REQUIRES,
					Component_basedPackage.EINTERFACE__REQUIRED_BY_COMPONENT);
		}
		return requires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean providesConstraint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "EComponent::providesConstraint";
		try {
			/**
			 *
			 * inv providesConstraint:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.provides->size() > 0 implies
			 *         self.provides.signature.correspondsTo->size() > 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Component_basedPackage.Literals.ECOMPONENT___PROVIDES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Component_basedTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ List<EInterface> provides = this.getProvides();
				final /*@NonInvalid*/ OrderedSetValue BOXED_provides = idResolver
						.createOrderedSetOfAll(Component_basedTables.ORD_CLSSid_EInterface, provides);
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_provides);
				final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE
						.evaluate(executor, size, Component_basedTables.INT_0).booleanValue();
				final /*@NonInvalid*/ Boolean result;
				if (!gt) {
					result = ValueUtil.TRUE_VALUE;
				} else {
					/*@Thrown*/ Accumulator accumulator = ValueUtil
							.createSequenceAccumulatorValue(Component_basedTables.SEQ_CLSSid_ESignature);
					Iterator<Object> ITERATOR__1 = BOXED_provides.iterator();
					/*@NonInvalid*/ SequenceValue collect_0;
					while (true) {
						if (!ITERATOR__1.hasNext()) {
							collect_0 = accumulator;
							break;
						}
						/*@NonInvalid*/ EInterface _1 = (EInterface) ITERATOR__1.next();
						/**
						 * signature
						 */
						final /*@NonInvalid*/ List<ESignature> signature = _1.getSignature();
						final /*@NonInvalid*/ OrderedSetValue BOXED_signature = idResolver
								.createOrderedSetOfAll(Component_basedTables.ORD_CLSSid_ESignature, signature);
						//
						for (Object value : BOXED_signature.flatten().getElements()) {
							accumulator.add(value);
						}
					}
					/*@Thrown*/ Accumulator accumulator_0 = ValueUtil
							.createSequenceAccumulatorValue(Component_basedTables.SEQ_CLSSid_EService);
					Iterator<Object> ITERATOR__1_0 = collect_0.iterator();
					/*@NonInvalid*/ SequenceValue collect;
					while (true) {
						if (!ITERATOR__1_0.hasNext()) {
							collect = accumulator_0;
							break;
						}
						/*@NonInvalid*/ ESignature _1_0 = (ESignature) ITERATOR__1_0.next();
						/**
						 * correspondsTo
						 */
						final /*@NonInvalid*/ List<EService> correspondsTo = _1_0.getCorrespondsTo();
						final /*@NonInvalid*/ OrderedSetValue BOXED_correspondsTo = idResolver
								.createOrderedSetOfAll(Component_basedTables.ORD_CLSSid_EService, correspondsTo);
						//
						for (Object value : BOXED_correspondsTo.flatten().getElements()) {
							accumulator_0.add(value);
						}
					}
					final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE.evaluate(collect);
					final /*@NonInvalid*/ boolean gt_0 = OclComparableGreaterThanOperation.INSTANCE
							.evaluate(executor, size_0, Component_basedTables.INT_0).booleanValue();
					if (gt_0) {
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Component_basedPackage.ECOMPONENT__PROVIDES_INTERFACE_TO:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getProvidesInterfaceTo()).basicAdd(otherEnd,
					msgs);
		case Component_basedPackage.ECOMPONENT__USES_INTERFACE_FROM:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getUsesInterfaceFrom()).basicAdd(otherEnd,
					msgs);
		case Component_basedPackage.ECOMPONENT__PROVIDES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getProvides()).basicAdd(otherEnd, msgs);
		case Component_basedPackage.ECOMPONENT__REQUIRES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRequires()).basicAdd(otherEnd, msgs);
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
		case Component_basedPackage.ECOMPONENT__PROVIDES_INTERFACE_TO:
			return ((InternalEList<?>) getProvidesInterfaceTo()).basicRemove(otherEnd, msgs);
		case Component_basedPackage.ECOMPONENT__BEHAVIOUR_DESCRIPTION:
			return basicSetBehaviourDescription(null, msgs);
		case Component_basedPackage.ECOMPONENT__USES_INTERFACE_FROM:
			return ((InternalEList<?>) getUsesInterfaceFrom()).basicRemove(otherEnd, msgs);
		case Component_basedPackage.ECOMPONENT__PROVIDES:
			return ((InternalEList<?>) getProvides()).basicRemove(otherEnd, msgs);
		case Component_basedPackage.ECOMPONENT__REQUIRES:
			return ((InternalEList<?>) getRequires()).basicRemove(otherEnd, msgs);
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
		case Component_basedPackage.ECOMPONENT__NAME:
			return getName();
		case Component_basedPackage.ECOMPONENT__PROVIDES_INTERFACE_TO:
			return getProvidesInterfaceTo();
		case Component_basedPackage.ECOMPONENT__BEHAVIOUR_DESCRIPTION:
			return getBehaviourDescription();
		case Component_basedPackage.ECOMPONENT__USES_INTERFACE_FROM:
			return getUsesInterfaceFrom();
		case Component_basedPackage.ECOMPONENT__PROVIDES_DIRECTLY:
			return getProvidesDirectly();
		case Component_basedPackage.ECOMPONENT__PROVIDES:
			return getProvides();
		case Component_basedPackage.ECOMPONENT__REQUIRES:
			return getRequires();
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
		case Component_basedPackage.ECOMPONENT__NAME:
			setName((String) newValue);
			return;
		case Component_basedPackage.ECOMPONENT__PROVIDES_INTERFACE_TO:
			getProvidesInterfaceTo().clear();
			getProvidesInterfaceTo().addAll((Collection<? extends EComponent>) newValue);
			return;
		case Component_basedPackage.ECOMPONENT__BEHAVIOUR_DESCRIPTION:
			setBehaviourDescription((EBehaviourDescription) newValue);
			return;
		case Component_basedPackage.ECOMPONENT__USES_INTERFACE_FROM:
			getUsesInterfaceFrom().clear();
			getUsesInterfaceFrom().addAll((Collection<? extends EComponent>) newValue);
			return;
		case Component_basedPackage.ECOMPONENT__PROVIDES_DIRECTLY:
			getProvidesDirectly().clear();
			getProvidesDirectly().addAll((Collection<? extends EService>) newValue);
			return;
		case Component_basedPackage.ECOMPONENT__PROVIDES:
			getProvides().clear();
			getProvides().addAll((Collection<? extends EInterface>) newValue);
			return;
		case Component_basedPackage.ECOMPONENT__REQUIRES:
			getRequires().clear();
			getRequires().addAll((Collection<? extends EInterface>) newValue);
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
		case Component_basedPackage.ECOMPONENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Component_basedPackage.ECOMPONENT__PROVIDES_INTERFACE_TO:
			getProvidesInterfaceTo().clear();
			return;
		case Component_basedPackage.ECOMPONENT__BEHAVIOUR_DESCRIPTION:
			setBehaviourDescription((EBehaviourDescription) null);
			return;
		case Component_basedPackage.ECOMPONENT__USES_INTERFACE_FROM:
			getUsesInterfaceFrom().clear();
			return;
		case Component_basedPackage.ECOMPONENT__PROVIDES_DIRECTLY:
			getProvidesDirectly().clear();
			return;
		case Component_basedPackage.ECOMPONENT__PROVIDES:
			getProvides().clear();
			return;
		case Component_basedPackage.ECOMPONENT__REQUIRES:
			getRequires().clear();
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
		case Component_basedPackage.ECOMPONENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Component_basedPackage.ECOMPONENT__PROVIDES_INTERFACE_TO:
			return providesInterfaceTo != null && !providesInterfaceTo.isEmpty();
		case Component_basedPackage.ECOMPONENT__BEHAVIOUR_DESCRIPTION:
			return behaviourDescription != null;
		case Component_basedPackage.ECOMPONENT__USES_INTERFACE_FROM:
			return usesInterfaceFrom != null && !usesInterfaceFrom.isEmpty();
		case Component_basedPackage.ECOMPONENT__PROVIDES_DIRECTLY:
			return providesDirectly != null && !providesDirectly.isEmpty();
		case Component_basedPackage.ECOMPONENT__PROVIDES:
			return provides != null && !provides.isEmpty();
		case Component_basedPackage.ECOMPONENT__REQUIRES:
			return requires != null && !requires.isEmpty();
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
		case Component_basedPackage.ECOMPONENT___PROVIDES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
			return providesConstraint((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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

} //EComponentImpl
