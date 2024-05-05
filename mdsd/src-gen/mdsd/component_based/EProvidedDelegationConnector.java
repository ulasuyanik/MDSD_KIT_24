/**
 */
package mdsd.component_based;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EProvided Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.EProvidedDelegationConnector#getLinkFrom <em>Link From</em>}</li>
 *   <li>{@link mdsd.component_based.EProvidedDelegationConnector#getLinkTo <em>Link To</em>}</li>
 * </ul>
 *
 * @see mdsd.component_based.Component_basedPackage#getEProvidedDelegationConnector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='providedConstraint'"
 * @generated
 */
public interface EProvidedDelegationConnector extends EDelegationConnector {
	/**
	 * Returns the value of the '<em><b>Link From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link From</em>' reference.
	 * @see #setLinkFrom(EInterface)
	 * @see mdsd.component_based.Component_basedPackage#getEProvidedDelegationConnector_LinkFrom()
	 * @model required="true"
	 * @generated
	 */
	EInterface getLinkFrom();

	/**
	 * Sets the value of the '{@link mdsd.component_based.EProvidedDelegationConnector#getLinkFrom <em>Link From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link From</em>' reference.
	 * @see #getLinkFrom()
	 * @generated
	 */
	void setLinkFrom(EInterface value);

	/**
	 * Returns the value of the '<em><b>Link To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link To</em>' reference.
	 * @see #setLinkTo(EProvidedRole)
	 * @see mdsd.component_based.Component_basedPackage#getEProvidedDelegationConnector_LinkTo()
	 * @model required="true"
	 * @generated
	 */
	EProvidedRole getLinkTo();

	/**
	 * Sets the value of the '{@link mdsd.component_based.EProvidedDelegationConnector#getLinkTo <em>Link To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link To</em>' reference.
	 * @see #getLinkTo()
	 * @generated
	 */
	void setLinkTo(EProvidedRole value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.linkFrom.providedBySystem -&gt; size() &gt; 0 or self.linkFrom.providedByComponent -&gt; exists(x|x.oclIsKindOf(ECompositeComponent)) = true'"
	 * @generated
	 */
	boolean providedConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // EProvidedDelegationConnector
