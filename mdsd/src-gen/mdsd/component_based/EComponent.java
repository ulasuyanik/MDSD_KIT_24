/**
 */
package mdsd.component_based;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EComponent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.EComponent#getName <em>Name</em>}</li>
 *   <li>{@link mdsd.component_based.EComponent#getProvidesInterfaceTo <em>Provides Interface To</em>}</li>
 *   <li>{@link mdsd.component_based.EComponent#getBehaviourDescription <em>Behaviour Description</em>}</li>
 *   <li>{@link mdsd.component_based.EComponent#getUsesInterfaceFrom <em>Uses Interface From</em>}</li>
 *   <li>{@link mdsd.component_based.EComponent#getProvidesDirectly <em>Provides Directly</em>}</li>
 *   <li>{@link mdsd.component_based.EComponent#getProvides <em>Provides</em>}</li>
 *   <li>{@link mdsd.component_based.EComponent#getRequires <em>Requires</em>}</li>
 * </ul>
 *
 * @see mdsd.component_based.Component_basedPackage#getEComponent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='providesConstraint'"
 * @generated
 */
public interface EComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mdsd.component_based.Component_basedPackage#getEComponent_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mdsd.component_based.EComponent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Provides Interface To</b></em>' reference list.
	 * The list contents are of type {@link mdsd.component_based.EComponent}.
	 * It is bidirectional and its opposite is '{@link mdsd.component_based.EComponent#getUsesInterfaceFrom <em>Uses Interface From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides Interface To</em>' reference list.
	 * @see mdsd.component_based.Component_basedPackage#getEComponent_ProvidesInterfaceTo()
	 * @see mdsd.component_based.EComponent#getUsesInterfaceFrom
	 * @model opposite="usesInterfaceFrom"
	 * @generated
	 */
	EList<EComponent> getProvidesInterfaceTo();

	/**
	 * Returns the value of the '<em><b>Behaviour Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviour Description</em>' containment reference.
	 * @see #setBehaviourDescription(EBehaviourDescription)
	 * @see mdsd.component_based.Component_basedPackage#getEComponent_BehaviourDescription()
	 * @model containment="true"
	 * @generated
	 */
	EBehaviourDescription getBehaviourDescription();

	/**
	 * Sets the value of the '{@link mdsd.component_based.EComponent#getBehaviourDescription <em>Behaviour Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behaviour Description</em>' containment reference.
	 * @see #getBehaviourDescription()
	 * @generated
	 */
	void setBehaviourDescription(EBehaviourDescription value);

	/**
	 * Returns the value of the '<em><b>Uses Interface From</b></em>' reference list.
	 * The list contents are of type {@link mdsd.component_based.EComponent}.
	 * It is bidirectional and its opposite is '{@link mdsd.component_based.EComponent#getProvidesInterfaceTo <em>Provides Interface To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Interface From</em>' reference list.
	 * @see mdsd.component_based.Component_basedPackage#getEComponent_UsesInterfaceFrom()
	 * @see mdsd.component_based.EComponent#getProvidesInterfaceTo
	 * @model opposite="providesInterfaceTo"
	 * @generated
	 */
	EList<EComponent> getUsesInterfaceFrom();

	/**
	 * Returns the value of the '<em><b>Provides Directly</b></em>' reference list.
	 * The list contents are of type {@link mdsd.component_based.EService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides Directly</em>' reference list.
	 * @see mdsd.component_based.Component_basedPackage#getEComponent_ProvidesDirectly()
	 * @model
	 * @generated
	 */
	EList<EService> getProvidesDirectly();

	/**
	 * Returns the value of the '<em><b>Provides</b></em>' reference list.
	 * The list contents are of type {@link mdsd.component_based.EInterface}.
	 * It is bidirectional and its opposite is '{@link mdsd.component_based.EInterface#getProvidedByComponent <em>Provided By Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides</em>' reference list.
	 * @see mdsd.component_based.Component_basedPackage#getEComponent_Provides()
	 * @see mdsd.component_based.EInterface#getProvidedByComponent
	 * @model opposite="providedByComponent"
	 * @generated
	 */
	EList<EInterface> getProvides();

	/**
	 * Returns the value of the '<em><b>Requires</b></em>' reference list.
	 * The list contents are of type {@link mdsd.component_based.EInterface}.
	 * It is bidirectional and its opposite is '{@link mdsd.component_based.EInterface#getRequiredByComponent <em>Required By Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires</em>' reference list.
	 * @see mdsd.component_based.Component_basedPackage#getEComponent_Requires()
	 * @see mdsd.component_based.EInterface#getRequiredByComponent
	 * @model opposite="requiredByComponent"
	 * @generated
	 */
	EList<EInterface> getRequires();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body=' self.provides -&gt; size() &gt; 0 implies self.provides.signature.correspondsTo -&gt; size() &gt; 0'"
	 * @generated
	 */
	boolean providesConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // EComponent
