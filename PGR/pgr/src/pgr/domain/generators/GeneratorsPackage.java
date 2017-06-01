/**
 */
package pgr.domain.generators;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pgr.domain.generators.GeneratorsFactory
 * @model kind="package"
 * @generated
 */
public interface GeneratorsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "generators";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///pgr/domain/generators.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pgr.domain.generators";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeneratorsPackage eINSTANCE = pgr.domain.generators.impl.GeneratorsPackageImpl.init();

	/**
	 * The meta object id for the '{@link pgr.domain.generators.impl.ViewModelGeneratorImpl <em>View Model Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.impl.ViewModelGeneratorImpl
	 * @see pgr.domain.generators.impl.GeneratorsPackageImpl#getViewModelGenerator()
	 * @generated
	 */
	int VIEW_MODEL_GENERATOR = 0;

	/**
	 * The feature id for the '<em><b>Model Factory QM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL_GENERATOR__MODEL_FACTORY_QM = 0;

	/**
	 * The feature id for the '<em><b>Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL_GENERATOR__PROJECTION = 1;

	/**
	 * The feature id for the '<em><b>View Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL_GENERATOR__VIEW_MODEL = 2;

	/**
	 * The feature id for the '<em><b>The Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL_GENERATOR__THE_DOMAIN = 3;

	/**
	 * The number of structural features of the '<em>View Model Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL_GENERATOR_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>View Model Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL_GENERATOR___VIEW_MODEL_GENERATOR__MODELFACTORY = 0;

	/**
	 * The operation id for the '<em>Generate View Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL_GENERATOR___GENERATE_VIEW_MODEL = 1;

	/**
	 * The operation id for the '<em>Explore Relations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL_GENERATOR___EXPLORE_RELATIONS__ELEMENTOCONSULTA_ELEMENTOCONSULTA_INTEGER = 2;

	/**
	 * The operation id for the '<em>Create View Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL_GENERATOR___CREATE_VIEW_MODEL = 3;

	/**
	 * The operation id for the '<em>Create Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL_GENERATOR___CREATE_ELEMENT__ELEMENTOCONSULTA = 4;

	/**
	 * The operation id for the '<em>Get Projection QM</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL_GENERATOR___GET_PROJECTION_QM = 5;

	/**
	 * The operation id for the '<em>Get Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL_GENERATOR___GET_PARENT = 6;

	/**
	 * The number of operations of the '<em>View Model Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODEL_GENERATOR_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link pgr.domain.generators.impl.DataformDiagramGeneratorImpl <em>Dataform Diagram Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.impl.DataformDiagramGeneratorImpl
	 * @see pgr.domain.generators.impl.GeneratorsPackageImpl#getDataformDiagramGenerator()
	 * @generated
	 */
	int DATAFORM_DIAGRAM_GENERATOR = 1;

	/**
	 * The feature id for the '<em><b>Model Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_DIAGRAM_GENERATOR__MODEL_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>Dataform Diagram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_DIAGRAM_GENERATOR__DATAFORM_DIAGRAM = 1;

	/**
	 * The feature id for the '<em><b>Interface1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_DIAGRAM_GENERATOR__INTERFACE1 = 2;

	/**
	 * The feature id for the '<em><b>The Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_DIAGRAM_GENERATOR__THE_DOMAIN = 3;

	/**
	 * The number of structural features of the '<em>Dataform Diagram Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_DIAGRAM_GENERATOR_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Dataform Diagram Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_DIAGRAM_GENERATOR___DATAFORM_DIAGRAM_GENERATOR__MODELFACTORY = 0;

	/**
	 * The operation id for the '<em>Salvar Diagram</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_DIAGRAM_GENERATOR___SALVAR_DIAGRAM__DIAGRAM = 1;

	/**
	 * The operation id for the '<em>Cargar Diagram</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_DIAGRAM_GENERATOR___CARGAR_DIAGRAM = 2;

	/**
	 * The operation id for the '<em>Reset Diagram</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_DIAGRAM_GENERATOR___RESET_DIAGRAM__STRING = 3;

	/**
	 * The operation id for the '<em>Generate Diagram</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_DIAGRAM_GENERATOR___GENERATE_DIAGRAM = 4;

	/**
	 * The operation id for the '<em>Create Diagram</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_DIAGRAM_GENERATOR___CREATE_DIAGRAM = 5;

	/**
	 * The operation id for the '<em>Init Components</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_DIAGRAM_GENERATOR___INIT_COMPONENTS__GRAPHICALCONTAINER_NODE = 6;

	/**
	 * The operation id for the '<em>Create Bounds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_DIAGRAM_GENERATOR___CREATE_BOUNDS__INT_INT_INT_INT = 7;

	/**
	 * The operation id for the '<em>Open Diagram</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_DIAGRAM_GENERATOR___OPEN_DIAGRAM__DIAGRAM = 8;

	/**
	 * The number of operations of the '<em>Dataform Diagram Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_DIAGRAM_GENERATOR_OPERATION_COUNT = 9;

	/**
	 * The meta object id for the '{@link pgr.domain.generators.impl.DataformGeneratorImpl <em>Dataform Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.impl.DataformGeneratorImpl
	 * @see pgr.domain.generators.impl.GeneratorsPackageImpl#getDataformGenerator()
	 * @generated
	 */
	int DATAFORM_GENERATOR = 2;

	/**
	 * The feature id for the '<em><b>Model Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR__MODEL_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR__PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Dataform Diagram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR__DATAFORM_DIAGRAM = 2;

	/**
	 * The feature id for the '<em><b>Domain Diagram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR__DOMAIN_DIAGRAM = 3;

	/**
	 * The feature id for the '<em><b>Domain Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR__DOMAIN_CLASS = 4;

	/**
	 * The feature id for the '<em><b>Interface1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR__INTERFACE1 = 5;

	/**
	 * The feature id for the '<em><b>Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR__CONTAINER = 6;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR__PATH = 7;

	/**
	 * The feature id for the '<em><b>Absolute Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR__ABSOLUTE_PATH = 8;

	/**
	 * The feature id for the '<em><b>Dimens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR__DIMENS = 9;

	/**
	 * The feature id for the '<em><b>Amount Containers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR__AMOUNT_CONTAINERS = 10;

	/**
	 * The feature id for the '<em><b>Amount Tables</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR__AMOUNT_TABLES = 11;

	/**
	 * The feature id for the '<em><b>Relative X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR__RELATIVE_X = 12;

	/**
	 * The feature id for the '<em><b>Relative Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR__RELATIVE_Y = 13;

	/**
	 * The feature id for the '<em><b>Data Start Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR__DATA_START_ROW = 14;

	/**
	 * The feature id for the '<em><b>Data Start Cell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR__DATA_START_CELL = 15;

	/**
	 * The feature id for the '<em><b>Amount Combos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR__AMOUNT_COMBOS = 16;

	/**
	 * The feature id for the '<em><b>Report Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR__REPORT_NAME = 17;

	/**
	 * The feature id for the '<em><b>Container End Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR__CONTAINER_END_ROW = 18;

	/**
	 * The feature id for the '<em><b>Container End Cell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR__CONTAINER_END_CELL = 19;

	/**
	 * The feature id for the '<em><b>Workbook</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR__WORKBOOK = 20;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR__SHEET = 21;

	/**
	 * The feature id for the '<em><b>Adjacencies X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR__ADJACENCIES_X = 22;

	/**
	 * The feature id for the '<em><b>Adjacencies Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR__ADJACENCIES_Y = 23;

	/**
	 * The feature id for the '<em><b>Visited Cells</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR__VISITED_CELLS = 24;

	/**
	 * The feature id for the '<em><b>Combo Names Sorted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR__COMBO_NAMES_SORTED = 25;

	/**
	 * The feature id for the '<em><b>Coordenadas Combo Box</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR__COORDENADAS_COMBO_BOX = 26;

	/**
	 * The feature id for the '<em><b>List Tables</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR__LIST_TABLES = 27;

	/**
	 * The feature id for the '<em><b>List Combo Box</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR__LIST_COMBO_BOX = 28;

	/**
	 * The feature id for the '<em><b>List Combo Cordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR__LIST_COMBO_CORDINATE = 29;

	/**
	 * The feature id for the '<em><b>Merged Regions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR__MERGED_REGIONS = 30;

	/**
	 * The feature id for the '<em><b>Coordenadas Inicio Contenedores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR__COORDENADAS_INICIO_CONTENEDORES = 31;

	/**
	 * The feature id for the '<em><b>Coordenadas Fin Contenedores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR__COORDENADAS_FIN_CONTENEDORES = 32;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR__CONTAINERS = 33;

	/**
	 * The feature id for the '<em><b>The Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR__THE_DOMAIN = 34;

	/**
	 * The number of structural features of the '<em>Dataform Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR_FEATURE_COUNT = 35;

	/**
	 * The operation id for the '<em>Dataform Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___DATAFORM_GENERATOR__STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Generate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___GENERATE = 1;

	/**
	 * The operation id for the '<em>Search Begin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___SEARCH_BEGIN = 2;

	/**
	 * The operation id for the '<em>Set Bounds Graphical Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___SET_BOUNDS_GRAPHICAL_CONTAINER__GRAPHICALCONTAINER_INT_INT_INT_INT = 3;

	/**
	 * The operation id for the '<em>Set Atributes Contaiment Relation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___SET_ATRIBUTES_CONTAIMENT_RELATION__CONTAINMENT_STRING = 4;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___INIT = 5;

	/**
	 * The operation id for the '<em>Reset Dataform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___RESET_DATAFORM = 6;

	/**
	 * The operation id for the '<em>Get Order View Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___GET_ORDER_VIEW_MODEL = 7;

	/**
	 * The operation id for the '<em>Get Extra Information</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___GET_EXTRA_INFORMATION = 8;

	/**
	 * The operation id for the '<em>Identify Merged Regions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___IDENTIFY_MERGED_REGIONS = 9;

	/**
	 * The operation id for the '<em>Search Merge Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___SEARCH_MERGE_REGION__MERGEDREGION_INT = 10;

	/**
	 * The operation id for the '<em>Explore Merged Regions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___EXPLORE_MERGED_REGIONS__MERGEDREGION = 11;

	/**
	 * The operation id for the '<em>Visit Table</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___VISIT_TABLE__MERGEDREGION = 12;

	/**
	 * The operation id for the '<em>Get Table Columns</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___GET_TABLE_COLUMNS__MERGEDREGION_INT = 13;

	/**
	 * The operation id for the '<em>Create Table</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___CREATE_TABLE__MERGEDREGION_ARRAYLIST = 14;

	/**
	 * The operation id for the '<em>Is Table Column</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___IS_TABLE_COLUMN__MERGEDREGION = 15;

	/**
	 * The operation id for the '<em>Is Table</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___IS_TABLE__INT_INT = 16;

	/**
	 * The operation id for the '<em>Visit Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___VISIT_REGION__MERGEDREGION = 17;

	/**
	 * The operation id for the '<em>Init Merged Regions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___INIT_MERGED_REGIONS__LIST = 18;

	/**
	 * The operation id for the '<em>Is Cell Range</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___IS_CELL_RANGE__INT_INT = 19;

	/**
	 * The operation id for the '<em>Get Dimention</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___GET_DIMENTION = 20;

	/**
	 * The operation id for the '<em>Get Number Tables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___GET_NUMBER_TABLES = 21;

	/**
	 * The operation id for the '<em>Get Tables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___GET_TABLES = 22;

	/**
	 * The operation id for the '<em>Salvar DF</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___SALVAR_DF = 23;

	/**
	 * The operation id for the '<em>Get XML</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___GET_XML__STRING = 24;

	/**
	 * The operation id for the '<em>Marcar Tablas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___MARCAR_TABLAS__ARRAYLIST = 25;

	/**
	 * The operation id for the '<em>Re Organizar Tablas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___RE_ORGANIZAR_TABLAS = 26;

	/**
	 * The operation id for the '<em>Get Max X</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___GET_MAX_X__ARRAYLIST = 27;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___IS_VALID__INT_INT = 28;

	/**
	 * The operation id for the '<em>Bfs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___BFS__INT_INT = 29;

	/**
	 * The operation id for the '<em>Recorrer Hoja</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___RECORRER_HOJA = 30;

	/**
	 * The operation id for the '<em>Create Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___CREATE_CONTAINER__INT_INT = 31;

	/**
	 * The operation id for the '<em>Get Amount Containers V</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___GET_AMOUNT_CONTAINERS_V__INT = 32;

	/**
	 * The operation id for the '<em>Calculate V</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___CALCULATE_V__INT = 33;

	/**
	 * The operation id for the '<em>Calculate H</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___CALCULATE_H__INT = 34;

	/**
	 * The operation id for the '<em>Get Amount Containers H</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___GET_AMOUNT_CONTAINERS_H__INT = 35;

	/**
	 * The operation id for the '<em>Capturar Numeros</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___CAPTURAR_NUMEROS__STRING = 36;

	/**
	 * The operation id for the '<em>Get Coordinates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___GET_COORDINATES__STRING = 37;

	/**
	 * The operation id for the '<em>Get Sizes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___GET_SIZES__STRING_STRING = 38;

	/**
	 * The operation id for the '<em>Stract Column</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___STRACT_COLUMN__STRING = 39;

	/**
	 * The operation id for the '<em>Get Sizes2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___GET_SIZES2__STRING_STRING = 40;

	/**
	 * The operation id for the '<em>Get Coordinates2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___GET_COORDINATES2__STRING = 41;

	/**
	 * The operation id for the '<em>To Int</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___TO_INT__STRING = 42;

	/**
	 * The operation id for the '<em>Pow</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___POW__INT_INT = 43;

	/**
	 * The operation id for the '<em>Get Cell Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___GET_CELL_VALUE__XSSFCELL = 44;

	/**
	 * The operation id for the '<em>Create Coordinate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR___CREATE_COORDINATE__INT_INT = 45;

	/**
	 * The number of operations of the '<em>Dataform Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAFORM_GENERATOR_OPERATION_COUNT = 46;

	/**
	 * The meta object id for the '{@link pgr.domain.generators.impl.ExcelGeneratorImpl <em>Excel Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.impl.ExcelGeneratorImpl
	 * @see pgr.domain.generators.impl.GeneratorsPackageImpl#getExcelGenerator()
	 * @generated
	 */
	int EXCEL_GENERATOR = 3;

	/**
	 * The feature id for the '<em><b>Absolute Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR__ABSOLUTE_PATH = 0;

	/**
	 * The feature id for the '<em><b>Workbook</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR__WORKBOOK = 1;

	/**
	 * The feature id for the '<em><b>New Data Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR__NEW_DATA_SHEET = 2;

	/**
	 * The feature id for the '<em><b>Data Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR__DATA_SHEET = 3;

	/**
	 * The feature id for the '<em><b>Column Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR__COLUMN_SHEET = 4;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR__SHEET = 5;

	/**
	 * The feature id for the '<em><b>Query String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR__QUERY_STRING = 6;

	/**
	 * The feature id for the '<em><b>Model Factory QM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR__MODEL_FACTORY_QM = 7;

	/**
	 * The feature id for the '<em><b>Result Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR__RESULT_SET = 8;

	/**
	 * The feature id for the '<em><b>Names Filters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR__NAMES_FILTERS = 9;

	/**
	 * The feature id for the '<em><b>Pos Filters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR__POS_FILTERS = 10;

	/**
	 * The feature id for the '<em><b>Titles Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR__TITLES_MAP = 11;

	/**
	 * The feature id for the '<em><b>Set Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR__SET_RESULT = 12;

	/**
	 * The feature id for the '<em><b>List Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR__LIST_FIXED = 13;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR__RESULT = 14;

	/**
	 * The feature id for the '<em><b>Tuples List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR__TUPLES_LIST = 15;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR__COLUMNS = 16;

	/**
	 * The feature id for the '<em><b>Columns Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR__COLUMNS_NAMES = 17;

	/**
	 * The feature id for the '<em><b>Columns Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR__COLUMNS_INDEX = 18;

	/**
	 * The feature id for the '<em><b>Acc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR__ACC = 19;

	/**
	 * The feature id for the '<em><b>First Row Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR__FIRST_ROW_FILTER = 20;

	/**
	 * The feature id for the '<em><b>Pos Row Ini Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR__POS_ROW_INI_DATA = 21;

	/**
	 * The feature id for the '<em><b>Pos Cell Ini Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR__POS_CELL_INI_DATA = 22;

	/**
	 * The feature id for the '<em><b>The Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR__THE_DOMAIN = 23;

	/**
	 * The number of structural features of the '<em>Excel Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR_FEATURE_COUNT = 24;

	/**
	 * The operation id for the '<em>Excel Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___EXCEL_GENERATOR__STRING_ARRAYLIST_ARRAYLIST_MODELFACTORY_INT_INT_STRING = 0;

	/**
	 * The operation id for the '<em>Excel Generator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___EXCEL_GENERATOR__STRING_ARRAYLIST_ARRAYLIST = 1;

	/**
	 * The operation id for the '<em>Create Relations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___CREATE_RELATIONS = 2;

	/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___INIT = 3;

	/**
	 * The operation id for the '<em>Init Data Sheet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___INIT_DATA_SHEET__ARRAYLIST = 4;

	/**
	 * The operation id for the '<em>Write File Columns</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___WRITE_FILE_COLUMNS__RESULTSET = 5;

	/**
	 * The operation id for the '<em>Create Table</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___CREATE_TABLE__ARRAYLIST_INT_XSSFSHEET = 6;

	/**
	 * The operation id for the '<em>Create Data Sheet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___CREATE_DATA_SHEET__RESULTSET = 7;

	/**
	 * The operation id for the '<em>Explore Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___EXPLORE_RESULT__ELIST_STRING = 8;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___EXECUTE__ARRAYLIST_HASHMAP_INT_INT_INT = 9;

	/**
	 * The operation id for the '<em>Read File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___READ_FILE = 10;

	/**
	 * The operation id for the '<em>Save Excel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___SAVE_EXCEL = 11;

	/**
	 * The operation id for the '<em>Create Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___CREATE_NAMES = 12;

	/**
	 * The operation id for the '<em>Read Sheet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___READ_SHEET = 13;

	/**
	 * The operation id for the '<em>Get Num To Col</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___GET_NUM_TO_COL__INT = 14;

	/**
	 * The operation id for the '<em>Get Resul Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___GET_RESUL_SET__XSSFSHEET = 15;

	/**
	 * The operation id for the '<em>Get Set Colum</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___GET_SET_COLUM__ARRAYLIST_INT = 16;

	/**
	 * The operation id for the '<em>Get Map Of Column By Column</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___GET_MAP_OF_COLUMN_BY_COLUMN__ARRAYLIST_INT_INT = 17;

	/**
	 * The operation id for the '<em>Create List Box</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___CREATE_LIST_BOX__ARRAYLIST_XSSFSHEET_INT_INT = 18;

	/**
	 * The operation id for the '<em>Build Data Sheet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___BUILD_DATA_SHEET__XSSFSHEET_HASHMAP_INT = 19;

	/**
	 * The operation id for the '<em>Set Indirect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___SET_INDIRECT = 20;

	/**
	 * The operation id for the '<em>Delete Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___DELETE_NAMES__XSSFWORKBOOK = 21;

	/**
	 * The operation id for the '<em>Name Table To Name Range</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___NAME_TABLE_TO_NAME_RANGE__XSSFSHEET_ARRAYLIST = 22;

	/**
	 * The operation id for the '<em>Count Formula</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___COUNT_FORMULA__INT_INT = 23;

	/**
	 * The operation id for the '<em>The Formula</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___THE_FORMULA__INT_INT_INT_INT_INTEGER_INT_INT = 24;

	/**
	 * The operation id for the '<em>Create Dependence</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___CREATE_DEPENDENCE__ARRAYLIST_HASHMAP_ARRAYLIST = 25;

	/**
	 * The operation id for the '<em>Get Titles</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___GET_TITLES__ARRAYLIST = 26;

	/**
	 * The operation id for the '<em>Remove Duplicate Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___REMOVE_DUPLICATE_VALUES__ARRAYLIST = 27;

	/**
	 * The operation id for the '<em>Get Atributtes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___GET_ATRIBUTTES__RESULTELEMENT = 28;

	/**
	 * The operation id for the '<em>Create Sheet Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___CREATE_SHEET_QUERY = 29;

	/**
	 * The operation id for the '<em>Remove Sheets</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___REMOVE_SHEETS = 30;

	/**
	 * The operation id for the '<em>Copy Excel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___COPY_EXCEL__STRING_STRING = 31;

	/**
	 * The operation id for the '<em>Open File Into Editor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___OPEN_FILE_INTO_EDITOR__STRING = 32;

	/**
	 * The operation id for the '<em>Get Dir</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___GET_DIR__STRING = 33;

	/**
	 * The operation id for the '<em>Get Cell Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___GET_CELL_VALUE__XSSFCELL = 34;

	/**
	 * The operation id for the '<em>Get Array List From Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR___GET_ARRAY_LIST_FROM_SET__SET = 35;

	/**
	 * The number of operations of the '<em>Excel Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_GENERATOR_OPERATION_COUNT = 36;

	/**
	 * The meta object id for the '{@link pgr.domain.generators.impl.ExcelUpdaterImpl <em>Excel Updater</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.impl.ExcelUpdaterImpl
	 * @see pgr.domain.generators.impl.GeneratorsPackageImpl#getExcelUpdater()
	 * @generated
	 */
	int EXCEL_UPDATER = 4;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_UPDATER__FILE_PATH = 0;

	/**
	 * The feature id for the '<em><b>String Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_UPDATER__STRING_QUERY = 1;

	/**
	 * The feature id for the '<em><b>Workbook</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_UPDATER__WORKBOOK = 2;

	/**
	 * The feature id for the '<em><b>Dc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_UPDATER__DC = 3;

	/**
	 * The feature id for the '<em><b>Pos Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_UPDATER__POS_FILTER = 4;

	/**
	 * The feature id for the '<em><b>List Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_UPDATER__LIST_FILTER = 5;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_UPDATER__DOMAIN = 6;

	/**
	 * The number of structural features of the '<em>Excel Updater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_UPDATER_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Excel Updater</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_UPDATER___EXCEL_UPDATER__STRING = 0;

	/**
	 * The operation id for the '<em>Read File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_UPDATER___READ_FILE = 1;

	/**
	 * The operation id for the '<em>Save Excel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_UPDATER___SAVE_EXCEL = 2;

	/**
	 * The operation id for the '<em>Execute Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_UPDATER___EXECUTE_QUERY = 3;

	/**
	 * The operation id for the '<em>Read Sheet Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_UPDATER___READ_SHEET_QUERY = 4;

	/**
	 * The operation id for the '<em>Create Coordinate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_UPDATER___CREATE_COORDINATE__INT_INT = 5;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_UPDATER___REFRESH = 6;

	/**
	 * The number of operations of the '<em>Excel Updater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_UPDATER_OPERATION_COUNT = 7;


	/**
	 * Returns the meta object for class '{@link pgr.domain.generators.ViewModelGenerator <em>View Model Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Model Generator</em>'.
	 * @see pgr.domain.generators.ViewModelGenerator
	 * @generated
	 */
	EClass getViewModelGenerator();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.ViewModelGenerator#getModelFactoryQM <em>Model Factory QM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Factory QM</em>'.
	 * @see pgr.domain.generators.ViewModelGenerator#getModelFactoryQM()
	 * @see #getViewModelGenerator()
	 * @generated
	 */
	EAttribute getViewModelGenerator_ModelFactoryQM();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.ViewModelGenerator#getProjection <em>Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Projection</em>'.
	 * @see pgr.domain.generators.ViewModelGenerator#getProjection()
	 * @see #getViewModelGenerator()
	 * @generated
	 */
	EAttribute getViewModelGenerator_Projection();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.ViewModelGenerator#getViewModel <em>View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Model</em>'.
	 * @see pgr.domain.generators.ViewModelGenerator#getViewModel()
	 * @see #getViewModelGenerator()
	 * @generated
	 */
	EAttribute getViewModelGenerator_ViewModel();

	/**
	 * Returns the meta object for the container reference '{@link pgr.domain.generators.ViewModelGenerator#getTheDomain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>The Domain</em>'.
	 * @see pgr.domain.generators.ViewModelGenerator#getTheDomain()
	 * @see #getViewModelGenerator()
	 * @generated
	 */
	EReference getViewModelGenerator_TheDomain();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ViewModelGenerator#ViewModelGenerator(gestionmodelosconsultas.ModelFactory) <em>View Model Generator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View Model Generator</em>' operation.
	 * @see pgr.domain.generators.ViewModelGenerator#ViewModelGenerator(gestionmodelosconsultas.ModelFactory)
	 * @generated
	 */
	EOperation getViewModelGenerator__ViewModelGenerator__ModelFactory();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ViewModelGenerator#generateViewModel() <em>Generate View Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate View Model</em>' operation.
	 * @see pgr.domain.generators.ViewModelGenerator#generateViewModel()
	 * @generated
	 */
	EOperation getViewModelGenerator__GenerateViewModel();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ViewModelGenerator#exploreRelations(gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta, gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta, java.lang.Integer) <em>Explore Relations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Explore Relations</em>' operation.
	 * @see pgr.domain.generators.ViewModelGenerator#exploreRelations(gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta, gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta, java.lang.Integer)
	 * @generated
	 */
	EOperation getViewModelGenerator__ExploreRelations__ElementoConsulta_ElementoConsulta_Integer();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ViewModelGenerator#createViewModel() <em>Create View Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create View Model</em>' operation.
	 * @see pgr.domain.generators.ViewModelGenerator#createViewModel()
	 * @generated
	 */
	EOperation getViewModelGenerator__CreateViewModel();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ViewModelGenerator#createElement(gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta) <em>Create Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Element</em>' operation.
	 * @see pgr.domain.generators.ViewModelGenerator#createElement(gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta)
	 * @generated
	 */
	EOperation getViewModelGenerator__CreateElement__ElementoConsulta();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ViewModelGenerator#getProjectionQM() <em>Get Projection QM</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Projection QM</em>' operation.
	 * @see pgr.domain.generators.ViewModelGenerator#getProjectionQM()
	 * @generated
	 */
	EOperation getViewModelGenerator__GetProjectionQM();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ViewModelGenerator#getParent() <em>Get Parent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Parent</em>' operation.
	 * @see pgr.domain.generators.ViewModelGenerator#getParent()
	 * @generated
	 */
	EOperation getViewModelGenerator__GetParent();

	/**
	 * Returns the meta object for class '{@link pgr.domain.generators.DataformDiagramGenerator <em>Dataform Diagram Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataform Diagram Generator</em>'.
	 * @see pgr.domain.generators.DataformDiagramGenerator
	 * @generated
	 */
	EClass getDataformDiagramGenerator();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.DataformDiagramGenerator#getModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Factory</em>'.
	 * @see pgr.domain.generators.DataformDiagramGenerator#getModelFactory()
	 * @see #getDataformDiagramGenerator()
	 * @generated
	 */
	EAttribute getDataformDiagramGenerator_ModelFactory();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.DataformDiagramGenerator#getDataformDiagram <em>Dataform Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dataform Diagram</em>'.
	 * @see pgr.domain.generators.DataformDiagramGenerator#getDataformDiagram()
	 * @see #getDataformDiagramGenerator()
	 * @generated
	 */
	EAttribute getDataformDiagramGenerator_DataformDiagram();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.DataformDiagramGenerator#getInterface1 <em>Interface1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface1</em>'.
	 * @see pgr.domain.generators.DataformDiagramGenerator#getInterface1()
	 * @see #getDataformDiagramGenerator()
	 * @generated
	 */
	EAttribute getDataformDiagramGenerator_Interface1();

	/**
	 * Returns the meta object for the container reference '{@link pgr.domain.generators.DataformDiagramGenerator#getTheDomain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>The Domain</em>'.
	 * @see pgr.domain.generators.DataformDiagramGenerator#getTheDomain()
	 * @see #getDataformDiagramGenerator()
	 * @generated
	 */
	EReference getDataformDiagramGenerator_TheDomain();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformDiagramGenerator#DataformDiagramGenerator(tooldataform.ModelFactory) <em>Dataform Diagram Generator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dataform Diagram Generator</em>' operation.
	 * @see pgr.domain.generators.DataformDiagramGenerator#DataformDiagramGenerator(tooldataform.ModelFactory)
	 * @generated
	 */
	EOperation getDataformDiagramGenerator__DataformDiagramGenerator__ModelFactory();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformDiagramGenerator#salvarDiagram(org.eclipse.gmf.runtime.notation.Diagram) <em>Salvar Diagram</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Salvar Diagram</em>' operation.
	 * @see pgr.domain.generators.DataformDiagramGenerator#salvarDiagram(org.eclipse.gmf.runtime.notation.Diagram)
	 * @generated
	 */
	EOperation getDataformDiagramGenerator__SalvarDiagram__Diagram();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformDiagramGenerator#cargarDiagram() <em>Cargar Diagram</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cargar Diagram</em>' operation.
	 * @see pgr.domain.generators.DataformDiagramGenerator#cargarDiagram()
	 * @generated
	 */
	EOperation getDataformDiagramGenerator__CargarDiagram();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformDiagramGenerator#resetDiagram(java.lang.String) <em>Reset Diagram</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reset Diagram</em>' operation.
	 * @see pgr.domain.generators.DataformDiagramGenerator#resetDiagram(java.lang.String)
	 * @generated
	 */
	EOperation getDataformDiagramGenerator__ResetDiagram__String();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformDiagramGenerator#generateDiagram() <em>Generate Diagram</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Diagram</em>' operation.
	 * @see pgr.domain.generators.DataformDiagramGenerator#generateDiagram()
	 * @generated
	 */
	EOperation getDataformDiagramGenerator__GenerateDiagram();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformDiagramGenerator#createDiagram() <em>Create Diagram</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Diagram</em>' operation.
	 * @see pgr.domain.generators.DataformDiagramGenerator#createDiagram()
	 * @generated
	 */
	EOperation getDataformDiagramGenerator__CreateDiagram();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformDiagramGenerator#initComponents(tooldataform.formmodel.containers.GraphicalContainer, org.eclipse.gmf.runtime.notation.Node) <em>Init Components</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init Components</em>' operation.
	 * @see pgr.domain.generators.DataformDiagramGenerator#initComponents(tooldataform.formmodel.containers.GraphicalContainer, org.eclipse.gmf.runtime.notation.Node)
	 * @generated
	 */
	EOperation getDataformDiagramGenerator__InitComponents__GraphicalContainer_Node();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformDiagramGenerator#createBounds(int, int, int, int) <em>Create Bounds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Bounds</em>' operation.
	 * @see pgr.domain.generators.DataformDiagramGenerator#createBounds(int, int, int, int)
	 * @generated
	 */
	EOperation getDataformDiagramGenerator__CreateBounds__int_int_int_int();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformDiagramGenerator#openDiagram(org.eclipse.gmf.runtime.notation.Diagram) <em>Open Diagram</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Open Diagram</em>' operation.
	 * @see pgr.domain.generators.DataformDiagramGenerator#openDiagram(org.eclipse.gmf.runtime.notation.Diagram)
	 * @generated
	 */
	EOperation getDataformDiagramGenerator__OpenDiagram__Diagram();

	/**
	 * Returns the meta object for class '{@link pgr.domain.generators.DataformGenerator <em>Dataform Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataform Generator</em>'.
	 * @see pgr.domain.generators.DataformGenerator
	 * @generated
	 */
	EClass getDataformGenerator();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.DataformGenerator#getModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Factory</em>'.
	 * @see pgr.domain.generators.DataformGenerator#getModelFactory()
	 * @see #getDataformGenerator()
	 * @generated
	 */
	EAttribute getDataformGenerator_ModelFactory();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.DataformGenerator#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project</em>'.
	 * @see pgr.domain.generators.DataformGenerator#getProject()
	 * @see #getDataformGenerator()
	 * @generated
	 */
	EAttribute getDataformGenerator_Project();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.DataformGenerator#getDataformDiagram <em>Dataform Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dataform Diagram</em>'.
	 * @see pgr.domain.generators.DataformGenerator#getDataformDiagram()
	 * @see #getDataformGenerator()
	 * @generated
	 */
	EAttribute getDataformGenerator_DataformDiagram();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.DataformGenerator#getDomainDiagram <em>Domain Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Diagram</em>'.
	 * @see pgr.domain.generators.DataformGenerator#getDomainDiagram()
	 * @see #getDataformGenerator()
	 * @generated
	 */
	EAttribute getDataformGenerator_DomainDiagram();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.DataformGenerator#getDomainClass <em>Domain Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Class</em>'.
	 * @see pgr.domain.generators.DataformGenerator#getDomainClass()
	 * @see #getDataformGenerator()
	 * @generated
	 */
	EAttribute getDataformGenerator_DomainClass();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.DataformGenerator#getInterface1 <em>Interface1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface1</em>'.
	 * @see pgr.domain.generators.DataformGenerator#getInterface1()
	 * @see #getDataformGenerator()
	 * @generated
	 */
	EAttribute getDataformGenerator_Interface1();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.DataformGenerator#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container</em>'.
	 * @see pgr.domain.generators.DataformGenerator#getContainer()
	 * @see #getDataformGenerator()
	 * @generated
	 */
	EAttribute getDataformGenerator_Container();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.DataformGenerator#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see pgr.domain.generators.DataformGenerator#getPath()
	 * @see #getDataformGenerator()
	 * @generated
	 */
	EAttribute getDataformGenerator_Path();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.DataformGenerator#getAbsolutePath <em>Absolute Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Absolute Path</em>'.
	 * @see pgr.domain.generators.DataformGenerator#getAbsolutePath()
	 * @see #getDataformGenerator()
	 * @generated
	 */
	EAttribute getDataformGenerator_AbsolutePath();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.DataformGenerator#getDimens <em>Dimens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimens</em>'.
	 * @see pgr.domain.generators.DataformGenerator#getDimens()
	 * @see #getDataformGenerator()
	 * @generated
	 */
	EAttribute getDataformGenerator_Dimens();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.DataformGenerator#getAmountContainers <em>Amount Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Containers</em>'.
	 * @see pgr.domain.generators.DataformGenerator#getAmountContainers()
	 * @see #getDataformGenerator()
	 * @generated
	 */
	EAttribute getDataformGenerator_AmountContainers();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.DataformGenerator#getAmountTables <em>Amount Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Tables</em>'.
	 * @see pgr.domain.generators.DataformGenerator#getAmountTables()
	 * @see #getDataformGenerator()
	 * @generated
	 */
	EAttribute getDataformGenerator_AmountTables();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.DataformGenerator#getRelativeX <em>Relative X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative X</em>'.
	 * @see pgr.domain.generators.DataformGenerator#getRelativeX()
	 * @see #getDataformGenerator()
	 * @generated
	 */
	EAttribute getDataformGenerator_RelativeX();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.DataformGenerator#getRelativeY <em>Relative Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Y</em>'.
	 * @see pgr.domain.generators.DataformGenerator#getRelativeY()
	 * @see #getDataformGenerator()
	 * @generated
	 */
	EAttribute getDataformGenerator_RelativeY();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.DataformGenerator#getDataStartRow <em>Data Start Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Start Row</em>'.
	 * @see pgr.domain.generators.DataformGenerator#getDataStartRow()
	 * @see #getDataformGenerator()
	 * @generated
	 */
	EAttribute getDataformGenerator_DataStartRow();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.DataformGenerator#getDataStartCell <em>Data Start Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Start Cell</em>'.
	 * @see pgr.domain.generators.DataformGenerator#getDataStartCell()
	 * @see #getDataformGenerator()
	 * @generated
	 */
	EAttribute getDataformGenerator_DataStartCell();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.DataformGenerator#getAmountCombos <em>Amount Combos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Combos</em>'.
	 * @see pgr.domain.generators.DataformGenerator#getAmountCombos()
	 * @see #getDataformGenerator()
	 * @generated
	 */
	EAttribute getDataformGenerator_AmountCombos();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.DataformGenerator#getReportName <em>Report Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Report Name</em>'.
	 * @see pgr.domain.generators.DataformGenerator#getReportName()
	 * @see #getDataformGenerator()
	 * @generated
	 */
	EAttribute getDataformGenerator_ReportName();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.DataformGenerator#getContainerEndRow <em>Container End Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container End Row</em>'.
	 * @see pgr.domain.generators.DataformGenerator#getContainerEndRow()
	 * @see #getDataformGenerator()
	 * @generated
	 */
	EAttribute getDataformGenerator_ContainerEndRow();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.DataformGenerator#getContainerEndCell <em>Container End Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container End Cell</em>'.
	 * @see pgr.domain.generators.DataformGenerator#getContainerEndCell()
	 * @see #getDataformGenerator()
	 * @generated
	 */
	EAttribute getDataformGenerator_ContainerEndCell();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.DataformGenerator#getWorkbook <em>Workbook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Workbook</em>'.
	 * @see pgr.domain.generators.DataformGenerator#getWorkbook()
	 * @see #getDataformGenerator()
	 * @generated
	 */
	EAttribute getDataformGenerator_Workbook();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.DataformGenerator#getSheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sheet</em>'.
	 * @see pgr.domain.generators.DataformGenerator#getSheet()
	 * @see #getDataformGenerator()
	 * @generated
	 */
	EAttribute getDataformGenerator_Sheet();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.DataformGenerator#getAdjacenciesX <em>Adjacencies X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adjacencies X</em>'.
	 * @see pgr.domain.generators.DataformGenerator#getAdjacenciesX()
	 * @see #getDataformGenerator()
	 * @generated
	 */
	EAttribute getDataformGenerator_AdjacenciesX();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.DataformGenerator#getAdjacenciesY <em>Adjacencies Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adjacencies Y</em>'.
	 * @see pgr.domain.generators.DataformGenerator#getAdjacenciesY()
	 * @see #getDataformGenerator()
	 * @generated
	 */
	EAttribute getDataformGenerator_AdjacenciesY();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.DataformGenerator#getVisitedCells <em>Visited Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visited Cells</em>'.
	 * @see pgr.domain.generators.DataformGenerator#getVisitedCells()
	 * @see #getDataformGenerator()
	 * @generated
	 */
	EAttribute getDataformGenerator_VisitedCells();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.DataformGenerator#getComboNamesSorted <em>Combo Names Sorted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Combo Names Sorted</em>'.
	 * @see pgr.domain.generators.DataformGenerator#getComboNamesSorted()
	 * @see #getDataformGenerator()
	 * @generated
	 */
	EAttribute getDataformGenerator_ComboNamesSorted();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.DataformGenerator#getCoordenadasComboBox <em>Coordenadas Combo Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordenadas Combo Box</em>'.
	 * @see pgr.domain.generators.DataformGenerator#getCoordenadasComboBox()
	 * @see #getDataformGenerator()
	 * @generated
	 */
	EAttribute getDataformGenerator_CoordenadasComboBox();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.DataformGenerator#getListTables <em>List Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Tables</em>'.
	 * @see pgr.domain.generators.DataformGenerator#getListTables()
	 * @see #getDataformGenerator()
	 * @generated
	 */
	EAttribute getDataformGenerator_ListTables();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.DataformGenerator#getListComboBox <em>List Combo Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Combo Box</em>'.
	 * @see pgr.domain.generators.DataformGenerator#getListComboBox()
	 * @see #getDataformGenerator()
	 * @generated
	 */
	EAttribute getDataformGenerator_ListComboBox();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.DataformGenerator#getListComboCordinate <em>List Combo Cordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Combo Cordinate</em>'.
	 * @see pgr.domain.generators.DataformGenerator#getListComboCordinate()
	 * @see #getDataformGenerator()
	 * @generated
	 */
	EAttribute getDataformGenerator_ListComboCordinate();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.DataformGenerator#getMergedRegions <em>Merged Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merged Regions</em>'.
	 * @see pgr.domain.generators.DataformGenerator#getMergedRegions()
	 * @see #getDataformGenerator()
	 * @generated
	 */
	EAttribute getDataformGenerator_MergedRegions();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.DataformGenerator#getCoordenadasInicioContenedores <em>Coordenadas Inicio Contenedores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordenadas Inicio Contenedores</em>'.
	 * @see pgr.domain.generators.DataformGenerator#getCoordenadasInicioContenedores()
	 * @see #getDataformGenerator()
	 * @generated
	 */
	EAttribute getDataformGenerator_CoordenadasInicioContenedores();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.DataformGenerator#getCoordenadasFinContenedores <em>Coordenadas Fin Contenedores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordenadas Fin Contenedores</em>'.
	 * @see pgr.domain.generators.DataformGenerator#getCoordenadasFinContenedores()
	 * @see #getDataformGenerator()
	 * @generated
	 */
	EAttribute getDataformGenerator_CoordenadasFinContenedores();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.DataformGenerator#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Containers</em>'.
	 * @see pgr.domain.generators.DataformGenerator#getContainers()
	 * @see #getDataformGenerator()
	 * @generated
	 */
	EAttribute getDataformGenerator_Containers();

	/**
	 * Returns the meta object for the container reference '{@link pgr.domain.generators.DataformGenerator#getTheDomain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>The Domain</em>'.
	 * @see pgr.domain.generators.DataformGenerator#getTheDomain()
	 * @see #getDataformGenerator()
	 * @generated
	 */
	EReference getDataformGenerator_TheDomain();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#DataformGenerator(java.lang.String, java.lang.String) <em>Dataform Generator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dataform Generator</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#DataformGenerator(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getDataformGenerator__DataformGenerator__String_String();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#generate() <em>Generate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#generate()
	 * @generated
	 */
	EOperation getDataformGenerator__Generate();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#searchBegin() <em>Search Begin</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Begin</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#searchBegin()
	 * @generated
	 */
	EOperation getDataformGenerator__SearchBegin();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#setBoundsGraphicalContainer(tooldataform.formmodel.containers.GraphicalContainer, int, int, int, int) <em>Set Bounds Graphical Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Bounds Graphical Container</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#setBoundsGraphicalContainer(tooldataform.formmodel.containers.GraphicalContainer, int, int, int, int)
	 * @generated
	 */
	EOperation getDataformGenerator__SetBoundsGraphicalContainer__GraphicalContainer_int_int_int_int();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#setAtributesContaimentRelation(tooldataform.formmodel.concreta.Containment, java.lang.String) <em>Set Atributes Contaiment Relation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Atributes Contaiment Relation</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#setAtributesContaimentRelation(tooldataform.formmodel.concreta.Containment, java.lang.String)
	 * @generated
	 */
	EOperation getDataformGenerator__SetAtributesContaimentRelation__Containment_String();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#init() <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#init()
	 * @generated
	 */
	EOperation getDataformGenerator__Init();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#resetDataform() <em>Reset Dataform</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reset Dataform</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#resetDataform()
	 * @generated
	 */
	EOperation getDataformGenerator__ResetDataform();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#getOrderViewModel() <em>Get Order View Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Order View Model</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#getOrderViewModel()
	 * @generated
	 */
	EOperation getDataformGenerator__GetOrderViewModel();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#getExtraInformation() <em>Get Extra Information</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Extra Information</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#getExtraInformation()
	 * @generated
	 */
	EOperation getDataformGenerator__GetExtraInformation();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#identifyMergedRegions() <em>Identify Merged Regions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Identify Merged Regions</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#identifyMergedRegions()
	 * @generated
	 */
	EOperation getDataformGenerator__IdentifyMergedRegions();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#searchMergeRegion(pgr.domain.util.MergedRegion, int) <em>Search Merge Region</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Merge Region</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#searchMergeRegion(pgr.domain.util.MergedRegion, int)
	 * @generated
	 */
	EOperation getDataformGenerator__SearchMergeRegion__MergedRegion_int();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#exploreMergedRegions(pgr.domain.util.MergedRegion) <em>Explore Merged Regions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Explore Merged Regions</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#exploreMergedRegions(pgr.domain.util.MergedRegion)
	 * @generated
	 */
	EOperation getDataformGenerator__ExploreMergedRegions__MergedRegion();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#visitTable(pgr.domain.util.MergedRegion) <em>Visit Table</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Visit Table</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#visitTable(pgr.domain.util.MergedRegion)
	 * @generated
	 */
	EOperation getDataformGenerator__VisitTable__MergedRegion();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#getTableColumns(pgr.domain.util.MergedRegion, int) <em>Get Table Columns</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Table Columns</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#getTableColumns(pgr.domain.util.MergedRegion, int)
	 * @generated
	 */
	EOperation getDataformGenerator__GetTableColumns__MergedRegion_int();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#createTable(pgr.domain.util.MergedRegion, java.util.ArrayList) <em>Create Table</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Table</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#createTable(pgr.domain.util.MergedRegion, java.util.ArrayList)
	 * @generated
	 */
	EOperation getDataformGenerator__CreateTable__MergedRegion_ArrayList();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#isTableColumn(pgr.domain.util.MergedRegion) <em>Is Table Column</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Table Column</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#isTableColumn(pgr.domain.util.MergedRegion)
	 * @generated
	 */
	EOperation getDataformGenerator__IsTableColumn__MergedRegion();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#isTable(int, int) <em>Is Table</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Table</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#isTable(int, int)
	 * @generated
	 */
	EOperation getDataformGenerator__IsTable__int_int();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#visitRegion(pgr.domain.util.MergedRegion) <em>Visit Region</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Visit Region</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#visitRegion(pgr.domain.util.MergedRegion)
	 * @generated
	 */
	EOperation getDataformGenerator__VisitRegion__MergedRegion();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#InitMergedRegions(java.util.List) <em>Init Merged Regions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init Merged Regions</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#InitMergedRegions(java.util.List)
	 * @generated
	 */
	EOperation getDataformGenerator__InitMergedRegions__List();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#isCellRange(int, int) <em>Is Cell Range</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Cell Range</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#isCellRange(int, int)
	 * @generated
	 */
	EOperation getDataformGenerator__IsCellRange__int_int();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#getDimention() <em>Get Dimention</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Dimention</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#getDimention()
	 * @generated
	 */
	EOperation getDataformGenerator__GetDimention();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#getNumberTables() <em>Get Number Tables</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Number Tables</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#getNumberTables()
	 * @generated
	 */
	EOperation getDataformGenerator__GetNumberTables();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#getTables() <em>Get Tables</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Tables</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#getTables()
	 * @generated
	 */
	EOperation getDataformGenerator__GetTables();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#salvarDF() <em>Salvar DF</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Salvar DF</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#salvarDF()
	 * @generated
	 */
	EOperation getDataformGenerator__SalvarDF();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#getXML(java.lang.String) <em>Get XML</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get XML</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#getXML(java.lang.String)
	 * @generated
	 */
	EOperation getDataformGenerator__GetXML__String();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#marcarTablas(java.util.ArrayList) <em>Marcar Tablas</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Marcar Tablas</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#marcarTablas(java.util.ArrayList)
	 * @generated
	 */
	EOperation getDataformGenerator__MarcarTablas__ArrayList();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#reOrganizarTablas() <em>Re Organizar Tablas</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Re Organizar Tablas</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#reOrganizarTablas()
	 * @generated
	 */
	EOperation getDataformGenerator__ReOrganizarTablas();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#getMaxX(java.util.ArrayList) <em>Get Max X</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Max X</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#getMaxX(java.util.ArrayList)
	 * @generated
	 */
	EOperation getDataformGenerator__GetMaxX__ArrayList();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#isValid(int, int) <em>Is Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#isValid(int, int)
	 * @generated
	 */
	EOperation getDataformGenerator__IsValid__int_int();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#bfs(int, int) <em>Bfs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Bfs</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#bfs(int, int)
	 * @generated
	 */
	EOperation getDataformGenerator__Bfs__int_int();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#recorrerHoja() <em>Recorrer Hoja</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Recorrer Hoja</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#recorrerHoja()
	 * @generated
	 */
	EOperation getDataformGenerator__RecorrerHoja();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#createContainer(int, int) <em>Create Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Container</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#createContainer(int, int)
	 * @generated
	 */
	EOperation getDataformGenerator__CreateContainer__int_int();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#getAmountContainersV(int) <em>Get Amount Containers V</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Amount Containers V</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#getAmountContainersV(int)
	 * @generated
	 */
	EOperation getDataformGenerator__GetAmountContainersV__int();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#calculateV(int) <em>Calculate V</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate V</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#calculateV(int)
	 * @generated
	 */
	EOperation getDataformGenerator__CalculateV__int();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#calculateH(int) <em>Calculate H</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate H</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#calculateH(int)
	 * @generated
	 */
	EOperation getDataformGenerator__CalculateH__int();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#getAmountContainersH(int) <em>Get Amount Containers H</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Amount Containers H</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#getAmountContainersH(int)
	 * @generated
	 */
	EOperation getDataformGenerator__GetAmountContainersH__int();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#capturarNumeros(java.lang.String) <em>Capturar Numeros</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Capturar Numeros</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#capturarNumeros(java.lang.String)
	 * @generated
	 */
	EOperation getDataformGenerator__CapturarNumeros__String();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#getCoordinates(java.lang.String) <em>Get Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Coordinates</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#getCoordinates(java.lang.String)
	 * @generated
	 */
	EOperation getDataformGenerator__GetCoordinates__String();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#getSizes(java.lang.String, java.lang.String) <em>Get Sizes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sizes</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#getSizes(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getDataformGenerator__GetSizes__String_String();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#stractColumn(java.lang.String) <em>Stract Column</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stract Column</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#stractColumn(java.lang.String)
	 * @generated
	 */
	EOperation getDataformGenerator__StractColumn__String();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#getSizes2(java.lang.String, java.lang.String) <em>Get Sizes2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sizes2</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#getSizes2(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getDataformGenerator__GetSizes2__String_String();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#getCoordinates2(java.lang.String) <em>Get Coordinates2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Coordinates2</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#getCoordinates2(java.lang.String)
	 * @generated
	 */
	EOperation getDataformGenerator__GetCoordinates2__String();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#toInt(java.lang.String) <em>To Int</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To Int</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#toInt(java.lang.String)
	 * @generated
	 */
	EOperation getDataformGenerator__ToInt__String();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#pow(int, int) <em>Pow</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pow</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#pow(int, int)
	 * @generated
	 */
	EOperation getDataformGenerator__Pow__int_int();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#getCellValue(org.apache.poi.xssf.usermodel.XSSFCell) <em>Get Cell Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cell Value</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#getCellValue(org.apache.poi.xssf.usermodel.XSSFCell)
	 * @generated
	 */
	EOperation getDataformGenerator__GetCellValue__XSSFCell();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.DataformGenerator#createCoordinate(int, int) <em>Create Coordinate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Coordinate</em>' operation.
	 * @see pgr.domain.generators.DataformGenerator#createCoordinate(int, int)
	 * @generated
	 */
	EOperation getDataformGenerator__CreateCoordinate__int_int();

	/**
	 * Returns the meta object for class '{@link pgr.domain.generators.ExcelGenerator <em>Excel Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Excel Generator</em>'.
	 * @see pgr.domain.generators.ExcelGenerator
	 * @generated
	 */
	EClass getExcelGenerator();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.ExcelGenerator#getAbsolutePath <em>Absolute Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Absolute Path</em>'.
	 * @see pgr.domain.generators.ExcelGenerator#getAbsolutePath()
	 * @see #getExcelGenerator()
	 * @generated
	 */
	EAttribute getExcelGenerator_AbsolutePath();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.ExcelGenerator#getWorkbook <em>Workbook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Workbook</em>'.
	 * @see pgr.domain.generators.ExcelGenerator#getWorkbook()
	 * @see #getExcelGenerator()
	 * @generated
	 */
	EAttribute getExcelGenerator_Workbook();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.ExcelGenerator#getNewDataSheet <em>New Data Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Data Sheet</em>'.
	 * @see pgr.domain.generators.ExcelGenerator#getNewDataSheet()
	 * @see #getExcelGenerator()
	 * @generated
	 */
	EAttribute getExcelGenerator_NewDataSheet();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.ExcelGenerator#getDataSheet <em>Data Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Sheet</em>'.
	 * @see pgr.domain.generators.ExcelGenerator#getDataSheet()
	 * @see #getExcelGenerator()
	 * @generated
	 */
	EAttribute getExcelGenerator_DataSheet();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.ExcelGenerator#getColumnSheet <em>Column Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Sheet</em>'.
	 * @see pgr.domain.generators.ExcelGenerator#getColumnSheet()
	 * @see #getExcelGenerator()
	 * @generated
	 */
	EAttribute getExcelGenerator_ColumnSheet();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.ExcelGenerator#getSheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sheet</em>'.
	 * @see pgr.domain.generators.ExcelGenerator#getSheet()
	 * @see #getExcelGenerator()
	 * @generated
	 */
	EAttribute getExcelGenerator_Sheet();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.ExcelGenerator#getQueryString <em>Query String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query String</em>'.
	 * @see pgr.domain.generators.ExcelGenerator#getQueryString()
	 * @see #getExcelGenerator()
	 * @generated
	 */
	EAttribute getExcelGenerator_QueryString();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.ExcelGenerator#getModelFactoryQM <em>Model Factory QM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Factory QM</em>'.
	 * @see pgr.domain.generators.ExcelGenerator#getModelFactoryQM()
	 * @see #getExcelGenerator()
	 * @generated
	 */
	EAttribute getExcelGenerator_ModelFactoryQM();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.ExcelGenerator#getResultSet <em>Result Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Set</em>'.
	 * @see pgr.domain.generators.ExcelGenerator#getResultSet()
	 * @see #getExcelGenerator()
	 * @generated
	 */
	EAttribute getExcelGenerator_ResultSet();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.ExcelGenerator#getNamesFilters <em>Names Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Names Filters</em>'.
	 * @see pgr.domain.generators.ExcelGenerator#getNamesFilters()
	 * @see #getExcelGenerator()
	 * @generated
	 */
	EAttribute getExcelGenerator_NamesFilters();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.ExcelGenerator#getPosFilters <em>Pos Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos Filters</em>'.
	 * @see pgr.domain.generators.ExcelGenerator#getPosFilters()
	 * @see #getExcelGenerator()
	 * @generated
	 */
	EAttribute getExcelGenerator_PosFilters();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.ExcelGenerator#getTitlesMap <em>Titles Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titles Map</em>'.
	 * @see pgr.domain.generators.ExcelGenerator#getTitlesMap()
	 * @see #getExcelGenerator()
	 * @generated
	 */
	EAttribute getExcelGenerator_TitlesMap();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.ExcelGenerator#getSetResult <em>Set Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Set Result</em>'.
	 * @see pgr.domain.generators.ExcelGenerator#getSetResult()
	 * @see #getExcelGenerator()
	 * @generated
	 */
	EAttribute getExcelGenerator_SetResult();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.ExcelGenerator#getListFixed <em>List Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Fixed</em>'.
	 * @see pgr.domain.generators.ExcelGenerator#getListFixed()
	 * @see #getExcelGenerator()
	 * @generated
	 */
	EAttribute getExcelGenerator_ListFixed();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.ExcelGenerator#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see pgr.domain.generators.ExcelGenerator#getResult()
	 * @see #getExcelGenerator()
	 * @generated
	 */
	EAttribute getExcelGenerator_Result();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.ExcelGenerator#getTuplesList <em>Tuples List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tuples List</em>'.
	 * @see pgr.domain.generators.ExcelGenerator#getTuplesList()
	 * @see #getExcelGenerator()
	 * @generated
	 */
	EAttribute getExcelGenerator_TuplesList();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.ExcelGenerator#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Columns</em>'.
	 * @see pgr.domain.generators.ExcelGenerator#getColumns()
	 * @see #getExcelGenerator()
	 * @generated
	 */
	EAttribute getExcelGenerator_Columns();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.ExcelGenerator#getColumnsNames <em>Columns Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Columns Names</em>'.
	 * @see pgr.domain.generators.ExcelGenerator#getColumnsNames()
	 * @see #getExcelGenerator()
	 * @generated
	 */
	EAttribute getExcelGenerator_ColumnsNames();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.ExcelGenerator#getColumnsIndex <em>Columns Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Columns Index</em>'.
	 * @see pgr.domain.generators.ExcelGenerator#getColumnsIndex()
	 * @see #getExcelGenerator()
	 * @generated
	 */
	EAttribute getExcelGenerator_ColumnsIndex();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.ExcelGenerator#getAcc <em>Acc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acc</em>'.
	 * @see pgr.domain.generators.ExcelGenerator#getAcc()
	 * @see #getExcelGenerator()
	 * @generated
	 */
	EAttribute getExcelGenerator_Acc();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.ExcelGenerator#getFirstRowFilter <em>First Row Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Row Filter</em>'.
	 * @see pgr.domain.generators.ExcelGenerator#getFirstRowFilter()
	 * @see #getExcelGenerator()
	 * @generated
	 */
	EAttribute getExcelGenerator_FirstRowFilter();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.ExcelGenerator#getPosRowIniData <em>Pos Row Ini Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos Row Ini Data</em>'.
	 * @see pgr.domain.generators.ExcelGenerator#getPosRowIniData()
	 * @see #getExcelGenerator()
	 * @generated
	 */
	EAttribute getExcelGenerator_PosRowIniData();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.ExcelGenerator#getPosCellIniData <em>Pos Cell Ini Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos Cell Ini Data</em>'.
	 * @see pgr.domain.generators.ExcelGenerator#getPosCellIniData()
	 * @see #getExcelGenerator()
	 * @generated
	 */
	EAttribute getExcelGenerator_PosCellIniData();

	/**
	 * Returns the meta object for the container reference '{@link pgr.domain.generators.ExcelGenerator#getTheDomain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>The Domain</em>'.
	 * @see pgr.domain.generators.ExcelGenerator#getTheDomain()
	 * @see #getExcelGenerator()
	 * @generated
	 */
	EReference getExcelGenerator_TheDomain();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelGenerator#ExcelGenerator(java.lang.String, java.util.ArrayList, java.util.ArrayList, gestionmodelosconsultas.ModelFactory, int, int, java.lang.String) <em>Excel Generator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Excel Generator</em>' operation.
	 * @see pgr.domain.generators.ExcelGenerator#ExcelGenerator(java.lang.String, java.util.ArrayList, java.util.ArrayList, gestionmodelosconsultas.ModelFactory, int, int, java.lang.String)
	 * @generated
	 */
	EOperation getExcelGenerator__ExcelGenerator__String_ArrayList_ArrayList_ModelFactory_int_int_String();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelGenerator#ExcelGenerator(java.lang.String, java.util.ArrayList, java.util.ArrayList) <em>Excel Generator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Excel Generator</em>' operation.
	 * @see pgr.domain.generators.ExcelGenerator#ExcelGenerator(java.lang.String, java.util.ArrayList, java.util.ArrayList)
	 * @generated
	 */
	EOperation getExcelGenerator__ExcelGenerator__String_ArrayList_ArrayList();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelGenerator#createRelations() <em>Create Relations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Relations</em>' operation.
	 * @see pgr.domain.generators.ExcelGenerator#createRelations()
	 * @generated
	 */
	EOperation getExcelGenerator__CreateRelations();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelGenerator#init() <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init</em>' operation.
	 * @see pgr.domain.generators.ExcelGenerator#init()
	 * @generated
	 */
	EOperation getExcelGenerator__Init();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelGenerator#initDataSheet(java.util.ArrayList) <em>Init Data Sheet</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init Data Sheet</em>' operation.
	 * @see pgr.domain.generators.ExcelGenerator#initDataSheet(java.util.ArrayList)
	 * @generated
	 */
	EOperation getExcelGenerator__InitDataSheet__ArrayList();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelGenerator#writeFileColumns(java.sql.ResultSet) <em>Write File Columns</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Write File Columns</em>' operation.
	 * @see pgr.domain.generators.ExcelGenerator#writeFileColumns(java.sql.ResultSet)
	 * @generated
	 */
	EOperation getExcelGenerator__WriteFileColumns__ResultSet();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelGenerator#createTable(java.util.ArrayList, int, org.apache.poi.xssf.usermodel.XSSFSheet) <em>Create Table</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Table</em>' operation.
	 * @see pgr.domain.generators.ExcelGenerator#createTable(java.util.ArrayList, int, org.apache.poi.xssf.usermodel.XSSFSheet)
	 * @generated
	 */
	EOperation getExcelGenerator__CreateTable__ArrayList_int_XSSFSheet();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelGenerator#createDataSheet(java.sql.ResultSet) <em>Create Data Sheet</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Data Sheet</em>' operation.
	 * @see pgr.domain.generators.ExcelGenerator#createDataSheet(java.sql.ResultSet)
	 * @generated
	 */
	EOperation getExcelGenerator__CreateDataSheet__ResultSet();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelGenerator#exploreResult(org.eclipse.emf.common.util.EList, java.lang.String) <em>Explore Result</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Explore Result</em>' operation.
	 * @see pgr.domain.generators.ExcelGenerator#exploreResult(org.eclipse.emf.common.util.EList, java.lang.String)
	 * @generated
	 */
	EOperation getExcelGenerator__ExploreResult__EList_String();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelGenerator#execute(java.util.ArrayList, java.util.HashMap, int, int, int) <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see pgr.domain.generators.ExcelGenerator#execute(java.util.ArrayList, java.util.HashMap, int, int, int)
	 * @generated
	 */
	EOperation getExcelGenerator__Execute__ArrayList_HashMap_int_int_int();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelGenerator#readFile() <em>Read File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read File</em>' operation.
	 * @see pgr.domain.generators.ExcelGenerator#readFile()
	 * @generated
	 */
	EOperation getExcelGenerator__ReadFile();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelGenerator#saveExcel() <em>Save Excel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save Excel</em>' operation.
	 * @see pgr.domain.generators.ExcelGenerator#saveExcel()
	 * @generated
	 */
	EOperation getExcelGenerator__SaveExcel();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelGenerator#createNames() <em>Create Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Names</em>' operation.
	 * @see pgr.domain.generators.ExcelGenerator#createNames()
	 * @generated
	 */
	EOperation getExcelGenerator__CreateNames();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelGenerator#readSheet() <em>Read Sheet</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read Sheet</em>' operation.
	 * @see pgr.domain.generators.ExcelGenerator#readSheet()
	 * @generated
	 */
	EOperation getExcelGenerator__ReadSheet();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelGenerator#getNumToCol(int) <em>Get Num To Col</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Num To Col</em>' operation.
	 * @see pgr.domain.generators.ExcelGenerator#getNumToCol(int)
	 * @generated
	 */
	EOperation getExcelGenerator__GetNumToCol__int();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelGenerator#getResulSet(org.apache.poi.xssf.usermodel.XSSFSheet) <em>Get Resul Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Resul Set</em>' operation.
	 * @see pgr.domain.generators.ExcelGenerator#getResulSet(org.apache.poi.xssf.usermodel.XSSFSheet)
	 * @generated
	 */
	EOperation getExcelGenerator__GetResulSet__XSSFSheet();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelGenerator#getSetColum(java.util.ArrayList, int) <em>Get Set Colum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Set Colum</em>' operation.
	 * @see pgr.domain.generators.ExcelGenerator#getSetColum(java.util.ArrayList, int)
	 * @generated
	 */
	EOperation getExcelGenerator__GetSetColum__ArrayList_int();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelGenerator#getMapOfColumnByColumn(java.util.ArrayList, int, int) <em>Get Map Of Column By Column</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Map Of Column By Column</em>' operation.
	 * @see pgr.domain.generators.ExcelGenerator#getMapOfColumnByColumn(java.util.ArrayList, int, int)
	 * @generated
	 */
	EOperation getExcelGenerator__GetMapOfColumnByColumn__ArrayList_int_int();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelGenerator#createListBox(java.util.ArrayList, org.apache.poi.xssf.usermodel.XSSFSheet, int, int) <em>Create List Box</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create List Box</em>' operation.
	 * @see pgr.domain.generators.ExcelGenerator#createListBox(java.util.ArrayList, org.apache.poi.xssf.usermodel.XSSFSheet, int, int)
	 * @generated
	 */
	EOperation getExcelGenerator__CreateListBox__ArrayList_XSSFSheet_int_int();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelGenerator#buildDataSheet(org.apache.poi.xssf.usermodel.XSSFSheet, java.util.HashMap, int) <em>Build Data Sheet</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Build Data Sheet</em>' operation.
	 * @see pgr.domain.generators.ExcelGenerator#buildDataSheet(org.apache.poi.xssf.usermodel.XSSFSheet, java.util.HashMap, int)
	 * @generated
	 */
	EOperation getExcelGenerator__BuildDataSheet__XSSFSheet_HashMap_int();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelGenerator#setIndirect() <em>Set Indirect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Indirect</em>' operation.
	 * @see pgr.domain.generators.ExcelGenerator#setIndirect()
	 * @generated
	 */
	EOperation getExcelGenerator__SetIndirect();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelGenerator#deleteNames(org.apache.poi.xssf.usermodel.XSSFWorkbook) <em>Delete Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Names</em>' operation.
	 * @see pgr.domain.generators.ExcelGenerator#deleteNames(org.apache.poi.xssf.usermodel.XSSFWorkbook)
	 * @generated
	 */
	EOperation getExcelGenerator__DeleteNames__XSSFWorkbook();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelGenerator#nameTableToNameRange(org.apache.poi.xssf.usermodel.XSSFSheet, java.util.ArrayList) <em>Name Table To Name Range</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Name Table To Name Range</em>' operation.
	 * @see pgr.domain.generators.ExcelGenerator#nameTableToNameRange(org.apache.poi.xssf.usermodel.XSSFSheet, java.util.ArrayList)
	 * @generated
	 */
	EOperation getExcelGenerator__NameTableToNameRange__XSSFSheet_ArrayList();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelGenerator#countFormula(int, int) <em>Count Formula</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Count Formula</em>' operation.
	 * @see pgr.domain.generators.ExcelGenerator#countFormula(int, int)
	 * @generated
	 */
	EOperation getExcelGenerator__CountFormula__int_int();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelGenerator#theFormula(int, int, int, int, java.lang.Integer, int, int) <em>The Formula</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>The Formula</em>' operation.
	 * @see pgr.domain.generators.ExcelGenerator#theFormula(int, int, int, int, java.lang.Integer, int, int)
	 * @generated
	 */
	EOperation getExcelGenerator__TheFormula__int_int_int_int_Integer_int_int();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelGenerator#createDependence(java.util.ArrayList, java.util.HashMap, java.util.ArrayList) <em>Create Dependence</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Dependence</em>' operation.
	 * @see pgr.domain.generators.ExcelGenerator#createDependence(java.util.ArrayList, java.util.HashMap, java.util.ArrayList)
	 * @generated
	 */
	EOperation getExcelGenerator__CreateDependence__ArrayList_HashMap_ArrayList();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelGenerator#getTitles(java.util.ArrayList) <em>Get Titles</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Titles</em>' operation.
	 * @see pgr.domain.generators.ExcelGenerator#getTitles(java.util.ArrayList)
	 * @generated
	 */
	EOperation getExcelGenerator__GetTitles__ArrayList();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelGenerator#removeDuplicateValues(java.util.ArrayList) <em>Remove Duplicate Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Duplicate Values</em>' operation.
	 * @see pgr.domain.generators.ExcelGenerator#removeDuplicateValues(java.util.ArrayList)
	 * @generated
	 */
	EOperation getExcelGenerator__RemoveDuplicateValues__ArrayList();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelGenerator#getAtributtes(gestionmodelosconsultas.modeloconsultas.resultset.ResultElement) <em>Get Atributtes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Atributtes</em>' operation.
	 * @see pgr.domain.generators.ExcelGenerator#getAtributtes(gestionmodelosconsultas.modeloconsultas.resultset.ResultElement)
	 * @generated
	 */
	EOperation getExcelGenerator__GetAtributtes__ResultElement();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelGenerator#createSheetQuery() <em>Create Sheet Query</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Sheet Query</em>' operation.
	 * @see pgr.domain.generators.ExcelGenerator#createSheetQuery()
	 * @generated
	 */
	EOperation getExcelGenerator__CreateSheetQuery();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelGenerator#removeSheets() <em>Remove Sheets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Sheets</em>' operation.
	 * @see pgr.domain.generators.ExcelGenerator#removeSheets()
	 * @generated
	 */
	EOperation getExcelGenerator__RemoveSheets();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelGenerator#copyExcel(java.lang.String, java.lang.String) <em>Copy Excel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Copy Excel</em>' operation.
	 * @see pgr.domain.generators.ExcelGenerator#copyExcel(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getExcelGenerator__CopyExcel__String_String();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelGenerator#openFileIntoEditor(java.lang.String) <em>Open File Into Editor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Open File Into Editor</em>' operation.
	 * @see pgr.domain.generators.ExcelGenerator#openFileIntoEditor(java.lang.String)
	 * @generated
	 */
	EOperation getExcelGenerator__OpenFileIntoEditor__String();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelGenerator#getDir(java.lang.String) <em>Get Dir</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Dir</em>' operation.
	 * @see pgr.domain.generators.ExcelGenerator#getDir(java.lang.String)
	 * @generated
	 */
	EOperation getExcelGenerator__GetDir__String();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelGenerator#getCellValue(org.apache.poi.xssf.usermodel.XSSFCell) <em>Get Cell Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cell Value</em>' operation.
	 * @see pgr.domain.generators.ExcelGenerator#getCellValue(org.apache.poi.xssf.usermodel.XSSFCell)
	 * @generated
	 */
	EOperation getExcelGenerator__GetCellValue__XSSFCell();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelGenerator#getArrayListFromSet(java.util.Set) <em>Get Array List From Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Array List From Set</em>' operation.
	 * @see pgr.domain.generators.ExcelGenerator#getArrayListFromSet(java.util.Set)
	 * @generated
	 */
	EOperation getExcelGenerator__GetArrayListFromSet__Set();

	/**
	 * Returns the meta object for class '{@link pgr.domain.generators.ExcelUpdater <em>Excel Updater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Excel Updater</em>'.
	 * @see pgr.domain.generators.ExcelUpdater
	 * @generated
	 */
	EClass getExcelUpdater();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.ExcelUpdater#getFilePath <em>File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Path</em>'.
	 * @see pgr.domain.generators.ExcelUpdater#getFilePath()
	 * @see #getExcelUpdater()
	 * @generated
	 */
	EAttribute getExcelUpdater_FilePath();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.ExcelUpdater#getStringQuery <em>String Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Query</em>'.
	 * @see pgr.domain.generators.ExcelUpdater#getStringQuery()
	 * @see #getExcelUpdater()
	 * @generated
	 */
	EAttribute getExcelUpdater_StringQuery();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.ExcelUpdater#getWorkbook <em>Workbook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Workbook</em>'.
	 * @see pgr.domain.generators.ExcelUpdater#getWorkbook()
	 * @see #getExcelUpdater()
	 * @generated
	 */
	EAttribute getExcelUpdater_Workbook();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.ExcelUpdater#getDc <em>Dc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dc</em>'.
	 * @see pgr.domain.generators.ExcelUpdater#getDc()
	 * @see #getExcelUpdater()
	 * @generated
	 */
	EAttribute getExcelUpdater_Dc();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.ExcelUpdater#getPosFilter <em>Pos Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos Filter</em>'.
	 * @see pgr.domain.generators.ExcelUpdater#getPosFilter()
	 * @see #getExcelUpdater()
	 * @generated
	 */
	EAttribute getExcelUpdater_PosFilter();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.generators.ExcelUpdater#getListFilter <em>List Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Filter</em>'.
	 * @see pgr.domain.generators.ExcelUpdater#getListFilter()
	 * @see #getExcelUpdater()
	 * @generated
	 */
	EAttribute getExcelUpdater_ListFilter();

	/**
	 * Returns the meta object for the container reference '{@link pgr.domain.generators.ExcelUpdater#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Domain</em>'.
	 * @see pgr.domain.generators.ExcelUpdater#getDomain()
	 * @see #getExcelUpdater()
	 * @generated
	 */
	EReference getExcelUpdater_Domain();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelUpdater#ExcelUpdater(java.lang.String) <em>Excel Updater</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Excel Updater</em>' operation.
	 * @see pgr.domain.generators.ExcelUpdater#ExcelUpdater(java.lang.String)
	 * @generated
	 */
	EOperation getExcelUpdater__ExcelUpdater__String();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelUpdater#readFile() <em>Read File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read File</em>' operation.
	 * @see pgr.domain.generators.ExcelUpdater#readFile()
	 * @generated
	 */
	EOperation getExcelUpdater__ReadFile();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelUpdater#saveExcel() <em>Save Excel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Save Excel</em>' operation.
	 * @see pgr.domain.generators.ExcelUpdater#saveExcel()
	 * @generated
	 */
	EOperation getExcelUpdater__SaveExcel();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelUpdater#executeQuery() <em>Execute Query</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute Query</em>' operation.
	 * @see pgr.domain.generators.ExcelUpdater#executeQuery()
	 * @generated
	 */
	EOperation getExcelUpdater__ExecuteQuery();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelUpdater#readSheetQuery() <em>Read Sheet Query</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read Sheet Query</em>' operation.
	 * @see pgr.domain.generators.ExcelUpdater#readSheetQuery()
	 * @generated
	 */
	EOperation getExcelUpdater__ReadSheetQuery();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelUpdater#createCoordinate(int, int) <em>Create Coordinate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Coordinate</em>' operation.
	 * @see pgr.domain.generators.ExcelUpdater#createCoordinate(int, int)
	 * @generated
	 */
	EOperation getExcelUpdater__CreateCoordinate__int_int();

	/**
	 * Returns the meta object for the '{@link pgr.domain.generators.ExcelUpdater#refresh() <em>Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh</em>' operation.
	 * @see pgr.domain.generators.ExcelUpdater#refresh()
	 * @generated
	 */
	EOperation getExcelUpdater__Refresh();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GeneratorsFactory getGeneratorsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link pgr.domain.generators.impl.ViewModelGeneratorImpl <em>View Model Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pgr.domain.generators.impl.ViewModelGeneratorImpl
		 * @see pgr.domain.generators.impl.GeneratorsPackageImpl#getViewModelGenerator()
		 * @generated
		 */
		EClass VIEW_MODEL_GENERATOR = eINSTANCE.getViewModelGenerator();

		/**
		 * The meta object literal for the '<em><b>Model Factory QM</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_MODEL_GENERATOR__MODEL_FACTORY_QM = eINSTANCE.getViewModelGenerator_ModelFactoryQM();

		/**
		 * The meta object literal for the '<em><b>Projection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_MODEL_GENERATOR__PROJECTION = eINSTANCE.getViewModelGenerator_Projection();

		/**
		 * The meta object literal for the '<em><b>View Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_MODEL_GENERATOR__VIEW_MODEL = eINSTANCE.getViewModelGenerator_ViewModel();

		/**
		 * The meta object literal for the '<em><b>The Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_MODEL_GENERATOR__THE_DOMAIN = eINSTANCE.getViewModelGenerator_TheDomain();

		/**
		 * The meta object literal for the '<em><b>View Model Generator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIEW_MODEL_GENERATOR___VIEW_MODEL_GENERATOR__MODELFACTORY = eINSTANCE.getViewModelGenerator__ViewModelGenerator__ModelFactory();

		/**
		 * The meta object literal for the '<em><b>Generate View Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIEW_MODEL_GENERATOR___GENERATE_VIEW_MODEL = eINSTANCE.getViewModelGenerator__GenerateViewModel();

		/**
		 * The meta object literal for the '<em><b>Explore Relations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIEW_MODEL_GENERATOR___EXPLORE_RELATIONS__ELEMENTOCONSULTA_ELEMENTOCONSULTA_INTEGER = eINSTANCE.getViewModelGenerator__ExploreRelations__ElementoConsulta_ElementoConsulta_Integer();

		/**
		 * The meta object literal for the '<em><b>Create View Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIEW_MODEL_GENERATOR___CREATE_VIEW_MODEL = eINSTANCE.getViewModelGenerator__CreateViewModel();

		/**
		 * The meta object literal for the '<em><b>Create Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIEW_MODEL_GENERATOR___CREATE_ELEMENT__ELEMENTOCONSULTA = eINSTANCE.getViewModelGenerator__CreateElement__ElementoConsulta();

		/**
		 * The meta object literal for the '<em><b>Get Projection QM</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIEW_MODEL_GENERATOR___GET_PROJECTION_QM = eINSTANCE.getViewModelGenerator__GetProjectionQM();

		/**
		 * The meta object literal for the '<em><b>Get Parent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIEW_MODEL_GENERATOR___GET_PARENT = eINSTANCE.getViewModelGenerator__GetParent();

		/**
		 * The meta object literal for the '{@link pgr.domain.generators.impl.DataformDiagramGeneratorImpl <em>Dataform Diagram Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pgr.domain.generators.impl.DataformDiagramGeneratorImpl
		 * @see pgr.domain.generators.impl.GeneratorsPackageImpl#getDataformDiagramGenerator()
		 * @generated
		 */
		EClass DATAFORM_DIAGRAM_GENERATOR = eINSTANCE.getDataformDiagramGenerator();

		/**
		 * The meta object literal for the '<em><b>Model Factory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATAFORM_DIAGRAM_GENERATOR__MODEL_FACTORY = eINSTANCE.getDataformDiagramGenerator_ModelFactory();

		/**
		 * The meta object literal for the '<em><b>Dataform Diagram</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATAFORM_DIAGRAM_GENERATOR__DATAFORM_DIAGRAM = eINSTANCE.getDataformDiagramGenerator_DataformDiagram();

		/**
		 * The meta object literal for the '<em><b>Interface1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATAFORM_DIAGRAM_GENERATOR__INTERFACE1 = eINSTANCE.getDataformDiagramGenerator_Interface1();

		/**
		 * The meta object literal for the '<em><b>The Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATAFORM_DIAGRAM_GENERATOR__THE_DOMAIN = eINSTANCE.getDataformDiagramGenerator_TheDomain();

		/**
		 * The meta object literal for the '<em><b>Dataform Diagram Generator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_DIAGRAM_GENERATOR___DATAFORM_DIAGRAM_GENERATOR__MODELFACTORY = eINSTANCE.getDataformDiagramGenerator__DataformDiagramGenerator__ModelFactory();

		/**
		 * The meta object literal for the '<em><b>Salvar Diagram</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_DIAGRAM_GENERATOR___SALVAR_DIAGRAM__DIAGRAM = eINSTANCE.getDataformDiagramGenerator__SalvarDiagram__Diagram();

		/**
		 * The meta object literal for the '<em><b>Cargar Diagram</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_DIAGRAM_GENERATOR___CARGAR_DIAGRAM = eINSTANCE.getDataformDiagramGenerator__CargarDiagram();

		/**
		 * The meta object literal for the '<em><b>Reset Diagram</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_DIAGRAM_GENERATOR___RESET_DIAGRAM__STRING = eINSTANCE.getDataformDiagramGenerator__ResetDiagram__String();

		/**
		 * The meta object literal for the '<em><b>Generate Diagram</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_DIAGRAM_GENERATOR___GENERATE_DIAGRAM = eINSTANCE.getDataformDiagramGenerator__GenerateDiagram();

		/**
		 * The meta object literal for the '<em><b>Create Diagram</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_DIAGRAM_GENERATOR___CREATE_DIAGRAM = eINSTANCE.getDataformDiagramGenerator__CreateDiagram();

		/**
		 * The meta object literal for the '<em><b>Init Components</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_DIAGRAM_GENERATOR___INIT_COMPONENTS__GRAPHICALCONTAINER_NODE = eINSTANCE.getDataformDiagramGenerator__InitComponents__GraphicalContainer_Node();

		/**
		 * The meta object literal for the '<em><b>Create Bounds</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_DIAGRAM_GENERATOR___CREATE_BOUNDS__INT_INT_INT_INT = eINSTANCE.getDataformDiagramGenerator__CreateBounds__int_int_int_int();

		/**
		 * The meta object literal for the '<em><b>Open Diagram</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_DIAGRAM_GENERATOR___OPEN_DIAGRAM__DIAGRAM = eINSTANCE.getDataformDiagramGenerator__OpenDiagram__Diagram();

		/**
		 * The meta object literal for the '{@link pgr.domain.generators.impl.DataformGeneratorImpl <em>Dataform Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pgr.domain.generators.impl.DataformGeneratorImpl
		 * @see pgr.domain.generators.impl.GeneratorsPackageImpl#getDataformGenerator()
		 * @generated
		 */
		EClass DATAFORM_GENERATOR = eINSTANCE.getDataformGenerator();

		/**
		 * The meta object literal for the '<em><b>Model Factory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATAFORM_GENERATOR__MODEL_FACTORY = eINSTANCE.getDataformGenerator_ModelFactory();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATAFORM_GENERATOR__PROJECT = eINSTANCE.getDataformGenerator_Project();

		/**
		 * The meta object literal for the '<em><b>Dataform Diagram</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATAFORM_GENERATOR__DATAFORM_DIAGRAM = eINSTANCE.getDataformGenerator_DataformDiagram();

		/**
		 * The meta object literal for the '<em><b>Domain Diagram</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATAFORM_GENERATOR__DOMAIN_DIAGRAM = eINSTANCE.getDataformGenerator_DomainDiagram();

		/**
		 * The meta object literal for the '<em><b>Domain Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATAFORM_GENERATOR__DOMAIN_CLASS = eINSTANCE.getDataformGenerator_DomainClass();

		/**
		 * The meta object literal for the '<em><b>Interface1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATAFORM_GENERATOR__INTERFACE1 = eINSTANCE.getDataformGenerator_Interface1();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATAFORM_GENERATOR__CONTAINER = eINSTANCE.getDataformGenerator_Container();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATAFORM_GENERATOR__PATH = eINSTANCE.getDataformGenerator_Path();

		/**
		 * The meta object literal for the '<em><b>Absolute Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATAFORM_GENERATOR__ABSOLUTE_PATH = eINSTANCE.getDataformGenerator_AbsolutePath();

		/**
		 * The meta object literal for the '<em><b>Dimens</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATAFORM_GENERATOR__DIMENS = eINSTANCE.getDataformGenerator_Dimens();

		/**
		 * The meta object literal for the '<em><b>Amount Containers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATAFORM_GENERATOR__AMOUNT_CONTAINERS = eINSTANCE.getDataformGenerator_AmountContainers();

		/**
		 * The meta object literal for the '<em><b>Amount Tables</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATAFORM_GENERATOR__AMOUNT_TABLES = eINSTANCE.getDataformGenerator_AmountTables();

		/**
		 * The meta object literal for the '<em><b>Relative X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATAFORM_GENERATOR__RELATIVE_X = eINSTANCE.getDataformGenerator_RelativeX();

		/**
		 * The meta object literal for the '<em><b>Relative Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATAFORM_GENERATOR__RELATIVE_Y = eINSTANCE.getDataformGenerator_RelativeY();

		/**
		 * The meta object literal for the '<em><b>Data Start Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATAFORM_GENERATOR__DATA_START_ROW = eINSTANCE.getDataformGenerator_DataStartRow();

		/**
		 * The meta object literal for the '<em><b>Data Start Cell</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATAFORM_GENERATOR__DATA_START_CELL = eINSTANCE.getDataformGenerator_DataStartCell();

		/**
		 * The meta object literal for the '<em><b>Amount Combos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATAFORM_GENERATOR__AMOUNT_COMBOS = eINSTANCE.getDataformGenerator_AmountCombos();

		/**
		 * The meta object literal for the '<em><b>Report Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATAFORM_GENERATOR__REPORT_NAME = eINSTANCE.getDataformGenerator_ReportName();

		/**
		 * The meta object literal for the '<em><b>Container End Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATAFORM_GENERATOR__CONTAINER_END_ROW = eINSTANCE.getDataformGenerator_ContainerEndRow();

		/**
		 * The meta object literal for the '<em><b>Container End Cell</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATAFORM_GENERATOR__CONTAINER_END_CELL = eINSTANCE.getDataformGenerator_ContainerEndCell();

		/**
		 * The meta object literal for the '<em><b>Workbook</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATAFORM_GENERATOR__WORKBOOK = eINSTANCE.getDataformGenerator_Workbook();

		/**
		 * The meta object literal for the '<em><b>Sheet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATAFORM_GENERATOR__SHEET = eINSTANCE.getDataformGenerator_Sheet();

		/**
		 * The meta object literal for the '<em><b>Adjacencies X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATAFORM_GENERATOR__ADJACENCIES_X = eINSTANCE.getDataformGenerator_AdjacenciesX();

		/**
		 * The meta object literal for the '<em><b>Adjacencies Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATAFORM_GENERATOR__ADJACENCIES_Y = eINSTANCE.getDataformGenerator_AdjacenciesY();

		/**
		 * The meta object literal for the '<em><b>Visited Cells</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATAFORM_GENERATOR__VISITED_CELLS = eINSTANCE.getDataformGenerator_VisitedCells();

		/**
		 * The meta object literal for the '<em><b>Combo Names Sorted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATAFORM_GENERATOR__COMBO_NAMES_SORTED = eINSTANCE.getDataformGenerator_ComboNamesSorted();

		/**
		 * The meta object literal for the '<em><b>Coordenadas Combo Box</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATAFORM_GENERATOR__COORDENADAS_COMBO_BOX = eINSTANCE.getDataformGenerator_CoordenadasComboBox();

		/**
		 * The meta object literal for the '<em><b>List Tables</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATAFORM_GENERATOR__LIST_TABLES = eINSTANCE.getDataformGenerator_ListTables();

		/**
		 * The meta object literal for the '<em><b>List Combo Box</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATAFORM_GENERATOR__LIST_COMBO_BOX = eINSTANCE.getDataformGenerator_ListComboBox();

		/**
		 * The meta object literal for the '<em><b>List Combo Cordinate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATAFORM_GENERATOR__LIST_COMBO_CORDINATE = eINSTANCE.getDataformGenerator_ListComboCordinate();

		/**
		 * The meta object literal for the '<em><b>Merged Regions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATAFORM_GENERATOR__MERGED_REGIONS = eINSTANCE.getDataformGenerator_MergedRegions();

		/**
		 * The meta object literal for the '<em><b>Coordenadas Inicio Contenedores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATAFORM_GENERATOR__COORDENADAS_INICIO_CONTENEDORES = eINSTANCE.getDataformGenerator_CoordenadasInicioContenedores();

		/**
		 * The meta object literal for the '<em><b>Coordenadas Fin Contenedores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATAFORM_GENERATOR__COORDENADAS_FIN_CONTENEDORES = eINSTANCE.getDataformGenerator_CoordenadasFinContenedores();

		/**
		 * The meta object literal for the '<em><b>Containers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATAFORM_GENERATOR__CONTAINERS = eINSTANCE.getDataformGenerator_Containers();

		/**
		 * The meta object literal for the '<em><b>The Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATAFORM_GENERATOR__THE_DOMAIN = eINSTANCE.getDataformGenerator_TheDomain();

		/**
		 * The meta object literal for the '<em><b>Dataform Generator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___DATAFORM_GENERATOR__STRING_STRING = eINSTANCE.getDataformGenerator__DataformGenerator__String_String();

		/**
		 * The meta object literal for the '<em><b>Generate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___GENERATE = eINSTANCE.getDataformGenerator__Generate();

		/**
		 * The meta object literal for the '<em><b>Search Begin</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___SEARCH_BEGIN = eINSTANCE.getDataformGenerator__SearchBegin();

		/**
		 * The meta object literal for the '<em><b>Set Bounds Graphical Container</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___SET_BOUNDS_GRAPHICAL_CONTAINER__GRAPHICALCONTAINER_INT_INT_INT_INT = eINSTANCE.getDataformGenerator__SetBoundsGraphicalContainer__GraphicalContainer_int_int_int_int();

		/**
		 * The meta object literal for the '<em><b>Set Atributes Contaiment Relation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___SET_ATRIBUTES_CONTAIMENT_RELATION__CONTAINMENT_STRING = eINSTANCE.getDataformGenerator__SetAtributesContaimentRelation__Containment_String();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___INIT = eINSTANCE.getDataformGenerator__Init();

		/**
		 * The meta object literal for the '<em><b>Reset Dataform</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___RESET_DATAFORM = eINSTANCE.getDataformGenerator__ResetDataform();

		/**
		 * The meta object literal for the '<em><b>Get Order View Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___GET_ORDER_VIEW_MODEL = eINSTANCE.getDataformGenerator__GetOrderViewModel();

		/**
		 * The meta object literal for the '<em><b>Get Extra Information</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___GET_EXTRA_INFORMATION = eINSTANCE.getDataformGenerator__GetExtraInformation();

		/**
		 * The meta object literal for the '<em><b>Identify Merged Regions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___IDENTIFY_MERGED_REGIONS = eINSTANCE.getDataformGenerator__IdentifyMergedRegions();

		/**
		 * The meta object literal for the '<em><b>Search Merge Region</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___SEARCH_MERGE_REGION__MERGEDREGION_INT = eINSTANCE.getDataformGenerator__SearchMergeRegion__MergedRegion_int();

		/**
		 * The meta object literal for the '<em><b>Explore Merged Regions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___EXPLORE_MERGED_REGIONS__MERGEDREGION = eINSTANCE.getDataformGenerator__ExploreMergedRegions__MergedRegion();

		/**
		 * The meta object literal for the '<em><b>Visit Table</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___VISIT_TABLE__MERGEDREGION = eINSTANCE.getDataformGenerator__VisitTable__MergedRegion();

		/**
		 * The meta object literal for the '<em><b>Get Table Columns</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___GET_TABLE_COLUMNS__MERGEDREGION_INT = eINSTANCE.getDataformGenerator__GetTableColumns__MergedRegion_int();

		/**
		 * The meta object literal for the '<em><b>Create Table</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___CREATE_TABLE__MERGEDREGION_ARRAYLIST = eINSTANCE.getDataformGenerator__CreateTable__MergedRegion_ArrayList();

		/**
		 * The meta object literal for the '<em><b>Is Table Column</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___IS_TABLE_COLUMN__MERGEDREGION = eINSTANCE.getDataformGenerator__IsTableColumn__MergedRegion();

		/**
		 * The meta object literal for the '<em><b>Is Table</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___IS_TABLE__INT_INT = eINSTANCE.getDataformGenerator__IsTable__int_int();

		/**
		 * The meta object literal for the '<em><b>Visit Region</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___VISIT_REGION__MERGEDREGION = eINSTANCE.getDataformGenerator__VisitRegion__MergedRegion();

		/**
		 * The meta object literal for the '<em><b>Init Merged Regions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___INIT_MERGED_REGIONS__LIST = eINSTANCE.getDataformGenerator__InitMergedRegions__List();

		/**
		 * The meta object literal for the '<em><b>Is Cell Range</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___IS_CELL_RANGE__INT_INT = eINSTANCE.getDataformGenerator__IsCellRange__int_int();

		/**
		 * The meta object literal for the '<em><b>Get Dimention</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___GET_DIMENTION = eINSTANCE.getDataformGenerator__GetDimention();

		/**
		 * The meta object literal for the '<em><b>Get Number Tables</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___GET_NUMBER_TABLES = eINSTANCE.getDataformGenerator__GetNumberTables();

		/**
		 * The meta object literal for the '<em><b>Get Tables</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___GET_TABLES = eINSTANCE.getDataformGenerator__GetTables();

		/**
		 * The meta object literal for the '<em><b>Salvar DF</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___SALVAR_DF = eINSTANCE.getDataformGenerator__SalvarDF();

		/**
		 * The meta object literal for the '<em><b>Get XML</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___GET_XML__STRING = eINSTANCE.getDataformGenerator__GetXML__String();

		/**
		 * The meta object literal for the '<em><b>Marcar Tablas</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___MARCAR_TABLAS__ARRAYLIST = eINSTANCE.getDataformGenerator__MarcarTablas__ArrayList();

		/**
		 * The meta object literal for the '<em><b>Re Organizar Tablas</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___RE_ORGANIZAR_TABLAS = eINSTANCE.getDataformGenerator__ReOrganizarTablas();

		/**
		 * The meta object literal for the '<em><b>Get Max X</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___GET_MAX_X__ARRAYLIST = eINSTANCE.getDataformGenerator__GetMaxX__ArrayList();

		/**
		 * The meta object literal for the '<em><b>Is Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___IS_VALID__INT_INT = eINSTANCE.getDataformGenerator__IsValid__int_int();

		/**
		 * The meta object literal for the '<em><b>Bfs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___BFS__INT_INT = eINSTANCE.getDataformGenerator__Bfs__int_int();

		/**
		 * The meta object literal for the '<em><b>Recorrer Hoja</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___RECORRER_HOJA = eINSTANCE.getDataformGenerator__RecorrerHoja();

		/**
		 * The meta object literal for the '<em><b>Create Container</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___CREATE_CONTAINER__INT_INT = eINSTANCE.getDataformGenerator__CreateContainer__int_int();

		/**
		 * The meta object literal for the '<em><b>Get Amount Containers V</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___GET_AMOUNT_CONTAINERS_V__INT = eINSTANCE.getDataformGenerator__GetAmountContainersV__int();

		/**
		 * The meta object literal for the '<em><b>Calculate V</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___CALCULATE_V__INT = eINSTANCE.getDataformGenerator__CalculateV__int();

		/**
		 * The meta object literal for the '<em><b>Calculate H</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___CALCULATE_H__INT = eINSTANCE.getDataformGenerator__CalculateH__int();

		/**
		 * The meta object literal for the '<em><b>Get Amount Containers H</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___GET_AMOUNT_CONTAINERS_H__INT = eINSTANCE.getDataformGenerator__GetAmountContainersH__int();

		/**
		 * The meta object literal for the '<em><b>Capturar Numeros</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___CAPTURAR_NUMEROS__STRING = eINSTANCE.getDataformGenerator__CapturarNumeros__String();

		/**
		 * The meta object literal for the '<em><b>Get Coordinates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___GET_COORDINATES__STRING = eINSTANCE.getDataformGenerator__GetCoordinates__String();

		/**
		 * The meta object literal for the '<em><b>Get Sizes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___GET_SIZES__STRING_STRING = eINSTANCE.getDataformGenerator__GetSizes__String_String();

		/**
		 * The meta object literal for the '<em><b>Stract Column</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___STRACT_COLUMN__STRING = eINSTANCE.getDataformGenerator__StractColumn__String();

		/**
		 * The meta object literal for the '<em><b>Get Sizes2</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___GET_SIZES2__STRING_STRING = eINSTANCE.getDataformGenerator__GetSizes2__String_String();

		/**
		 * The meta object literal for the '<em><b>Get Coordinates2</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___GET_COORDINATES2__STRING = eINSTANCE.getDataformGenerator__GetCoordinates2__String();

		/**
		 * The meta object literal for the '<em><b>To Int</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___TO_INT__STRING = eINSTANCE.getDataformGenerator__ToInt__String();

		/**
		 * The meta object literal for the '<em><b>Pow</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___POW__INT_INT = eINSTANCE.getDataformGenerator__Pow__int_int();

		/**
		 * The meta object literal for the '<em><b>Get Cell Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___GET_CELL_VALUE__XSSFCELL = eINSTANCE.getDataformGenerator__GetCellValue__XSSFCell();

		/**
		 * The meta object literal for the '<em><b>Create Coordinate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATAFORM_GENERATOR___CREATE_COORDINATE__INT_INT = eINSTANCE.getDataformGenerator__CreateCoordinate__int_int();

		/**
		 * The meta object literal for the '{@link pgr.domain.generators.impl.ExcelGeneratorImpl <em>Excel Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pgr.domain.generators.impl.ExcelGeneratorImpl
		 * @see pgr.domain.generators.impl.GeneratorsPackageImpl#getExcelGenerator()
		 * @generated
		 */
		EClass EXCEL_GENERATOR = eINSTANCE.getExcelGenerator();

		/**
		 * The meta object literal for the '<em><b>Absolute Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEL_GENERATOR__ABSOLUTE_PATH = eINSTANCE.getExcelGenerator_AbsolutePath();

		/**
		 * The meta object literal for the '<em><b>Workbook</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEL_GENERATOR__WORKBOOK = eINSTANCE.getExcelGenerator_Workbook();

		/**
		 * The meta object literal for the '<em><b>New Data Sheet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEL_GENERATOR__NEW_DATA_SHEET = eINSTANCE.getExcelGenerator_NewDataSheet();

		/**
		 * The meta object literal for the '<em><b>Data Sheet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEL_GENERATOR__DATA_SHEET = eINSTANCE.getExcelGenerator_DataSheet();

		/**
		 * The meta object literal for the '<em><b>Column Sheet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEL_GENERATOR__COLUMN_SHEET = eINSTANCE.getExcelGenerator_ColumnSheet();

		/**
		 * The meta object literal for the '<em><b>Sheet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEL_GENERATOR__SHEET = eINSTANCE.getExcelGenerator_Sheet();

		/**
		 * The meta object literal for the '<em><b>Query String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEL_GENERATOR__QUERY_STRING = eINSTANCE.getExcelGenerator_QueryString();

		/**
		 * The meta object literal for the '<em><b>Model Factory QM</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEL_GENERATOR__MODEL_FACTORY_QM = eINSTANCE.getExcelGenerator_ModelFactoryQM();

		/**
		 * The meta object literal for the '<em><b>Result Set</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEL_GENERATOR__RESULT_SET = eINSTANCE.getExcelGenerator_ResultSet();

		/**
		 * The meta object literal for the '<em><b>Names Filters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEL_GENERATOR__NAMES_FILTERS = eINSTANCE.getExcelGenerator_NamesFilters();

		/**
		 * The meta object literal for the '<em><b>Pos Filters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEL_GENERATOR__POS_FILTERS = eINSTANCE.getExcelGenerator_PosFilters();

		/**
		 * The meta object literal for the '<em><b>Titles Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEL_GENERATOR__TITLES_MAP = eINSTANCE.getExcelGenerator_TitlesMap();

		/**
		 * The meta object literal for the '<em><b>Set Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEL_GENERATOR__SET_RESULT = eINSTANCE.getExcelGenerator_SetResult();

		/**
		 * The meta object literal for the '<em><b>List Fixed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEL_GENERATOR__LIST_FIXED = eINSTANCE.getExcelGenerator_ListFixed();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEL_GENERATOR__RESULT = eINSTANCE.getExcelGenerator_Result();

		/**
		 * The meta object literal for the '<em><b>Tuples List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEL_GENERATOR__TUPLES_LIST = eINSTANCE.getExcelGenerator_TuplesList();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEL_GENERATOR__COLUMNS = eINSTANCE.getExcelGenerator_Columns();

		/**
		 * The meta object literal for the '<em><b>Columns Names</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEL_GENERATOR__COLUMNS_NAMES = eINSTANCE.getExcelGenerator_ColumnsNames();

		/**
		 * The meta object literal for the '<em><b>Columns Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEL_GENERATOR__COLUMNS_INDEX = eINSTANCE.getExcelGenerator_ColumnsIndex();

		/**
		 * The meta object literal for the '<em><b>Acc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEL_GENERATOR__ACC = eINSTANCE.getExcelGenerator_Acc();

		/**
		 * The meta object literal for the '<em><b>First Row Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEL_GENERATOR__FIRST_ROW_FILTER = eINSTANCE.getExcelGenerator_FirstRowFilter();

		/**
		 * The meta object literal for the '<em><b>Pos Row Ini Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEL_GENERATOR__POS_ROW_INI_DATA = eINSTANCE.getExcelGenerator_PosRowIniData();

		/**
		 * The meta object literal for the '<em><b>Pos Cell Ini Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEL_GENERATOR__POS_CELL_INI_DATA = eINSTANCE.getExcelGenerator_PosCellIniData();

		/**
		 * The meta object literal for the '<em><b>The Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEL_GENERATOR__THE_DOMAIN = eINSTANCE.getExcelGenerator_TheDomain();

		/**
		 * The meta object literal for the '<em><b>Excel Generator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___EXCEL_GENERATOR__STRING_ARRAYLIST_ARRAYLIST_MODELFACTORY_INT_INT_STRING = eINSTANCE.getExcelGenerator__ExcelGenerator__String_ArrayList_ArrayList_ModelFactory_int_int_String();

		/**
		 * The meta object literal for the '<em><b>Excel Generator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___EXCEL_GENERATOR__STRING_ARRAYLIST_ARRAYLIST = eINSTANCE.getExcelGenerator__ExcelGenerator__String_ArrayList_ArrayList();

		/**
		 * The meta object literal for the '<em><b>Create Relations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___CREATE_RELATIONS = eINSTANCE.getExcelGenerator__CreateRelations();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___INIT = eINSTANCE.getExcelGenerator__Init();

		/**
		 * The meta object literal for the '<em><b>Init Data Sheet</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___INIT_DATA_SHEET__ARRAYLIST = eINSTANCE.getExcelGenerator__InitDataSheet__ArrayList();

		/**
		 * The meta object literal for the '<em><b>Write File Columns</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___WRITE_FILE_COLUMNS__RESULTSET = eINSTANCE.getExcelGenerator__WriteFileColumns__ResultSet();

		/**
		 * The meta object literal for the '<em><b>Create Table</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___CREATE_TABLE__ARRAYLIST_INT_XSSFSHEET = eINSTANCE.getExcelGenerator__CreateTable__ArrayList_int_XSSFSheet();

		/**
		 * The meta object literal for the '<em><b>Create Data Sheet</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___CREATE_DATA_SHEET__RESULTSET = eINSTANCE.getExcelGenerator__CreateDataSheet__ResultSet();

		/**
		 * The meta object literal for the '<em><b>Explore Result</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___EXPLORE_RESULT__ELIST_STRING = eINSTANCE.getExcelGenerator__ExploreResult__EList_String();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___EXECUTE__ARRAYLIST_HASHMAP_INT_INT_INT = eINSTANCE.getExcelGenerator__Execute__ArrayList_HashMap_int_int_int();

		/**
		 * The meta object literal for the '<em><b>Read File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___READ_FILE = eINSTANCE.getExcelGenerator__ReadFile();

		/**
		 * The meta object literal for the '<em><b>Save Excel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___SAVE_EXCEL = eINSTANCE.getExcelGenerator__SaveExcel();

		/**
		 * The meta object literal for the '<em><b>Create Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___CREATE_NAMES = eINSTANCE.getExcelGenerator__CreateNames();

		/**
		 * The meta object literal for the '<em><b>Read Sheet</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___READ_SHEET = eINSTANCE.getExcelGenerator__ReadSheet();

		/**
		 * The meta object literal for the '<em><b>Get Num To Col</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___GET_NUM_TO_COL__INT = eINSTANCE.getExcelGenerator__GetNumToCol__int();

		/**
		 * The meta object literal for the '<em><b>Get Resul Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___GET_RESUL_SET__XSSFSHEET = eINSTANCE.getExcelGenerator__GetResulSet__XSSFSheet();

		/**
		 * The meta object literal for the '<em><b>Get Set Colum</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___GET_SET_COLUM__ARRAYLIST_INT = eINSTANCE.getExcelGenerator__GetSetColum__ArrayList_int();

		/**
		 * The meta object literal for the '<em><b>Get Map Of Column By Column</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___GET_MAP_OF_COLUMN_BY_COLUMN__ARRAYLIST_INT_INT = eINSTANCE.getExcelGenerator__GetMapOfColumnByColumn__ArrayList_int_int();

		/**
		 * The meta object literal for the '<em><b>Create List Box</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___CREATE_LIST_BOX__ARRAYLIST_XSSFSHEET_INT_INT = eINSTANCE.getExcelGenerator__CreateListBox__ArrayList_XSSFSheet_int_int();

		/**
		 * The meta object literal for the '<em><b>Build Data Sheet</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___BUILD_DATA_SHEET__XSSFSHEET_HASHMAP_INT = eINSTANCE.getExcelGenerator__BuildDataSheet__XSSFSheet_HashMap_int();

		/**
		 * The meta object literal for the '<em><b>Set Indirect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___SET_INDIRECT = eINSTANCE.getExcelGenerator__SetIndirect();

		/**
		 * The meta object literal for the '<em><b>Delete Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___DELETE_NAMES__XSSFWORKBOOK = eINSTANCE.getExcelGenerator__DeleteNames__XSSFWorkbook();

		/**
		 * The meta object literal for the '<em><b>Name Table To Name Range</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___NAME_TABLE_TO_NAME_RANGE__XSSFSHEET_ARRAYLIST = eINSTANCE.getExcelGenerator__NameTableToNameRange__XSSFSheet_ArrayList();

		/**
		 * The meta object literal for the '<em><b>Count Formula</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___COUNT_FORMULA__INT_INT = eINSTANCE.getExcelGenerator__CountFormula__int_int();

		/**
		 * The meta object literal for the '<em><b>The Formula</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___THE_FORMULA__INT_INT_INT_INT_INTEGER_INT_INT = eINSTANCE.getExcelGenerator__TheFormula__int_int_int_int_Integer_int_int();

		/**
		 * The meta object literal for the '<em><b>Create Dependence</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___CREATE_DEPENDENCE__ARRAYLIST_HASHMAP_ARRAYLIST = eINSTANCE.getExcelGenerator__CreateDependence__ArrayList_HashMap_ArrayList();

		/**
		 * The meta object literal for the '<em><b>Get Titles</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___GET_TITLES__ARRAYLIST = eINSTANCE.getExcelGenerator__GetTitles__ArrayList();

		/**
		 * The meta object literal for the '<em><b>Remove Duplicate Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___REMOVE_DUPLICATE_VALUES__ARRAYLIST = eINSTANCE.getExcelGenerator__RemoveDuplicateValues__ArrayList();

		/**
		 * The meta object literal for the '<em><b>Get Atributtes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___GET_ATRIBUTTES__RESULTELEMENT = eINSTANCE.getExcelGenerator__GetAtributtes__ResultElement();

		/**
		 * The meta object literal for the '<em><b>Create Sheet Query</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___CREATE_SHEET_QUERY = eINSTANCE.getExcelGenerator__CreateSheetQuery();

		/**
		 * The meta object literal for the '<em><b>Remove Sheets</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___REMOVE_SHEETS = eINSTANCE.getExcelGenerator__RemoveSheets();

		/**
		 * The meta object literal for the '<em><b>Copy Excel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___COPY_EXCEL__STRING_STRING = eINSTANCE.getExcelGenerator__CopyExcel__String_String();

		/**
		 * The meta object literal for the '<em><b>Open File Into Editor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___OPEN_FILE_INTO_EDITOR__STRING = eINSTANCE.getExcelGenerator__OpenFileIntoEditor__String();

		/**
		 * The meta object literal for the '<em><b>Get Dir</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___GET_DIR__STRING = eINSTANCE.getExcelGenerator__GetDir__String();

		/**
		 * The meta object literal for the '<em><b>Get Cell Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___GET_CELL_VALUE__XSSFCELL = eINSTANCE.getExcelGenerator__GetCellValue__XSSFCell();

		/**
		 * The meta object literal for the '<em><b>Get Array List From Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_GENERATOR___GET_ARRAY_LIST_FROM_SET__SET = eINSTANCE.getExcelGenerator__GetArrayListFromSet__Set();

		/**
		 * The meta object literal for the '{@link pgr.domain.generators.impl.ExcelUpdaterImpl <em>Excel Updater</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pgr.domain.generators.impl.ExcelUpdaterImpl
		 * @see pgr.domain.generators.impl.GeneratorsPackageImpl#getExcelUpdater()
		 * @generated
		 */
		EClass EXCEL_UPDATER = eINSTANCE.getExcelUpdater();

		/**
		 * The meta object literal for the '<em><b>File Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEL_UPDATER__FILE_PATH = eINSTANCE.getExcelUpdater_FilePath();

		/**
		 * The meta object literal for the '<em><b>String Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEL_UPDATER__STRING_QUERY = eINSTANCE.getExcelUpdater_StringQuery();

		/**
		 * The meta object literal for the '<em><b>Workbook</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEL_UPDATER__WORKBOOK = eINSTANCE.getExcelUpdater_Workbook();

		/**
		 * The meta object literal for the '<em><b>Dc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEL_UPDATER__DC = eINSTANCE.getExcelUpdater_Dc();

		/**
		 * The meta object literal for the '<em><b>Pos Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEL_UPDATER__POS_FILTER = eINSTANCE.getExcelUpdater_PosFilter();

		/**
		 * The meta object literal for the '<em><b>List Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEL_UPDATER__LIST_FILTER = eINSTANCE.getExcelUpdater_ListFilter();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEL_UPDATER__DOMAIN = eINSTANCE.getExcelUpdater_Domain();

		/**
		 * The meta object literal for the '<em><b>Excel Updater</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_UPDATER___EXCEL_UPDATER__STRING = eINSTANCE.getExcelUpdater__ExcelUpdater__String();

		/**
		 * The meta object literal for the '<em><b>Read File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_UPDATER___READ_FILE = eINSTANCE.getExcelUpdater__ReadFile();

		/**
		 * The meta object literal for the '<em><b>Save Excel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_UPDATER___SAVE_EXCEL = eINSTANCE.getExcelUpdater__SaveExcel();

		/**
		 * The meta object literal for the '<em><b>Execute Query</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_UPDATER___EXECUTE_QUERY = eINSTANCE.getExcelUpdater__ExecuteQuery();

		/**
		 * The meta object literal for the '<em><b>Read Sheet Query</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_UPDATER___READ_SHEET_QUERY = eINSTANCE.getExcelUpdater__ReadSheetQuery();

		/**
		 * The meta object literal for the '<em><b>Create Coordinate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_UPDATER___CREATE_COORDINATE__INT_INT = eINSTANCE.getExcelUpdater__CreateCoordinate__int_int();

		/**
		 * The meta object literal for the '<em><b>Refresh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXCEL_UPDATER___REFRESH = eINSTANCE.getExcelUpdater__Refresh();

	}

} //GeneratorsPackage
