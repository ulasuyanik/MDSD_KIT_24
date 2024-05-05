/**
 */
package mdsd.component_based;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ERole</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.ERole#getRoleOf <em>Role Of</em>}</li>
 * </ul>
 *
 * @see mdsd.component_based.Component_basedPackage#getERole()
 * @model abstract="true"
 * @generated
 */
public interface ERole extends EObject {
	/**
	 * Returns the value of the '<em><b>Role Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Of</em>' reference.
	 * @see #setRoleOf(EAssemblyContext)
	 * @see mdsd.component_based.Component_basedPackage#getERole_RoleOf()
	 * @model
	 * @generated
	 */
	EAssemblyContext getRoleOf();

	/**
	 * Sets the value of the '{@link mdsd.component_based.ERole#getRoleOf <em>Role Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Of</em>' reference.
	 * @see #getRoleOf()
	 * @generated
	 */
	void setRoleOf(EAssemblyContext value);

} // ERole
