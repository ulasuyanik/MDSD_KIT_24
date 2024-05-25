/**
 */
package mdsd.component_based;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAssembly Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.EAssemblyConnector#getLinkTo <em>Link To</em>}</li>
 *   <li>{@link mdsd.component_based.EAssemblyConnector#getLinkFrom <em>Link From</em>}</li>
 *   <li>{@link mdsd.component_based.EAssemblyConnector#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see mdsd.component_based.Component_basedPackage#getEAssemblyConnector()
 * @model
 * @generated
 */
public interface EAssemblyConnector extends EObject {
	/**
	 * Returns the value of the '<em><b>Link From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mdsd.component_based.EProvidedRole#getLinkedFrom <em>Linked From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link From</em>' reference.
	 * @see #setLinkFrom(EProvidedRole)
	 * @see mdsd.component_based.Component_basedPackage#getEAssemblyConnector_LinkFrom()
	 * @see mdsd.component_based.EProvidedRole#getLinkedFrom
	 * @model opposite="linkedFrom" required="true"
	 * @generated
	 */
	EProvidedRole getLinkFrom();

	/**
	 * Sets the value of the '{@link mdsd.component_based.EAssemblyConnector#getLinkFrom <em>Link From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link From</em>' reference.
	 * @see #getLinkFrom()
	 * @generated
	 */
	void setLinkFrom(EProvidedRole value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mdsd.component_based.Component_basedPackage#getEAssemblyConnector_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mdsd.component_based.EAssemblyConnector#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Link To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mdsd.component_based.ERequiredRole#getLinkedTo <em>Linked To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link To</em>' reference.
	 * @see #setLinkTo(ERequiredRole)
	 * @see mdsd.component_based.Component_basedPackage#getEAssemblyConnector_LinkTo()
	 * @see mdsd.component_based.ERequiredRole#getLinkedTo
	 * @model opposite="linkedTo" required="true"
	 * @generated
	 */
	ERequiredRole getLinkTo();

	/**
	 * Sets the value of the '{@link mdsd.component_based.EAssemblyConnector#getLinkTo <em>Link To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link To</em>' reference.
	 * @see #getLinkTo()
	 * @generated
	 */
	void setLinkTo(ERequiredRole value);

} // EAssemblyConnector
