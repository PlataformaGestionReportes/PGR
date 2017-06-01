/**
 */
package pgr.domain.generators.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.w3c.dom.Document;

import pgr.domain.Domain;
import pgr.domain.DomainPackage;

import pgr.domain.generators.DataformGenerator;
import pgr.domain.generators.GeneratorsPackage;

import pgr.domain.util.MergedRegion;

import tooldataform.ModelFactory;

import tooldataform.core.Domain_Diagram;
import tooldataform.core.Project;

import tooldataform.formmodel.concreta.Containment;
import tooldataform.formmodel.concreta.DataForm_Diagram;
import tooldataform.formmodel.concreta.Interface;
import tooldataform.formmodel.concreta.TableView;

import tooldataform.formmodel.containers.GraphicalContainer;

import tooldataform.pmoo.Clase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dataform Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pgr.domain.generators.impl.DataformGeneratorImpl#getModelFactory <em>Model Factory</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.DataformGeneratorImpl#getProject <em>Project</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.DataformGeneratorImpl#getDataformDiagram <em>Dataform Diagram</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.DataformGeneratorImpl#getDomainDiagram <em>Domain Diagram</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.DataformGeneratorImpl#getDomainClass <em>Domain Class</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.DataformGeneratorImpl#getInterface1 <em>Interface1</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.DataformGeneratorImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.DataformGeneratorImpl#getPath <em>Path</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.DataformGeneratorImpl#getAbsolutePath <em>Absolute Path</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.DataformGeneratorImpl#getDimens <em>Dimens</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.DataformGeneratorImpl#getAmountContainers <em>Amount Containers</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.DataformGeneratorImpl#getAmountTables <em>Amount Tables</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.DataformGeneratorImpl#getRelativeX <em>Relative X</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.DataformGeneratorImpl#getRelativeY <em>Relative Y</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.DataformGeneratorImpl#getDataStartRow <em>Data Start Row</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.DataformGeneratorImpl#getDataStartCell <em>Data Start Cell</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.DataformGeneratorImpl#getAmountCombos <em>Amount Combos</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.DataformGeneratorImpl#getReportName <em>Report Name</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.DataformGeneratorImpl#getContainerEndRow <em>Container End Row</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.DataformGeneratorImpl#getContainerEndCell <em>Container End Cell</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.DataformGeneratorImpl#getWorkbook <em>Workbook</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.DataformGeneratorImpl#getSheet <em>Sheet</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.DataformGeneratorImpl#getAdjacenciesX <em>Adjacencies X</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.DataformGeneratorImpl#getAdjacenciesY <em>Adjacencies Y</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.DataformGeneratorImpl#getVisitedCells <em>Visited Cells</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.DataformGeneratorImpl#getComboNamesSorted <em>Combo Names Sorted</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.DataformGeneratorImpl#getCoordenadasComboBox <em>Coordenadas Combo Box</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.DataformGeneratorImpl#getListTables <em>List Tables</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.DataformGeneratorImpl#getListComboBox <em>List Combo Box</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.DataformGeneratorImpl#getListComboCordinate <em>List Combo Cordinate</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.DataformGeneratorImpl#getMergedRegions <em>Merged Regions</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.DataformGeneratorImpl#getCoordenadasInicioContenedores <em>Coordenadas Inicio Contenedores</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.DataformGeneratorImpl#getCoordenadasFinContenedores <em>Coordenadas Fin Contenedores</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.DataformGeneratorImpl#getContainers <em>Containers</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.DataformGeneratorImpl#getTheDomain <em>The Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataformGeneratorImpl extends MinimalEObjectImpl.Container implements DataformGenerator {
	/**
	 * The default value of the '{@link #getModelFactory() <em>Model Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelFactory()
	 * @generated
	 * @ordered
	 */
	protected static final ModelFactory MODEL_FACTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelFactory() <em>Model Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelFactory()
	 * @generated
	 * @ordered
	 */
	protected ModelFactory modelFactory = MODEL_FACTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getProject() <em>Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected static final Project PROJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProject() <em>Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected Project project = PROJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataformDiagram() <em>Dataform Diagram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataformDiagram()
	 * @generated
	 * @ordered
	 */
	protected static final DataForm_Diagram DATAFORM_DIAGRAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataformDiagram() <em>Dataform Diagram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataformDiagram()
	 * @generated
	 * @ordered
	 */
	protected DataForm_Diagram dataformDiagram = DATAFORM_DIAGRAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomainDiagram() <em>Domain Diagram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainDiagram()
	 * @generated
	 * @ordered
	 */
	protected static final Domain_Diagram DOMAIN_DIAGRAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainDiagram() <em>Domain Diagram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainDiagram()
	 * @generated
	 * @ordered
	 */
	protected Domain_Diagram domainDiagram = DOMAIN_DIAGRAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomainClass() <em>Domain Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainClass()
	 * @generated
	 * @ordered
	 */
	protected static final Clase DOMAIN_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainClass() <em>Domain Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainClass()
	 * @generated
	 * @ordered
	 */
	protected Clase domainClass = DOMAIN_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterface1() <em>Interface1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface1()
	 * @generated
	 * @ordered
	 */
	protected static final Interface INTERFACE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterface1() <em>Interface1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface1()
	 * @generated
	 * @ordered
	 */
	protected Interface interface1 = INTERFACE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getContainer() <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected static final tooldataform.formmodel.concreta.Container CONTAINER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected tooldataform.formmodel.concreta.Container container = CONTAINER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbsolutePath() <em>Absolute Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsolutePath()
	 * @generated
	 * @ordered
	 */
	protected static final String ABSOLUTE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbsolutePath() <em>Absolute Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsolutePath()
	 * @generated
	 * @ordered
	 */
	protected String absolutePath = ABSOLUTE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDimens() <em>Dimens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimens()
	 * @generated
	 * @ordered
	 */
	protected static final String DIMENS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDimens() <em>Dimens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimens()
	 * @generated
	 * @ordered
	 */
	protected String dimens = DIMENS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmountContainers() <em>Amount Containers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountContainers()
	 * @generated
	 * @ordered
	 */
	protected static final int AMOUNT_CONTAINERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAmountContainers() <em>Amount Containers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountContainers()
	 * @generated
	 * @ordered
	 */
	protected int amountContainers = AMOUNT_CONTAINERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmountTables() <em>Amount Tables</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountTables()
	 * @generated
	 * @ordered
	 */
	protected static final int AMOUNT_TABLES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAmountTables() <em>Amount Tables</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountTables()
	 * @generated
	 * @ordered
	 */
	protected int amountTables = AMOUNT_TABLES_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelativeX() <em>Relative X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeX()
	 * @generated
	 * @ordered
	 */
	protected static final int RELATIVE_X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRelativeX() <em>Relative X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeX()
	 * @generated
	 * @ordered
	 */
	protected int relativeX = RELATIVE_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelativeY() <em>Relative Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeY()
	 * @generated
	 * @ordered
	 */
	protected static final int RELATIVE_Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRelativeY() <em>Relative Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeY()
	 * @generated
	 * @ordered
	 */
	protected int relativeY = RELATIVE_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataStartRow() <em>Data Start Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataStartRow()
	 * @generated
	 * @ordered
	 */
	protected static final int DATA_START_ROW_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDataStartRow() <em>Data Start Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataStartRow()
	 * @generated
	 * @ordered
	 */
	protected int dataStartRow = DATA_START_ROW_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataStartCell() <em>Data Start Cell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataStartCell()
	 * @generated
	 * @ordered
	 */
	protected static final int DATA_START_CELL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDataStartCell() <em>Data Start Cell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataStartCell()
	 * @generated
	 * @ordered
	 */
	protected int dataStartCell = DATA_START_CELL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmountCombos() <em>Amount Combos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountCombos()
	 * @generated
	 * @ordered
	 */
	protected static final int AMOUNT_COMBOS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAmountCombos() <em>Amount Combos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountCombos()
	 * @generated
	 * @ordered
	 */
	protected int amountCombos = AMOUNT_COMBOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getReportName() <em>Report Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportName()
	 * @generated
	 * @ordered
	 */
	protected static final String REPORT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReportName() <em>Report Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportName()
	 * @generated
	 * @ordered
	 */
	protected String reportName = REPORT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getContainerEndRow() <em>Container End Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerEndRow()
	 * @generated
	 * @ordered
	 */
	protected static final int CONTAINER_END_ROW_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getContainerEndRow() <em>Container End Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerEndRow()
	 * @generated
	 * @ordered
	 */
	protected int containerEndRow = CONTAINER_END_ROW_EDEFAULT;

	/**
	 * The default value of the '{@link #getContainerEndCell() <em>Container End Cell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerEndCell()
	 * @generated
	 * @ordered
	 */
	protected static final int CONTAINER_END_CELL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getContainerEndCell() <em>Container End Cell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerEndCell()
	 * @generated
	 * @ordered
	 */
	protected int containerEndCell = CONTAINER_END_CELL_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorkbook() <em>Workbook</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkbook()
	 * @generated
	 * @ordered
	 */
	protected static final XSSFWorkbook WORKBOOK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkbook() <em>Workbook</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkbook()
	 * @generated
	 * @ordered
	 */
	protected XSSFWorkbook workbook = WORKBOOK_EDEFAULT;

	/**
	 * The default value of the '{@link #getSheet() <em>Sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheet()
	 * @generated
	 * @ordered
	 */
	protected static final XSSFSheet SHEET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSheet() <em>Sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSheet()
	 * @generated
	 * @ordered
	 */
	protected XSSFSheet sheet = SHEET_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdjacenciesX() <em>Adjacencies X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjacenciesX()
	 * @generated
	 * @ordered
	 */
	protected static final ArrayList ADJACENCIES_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdjacenciesX() <em>Adjacencies X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjacenciesX()
	 * @generated
	 * @ordered
	 */
	protected ArrayList adjacenciesX = ADJACENCIES_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdjacenciesY() <em>Adjacencies Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjacenciesY()
	 * @generated
	 * @ordered
	 */
	protected static final ArrayList ADJACENCIES_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdjacenciesY() <em>Adjacencies Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjacenciesY()
	 * @generated
	 * @ordered
	 */
	protected ArrayList adjacenciesY = ADJACENCIES_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisitedCells() <em>Visited Cells</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisitedCells()
	 * @generated
	 * @ordered
	 */
	protected static final ArrayList VISITED_CELLS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisitedCells() <em>Visited Cells</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisitedCells()
	 * @generated
	 * @ordered
	 */
	protected ArrayList visitedCells = VISITED_CELLS_EDEFAULT;

	/**
	 * The default value of the '{@link #getComboNamesSorted() <em>Combo Names Sorted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComboNamesSorted()
	 * @generated
	 * @ordered
	 */
	protected static final ArrayList COMBO_NAMES_SORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComboNamesSorted() <em>Combo Names Sorted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComboNamesSorted()
	 * @generated
	 * @ordered
	 */
	protected ArrayList comboNamesSorted = COMBO_NAMES_SORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoordenadasComboBox() <em>Coordenadas Combo Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordenadasComboBox()
	 * @generated
	 * @ordered
	 */
	protected static final ArrayList COORDENADAS_COMBO_BOX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCoordenadasComboBox() <em>Coordenadas Combo Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordenadasComboBox()
	 * @generated
	 * @ordered
	 */
	protected ArrayList coordenadasComboBox = COORDENADAS_COMBO_BOX_EDEFAULT;

	/**
	 * The default value of the '{@link #getListTables() <em>List Tables</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListTables()
	 * @generated
	 * @ordered
	 */
	protected static final ArrayList LIST_TABLES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getListTables() <em>List Tables</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListTables()
	 * @generated
	 * @ordered
	 */
	protected ArrayList listTables = LIST_TABLES_EDEFAULT;

	/**
	 * The default value of the '{@link #getListComboBox() <em>List Combo Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListComboBox()
	 * @generated
	 * @ordered
	 */
	protected static final ArrayList LIST_COMBO_BOX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getListComboBox() <em>List Combo Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListComboBox()
	 * @generated
	 * @ordered
	 */
	protected ArrayList listComboBox = LIST_COMBO_BOX_EDEFAULT;

	/**
	 * The default value of the '{@link #getListComboCordinate() <em>List Combo Cordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListComboCordinate()
	 * @generated
	 * @ordered
	 */
	protected static final ArrayList LIST_COMBO_CORDINATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getListComboCordinate() <em>List Combo Cordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListComboCordinate()
	 * @generated
	 * @ordered
	 */
	protected ArrayList listComboCordinate = LIST_COMBO_CORDINATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMergedRegions() <em>Merged Regions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMergedRegions()
	 * @generated
	 * @ordered
	 */
	protected static final ArrayList MERGED_REGIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMergedRegions() <em>Merged Regions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMergedRegions()
	 * @generated
	 * @ordered
	 */
	protected ArrayList mergedRegions = MERGED_REGIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoordenadasInicioContenedores() <em>Coordenadas Inicio Contenedores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordenadasInicioContenedores()
	 * @generated
	 * @ordered
	 */
	protected static final ArrayList COORDENADAS_INICIO_CONTENEDORES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCoordenadasInicioContenedores() <em>Coordenadas Inicio Contenedores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordenadasInicioContenedores()
	 * @generated
	 * @ordered
	 */
	protected ArrayList coordenadasInicioContenedores = COORDENADAS_INICIO_CONTENEDORES_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoordenadasFinContenedores() <em>Coordenadas Fin Contenedores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordenadasFinContenedores()
	 * @generated
	 * @ordered
	 */
	protected static final ArrayList COORDENADAS_FIN_CONTENEDORES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCoordenadasFinContenedores() <em>Coordenadas Fin Contenedores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordenadasFinContenedores()
	 * @generated
	 * @ordered
	 */
	protected ArrayList coordenadasFinContenedores = COORDENADAS_FIN_CONTENEDORES_EDEFAULT;

	/**
	 * The default value of the '{@link #getContainers() <em>Containers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainers()
	 * @generated
	 * @ordered
	 */
	protected static final ArrayList CONTAINERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainers() <em>Containers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainers()
	 * @generated
	 * @ordered
	 */
	protected ArrayList containers = CONTAINERS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataformGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorsPackage.Literals.DATAFORM_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return modelFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelFactory(ModelFactory newModelFactory) {
		ModelFactory oldModelFactory = modelFactory;
		modelFactory = newModelFactory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.DATAFORM_GENERATOR__MODEL_FACTORY, oldModelFactory, modelFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project getProject() {
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(Project newProject) {
		Project oldProject = project;
		project = newProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.DATAFORM_GENERATOR__PROJECT, oldProject, project));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataForm_Diagram getDataformDiagram() {
		return dataformDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataformDiagram(DataForm_Diagram newDataformDiagram) {
		DataForm_Diagram oldDataformDiagram = dataformDiagram;
		dataformDiagram = newDataformDiagram;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.DATAFORM_GENERATOR__DATAFORM_DIAGRAM, oldDataformDiagram, dataformDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain_Diagram getDomainDiagram() {
		return domainDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainDiagram(Domain_Diagram newDomainDiagram) {
		Domain_Diagram oldDomainDiagram = domainDiagram;
		domainDiagram = newDomainDiagram;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.DATAFORM_GENERATOR__DOMAIN_DIAGRAM, oldDomainDiagram, domainDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clase getDomainClass() {
		return domainClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainClass(Clase newDomainClass) {
		Clase oldDomainClass = domainClass;
		domainClass = newDomainClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.DATAFORM_GENERATOR__DOMAIN_CLASS, oldDomainClass, domainClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getInterface1() {
		return interface1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface1(Interface newInterface1) {
		Interface oldInterface1 = interface1;
		interface1 = newInterface1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.DATAFORM_GENERATOR__INTERFACE1, oldInterface1, interface1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tooldataform.formmodel.concreta.Container getContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(tooldataform.formmodel.concreta.Container newContainer) {
		tooldataform.formmodel.concreta.Container oldContainer = container;
		container = newContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.DATAFORM_GENERATOR__CONTAINER, oldContainer, container));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.DATAFORM_GENERATOR__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAbsolutePath() {
		return absolutePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbsolutePath(String newAbsolutePath) {
		String oldAbsolutePath = absolutePath;
		absolutePath = newAbsolutePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.DATAFORM_GENERATOR__ABSOLUTE_PATH, oldAbsolutePath, absolutePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDimens() {
		return dimens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimens(String newDimens) {
		String oldDimens = dimens;
		dimens = newDimens;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.DATAFORM_GENERATOR__DIMENS, oldDimens, dimens));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAmountContainers() {
		return amountContainers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountContainers(int newAmountContainers) {
		int oldAmountContainers = amountContainers;
		amountContainers = newAmountContainers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.DATAFORM_GENERATOR__AMOUNT_CONTAINERS, oldAmountContainers, amountContainers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAmountTables() {
		return amountTables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountTables(int newAmountTables) {
		int oldAmountTables = amountTables;
		amountTables = newAmountTables;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.DATAFORM_GENERATOR__AMOUNT_TABLES, oldAmountTables, amountTables));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRelativeX() {
		return relativeX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativeX(int newRelativeX) {
		int oldRelativeX = relativeX;
		relativeX = newRelativeX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.DATAFORM_GENERATOR__RELATIVE_X, oldRelativeX, relativeX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRelativeY() {
		return relativeY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativeY(int newRelativeY) {
		int oldRelativeY = relativeY;
		relativeY = newRelativeY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.DATAFORM_GENERATOR__RELATIVE_Y, oldRelativeY, relativeY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDataStartRow() {
		return dataStartRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataStartRow(int newDataStartRow) {
		int oldDataStartRow = dataStartRow;
		dataStartRow = newDataStartRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.DATAFORM_GENERATOR__DATA_START_ROW, oldDataStartRow, dataStartRow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDataStartCell() {
		return dataStartCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataStartCell(int newDataStartCell) {
		int oldDataStartCell = dataStartCell;
		dataStartCell = newDataStartCell;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.DATAFORM_GENERATOR__DATA_START_CELL, oldDataStartCell, dataStartCell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAmountCombos() {
		return amountCombos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountCombos(int newAmountCombos) {
		int oldAmountCombos = amountCombos;
		amountCombos = newAmountCombos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.DATAFORM_GENERATOR__AMOUNT_COMBOS, oldAmountCombos, amountCombos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReportName() {
		return reportName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReportName(String newReportName) {
		String oldReportName = reportName;
		reportName = newReportName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.DATAFORM_GENERATOR__REPORT_NAME, oldReportName, reportName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getContainerEndRow() {
		return containerEndRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerEndRow(int newContainerEndRow) {
		int oldContainerEndRow = containerEndRow;
		containerEndRow = newContainerEndRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.DATAFORM_GENERATOR__CONTAINER_END_ROW, oldContainerEndRow, containerEndRow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getContainerEndCell() {
		return containerEndCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerEndCell(int newContainerEndCell) {
		int oldContainerEndCell = containerEndCell;
		containerEndCell = newContainerEndCell;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.DATAFORM_GENERATOR__CONTAINER_END_CELL, oldContainerEndCell, containerEndCell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSSFWorkbook getWorkbook() {
		return workbook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkbook(XSSFWorkbook newWorkbook) {
		XSSFWorkbook oldWorkbook = workbook;
		workbook = newWorkbook;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.DATAFORM_GENERATOR__WORKBOOK, oldWorkbook, workbook));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSSFSheet getSheet() {
		return sheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSheet(XSSFSheet newSheet) {
		XSSFSheet oldSheet = sheet;
		sheet = newSheet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.DATAFORM_GENERATOR__SHEET, oldSheet, sheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList getAdjacenciesX() {
		return adjacenciesX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdjacenciesX(ArrayList newAdjacenciesX) {
		ArrayList oldAdjacenciesX = adjacenciesX;
		adjacenciesX = newAdjacenciesX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.DATAFORM_GENERATOR__ADJACENCIES_X, oldAdjacenciesX, adjacenciesX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList getAdjacenciesY() {
		return adjacenciesY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdjacenciesY(ArrayList newAdjacenciesY) {
		ArrayList oldAdjacenciesY = adjacenciesY;
		adjacenciesY = newAdjacenciesY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.DATAFORM_GENERATOR__ADJACENCIES_Y, oldAdjacenciesY, adjacenciesY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList getVisitedCells() {
		return visitedCells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisitedCells(ArrayList newVisitedCells) {
		ArrayList oldVisitedCells = visitedCells;
		visitedCells = newVisitedCells;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.DATAFORM_GENERATOR__VISITED_CELLS, oldVisitedCells, visitedCells));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList getComboNamesSorted() {
		return comboNamesSorted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComboNamesSorted(ArrayList newComboNamesSorted) {
		ArrayList oldComboNamesSorted = comboNamesSorted;
		comboNamesSorted = newComboNamesSorted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.DATAFORM_GENERATOR__COMBO_NAMES_SORTED, oldComboNamesSorted, comboNamesSorted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList getCoordenadasComboBox() {
		return coordenadasComboBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordenadasComboBox(ArrayList newCoordenadasComboBox) {
		ArrayList oldCoordenadasComboBox = coordenadasComboBox;
		coordenadasComboBox = newCoordenadasComboBox;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.DATAFORM_GENERATOR__COORDENADAS_COMBO_BOX, oldCoordenadasComboBox, coordenadasComboBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList getListTables() {
		return listTables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListTables(ArrayList newListTables) {
		ArrayList oldListTables = listTables;
		listTables = newListTables;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.DATAFORM_GENERATOR__LIST_TABLES, oldListTables, listTables));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList getListComboBox() {
		return listComboBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListComboBox(ArrayList newListComboBox) {
		ArrayList oldListComboBox = listComboBox;
		listComboBox = newListComboBox;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.DATAFORM_GENERATOR__LIST_COMBO_BOX, oldListComboBox, listComboBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList getListComboCordinate() {
		return listComboCordinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListComboCordinate(ArrayList newListComboCordinate) {
		ArrayList oldListComboCordinate = listComboCordinate;
		listComboCordinate = newListComboCordinate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.DATAFORM_GENERATOR__LIST_COMBO_CORDINATE, oldListComboCordinate, listComboCordinate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList getMergedRegions() {
		return mergedRegions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMergedRegions(ArrayList newMergedRegions) {
		ArrayList oldMergedRegions = mergedRegions;
		mergedRegions = newMergedRegions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.DATAFORM_GENERATOR__MERGED_REGIONS, oldMergedRegions, mergedRegions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList getCoordenadasInicioContenedores() {
		return coordenadasInicioContenedores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordenadasInicioContenedores(ArrayList newCoordenadasInicioContenedores) {
		ArrayList oldCoordenadasInicioContenedores = coordenadasInicioContenedores;
		coordenadasInicioContenedores = newCoordenadasInicioContenedores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.DATAFORM_GENERATOR__COORDENADAS_INICIO_CONTENEDORES, oldCoordenadasInicioContenedores, coordenadasInicioContenedores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList getCoordenadasFinContenedores() {
		return coordenadasFinContenedores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordenadasFinContenedores(ArrayList newCoordenadasFinContenedores) {
		ArrayList oldCoordenadasFinContenedores = coordenadasFinContenedores;
		coordenadasFinContenedores = newCoordenadasFinContenedores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.DATAFORM_GENERATOR__COORDENADAS_FIN_CONTENEDORES, oldCoordenadasFinContenedores, coordenadasFinContenedores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList getContainers() {
		return containers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainers(ArrayList newContainers) {
		ArrayList oldContainers = containers;
		containers = newContainers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.DATAFORM_GENERATOR__CONTAINERS, oldContainers, containers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getTheDomain() {
		if (eContainerFeatureID() != GeneratorsPackage.DATAFORM_GENERATOR__THE_DOMAIN) return null;
		return (Domain)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheDomain(Domain newTheDomain, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTheDomain, GeneratorsPackage.DATAFORM_GENERATOR__THE_DOMAIN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheDomain(Domain newTheDomain) {
		if (newTheDomain != eInternalContainer() || (eContainerFeatureID() != GeneratorsPackage.DATAFORM_GENERATOR__THE_DOMAIN && newTheDomain != null)) {
			if (EcoreUtil.isAncestor(this, newTheDomain))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTheDomain != null)
				msgs = ((InternalEObject)newTheDomain).eInverseAdd(this, DomainPackage.DOMAIN__THE_DATAFORM_GENERATOR, Domain.class, msgs);
			msgs = basicSetTheDomain(newTheDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.DATAFORM_GENERATOR__THE_DOMAIN, newTheDomain, newTheDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void DataformGenerator(final String ruta, final String as) {
			 this.path = "OpenXML/"+ruta+"/xl/";
			 this.absolutePath = as;
			 
			 reportName  = ruta;
			 
			 /*Inicializacion de las listas para evitar 
			  *NullPointer Exception
			  */
			 listTables = new ArrayList<String>();
			 listComboBox = new ArrayList<String>();
			 listComboCordinate = new ArrayList<pgr.domain.util.impl.CoordinateImpl>();
			 containers = new ArrayList<GraphicalContainer>();
			 coordenadasInicioContenedores = new ArrayList<pgr.domain.util.impl.CoordinateImpl>();
			 coordenadasFinContenedores  = new ArrayList<pgr.domain.util.impl.CoordinateImpl>();
			 
			 comboNamesSorted = new ArrayList<String>();
			 for (int i = 0; i < 100; i++) {
				 comboNamesSorted.add("");
			 }
			 coordenadasComboBox = new ArrayList<pgr.domain.util.impl.CoordinateImpl>();
			 for (int i = 0; i < 100; i++) {
				 pgr.domain.util.impl.CoordinateImpl c = (pgr.domain.util.impl.CoordinateImpl)
						 pgr.domain.util.UtilFactory.eINSTANCE.createCoordinate();
				 c.setX(0); c.setY(0);
				 coordenadasComboBox.add(c);
			 }
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void generate() {
					//Incializa la model factory y el diagrama para agregar elementos en el
					init();
					
					//Se carga el excel a analizar
					java.io.InputStream is;
					try {
						is = new java.io.FileInputStream(absolutePath);
						workbook = new XSSFWorkbook(is);
						sheet = workbook.getSheetAt(0);
					    
					    getOrderViewModel();
					    
					    amountContainers++;
					    
					    //Se realiza identifican y se agregan las mergedRegions
					    identifyMergedRegions();
					      
						//Identifica las tablas en el XML y obtiene sus dimenciones
						getTables();
						
						//En el libro de visitados, marca dichas tablas para que no sean analizadas 
						//en el metodo de getExtraInformation
						marcarTablas(listTables);
						
						//Se encarga de indetificar los componentes restantes que estan en el excel
						//Ya sea contenedores, labels, combobox etc
						getExtraInformation();
						
						searchBegin();
						
						//Se salva la produccion  del dataform
						salvarDF();
						
					} catch (java.io.FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (java.lang.IndexOutOfBoundsException e) {
						// TODO Auto-generated catch block
						javax.swing.JOptionPane.showMessageDialog(null, "El excel debe estar etiquetado para poder capturar el modelo mental."
								  , null, javax.swing.JOptionPane.ERROR_MESSAGE);
					} catch (java.io.IOException e) {
						// TODO Auto-generated catch block
						javax.swing.JOptionPane.showMessageDialog(null, "Debe seleccionar primero el archivo al "
														  + "cual se le capturara el modelo mental."
								, null, javax.swing.JOptionPane.ERROR_MESSAGE);
					}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void searchBegin() {
		
		
				org.apache.poi.xssf.usermodel.XSSFRow r;
				XSSFCell c;
				for(int i = 0; i < visitedCells.size(); i++) {
					r = sheet.getRow(i);
					if (r != null) {
						ArrayList<Integer> aux = (ArrayList<Integer>)visitedCells.get(0);
						for(int j = 0; j < aux.size(); j++) {
							c = r.getCell(j);
							if(c != null) {
								c.setCellType(XSSFCell.CELL_TYPE_STRING);
								if(c.getStringCellValue().equals("<start>")) {
									dataStartRow = i;
									dataStartCell = j;
								}
							}
						}
					}
					
				}
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundsGraphicalContainer(final GraphicalContainer graphicalContainer, final int x, final int y, final int width, final int height) {
		
		
				graphicalContainer.setWidth(new Integer(width));
				graphicalContainer.setHeight(new Integer(height));
				graphicalContainer.setPositionX(x);
				graphicalContainer.setPositionY(y);
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtributesContaimentRelation(final Containment c, final String name) {
		
		
				c.setAMultiplicidad(tooldataform.pmoo.Cardinalidad.N);
				c.setBMultiplicidad(tooldataform.pmoo.Cardinalidad.N);
				c.setANavegable(tooldataform.pmoo.Valores.SI);
				c.setBNavegable(tooldataform.pmoo.Valores.SI);
				c.setBinding(tooldataform.pmoo.Valores.SI);
				c.setARol("ownedByTable"+name);
				c.setBRol("listTable"+name);
				c.setName("name"+name);
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void init() {
			adjacenciesX = new ArrayList<Integer>();
			adjacenciesX.add(new Integer(1));
			adjacenciesX.add(new Integer(-1));
			adjacenciesX.add(new Integer(0));
			adjacenciesX.add(new Integer(0));
			
			adjacenciesY = new ArrayList<Integer>();
			adjacenciesY.add(new Integer(0));
			adjacenciesY.add(new Integer(0));
			adjacenciesY.add(new Integer(1));
			adjacenciesY.add(new Integer(-1));
			
			/*Obtiene la dimenscion del excel
			 *formato de la dimension
			 *ejemplo: A3:D7
			 */
			dimens = getDimention();
			
			String inicio = dimens.split(":")[0];
			String fin = 	dimens.split(":")[1];
			
			//Se obtienen las dimensiones de la matriz de visitados
			int w = toInt(stractColumn(fin)); 
			int h = ( Integer.parseInt(capturarNumeros(fin)));
			
			visitedCells = new ArrayList<ArrayList<Integer>>();
			for (int i = 0; i < h + 1; i++) {
				ArrayList<Integer> aux = new ArrayList<Integer>();
				for (int j = 0; j < w + 1; j++) {
					aux.add(new Integer(0));
				}
				visitedCells.add(aux);
			}
		
			
			
			amountContainers = 0;
			
			//Se obtienen las coordenandas relativas
			pgr.domain.util.impl.CoordinateImpl coordinate = (pgr.domain.util.impl.CoordinateImpl) getCoordinates(inicio);
			relativeX = coordinate.getX();   relativeY = coordinate.getY();
		
			//Se instancian los objetos necesarios para crear la produccion
			modelFactory    = tooldataform.TooldataformFactory.eINSTANCE.createModelFactory();
			project         = tooldataform.core.CoreFactory.eINSTANCE.createProject();
			dataformDiagram = tooldataform.formmodel.concreta.ConcretaFactory.eINSTANCE.createDataForm_Diagram();
			domainDiagram   = tooldataform.core.CoreFactory.eINSTANCE.createDomain_Diagram();
			interface1      = tooldataform.formmodel.concreta.ConcretaFactory.eINSTANCE.createInterface();
			container       = tooldataform.formmodel.concreta.ConcretaFactory.eINSTANCE.createContainer();
			container.setName(reportName);
			
			//Se dan las dimensiones y ubicacion de la interfaz
			setBoundsGraphicalContainer(interface1, 10, 10 , 850, 850);	
			setBoundsGraphicalContainer(container, 15, 15, 800, 700);
			
			/*Se relacionan adecuadamente los objetos incializados anteriormente
			 *Para generar un dataform sin errores
			 */
			dataformDiagram.setTheInterface(interface1);
			dataformDiagram.setOwnedByProject(project);
			dataformDiagram.setItsDiagram(domainDiagram);
			dataformDiagram.setName("model.tooldataform_diagram");
			
			domainClass = tooldataform.pmoo.PmooFactory.eINSTANCE.createClase();
			domainClass.setName("Domain");
			domainDiagram.getListClase().add(domainClass);
			
			project.getListDiagram().add(domainDiagram);
			project.getListDataFormDiagram().add(dataformDiagram);
			project.setTheModelFactory(modelFactory);
			
			interface1.getListGraphicalContainer().add(container);
			interface1.setName(reportName);
			modelFactory.getListProyecto().add(project);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void resetDataform() {
		
		
				dataformDiagram.setTheInterface(null);
				salvarDF();
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getOrderViewModel() {
		               /*Se obtiene la ultima fila a analizar
			 *de la hoja
			 */
			int nmax = sheet.getLastRowNum()+1;
			
			//Objeto necesario para obtener una celda en el excel
			XSSFCell c;
			//Obejto necesario para obtener una fila en el excel
			org.apache.poi.xssf.usermodel.XSSFRow r = null;
			
			amountCombos = 0;
			//Recorre la hoja hasta encontrar el primer Combo
			for (int i = 0; i <nmax; i++) {
				r =  sheet.getRow(i);
		    	if(r == null) continue;
		    	for (int j = 0; j <r.getLastCellNum(); j++) {
		    		c = r.getCell(j);
		            
		    		if(c != null && getCellValue(c).contains("*") ) { 
		            	//Es combo          		    			
		    			int id = Integer.parseInt( getCellValue(c).substring(2,getCellValue(c).length() -1 ) );
		    			
		    			//listComboCordinate.add(new Coordinate(i, j-1));
		    			amountContainers++;
		    			ArrayList<Integer> aux = (ArrayList<Integer>) visitedCells.get(i);
		    			aux.set(j, amountContainers);
		    			aux.set(j-1, amountContainers);
		    			
		    			c = r.getCell(j-1);
		    			
		    			comboNamesSorted.set(id-1, getCellValue(c));
		    			coordenadasComboBox.set(id-1, createCoordinate(i, j));
		    			
		    			coordenadasInicioContenedores.add(createCoordinate(i, j-1));
		    	    	coordenadasFinContenedores.add(createCoordinate(i, j));
		    			
		    	    	tooldataform.formmodel.concreta.ComboView combo =  tooldataform.formmodel.concreta.ConcretaFactory.eINSTANCE.createComboView();
		    			combo.setName(getCellValue(c));
		    			setBoundsGraphicalContainer(combo, 0 , 0, 240, 20);
		    			tooldataform.formmodel.concreta.ItemCombo item = tooldataform.formmodel.concreta.ConcretaFactory.eINSTANCE.createItemCombo();
		    			item.setName("nombre");
		    			combo.setTheItem(item);
		    			container .getListGraphicalContainer().add(combo);
		    			amountCombos++;
		            }
		        }
		    }
			
			for(int i=0;i < amountCombos ;i++ ){
		    	listComboBox.add((String) comboNamesSorted.get(i));
			   	listComboCordinate.add((pgr.domain.util.impl.CoordinateImpl) coordenadasComboBox.get(i));
			}
						
					
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getExtraInformation() {
		        //Se recorre la hoja para extraer la futura 
		        recorrerHoja();
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void identifyMergedRegions() {
		
		
											
				//Obtiene la lista de merged regions de la hoja
				List sortedRegions = sheet.getMergedRegions();
			
				//Ordenamos de mayor a menor las regiones con respecto a las filas
				pgr.domain.util.impl.ComparatorRangeImpl c = (pgr.domain.util.impl.ComparatorRangeImpl) pgr.domain.util.UtilFactory.eINSTANCE.createComparatorRange();
				java.util.Collections.sort(sortedRegions, c );
				
				//Inicializamos la estructura de datos que se tiene por conveniencia
				//y facilidad para manejar las regiones combinadas
				InitMergedRegions(sortedRegions);
				
				//Se expoloran todas las regiones de la hoja
				for(int i=0;i<sortedRegions.size();i++){
					org.apache.poi.ss.util.CellRangeAddress range = (org.apache.poi.ss.util.CellRangeAddress) sortedRegions.get(i);  
					ArrayList<Integer> aux = (ArrayList<Integer>) visitedCells.get(range.getFirstRow());
					if(aux.get(range.getFirstColumn()) == 0){
					
						String textRange = sheet.getRow(range.getFirstRow()).getCell(range.getFirstColumn()).getStringCellValue();
						MergedRegion mergeRegion = pgr.domain.util.UtilFactory.eINSTANCE.createMergedRegion();
						mergeRegion.MergedRegion(textRange, range.getFirstColumn(), range.getLastColumn(), 
								range.getFirstRow(), range.getLastRow());
						
						containerEndRow= range.getFirstRow();
						containerEndCell= range.getFirstColumn();
						
						GraphicalContainer container = exploreMergedRegions(mergeRegion);
						
						this.container.getListGraphicalContainer().add(container);
						coordenadasInicioContenedores.add(createCoordinate(range.getFirstRow(), range.getFirstColumn()));
						coordenadasFinContenedores.add(createCoordinate(containerEndRow, containerEndCell));
						visitRegion(mergeRegion);
						amountContainers++;
					}	
				}
			
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean searchMergeRegion(final MergedRegion range, final int nextRow) {
		
		
				ArrayList<MergedRegion> aux = (ArrayList<MergedRegion>) mergedRegions.get(nextRow);
				for(int j=0; j < aux.size(); j++){
					
					MergedRegion nextMergeRegion = aux.get(j);
					
					if(nextMergeRegion.getFirstColumn() >= range.getFirstColumn() 
							&& nextMergeRegion.getFirstColumn() <= range.getLastColumn()) {
						
						return true;
					}
				}
				return false;
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicalContainer exploreMergedRegions(final MergedRegion range) {
		
		
						
				GraphicalContainer container =  tooldataform.formmodel.concreta.ConcretaFactory.eINSTANCE.createContainer();
				container.setName(range.getText());
				int firstRow = range.getFirstRow(), lastRow = range.getLastRow();
				int firstColumn = range.getFirstColumn(), lastColumn = range.getLastColumn();
				int nextRow = firstRow + (lastRow - firstRow+ 1);
				
				ArrayList<MergedRegion> aux = (ArrayList<MergedRegion>) mergedRegions.get(nextRow);
				if(aux.size() == 0 || !searchMergeRegion(range, nextRow)) {
					
					ArrayList<String> columns = getTableColumns(range, nextRow);
					TableView table = createTable(range, columns);
					container.getListGraphicalContainer().add(table);
					int deep = visitTable(range);
					setBoundsGraphicalContainer(table, 15, 15, columns.size()*100 , (deep-range.getFirstRow())*20);
					
					tooldataform.formmodel.concreta.Containment c = tooldataform.formmodel.concreta.ConcretaFactory.eINSTANCE.createContainment();
					setAtributesContaimentRelation(c,"");
					
					//Se agrega el source y target de la relacion
					c.getSource().add(container);
					c.getTarget().add(table);
					
					setBoundsGraphicalContainer(container, 15, 15 ,  table.getWidth() + 40 , table.getHeight() + 40);
					return container;
				}
				
				aux = (ArrayList<MergedRegion>) mergedRegions.get(nextRow);
				for(int i=0; i < aux.size();i++) {
					
					MergedRegion nextMergeRegin = aux.get(i);
					
					if(nextMergeRegin.getFirstColumn()>=firstColumn && nextMergeRegin.getLastColumn()<=lastColumn){
						
						if(!isTableColumn(nextMergeRegin)){ 
							//sevisita
							visitRegion(nextMergeRegin);
							GraphicalContainer subContainer = exploreMergedRegions(nextMergeRegin);
							container.getListGraphicalContainer().add(subContainer);
							
						} else {
							
							//Se construye la tabla
							//Se visita las tuplas de la tabla y los encabezaos
							//Se agrega al contenedor y se retorna
							
							ArrayList<String> columns = getTableColumns(range, nextRow);
							TableView table = createTable(range, columns);
							
							container.getListGraphicalContainer().add(table);
							int deep = visitTable(range);
							setBoundsGraphicalContainer(table, 15, 15, columns.size()*100 , (deep-range.getFirstRow())*20);
							
							tooldataform.formmodel.concreta.Containment c = tooldataform.formmodel.concreta.ConcretaFactory.eINSTANCE.createContainment();
							setAtributesContaimentRelation(c,"");
							
							//Se agrega el source y target de la relacion
							c.getSource().add(container);
							c.getTarget().add(table);
							
							setBoundsGraphicalContainer(container, 15, 15 ,  table.getWidth() + 40 , table.getHeight() + 40);
							break;
						}
					}
				}
				
				int x  = container.getListGraphicalContainer().get(0).getWidth();
				int y  = container.getListGraphicalContainer().get(0).getPositionY();
				
				x+= 15; y+= 15;
				
			
				for(int i = 1  ;i < container.getListGraphicalContainer().size();i++){
					x+=40;
					container.getListGraphicalContainer().get(i).setPositionX(x);
					x+= container.getListGraphicalContainer().get(i).getWidth();
					y = Math.max(y,  container.getListGraphicalContainer().get(i).getHeight());
				}
				
				x+=15;
				
				if(container.getListGraphicalContainer().size()>1)
					setBoundsGraphicalContainer(container, 15, 15, x, y);
				
				return container;
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int visitTable(final MergedRegion region) {
		
		
				
				int fila=  region.getFirstRow();
				org.apache.poi.xssf.usermodel.XSSFRow r = sheet.getRow(fila);
				
				int columa = region.getFirstColumn();
				XSSFCell c;
				while(r!=null){
					c = r.getCell(columa);
					if(c==null)
						break;
					
					ArrayList<Integer> aux = (ArrayList<Integer>) visitedCells.get(fila);
					for(int i=columa; i <= region.getLastColumn();i++){
						aux.set(i, amountContainers);
						containerEndRow = fila;
						containerEndCell = i;
					}
					r = sheet.getRow(++fila);
				}
				return fila;
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList getTableColumns(final MergedRegion region, final int nextRow) {
		
		
				
				ArrayList<String> columns = new ArrayList<String>();
				String column;
				
				int i = region.getFirstColumn();
				while (i <= region.getLastColumn()) {
					
					column = sheet.getRow(nextRow).getCell(i).getStringCellValue();
					columns.add(column);
					
					if(isCellRange(nextRow, i)) {
						ArrayList<MergedRegion> aux = (ArrayList<MergedRegion>) mergedRegions.get(nextRow);
						for(int j=0; j < aux.size(); j++){
							
							MergedRegion nextMergeRegion = aux.get(j);
							
							if(nextMergeRegion.getFirstColumn()==i){
								
								if(nextMergeRegion.getFirstColumn() == nextMergeRegion.getLastColumn()) {
									
									i++;
									break;
								}	
								
								i += nextMergeRegion.getLastColumn() - i + 1;
								break;
							}
						}
						
					} else {
						
						i++;
					}
				}
				
				return columns;
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableView createTable(final MergedRegion region, final ArrayList columns) {
		//Se crea  la instancia de la tabla
						TableView table = tooldataform.formmodel.concreta.ConcretaFactory.eINSTANCE.createTableView();
						table.setName(region.getText());
						
						//Se agregan las colummnas a la tabla
						for(int j=0;j<columns.size();j++){
							tooldataform.formmodel.concreta.ColumView c= tooldataform.formmodel.concreta.ConcretaFactory.eINSTANCE.createColumView();
							c.setName((String)columns.get(j));
							table.getListColumView().add(c);
						}
						
						return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTableColumn(final MergedRegion mergeRegion) {
		
		
				
				int firstRow = mergeRegion.getFirstRow(), lastRow = mergeRegion.getLastRow();
				int firstColumn = mergeRegion.getFirstColumn(), lastColumn = mergeRegion.getLastColumn();
				int nextRow = firstRow + (lastRow - firstRow + 1);
				
				ArrayList<MergedRegion> aux = (ArrayList<MergedRegion>) mergedRegions.get(nextRow);
				for(int i=0; i< aux.size();i++){
					
					MergedRegion nextMergeRegin = aux.get(i);
					if(nextMergeRegin.getFirstColumn()==firstColumn &&  nextMergeRegin.getLastColumn()==lastColumn){
						
						return true;
					}
				}
				
				if(firstColumn == lastColumn) return true;
				
				return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTable(final int i, final int j) {
		
		
				ArrayList<Integer> aux = (ArrayList<Integer>) visitedCells.get(i);
				if(aux.get(j) >= 1 && aux.get(j) <= amountTables)
					return true;
				return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void visitRegion(final MergedRegion mergeRegion) {
		
		
				for(int i = mergeRegion.getFirstRow(); i <= mergeRegion.getLastRow(); i++) {
					ArrayList<Integer> aux = (ArrayList<Integer>) visitedCells.get(i);
					for(int j = mergeRegion.getFirstColumn(); j <= mergeRegion.getLastColumn(); j++)
						aux.set(j, amountContainers);
				}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void InitMergedRegions(final List sortedRegions) {
		if(sortedRegions.size()==0)
					return;
				mergedRegions = new ArrayList<ArrayList<MergedRegion>>();
				for (int i = 0; i < ((org.apache.poi.ss.util.CellRangeAddressBase) sortedRegions.get(sortedRegions.size()-1)).getLastRow()+10; i++) {
					mergedRegions.add(new ArrayList<MergedRegion>());
				}
				
				for(int i=0;i< sortedRegions.size();i++){
					org.apache.poi.ss.util.CellRangeAddress range = (org.apache.poi.ss.util.CellRangeAddress) sortedRegions.get(i);
					
					String text = sheet.getRow(range.getFirstRow()).getCell(range.getFirstColumn()).getStringCellValue();
					ArrayList<MergedRegion> aux = (ArrayList<MergedRegion>) mergedRegions.get(range.getFirstRow());
					MergedRegion mergeRegion = pgr.domain.util.UtilFactory.eINSTANCE.createMergedRegion();
					mergeRegion.MergedRegion(text, range.getFirstColumn(), range.getLastColumn(), 
							range.getFirstRow(), range.getLastRow());
					aux.add(mergeRegion);
				}	
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCellRange(final int i, final int l) {
		
		
				
				ArrayList<MergedRegion> aux = (ArrayList<MergedRegion>) mergedRegions.get(i);
				if(aux.size()!=0){
					for(int j=0;j<aux.size();j++){
						if(aux.get(j).getFirstColumn()<= l && aux.get(j).getLastColumn() >= l )
							return true;
					}
				}
				return false;
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDimention() {
		
		
				
				//Carga el xml del excel
				org.w3c.dom.Document doc = getXML(path+"worksheets/sheet1.xml");
				doc.getDocumentElement().normalize();
				
				//Obtiene el tag Dimension
				org.w3c.dom.NodeList nList = doc.getElementsByTagName("dimension");
				org.w3c.dom.Node node = nList.item(0);
				String s="";
				if(node.getNodeType()==org.w3c.dom.Node.ELEMENT_NODE){
					org.w3c.dom.Element e = (org.w3c.dom.Element)node;
					s = e.getAttribute("ref");
				}
				return s;
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberTables() {
				
				
				//Carga el xml del excel
				org.w3c.dom.Document doc = getXML(path+"worksheets/sheet1.xml");
				doc.getDocumentElement().normalize();	
				
				//Obtiene el tag que contiene la lista de tablas
				org.w3c.dom.NodeList nList = doc.getElementsByTagName("tablePart");
				
				return nList.getLength();
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getTables() {
		
		
				
				//Obtiene el numero de tablas a agregar al dataform
				int n = getNumberTables();
				amountTables =n;
				//Documento xml del excel
				org.w3c.dom.Document doc;
				for(int i=1;i<=n;i++){
					
					//Se crea el container que contendr? la tabla
					tooldataform.formmodel.concreta.Container containerTablas = tooldataform.formmodel.concreta.ConcretaFactory.eINSTANCE.createContainer();
					containerTablas.setName("Table"+i);
					
					//Se lee el archivo xml relacionado con la tabla a analizar
					doc = getXML(path +"tables/table"+i+".xml");
					
					//Se obtiene la dimension de la tabla
					String s="";
					org.w3c.dom.NodeList es = doc.getElementsByTagName("autoFilter");
					org.w3c.dom.Node node = es.item(0);
					if(node.getNodeType()==org.w3c.dom.Node.ELEMENT_NODE){
						org.w3c.dom.Element e = (org.w3c.dom.Element)node;
						s = e.getAttribute("ref");
						listTables.add(s);
					}
					
					//Se extrae la dimencion de la tabla
					String inicio = s.split(":")[0];
					String fin = 	s.split(":")[1];
					
				
					//Se obtienen las coordenandas y el size de la tabla
					pgr.domain.util.impl.CoordinateImpl coordinates=  (pgr.domain.util.impl.CoordinateImpl) getCoordinates(inicio);
					pgr.domain.util.impl.CoordinateImpl size = (pgr.domain.util.impl.CoordinateImpl) getSizes(inicio, fin);
					coordenadasInicioContenedores.add(coordinates);
					coordenadasFinContenedores.add( getCoordinates(fin));
					
					//Se obtienen las columnas
					org.w3c.dom.NodeList nList = doc.getElementsByTagName("tableColumn");
					ArrayList<String> columnas = new ArrayList<String>();			
					for (int j = 0; j < nList.getLength(); j++) {
						org.w3c.dom.Node nNode = nList.item(j);
						if(nNode.getNodeType()==org.w3c.dom.Node.ELEMENT_NODE){
							org.w3c.dom.Element e = (org.w3c.dom.Element)nNode;
							columnas.add(e.getAttribute("name"));
						}
					}
					
					//Se crea  la instancia de la tabla
					TableView tb = tooldataform.formmodel.concreta.ConcretaFactory.eINSTANCE.createTableView();
					tb.setName("Table"+i);
					
					//Se agregan las colummnas a la tabla
					for(int j=0;j<columnas.size();j++){
						tooldataform.formmodel.concreta.ColumView c = tooldataform.formmodel.concreta.ConcretaFactory.eINSTANCE.createColumView();
						c.setName(columnas.get(j));
						tb.getListColumView().add(c);
					}
					
					//Se setean las dimensiones y posicion de la tabla
					setBoundsGraphicalContainer(tb, 15, 15, size.getX()+10, size.getY());
					
					//Se setean las dimensiones y posicion del contenedor
					setBoundsGraphicalContainer(containerTablas,coordinates.getX() - relativeX , coordinates.getY() - relativeY ,size.getX() + 40, size.getY() + 40);
					
					//Se agrega la tabla al contenedor
					containerTablas.getListGraphicalContainer().add(tb);
					
					//Se crea la relacion de contaiment para que la tabla se pueda visualizar
					tooldataform.formmodel.concreta.Containment c = tooldataform.formmodel.concreta.ConcretaFactory.eINSTANCE.createContainment();
					setAtributesContaimentRelation(c,"" + i);
					
					//Se agrega el source y target de la relacion
					c.getSource().add(containerTablas);
					c.getTarget().add(tb);
					
					//Se agrega la relacion  al diagrama
					dataformDiagram.getListarelacion().add(c);
					
					containers.add(containerTablas);
					//Se agrega el contendor a la interfaz 
					container.getListGraphicalContainer().add(containerTablas);
				}		
		
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void salvarDF() {
		
		
				org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/PGR/domain/model.tooldataform");
				org.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
				org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
				resource.getContents().add(modelFactory);
				try {
					resource.save(java.util.Collections.EMPTY_MAP);
				} catch (java.io.IOException e) {
					e.printStackTrace();
				}
		
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document getXML(final String url) {
						try {
							java.io.File fXmlFile = new java.io.File(url);
							javax.xml.parsers.DocumentBuilderFactory dbFactory = javax.xml.parsers.DocumentBuilderFactory.newInstance();
							javax.xml.parsers.DocumentBuilder dBuilder;
							
							dBuilder = dbFactory.newDocumentBuilder();
							org.w3c.dom.Document doc;
							doc = dBuilder.parse(fXmlFile);
							
							return doc;
						} catch (javax.xml.parsers.ParserConfigurationException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}catch (org.xml.sax.SAXException | java.io.IOException e) {
							// TODO Auto-generated catch block
							javax.swing.JOptionPane.showMessageDialog(null, "Debe seleccionar primero el archivo al "
									  + "cual se le capturara el modelo mental."
									  , null, javax.swing.JOptionPane.ERROR_MESSAGE);
						}
						
						return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void marcarTablas(final ArrayList sizes) {
		
		
		       
		        for(int i=0;i<sizes.size();i++){
		        	//Se obtiene la dimension de la tabla que viene en formato "CeldaInicio:CeldaFinal" ejemplo: C1:P44
		        	String inicio = ( (String) sizes.get(i) ).split(":")[0], fin = ( (String) sizes.get(i) ).split(":")[1];
		        	
		        	
		        	//Se recorre las filas de la dimension
		        	for(int  j = Integer.parseInt(capturarNumeros(inicio))-1 ; j <Integer.parseInt(capturarNumeros(fin)) ;j++){
		        		
		        		//Se obtiene la columna inicial y final
		        		int wf= toInt(stractColumn(fin))-1;
		        		int wi = toInt(stractColumn(inicio))-1;
		        		
		        		//Se recorre las columnas de la dimension
		        		ArrayList<Integer> aux = (ArrayList<Integer>) visitedCells.get(j);
		        		for(int k = wi; k <= wf;k++ ){
		        			aux.set(k, amountContainers);
		        		}
		        	}
		        	amountContainers++;
		        }
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void reOrganizarTablas() {
		
		
				
				for(int i=0;i<coordenadasInicioContenedores.size();i++){
					
					int x = ((pgr.domain.util.impl.CoordinateImpl) coordenadasInicioContenedores.get(i) ).getX();
					int y = ((pgr.domain.util.impl.CoordinateImpl) coordenadasInicioContenedores.get(i)).getY();
					
					int h = getAmountContainersH(y);
					int v = getAmountContainersV(x);
					
					int c = calculateV(x);
					int b = calculateH(y);
					
					ArrayList<Integer> aux = (ArrayList<Integer>) visitedCells.get(x);
					int contenedor = aux.get(y)-1;
					
					int xs= h*100 + 40;
					
					if(h>0)
					 xs+=(b) +  ( (y-h-relativeY)*40);
					
					int ys = (v*20)+ 25;
					
					int s  = (x-v-relativeX);
					
					if(v>0)
					 ys+= c + (s* 15);
					
					container.getListGraphicalContainer().get(contenedor).setPositionX(xs);
					container.getListGraphicalContainer().get(contenedor).setPositionY(ys);
				}
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxX(final ArrayList a) {
		int max = -1;
						for(int i=0;i<a.size();i++){
							if( ((pgr.domain.util.impl.CoordinateImpl)a.get(i) ).getX() > max){
								max = ((pgr.domain.util.impl.CoordinateImpl) a.get(i) ).getY();
							}
						}
						return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValid(final int i, final int j) {
		
		
				ArrayList<Integer> aux = (ArrayList<Integer>) visitedCells.get(0);
				if(i >= 0 && i < visitedCells.size()  && j >= 0 && j < aux.size())
					return true;
				return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList bfs(final int i, final int j) {
		
		
					
						
						//Se extrae la fila y columna inicial
						org.apache.poi.xssf.usermodel.XSSFRow r = sheet.getRow(i);
						XSSFCell c = r.getCell(j);
						
						//Arreglo que contiene las celdas visitadas en la exploracion
						ArrayList<pgr.domain.util.impl.CoordinateImpl> res = new ArrayList<pgr.domain.util.impl.CoordinateImpl>();
				 		
						//Se prepara la fila y columna en el excel de visitados
						ArrayList<Integer> aux = (ArrayList<Integer>) visitedCells.get(i);
						aux.set(j, amountContainers);
					
						
						//Agregamos la posicion inicial al arreglo de celdas a retornar
						res.add((pgr.domain.util.impl.CoordinateImpl)createCoordinate(i, j));
						
						//Cola que contendran las celdas a analizar
						java.util.Queue<XSSFCell> q =   new java.util.LinkedList<XSSFCell>();
						q.add(c);
						
						/*
						 *Mientras que haya celdas a analizar
						 *Se analizaran sus adyacencias para 
						 *encontrar mas celdas No nulas
						 */
						while (!q.isEmpty()) {	
							XSSFCell u = q.peek();
							q.poll();
							
							//Se observan las adyacencias de esta celda
							//Las adyancencias de una celda son
							//Arriba, Abajo, Izquierda y Derecha
							
							for(int k = 0; k < 4; k++) {
								
								//Se obtiene la posible adyacencia en x y en y
								int vx = u.getRowIndex()    + (int) adjacenciesX.get(k);
								int vy = u.getColumnIndex() + (int) adjacenciesY.get(k);
								
								//Se verifica si es  una adyacencia valida
								if(isValid(vx, vy)){
									
									//Si la fila no esta creada en el original
									//No se analiza
									r = sheet.getRow(vx);
									if(r==null) continue;
									c = r.getCell(vy);
									
									//Si la celda no esta creada o esta vacia NO se analiza
									if (c !=null && c.getCellType()!=XSSFCell.CELL_TYPE_BLANK ) {
										
										//Se marca en el excel de visitados esta celda 
										//Como analizada para no analizarla mas
										aux = (ArrayList<Integer>) visitedCells.get(vx);
										if(aux.get(vy) == 0){
											aux.set(vy, amountContainers);
											//Se agrega a lista la celda (vx,vy) como celda
											//No NULA y NO VACIA
											res.add((pgr.domain.util.impl.CoordinateImpl)createCoordinate(vx, vy));
											q.add(c);
										}
									}						
								}
							}
						}
						amountContainers++;
						return res;
					
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void recorrerHoja() {
		
		
				
				//Se obtiene la ultima fila a anlizar
				int nmax = sheet.getLastRowNum()+1;
				
				for (int i = 0; i <nmax; i++) {
			    	
					//Si la fila no esta creada en el libro orignial, no se analiza y se continua
					org.apache.poi.xssf.usermodel.XSSFRow r =  sheet.getRow(i);
			    	if(r==null) continue;
			    	
			    	//Se recorre la fila hasta la ultima columna NO NULA
			    	for (int j = 0; j <r.getLastCellNum(); j++) {
			    		
			    		//Se obtienen las celdas del original y el visitado en la posicion J
			    		XSSFCell c = r.getCell(j);
			    		
			    		//Si la celda es nula en el original no se analiza y se continua
			    		ArrayList<Integer> aux = (ArrayList<Integer>) visitedCells.get(i);
			            if(c != null && aux.get(j) == 0) { 
			            	
			            	//Si la celda esta vacia no se analiza y se continua 
			            	if(c.getCellType()==XSSFCell.CELL_TYPE_BLANK)
			            		continue;
			            	
			            	tooldataform.formmodel.concreta.Container containerTablas = createContainer(i, j);
			            	
			         		container.getListGraphicalContainer().add(containerTablas);
			            }
			        }
			    }
				
				//Se reorganizan las tablas
				reOrganizarTablas();
		
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tooldataform.formmodel.concreta.Container createContainer(final int i, final int j) {
		
		
				
				
						//Se crea la instancia del contendor a agregar
						tooldataform.formmodel.concreta.Container containerTablas = tooldataform.formmodel.concreta.ConcretaFactory.eINSTANCE.createContainer();
					    containerTablas.setName("Container"+ (amountContainers));
					    
						//Se ejecuta el BFS con el fin de buscar 
				    	//Mas celdas no nulas 
				    	//Para almacenarlas en un mismo contendor
				    	ArrayList<pgr.domain.util.impl.CoordinateImpl> res = bfs( i, j);
				    	
				    	//Se ordenan las celdas encontradas
				    	java.util.Collections.sort(res);
				    		
				    	int m = res.size(); 	
				    	coordenadasInicioContenedores.add(createCoordinate(i, j));
				    	coordenadasFinContenedores.add(res.get(m-1));
				    	
				    	//Se extraen las dimenciones del contenedor que contendra a las celdas encontradas
				    	String key =res.get(0).getX() +"-"+ res.get(0).getY() +":" + res.get(m-1).getX() +"-" + res.get(m-1).getY();
				    	    
				    	//Se delimita el inicio y el final del conentendor
				    	String inicio = key.split(":")[0]; String fin  = key.split(":")[1];
				    		
				    	pgr.domain.util.impl.CoordinateImpl size = (pgr.domain.util.impl.CoordinateImpl) getSizes2(inicio, fin);
				 			
						//Se setean los bounds al contenedor se deja en la posicion 0 0
						setBoundsGraphicalContainer(containerTablas,0 , 0,  size.getX() + 20, size.getY() + 40);
							
						//Posiciones relativas para el contenido del contenedor
						pgr.domain.util.impl.CoordinateImpl relativo =(pgr.domain.util.impl.CoordinateImpl) getCoordinates2( ((pgr.domain.util.impl.CoordinateImpl)res.get(0)).getX() +"-" +  ( (pgr.domain.util.impl.CoordinateImpl) res.get(0) ).getY()   );
				 		int relativex = relativo.getX();
				 		int relativey = relativo.getY();
				 			
				 		for(int k=0;k<m;k++){
				 			
				 			//Se obtiene el X y el Y del componente 
				 			int x = res.get(k).getX();    int y = res.get(k).getY();
				 				
				 			//Se obtiene su valor
				 			org.apache.poi.xssf.usermodel.XSSFRow rr = sheet.getRow(x);
				 			XSSFCell  cc = rr.getCell(y);
				 			String e = getCellValue(cc);
				 				
				 			//Se Obtienen las coordenadas NO Relativas al contenedor
				 			pgr.domain.util.impl.CoordinateImpl cor =(pgr.domain.util.impl.CoordinateImpl) getCoordinates2(x+"-"+y);
				 				
				 			//Se crea la instancia del label
				 			tooldataform.formmodel.concreta.LabelView label = tooldataform.formmodel.concreta.ConcretaFactory.eINSTANCE.createLabelView();
				 			label.setName(e);
				 				
				 			//Se setean los bounds
				 			label.setId("label"+ (char)(k+64));
				 			label.setWidth(new Integer(-1));
				    		label.setHeight(new Integer(-1));
				    		label.setPositionX(new Integer(cor.getX() - relativex + 20 ));
				    		label.setPositionY(new Integer(cor.getY() - relativey + 10));
				 				
				    		//Se agrega al contenedor
				    		containerTablas.getListIndividualElementDataForm().add(label);
				 		}
				 		return containerTablas;
					
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAmountContainersV(final int y) {
		
		
				int res=0;
				for(int i = y-1; i >= 0; i--) {
					ArrayList<Integer> aux = (ArrayList<Integer>) visitedCells.get(i);
					for(int j = 0; j < aux.size(); j++)
						if(aux.get(j) != 0){
							res++;
							break;
						}
				}
					
				return res;
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int calculateV(final int y) {
		int res=0;
				for(int i = y-1; i >= 0; i--) {
					ArrayList<Integer> aux = (ArrayList<Integer>) visitedCells.get(i);
					for(int j = 0; j < aux.size(); j++)
						if(aux.get(j) != 0){
							if(((pgr.domain.util.impl.CoordinateImpl) coordenadasFinContenedores.get(aux.get(j)-1)).getX()== i){
								 i = ((pgr.domain.util.impl.CoordinateImpl) coordenadasInicioContenedores.get(aux.get(j)-1)).getX();
								 res+=40;
								 break;
							 }
						}
				}
				return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int calculateH(final int x) {
		
		
				
				ArrayList<Integer> aux = (ArrayList<Integer>) visitedCells.get(0);
				int [][] matriz = new int[visitedCells.size()][aux.size()];  
				
				for (int i = 0; i < matriz.length; i++) {
					aux = (ArrayList<Integer>) visitedCells.get(i);
					for (int j = 0; j < matriz[0].length; j++) {
						matriz[i][j] = aux.get(j);
					}
				}
				int res = 0;	
				for(int i = x-1; i >= 0; i--)
					for(int j = 0; j < matriz.length; j++)
						if(matriz[j][i]!=0){
							if(((pgr.domain.util.impl.CoordinateImpl) coordenadasFinContenedores.get(matriz[j][i]-1)).getY()== i){
								 i = ((pgr.domain.util.impl.CoordinateImpl) coordenadasInicioContenedores.get(matriz[j][i]-1)).getY();
								 res+=40;
								 break;
							 }
						}
				return res;
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAmountContainersH(final int x) {
		
		
				ArrayList<Integer> aux = (ArrayList<Integer>) visitedCells.get(0);
				int [][] matriz = new int[visitedCells.size()][aux.size()];  
				
				for (int i = 0; i < matriz.length; i++) {
					aux = (ArrayList<Integer>) visitedCells.get(i);
					for (int j = 0; j < matriz[0].length; j++) {
						matriz[i][j] = aux.get(j);
					}
				}
				int res=0;	
				for(int i = x-1; i >= 0; i--)
					for(int j = 0; j < matriz.length; j++)
						if(matriz[j][i]!=0){
							res++;
							break;
					    }
				return res;
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String capturarNumeros(final String s) {
		
		
				int i=0;
				for(;i<s.length();i++){
					if( s.charAt(i) >= 65 && s.charAt(i)<=90){
						continue;
					}else{
						break;
					}
				}
				return s.substring(i);
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comparable getCoordinates(final String inicio) {
		int w = toInt(stractColumn(inicio))-1;
					int h = ( Integer.parseInt(capturarNumeros(inicio))-1);
					pgr.domain.util.impl.CoordinateImpl c = (pgr.domain.util.impl.CoordinateImpl)createCoordinate(h, w);
					return c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comparable getSizes(final String inicio, final String fin) {
				int wf= toInt(stractColumn(fin))-1;
				int wi = toInt(stractColumn(inicio))-1;
				int w = ( wf - wi + 1)*100;
				int h = ( Integer.parseInt(capturarNumeros(fin)) - Integer.parseInt(capturarNumeros(inicio)) + 1)*20;  
				return createCoordinate(w,h);		
			
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String stractColumn(final String s) {
		
		
				String res="";
				for(int i=0;i<s.length();i++){
					if( s.charAt(i) >= 65 && s.charAt(i)<=90){
						res+= s.charAt(i);
					}else{
						break;
					}
				}
				return res;
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comparable getSizes2(final String inicio, final String fin) {
		String ws1 = inicio.split("-")[1];  String hs1 = inicio.split("-")[0];
						String ws2 = fin.split("-")[1];     String hs2 = fin.split("-")[0];
						int w = ( (Integer.parseInt(ws2))  -  (Integer.parseInt(ws1)) + 1 )*100;
						int h = ( Integer.parseInt(hs2) - Integer.parseInt((hs1)) + 1)*20 ;  
						return createCoordinate(w, h);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comparable getCoordinates2(final String inicio) {
		String ws = inicio.split("-")[1];
						String hs = inicio.split("-")[0];
						int w = Integer.parseInt(ws)*80;
						int h = Integer.parseInt(hs)*20;
						return createCoordinate(w, h);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int toInt(final String s) {
		
		
				int res =0;
				int m = s.length()-1;
				int e=0;
				for(int i=m;i>=0;i--){
					res += ( (s.charAt(i) - 64))*pow(26,e);
					e++;
				}
				return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int pow(final int b, final int e) {
		
		
				int res =1;	
				for(int i=0;i<e;i++){
					res*=b;
				}
				return res;
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCellValue(final XSSFCell cell) {
		
		
				int cel_Type = cell.getCellType();                           
			     String res="";
				 switch(cel_Type){
			     	case 0: res+=cell.getNumericCellValue();
			             	break;
			     	case 1: res+=cell.getStringCellValue();
			     			break;
			     	case 4:res+=cell.getBooleanCellValue();
			             	break;
			     	case 3:res+="";
			     			break; 
			     }
				 return res;
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comparable createCoordinate(final int x, final int y) {
		pgr.domain.util.impl.CoordinateImpl c = (pgr.domain.util.impl.CoordinateImpl)
						 pgr.domain.util.UtilFactory.eINSTANCE.createCoordinate();
				 c.setX(x); c.setY(y);
				return c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeneratorsPackage.DATAFORM_GENERATOR__THE_DOMAIN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTheDomain((Domain)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeneratorsPackage.DATAFORM_GENERATOR__THE_DOMAIN:
				return basicSetTheDomain(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case GeneratorsPackage.DATAFORM_GENERATOR__THE_DOMAIN:
				return eInternalContainer().eInverseRemove(this, DomainPackage.DOMAIN__THE_DATAFORM_GENERATOR, Domain.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GeneratorsPackage.DATAFORM_GENERATOR__MODEL_FACTORY:
				return getModelFactory();
			case GeneratorsPackage.DATAFORM_GENERATOR__PROJECT:
				return getProject();
			case GeneratorsPackage.DATAFORM_GENERATOR__DATAFORM_DIAGRAM:
				return getDataformDiagram();
			case GeneratorsPackage.DATAFORM_GENERATOR__DOMAIN_DIAGRAM:
				return getDomainDiagram();
			case GeneratorsPackage.DATAFORM_GENERATOR__DOMAIN_CLASS:
				return getDomainClass();
			case GeneratorsPackage.DATAFORM_GENERATOR__INTERFACE1:
				return getInterface1();
			case GeneratorsPackage.DATAFORM_GENERATOR__CONTAINER:
				return getContainer();
			case GeneratorsPackage.DATAFORM_GENERATOR__PATH:
				return getPath();
			case GeneratorsPackage.DATAFORM_GENERATOR__ABSOLUTE_PATH:
				return getAbsolutePath();
			case GeneratorsPackage.DATAFORM_GENERATOR__DIMENS:
				return getDimens();
			case GeneratorsPackage.DATAFORM_GENERATOR__AMOUNT_CONTAINERS:
				return getAmountContainers();
			case GeneratorsPackage.DATAFORM_GENERATOR__AMOUNT_TABLES:
				return getAmountTables();
			case GeneratorsPackage.DATAFORM_GENERATOR__RELATIVE_X:
				return getRelativeX();
			case GeneratorsPackage.DATAFORM_GENERATOR__RELATIVE_Y:
				return getRelativeY();
			case GeneratorsPackage.DATAFORM_GENERATOR__DATA_START_ROW:
				return getDataStartRow();
			case GeneratorsPackage.DATAFORM_GENERATOR__DATA_START_CELL:
				return getDataStartCell();
			case GeneratorsPackage.DATAFORM_GENERATOR__AMOUNT_COMBOS:
				return getAmountCombos();
			case GeneratorsPackage.DATAFORM_GENERATOR__REPORT_NAME:
				return getReportName();
			case GeneratorsPackage.DATAFORM_GENERATOR__CONTAINER_END_ROW:
				return getContainerEndRow();
			case GeneratorsPackage.DATAFORM_GENERATOR__CONTAINER_END_CELL:
				return getContainerEndCell();
			case GeneratorsPackage.DATAFORM_GENERATOR__WORKBOOK:
				return getWorkbook();
			case GeneratorsPackage.DATAFORM_GENERATOR__SHEET:
				return getSheet();
			case GeneratorsPackage.DATAFORM_GENERATOR__ADJACENCIES_X:
				return getAdjacenciesX();
			case GeneratorsPackage.DATAFORM_GENERATOR__ADJACENCIES_Y:
				return getAdjacenciesY();
			case GeneratorsPackage.DATAFORM_GENERATOR__VISITED_CELLS:
				return getVisitedCells();
			case GeneratorsPackage.DATAFORM_GENERATOR__COMBO_NAMES_SORTED:
				return getComboNamesSorted();
			case GeneratorsPackage.DATAFORM_GENERATOR__COORDENADAS_COMBO_BOX:
				return getCoordenadasComboBox();
			case GeneratorsPackage.DATAFORM_GENERATOR__LIST_TABLES:
				return getListTables();
			case GeneratorsPackage.DATAFORM_GENERATOR__LIST_COMBO_BOX:
				return getListComboBox();
			case GeneratorsPackage.DATAFORM_GENERATOR__LIST_COMBO_CORDINATE:
				return getListComboCordinate();
			case GeneratorsPackage.DATAFORM_GENERATOR__MERGED_REGIONS:
				return getMergedRegions();
			case GeneratorsPackage.DATAFORM_GENERATOR__COORDENADAS_INICIO_CONTENEDORES:
				return getCoordenadasInicioContenedores();
			case GeneratorsPackage.DATAFORM_GENERATOR__COORDENADAS_FIN_CONTENEDORES:
				return getCoordenadasFinContenedores();
			case GeneratorsPackage.DATAFORM_GENERATOR__CONTAINERS:
				return getContainers();
			case GeneratorsPackage.DATAFORM_GENERATOR__THE_DOMAIN:
				return getTheDomain();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GeneratorsPackage.DATAFORM_GENERATOR__MODEL_FACTORY:
				setModelFactory((ModelFactory)newValue);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__PROJECT:
				setProject((Project)newValue);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__DATAFORM_DIAGRAM:
				setDataformDiagram((DataForm_Diagram)newValue);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__DOMAIN_DIAGRAM:
				setDomainDiagram((Domain_Diagram)newValue);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__DOMAIN_CLASS:
				setDomainClass((Clase)newValue);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__INTERFACE1:
				setInterface1((Interface)newValue);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__CONTAINER:
				setContainer((tooldataform.formmodel.concreta.Container)newValue);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__PATH:
				setPath((String)newValue);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__ABSOLUTE_PATH:
				setAbsolutePath((String)newValue);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__DIMENS:
				setDimens((String)newValue);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__AMOUNT_CONTAINERS:
				setAmountContainers((Integer)newValue);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__AMOUNT_TABLES:
				setAmountTables((Integer)newValue);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__RELATIVE_X:
				setRelativeX((Integer)newValue);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__RELATIVE_Y:
				setRelativeY((Integer)newValue);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__DATA_START_ROW:
				setDataStartRow((Integer)newValue);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__DATA_START_CELL:
				setDataStartCell((Integer)newValue);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__AMOUNT_COMBOS:
				setAmountCombos((Integer)newValue);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__REPORT_NAME:
				setReportName((String)newValue);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__CONTAINER_END_ROW:
				setContainerEndRow((Integer)newValue);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__CONTAINER_END_CELL:
				setContainerEndCell((Integer)newValue);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__WORKBOOK:
				setWorkbook((XSSFWorkbook)newValue);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__SHEET:
				setSheet((XSSFSheet)newValue);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__ADJACENCIES_X:
				setAdjacenciesX((ArrayList)newValue);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__ADJACENCIES_Y:
				setAdjacenciesY((ArrayList)newValue);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__VISITED_CELLS:
				setVisitedCells((ArrayList)newValue);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__COMBO_NAMES_SORTED:
				setComboNamesSorted((ArrayList)newValue);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__COORDENADAS_COMBO_BOX:
				setCoordenadasComboBox((ArrayList)newValue);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__LIST_TABLES:
				setListTables((ArrayList)newValue);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__LIST_COMBO_BOX:
				setListComboBox((ArrayList)newValue);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__LIST_COMBO_CORDINATE:
				setListComboCordinate((ArrayList)newValue);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__MERGED_REGIONS:
				setMergedRegions((ArrayList)newValue);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__COORDENADAS_INICIO_CONTENEDORES:
				setCoordenadasInicioContenedores((ArrayList)newValue);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__COORDENADAS_FIN_CONTENEDORES:
				setCoordenadasFinContenedores((ArrayList)newValue);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__CONTAINERS:
				setContainers((ArrayList)newValue);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__THE_DOMAIN:
				setTheDomain((Domain)newValue);
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
			case GeneratorsPackage.DATAFORM_GENERATOR__MODEL_FACTORY:
				setModelFactory(MODEL_FACTORY_EDEFAULT);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__PROJECT:
				setProject(PROJECT_EDEFAULT);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__DATAFORM_DIAGRAM:
				setDataformDiagram(DATAFORM_DIAGRAM_EDEFAULT);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__DOMAIN_DIAGRAM:
				setDomainDiagram(DOMAIN_DIAGRAM_EDEFAULT);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__DOMAIN_CLASS:
				setDomainClass(DOMAIN_CLASS_EDEFAULT);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__INTERFACE1:
				setInterface1(INTERFACE1_EDEFAULT);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__CONTAINER:
				setContainer(CONTAINER_EDEFAULT);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__ABSOLUTE_PATH:
				setAbsolutePath(ABSOLUTE_PATH_EDEFAULT);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__DIMENS:
				setDimens(DIMENS_EDEFAULT);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__AMOUNT_CONTAINERS:
				setAmountContainers(AMOUNT_CONTAINERS_EDEFAULT);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__AMOUNT_TABLES:
				setAmountTables(AMOUNT_TABLES_EDEFAULT);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__RELATIVE_X:
				setRelativeX(RELATIVE_X_EDEFAULT);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__RELATIVE_Y:
				setRelativeY(RELATIVE_Y_EDEFAULT);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__DATA_START_ROW:
				setDataStartRow(DATA_START_ROW_EDEFAULT);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__DATA_START_CELL:
				setDataStartCell(DATA_START_CELL_EDEFAULT);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__AMOUNT_COMBOS:
				setAmountCombos(AMOUNT_COMBOS_EDEFAULT);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__REPORT_NAME:
				setReportName(REPORT_NAME_EDEFAULT);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__CONTAINER_END_ROW:
				setContainerEndRow(CONTAINER_END_ROW_EDEFAULT);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__CONTAINER_END_CELL:
				setContainerEndCell(CONTAINER_END_CELL_EDEFAULT);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__WORKBOOK:
				setWorkbook(WORKBOOK_EDEFAULT);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__SHEET:
				setSheet(SHEET_EDEFAULT);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__ADJACENCIES_X:
				setAdjacenciesX(ADJACENCIES_X_EDEFAULT);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__ADJACENCIES_Y:
				setAdjacenciesY(ADJACENCIES_Y_EDEFAULT);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__VISITED_CELLS:
				setVisitedCells(VISITED_CELLS_EDEFAULT);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__COMBO_NAMES_SORTED:
				setComboNamesSorted(COMBO_NAMES_SORTED_EDEFAULT);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__COORDENADAS_COMBO_BOX:
				setCoordenadasComboBox(COORDENADAS_COMBO_BOX_EDEFAULT);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__LIST_TABLES:
				setListTables(LIST_TABLES_EDEFAULT);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__LIST_COMBO_BOX:
				setListComboBox(LIST_COMBO_BOX_EDEFAULT);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__LIST_COMBO_CORDINATE:
				setListComboCordinate(LIST_COMBO_CORDINATE_EDEFAULT);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__MERGED_REGIONS:
				setMergedRegions(MERGED_REGIONS_EDEFAULT);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__COORDENADAS_INICIO_CONTENEDORES:
				setCoordenadasInicioContenedores(COORDENADAS_INICIO_CONTENEDORES_EDEFAULT);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__COORDENADAS_FIN_CONTENEDORES:
				setCoordenadasFinContenedores(COORDENADAS_FIN_CONTENEDORES_EDEFAULT);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__CONTAINERS:
				setContainers(CONTAINERS_EDEFAULT);
				return;
			case GeneratorsPackage.DATAFORM_GENERATOR__THE_DOMAIN:
				setTheDomain((Domain)null);
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
			case GeneratorsPackage.DATAFORM_GENERATOR__MODEL_FACTORY:
				return MODEL_FACTORY_EDEFAULT == null ? modelFactory != null : !MODEL_FACTORY_EDEFAULT.equals(modelFactory);
			case GeneratorsPackage.DATAFORM_GENERATOR__PROJECT:
				return PROJECT_EDEFAULT == null ? project != null : !PROJECT_EDEFAULT.equals(project);
			case GeneratorsPackage.DATAFORM_GENERATOR__DATAFORM_DIAGRAM:
				return DATAFORM_DIAGRAM_EDEFAULT == null ? dataformDiagram != null : !DATAFORM_DIAGRAM_EDEFAULT.equals(dataformDiagram);
			case GeneratorsPackage.DATAFORM_GENERATOR__DOMAIN_DIAGRAM:
				return DOMAIN_DIAGRAM_EDEFAULT == null ? domainDiagram != null : !DOMAIN_DIAGRAM_EDEFAULT.equals(domainDiagram);
			case GeneratorsPackage.DATAFORM_GENERATOR__DOMAIN_CLASS:
				return DOMAIN_CLASS_EDEFAULT == null ? domainClass != null : !DOMAIN_CLASS_EDEFAULT.equals(domainClass);
			case GeneratorsPackage.DATAFORM_GENERATOR__INTERFACE1:
				return INTERFACE1_EDEFAULT == null ? interface1 != null : !INTERFACE1_EDEFAULT.equals(interface1);
			case GeneratorsPackage.DATAFORM_GENERATOR__CONTAINER:
				return CONTAINER_EDEFAULT == null ? container != null : !CONTAINER_EDEFAULT.equals(container);
			case GeneratorsPackage.DATAFORM_GENERATOR__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case GeneratorsPackage.DATAFORM_GENERATOR__ABSOLUTE_PATH:
				return ABSOLUTE_PATH_EDEFAULT == null ? absolutePath != null : !ABSOLUTE_PATH_EDEFAULT.equals(absolutePath);
			case GeneratorsPackage.DATAFORM_GENERATOR__DIMENS:
				return DIMENS_EDEFAULT == null ? dimens != null : !DIMENS_EDEFAULT.equals(dimens);
			case GeneratorsPackage.DATAFORM_GENERATOR__AMOUNT_CONTAINERS:
				return amountContainers != AMOUNT_CONTAINERS_EDEFAULT;
			case GeneratorsPackage.DATAFORM_GENERATOR__AMOUNT_TABLES:
				return amountTables != AMOUNT_TABLES_EDEFAULT;
			case GeneratorsPackage.DATAFORM_GENERATOR__RELATIVE_X:
				return relativeX != RELATIVE_X_EDEFAULT;
			case GeneratorsPackage.DATAFORM_GENERATOR__RELATIVE_Y:
				return relativeY != RELATIVE_Y_EDEFAULT;
			case GeneratorsPackage.DATAFORM_GENERATOR__DATA_START_ROW:
				return dataStartRow != DATA_START_ROW_EDEFAULT;
			case GeneratorsPackage.DATAFORM_GENERATOR__DATA_START_CELL:
				return dataStartCell != DATA_START_CELL_EDEFAULT;
			case GeneratorsPackage.DATAFORM_GENERATOR__AMOUNT_COMBOS:
				return amountCombos != AMOUNT_COMBOS_EDEFAULT;
			case GeneratorsPackage.DATAFORM_GENERATOR__REPORT_NAME:
				return REPORT_NAME_EDEFAULT == null ? reportName != null : !REPORT_NAME_EDEFAULT.equals(reportName);
			case GeneratorsPackage.DATAFORM_GENERATOR__CONTAINER_END_ROW:
				return containerEndRow != CONTAINER_END_ROW_EDEFAULT;
			case GeneratorsPackage.DATAFORM_GENERATOR__CONTAINER_END_CELL:
				return containerEndCell != CONTAINER_END_CELL_EDEFAULT;
			case GeneratorsPackage.DATAFORM_GENERATOR__WORKBOOK:
				return WORKBOOK_EDEFAULT == null ? workbook != null : !WORKBOOK_EDEFAULT.equals(workbook);
			case GeneratorsPackage.DATAFORM_GENERATOR__SHEET:
				return SHEET_EDEFAULT == null ? sheet != null : !SHEET_EDEFAULT.equals(sheet);
			case GeneratorsPackage.DATAFORM_GENERATOR__ADJACENCIES_X:
				return ADJACENCIES_X_EDEFAULT == null ? adjacenciesX != null : !ADJACENCIES_X_EDEFAULT.equals(adjacenciesX);
			case GeneratorsPackage.DATAFORM_GENERATOR__ADJACENCIES_Y:
				return ADJACENCIES_Y_EDEFAULT == null ? adjacenciesY != null : !ADJACENCIES_Y_EDEFAULT.equals(adjacenciesY);
			case GeneratorsPackage.DATAFORM_GENERATOR__VISITED_CELLS:
				return VISITED_CELLS_EDEFAULT == null ? visitedCells != null : !VISITED_CELLS_EDEFAULT.equals(visitedCells);
			case GeneratorsPackage.DATAFORM_GENERATOR__COMBO_NAMES_SORTED:
				return COMBO_NAMES_SORTED_EDEFAULT == null ? comboNamesSorted != null : !COMBO_NAMES_SORTED_EDEFAULT.equals(comboNamesSorted);
			case GeneratorsPackage.DATAFORM_GENERATOR__COORDENADAS_COMBO_BOX:
				return COORDENADAS_COMBO_BOX_EDEFAULT == null ? coordenadasComboBox != null : !COORDENADAS_COMBO_BOX_EDEFAULT.equals(coordenadasComboBox);
			case GeneratorsPackage.DATAFORM_GENERATOR__LIST_TABLES:
				return LIST_TABLES_EDEFAULT == null ? listTables != null : !LIST_TABLES_EDEFAULT.equals(listTables);
			case GeneratorsPackage.DATAFORM_GENERATOR__LIST_COMBO_BOX:
				return LIST_COMBO_BOX_EDEFAULT == null ? listComboBox != null : !LIST_COMBO_BOX_EDEFAULT.equals(listComboBox);
			case GeneratorsPackage.DATAFORM_GENERATOR__LIST_COMBO_CORDINATE:
				return LIST_COMBO_CORDINATE_EDEFAULT == null ? listComboCordinate != null : !LIST_COMBO_CORDINATE_EDEFAULT.equals(listComboCordinate);
			case GeneratorsPackage.DATAFORM_GENERATOR__MERGED_REGIONS:
				return MERGED_REGIONS_EDEFAULT == null ? mergedRegions != null : !MERGED_REGIONS_EDEFAULT.equals(mergedRegions);
			case GeneratorsPackage.DATAFORM_GENERATOR__COORDENADAS_INICIO_CONTENEDORES:
				return COORDENADAS_INICIO_CONTENEDORES_EDEFAULT == null ? coordenadasInicioContenedores != null : !COORDENADAS_INICIO_CONTENEDORES_EDEFAULT.equals(coordenadasInicioContenedores);
			case GeneratorsPackage.DATAFORM_GENERATOR__COORDENADAS_FIN_CONTENEDORES:
				return COORDENADAS_FIN_CONTENEDORES_EDEFAULT == null ? coordenadasFinContenedores != null : !COORDENADAS_FIN_CONTENEDORES_EDEFAULT.equals(coordenadasFinContenedores);
			case GeneratorsPackage.DATAFORM_GENERATOR__CONTAINERS:
				return CONTAINERS_EDEFAULT == null ? containers != null : !CONTAINERS_EDEFAULT.equals(containers);
			case GeneratorsPackage.DATAFORM_GENERATOR__THE_DOMAIN:
				return getTheDomain() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GeneratorsPackage.DATAFORM_GENERATOR___DATAFORM_GENERATOR__STRING_STRING:
				DataformGenerator((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case GeneratorsPackage.DATAFORM_GENERATOR___GENERATE:
				generate();
				return null;
			case GeneratorsPackage.DATAFORM_GENERATOR___SEARCH_BEGIN:
				searchBegin();
				return null;
			case GeneratorsPackage.DATAFORM_GENERATOR___SET_BOUNDS_GRAPHICAL_CONTAINER__GRAPHICALCONTAINER_INT_INT_INT_INT:
				setBoundsGraphicalContainer((GraphicalContainer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
				return null;
			case GeneratorsPackage.DATAFORM_GENERATOR___SET_ATRIBUTES_CONTAIMENT_RELATION__CONTAINMENT_STRING:
				setAtributesContaimentRelation((Containment)arguments.get(0), (String)arguments.get(1));
				return null;
			case GeneratorsPackage.DATAFORM_GENERATOR___INIT:
				init();
				return null;
			case GeneratorsPackage.DATAFORM_GENERATOR___RESET_DATAFORM:
				resetDataform();
				return null;
			case GeneratorsPackage.DATAFORM_GENERATOR___GET_ORDER_VIEW_MODEL:
				getOrderViewModel();
				return null;
			case GeneratorsPackage.DATAFORM_GENERATOR___GET_EXTRA_INFORMATION:
				getExtraInformation();
				return null;
			case GeneratorsPackage.DATAFORM_GENERATOR___IDENTIFY_MERGED_REGIONS:
				identifyMergedRegions();
				return null;
			case GeneratorsPackage.DATAFORM_GENERATOR___SEARCH_MERGE_REGION__MERGEDREGION_INT:
				return searchMergeRegion((MergedRegion)arguments.get(0), (Integer)arguments.get(1));
			case GeneratorsPackage.DATAFORM_GENERATOR___EXPLORE_MERGED_REGIONS__MERGEDREGION:
				return exploreMergedRegions((MergedRegion)arguments.get(0));
			case GeneratorsPackage.DATAFORM_GENERATOR___VISIT_TABLE__MERGEDREGION:
				return visitTable((MergedRegion)arguments.get(0));
			case GeneratorsPackage.DATAFORM_GENERATOR___GET_TABLE_COLUMNS__MERGEDREGION_INT:
				return getTableColumns((MergedRegion)arguments.get(0), (Integer)arguments.get(1));
			case GeneratorsPackage.DATAFORM_GENERATOR___CREATE_TABLE__MERGEDREGION_ARRAYLIST:
				return createTable((MergedRegion)arguments.get(0), (ArrayList)arguments.get(1));
			case GeneratorsPackage.DATAFORM_GENERATOR___IS_TABLE_COLUMN__MERGEDREGION:
				return isTableColumn((MergedRegion)arguments.get(0));
			case GeneratorsPackage.DATAFORM_GENERATOR___IS_TABLE__INT_INT:
				return isTable((Integer)arguments.get(0), (Integer)arguments.get(1));
			case GeneratorsPackage.DATAFORM_GENERATOR___VISIT_REGION__MERGEDREGION:
				visitRegion((MergedRegion)arguments.get(0));
				return null;
			case GeneratorsPackage.DATAFORM_GENERATOR___INIT_MERGED_REGIONS__LIST:
				InitMergedRegions((List)arguments.get(0));
				return null;
			case GeneratorsPackage.DATAFORM_GENERATOR___IS_CELL_RANGE__INT_INT:
				return isCellRange((Integer)arguments.get(0), (Integer)arguments.get(1));
			case GeneratorsPackage.DATAFORM_GENERATOR___GET_DIMENTION:
				return getDimention();
			case GeneratorsPackage.DATAFORM_GENERATOR___GET_NUMBER_TABLES:
				return getNumberTables();
			case GeneratorsPackage.DATAFORM_GENERATOR___GET_TABLES:
				getTables();
				return null;
			case GeneratorsPackage.DATAFORM_GENERATOR___SALVAR_DF:
				salvarDF();
				return null;
			case GeneratorsPackage.DATAFORM_GENERATOR___GET_XML__STRING:
				return getXML((String)arguments.get(0));
			case GeneratorsPackage.DATAFORM_GENERATOR___MARCAR_TABLAS__ARRAYLIST:
				marcarTablas((ArrayList)arguments.get(0));
				return null;
			case GeneratorsPackage.DATAFORM_GENERATOR___RE_ORGANIZAR_TABLAS:
				reOrganizarTablas();
				return null;
			case GeneratorsPackage.DATAFORM_GENERATOR___GET_MAX_X__ARRAYLIST:
				return getMaxX((ArrayList)arguments.get(0));
			case GeneratorsPackage.DATAFORM_GENERATOR___IS_VALID__INT_INT:
				return isValid((Integer)arguments.get(0), (Integer)arguments.get(1));
			case GeneratorsPackage.DATAFORM_GENERATOR___BFS__INT_INT:
				return bfs((Integer)arguments.get(0), (Integer)arguments.get(1));
			case GeneratorsPackage.DATAFORM_GENERATOR___RECORRER_HOJA:
				recorrerHoja();
				return null;
			case GeneratorsPackage.DATAFORM_GENERATOR___CREATE_CONTAINER__INT_INT:
				return createContainer((Integer)arguments.get(0), (Integer)arguments.get(1));
			case GeneratorsPackage.DATAFORM_GENERATOR___GET_AMOUNT_CONTAINERS_V__INT:
				return getAmountContainersV((Integer)arguments.get(0));
			case GeneratorsPackage.DATAFORM_GENERATOR___CALCULATE_V__INT:
				return calculateV((Integer)arguments.get(0));
			case GeneratorsPackage.DATAFORM_GENERATOR___CALCULATE_H__INT:
				return calculateH((Integer)arguments.get(0));
			case GeneratorsPackage.DATAFORM_GENERATOR___GET_AMOUNT_CONTAINERS_H__INT:
				return getAmountContainersH((Integer)arguments.get(0));
			case GeneratorsPackage.DATAFORM_GENERATOR___CAPTURAR_NUMEROS__STRING:
				return capturarNumeros((String)arguments.get(0));
			case GeneratorsPackage.DATAFORM_GENERATOR___GET_COORDINATES__STRING:
				return getCoordinates((String)arguments.get(0));
			case GeneratorsPackage.DATAFORM_GENERATOR___GET_SIZES__STRING_STRING:
				return getSizes((String)arguments.get(0), (String)arguments.get(1));
			case GeneratorsPackage.DATAFORM_GENERATOR___STRACT_COLUMN__STRING:
				return stractColumn((String)arguments.get(0));
			case GeneratorsPackage.DATAFORM_GENERATOR___GET_SIZES2__STRING_STRING:
				return getSizes2((String)arguments.get(0), (String)arguments.get(1));
			case GeneratorsPackage.DATAFORM_GENERATOR___GET_COORDINATES2__STRING:
				return getCoordinates2((String)arguments.get(0));
			case GeneratorsPackage.DATAFORM_GENERATOR___TO_INT__STRING:
				return toInt((String)arguments.get(0));
			case GeneratorsPackage.DATAFORM_GENERATOR___POW__INT_INT:
				return pow((Integer)arguments.get(0), (Integer)arguments.get(1));
			case GeneratorsPackage.DATAFORM_GENERATOR___GET_CELL_VALUE__XSSFCELL:
				return getCellValue((XSSFCell)arguments.get(0));
			case GeneratorsPackage.DATAFORM_GENERATOR___CREATE_COORDINATE__INT_INT:
				return createCoordinate((Integer)arguments.get(0), (Integer)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (modelFactory: ");
		result.append(modelFactory);
		result.append(", project: ");
		result.append(project);
		result.append(", dataformDiagram: ");
		result.append(dataformDiagram);
		result.append(", domainDiagram: ");
		result.append(domainDiagram);
		result.append(", domainClass: ");
		result.append(domainClass);
		result.append(", interface1: ");
		result.append(interface1);
		result.append(", container: ");
		result.append(container);
		result.append(", path: ");
		result.append(path);
		result.append(", absolutePath: ");
		result.append(absolutePath);
		result.append(", dimens: ");
		result.append(dimens);
		result.append(", amountContainers: ");
		result.append(amountContainers);
		result.append(", amountTables: ");
		result.append(amountTables);
		result.append(", relativeX: ");
		result.append(relativeX);
		result.append(", relativeY: ");
		result.append(relativeY);
		result.append(", dataStartRow: ");
		result.append(dataStartRow);
		result.append(", dataStartCell: ");
		result.append(dataStartCell);
		result.append(", amountCombos: ");
		result.append(amountCombos);
		result.append(", reportName: ");
		result.append(reportName);
		result.append(", containerEndRow: ");
		result.append(containerEndRow);
		result.append(", containerEndCell: ");
		result.append(containerEndCell);
		result.append(", workbook: ");
		result.append(workbook);
		result.append(", sheet: ");
		result.append(sheet);
		result.append(", adjacenciesX: ");
		result.append(adjacenciesX);
		result.append(", adjacenciesY: ");
		result.append(adjacenciesY);
		result.append(", visitedCells: ");
		result.append(visitedCells);
		result.append(", comboNamesSorted: ");
		result.append(comboNamesSorted);
		result.append(", coordenadasComboBox: ");
		result.append(coordenadasComboBox);
		result.append(", listTables: ");
		result.append(listTables);
		result.append(", listComboBox: ");
		result.append(listComboBox);
		result.append(", listComboCordinate: ");
		result.append(listComboCordinate);
		result.append(", mergedRegions: ");
		result.append(mergedRegions);
		result.append(", coordenadasInicioContenedores: ");
		result.append(coordenadasInicioContenedores);
		result.append(", coordenadasFinContenedores: ");
		result.append(coordenadasFinContenedores);
		result.append(", containers: ");
		result.append(containers);
		result.append(')');
		return result.toString();
	}

} //DataformGeneratorImpl
