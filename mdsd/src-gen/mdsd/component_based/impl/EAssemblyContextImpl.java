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
import mdsd.component_based.EAssemblyConnector;
import mdsd.component_based.EAssemblyContext;
import mdsd.component_based.EComponent;
import mdsd.component_based.ECompositeComponent;
import mdsd.component_based.EContainer;
import mdsd.component_based.EInterface;
import mdsd.component_based.ELink;
import mdsd.component_based.EProvidedRole;
import mdsd.component_based.ERequiredRole;
import mdsd.component_based.ERole;
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

import org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.BagValue;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SetValue;

import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EAssembly Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.impl.EAssemblyContextImpl#getName <em>Name</em>}</li>
 *   <li>{@link mdsd.component_based.impl.EAssemblyContextImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link mdsd.component_based.impl.EAssemblyContextImpl#getAllocated <em>Allocated</em>}</li>
 *   <li>{@link mdsd.component_based.impl.EAssemblyContextImpl#getEncapsulatedByComponent <em>Encapsulated By Component</em>}</li>
 *   <li>{@link mdsd.component_based.impl.EAssemblyContextImpl#getEncapsulatedBySystem <em>Encapsulated By System</em>}</li>
 *   <li>{@link mdsd.component_based.impl.EAssemblyContextImpl#getInstantiates <em>Instantiates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EAssemblyContextImpl extends MinimalEObjectImpl.Container implements EAssemblyContext {
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
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<ERole> roles;

	/**
	 * The cached value of the '{@link #getAllocated() <em>Allocated</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocated()
	 * @generated
	 * @ordered
	 */
	protected EContainer allocated;

	/**
	 * The cached value of the '{@link #getEncapsulatedByComponent() <em>Encapsulated By Component</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncapsulatedByComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<ECompositeComponent> encapsulatedByComponent;

	/**
	 * The cached value of the '{@link #getEncapsulatedBySystem() <em>Encapsulated By System</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncapsulatedBySystem()
	 * @generated
	 * @ordered
	 */
	protected EList<ESystem> encapsulatedBySystem;

	/**
	 * The cached value of the '{@link #getInstantiates() <em>Instantiates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiates()
	 * @generated
	 * @ordered
	 */
	protected EList<EComponent> instantiates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EAssemblyContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Component_basedPackage.Literals.EASSEMBLY_CONTEXT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Component_basedPackage.EASSEMBLY_CONTEXT__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ERole> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<ERole>(ERole.class, this,
					Component_basedPackage.EASSEMBLY_CONTEXT__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EContainer getAllocated() {
		if (allocated != null && allocated.eIsProxy()) {
			InternalEObject oldAllocated = (InternalEObject) allocated;
			allocated = (EContainer) eResolveProxy(oldAllocated);
			if (allocated != oldAllocated) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Component_basedPackage.EASSEMBLY_CONTEXT__ALLOCATED, oldAllocated, allocated));
			}
		}
		return allocated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EContainer basicGetAllocated() {
		return allocated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllocated(EContainer newAllocated) {
		EContainer oldAllocated = allocated;
		allocated = newAllocated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_basedPackage.EASSEMBLY_CONTEXT__ALLOCATED,
					oldAllocated, allocated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ECompositeComponent> getEncapsulatedByComponent() {
		if (encapsulatedByComponent == null) {
			encapsulatedByComponent = new EObjectWithInverseResolvingEList.ManyInverse<ECompositeComponent>(
					ECompositeComponent.class, this,
					Component_basedPackage.EASSEMBLY_CONTEXT__ENCAPSULATED_BY_COMPONENT,
					Component_basedPackage.ECOMPOSITE_COMPONENT__ENCAPSULATES);
		}
		return encapsulatedByComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ESystem> getEncapsulatedBySystem() {
		if (encapsulatedBySystem == null) {
			encapsulatedBySystem = new EObjectWithInverseResolvingEList.ManyInverse<ESystem>(ESystem.class, this,
					Component_basedPackage.EASSEMBLY_CONTEXT__ENCAPSULATED_BY_SYSTEM,
					Component_basedPackage.ESYSTEM__ENCAPSULATES);
		}
		return encapsulatedBySystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EComponent> getInstantiates() {
		if (instantiates == null) {
			instantiates = new EObjectResolvingEList<EComponent>(EComponent.class, this,
					Component_basedPackage.EASSEMBLY_CONTEXT__INSTANTIATES);
		}
		return instantiates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean encapsulationConstraint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "EAssemblyContext::encapsulationConstraint";
		try {
			/**
			 *
			 * inv encapsulationConstraint:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = self->select(x |
			 *           (
			 *             self.encapsulatedBySystem->size() = 0 and
			 *             self.encapsulatedByComponent->size() > 0
			 *           ))
			 *         .allocated->size() = 0 = true
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Component_basedPackage.Literals.EASSEMBLY_CONTEXT___ENCAPSULATION_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Component_basedTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_eq_0;
				try {
					final /*@NonInvalid*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor,
							Component_basedTables.SET_CLSSid_EAssemblyContext, this);
					/*@Thrown*/ Accumulator accumulator = ValueUtil
							.createSetAccumulatorValue(Component_basedTables.SET_CLSSid_EAssemblyContext);
					Iterator<Object> ITERATOR_x = oclAsSet.iterator();
					/*@Thrown*/ SetValue select;
					while (true) {
						if (!ITERATOR_x.hasNext()) {
							select = accumulator;
							break;
						}
						/*@NonInvalid*/ EAssemblyContext x = (EAssemblyContext) ITERATOR_x.next();
						/**
						 *
						 * self.encapsulatedBySystem->size() = 0 and
						 * self.encapsulatedByComponent->size() > 0
						 */
						final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
						final /*@NonInvalid*/ List<ESystem> encapsulatedBySystem = this.getEncapsulatedBySystem();
						final /*@NonInvalid*/ OrderedSetValue BOXED_encapsulatedBySystem = idResolver
								.createOrderedSetOfAll(Component_basedTables.ORD_CLSSid_ESystem, encapsulatedBySystem);
						final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE
								.evaluate(BOXED_encapsulatedBySystem);
						final /*@NonInvalid*/ boolean eq = size.equals(Component_basedTables.INT_0);
						final /*@NonInvalid*/ Boolean and;
						if (!eq) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							final /*@NonInvalid*/ List<ECompositeComponent> encapsulatedByComponent = this
									.getEncapsulatedByComponent();
							final /*@NonInvalid*/ OrderedSetValue BOXED_encapsulatedByComponent = idResolver
									.createOrderedSetOfAll(Component_basedTables.ORD_CLSSid_ECompositeComponent,
											encapsulatedByComponent);
							final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE
									.evaluate(BOXED_encapsulatedByComponent);
							final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE
									.evaluate(executor, size_0, Component_basedTables.INT_0).booleanValue();
							if (!gt) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								and = ValueUtil.TRUE_VALUE;
							}
						}
						if (and == null) {
							throw new InvalidValueException(
									"Null body for \'Set(T).select(Set.T[?] | Lambda T() : Boolean[1]) : Set(T)\'");
						}
						//
						if (and == ValueUtil.TRUE_VALUE) {
							accumulator.add(x);
						}
					}
					/*@Thrown*/ org.eclipse.ocl.pivot.values.BagValue.Accumulator accumulator_0 = ValueUtil
							.createBagAccumulatorValue(Component_basedTables.BAG_CLSSid_EContainer);
					Iterator<Object> ITERATOR__1 = select.iterator();
					/*@Thrown*/ BagValue collect;
					while (true) {
						if (!ITERATOR__1.hasNext()) {
							collect = accumulator_0;
							break;
						}
						/*@NonInvalid*/ EAssemblyContext _1 = (EAssemblyContext) ITERATOR__1.next();
						/**
						 * allocated
						 */
						final /*@NonInvalid*/ EContainer allocated = _1.getAllocated();
						//
						accumulator_0.add(allocated);
					}
					final /*@Thrown*/ IntegerValue size_1 = CollectionSizeOperation.INSTANCE.evaluate(collect);
					final /*@Thrown*/ boolean eq_0 = size_1.equals(Component_basedTables.INT_0);
					CAUGHT_eq_0 = eq_0;
				} catch (Exception e) {
					CAUGHT_eq_0 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_eq_0, Component_basedTables.INT_0)
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
	public boolean connectorConstraint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "EAssemblyContext::connectorConstraint";
		try {
			/**
			 *
			 * inv connectorConstraint:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = let x : EAssemblyContext[1] = self
			 *         in
			 *           let y : EAssemblyContext[1] = self
			 *           in
			 *             y.roles->oclAsType(ERequiredRole)
			 *             ->select(element |
			 *               x.roles->oclAsType(EProvidedRole).linkedFrom.linkTo)
			 *             ->size() > 0 implies x.allocated = y.allocated or
			 *             x.allocated->select(element | y.allocated.connectedTo.connects)
			 *             ->size() > 0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Component_basedPackage.Literals.EASSEMBLY_CONTEXT___CONNECTOR_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Component_basedTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_implies;
				try {
					/*@Caught*/ Object CAUGHT_gt;
					try {
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_component_based_c_c_ERequiredRole_0 = idResolver
								.getClass(Component_basedTables.CLSSid_ERequiredRole, null);
						final /*@NonInvalid*/ List<ERole> roles = this.getRoles();
						final /*@NonInvalid*/ OrderedSetValue BOXED_roles = idResolver
								.createOrderedSetOfAll(Component_basedTables.ORD_CLSSid_ERole, roles);
						final /*@Thrown*/ ERequiredRole oclAsType = (ERequiredRole) OclAnyOclAsTypeOperation.INSTANCE
								.evaluate(executor, BOXED_roles, TYP_component_based_c_c_ERequiredRole_0);
						final /*@Thrown*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor,
								Component_basedTables.SET_CLSSid_ERequiredRole, oclAsType);
						/*@Thrown*/ Accumulator accumulator = ValueUtil
								.createSetAccumulatorValue(Component_basedTables.SET_CLSSid_ERequiredRole);
						Iterator<Object> ITERATOR_element = oclAsSet.iterator();
						/*@Thrown*/ SetValue select;
						while (true) {
							if (!ITERATOR_element.hasNext()) {
								select = accumulator;
								break;
							}
							/*@NonInvalid*/ ERequiredRole element = (ERequiredRole) ITERATOR_element.next();
							/**
							 * x.roles->oclAsType(EProvidedRole).linkedFrom.linkTo
							 */
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_component_based_c_c_EProvidedRole_0 = idResolver
									.getClass(Component_basedTables.CLSSid_EProvidedRole, null);
							final /*@NonInvalid*/ List<ERole> roles_0 = this.getRoles();
							final /*@NonInvalid*/ OrderedSetValue BOXED_roles_0 = idResolver
									.createOrderedSetOfAll(Component_basedTables.ORD_CLSSid_ERole, roles_0);
							final /*@Thrown*/ EProvidedRole oclAsType_0 = (EProvidedRole) OclAnyOclAsTypeOperation.INSTANCE
									.evaluate(executor, BOXED_roles_0, TYP_component_based_c_c_EProvidedRole_0);
							final /*@Thrown*/ EAssemblyConnector linkedFrom = oclAsType_0.getLinkedFrom();
							if (linkedFrom == null) {
								throw new InvalidValueException(
										"Null source for \'\'http://www.example.org/component_based\'::EAssemblyConnector::linkTo\'");
							}
							final /*@Thrown*/ ERequiredRole linkTo = linkedFrom.getLinkTo();
							//
							throw new InvalidValueException("Non-Boolean body for \'\'{0}\'\'", "select");
						}
						final /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
						final /*@Thrown*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE
								.evaluate(executor, size, Component_basedTables.INT_0).booleanValue();
						CAUGHT_gt = gt;
					} catch (Exception e) {
						CAUGHT_gt = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean implies;
					if (CAUGHT_gt == ValueUtil.FALSE_VALUE) {
						implies = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_or;
						try {
							final /*@NonInvalid*/ EContainer allocated = this.getAllocated();
							final /*@NonInvalid*/ EContainer allocated_0 = this.getAllocated();
							final /*@NonInvalid*/ boolean eq = (allocated != null) ? allocated.equals(allocated_0)
									: (allocated_0 == null);
							final /*@Thrown*/ Boolean or;
							if (eq) {
								or = ValueUtil.TRUE_VALUE;
							} else {
								/*@Caught*/ Object CAUGHT_gt_0;
								try {
									final /*@Thrown*/ SetValue oclAsSet_0 = OclAnyOclAsSetOperation.INSTANCE
											.evaluate(executor, Component_basedTables.SET_CLSSid_EContainer, allocated);
									/*@Thrown*/ Accumulator accumulator_0 = ValueUtil
											.createSetAccumulatorValue(Component_basedTables.SET_CLSSid_EContainer);
									Iterator<Object> ITERATOR_element_0 = oclAsSet_0.iterator();
									/*@Thrown*/ SetValue select_0;
									while (true) {
										if (!ITERATOR_element_0.hasNext()) {
											select_0 = accumulator_0;
											break;
										}
										/*@NonInvalid*/ EContainer element_0 = (EContainer) ITERATOR_element_0.next();
										/**
										 * y.allocated.connectedTo.connects
										 */
										if (allocated_0 == null) {
											throw new InvalidValueException(
													"Null source for \'\'http://www.example.org/component_based\'::EContainer::connectedTo\'");
										}
										final /*@Thrown*/ List<ELink> connectedTo = allocated_0.getConnectedTo();
										final /*@Thrown*/ OrderedSetValue BOXED_connectedTo = idResolver
												.createOrderedSetOfAll(Component_basedTables.ORD_CLSSid_ELink,
														connectedTo);
										/*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue.Accumulator accumulator_1 = ValueUtil
												.createSequenceAccumulatorValue(
														Component_basedTables.SEQ_CLSSid_EContainer);
										Iterator<Object> ITERATOR__1 = BOXED_connectedTo.iterator();
										/*@Thrown*/ SequenceValue collect;
										while (true) {
											if (!ITERATOR__1.hasNext()) {
												collect = accumulator_1;
												break;
											}
											/*@NonInvalid*/ ELink _1 = (ELink) ITERATOR__1.next();
											/**
											 * connects
											 */
											final /*@NonInvalid*/ List<EContainer> connects = _1.getConnects();
											final /*@NonInvalid*/ OrderedSetValue BOXED_connects = idResolver
													.createOrderedSetOfAll(Component_basedTables.ORD_CLSSid_EContainer,
															connects);
											//
											for (Object value : BOXED_connects.flatten().getElements()) {
												accumulator_1.add(value);
											}
										}
										//
										throw new InvalidValueException("Non-Boolean body for \'\'{0}\'\'", "select");
									}
									final /*@Thrown*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE
											.evaluate(select_0);
									final /*@Thrown*/ boolean gt_0 = OclComparableGreaterThanOperation.INSTANCE
											.evaluate(executor, size_0, Component_basedTables.INT_0).booleanValue();
									CAUGHT_gt_0 = gt_0;
								} catch (Exception e) {
									CAUGHT_gt_0 = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_gt_0 == ValueUtil.TRUE_VALUE) {
									or = ValueUtil.TRUE_VALUE;
								} else {
									if (CAUGHT_gt_0 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_gt_0;
									}
									or = ValueUtil.FALSE_VALUE;
								}
							}
							CAUGHT_or = or;
						} catch (Exception e) {
							CAUGHT_or = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_or == ValueUtil.TRUE_VALUE) {
							implies = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_gt instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_gt;
							}
							if (CAUGHT_or instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_or;
							}
							if (CAUGHT_or == null) {
								implies = null;
							} else {
								implies = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_implies = implies;
				} catch (Exception e) {
					CAUGHT_implies = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_implies, Component_basedTables.INT_0)
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
	public boolean providesRole(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "EAssemblyContext::providesRole";
		try {
			/**
			 *
			 * inv providesRole:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.instantiates.provides->notEmpty() implies
			 *         self.instantiates.provides.resultsIn->exists(x |
			 *           x.oclIsKindOf(EProvidedRole)) = true
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Component_basedPackage.Literals.EASSEMBLY_CONTEXT___PROVIDES_ROLE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Component_basedTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ List<EComponent> instantiates = this.getInstantiates();
				final /*@NonInvalid*/ OrderedSetValue BOXED_instantiates = idResolver
						.createOrderedSetOfAll(Component_basedTables.ORD_CLSSid_EComponent, instantiates);
				/*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue.Accumulator accumulator = ValueUtil
						.createSequenceAccumulatorValue(Component_basedTables.SEQ_CLSSid_EInterface);
				Iterator<Object> ITERATOR__1 = BOXED_instantiates.iterator();
				/*@NonInvalid*/ SequenceValue collect;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						collect = accumulator;
						break;
					}
					/*@NonInvalid*/ EComponent _1 = (EComponent) ITERATOR__1.next();
					/**
					 * provides
					 */
					final /*@NonInvalid*/ List<EInterface> provides = _1.getProvides();
					final /*@NonInvalid*/ OrderedSetValue BOXED_provides = idResolver
							.createOrderedSetOfAll(Component_basedTables.ORD_CLSSid_EInterface, provides);
					//
					for (Object value : BOXED_provides.flatten().getElements()) {
						accumulator.add(value);
					}
				}
				final /*@NonInvalid*/ boolean notEmpty = CollectionNotEmptyOperation.INSTANCE.evaluate(collect)
						.booleanValue();
				final /*@NonInvalid*/ Boolean result;
				if (!notEmpty) {
					result = ValueUtil.TRUE_VALUE;
				} else {
					/*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue.Accumulator accumulator_0 = ValueUtil
							.createSequenceAccumulatorValue(Component_basedTables.SEQ_CLSSid_ERole);
					Iterator<Object> ITERATOR__1_1 = collect.iterator();
					/*@NonInvalid*/ SequenceValue collect_0;
					while (true) {
						if (!ITERATOR__1_1.hasNext()) {
							collect_0 = accumulator_0;
							break;
						}
						/*@NonInvalid*/ EInterface _1_1 = (EInterface) ITERATOR__1_1.next();
						/**
						 * resultsIn
						 */
						final /*@NonInvalid*/ List<ERole> resultsIn = _1_1.getResultsIn();
						final /*@NonInvalid*/ OrderedSetValue BOXED_resultsIn = idResolver
								.createOrderedSetOfAll(Component_basedTables.ORD_CLSSid_ERole, resultsIn);
						//
						for (Object value : BOXED_resultsIn.flatten().getElements()) {
							accumulator_0.add(value);
						}
					}
					/*@Thrown*/ Object accumulator_1 = ValueUtil.FALSE_VALUE;
					Iterator<Object> ITERATOR_x = collect_0.iterator();
					/*@NonInvalid*/ Boolean exists;
					while (true) {
						if (!ITERATOR_x.hasNext()) {
							if (accumulator_1 == ValueUtil.FALSE_VALUE) {
								exists = ValueUtil.FALSE_VALUE;
							} else {
								throw (InvalidValueException) accumulator_1;
							}
							break;
						}
						/*@NonInvalid*/ ERole x = (ERole) ITERATOR_x.next();
						/**
						 * x.oclIsKindOf(EProvidedRole)
						 */
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_component_based_c_c_EProvidedRole_0 = idResolver
								.getClass(Component_basedTables.CLSSid_EProvidedRole, null);
						final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE
								.evaluate(executor, x, TYP_component_based_c_c_EProvidedRole_0).booleanValue();
						//
						if (oclIsKindOf) { // Normal successful body evaluation result
							exists = ValueUtil.TRUE_VALUE;
							break; // Stop immediately
						} else if (!oclIsKindOf) { // Normal unsuccessful body evaluation result
							; // Carry on
						} else { // Impossible badly typed result
							accumulator_1 = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
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
	public boolean requiresRole(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "EAssemblyContext::requiresRole";
		try {
			/**
			 *
			 * inv requiresRole:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.instantiates.requires->notEmpty() implies
			 *         self.instantiates.requires.resultsIn->exists(x |
			 *           x.oclIsKindOf(ERequiredRole)) = true
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Component_basedPackage.Literals.EASSEMBLY_CONTEXT___REQUIRES_ROLE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Component_basedTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ List<EComponent> instantiates = this.getInstantiates();
				final /*@NonInvalid*/ OrderedSetValue BOXED_instantiates = idResolver
						.createOrderedSetOfAll(Component_basedTables.ORD_CLSSid_EComponent, instantiates);
				/*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue.Accumulator accumulator = ValueUtil
						.createSequenceAccumulatorValue(Component_basedTables.SEQ_CLSSid_EInterface);
				Iterator<Object> ITERATOR__1 = BOXED_instantiates.iterator();
				/*@NonInvalid*/ SequenceValue collect;
				while (true) {
					if (!ITERATOR__1.hasNext()) {
						collect = accumulator;
						break;
					}
					/*@NonInvalid*/ EComponent _1 = (EComponent) ITERATOR__1.next();
					/**
					 * requires
					 */
					final /*@NonInvalid*/ List<EInterface> requires = _1.getRequires();
					final /*@NonInvalid*/ OrderedSetValue BOXED_requires = idResolver
							.createOrderedSetOfAll(Component_basedTables.ORD_CLSSid_EInterface, requires);
					//
					for (Object value : BOXED_requires.flatten().getElements()) {
						accumulator.add(value);
					}
				}
				final /*@NonInvalid*/ boolean notEmpty = CollectionNotEmptyOperation.INSTANCE.evaluate(collect)
						.booleanValue();
				final /*@NonInvalid*/ Boolean result;
				if (!notEmpty) {
					result = ValueUtil.TRUE_VALUE;
				} else {
					/*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue.Accumulator accumulator_0 = ValueUtil
							.createSequenceAccumulatorValue(Component_basedTables.SEQ_CLSSid_ERole);
					Iterator<Object> ITERATOR__1_1 = collect.iterator();
					/*@NonInvalid*/ SequenceValue collect_0;
					while (true) {
						if (!ITERATOR__1_1.hasNext()) {
							collect_0 = accumulator_0;
							break;
						}
						/*@NonInvalid*/ EInterface _1_1 = (EInterface) ITERATOR__1_1.next();
						/**
						 * resultsIn
						 */
						final /*@NonInvalid*/ List<ERole> resultsIn = _1_1.getResultsIn();
						final /*@NonInvalid*/ OrderedSetValue BOXED_resultsIn = idResolver
								.createOrderedSetOfAll(Component_basedTables.ORD_CLSSid_ERole, resultsIn);
						//
						for (Object value : BOXED_resultsIn.flatten().getElements()) {
							accumulator_0.add(value);
						}
					}
					/*@Thrown*/ Object accumulator_1 = ValueUtil.FALSE_VALUE;
					Iterator<Object> ITERATOR_x = collect_0.iterator();
					/*@NonInvalid*/ Boolean exists;
					while (true) {
						if (!ITERATOR_x.hasNext()) {
							if (accumulator_1 == ValueUtil.FALSE_VALUE) {
								exists = ValueUtil.FALSE_VALUE;
							} else {
								throw (InvalidValueException) accumulator_1;
							}
							break;
						}
						/*@NonInvalid*/ ERole x = (ERole) ITERATOR_x.next();
						/**
						 * x.oclIsKindOf(ERequiredRole)
						 */
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_component_based_c_c_ERequiredRole_0 = idResolver
								.getClass(Component_basedTables.CLSSid_ERequiredRole, null);
						final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE
								.evaluate(executor, x, TYP_component_based_c_c_ERequiredRole_0).booleanValue();
						//
						if (oclIsKindOf) { // Normal successful body evaluation result
							exists = ValueUtil.TRUE_VALUE;
							break; // Stop immediately
						} else if (!oclIsKindOf) { // Normal unsuccessful body evaluation result
							; // Carry on
						} else { // Impossible badly typed result
							accumulator_1 = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Component_basedPackage.EASSEMBLY_CONTEXT__ENCAPSULATED_BY_COMPONENT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getEncapsulatedByComponent()).basicAdd(otherEnd,
					msgs);
		case Component_basedPackage.EASSEMBLY_CONTEXT__ENCAPSULATED_BY_SYSTEM:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getEncapsulatedBySystem()).basicAdd(otherEnd,
					msgs);
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
		case Component_basedPackage.EASSEMBLY_CONTEXT__ROLES:
			return ((InternalEList<?>) getRoles()).basicRemove(otherEnd, msgs);
		case Component_basedPackage.EASSEMBLY_CONTEXT__ENCAPSULATED_BY_COMPONENT:
			return ((InternalEList<?>) getEncapsulatedByComponent()).basicRemove(otherEnd, msgs);
		case Component_basedPackage.EASSEMBLY_CONTEXT__ENCAPSULATED_BY_SYSTEM:
			return ((InternalEList<?>) getEncapsulatedBySystem()).basicRemove(otherEnd, msgs);
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
		case Component_basedPackage.EASSEMBLY_CONTEXT__NAME:
			return getName();
		case Component_basedPackage.EASSEMBLY_CONTEXT__ROLES:
			return getRoles();
		case Component_basedPackage.EASSEMBLY_CONTEXT__ALLOCATED:
			if (resolve)
				return getAllocated();
			return basicGetAllocated();
		case Component_basedPackage.EASSEMBLY_CONTEXT__ENCAPSULATED_BY_COMPONENT:
			return getEncapsulatedByComponent();
		case Component_basedPackage.EASSEMBLY_CONTEXT__ENCAPSULATED_BY_SYSTEM:
			return getEncapsulatedBySystem();
		case Component_basedPackage.EASSEMBLY_CONTEXT__INSTANTIATES:
			return getInstantiates();
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
		case Component_basedPackage.EASSEMBLY_CONTEXT__NAME:
			setName((String) newValue);
			return;
		case Component_basedPackage.EASSEMBLY_CONTEXT__ROLES:
			getRoles().clear();
			getRoles().addAll((Collection<? extends ERole>) newValue);
			return;
		case Component_basedPackage.EASSEMBLY_CONTEXT__ALLOCATED:
			setAllocated((EContainer) newValue);
			return;
		case Component_basedPackage.EASSEMBLY_CONTEXT__ENCAPSULATED_BY_COMPONENT:
			getEncapsulatedByComponent().clear();
			getEncapsulatedByComponent().addAll((Collection<? extends ECompositeComponent>) newValue);
			return;
		case Component_basedPackage.EASSEMBLY_CONTEXT__ENCAPSULATED_BY_SYSTEM:
			getEncapsulatedBySystem().clear();
			getEncapsulatedBySystem().addAll((Collection<? extends ESystem>) newValue);
			return;
		case Component_basedPackage.EASSEMBLY_CONTEXT__INSTANTIATES:
			getInstantiates().clear();
			getInstantiates().addAll((Collection<? extends EComponent>) newValue);
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
		case Component_basedPackage.EASSEMBLY_CONTEXT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Component_basedPackage.EASSEMBLY_CONTEXT__ROLES:
			getRoles().clear();
			return;
		case Component_basedPackage.EASSEMBLY_CONTEXT__ALLOCATED:
			setAllocated((EContainer) null);
			return;
		case Component_basedPackage.EASSEMBLY_CONTEXT__ENCAPSULATED_BY_COMPONENT:
			getEncapsulatedByComponent().clear();
			return;
		case Component_basedPackage.EASSEMBLY_CONTEXT__ENCAPSULATED_BY_SYSTEM:
			getEncapsulatedBySystem().clear();
			return;
		case Component_basedPackage.EASSEMBLY_CONTEXT__INSTANTIATES:
			getInstantiates().clear();
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
		case Component_basedPackage.EASSEMBLY_CONTEXT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Component_basedPackage.EASSEMBLY_CONTEXT__ROLES:
			return roles != null && !roles.isEmpty();
		case Component_basedPackage.EASSEMBLY_CONTEXT__ALLOCATED:
			return allocated != null;
		case Component_basedPackage.EASSEMBLY_CONTEXT__ENCAPSULATED_BY_COMPONENT:
			return encapsulatedByComponent != null && !encapsulatedByComponent.isEmpty();
		case Component_basedPackage.EASSEMBLY_CONTEXT__ENCAPSULATED_BY_SYSTEM:
			return encapsulatedBySystem != null && !encapsulatedBySystem.isEmpty();
		case Component_basedPackage.EASSEMBLY_CONTEXT__INSTANTIATES:
			return instantiates != null && !instantiates.isEmpty();
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
		case Component_basedPackage.EASSEMBLY_CONTEXT___ENCAPSULATION_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
			return encapsulationConstraint((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Component_basedPackage.EASSEMBLY_CONTEXT___CONNECTOR_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
			return connectorConstraint((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Component_basedPackage.EASSEMBLY_CONTEXT___PROVIDES_ROLE__DIAGNOSTICCHAIN_MAP:
			return providesRole((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Component_basedPackage.EASSEMBLY_CONTEXT___REQUIRES_ROLE__DIAGNOSTICCHAIN_MAP:
			return requiresRole((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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

} //EAssemblyContextImpl
