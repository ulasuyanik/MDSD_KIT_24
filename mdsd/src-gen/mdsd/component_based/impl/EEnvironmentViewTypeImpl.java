/**
 */
package mdsd.component_based.impl;

import java.util.Collection;

import mdsd.component_based.Component_basedPackage;
import mdsd.component_based.EContainer;
import mdsd.component_based.EEnvironmentViewType;
import mdsd.component_based.ELink;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EEnvironment View Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdsd.component_based.impl.EEnvironmentViewTypeImpl#getShowsContainers <em>Shows Containers</em>}</li>
 *   <li>{@link mdsd.component_based.impl.EEnvironmentViewTypeImpl#getShowsLinks <em>Shows Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EEnvironmentViewTypeImpl extends MinimalEObjectImpl.Container implements EEnvironmentViewType {
	/**
	 * The cached value of the '{@link #getShowsContainers() <em>Shows Containers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowsContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<EContainer> showsContainers;

	/**
	 * The cached value of the '{@link #getShowsLinks() <em>Shows Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowsLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<ELink> showsLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EEnvironmentViewTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Component_basedPackage.Literals.EENVIRONMENT_VIEW_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EContainer> getShowsContainers() {
		if (showsContainers == null) {
			showsContainers = new EObjectResolvingEList<EContainer>(EContainer.class, this,
					Component_basedPackage.EENVIRONMENT_VIEW_TYPE__SHOWS_CONTAINERS);
		}
		return showsContainers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ELink> getShowsLinks() {
		if (showsLinks == null) {
			showsLinks = new EObjectResolvingEList<ELink>(ELink.class, this,
					Component_basedPackage.EENVIRONMENT_VIEW_TYPE__SHOWS_LINKS);
		}
		return showsLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Component_basedPackage.EENVIRONMENT_VIEW_TYPE__SHOWS_CONTAINERS:
			return getShowsContainers();
		case Component_basedPackage.EENVIRONMENT_VIEW_TYPE__SHOWS_LINKS:
			return getShowsLinks();
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
		case Component_basedPackage.EENVIRONMENT_VIEW_TYPE__SHOWS_CONTAINERS:
			getShowsContainers().clear();
			getShowsContainers().addAll((Collection<? extends EContainer>) newValue);
			return;
		case Component_basedPackage.EENVIRONMENT_VIEW_TYPE__SHOWS_LINKS:
			getShowsLinks().clear();
			getShowsLinks().addAll((Collection<? extends ELink>) newValue);
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
		case Component_basedPackage.EENVIRONMENT_VIEW_TYPE__SHOWS_CONTAINERS:
			getShowsContainers().clear();
			return;
		case Component_basedPackage.EENVIRONMENT_VIEW_TYPE__SHOWS_LINKS:
			getShowsLinks().clear();
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
		case Component_basedPackage.EENVIRONMENT_VIEW_TYPE__SHOWS_CONTAINERS:
			return showsContainers != null && !showsContainers.isEmpty();
		case Component_basedPackage.EENVIRONMENT_VIEW_TYPE__SHOWS_LINKS:
			return showsLinks != null && !showsLinks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EEnvironmentViewTypeImpl
