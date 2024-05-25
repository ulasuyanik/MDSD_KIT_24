/**
 */
package mdsd.component_based.provider;

import java.util.Collection;
import java.util.List;

import mdsd.component_based.Component_basedFactory;
import mdsd.component_based.Component_basedPackage;
import mdsd.component_based.ERoot;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link mdsd.component_based.ERoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ERootItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERootItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Component_basedPackage.Literals.EROOT__EVIEWPOINT);
			childrenFeatures.add(Component_basedPackage.Literals.EROOT__EVIEWTYPE);
			childrenFeatures.add(Component_basedPackage.Literals.EROOT__EPARAMETER);
			childrenFeatures.add(Component_basedPackage.Literals.EROOT__ESIGNATURE);
			childrenFeatures.add(Component_basedPackage.Literals.EROOT__EDELEGATIONCONNECTOR);
			childrenFeatures.add(Component_basedPackage.Literals.EROOT__EROLE);
			childrenFeatures.add(Component_basedPackage.Literals.EROOT__ELINK);
			childrenFeatures.add(Component_basedPackage.Literals.EROOT__ECONTAINER);
			childrenFeatures.add(Component_basedPackage.Literals.EROOT__EASSEMBLYCONNECTOR);
			childrenFeatures.add(Component_basedPackage.Literals.EROOT__EASSEMBLYCONTEXT);
			childrenFeatures.add(Component_basedPackage.Literals.EROOT__ECOMPONENT);
			childrenFeatures.add(Component_basedPackage.Literals.EROOT__ESERVICE);
			childrenFeatures.add(Component_basedPackage.Literals.EROOT__EINTERFACE);
			childrenFeatures.add(Component_basedPackage.Literals.EROOT__ESYSTEM);
			childrenFeatures.add(Component_basedPackage.Literals.EROOT__EREPOSITORY);
			childrenFeatures.add(Component_basedPackage.Literals.EROOT__EBEHAVIOURDESCRIPTION);
			childrenFeatures.add(Component_basedPackage.Literals.EROOT__EEXTERNALCALL);
			childrenFeatures.add(Component_basedPackage.Literals.EROOT__EINTERNALACTION);
			childrenFeatures.add(Component_basedPackage.Literals.EROOT__EBRANCH);
			childrenFeatures.add(Component_basedPackage.Literals.EROOT__ELOOP);
			childrenFeatures.add(Component_basedPackage.Literals.EROOT__ECOMPOSITECOMPONENT);
			childrenFeatures.add(Component_basedPackage.Literals.EROOT__EALLOCATIONCONTEXT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ERoot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ERoot"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ERoot_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ERoot.class)) {
		case Component_basedPackage.EROOT__EVIEWPOINT:
		case Component_basedPackage.EROOT__EVIEWTYPE:
		case Component_basedPackage.EROOT__EPARAMETER:
		case Component_basedPackage.EROOT__ESIGNATURE:
		case Component_basedPackage.EROOT__EDELEGATIONCONNECTOR:
		case Component_basedPackage.EROOT__EROLE:
		case Component_basedPackage.EROOT__ELINK:
		case Component_basedPackage.EROOT__ECONTAINER:
		case Component_basedPackage.EROOT__EASSEMBLYCONNECTOR:
		case Component_basedPackage.EROOT__EASSEMBLYCONTEXT:
		case Component_basedPackage.EROOT__ECOMPONENT:
		case Component_basedPackage.EROOT__ESERVICE:
		case Component_basedPackage.EROOT__EINTERFACE:
		case Component_basedPackage.EROOT__ESYSTEM:
		case Component_basedPackage.EROOT__EREPOSITORY:
		case Component_basedPackage.EROOT__EBEHAVIOURDESCRIPTION:
		case Component_basedPackage.EROOT__EEXTERNALCALL:
		case Component_basedPackage.EROOT__EINTERNALACTION:
		case Component_basedPackage.EROOT__EBRANCH:
		case Component_basedPackage.EROOT__ELOOP:
		case Component_basedPackage.EROOT__ECOMPOSITECOMPONENT:
		case Component_basedPackage.EROOT__EALLOCATIONCONTEXT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(Component_basedPackage.Literals.EROOT__EVIEWPOINT,
				Component_basedFactory.eINSTANCE.createESystemIndependentViewPoint()));

		newChildDescriptors.add(createChildParameter(Component_basedPackage.Literals.EROOT__EVIEWPOINT,
				Component_basedFactory.eINSTANCE.createEAssemblyViewPoint()));

		newChildDescriptors.add(createChildParameter(Component_basedPackage.Literals.EROOT__EVIEWPOINT,
				Component_basedFactory.eINSTANCE.createEDeploymentViewPoint()));

		newChildDescriptors.add(createChildParameter(Component_basedPackage.Literals.EROOT__EVIEWTYPE,
				Component_basedFactory.eINSTANCE.createEEnvironmentViewType()));

		newChildDescriptors.add(createChildParameter(Component_basedPackage.Literals.EROOT__EVIEWTYPE,
				Component_basedFactory.eINSTANCE.createEAllocationViewType()));

		newChildDescriptors.add(createChildParameter(Component_basedPackage.Literals.EROOT__EVIEWTYPE,
				Component_basedFactory.eINSTANCE.createEAssemblyViewType()));

		newChildDescriptors.add(createChildParameter(Component_basedPackage.Literals.EROOT__EVIEWTYPE,
				Component_basedFactory.eINSTANCE.createERepositoryViewType()));

		newChildDescriptors.add(createChildParameter(Component_basedPackage.Literals.EROOT__EPARAMETER,
				Component_basedFactory.eINSTANCE.createEParameter()));

		newChildDescriptors.add(createChildParameter(Component_basedPackage.Literals.EROOT__ESIGNATURE,
				Component_basedFactory.eINSTANCE.createESignature()));

		newChildDescriptors.add(createChildParameter(Component_basedPackage.Literals.EROOT__EDELEGATIONCONNECTOR,
				Component_basedFactory.eINSTANCE.createERequiredDelegationConnector()));

		newChildDescriptors.add(createChildParameter(Component_basedPackage.Literals.EROOT__EDELEGATIONCONNECTOR,
				Component_basedFactory.eINSTANCE.createEProvidedDelegationConnector()));

		newChildDescriptors.add(createChildParameter(Component_basedPackage.Literals.EROOT__EROLE,
				Component_basedFactory.eINSTANCE.createERequiredRole()));

		newChildDescriptors.add(createChildParameter(Component_basedPackage.Literals.EROOT__EROLE,
				Component_basedFactory.eINSTANCE.createEProvidedRole()));

		newChildDescriptors.add(createChildParameter(Component_basedPackage.Literals.EROOT__ELINK,
				Component_basedFactory.eINSTANCE.createELink()));

		newChildDescriptors.add(createChildParameter(Component_basedPackage.Literals.EROOT__ECONTAINER,
				Component_basedFactory.eINSTANCE.createEContainer()));

		newChildDescriptors.add(createChildParameter(Component_basedPackage.Literals.EROOT__EASSEMBLYCONNECTOR,
				Component_basedFactory.eINSTANCE.createEAssemblyConnector()));

		newChildDescriptors.add(createChildParameter(Component_basedPackage.Literals.EROOT__EASSEMBLYCONTEXT,
				Component_basedFactory.eINSTANCE.createEAssemblyContext()));

		newChildDescriptors.add(createChildParameter(Component_basedPackage.Literals.EROOT__ECOMPONENT,
				Component_basedFactory.eINSTANCE.createEComponent()));

		newChildDescriptors.add(createChildParameter(Component_basedPackage.Literals.EROOT__ECOMPONENT,
				Component_basedFactory.eINSTANCE.createECompositeComponent()));

		newChildDescriptors.add(createChildParameter(Component_basedPackage.Literals.EROOT__ESERVICE,
				Component_basedFactory.eINSTANCE.createEService()));

		newChildDescriptors.add(createChildParameter(Component_basedPackage.Literals.EROOT__EINTERFACE,
				Component_basedFactory.eINSTANCE.createEInterface()));

		newChildDescriptors.add(createChildParameter(Component_basedPackage.Literals.EROOT__ESYSTEM,
				Component_basedFactory.eINSTANCE.createESystem()));

		newChildDescriptors.add(createChildParameter(Component_basedPackage.Literals.EROOT__EREPOSITORY,
				Component_basedFactory.eINSTANCE.createERepository()));

		newChildDescriptors.add(createChildParameter(Component_basedPackage.Literals.EROOT__EBEHAVIOURDESCRIPTION,
				Component_basedFactory.eINSTANCE.createEBehaviourDescription()));

		newChildDescriptors.add(createChildParameter(Component_basedPackage.Literals.EROOT__EEXTERNALCALL,
				Component_basedFactory.eINSTANCE.createEExternalCall()));

		newChildDescriptors.add(createChildParameter(Component_basedPackage.Literals.EROOT__EINTERNALACTION,
				Component_basedFactory.eINSTANCE.createEInternalAction()));

		newChildDescriptors.add(createChildParameter(Component_basedPackage.Literals.EROOT__EBRANCH,
				Component_basedFactory.eINSTANCE.createEBranch()));

		newChildDescriptors.add(createChildParameter(Component_basedPackage.Literals.EROOT__ELOOP,
				Component_basedFactory.eINSTANCE.createELoop()));

		newChildDescriptors.add(createChildParameter(Component_basedPackage.Literals.EROOT__ECOMPOSITECOMPONENT,
				Component_basedFactory.eINSTANCE.createECompositeComponent()));

		newChildDescriptors.add(createChildParameter(Component_basedPackage.Literals.EROOT__EALLOCATIONCONTEXT,
				Component_basedFactory.eINSTANCE.createEAllocationContext()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == Component_basedPackage.Literals.EROOT__ECOMPONENT
				|| childFeature == Component_basedPackage.Literals.EROOT__ECOMPOSITECOMPONENT;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Component_basedEditPlugin.INSTANCE;
	}

}
