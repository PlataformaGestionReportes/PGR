/**
 */
package pgr.domain.generators.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import pgr.domain.generators.DataformGenerator;
import pgr.domain.generators.GeneratorsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dataform Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link pgr.domain.generators.DataformGenerator#DataformGenerator(java.lang.String, java.lang.String) <em>Dataform Generator</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#generate() <em>Generate</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#searchBegin() <em>Search Begin</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#setBoundsGraphicalContainer(tooldataform.formmodel.containers.GraphicalContainer, int, int, int, int) <em>Set Bounds Graphical Container</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#setAtributesContaimentRelation(tooldataform.formmodel.concreta.Containment, java.lang.String) <em>Set Atributes Contaiment Relation</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#init() <em>Init</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#resetDataform() <em>Reset Dataform</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getOrderViewModel() <em>Get Order View Model</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getExtraInformation() <em>Get Extra Information</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#identifyMergedRegions() <em>Identify Merged Regions</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#searchMergeRegion(pgr.domain.util.MergedRegion, int) <em>Search Merge Region</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#exploreMergedRegions(pgr.domain.util.MergedRegion) <em>Explore Merged Regions</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#visitTable(pgr.domain.util.MergedRegion) <em>Visit Table</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getTableColumns(pgr.domain.util.MergedRegion, int) <em>Get Table Columns</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#createTable(pgr.domain.util.MergedRegion, java.util.ArrayList) <em>Create Table</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#isTableColumn(pgr.domain.util.MergedRegion) <em>Is Table Column</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#isTable(int, int) <em>Is Table</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#visitRegion(pgr.domain.util.MergedRegion) <em>Visit Region</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#InitMergedRegions(java.util.List) <em>Init Merged Regions</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#isCellRange(int, int) <em>Is Cell Range</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getDimention() <em>Get Dimention</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getNumberTables() <em>Get Number Tables</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getTables() <em>Get Tables</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#salvarDF() <em>Salvar DF</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getXML(java.lang.String) <em>Get XML</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#marcarTablas(java.util.ArrayList) <em>Marcar Tablas</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#reOrganizarTablas() <em>Re Organizar Tablas</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getMaxX(java.util.ArrayList) <em>Get Max X</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#isValid(int, int) <em>Is Valid</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#bfs(int, int) <em>Bfs</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#recorrerHoja() <em>Recorrer Hoja</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#createContainer(int, int) <em>Create Container</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getAmountContainersV(int) <em>Get Amount Containers V</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#calculateV(int) <em>Calculate V</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#calculateH(int) <em>Calculate H</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getAmountContainersH(int) <em>Get Amount Containers H</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#capturarNumeros(java.lang.String) <em>Capturar Numeros</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getCoordinates(java.lang.String) <em>Get Coordinates</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getSizes(java.lang.String, java.lang.String) <em>Get Sizes</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#stractColumn(java.lang.String) <em>Stract Column</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getSizes2(java.lang.String, java.lang.String) <em>Get Sizes2</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getCoordinates2(java.lang.String) <em>Get Coordinates2</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#toInt(java.lang.String) <em>To Int</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#pow(int, int) <em>Pow</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getCellValue(org.apache.poi.xssf.usermodel.XSSFCell) <em>Get Cell Value</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#createCoordinate(int, int) <em>Create Coordinate</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class DataformGeneratorTest extends TestCase {

	/**
	 * The fixture for this Dataform Generator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataformGenerator fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataformGeneratorTest.class);
	}

	/**
	 * Constructs a new Dataform Generator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataformGeneratorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Dataform Generator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DataformGenerator fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Dataform Generator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataformGenerator getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GeneratorsFactory.eINSTANCE.createDataformGenerator());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#DataformGenerator(java.lang.String, java.lang.String) <em>Dataform Generator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#DataformGenerator(java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testDataformGenerator__String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#generate() <em>Generate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#generate()
	 * @generated
	 */
	public void testGenerate() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#searchBegin() <em>Search Begin</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#searchBegin()
	 * @generated
	 */
	public void testSearchBegin() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#setBoundsGraphicalContainer(tooldataform.formmodel.containers.GraphicalContainer, int, int, int, int) <em>Set Bounds Graphical Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#setBoundsGraphicalContainer(tooldataform.formmodel.containers.GraphicalContainer, int, int, int, int)
	 * @generated
	 */
	public void testSetBoundsGraphicalContainer__GraphicalContainer_int_int_int_int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#setAtributesContaimentRelation(tooldataform.formmodel.concreta.Containment, java.lang.String) <em>Set Atributes Contaiment Relation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#setAtributesContaimentRelation(tooldataform.formmodel.concreta.Containment, java.lang.String)
	 * @generated
	 */
	public void testSetAtributesContaimentRelation__Containment_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#init() <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#init()
	 * @generated
	 */
	public void testInit() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#resetDataform() <em>Reset Dataform</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#resetDataform()
	 * @generated
	 */
	public void testResetDataform() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#getOrderViewModel() <em>Get Order View Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#getOrderViewModel()
	 * @generated
	 */
	public void testGetOrderViewModel() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#getExtraInformation() <em>Get Extra Information</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#getExtraInformation()
	 * @generated
	 */
	public void testGetExtraInformation() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#identifyMergedRegions() <em>Identify Merged Regions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#identifyMergedRegions()
	 * @generated
	 */
	public void testIdentifyMergedRegions() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#searchMergeRegion(pgr.domain.util.MergedRegion, int) <em>Search Merge Region</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#searchMergeRegion(pgr.domain.util.MergedRegion, int)
	 * @generated
	 */
	public void testSearchMergeRegion__MergedRegion_int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#exploreMergedRegions(pgr.domain.util.MergedRegion) <em>Explore Merged Regions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#exploreMergedRegions(pgr.domain.util.MergedRegion)
	 * @generated
	 */
	public void testExploreMergedRegions__MergedRegion() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#visitTable(pgr.domain.util.MergedRegion) <em>Visit Table</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#visitTable(pgr.domain.util.MergedRegion)
	 * @generated
	 */
	public void testVisitTable__MergedRegion() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#getTableColumns(pgr.domain.util.MergedRegion, int) <em>Get Table Columns</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#getTableColumns(pgr.domain.util.MergedRegion, int)
	 * @generated
	 */
	public void testGetTableColumns__MergedRegion_int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#createTable(pgr.domain.util.MergedRegion, java.util.ArrayList) <em>Create Table</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#createTable(pgr.domain.util.MergedRegion, java.util.ArrayList)
	 * @generated
	 */
	public void testCreateTable__MergedRegion_ArrayList() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#isTableColumn(pgr.domain.util.MergedRegion) <em>Is Table Column</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#isTableColumn(pgr.domain.util.MergedRegion)
	 * @generated
	 */
	public void testIsTableColumn__MergedRegion() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#isTable(int, int) <em>Is Table</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#isTable(int, int)
	 * @generated
	 */
	public void testIsTable__int_int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#visitRegion(pgr.domain.util.MergedRegion) <em>Visit Region</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#visitRegion(pgr.domain.util.MergedRegion)
	 * @generated
	 */
	public void testVisitRegion__MergedRegion() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#InitMergedRegions(java.util.List) <em>Init Merged Regions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#InitMergedRegions(java.util.List)
	 * @generated
	 */
	public void testInitMergedRegions__List() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#isCellRange(int, int) <em>Is Cell Range</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#isCellRange(int, int)
	 * @generated
	 */
	public void testIsCellRange__int_int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#getDimention() <em>Get Dimention</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#getDimention()
	 * @generated
	 */
	public void testGetDimention() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#getNumberTables() <em>Get Number Tables</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#getNumberTables()
	 * @generated
	 */
	public void testGetNumberTables() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#getTables() <em>Get Tables</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#getTables()
	 * @generated
	 */
	public void testGetTables() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#salvarDF() <em>Salvar DF</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#salvarDF()
	 * @generated
	 */
	public void testSalvarDF() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#getXML(java.lang.String) <em>Get XML</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#getXML(java.lang.String)
	 * @generated
	 */
	public void testGetXML__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#marcarTablas(java.util.ArrayList) <em>Marcar Tablas</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#marcarTablas(java.util.ArrayList)
	 * @generated
	 */
	public void testMarcarTablas__ArrayList() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#reOrganizarTablas() <em>Re Organizar Tablas</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#reOrganizarTablas()
	 * @generated
	 */
	public void testReOrganizarTablas() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#getMaxX(java.util.ArrayList) <em>Get Max X</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#getMaxX(java.util.ArrayList)
	 * @generated
	 */
	public void testGetMaxX__ArrayList() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#isValid(int, int) <em>Is Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#isValid(int, int)
	 * @generated
	 */
	public void testIsValid__int_int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#bfs(int, int) <em>Bfs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#bfs(int, int)
	 * @generated
	 */
	public void testBfs__int_int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#recorrerHoja() <em>Recorrer Hoja</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#recorrerHoja()
	 * @generated
	 */
	public void testRecorrerHoja() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#createContainer(int, int) <em>Create Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#createContainer(int, int)
	 * @generated
	 */
	public void testCreateContainer__int_int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#getAmountContainersV(int) <em>Get Amount Containers V</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#getAmountContainersV(int)
	 * @generated
	 */
	public void testGetAmountContainersV__int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#calculateV(int) <em>Calculate V</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#calculateV(int)
	 * @generated
	 */
	public void testCalculateV__int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#calculateH(int) <em>Calculate H</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#calculateH(int)
	 * @generated
	 */
	public void testCalculateH__int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#getAmountContainersH(int) <em>Get Amount Containers H</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#getAmountContainersH(int)
	 * @generated
	 */
	public void testGetAmountContainersH__int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#capturarNumeros(java.lang.String) <em>Capturar Numeros</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#capturarNumeros(java.lang.String)
	 * @generated
	 */
	public void testCapturarNumeros__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#getCoordinates(java.lang.String) <em>Get Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#getCoordinates(java.lang.String)
	 * @generated
	 */
	public void testGetCoordinates__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#getSizes(java.lang.String, java.lang.String) <em>Get Sizes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#getSizes(java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testGetSizes__String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#stractColumn(java.lang.String) <em>Stract Column</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#stractColumn(java.lang.String)
	 * @generated
	 */
	public void testStractColumn__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#getSizes2(java.lang.String, java.lang.String) <em>Get Sizes2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#getSizes2(java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testGetSizes2__String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#getCoordinates2(java.lang.String) <em>Get Coordinates2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#getCoordinates2(java.lang.String)
	 * @generated
	 */
	public void testGetCoordinates2__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#toInt(java.lang.String) <em>To Int</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#toInt(java.lang.String)
	 * @generated
	 */
	public void testToInt__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#pow(int, int) <em>Pow</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#pow(int, int)
	 * @generated
	 */
	public void testPow__int_int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#getCellValue(org.apache.poi.xssf.usermodel.XSSFCell) <em>Get Cell Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#getCellValue(org.apache.poi.xssf.usermodel.XSSFCell)
	 * @generated
	 */
	public void testGetCellValue__XSSFCell() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.DataformGenerator#createCoordinate(int, int) <em>Create Coordinate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.DataformGenerator#createCoordinate(int, int)
	 * @generated
	 */
	public void testCreateCoordinate__int_int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //DataformGeneratorTest
