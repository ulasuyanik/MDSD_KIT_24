/**
 */
package mdsd.component_based;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAssembly View Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.EAssemblyViewType#getMainArtifacts <em>Main Artifacts</em>}</li>
 *   <li>{@link mdsd.component_based.EAssemblyViewType#getShowsComponents <em>Shows Components</em>}</li>
 * </ul>
 *
 * @see mdsd.component_based.Component_basedPackage#getEAssemblyViewType()
 * @model
 * @generated
 */
public interface EAssemblyViewType extends EViewType {
	/**
	 * Returns the value of the '<em><b>Main Artifacts</b></em>' containment reference list.
	 * The list contents are of type {@link mdsd.component_based.EAssemblyContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Artifacts</em>' containment reference list.
	 * @see mdsd.component_based.Component_basedPackage#getEAssemblyViewType_MainArtifacts()
	 * @model containment="true"
	 * @generated
	 */
	EList<EAssemblyContext> getMainArtifacts();

	/**
	 * Returns the value of the '<em><b>Shows Components</b></em>' reference list.
	 * The list contents are of type {@link mdsd.component_based.EComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shows Components</em>' reference list.
	 * @see mdsd.component_based.Component_basedPackage#getEAssemblyViewType_ShowsComponents()
	 * @model
	 * @generated
	 */
	EList<EComponent> getShowsComponents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void showComponentConnections();

} // EAssemblyViewType
