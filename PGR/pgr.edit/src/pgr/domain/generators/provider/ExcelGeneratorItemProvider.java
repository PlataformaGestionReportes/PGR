/**
 */
package pgr.domain.generators.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import pgr.domain.generators.ExcelGenerator;
import pgr.domain.generators.GeneratorsPackage;

import pgr.provider.PgrEditPlugin;

/**
 * This is the item provider adapter for a {@link pgr.domain.generators.ExcelGenerator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExcelGeneratorItemProvider 
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
	public ExcelGeneratorItemProvider(AdapterFactory adapterFactory) {
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

			addAbsolutePathPropertyDescriptor(object);
			addWorkbookPropertyDescriptor(object);
			addNewDataSheetPropertyDescriptor(object);
			addDataSheetPropertyDescriptor(object);
			addColumnSheetPropertyDescriptor(object);
			addSheetPropertyDescriptor(object);
			addQueryStringPropertyDescriptor(object);
			addModelFactoryQMPropertyDescriptor(object);
			addResultSetPropertyDescriptor(object);
			addNamesFiltersPropertyDescriptor(object);
			addPosFiltersPropertyDescriptor(object);
			addTitlesMapPropertyDescriptor(object);
			addSetResultPropertyDescriptor(object);
			addListFixedPropertyDescriptor(object);
			addResultPropertyDescriptor(object);
			addTuplesListPropertyDescriptor(object);
			addColumnsPropertyDescriptor(object);
			addColumnsNamesPropertyDescriptor(object);
			addColumnsIndexPropertyDescriptor(object);
			addAccPropertyDescriptor(object);
			addFirstRowFilterPropertyDescriptor(object);
			addPosRowIniDataPropertyDescriptor(object);
			addPosCellIniDataPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Absolute Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAbsolutePathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExcelGenerator_absolutePath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExcelGenerator_absolutePath_feature", "_UI_ExcelGenerator_type"),
				 GeneratorsPackage.Literals.EXCEL_GENERATOR__ABSOLUTE_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Workbook feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWorkbookPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExcelGenerator_workbook_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExcelGenerator_workbook_feature", "_UI_ExcelGenerator_type"),
				 GeneratorsPackage.Literals.EXCEL_GENERATOR__WORKBOOK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the New Data Sheet feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNewDataSheetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExcelGenerator_newDataSheet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExcelGenerator_newDataSheet_feature", "_UI_ExcelGenerator_type"),
				 GeneratorsPackage.Literals.EXCEL_GENERATOR__NEW_DATA_SHEET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Sheet feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataSheetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExcelGenerator_dataSheet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExcelGenerator_dataSheet_feature", "_UI_ExcelGenerator_type"),
				 GeneratorsPackage.Literals.EXCEL_GENERATOR__DATA_SHEET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Column Sheet feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColumnSheetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExcelGenerator_columnSheet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExcelGenerator_columnSheet_feature", "_UI_ExcelGenerator_type"),
				 GeneratorsPackage.Literals.EXCEL_GENERATOR__COLUMN_SHEET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sheet feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSheetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExcelGenerator_sheet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExcelGenerator_sheet_feature", "_UI_ExcelGenerator_type"),
				 GeneratorsPackage.Literals.EXCEL_GENERATOR__SHEET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Query String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQueryStringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExcelGenerator_queryString_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExcelGenerator_queryString_feature", "_UI_ExcelGenerator_type"),
				 GeneratorsPackage.Literals.EXCEL_GENERATOR__QUERY_STRING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Model Factory QM feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModelFactoryQMPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExcelGenerator_modelFactoryQM_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExcelGenerator_modelFactoryQM_feature", "_UI_ExcelGenerator_type"),
				 GeneratorsPackage.Literals.EXCEL_GENERATOR__MODEL_FACTORY_QM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Result Set feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResultSetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExcelGenerator_resultSet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExcelGenerator_resultSet_feature", "_UI_ExcelGenerator_type"),
				 GeneratorsPackage.Literals.EXCEL_GENERATOR__RESULT_SET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Names Filters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamesFiltersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExcelGenerator_namesFilters_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExcelGenerator_namesFilters_feature", "_UI_ExcelGenerator_type"),
				 GeneratorsPackage.Literals.EXCEL_GENERATOR__NAMES_FILTERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pos Filters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPosFiltersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExcelGenerator_posFilters_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExcelGenerator_posFilters_feature", "_UI_ExcelGenerator_type"),
				 GeneratorsPackage.Literals.EXCEL_GENERATOR__POS_FILTERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Titles Map feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitlesMapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExcelGenerator_titlesMap_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExcelGenerator_titlesMap_feature", "_UI_ExcelGenerator_type"),
				 GeneratorsPackage.Literals.EXCEL_GENERATOR__TITLES_MAP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Set Result feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSetResultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExcelGenerator_setResult_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExcelGenerator_setResult_feature", "_UI_ExcelGenerator_type"),
				 GeneratorsPackage.Literals.EXCEL_GENERATOR__SET_RESULT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the List Fixed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addListFixedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExcelGenerator_listFixed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExcelGenerator_listFixed_feature", "_UI_ExcelGenerator_type"),
				 GeneratorsPackage.Literals.EXCEL_GENERATOR__LIST_FIXED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Result feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExcelGenerator_result_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExcelGenerator_result_feature", "_UI_ExcelGenerator_type"),
				 GeneratorsPackage.Literals.EXCEL_GENERATOR__RESULT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tuples List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTuplesListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExcelGenerator_tuplesList_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExcelGenerator_tuplesList_feature", "_UI_ExcelGenerator_type"),
				 GeneratorsPackage.Literals.EXCEL_GENERATOR__TUPLES_LIST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Columns feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColumnsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExcelGenerator_columns_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExcelGenerator_columns_feature", "_UI_ExcelGenerator_type"),
				 GeneratorsPackage.Literals.EXCEL_GENERATOR__COLUMNS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Columns Names feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColumnsNamesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExcelGenerator_columnsNames_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExcelGenerator_columnsNames_feature", "_UI_ExcelGenerator_type"),
				 GeneratorsPackage.Literals.EXCEL_GENERATOR__COLUMNS_NAMES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Columns Index feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColumnsIndexPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExcelGenerator_columnsIndex_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExcelGenerator_columnsIndex_feature", "_UI_ExcelGenerator_type"),
				 GeneratorsPackage.Literals.EXCEL_GENERATOR__COLUMNS_INDEX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Acc feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAccPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExcelGenerator_acc_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExcelGenerator_acc_feature", "_UI_ExcelGenerator_type"),
				 GeneratorsPackage.Literals.EXCEL_GENERATOR__ACC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the First Row Filter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFirstRowFilterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExcelGenerator_firstRowFilter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExcelGenerator_firstRowFilter_feature", "_UI_ExcelGenerator_type"),
				 GeneratorsPackage.Literals.EXCEL_GENERATOR__FIRST_ROW_FILTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pos Row Ini Data feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPosRowIniDataPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExcelGenerator_posRowIniData_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExcelGenerator_posRowIniData_feature", "_UI_ExcelGenerator_type"),
				 GeneratorsPackage.Literals.EXCEL_GENERATOR__POS_ROW_INI_DATA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pos Cell Ini Data feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPosCellIniDataPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExcelGenerator_posCellIniData_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExcelGenerator_posCellIniData_feature", "_UI_ExcelGenerator_type"),
				 GeneratorsPackage.Literals.EXCEL_GENERATOR__POS_CELL_INI_DATA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ExcelGenerator.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ExcelGenerator"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ArrayList labelValue = ((ExcelGenerator)object).getNamesFilters();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_ExcelGenerator_type") :
			getString("_UI_ExcelGenerator_type") + " " + label;
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

		switch (notification.getFeatureID(ExcelGenerator.class)) {
			case GeneratorsPackage.EXCEL_GENERATOR__ABSOLUTE_PATH:
			case GeneratorsPackage.EXCEL_GENERATOR__WORKBOOK:
			case GeneratorsPackage.EXCEL_GENERATOR__NEW_DATA_SHEET:
			case GeneratorsPackage.EXCEL_GENERATOR__DATA_SHEET:
			case GeneratorsPackage.EXCEL_GENERATOR__COLUMN_SHEET:
			case GeneratorsPackage.EXCEL_GENERATOR__SHEET:
			case GeneratorsPackage.EXCEL_GENERATOR__QUERY_STRING:
			case GeneratorsPackage.EXCEL_GENERATOR__MODEL_FACTORY_QM:
			case GeneratorsPackage.EXCEL_GENERATOR__RESULT_SET:
			case GeneratorsPackage.EXCEL_GENERATOR__NAMES_FILTERS:
			case GeneratorsPackage.EXCEL_GENERATOR__POS_FILTERS:
			case GeneratorsPackage.EXCEL_GENERATOR__TITLES_MAP:
			case GeneratorsPackage.EXCEL_GENERATOR__SET_RESULT:
			case GeneratorsPackage.EXCEL_GENERATOR__LIST_FIXED:
			case GeneratorsPackage.EXCEL_GENERATOR__RESULT:
			case GeneratorsPackage.EXCEL_GENERATOR__TUPLES_LIST:
			case GeneratorsPackage.EXCEL_GENERATOR__COLUMNS:
			case GeneratorsPackage.EXCEL_GENERATOR__COLUMNS_NAMES:
			case GeneratorsPackage.EXCEL_GENERATOR__COLUMNS_INDEX:
			case GeneratorsPackage.EXCEL_GENERATOR__ACC:
			case GeneratorsPackage.EXCEL_GENERATOR__FIRST_ROW_FILTER:
			case GeneratorsPackage.EXCEL_GENERATOR__POS_ROW_INI_DATA:
			case GeneratorsPackage.EXCEL_GENERATOR__POS_CELL_INI_DATA:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
