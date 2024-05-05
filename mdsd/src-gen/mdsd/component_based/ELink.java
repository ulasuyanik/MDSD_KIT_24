/**
 */
package mdsd.component_based;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ELink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.ELink#getName <em>Name</em>}</li>
 *   <li>{@link mdsd.component_based.ELink#getConnects <em>Connects</em>}</li>
 * </ul>
 *
 * @see mdsd.component_based.Component_basedPackage#getELink()
 * @model
 * @generated
 */
public interface ELink extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mdsd.component_based.Component_basedPackage#getELink_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mdsd.component_based.ELink#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Connects</b></em>' reference list.
	 * The list contents are of type {@link mdsd.component_based.EContainer}.
	 * It is bidirectional and its opposite is '{@link mdsd.component_based.EContainer#getConnectedTo <em>Connected To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connects</em>' reference list.
	 * @see mdsd.component_based.Component_basedPackage#getELink_Connects()
	 * @see mdsd.component_based.EContainer#getConnectedTo
	 * @model opposite="connectedTo" lower="2"
	 * @generated
	 */
	EList<EContainer> getConnects();

} // ELink
