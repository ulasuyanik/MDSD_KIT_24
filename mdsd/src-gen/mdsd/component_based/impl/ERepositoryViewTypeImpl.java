/**
 */
package mdsd.component_based.impl;

import java.util.Collection;

import mdsd.component_based.Component_basedPackage;
import mdsd.component_based.EComponent;
import mdsd.component_based.EInterface;
import mdsd.component_based.ERepositoryViewType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ERepository View Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.impl.ERepositoryViewTypeImpl#getShowsComponents <em>Shows Components</em>}</li>
 *   <li>{@link mdsd.component_based.impl.ERepositoryViewTypeImpl#getShowsInterfaces <em>Shows Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ERepositoryViewTypeImpl extends MinimalEObjectImpl.Container implements ERepositoryViewType {
	/**
	 * The cached value of the '{@link #getShowsComponents() <em>Shows Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowsComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<EComponent> showsComponents;

	/**
	 * The cached value of the '{@link #getShowsInterfaces() <em>Shows Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowsInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<EInterface> showsInterfaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ERepositoryViewTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Component_basedPackage.Literals.EREPOSITORY_VIEW_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EComponent> getShowsComponents() {
		if (showsComponents == null) {
			showsComponents = new EObjectResolvingEList<EComponent>(EComponent.class, this,
					Component_basedPackage.EREPOSITORY_VIEW_TYPE__SHOWS_COMPONENTS);
		}
		return showsComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EInterface> getShowsInterfaces() {
		if (showsInterfaces == null) {
			showsInterfaces = new EObjectResolvingEList<EInterface>(EInterface.class, this,
					Component_basedPackage.EREPOSITORY_VIEW_TYPE__SHOWS_INTERFACES);
		}
		return showsInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Component_basedPackage.EREPOSITORY_VIEW_TYPE__SHOWS_COMPONENTS:
			return getShowsComponents();
		case Component_basedPackage.EREPOSITORY_VIEW_TYPE__SHOWS_INTERFACES:
			return getShowsInterfaces();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Component_basedPackage.EREPOSITORY_VIEW_TYPE__SHOWS_COMPONENTS:
			getShowsComponents().clear();
			getShowsComponents().addAll((Collection<? extends EComponent>) newValue);
			return;
		case Component_basedPackage.EREPOSITORY_VIEW_TYPE__SHOWS_INTERFACES:
			getShowsInterfaces().clear();
			getShowsInterfaces().addAll((Collection<? extends EInterface>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Component_basedPackage.EREPOSITORY_VIEW_TYPE__SHOWS_COMPONENTS:
			getShowsComponents().clear();
			return;
		case Component_basedPackage.EREPOSITORY_VIEW_TYPE__SHOWS_INTERFACES:
			getShowsInterfaces().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Component_basedPackage.EREPOSITORY_VIEW_TYPE__SHOWS_COMPONENTS:
			return showsComponents != null && !showsComponents.isEmpty();
		case Component_basedPackage.EREPOSITORY_VIEW_TYPE__SHOWS_INTERFACES:
			return showsInterfaces != null && !showsInterfaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ERepositoryViewTypeImpl
