/**
 */
package mdsd.component_based;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EEnvironment View Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.EEnvironmentViewType#getShowsContainers <em>Shows Containers</em>}</li>
 *   <li>{@link mdsd.component_based.EEnvironmentViewType#getShowsLinks <em>Shows Links</em>}</li>
 * </ul>
 *
 * @see mdsd.component_based.Component_basedPackage#getEEnvironmentViewType()
 * @model
 * @generated
 */
public interface EEnvironmentViewType extends EViewType {
	/**
	 * Returns the value of the '<em><b>Shows Containers</b></em>' reference list.
	 * The list contents are of type {@link mdsd.component_based.EContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shows Containers</em>' reference list.
	 * @see mdsd.component_based.Component_basedPackage#getEEnvironmentViewType_ShowsContainers()
	 * @model
	 * @generated
	 */
	EList<EContainer> getShowsContainers();

	/**
	 * Returns the value of the '<em><b>Shows Links</b></em>' reference list.
	 * The list contents are of type {@link mdsd.component_based.ELink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shows Links</em>' reference list.
	 * @see mdsd.component_based.Component_basedPackage#getEEnvironmentViewType_ShowsLinks()
	 * @model
	 * @generated
	 */
	EList<ELink> getShowsLinks();

} // EEnvironmentViewType
