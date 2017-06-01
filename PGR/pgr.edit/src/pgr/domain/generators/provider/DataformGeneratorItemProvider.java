/**
 */
package pgr.domain.generators.provider;


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

import pgr.domain.generators.DataformGenerator;
import pgr.domain.generators.GeneratorsPackage;

import pgr.provider.PgrEditPlugin;

/**
 * This is the item provider adapter for a {@link pgr.domain.generators.DataformGenerator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataformGeneratorItemProvider 
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
	public DataformGeneratorItemProvider(AdapterFactory adapterFactory) {
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

			addModelFactoryPropertyDescriptor(object);
			addProjectPropertyDescriptor(object);
			addDataformDiagramPropertyDescriptor(object);
			addDomainDiagramPropertyDescriptor(object);
			addDomainClassPropertyDescriptor(object);
			addInterface1PropertyDescriptor(object);
			addContainerPropertyDescriptor(object);
			addPathPropertyDescriptor(object);
			addAbsolutePathPropertyDescriptor(object);
			addDimensPropertyDescriptor(object);
			addAmountContainersPropertyDescriptor(object);
			addAmountTablesPropertyDescriptor(object);
			addRelativeXPropertyDescriptor(object);
			addRelativeYPropertyDescriptor(object);
			addDataStartRowPropertyDescriptor(object);
			addDataStartCellPropertyDescriptor(object);
			addAmountCombosPropertyDescriptor(object);
			addReportNamePropertyDescriptor(object);
			addContainerEndRowPropertyDescriptor(object);
			addContainerEndCellPropertyDescriptor(object);
			addWorkbookPropertyDescriptor(object);
			addSheetPropertyDescriptor(object);
			addAdjacenciesXPropertyDescriptor(object);
			addAdjacenciesYPropertyDescriptor(object);
			addVisitedCellsPropertyDescriptor(object);
			addComboNamesSortedPropertyDescriptor(object);
			addCoordenadasComboBoxPropertyDescriptor(object);
			addListTablesPropertyDescriptor(object);
			addListComboBoxPropertyDescriptor(object);
			addListComboCordinatePropertyDescriptor(object);
			addMergedRegionsPropertyDescriptor(object);
			addCoordenadasInicioContenedoresPropertyDescriptor(object);
			addCoordenadasFinContenedoresPropertyDescriptor(object);
			addContainersPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Model Factory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModelFactoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataformGenerator_modelFactory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataformGenerator_modelFactory_feature", "_UI_DataformGenerator_type"),
				 GeneratorsPackage.Literals.DATAFORM_GENERATOR__MODEL_FACTORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Project feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProjectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataformGenerator_project_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataformGenerator_project_feature", "_UI_DataformGenerator_type"),
				 GeneratorsPackage.Literals.DATAFORM_GENERATOR__PROJECT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dataform Diagram feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataformDiagramPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataformGenerator_dataformDiagram_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataformGenerator_dataformDiagram_feature", "_UI_DataformGenerator_type"),
				 GeneratorsPackage.Literals.DATAFORM_GENERATOR__DATAFORM_DIAGRAM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Diagram feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainDiagramPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataformGenerator_domainDiagram_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataformGenerator_domainDiagram_feature", "_UI_DataformGenerator_type"),
				 GeneratorsPackage.Literals.DATAFORM_GENERATOR__DOMAIN_DIAGRAM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataformGenerator_domainClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataformGenerator_domainClass_feature", "_UI_DataformGenerator_type"),
				 GeneratorsPackage.Literals.DATAFORM_GENERATOR__DOMAIN_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interface1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterface1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataformGenerator_interface1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataformGenerator_interface1_feature", "_UI_DataformGenerator_type"),
				 GeneratorsPackage.Literals.DATAFORM_GENERATOR__INTERFACE1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Container feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataformGenerator_container_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataformGenerator_container_feature", "_UI_DataformGenerator_type"),
				 GeneratorsPackage.Literals.DATAFORM_GENERATOR__CONTAINER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataformGenerator_path_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataformGenerator_path_feature", "_UI_DataformGenerator_type"),
				 GeneratorsPackage.Literals.DATAFORM_GENERATOR__PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_DataformGenerator_absolutePath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataformGenerator_absolutePath_feature", "_UI_DataformGenerator_type"),
				 GeneratorsPackage.Literals.DATAFORM_GENERATOR__ABSOLUTE_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dimens feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDimensPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataformGenerator_dimens_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataformGenerator_dimens_feature", "_UI_DataformGenerator_type"),
				 GeneratorsPackage.Literals.DATAFORM_GENERATOR__DIMENS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Amount Containers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAmountContainersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataformGenerator_amountContainers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataformGenerator_amountContainers_feature", "_UI_DataformGenerator_type"),
				 GeneratorsPackage.Literals.DATAFORM_GENERATOR__AMOUNT_CONTAINERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Amount Tables feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAmountTablesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataformGenerator_amountTables_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataformGenerator_amountTables_feature", "_UI_DataformGenerator_type"),
				 GeneratorsPackage.Literals.DATAFORM_GENERATOR__AMOUNT_TABLES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Relative X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelativeXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataformGenerator_relativeX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataformGenerator_relativeX_feature", "_UI_DataformGenerator_type"),
				 GeneratorsPackage.Literals.DATAFORM_GENERATOR__RELATIVE_X,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Relative Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRelativeYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataformGenerator_relativeY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataformGenerator_relativeY_feature", "_UI_DataformGenerator_type"),
				 GeneratorsPackage.Literals.DATAFORM_GENERATOR__RELATIVE_Y,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Start Row feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataStartRowPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataformGenerator_dataStartRow_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataformGenerator_dataStartRow_feature", "_UI_DataformGenerator_type"),
				 GeneratorsPackage.Literals.DATAFORM_GENERATOR__DATA_START_ROW,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Start Cell feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataStartCellPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataformGenerator_dataStartCell_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataformGenerator_dataStartCell_feature", "_UI_DataformGenerator_type"),
				 GeneratorsPackage.Literals.DATAFORM_GENERATOR__DATA_START_CELL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Amount Combos feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAmountCombosPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataformGenerator_amountCombos_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataformGenerator_amountCombos_feature", "_UI_DataformGenerator_type"),
				 GeneratorsPackage.Literals.DATAFORM_GENERATOR__AMOUNT_COMBOS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Report Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReportNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataformGenerator_reportName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataformGenerator_reportName_feature", "_UI_DataformGenerator_type"),
				 GeneratorsPackage.Literals.DATAFORM_GENERATOR__REPORT_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Container End Row feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainerEndRowPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataformGenerator_containerEndRow_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataformGenerator_containerEndRow_feature", "_UI_DataformGenerator_type"),
				 GeneratorsPackage.Literals.DATAFORM_GENERATOR__CONTAINER_END_ROW,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Container End Cell feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainerEndCellPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataformGenerator_containerEndCell_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataformGenerator_containerEndCell_feature", "_UI_DataformGenerator_type"),
				 GeneratorsPackage.Literals.DATAFORM_GENERATOR__CONTAINER_END_CELL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
				 getString("_UI_DataformGenerator_workbook_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataformGenerator_workbook_feature", "_UI_DataformGenerator_type"),
				 GeneratorsPackage.Literals.DATAFORM_GENERATOR__WORKBOOK,
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
				 getString("_UI_DataformGenerator_sheet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataformGenerator_sheet_feature", "_UI_DataformGenerator_type"),
				 GeneratorsPackage.Literals.DATAFORM_GENERATOR__SHEET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Adjacencies X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdjacenciesXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataformGenerator_adjacenciesX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataformGenerator_adjacenciesX_feature", "_UI_DataformGenerator_type"),
				 GeneratorsPackage.Literals.DATAFORM_GENERATOR__ADJACENCIES_X,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Adjacencies Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdjacenciesYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataformGenerator_adjacenciesY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataformGenerator_adjacenciesY_feature", "_UI_DataformGenerator_type"),
				 GeneratorsPackage.Literals.DATAFORM_GENERATOR__ADJACENCIES_Y,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Visited Cells feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisitedCellsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataformGenerator_visitedCells_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataformGenerator_visitedCells_feature", "_UI_DataformGenerator_type"),
				 GeneratorsPackage.Literals.DATAFORM_GENERATOR__VISITED_CELLS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Combo Names Sorted feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComboNamesSortedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataformGenerator_comboNamesSorted_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataformGenerator_comboNamesSorted_feature", "_UI_DataformGenerator_type"),
				 GeneratorsPackage.Literals.DATAFORM_GENERATOR__COMBO_NAMES_SORTED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Coordenadas Combo Box feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCoordenadasComboBoxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataformGenerator_coordenadasComboBox_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataformGenerator_coordenadasComboBox_feature", "_UI_DataformGenerator_type"),
				 GeneratorsPackage.Literals.DATAFORM_GENERATOR__COORDENADAS_COMBO_BOX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the List Tables feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addListTablesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataformGenerator_listTables_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataformGenerator_listTables_feature", "_UI_DataformGenerator_type"),
				 GeneratorsPackage.Literals.DATAFORM_GENERATOR__LIST_TABLES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the List Combo Box feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addListComboBoxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataformGenerator_listComboBox_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataformGenerator_listComboBox_feature", "_UI_DataformGenerator_type"),
				 GeneratorsPackage.Literals.DATAFORM_GENERATOR__LIST_COMBO_BOX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the List Combo Cordinate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addListComboCordinatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataformGenerator_listComboCordinate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataformGenerator_listComboCordinate_feature", "_UI_DataformGenerator_type"),
				 GeneratorsPackage.Literals.DATAFORM_GENERATOR__LIST_COMBO_CORDINATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Merged Regions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMergedRegionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataformGenerator_mergedRegions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataformGenerator_mergedRegions_feature", "_UI_DataformGenerator_type"),
				 GeneratorsPackage.Literals.DATAFORM_GENERATOR__MERGED_REGIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Coordenadas Inicio Contenedores feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCoordenadasInicioContenedoresPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataformGenerator_coordenadasInicioContenedores_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataformGenerator_coordenadasInicioContenedores_feature", "_UI_DataformGenerator_type"),
				 GeneratorsPackage.Literals.DATAFORM_GENERATOR__COORDENADAS_INICIO_CONTENEDORES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Coordenadas Fin Contenedores feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCoordenadasFinContenedoresPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataformGenerator_coordenadasFinContenedores_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataformGenerator_coordenadasFinContenedores_feature", "_UI_DataformGenerator_type"),
				 GeneratorsPackage.Literals.DATAFORM_GENERATOR__COORDENADAS_FIN_CONTENEDORES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Containers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataformGenerator_containers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataformGenerator_containers_feature", "_UI_DataformGenerator_type"),
				 GeneratorsPackage.Literals.DATAFORM_GENERATOR__CONTAINERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns DataformGenerator.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DataformGenerator"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DataformGenerator)object).getReportName();
		return label == null || label.length() == 0 ?
			getString("_UI_DataformGenerator_type") :
			getString("_UI_DataformGenerator_type") + " " + label;
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

		switch (notification.getFeatureID(DataformGenerator.class)) {
			case GeneratorsPackage.DATAFORM_GENERATOR__MODEL_FACTORY:
			case GeneratorsPackage.DATAFORM_GENERATOR__PROJECT:
			case GeneratorsPackage.DATAFORM_GENERATOR__DATAFORM_DIAGRAM:
			case GeneratorsPackage.DATAFORM_GENERATOR__DOMAIN_DIAGRAM:
			case GeneratorsPackage.DATAFORM_GENERATOR__DOMAIN_CLASS:
			case GeneratorsPackage.DATAFORM_GENERATOR__INTERFACE1:
			case GeneratorsPackage.DATAFORM_GENERATOR__CONTAINER:
			case GeneratorsPackage.DATAFORM_GENERATOR__PATH:
			case GeneratorsPackage.DATAFORM_GENERATOR__ABSOLUTE_PATH:
			case GeneratorsPackage.DATAFORM_GENERATOR__DIMENS:
			case GeneratorsPackage.DATAFORM_GENERATOR__AMOUNT_CONTAINERS:
			case GeneratorsPackage.DATAFORM_GENERATOR__AMOUNT_TABLES:
			case GeneratorsPackage.DATAFORM_GENERATOR__RELATIVE_X:
			case GeneratorsPackage.DATAFORM_GENERATOR__RELATIVE_Y:
			case GeneratorsPackage.DATAFORM_GENERATOR__DATA_START_ROW:
			case GeneratorsPackage.DATAFORM_GENERATOR__DATA_START_CELL:
			case GeneratorsPackage.DATAFORM_GENERATOR__AMOUNT_COMBOS:
			case GeneratorsPackage.DATAFORM_GENERATOR__REPORT_NAME:
			case GeneratorsPackage.DATAFORM_GENERATOR__CONTAINER_END_ROW:
			case GeneratorsPackage.DATAFORM_GENERATOR__CONTAINER_END_CELL:
			case GeneratorsPackage.DATAFORM_GENERATOR__WORKBOOK:
			case GeneratorsPackage.DATAFORM_GENERATOR__SHEET:
			case GeneratorsPackage.DATAFORM_GENERATOR__ADJACENCIES_X:
			case GeneratorsPackage.DATAFORM_GENERATOR__ADJACENCIES_Y:
			case GeneratorsPackage.DATAFORM_GENERATOR__VISITED_CELLS:
			case GeneratorsPackage.DATAFORM_GENERATOR__COMBO_NAMES_SORTED:
			case GeneratorsPackage.DATAFORM_GENERATOR__COORDENADAS_COMBO_BOX:
			case GeneratorsPackage.DATAFORM_GENERATOR__LIST_TABLES:
			case GeneratorsPackage.DATAFORM_GENERATOR__LIST_COMBO_BOX:
			case GeneratorsPackage.DATAFORM_GENERATOR__LIST_COMBO_CORDINATE:
			case GeneratorsPackage.DATAFORM_GENERATOR__MERGED_REGIONS:
			case GeneratorsPackage.DATAFORM_GENERATOR__COORDENADAS_INICIO_CONTENEDORES:
			case GeneratorsPackage.DATAFORM_GENERATOR__COORDENADAS_FIN_CONTENEDORES:
			case GeneratorsPackage.DATAFORM_GENERATOR__CONTAINERS:
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
