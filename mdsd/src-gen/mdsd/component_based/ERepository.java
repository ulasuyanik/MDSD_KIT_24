/**
 */
package mdsd.component_based;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ERepository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.ERepository#getComponent <em>Component</em>}</li>
 *   <li>{@link mdsd.component_based.ERepository#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see mdsd.component_based.Component_basedPackage#getERepository()
 * @model
 * @generated
 */
public interface ERepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link mdsd.component_based.EComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see mdsd.component_based.Component_basedPackage#getERepository_Component()
	 * @model containment="true"
	 * @generated
	 */
	EList<EComponent> getComponent();

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference list.
	 * The list contents are of type {@link mdsd.component_based.EInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference list.
	 * @see mdsd.component_based.Component_basedPackage#getERepository_Interface()
	 * @model containment="true"
	 * @generated
	 */
	EList<EInterface> getInterface();

} // ERepository
