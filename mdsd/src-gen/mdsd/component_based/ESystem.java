/**
 */
package mdsd.component_based;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ESystem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.ESystem#getProvides <em>Provides</em>}</li>
 *   <li>{@link mdsd.component_based.ESystem#getRequires <em>Requires</em>}</li>
 *   <li>{@link mdsd.component_based.ESystem#getEncapsulates <em>Encapsulates</em>}</li>
 *   <li>{@link mdsd.component_based.ESystem#getName <em>Name</em>}</li>
 *   <li>{@link mdsd.component_based.ESystem#getContainsRepos <em>Contains Repos</em>}</li>
 *   <li>{@link mdsd.component_based.ESystem#getContainsContainers <em>Contains Containers</em>}</li>
 * </ul>
 *
 * @see mdsd.component_based.Component_basedPackage#getESystem()
 * @model
 * @generated
 */
public interface ESystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Provides</b></em>' reference list.
	 * The list contents are of type {@link mdsd.component_based.EInterface}.
	 * It is bidirectional and its opposite is '{@link mdsd.component_based.EInterface#getProvidedBySystem <em>Provided By System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides</em>' reference list.
	 * @see mdsd.component_based.Component_basedPackage#getESystem_Provides()
	 * @see mdsd.component_based.EInterface#getProvidedBySystem
	 * @model opposite="providedBySystem" required="true"
	 * @generated
	 */
	EList<EInterface> getProvides();

	/**
	 * Returns the value of the '<em><b>Requires</b></em>' reference list.
	 * The list contents are of type {@link mdsd.component_based.EInterface}.
	 * It is bidirectional and its opposite is '{@link mdsd.component_based.EInterface#getRequiredBySystem <em>Required By System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires</em>' reference list.
	 * @see mdsd.component_based.Component_basedPackage#getESystem_Requires()
	 * @see mdsd.component_based.EInterface#getRequiredBySystem
	 * @model opposite="requiredBySystem"
	 * @generated
	 */
	EList<EInterface> getRequires();

	/**
	 * Returns the value of the '<em><b>Encapsulates</b></em>' reference list.
	 * The list contents are of type {@link mdsd.component_based.EAssemblyContext}.
	 * It is bidirectional and its opposite is '{@link mdsd.component_based.EAssemblyContext#getEncapsulatedBySystem <em>Encapsulated By System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encapsulates</em>' reference list.
	 * @see mdsd.component_based.Component_basedPackage#getESystem_Encapsulates()
	 * @see mdsd.component_based.EAssemblyContext#getEncapsulatedBySystem
	 * @model opposite="encapsulatedBySystem"
	 * @generated
	 */
	EList<EAssemblyContext> getEncapsulates();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mdsd.component_based.Component_basedPackage#getESystem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mdsd.component_based.ESystem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Contains Repos</b></em>' containment reference list.
	 * The list contents are of type {@link mdsd.component_based.ERepository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Repos</em>' containment reference list.
	 * @see mdsd.component_based.Component_basedPackage#getESystem_ContainsRepos()
	 * @model containment="true"
	 * @generated
	 */
	EList<ERepository> getContainsRepos();

	/**
	 * Returns the value of the '<em><b>Contains Containers</b></em>' containment reference list.
	 * The list contents are of type {@link mdsd.component_based.EContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Containers</em>' containment reference list.
	 * @see mdsd.component_based.Component_basedPackage#getESystem_ContainsContainers()
	 * @model containment="true"
	 * @generated
	 */
	EList<EContainer> getContainsContainers();

} // ESystem
