/**
 */
package mdsd.component_based;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ERequired Delegation Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.ERequiredDelegationConnector#getLinkFrom <em>Link From</em>}</li>
 *   <li>{@link mdsd.component_based.ERequiredDelegationConnector#getLinkTo <em>Link To</em>}</li>
 * </ul>
 *
 * @see mdsd.component_based.Component_basedPackage#getERequiredDelegationConnector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='requiredConstraint'"
 * @generated
 */
public interface ERequiredDelegationConnector extends EDelegationConnector {
	/**
	 * Returns the value of the '<em><b>Link From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link From</em>' reference.
	 * @see #setLinkFrom(ERequiredRole)
	 * @see mdsd.component_based.Component_basedPackage#getERequiredDelegationConnector_LinkFrom()
	 * @model required="true"
	 * @generated
	 */
	ERequiredRole getLinkFrom();

	/**
	 * Sets the value of the '{@link mdsd.component_based.ERequiredDelegationConnector#getLinkFrom <em>Link From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link From</em>' reference.
	 * @see #getLinkFrom()
	 * @generated
	 */
	void setLinkFrom(ERequiredRole value);

	/**
	 * Returns the value of the '<em><b>Link To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link To</em>' reference.
	 * @see #setLinkTo(EInterface)
	 * @see mdsd.component_based.Component_basedPackage#getERequiredDelegationConnector_LinkTo()
	 * @model required="true"
	 * @generated
	 */
	EInterface getLinkTo();

	/**
	 * Sets the value of the '{@link mdsd.component_based.ERequiredDelegationConnector#getLinkTo <em>Link To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link To</em>' reference.
	 * @see #getLinkTo()
	 * @generated
	 */
	void setLinkTo(EInterface value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.linkTo.requiredBySystem -&gt; size() &gt; 0 or self.linkTo.requiredByComponent -&gt; exists(x|x.oclIsKindOf(ECompositeComponent)) = true'"
	 * @generated
	 */
	boolean requiredConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ERequiredDelegationConnector
