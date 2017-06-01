/**
 */
package pgr.domain.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import pgr.domain.Domain;
import pgr.domain.DomainFactory;
import pgr.domain.DomainPackage;

import pgr.domain.generators.GeneratorsFactory;

import pgr.domain.util.UtilFactory;

import pgr.provider.PgrEditPlugin;

/**
 * This is the item provider adapter for a {@link pgr.domain.Domain} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainItemProvider(AdapterFactory adapterFactory) {
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

			addTheUIPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the The UI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTheUIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Domain_theUI_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Domain_theUI_feature", "_UI_Domain_type"),
				 DomainPackage.Literals.DOMAIN__THE_UI,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(DomainPackage.Literals.DOMAIN__LIST_REPORT);
			childrenFeatures.add(DomainPackage.Literals.DOMAIN__THE_VIEW_MODEL_GENERATOR);
			childrenFeatures.add(DomainPackage.Literals.DOMAIN__THE_DATAFORM_DIAGRAM_GENERATOR);
			childrenFeatures.add(DomainPackage.Literals.DOMAIN__THE_DATAFORM_GENERATOR);
			childrenFeatures.add(DomainPackage.Literals.DOMAIN__THE_EXCEL_GENERATOR);
			childrenFeatures.add(DomainPackage.Literals.DOMAIN__THE_EXCEL_UPDATER);
			childrenFeatures.add(DomainPackage.Literals.DOMAIN__THE_COORDINATE);
			childrenFeatures.add(DomainPackage.Literals.DOMAIN__THE_MERGED_REGION);
			childrenFeatures.add(DomainPackage.Literals.DOMAIN__THE_COMPARATOR_RANGE);
			childrenFeatures.add(DomainPackage.Literals.DOMAIN__THE_UNZIP);
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
	 * This returns Domain.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Domain"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Domain_type");
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

		switch (notification.getFeatureID(Domain.class)) {
			case DomainPackage.DOMAIN__LIST_REPORT:
			case DomainPackage.DOMAIN__THE_VIEW_MODEL_GENERATOR:
			case DomainPackage.DOMAIN__THE_DATAFORM_DIAGRAM_GENERATOR:
			case DomainPackage.DOMAIN__THE_DATAFORM_GENERATOR:
			case DomainPackage.DOMAIN__THE_EXCEL_GENERATOR:
			case DomainPackage.DOMAIN__THE_EXCEL_UPDATER:
			case DomainPackage.DOMAIN__THE_COORDINATE:
			case DomainPackage.DOMAIN__THE_MERGED_REGION:
			case DomainPackage.DOMAIN__THE_COMPARATOR_RANGE:
			case DomainPackage.DOMAIN__THE_UNZIP:
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

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.DOMAIN__LIST_REPORT,
				 DomainFactory.eINSTANCE.createReport()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.DOMAIN__THE_VIEW_MODEL_GENERATOR,
				 GeneratorsFactory.eINSTANCE.createViewModelGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.DOMAIN__THE_DATAFORM_DIAGRAM_GENERATOR,
				 GeneratorsFactory.eINSTANCE.createDataformDiagramGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.DOMAIN__THE_DATAFORM_GENERATOR,
				 GeneratorsFactory.eINSTANCE.createDataformGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.DOMAIN__THE_EXCEL_GENERATOR,
				 GeneratorsFactory.eINSTANCE.createExcelGenerator()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.DOMAIN__THE_EXCEL_UPDATER,
				 GeneratorsFactory.eINSTANCE.createExcelUpdater()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.DOMAIN__THE_COORDINATE,
				 UtilFactory.eINSTANCE.createCoordinate()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.DOMAIN__THE_MERGED_REGION,
				 UtilFactory.eINSTANCE.createMergedRegion()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.DOMAIN__THE_COMPARATOR_RANGE,
				 UtilFactory.eINSTANCE.createComparatorRange()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.DOMAIN__THE_UNZIP,
				 UtilFactory.eINSTANCE.createUnzip()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PgrEditPlugin.INSTANCE;
	}

}
