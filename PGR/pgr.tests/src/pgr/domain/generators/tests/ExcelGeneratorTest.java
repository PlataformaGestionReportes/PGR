/**
 */
package pgr.domain.generators.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import pgr.domain.generators.ExcelGenerator;
import pgr.domain.generators.GeneratorsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Excel Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#ExcelGenerator(java.lang.String, java.util.ArrayList, java.util.ArrayList, gestionmodelosconsultas.ModelFactory, int, int, java.lang.String) <em>Excel Generator</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#ExcelGenerator(java.lang.String, java.util.ArrayList, java.util.ArrayList) <em>Excel Generator</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#createRelations() <em>Create Relations</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#init() <em>Init</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#initDataSheet(java.util.ArrayList) <em>Init Data Sheet</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#writeFileColumns(java.sql.ResultSet) <em>Write File Columns</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#createTable(java.util.ArrayList, int, org.apache.poi.xssf.usermodel.XSSFSheet) <em>Create Table</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#createDataSheet(java.sql.ResultSet) <em>Create Data Sheet</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#exploreResult(org.eclipse.emf.common.util.EList, java.lang.String) <em>Explore Result</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#execute(java.util.ArrayList, java.util.HashMap, int, int, int) <em>Execute</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#readFile() <em>Read File</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#saveExcel() <em>Save Excel</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#createNames() <em>Create Names</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#readSheet() <em>Read Sheet</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#getNumToCol(int) <em>Get Num To Col</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#getResulSet(org.apache.poi.xssf.usermodel.XSSFSheet) <em>Get Resul Set</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#getSetColum(java.util.ArrayList, int) <em>Get Set Colum</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#getMapOfColumnByColumn(java.util.ArrayList, int, int) <em>Get Map Of Column By Column</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#createListBox(java.util.ArrayList, org.apache.poi.xssf.usermodel.XSSFSheet, int, int) <em>Create List Box</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#buildDataSheet(org.apache.poi.xssf.usermodel.XSSFSheet, java.util.HashMap, int) <em>Build Data Sheet</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#setIndirect() <em>Set Indirect</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#deleteNames(org.apache.poi.xssf.usermodel.XSSFWorkbook) <em>Delete Names</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#nameTableToNameRange(org.apache.poi.xssf.usermodel.XSSFSheet, java.util.ArrayList) <em>Name Table To Name Range</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#countFormula(int, int) <em>Count Formula</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#theFormula(int, int, int, int, java.lang.Integer, int, int) <em>The Formula</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#createDependence(java.util.ArrayList, java.util.HashMap, java.util.ArrayList) <em>Create Dependence</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#getTitles(java.util.ArrayList) <em>Get Titles</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#removeDuplicateValues(java.util.ArrayList) <em>Remove Duplicate Values</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#getAtributtes(gestionmodelosconsultas.modeloconsultas.resultset.ResultElement) <em>Get Atributtes</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#createSheetQuery() <em>Create Sheet Query</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#removeSheets() <em>Remove Sheets</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#copyExcel(java.lang.String, java.lang.String) <em>Copy Excel</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#openFileIntoEditor(java.lang.String) <em>Open File Into Editor</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#getDir(java.lang.String) <em>Get Dir</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#getCellValue(org.apache.poi.xssf.usermodel.XSSFCell) <em>Get Cell Value</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#getArrayListFromSet(java.util.Set) <em>Get Array List From Set</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ExcelGeneratorTest extends TestCase {

	/**
	 * The fixture for this Excel Generator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExcelGenerator fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExcelGeneratorTest.class);
	}

	/**
	 * Constructs a new Excel Generator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExcelGeneratorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Excel Generator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ExcelGenerator fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Excel Generator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExcelGenerator getFixture() {
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
		setFixture(GeneratorsFactory.eINSTANCE.createExcelGenerator());
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
	 * Tests the '{@link pgr.domain.generators.ExcelGenerator#ExcelGenerator(java.lang.String, java.util.ArrayList, java.util.ArrayList, gestionmodelosconsultas.ModelFactory, int, int, java.lang.String) <em>Excel Generator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.ExcelGenerator#ExcelGenerator(java.lang.String, java.util.ArrayList, java.util.ArrayList, gestionmodelosconsultas.ModelFactory, int, int, java.lang.String)
	 * @generated
	 */
	public void testExcelGenerator__String_ArrayList_ArrayList_ModelFactory_int_int_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.ExcelGenerator#ExcelGenerator(java.lang.String, java.util.ArrayList, java.util.ArrayList) <em>Excel Generator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.ExcelGenerator#ExcelGenerator(java.lang.String, java.util.ArrayList, java.util.ArrayList)
	 * @generated
	 */
	public void testExcelGenerator__String_ArrayList_ArrayList() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.ExcelGenerator#createRelations() <em>Create Relations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.ExcelGenerator#createRelations()
	 * @generated
	 */
	public void testCreateRelations() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.ExcelGenerator#init() <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.ExcelGenerator#init()
	 * @generated
	 */
	public void testInit() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.ExcelGenerator#initDataSheet(java.util.ArrayList) <em>Init Data Sheet</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.ExcelGenerator#initDataSheet(java.util.ArrayList)
	 * @generated
	 */
	public void testInitDataSheet__ArrayList() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.ExcelGenerator#writeFileColumns(java.sql.ResultSet) <em>Write File Columns</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.ExcelGenerator#writeFileColumns(java.sql.ResultSet)
	 * @generated
	 */
	public void testWriteFileColumns__ResultSet() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.ExcelGenerator#createTable(java.util.ArrayList, int, org.apache.poi.xssf.usermodel.XSSFSheet) <em>Create Table</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.ExcelGenerator#createTable(java.util.ArrayList, int, org.apache.poi.xssf.usermodel.XSSFSheet)
	 * @generated
	 */
	public void testCreateTable__ArrayList_int_XSSFSheet() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.ExcelGenerator#createDataSheet(java.sql.ResultSet) <em>Create Data Sheet</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.ExcelGenerator#createDataSheet(java.sql.ResultSet)
	 * @generated
	 */
	public void testCreateDataSheet__ResultSet() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.ExcelGenerator#exploreResult(org.eclipse.emf.common.util.EList, java.lang.String) <em>Explore Result</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.ExcelGenerator#exploreResult(org.eclipse.emf.common.util.EList, java.lang.String)
	 * @generated
	 */
	public void testExploreResult__EList_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.ExcelGenerator#execute(java.util.ArrayList, java.util.HashMap, int, int, int) <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.ExcelGenerator#execute(java.util.ArrayList, java.util.HashMap, int, int, int)
	 * @generated
	 */
	public void testExecute__ArrayList_HashMap_int_int_int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.ExcelGenerator#readFile() <em>Read File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.ExcelGenerator#readFile()
	 * @generated
	 */
	public void testReadFile() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.ExcelGenerator#saveExcel() <em>Save Excel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.ExcelGenerator#saveExcel()
	 * @generated
	 */
	public void testSaveExcel() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.ExcelGenerator#createNames() <em>Create Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.ExcelGenerator#createNames()
	 * @generated
	 */
	public void testCreateNames() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.ExcelGenerator#readSheet() <em>Read Sheet</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.ExcelGenerator#readSheet()
	 * @generated
	 */
	public void testReadSheet() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.ExcelGenerator#getNumToCol(int) <em>Get Num To Col</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.ExcelGenerator#getNumToCol(int)
	 * @generated
	 */
	public void testGetNumToCol__int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.ExcelGenerator#getResulSet(org.apache.poi.xssf.usermodel.XSSFSheet) <em>Get Resul Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.ExcelGenerator#getResulSet(org.apache.poi.xssf.usermodel.XSSFSheet)
	 * @generated
	 */
	public void testGetResulSet__XSSFSheet() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.ExcelGenerator#getSetColum(java.util.ArrayList, int) <em>Get Set Colum</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.ExcelGenerator#getSetColum(java.util.ArrayList, int)
	 * @generated
	 */
	public void testGetSetColum__ArrayList_int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.ExcelGenerator#getMapOfColumnByColumn(java.util.ArrayList, int, int) <em>Get Map Of Column By Column</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.ExcelGenerator#getMapOfColumnByColumn(java.util.ArrayList, int, int)
	 * @generated
	 */
	public void testGetMapOfColumnByColumn__ArrayList_int_int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.ExcelGenerator#createListBox(java.util.ArrayList, org.apache.poi.xssf.usermodel.XSSFSheet, int, int) <em>Create List Box</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.ExcelGenerator#createListBox(java.util.ArrayList, org.apache.poi.xssf.usermodel.XSSFSheet, int, int)
	 * @generated
	 */
	public void testCreateListBox__ArrayList_XSSFSheet_int_int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.ExcelGenerator#buildDataSheet(org.apache.poi.xssf.usermodel.XSSFSheet, java.util.HashMap, int) <em>Build Data Sheet</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.ExcelGenerator#buildDataSheet(org.apache.poi.xssf.usermodel.XSSFSheet, java.util.HashMap, int)
	 * @generated
	 */
	public void testBuildDataSheet__XSSFSheet_HashMap_int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.ExcelGenerator#setIndirect() <em>Set Indirect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.ExcelGenerator#setIndirect()
	 * @generated
	 */
	public void testSetIndirect() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.ExcelGenerator#deleteNames(org.apache.poi.xssf.usermodel.XSSFWorkbook) <em>Delete Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.ExcelGenerator#deleteNames(org.apache.poi.xssf.usermodel.XSSFWorkbook)
	 * @generated
	 */
	public void testDeleteNames__XSSFWorkbook() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.ExcelGenerator#nameTableToNameRange(org.apache.poi.xssf.usermodel.XSSFSheet, java.util.ArrayList) <em>Name Table To Name Range</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.ExcelGenerator#nameTableToNameRange(org.apache.poi.xssf.usermodel.XSSFSheet, java.util.ArrayList)
	 * @generated
	 */
	public void testNameTableToNameRange__XSSFSheet_ArrayList() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.ExcelGenerator#countFormula(int, int) <em>Count Formula</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.ExcelGenerator#countFormula(int, int)
	 * @generated
	 */
	public void testCountFormula__int_int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.ExcelGenerator#theFormula(int, int, int, int, java.lang.Integer, int, int) <em>The Formula</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.ExcelGenerator#theFormula(int, int, int, int, java.lang.Integer, int, int)
	 * @generated
	 */
	public void testTheFormula__int_int_int_int_Integer_int_int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.ExcelGenerator#createDependence(java.util.ArrayList, java.util.HashMap, java.util.ArrayList) <em>Create Dependence</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.ExcelGenerator#createDependence(java.util.ArrayList, java.util.HashMap, java.util.ArrayList)
	 * @generated
	 */
	public void testCreateDependence__ArrayList_HashMap_ArrayList() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.ExcelGenerator#getTitles(java.util.ArrayList) <em>Get Titles</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.ExcelGenerator#getTitles(java.util.ArrayList)
	 * @generated
	 */
	public void testGetTitles__ArrayList() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.ExcelGenerator#removeDuplicateValues(java.util.ArrayList) <em>Remove Duplicate Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.ExcelGenerator#removeDuplicateValues(java.util.ArrayList)
	 * @generated
	 */
	public void testRemoveDuplicateValues__ArrayList() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.ExcelGenerator#getAtributtes(gestionmodelosconsultas.modeloconsultas.resultset.ResultElement) <em>Get Atributtes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.ExcelGenerator#getAtributtes(gestionmodelosconsultas.modeloconsultas.resultset.ResultElement)
	 * @generated
	 */
	public void testGetAtributtes__ResultElement() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.ExcelGenerator#createSheetQuery() <em>Create Sheet Query</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.ExcelGenerator#createSheetQuery()
	 * @generated
	 */
	public void testCreateSheetQuery() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.ExcelGenerator#removeSheets() <em>Remove Sheets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.ExcelGenerator#removeSheets()
	 * @generated
	 */
	public void testRemoveSheets() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.ExcelGenerator#copyExcel(java.lang.String, java.lang.String) <em>Copy Excel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.ExcelGenerator#copyExcel(java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testCopyExcel__String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.ExcelGenerator#openFileIntoEditor(java.lang.String) <em>Open File Into Editor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.ExcelGenerator#openFileIntoEditor(java.lang.String)
	 * @generated
	 */
	public void testOpenFileIntoEditor__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.ExcelGenerator#getDir(java.lang.String) <em>Get Dir</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.ExcelGenerator#getDir(java.lang.String)
	 * @generated
	 */
	public void testGetDir__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.ExcelGenerator#getCellValue(org.apache.poi.xssf.usermodel.XSSFCell) <em>Get Cell Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.ExcelGenerator#getCellValue(org.apache.poi.xssf.usermodel.XSSFCell)
	 * @generated
	 */
	public void testGetCellValue__XSSFCell() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link pgr.domain.generators.ExcelGenerator#getArrayListFromSet(java.util.Set) <em>Get Array List From Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.generators.ExcelGenerator#getArrayListFromSet(java.util.Set)
	 * @generated
	 */
	public void testGetArrayListFromSet__Set() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //ExcelGeneratorTest
