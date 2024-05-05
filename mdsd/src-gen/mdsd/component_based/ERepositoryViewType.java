/**
 */
package mdsd.component_based;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ERepository View Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.ERepositoryViewType#getShowsComponents <em>Shows Components</em>}</li>
 *   <li>{@link mdsd.component_based.ERepositoryViewType#getShowsInterfaces <em>Shows Interfaces</em>}</li>
 * </ul>
 *
 * @see mdsd.component_based.Component_basedPackage#getERepositoryViewType()
 * @model
 * @generated
 */
public interface ERepositoryViewType extends EObject {
	/**
	 * Returns the value of the '<em><b>Shows Components</b></em>' reference list.
	 * The list contents are of type {@link mdsd.component_based.EComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shows Components</em>' reference list.
	 * @see mdsd.component_based.Component_basedPackage#getERepositoryViewType_ShowsComponents()
	 * @model
	 * @generated
	 */
	EList<EComponent> getShowsComponents();

	/**
	 * Returns the value of the '<em><b>Shows Interfaces</b></em>' reference list.
	 * The list contents are of type {@link mdsd.component_based.EInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shows Interfaces</em>' reference list.
	 * @see mdsd.component_based.Component_basedPackage#getERepositoryViewType_ShowsInterfaces()
	 * @model
	 * @generated
	 */
	EList<EInterface> getShowsInterfaces();

} // ERepositoryViewType
