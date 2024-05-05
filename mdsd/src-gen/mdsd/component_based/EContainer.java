/**
 */
package mdsd.component_based;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EContainer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.EContainer#getName <em>Name</em>}</li>
 *   <li>{@link mdsd.component_based.EContainer#getConnectedTo <em>Connected To</em>}</li>
 * </ul>
 *
 * @see mdsd.component_based.Component_basedPackage#getEContainer()
 * @model
 * @generated
 */
public interface EContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mdsd.component_based.Component_basedPackage#getEContainer_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mdsd.component_based.EContainer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Connected To</b></em>' reference list.
	 * The list contents are of type {@link mdsd.component_based.ELink}.
	 * It is bidirectional and its opposite is '{@link mdsd.component_based.ELink#getConnects <em>Connects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected To</em>' reference list.
	 * @see mdsd.component_based.Component_basedPackage#getEContainer_ConnectedTo()
	 * @see mdsd.component_based.ELink#getConnects
	 * @model opposite="connects"
	 * @generated
	 */
	EList<ELink> getConnectedTo();

} // EContainer
