/**
 */
package mdsd.component_based;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EComposite Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.ECompositeComponent#getEncapsulates <em>Encapsulates</em>}</li>
 * </ul>
 *
 * @see mdsd.component_based.Component_basedPackage#getECompositeComponent()
 * @model
 * @generated
 */
public interface ECompositeComponent extends EComponent {
	/**
	 * Returns the value of the '<em><b>Encapsulates</b></em>' reference list.
	 * The list contents are of type {@link mdsd.component_based.EAssemblyContext}.
	 * It is bidirectional and its opposite is '{@link mdsd.component_based.EAssemblyContext#getEncapsulatedByComponent <em>Encapsulated By Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encapsulates</em>' reference list.
	 * @see mdsd.component_based.Component_basedPackage#getECompositeComponent_Encapsulates()
	 * @see mdsd.component_based.EAssemblyContext#getEncapsulatedByComponent
	 * @model opposite="encapsulatedByComponent"
	 * @generated
	 */
	EList<EAssemblyContext> getEncapsulates();

} // ECompositeComponent
