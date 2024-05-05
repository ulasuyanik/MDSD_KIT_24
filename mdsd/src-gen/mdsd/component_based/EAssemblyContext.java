/**
 */
package mdsd.component_based;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAssembly Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.EAssemblyContext#getName <em>Name</em>}</li>
 *   <li>{@link mdsd.component_based.EAssemblyContext#getRoles <em>Roles</em>}</li>
 *   <li>{@link mdsd.component_based.EAssemblyContext#getAllocated <em>Allocated</em>}</li>
 *   <li>{@link mdsd.component_based.EAssemblyContext#getEncapsulatedByComponent <em>Encapsulated By Component</em>}</li>
 *   <li>{@link mdsd.component_based.EAssemblyContext#getEncapsulatedBySystem <em>Encapsulated By System</em>}</li>
 *   <li>{@link mdsd.component_based.EAssemblyContext#getInstantiates <em>Instantiates</em>}</li>
 * </ul>
 *
 * @see mdsd.component_based.Component_basedPackage#getEAssemblyContext()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='requiresRole'"
 * @generated
 */
public interface EAssemblyContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mdsd.component_based.Component_basedPackage#getEAssemblyContext_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mdsd.component_based.EAssemblyContext#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link mdsd.component_based.ERole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see mdsd.component_based.Component_basedPackage#getEAssemblyContext_Roles()
	 * @model containment="true"
	 * @generated
	 */
	EList<ERole> getRoles();

	/**
	 * Returns the value of the '<em><b>Allocated</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated</em>' reference.
	 * @see #setAllocated(EContainer)
	 * @see mdsd.component_based.Component_basedPackage#getEAssemblyContext_Allocated()
	 * @model
	 * @generated
	 */
	EContainer getAllocated();

	/**
	 * Sets the value of the '{@link mdsd.component_based.EAssemblyContext#getAllocated <em>Allocated</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocated</em>' reference.
	 * @see #getAllocated()
	 * @generated
	 */
	void setAllocated(EContainer value);

	/**
	 * Returns the value of the '<em><b>Encapsulated By Component</b></em>' reference list.
	 * The list contents are of type {@link mdsd.component_based.ECompositeComponent}.
	 * It is bidirectional and its opposite is '{@link mdsd.component_based.ECompositeComponent#getEncapsulates <em>Encapsulates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encapsulated By Component</em>' reference list.
	 * @see mdsd.component_based.Component_basedPackage#getEAssemblyContext_EncapsulatedByComponent()
	 * @see mdsd.component_based.ECompositeComponent#getEncapsulates
	 * @model opposite="encapsulates"
	 * @generated
	 */
	EList<ECompositeComponent> getEncapsulatedByComponent();

	/**
	 * Returns the value of the '<em><b>Encapsulated By System</b></em>' reference list.
	 * The list contents are of type {@link mdsd.component_based.ESystem}.
	 * It is bidirectional and its opposite is '{@link mdsd.component_based.ESystem#getEncapsulates <em>Encapsulates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encapsulated By System</em>' reference list.
	 * @see mdsd.component_based.Component_basedPackage#getEAssemblyContext_EncapsulatedBySystem()
	 * @see mdsd.component_based.ESystem#getEncapsulates
	 * @model opposite="encapsulates"
	 * @generated
	 */
	EList<ESystem> getEncapsulatedBySystem();

	/**
	 * Returns the value of the '<em><b>Instantiates</b></em>' reference list.
	 * The list contents are of type {@link mdsd.component_based.EComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiates</em>' reference list.
	 * @see mdsd.component_based.Component_basedPackage#getEAssemblyContext_Instantiates()
	 * @model
	 * @generated
	 */
	EList<EComponent> getInstantiates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self -&gt; select(x| self.encapsulatedBySystem -&gt; size() = 0 and self.encapsulatedByComponent -&gt; size() &gt; 0).allocated -&gt; size() = 0 = true'"
	 * @generated
	 */
	boolean encapsulationConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='let x:EAssemblyContext = self , y: EAssemblyContext = self in y.roles-&gt;oclAsType(ERequiredRole)-&gt;select(element|x.roles-&gt;oclAsType(EProvidedRole).linkedFrom.linkTo) -&gt; size() &gt; 0 implies x.allocated = y.allocated or x.allocated -&gt; select(element|y.allocated.connectedTo.connects) -&gt; size() &gt; 0'"
	 * @generated
	 */
	boolean connectorConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.instantiates.provides-&gt;notEmpty() implies self.instantiates.provides.resultsIn-&gt;exists(x|x.oclIsKindOf(EProvidedRole)) = true'"
	 * @generated
	 */
	boolean providesRole(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.instantiates.requires-&gt;notEmpty() implies self.instantiates.requires.resultsIn-&gt;exists(x|x.oclIsKindOf(ERequiredRole)) = true'"
	 * @generated
	 */
	boolean requiresRole(DiagnosticChain diagnostics, Map<Object, Object> context);

} // EAssemblyContext
