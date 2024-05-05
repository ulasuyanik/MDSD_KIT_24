/**
 */
package mdsd.component_based;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EInterface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.EInterface#getName <em>Name</em>}</li>
 *   <li>{@link mdsd.component_based.EInterface#getSignature <em>Signature</em>}</li>
 *   <li>{@link mdsd.component_based.EInterface#getResultsIn <em>Results In</em>}</li>
 *   <li>{@link mdsd.component_based.EInterface#getProvidedByComponent <em>Provided By Component</em>}</li>
 *   <li>{@link mdsd.component_based.EInterface#getProvidedBySystem <em>Provided By System</em>}</li>
 *   <li>{@link mdsd.component_based.EInterface#getRequiredByComponent <em>Required By Component</em>}</li>
 *   <li>{@link mdsd.component_based.EInterface#getRequiredBySystem <em>Required By System</em>}</li>
 * </ul>
 *
 * @see mdsd.component_based.Component_basedPackage#getEInterface()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='interfaceProvidedByConstraint'"
 * @generated
 */
public interface EInterface extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mdsd.component_based.Component_basedPackage#getEInterface_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mdsd.component_based.EInterface#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' containment reference list.
	 * The list contents are of type {@link mdsd.component_based.ESignature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' containment reference list.
	 * @see mdsd.component_based.Component_basedPackage#getEInterface_Signature()
	 * @model containment="true"
	 * @generated
	 */
	EList<ESignature> getSignature();

	/**
	 * Returns the value of the '<em><b>Results In</b></em>' reference list.
	 * The list contents are of type {@link mdsd.component_based.ERole}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results In</em>' reference list.
	 * @see mdsd.component_based.Component_basedPackage#getEInterface_ResultsIn()
	 * @model
	 * @generated
	 */
	EList<ERole> getResultsIn();

	/**
	 * Returns the value of the '<em><b>Provided By Component</b></em>' reference list.
	 * The list contents are of type {@link mdsd.component_based.EComponent}.
	 * It is bidirectional and its opposite is '{@link mdsd.component_based.EComponent#getProvides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided By Component</em>' reference list.
	 * @see mdsd.component_based.Component_basedPackage#getEInterface_ProvidedByComponent()
	 * @see mdsd.component_based.EComponent#getProvides
	 * @model opposite="provides"
	 * @generated
	 */
	EList<EComponent> getProvidedByComponent();

	/**
	 * Returns the value of the '<em><b>Provided By System</b></em>' reference list.
	 * The list contents are of type {@link mdsd.component_based.ESystem}.
	 * It is bidirectional and its opposite is '{@link mdsd.component_based.ESystem#getProvides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided By System</em>' reference list.
	 * @see mdsd.component_based.Component_basedPackage#getEInterface_ProvidedBySystem()
	 * @see mdsd.component_based.ESystem#getProvides
	 * @model opposite="provides"
	 * @generated
	 */
	EList<ESystem> getProvidedBySystem();

	/**
	 * Returns the value of the '<em><b>Required By Component</b></em>' reference list.
	 * The list contents are of type {@link mdsd.component_based.EComponent}.
	 * It is bidirectional and its opposite is '{@link mdsd.component_based.EComponent#getRequires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required By Component</em>' reference list.
	 * @see mdsd.component_based.Component_basedPackage#getEInterface_RequiredByComponent()
	 * @see mdsd.component_based.EComponent#getRequires
	 * @model opposite="requires"
	 * @generated
	 */
	EList<EComponent> getRequiredByComponent();

	/**
	 * Returns the value of the '<em><b>Required By System</b></em>' reference list.
	 * The list contents are of type {@link mdsd.component_based.ESystem}.
	 * It is bidirectional and its opposite is '{@link mdsd.component_based.ESystem#getRequires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required By System</em>' reference list.
	 * @see mdsd.component_based.Component_basedPackage#getEInterface_RequiredBySystem()
	 * @see mdsd.component_based.ESystem#getRequires
	 * @model opposite="requires"
	 * @generated
	 */
	EList<ESystem> getRequiredBySystem();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.requiredByComponent -&gt; size() &gt; 0 implies self.resultsIn -&gt; exists(x|x.oclIsKindOf(ERequiredRole))'"
	 * @generated
	 */
	boolean interfaceRequiredByConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.providedByComponent -&gt; size() &gt; 0 implies self.resultsIn -&gt; exists(x|x.oclIsKindOf(EProvidedRole))'"
	 * @generated
	 */
	boolean interfaceProvidedByConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // EInterface
