/**
 */
package pgr.domain.generators.impl;

import gestionmodelosconsultas.ModelFactory;

import gestionmodelosconsultas.modeloconsultas.resultset.ResultElement;
import gestionmodelosconsultas.modeloconsultas.resultset.Resultado;

import java.lang.reflect.InvocationTargetException;

import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

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

import pgr.domain.Domain;
import pgr.domain.DomainPackage;

import pgr.domain.generators.ExcelGenerator;
import pgr.domain.generators.GeneratorsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Excel Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pgr.domain.generators.impl.ExcelGeneratorImpl#getAbsolutePath <em>Absolute Path</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.ExcelGeneratorImpl#getWorkbook <em>Workbook</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.ExcelGeneratorImpl#getNewDataSheet <em>New Data Sheet</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.ExcelGeneratorImpl#getDataSheet <em>Data Sheet</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.ExcelGeneratorImpl#getColumnSheet <em>Column Sheet</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.ExcelGeneratorImpl#getSheet <em>Sheet</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.ExcelGeneratorImpl#getQueryString <em>Query String</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.ExcelGeneratorImpl#getModelFactoryQM <em>Model Factory QM</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.ExcelGeneratorImpl#getResultSet <em>Result Set</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.ExcelGeneratorImpl#getNamesFilters <em>Names Filters</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.ExcelGeneratorImpl#getPosFilters <em>Pos Filters</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.ExcelGeneratorImpl#getTitlesMap <em>Titles Map</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.ExcelGeneratorImpl#getSetResult <em>Set Result</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.ExcelGeneratorImpl#getListFixed <em>List Fixed</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.ExcelGeneratorImpl#getResult <em>Result</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.ExcelGeneratorImpl#getTuplesList <em>Tuples List</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.ExcelGeneratorImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.ExcelGeneratorImpl#getColumnsNames <em>Columns Names</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.ExcelGeneratorImpl#getColumnsIndex <em>Columns Index</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.ExcelGeneratorImpl#getAcc <em>Acc</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.ExcelGeneratorImpl#getFirstRowFilter <em>First Row Filter</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.ExcelGeneratorImpl#getPosRowIniData <em>Pos Row Ini Data</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.ExcelGeneratorImpl#getPosCellIniData <em>Pos Cell Ini Data</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.ExcelGeneratorImpl#getTheDomain <em>The Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExcelGeneratorImpl extends MinimalEObjectImpl.Container implements ExcelGenerator {
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
	 * The default value of the '{@link #getNewDataSheet() <em>New Data Sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewDataSheet()
	 * @generated
	 * @ordered
	 */
	protected static final XSSFSheet NEW_DATA_SHEET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewDataSheet() <em>New Data Sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewDataSheet()
	 * @generated
	 * @ordered
	 */
	protected XSSFSheet newDataSheet = NEW_DATA_SHEET_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataSheet() <em>Data Sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSheet()
	 * @generated
	 * @ordered
	 */
	protected static final XSSFSheet DATA_SHEET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataSheet() <em>Data Sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSheet()
	 * @generated
	 * @ordered
	 */
	protected XSSFSheet dataSheet = DATA_SHEET_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnSheet() <em>Column Sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnSheet()
	 * @generated
	 * @ordered
	 */
	protected static final XSSFSheet COLUMN_SHEET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnSheet() <em>Column Sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnSheet()
	 * @generated
	 * @ordered
	 */
	protected XSSFSheet columnSheet = COLUMN_SHEET_EDEFAULT;

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
	 * The default value of the '{@link #getQueryString() <em>Query String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryString()
	 * @generated
	 * @ordered
	 */
	protected static final String QUERY_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQueryString() <em>Query String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryString()
	 * @generated
	 * @ordered
	 */
	protected String queryString = QUERY_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelFactoryQM() <em>Model Factory QM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelFactoryQM()
	 * @generated
	 * @ordered
	 */
	protected static final ModelFactory MODEL_FACTORY_QM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelFactoryQM() <em>Model Factory QM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelFactoryQM()
	 * @generated
	 * @ordered
	 */
	protected ModelFactory modelFactoryQM = MODEL_FACTORY_QM_EDEFAULT;

	/**
	 * The default value of the '{@link #getResultSet() <em>Result Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultSet()
	 * @generated
	 * @ordered
	 */
	protected static final ArrayList RESULT_SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResultSet() <em>Result Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultSet()
	 * @generated
	 * @ordered
	 */
	protected ArrayList resultSet = RESULT_SET_EDEFAULT;

	/**
	 * The default value of the '{@link #getNamesFilters() <em>Names Filters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamesFilters()
	 * @generated
	 * @ordered
	 */
	protected static final ArrayList NAMES_FILTERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamesFilters() <em>Names Filters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamesFilters()
	 * @generated
	 * @ordered
	 */
	protected ArrayList namesFilters = NAMES_FILTERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosFilters() <em>Pos Filters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosFilters()
	 * @generated
	 * @ordered
	 */
	protected static final ArrayList POS_FILTERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPosFilters() <em>Pos Filters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosFilters()
	 * @generated
	 * @ordered
	 */
	protected ArrayList posFilters = POS_FILTERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitlesMap() <em>Titles Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitlesMap()
	 * @generated
	 * @ordered
	 */
	protected static final HashMap TITLES_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitlesMap() <em>Titles Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitlesMap()
	 * @generated
	 * @ordered
	 */
	protected HashMap titlesMap = TITLES_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getSetResult() <em>Set Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetResult()
	 * @generated
	 * @ordered
	 */
	protected static final ArrayList SET_RESULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSetResult() <em>Set Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetResult()
	 * @generated
	 * @ordered
	 */
	protected ArrayList setResult = SET_RESULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getListFixed() <em>List Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListFixed()
	 * @generated
	 * @ordered
	 */
	protected static final ArrayList LIST_FIXED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getListFixed() <em>List Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListFixed()
	 * @generated
	 * @ordered
	 */
	protected ArrayList listFixed = LIST_FIXED_EDEFAULT;

	/**
	 * The default value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected static final Resultado RESULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected Resultado result = RESULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTuplesList() <em>Tuples List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTuplesList()
	 * @generated
	 * @ordered
	 */
	protected static final ArrayList TUPLES_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTuplesList() <em>Tuples List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTuplesList()
	 * @generated
	 * @ordered
	 */
	protected ArrayList tuplesList = TUPLES_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumns() <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected static final ArrayList COLUMNS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected ArrayList columns = COLUMNS_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnsNames() <em>Columns Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnsNames()
	 * @generated
	 * @ordered
	 */
	protected static final ArrayList COLUMNS_NAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnsNames() <em>Columns Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnsNames()
	 * @generated
	 * @ordered
	 */
	protected ArrayList columnsNames = COLUMNS_NAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnsIndex() <em>Columns Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnsIndex()
	 * @generated
	 * @ordered
	 */
	protected static final ArrayList COLUMNS_INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnsIndex() <em>Columns Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnsIndex()
	 * @generated
	 * @ordered
	 */
	protected ArrayList columnsIndex = COLUMNS_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getAcc() <em>Acc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcc()
	 * @generated
	 * @ordered
	 */
	protected static final int ACC_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAcc() <em>Acc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcc()
	 * @generated
	 * @ordered
	 */
	protected int acc = ACC_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstRowFilter() <em>First Row Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstRowFilter()
	 * @generated
	 * @ordered
	 */
	protected static final int FIRST_ROW_FILTER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFirstRowFilter() <em>First Row Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstRowFilter()
	 * @generated
	 * @ordered
	 */
	protected int firstRowFilter = FIRST_ROW_FILTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosRowIniData() <em>Pos Row Ini Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosRowIniData()
	 * @generated
	 * @ordered
	 */
	protected static final int POS_ROW_INI_DATA_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPosRowIniData() <em>Pos Row Ini Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosRowIniData()
	 * @generated
	 * @ordered
	 */
	protected int posRowIniData = POS_ROW_INI_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosCellIniData() <em>Pos Cell Ini Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosCellIniData()
	 * @generated
	 * @ordered
	 */
	protected static final int POS_CELL_INI_DATA_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPosCellIniData() <em>Pos Cell Ini Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosCellIniData()
	 * @generated
	 * @ordered
	 */
	protected int posCellIniData = POS_CELL_INI_DATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExcelGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorsPackage.Literals.EXCEL_GENERATOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.EXCEL_GENERATOR__ABSOLUTE_PATH, oldAbsolutePath, absolutePath));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.EXCEL_GENERATOR__WORKBOOK, oldWorkbook, workbook));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSSFSheet getNewDataSheet() {
		return newDataSheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewDataSheet(XSSFSheet newNewDataSheet) {
		XSSFSheet oldNewDataSheet = newDataSheet;
		newDataSheet = newNewDataSheet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.EXCEL_GENERATOR__NEW_DATA_SHEET, oldNewDataSheet, newDataSheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSSFSheet getDataSheet() {
		return dataSheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSheet(XSSFSheet newDataSheet) {
		XSSFSheet oldDataSheet = dataSheet;
		dataSheet = newDataSheet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.EXCEL_GENERATOR__DATA_SHEET, oldDataSheet, dataSheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSSFSheet getColumnSheet() {
		return columnSheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnSheet(XSSFSheet newColumnSheet) {
		XSSFSheet oldColumnSheet = columnSheet;
		columnSheet = newColumnSheet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.EXCEL_GENERATOR__COLUMN_SHEET, oldColumnSheet, columnSheet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.EXCEL_GENERATOR__SHEET, oldSheet, sheet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQueryString() {
		return queryString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryString(String newQueryString) {
		String oldQueryString = queryString;
		queryString = newQueryString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.EXCEL_GENERATOR__QUERY_STRING, oldQueryString, queryString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactoryQM() {
		return modelFactoryQM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelFactoryQM(ModelFactory newModelFactoryQM) {
		ModelFactory oldModelFactoryQM = modelFactoryQM;
		modelFactoryQM = newModelFactoryQM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.EXCEL_GENERATOR__MODEL_FACTORY_QM, oldModelFactoryQM, modelFactoryQM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList getResultSet() {
		return resultSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultSet(ArrayList newResultSet) {
		ArrayList oldResultSet = resultSet;
		resultSet = newResultSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.EXCEL_GENERATOR__RESULT_SET, oldResultSet, resultSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList getNamesFilters() {
		return namesFilters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamesFilters(ArrayList newNamesFilters) {
		ArrayList oldNamesFilters = namesFilters;
		namesFilters = newNamesFilters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.EXCEL_GENERATOR__NAMES_FILTERS, oldNamesFilters, namesFilters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList getPosFilters() {
		return posFilters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosFilters(ArrayList newPosFilters) {
		ArrayList oldPosFilters = posFilters;
		posFilters = newPosFilters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.EXCEL_GENERATOR__POS_FILTERS, oldPosFilters, posFilters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashMap getTitlesMap() {
		return titlesMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitlesMap(HashMap newTitlesMap) {
		HashMap oldTitlesMap = titlesMap;
		titlesMap = newTitlesMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.EXCEL_GENERATOR__TITLES_MAP, oldTitlesMap, titlesMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList getSetResult() {
		return setResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetResult(ArrayList newSetResult) {
		ArrayList oldSetResult = setResult;
		setResult = newSetResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.EXCEL_GENERATOR__SET_RESULT, oldSetResult, setResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList getListFixed() {
		return listFixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListFixed(ArrayList newListFixed) {
		ArrayList oldListFixed = listFixed;
		listFixed = newListFixed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.EXCEL_GENERATOR__LIST_FIXED, oldListFixed, listFixed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resultado getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(Resultado newResult) {
		Resultado oldResult = result;
		result = newResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.EXCEL_GENERATOR__RESULT, oldResult, result));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList getTuplesList() {
		return tuplesList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTuplesList(ArrayList newTuplesList) {
		ArrayList oldTuplesList = tuplesList;
		tuplesList = newTuplesList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.EXCEL_GENERATOR__TUPLES_LIST, oldTuplesList, tuplesList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList getColumns() {
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumns(ArrayList newColumns) {
		ArrayList oldColumns = columns;
		columns = newColumns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.EXCEL_GENERATOR__COLUMNS, oldColumns, columns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList getColumnsNames() {
		return columnsNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnsNames(ArrayList newColumnsNames) {
		ArrayList oldColumnsNames = columnsNames;
		columnsNames = newColumnsNames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.EXCEL_GENERATOR__COLUMNS_NAMES, oldColumnsNames, columnsNames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList getColumnsIndex() {
		return columnsIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnsIndex(ArrayList newColumnsIndex) {
		ArrayList oldColumnsIndex = columnsIndex;
		columnsIndex = newColumnsIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.EXCEL_GENERATOR__COLUMNS_INDEX, oldColumnsIndex, columnsIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAcc() {
		return acc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcc(int newAcc) {
		int oldAcc = acc;
		acc = newAcc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.EXCEL_GENERATOR__ACC, oldAcc, acc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFirstRowFilter() {
		return firstRowFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstRowFilter(int newFirstRowFilter) {
		int oldFirstRowFilter = firstRowFilter;
		firstRowFilter = newFirstRowFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.EXCEL_GENERATOR__FIRST_ROW_FILTER, oldFirstRowFilter, firstRowFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPosRowIniData() {
		return posRowIniData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosRowIniData(int newPosRowIniData) {
		int oldPosRowIniData = posRowIniData;
		posRowIniData = newPosRowIniData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.EXCEL_GENERATOR__POS_ROW_INI_DATA, oldPosRowIniData, posRowIniData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPosCellIniData() {
		return posCellIniData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosCellIniData(int newPosCellIniData) {
		int oldPosCellIniData = posCellIniData;
		posCellIniData = newPosCellIniData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.EXCEL_GENERATOR__POS_CELL_INI_DATA, oldPosCellIniData, posCellIniData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getTheDomain() {
		if (eContainerFeatureID() != GeneratorsPackage.EXCEL_GENERATOR__THE_DOMAIN) return null;
		return (Domain)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheDomain(Domain newTheDomain, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTheDomain, GeneratorsPackage.EXCEL_GENERATOR__THE_DOMAIN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheDomain(Domain newTheDomain) {
		if (newTheDomain != eInternalContainer() || (eContainerFeatureID() != GeneratorsPackage.EXCEL_GENERATOR__THE_DOMAIN && newTheDomain != null)) {
			if (EcoreUtil.isAncestor(this, newTheDomain))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTheDomain != null)
				msgs = ((InternalEObject)newTheDomain).eInverseAdd(this, DomainPackage.DOMAIN__THE_EXCEL_GENERATOR, Domain.class, msgs);
			msgs = basicSetTheDomain(newTheDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.EXCEL_GENERATOR__THE_DOMAIN, newTheDomain, newTheDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void ExcelGenerator(final String absolutePath, final ArrayList listFilter, final ArrayList posFilters, final ModelFactory modelFactoryQM, final int posRowIniData, final int posCellIniData, final String queryString) {
		
		
				
		
					this.absolutePath = absolutePath;
					this.namesFilters = listFilter;
					this.posFilters = posFilters;
					this.posRowIniData = posRowIniData;
					this.posCellIniData = posCellIniData;
					this.queryString = queryString;
					firstRowFilter = 2;
					
					titlesMap = new HashMap<String, Integer>();
					
					tuplesList = new ArrayList<String>();
					columns  =    new ArrayList<String>();
					columnsNames = new ArrayList<String>();
					columnsIndex = new ArrayList<Integer>();
					
					this.modelFactoryQM = modelFactoryQM;
					
					result = modelFactoryQM.getFactoryModeloConsultas().getListModeloConsulta().get(0).getListResultado().get(0);
					
					workbook = readFile();
					
					createSheetQuery();
				
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void ExcelGenerator(final String absolutePath, final ArrayList listFilter, final ArrayList posFilters) {
		
		
				
				
						this.absolutePath = absolutePath;
						this.namesFilters=listFilter;
						this.posFilters = posFilters;
						posCellIniData = ( (pgr.domain.util.impl.CoordinateImpl)posFilters.get( posFilters.size()-1)).getY();
						posRowIniData  = ( (pgr.domain.util.impl.CoordinateImpl)posFilters.get( posFilters.size()-1)).getX();
						this.posFilters.remove(posFilters.size()-1);
						
						columnsNames = new ArrayList<String>();
						columnsIndex = new ArrayList<Integer>();
						tuplesList = new ArrayList<String>();
						titlesMap = new HashMap<String, Integer>();
						firstRowFilter = 2;
					
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createRelations() {
		
		
				
					sheet = workbook.getSheetAt(0);
					
					if(workbook.getSheet("Datos")==null){
						newDataSheet = workbook.createSheet("Datos");
					}else{
						workbook.removeSheetAt(workbook.getSheetIndex("Datos"));
						newDataSheet = workbook.createSheet("Datos");
					}
					
					resultSet = getResulSet(dataSheet);
					createNames();
					init();
					workbook.setActiveSheet(0);
					sheet.showInPane(0, 0);
					saveExcel();
					execute(namesFilters, titlesMap, acc, posRowIniData, posCellIniData);
					workbook.setSheetHidden(workbook.getSheetIndex("Query"), true);
					workbook.setSheetHidden(workbook.getSheetIndex("ResultSet"), true);
					workbook.setSheetHidden(workbook.getSheetIndex("Datos"), true);
					workbook.setSheetHidden(workbook.getSheetIndex("Columns"), true);
					saveExcel();
				
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void init() {
				titlesMap = getTitles(resultSet);
				setResult = removeDuplicateValues(resultSet);
		
				String cadena = (String) namesFilters.get(0);
				Integer n = (Integer) titlesMap.get(cadena);
				listFixed = getArrayListFromSet((Set) setResult.get(n));
				
				createListBox(listFixed, sheet, ((pgr.domain.util.impl.CoordinateImpl) posFilters.get(0)).getX(),
						((pgr.domain.util.impl.CoordinateImpl) posFilters.get(0)).getY());
		
				// Se crean las dependencias de los filtros
				ArrayList<HashMap<String, Set<String>>> listDependenceMap = createDependence(resultSet, titlesMap,
						namesFilters);
		
				acc = 1;
		
				// Se escribe en la sheet para utilizar los datos dentro del workbook
				for (int i = 0; i < listDependenceMap.size(); i++) {
					buildDataSheet(newDataSheet, listDependenceMap.get(i), acc);
					acc += listDependenceMap.get(i).size();
				}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initDataSheet(final ArrayList indexColum) {
		
		
				
				
						
						//dataSheet = workbook.createSheet();
							
				gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado element;
						
						for(int i=0;i<result.getListResultElement().size();i++){
							element = (gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado) result.getListResultElement().get(i);
							String s = getAtributtes(element);
							exploreResult(element.getListElementoModeloResultado(),s);	
						}
						
						dataSheet = workbook.createSheet();
						
						
						for(int i=0;i<tuplesList.size();i++){
							String s= (String) tuplesList.get(i);
							org.apache.poi.ss.usermodel.Row row = dataSheet.createRow(i);
							
							String tuplas[] = s.split(",");
							
							for(int j=0;j<indexColum.size();j++){
								org.apache.poi.ss.usermodel.Cell c = row.createCell(j);
								c.setCellValue(  tuplas[ (int) indexColum.get(i) ] );
							}
						}
						
						saveExcel();
					
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void writeFileColumns(final ResultSet rs) {
		
		
				
				try {
					
					java.sql.ResultSetMetaData data = rs.getMetaData();
					
					int column = data.getColumnCount();	
					
					for(int i=1;i<=column ;i++){
						String columnName = data.getTableName(i)+"."+data.getColumnName(i);
						columns.add(columnName);
					}
					
					columnSheet = workbook.getSheet("Columns");
					if(columnSheet == null)
						columnSheet = workbook.createSheet("Columns");
					
					createTable(columns, 1, columnSheet);
					saveExcel();
					
				} catch (java.sql.SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createTable(final ArrayList columns, final int size, final XSSFSheet sheet) {
		
		
				
				org.apache.poi.xssf.usermodel.XSSFTable table =  sheet.createTable();
				
				org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTable cttable = table.getCTTable();
				
				org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleInfo table_style = cttable.addNewTableStyleInfo();
			    table_style.setName("TableStyleMedium9"); 
			    table_style.setShowColumnStripes(false); //showColumnStripes=0
			    table_style.setShowRowStripes(true); //showRowStripes=1
				
			    /* Define the data range including headers */
			    org.apache.poi.hssf.util.AreaReference my_data_range = 
			    		new org.apache.poi.hssf.util.AreaReference(new org.apache.poi.hssf.util.CellReference(0, 0), 
			    								new org.apache.poi.hssf.util.CellReference(size, columns.size()-1));
			    
			    /* Set Range to the Table */ 
			    cttable.setRef(my_data_range.formatAsString());
			    cttable.setDisplayName(sheet.getSheetName());      /* this is the display name of the table */
			    cttable.setName(sheet.getSheetName());    /* This maps to "displayName" attribute in <table>, OOXML */            
			    cttable.setId( (long) (workbook.getSheetIndex(sheet)+1) ); //id attribute against table as long value
			    
			    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumns columnsTable = cttable.addNewTableColumns();
			    columnsTable.setCount(columns.size()); //define number of columns
			    
			    /* Define Header Information for the Table */
			    org.apache.poi.xssf.usermodel.XSSFRow row = sheet.createRow(0);
			    XSSFCell cell;
			    	    
			    for (int i = 0; i < columns.size(); i++) {
			    	org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn column = columnsTable.addNewTableColumn();   
			    	column.setName("Column");      
			        column.setId(i+1);
			        cell = row.createCell(i);
		            cell.setCellValue((String)columns.get(i));
			    }
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createDataSheet(final ResultSet resultSet) {
		                                                                     try {
							workbook = readFile();
							columnSheet = workbook.getSheet("Columns");
							org.apache.poi.xssf.usermodel.XSSFRow row = columnSheet.getRow(1);
							XSSFCell cell;
							HashMap<String, int[]> map = new HashMap<String, int[]>();
				
							for (int i = 0; i <= row.getLastCellNum(); i++) {
								cell = row.getCell(i);
				
								if (cell != null) {
									String value = getCellValue(cell);
									if (value != "") {
										int a[] = new int[100];
				
										for (int j = 0; j < 100; j++)
											a[j] = -1;
				
										if (value.contains(".")) {
											String ss[] = value.split("\\.");
											String name = ss[0];
											int order = Integer.parseInt(ss[1]);
				
											if (map.containsKey(name)) {
												a = map.get(name);
												a[order - 1] = i;
												map.put(name, a);
											} else {
												a[order - 1] = i;
												map.put(name, a);
				
											}
				
										} else {
											a[0] = i;
											map.put(value, a);
										}
									}
								}
							}
				
							int size = 0;
							for (java.util.Map.Entry<String, int[]> entry : map.entrySet()) {
								String name = entry.getKey();
								columnsNames.add(name);
								size++;
							}
				
							java.sql.ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
							int column = resultSetMetaData.getColumnCount();
				
							while (resultSet.next()) {
								String string = "";
				
								for (int i = 1; i <= column; i++) {
									if (i == column)
										string += resultSet.getString(i);
									else
										string += resultSet.getString(i) + ",";
								}
								tuplesList.add(string);
							}
				
							if (namesFilters.size() == 0) {
								dataSheet = workbook.getSheetAt(0);
				
								for (int i = 0, rowIndex = posRowIniData; i < tuplesList.size(); i++, rowIndex++) {
				
									String s = (String) tuplesList.get(i);
									org.apache.poi.xssf.usermodel.XSSFRow r = dataSheet.getRow(rowIndex);
				
									if (r == null)
										r = dataSheet.createRow(rowIndex);
									String tuplas[] = s.split(",");
									int cellIndex = posCellIniData;
				
									for (java.util.Map.Entry<String, int[]> entry : map.entrySet()) {
										int orders[] = entry.getValue();
										String concat = "";
				
										for (int k = 0; k < orders.length && orders[k] != -1; k++) {
											concat += tuplas[orders[k]] + " ";
										}
										org.apache.poi.xssf.usermodel.XSSFCell c = r.createCell(cellIndex);
										c.setCellValue(concat.substring(0, concat.length() - 1));
										cellIndex++;
									}
								}
				
							} else {
				
								workbook.setSheetHidden(workbook.getSheetIndex("Columns"), true);
								if (workbook.getSheet("ResultSet") == null)
									dataSheet = workbook.createSheet("ResultSet");
								else {
									workbook.removeSheetAt(workbook.getSheetIndex("ResultSet"));
									dataSheet = workbook.createSheet("ResultSet");
								}
				
								createTable(columnsNames, tuplesList.size(), dataSheet);
				
								for (int i = 0; i < tuplesList.size(); i++) {
				
									String s = (String) tuplesList.get(i);
									org.apache.poi.xssf.usermodel.XSSFRow r = dataSheet.createRow(i + 1);
				
									String tuplas[] = s.split(",");
				
									int j = 0;
									for (java.util.Map.Entry<String, int[]> entry : map.entrySet()) {
				
										int orders[] = entry.getValue();
				
										String concat = "";
										for (int k = 0; k < orders.length && orders[k] != -1; k++) {
											concat += tuplas[orders[k]] + " ";
										}
										org.apache.poi.xssf.usermodel.XSSFCell c = r.createCell(j);
										c.setCellValue(concat.substring(0, concat.length() - 1));
										j++;
									}
								}
							}
				
							workbook.setSheetHidden(workbook.getSheetIndex("Columns"), true);
							workbook.setSheetHidden(workbook.getSheetIndex("Query"), true);
							saveExcel();
						} catch (java.sql.SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					
					
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void exploreResult(final EList elementResultList, final String tuple) {
		
		
				
				
						
						if(elementResultList.size() == 0){
							tuplesList.add(tuple);
							return;
						}
						
						gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado element;
						for(int i=0;i < elementResultList.size();i++){
							element = (gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado) elementResultList.get(i);
							String s = getAtributtes(element);
							exploreResult(element.getListElementoModeloResultado() ,tuple+ "," +s);
						}
					
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void execute(final ArrayList listFilter, final HashMap titlesMap, final int acc, final int posRowIniData, final int posCellIniData) {
		
		
				
				// Se escriben las formulas de indirecto en el Excel
				setIndirect();
		
				// Se escribe la formula de contar valores del resultset en el Excel
				countFormula(acc + 1, 0);
		
				// Se escribe la formula que actualiza los datos en la tabla
				theFormula(posRowIniData+1, posCellIniData, acc + 1, 0, (int) titlesMap.get(listFilter.get(listFilter.size() - 1)), ((ArrayList<String> )resultSet.get(0) ).size(), resultSet.size());
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSSFWorkbook readFile() {
		
		
				// Se lee el archivo
				try{
					java.io.FileInputStream file = new java.io.FileInputStream(new java.io.File(absolutePath));
					XSSFWorkbook workbook = new XSSFWorkbook(file);
					return workbook;
				}catch (java.io.FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (java.io.IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return null;
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void saveExcel() {
		
		
				// Se escribe el archivo con las modificaciones
				try{
					java.io.FileOutputStream fileOutputStream;
					fileOutputStream = new java.io.FileOutputStream(absolutePath);
					workbook.write(fileOutputStream);
					fileOutputStream.close();
				}catch (java.io.FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (java.io.IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createNames() {
		
		
				// Se borran los nombres del workbook para actualizarlos
				deleteNames(workbook);
		
				// Se crean los nombres en el workbook de las columnas del result set
				nameTableToNameRange(dataSheet, (ArrayList<String>)resultSet.get(0));
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void readSheet() {
		
		
				
				// Se obtienen las sheet necesarias para el proceso
				if (workbook.getSheet("Datos") == null) {
					newDataSheet = workbook.createSheet("Datos");
				} else {
					workbook.removeSheetAt(workbook.getSheetIndex("Datos"));
					newDataSheet = workbook.createSheet("Datos");
				}
				
				int numSheet = workbook.getNumberOfSheets();
				dataSheet = workbook.getSheetAt(numSheet - 2);
				sheet = workbook.getSheetAt(0);
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumToCol(final int col) {
		
		
				return org.apache.poi.hssf.util.CellReference.convertNumToColString(col);
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList getResulSet(final XSSFSheet sheet) {
		
		
		
				ArrayList<ArrayList<String>> resultSet = new ArrayList<>();
		
				java.util.Iterator<org.apache.poi.ss.usermodel.Row> rowIterator = sheet.iterator();
				org.apache.poi.ss.usermodel.Row row;
				
				while (rowIterator.hasNext()) {
					row = rowIterator.next();
		
					java.util.Iterator<org.apache.poi.ss.usermodel.Cell> cellIterator = row.cellIterator();
					org.apache.poi.ss.usermodel.Cell celda;
					ArrayList<String> tupla = new ArrayList<>();
					while (cellIterator.hasNext()) {
						celda = cellIterator.next();
						celda.setCellType(org.apache.poi.ss.usermodel.Cell.CELL_TYPE_STRING);
						tupla.add(celda.getStringCellValue());
					}
					resultSet.add(tupla);
				}
		
				return resultSet;
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set getSetColum(final ArrayList resultSet, final int column) {
		
		
				Set<String> setColumn = new java.util.HashSet<>();
				for (int i = 1; i < resultSet.size(); i++) {
					setColumn.add( ( (ArrayList<String> )resultSet.get(i) ).get(column));
				}
				return setColumn;
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashMap getMapOfColumnByColumn(final ArrayList resultSet, final int columnSource, final int columnTarget) {
		
		
				
				
						HashMap<String, Set<String>> mapColumn = new HashMap<>();
						for (int i = 1; i < resultSet.size(); i++) {
							String key = ((ArrayList<String>) resultSet.get(i)).get(columnSource);
							String value = ((ArrayList<String>) resultSet.get(i)).get(columnTarget);
							if (mapColumn.get(key) == null) {
								Set<String> name = new java.util.HashSet<>();
								name.add(value);
								mapColumn.put(key, name);
							} else {
								mapColumn.get(key).add(value);
							}
						}
						return mapColumn;
					
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createListBox(final ArrayList comboNames, final XSSFSheet sheet, final int row, final int col) {
		org.apache.poi.xssf.usermodel.XSSFWorkbook workbook = (XSSFWorkbook) sheet.getWorkbook();
				org.apache.poi.ss.usermodel.Name name = null;
		
				name = workbook.createName();
				String replaceAll = ((String) namesFilters.get(0) + "s").replaceAll(" ", "_");
				name.setNameName(replaceAll);
				String colIni = getNumToCol(0);
				XSSFSheet sheet2 = workbook.getSheet("Datos");
				org.apache.poi.ss.usermodel.Row rowS = sheet2.createRow(0);
				int k = 0;
				for (; k < comboNames.size(); k++) {
					org.apache.poi.ss.usermodel.Cell cellS = rowS.createCell(k);
					cellS.setCellValue((String)comboNames.get(k));
				}
				String colFin = getNumToCol(k - 1);
		
				name.setRefersToFormula(
						sheet2.getSheetName() + "!$" + colIni + "$" + 1 + ":$" + colFin + "$" + 1);
				System.out.println(	sheet2.getSheetName() + "!$" + colIni + "$" + 1 + ":$" + colFin + "$" + 1);
				org.apache.poi.ss.usermodel.DataValidationHelper helper = sheet.getDataValidationHelper();
				org.apache.poi.ss.usermodel.DataValidationConstraint constraint = null;
				org.apache.poi.ss.usermodel.DataValidation validation = null;
				
				constraint = helper.createFormulaListConstraint(replaceAll);
				System.out.println(""+(String) namesFilters.get(0)+"s");
				validation = helper.createValidation(constraint,
						new org.apache.poi.ss.util.CellRangeAddressList(
								((pgr.domain.util.impl.CoordinateImpl) posFilters.get(0)).getX(),
								((pgr.domain.util.impl.CoordinateImpl) posFilters.get(0)).getX(),
								((pgr.domain.util.impl.CoordinateImpl) posFilters.get(0)).getY(),
								((pgr.domain.util.impl.CoordinateImpl) posFilters.get(0)).getY()));
				sheet.addValidationData(validation);
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void buildDataSheet(final XSSFSheet sheet, final HashMap mp, final int rowN) {
		
		
				org.apache.poi.xssf.usermodel.XSSFRow row = null;
				XSSFCell cell = null;
				org.apache.poi.ss.usermodel.Name name = null;
				int i = rowN;
				
				HashMap<String, Set<String>> map = mp;
				java.util.Iterator<String> it = map.keySet().iterator();
				
				while (it.hasNext()) {
					int j = 0; 
					String key = (String) it.next();
					row = sheet.createRow(i);
					for (String value : map.get(key)) {
						cell = row.createCell(j);
						cell.setCellValue(value);
						j++;
					}
					name = sheet.getWorkbook().createName();
					name.setNameName(key.replaceAll(" ", "_"));
					String colIni = getNumToCol(0);
					String colFin = getNumToCol(j - 1);
					name.setRefersToFormula(
							sheet.getSheetName() + "!$" + colIni + "$" + (i + 1) + ":$" + colFin + "$" + (i + 1));
					i++;
				}
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndirect() {
		
		
				
				
						org.apache.poi.ss.usermodel.DataValidationHelper helper = sheet.getDataValidationHelper();
						org.apache.poi.ss.usermodel.DataValidationConstraint constraint = null;
						org.apache.poi.ss.usermodel.DataValidation validation = null;
						for (int i = 1; i < posFilters.size(); i++) {
							String cell = getNumToCol(  ((pgr.domain.util.impl.CoordinateImpl)posFilters.get(i-1)).getY());
							constraint = helper.createFormulaListConstraint(
									"INDIRECT(SUBSTITUTE(" + sheet.getSheetName() + "!$" + cell + "$" +   ( ((pgr.domain.util.impl.CoordinateImpl)posFilters.get(i-1)).getX() + 1) + ",\" \", \"_\"))");			
							validation = helper.createValidation(constraint, new org.apache.poi.ss.util.CellRangeAddressList(  ((pgr.domain.util.impl.CoordinateImpl) posFilters.get(i)).getX(),
									((pgr.domain.util.impl.CoordinateImpl)posFilters.get(i)).getX(),((pgr.domain.util.impl.CoordinateImpl) posFilters.get(i)).getY(), ((pgr.domain.util.impl.CoordinateImpl) posFilters.get(i)).getY()));
							sheet.addValidationData(validation);
						}
					
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deleteNames(final XSSFWorkbook workbook) {
		
		
				int n = workbook.getNumberOfNames();
				while (n != 0) {
					String del = workbook.getNameAt(0).getNameName();
					workbook.removeName(del);
					n--;
				}
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void nameTableToNameRange(final XSSFSheet sheet, final ArrayList names) {
		
		
				XSSFWorkbook workbook = (XSSFWorkbook) sheet.getWorkbook();
				org.apache.poi.ss.usermodel.Name name = null;
				for (int i = 0; i < names.size(); i++) {
					name = workbook.createName();
					name.setNameName( ( (String) names.get(i)).replaceAll(" ", "_"));
					name.setRefersToFormula("ResultSet[" + names.get(i) + "]");
				}
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void countFormula(final int targetRow, final int targetCell) {
		
		
				
				
						org.apache.poi.xssf.usermodel.XSSFRow row = newDataSheet.createRow(targetRow);
						XSSFCell cell = row.createCell(targetCell);
						String formula = "COUNTIFS(ResultSet["+namesFilters.get(0)+"],"+sheet.getSheetName()+"!"+getNumToCol(  ((pgr.domain.util.impl.CoordinateImpl)posFilters.get(0)).getY())+(  ((pgr.domain.util.impl.CoordinateImpl)posFilters.get(0)).getX()+1);
						for(int i = 1; i < namesFilters.size();i++){
							formula+=",ResultSet["+namesFilters.get(i)+"],"+sheet.getSheetName()+"!"+getNumToCol( ((pgr.domain.util.impl.CoordinateImpl)posFilters.get(i)).getY())+(((pgr.domain.util.impl.CoordinateImpl)posFilters.get(i)).getX()+1);
						}
						formula+=")";
						cell.setCellFormula(formula);
					
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void theFormula(final int targetRow, final int targetCell, final int countRow, final int countCell, final Integer firstCellFilter, final int sizeX, final int sizeY) {
		
		
			
			
					
					String sheet1 = sheet.getSheetName();
					String sheet2 = dataSheet.getSheetName();
					
					for (int i = 0; i < sizeY; i++) {
						for (int j = 0; j < sizeX; j++) {
							String filas = "ROWS(" + sheet1 + "!" + getNumToCol(targetCell + j) + "$" + targetRow + ":" + sheet1 + "!"
								+ getNumToCol(targetCell + j) + (targetRow + i) + ")";
						int n = namesFilters.size();
						String constraint ="(("+ ((String)namesFilters.get(n-1)).replaceAll(" ", "_")+"=$"+getNumToCol( ((pgr.domain.util.impl.CoordinateImpl)posFilters.get(n-1)).getY())+"$"+(((pgr.domain.util.impl.CoordinateImpl)posFilters.get(n-1)).getX()+1)+")";
						for (int k = n-2; k >= 0; k--) {
							constraint += "*("+ ((String)namesFilters.get(k)).replaceAll(" ", "_") + "=$" + getNumToCol( ((pgr.domain.util.impl.CoordinateImpl)posFilters.get(k)).getY()) + "$" + ( ((pgr.domain.util.impl.CoordinateImpl)posFilters.get(k)).getX()+1)+")";
						}
						constraint+=")";
						String si = "IF(" + constraint + ",ROW(" + ( (String)namesFilters.get(namesFilters.size()-1) ) .replaceAll(" ", "_")
								+ ")-ROW(" + sheet2 + "!$" + getNumToCol(firstCellFilter) + "$" + firstRowFilter + ")+1)";
						String formula = "IF(" + filas + "<=" + newDataSheet.getSheetName() + "!$" + getNumToCol(countCell) + "$"
								+ (countRow + 1) + ",INDEX(INDIRECT(SUBSTITUTE(" + getNumToCol(targetCell + j) + "$" + (targetRow - 1)
								+ ",\" \",\"_\")),SMALL(" + si + "," + filas + ")),\"\")";
						sheet.setArrayFormula(formula,
								new org.apache.poi.ss.util.CellRangeAddress((targetRow + i) - 1, (targetRow + i) - 1, targetCell + j, targetCell + j));
					}
				}
		
			
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList createDependence(final ArrayList resultSet, final HashMap titlesMap, final ArrayList listFilter) {
		
		
				
				ArrayList< HashMap<String, Set<String>>> listDependenceMap = new ArrayList<>();
				
				for (int i = 1; i < listFilter.size(); i++)
					listDependenceMap.add(getMapOfColumnByColumn(resultSet,(int) titlesMap.get(listFilter.get((i - 1))),
							(int)titlesMap.get(listFilter.get(i))));
				
				return listDependenceMap;
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashMap getTitles(final ArrayList resultSet) {
		
		
				HashMap<String, Integer> titlesMap = new HashMap<>();
				ArrayList<ArrayList<String>> result = resultSet;
				for (int i = 0; i < result.get(0).size(); i++) {
					String key = result.get(0).get(i);
					titlesMap.put(key, new Integer(i));
				}
				return titlesMap;
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList removeDuplicateValues(final ArrayList resultSet) {
		
		
				ArrayList<Set<String>> setResult = new ArrayList<>();
				for (int i = 0; i <((ArrayList<String>) resultSet.get(0)).size(); i++)
					setResult.add(getSetColum(resultSet, i));
				return setResult;
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAtributtes(final ResultElement element) {
		String answer = "";
		
				if (element instanceof gestionmodelosconsultas.modeloconsultas.resultset.resultquien.UnidadOrganizacional) {
		
					gestionmodelosconsultas.modeloconsultas.resultset.resultquien.UnidadOrganizacional unidadOrganizacional = (gestionmodelosconsultas.modeloconsultas.resultset.resultquien.UnidadOrganizacional) element;
		
					if (unidadOrganizacional.getIdUnidadOrganizacional() != null)
						answer += unidadOrganizacional.getIdUnidadOrganizacional();
					if (unidadOrganizacional.getNombre() != null) {
						if (answer.length() > 0)
							answer += ",";
						answer += unidadOrganizacional.getNombre();
					}
					if (unidadOrganizacional.getDescripcion() != null) {
						if (answer.length() > 0)
							answer += ",";
						answer += unidadOrganizacional.getDescripcion();
					}
						
				} else if (element instanceof gestionmodelosconsultas.modeloconsultas.resultset.resultquien.Actor) {
		
					gestionmodelosconsultas.modeloconsultas.resultset.resultquien.Actor actor = (gestionmodelosconsultas.modeloconsultas.resultset.resultquien.Actor) element;
					
					if (actor.getIdActor() != null)
						answer += actor.getIdActor();
					if (actor.getNombre() != null) {
						if (answer.length() > 0)
							answer += ",";
						answer += actor.getNombre();
					}
					if (actor.getApellido() != null) {
						if (answer.length() > 0)
							answer += ",";
						answer += actor.getApellido();
					}
					if (actor.getEmail() != null) {
						if (answer.length() > 0)
							answer += ",";
						answer += actor.getEmail();
					}
					if (actor.getDescripcion() != null) {
						if (answer.length() > 0)
							answer += ",";
						answer += actor.getDescripcion();
					}
					
					
				} else if (element instanceof gestionmodelosconsultas.modeloconsultas.resultset.resultquien.Rol) {
		
					gestionmodelosconsultas.modeloconsultas.resultset.resultquien.Rol rol = (gestionmodelosconsultas.modeloconsultas.resultset.resultquien.Rol) element;
					
					if (rol.getIdRol() != null)
						answer += rol.getIdRol();
					if (rol.getNombre() != null)
						if (answer.length() > 0)
							answer += ",";
						answer += rol.getNombre();
					if (rol.getDescripcion() != null) {
						if (answer.length() > 0)
							answer += ",";
						answer += rol.getDescripcion();
					}
		
				} else if (element instanceof gestionmodelosconsultas.modeloconsultas.resultset.resultquien.Contacto) {
		
					gestionmodelosconsultas.modeloconsultas.resultset.resultquien.Contacto contacto = (gestionmodelosconsultas.modeloconsultas.resultset.resultquien.Contacto) element;
					
					if (contacto.getIdContacto() != null)
						answer += contacto.getIdContacto();
					if (contacto.getNombre() != null) {
						if (answer.length() > 0)
							answer += ",";
						answer += contacto.getNombre();
					}
					if (contacto.getUsername() != null) {
						if (answer.length() > 0)
							answer += ",";
						answer += contacto.getUsername();
					}
					if (contacto.getTelefono() != null) {
						if (answer.length() > 0)
							answer += ",";
						answer += contacto.getTelefono();
					}
					if (contacto.getPassword() != null) {
						if (answer.length() > 0)
							answer += ",";
						answer += contacto.getPassword();
					}
					if (contacto.getDescripcion() != null) {
						if (answer.length() > 0)
							answer += ",";
						answer += contacto.getDescripcion();
					}
				} else if (element instanceof gestionmodelosconsultas.modeloconsultas.resultset.resultque.Documento) {
		
					gestionmodelosconsultas.modeloconsultas.resultset.resultque.Documento documento = (gestionmodelosconsultas.modeloconsultas.resultset.resultque.Documento) element;
		
					if (documento.getIdDocumento() != null)
						answer += documento.getIdDocumento();
					if (documento.getTitulo() != null) {
						if (answer.length() > 0)
							answer += ",";
						answer += documento.getTitulo();
					}
					if (documento.getTipo() != null) {
						if (answer.length() > 0)
							answer += ",";
						answer += documento.getTipo();
					}
					if (documento.getFechaCreacion() != null) {
						if (answer.length() > 0)
							answer += ",";
						answer += documento.getFechaCreacion();
					}
					if (documento.getEstado() != null) {
						if (answer.length() > 0)
							answer += ",";
						answer += documento.getEstado();
					}
					if (documento.getComentarios() != null) {
						if (answer.length() > 0)
							answer += ",";
						answer += documento.getComentarios();
					}
					if (documento.getEdicion() != null) {
						if (answer.length() > 0)
							answer += ",";
						answer += documento.getEdicion();
					}
					if (documento.getAnexo() != null) {
						if (answer.length() > 0)
							answer += ",";
						answer += documento.getAnexo();
					}
					if (documento.getVigencia() != null) {
						if (answer.length() > 0)
							answer += ",";
						answer += documento.getVigencia();
					}
				} else if (element instanceof gestionmodelosconsultas.modeloconsultas.resultset.resultque.Comunicacion) {
		
					gestionmodelosconsultas.modeloconsultas.resultset.resultque.Comunicacion comunicacion = (gestionmodelosconsultas.modeloconsultas.resultset.resultque.Comunicacion) element;
		
					if (comunicacion.getIdComunicacion() != null)
						answer += comunicacion.getIdComunicacion();
					if (comunicacion.getAsunto() != null) {
						if (answer.length() > 0)
							answer += ",";
						answer += comunicacion.getAsunto();
					}
				} else if (element instanceof gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.ActividadProceso) {
		
					gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.ActividadProceso actividadProceso = (gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.ActividadProceso) element;
		
					if (actividadProceso.getIdActividadProceso() != null)
						answer += actividadProceso.getIdActividadProceso();
					if (actividadProceso.getNombre() != null) {
						if (answer.length() > 0)
							answer += ",";
						answer += actividadProceso.getNombre();
					}
					if (actividadProceso.getDescripcion() != null) {
						if (answer.length() > 0)
							answer += ",";
						answer += actividadProceso.getDescripcion();
					}
					if (actividadProceso.getFechaInicio() != null) {
						if (answer.length() > 0)
							answer += ",";
						answer += actividadProceso.getFechaInicio();
					}
					if (actividadProceso.getFechaFin() != null) {
						if (answer.length() > 0)
							answer += ",";
						answer += actividadProceso.getFechaFin();
					}
				} else if (element instanceof gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.InstanciaProceso) {
		
					gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.InstanciaProceso instanciaProceso = (gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.InstanciaProceso) element;
		
					if (instanciaProceso.getIdInstanciaProceso() != null)
						answer += instanciaProceso.getIdInstanciaProceso();
					if (instanciaProceso.getNombre() != null) {
						if (answer.length() > 0)
							answer += ",";
						answer += instanciaProceso.getNombre();
					}
					if (instanciaProceso.getDescripcion() != null) {
						if (answer.length() > 0)
							answer += ",";
						answer += instanciaProceso.getDescripcion();
					}
				} else if (element instanceof gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.Deposito) {
		
					gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.Deposito deposito = (gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.Deposito) element;
					
					if (deposito.getIdDeposito() != null)
						answer += deposito.getIdDeposito();
					if (deposito.getDescripcion() != null) {
						if (answer.length() > 0)
							answer += ",";
						answer += deposito.getDescripcion();
					}
				} else if (element instanceof gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.Disco) {
		
					gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.Disco disco = (gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.Disco) element;
					
					if (disco.getIdDisco() != null)
						answer += disco.getIdDisco();
					if (disco.getReferencia() != null) {
						if (answer.length() > 0)
							answer += ",";
						answer += disco.getReferencia();
					}
					if (disco.getDescripcion() != null) {
						if (answer.length() > 0)
							answer += ",";
						answer += disco.getDescripcion();
					}
				} else if (element instanceof gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.Armario) {
		
					gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.Armario armario = (gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.Armario) element;
					
					if (armario.getIdArmario() != null)
						answer += armario.getIdArmario();
					if (armario.getDescripcion() != null) {
						if (answer.length() > 0)
							answer += ",";
						answer += armario.getDescripcion();
					}
				}
		
				return answer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createSheetQuery() {
		
		
				
				
						
						XSSFSheet query = workbook.createSheet("Query");
						org.apache.poi.xssf.usermodel.XSSFRow row = query.createRow(0);
						XSSFCell cell = row.createCell(0);
						cell.setCellValue(queryString);
						
						int i =1;
						for(;i<= namesFilters.size();i++){
							row = query.createRow(i);
							
							cell = row.createCell(0);
							cell.setCellValue(""+  ((pgr.domain.util.impl.CoordinateImpl)posFilters.get(i-1)).getX());
							
							cell = row.createCell(1);
							cell.setCellValue(""+ ((pgr.domain.util.impl.CoordinateImpl)posFilters.get(i-1)).getY());
							
							cell = row.createCell(2);
							cell.setCellValue(""+ namesFilters.get(i-1));
						}
						
						row = query.createRow(i);
						
						cell = row.createCell(0);
						cell.setCellValue(""+ posRowIniData);
						
						cell = row.createCell(1);
						cell.setCellValue(""+ posCellIniData);
						
						workbook.setSheetHidden(workbook.getSheetIndex("Query"), XSSFWorkbook.SHEET_STATE_HIDDEN);
					
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeSheets() {
		
		
				workbook.removeSheetAt(workbook.getSheetIndex("Query"));
				workbook.removeSheetAt(workbook.getSheetIndex("Columns"));
				saveExcel();
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void copyExcel(final String sourcePath, final String targetPath) {
		
		
				try {
					java.io.File sourceFile = new java.io.File(sourcePath);
					java.io.File targetDir  = new java.io.File(targetPath);
					org.apache.commons.io.FileUtils.copyFileToDirectory(sourceFile, targetDir);
				} catch (java.io.IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void openFileIntoEditor(final String path) {
		
		
				java.io.File fileToOpen = new java.io.File(path);
				 
				if (fileToOpen.exists() && fileToOpen.isFile()) {
					org.eclipse.core.filesystem.IFileStore fileStore = org.eclipse.core.filesystem.EFS.getLocalFileSystem().getStore(fileToOpen.toURI());
					org.eclipse.ui.IWorkbenchPage page = org.eclipse.ui.PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				 
				    try {
				    	org.eclipse.ui.ide.IDE.openEditorOnFileStore( page, fileStore);
				    } catch ( org.eclipse.ui.PartInitException e ) {
				        //Put your exception handler here if you wish to
				    }
				} else {
				    //Do something if the file does not exist
				}
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDir(final String absolutePath) {
		
		
				
				int index = absolutePath.length()-1;
				
				char c = absolutePath.charAt(index);
				while(c!='/'){
					index--;
					c = absolutePath.charAt(index);
				}
				return absolutePath.substring(0, index);
			
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
	public ArrayList getArrayListFromSet(final Set s) {
		
		
				ArrayList<String> names=new ArrayList<String>();
				names.addAll(s);
				return names;
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeneratorsPackage.EXCEL_GENERATOR__THE_DOMAIN:
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
			case GeneratorsPackage.EXCEL_GENERATOR__THE_DOMAIN:
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
			case GeneratorsPackage.EXCEL_GENERATOR__THE_DOMAIN:
				return eInternalContainer().eInverseRemove(this, DomainPackage.DOMAIN__THE_EXCEL_GENERATOR, Domain.class, msgs);
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
			case GeneratorsPackage.EXCEL_GENERATOR__ABSOLUTE_PATH:
				return getAbsolutePath();
			case GeneratorsPackage.EXCEL_GENERATOR__WORKBOOK:
				return getWorkbook();
			case GeneratorsPackage.EXCEL_GENERATOR__NEW_DATA_SHEET:
				return getNewDataSheet();
			case GeneratorsPackage.EXCEL_GENERATOR__DATA_SHEET:
				return getDataSheet();
			case GeneratorsPackage.EXCEL_GENERATOR__COLUMN_SHEET:
				return getColumnSheet();
			case GeneratorsPackage.EXCEL_GENERATOR__SHEET:
				return getSheet();
			case GeneratorsPackage.EXCEL_GENERATOR__QUERY_STRING:
				return getQueryString();
			case GeneratorsPackage.EXCEL_GENERATOR__MODEL_FACTORY_QM:
				return getModelFactoryQM();
			case GeneratorsPackage.EXCEL_GENERATOR__RESULT_SET:
				return getResultSet();
			case GeneratorsPackage.EXCEL_GENERATOR__NAMES_FILTERS:
				return getNamesFilters();
			case GeneratorsPackage.EXCEL_GENERATOR__POS_FILTERS:
				return getPosFilters();
			case GeneratorsPackage.EXCEL_GENERATOR__TITLES_MAP:
				return getTitlesMap();
			case GeneratorsPackage.EXCEL_GENERATOR__SET_RESULT:
				return getSetResult();
			case GeneratorsPackage.EXCEL_GENERATOR__LIST_FIXED:
				return getListFixed();
			case GeneratorsPackage.EXCEL_GENERATOR__RESULT:
				return getResult();
			case GeneratorsPackage.EXCEL_GENERATOR__TUPLES_LIST:
				return getTuplesList();
			case GeneratorsPackage.EXCEL_GENERATOR__COLUMNS:
				return getColumns();
			case GeneratorsPackage.EXCEL_GENERATOR__COLUMNS_NAMES:
				return getColumnsNames();
			case GeneratorsPackage.EXCEL_GENERATOR__COLUMNS_INDEX:
				return getColumnsIndex();
			case GeneratorsPackage.EXCEL_GENERATOR__ACC:
				return getAcc();
			case GeneratorsPackage.EXCEL_GENERATOR__FIRST_ROW_FILTER:
				return getFirstRowFilter();
			case GeneratorsPackage.EXCEL_GENERATOR__POS_ROW_INI_DATA:
				return getPosRowIniData();
			case GeneratorsPackage.EXCEL_GENERATOR__POS_CELL_INI_DATA:
				return getPosCellIniData();
			case GeneratorsPackage.EXCEL_GENERATOR__THE_DOMAIN:
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
			case GeneratorsPackage.EXCEL_GENERATOR__ABSOLUTE_PATH:
				setAbsolutePath((String)newValue);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__WORKBOOK:
				setWorkbook((XSSFWorkbook)newValue);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__NEW_DATA_SHEET:
				setNewDataSheet((XSSFSheet)newValue);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__DATA_SHEET:
				setDataSheet((XSSFSheet)newValue);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__COLUMN_SHEET:
				setColumnSheet((XSSFSheet)newValue);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__SHEET:
				setSheet((XSSFSheet)newValue);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__QUERY_STRING:
				setQueryString((String)newValue);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__MODEL_FACTORY_QM:
				setModelFactoryQM((ModelFactory)newValue);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__RESULT_SET:
				setResultSet((ArrayList)newValue);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__NAMES_FILTERS:
				setNamesFilters((ArrayList)newValue);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__POS_FILTERS:
				setPosFilters((ArrayList)newValue);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__TITLES_MAP:
				setTitlesMap((HashMap)newValue);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__SET_RESULT:
				setSetResult((ArrayList)newValue);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__LIST_FIXED:
				setListFixed((ArrayList)newValue);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__RESULT:
				setResult((Resultado)newValue);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__TUPLES_LIST:
				setTuplesList((ArrayList)newValue);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__COLUMNS:
				setColumns((ArrayList)newValue);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__COLUMNS_NAMES:
				setColumnsNames((ArrayList)newValue);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__COLUMNS_INDEX:
				setColumnsIndex((ArrayList)newValue);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__ACC:
				setAcc((Integer)newValue);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__FIRST_ROW_FILTER:
				setFirstRowFilter((Integer)newValue);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__POS_ROW_INI_DATA:
				setPosRowIniData((Integer)newValue);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__POS_CELL_INI_DATA:
				setPosCellIniData((Integer)newValue);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__THE_DOMAIN:
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
			case GeneratorsPackage.EXCEL_GENERATOR__ABSOLUTE_PATH:
				setAbsolutePath(ABSOLUTE_PATH_EDEFAULT);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__WORKBOOK:
				setWorkbook(WORKBOOK_EDEFAULT);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__NEW_DATA_SHEET:
				setNewDataSheet(NEW_DATA_SHEET_EDEFAULT);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__DATA_SHEET:
				setDataSheet(DATA_SHEET_EDEFAULT);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__COLUMN_SHEET:
				setColumnSheet(COLUMN_SHEET_EDEFAULT);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__SHEET:
				setSheet(SHEET_EDEFAULT);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__QUERY_STRING:
				setQueryString(QUERY_STRING_EDEFAULT);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__MODEL_FACTORY_QM:
				setModelFactoryQM(MODEL_FACTORY_QM_EDEFAULT);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__RESULT_SET:
				setResultSet(RESULT_SET_EDEFAULT);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__NAMES_FILTERS:
				setNamesFilters(NAMES_FILTERS_EDEFAULT);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__POS_FILTERS:
				setPosFilters(POS_FILTERS_EDEFAULT);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__TITLES_MAP:
				setTitlesMap(TITLES_MAP_EDEFAULT);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__SET_RESULT:
				setSetResult(SET_RESULT_EDEFAULT);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__LIST_FIXED:
				setListFixed(LIST_FIXED_EDEFAULT);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__RESULT:
				setResult(RESULT_EDEFAULT);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__TUPLES_LIST:
				setTuplesList(TUPLES_LIST_EDEFAULT);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__COLUMNS:
				setColumns(COLUMNS_EDEFAULT);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__COLUMNS_NAMES:
				setColumnsNames(COLUMNS_NAMES_EDEFAULT);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__COLUMNS_INDEX:
				setColumnsIndex(COLUMNS_INDEX_EDEFAULT);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__ACC:
				setAcc(ACC_EDEFAULT);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__FIRST_ROW_FILTER:
				setFirstRowFilter(FIRST_ROW_FILTER_EDEFAULT);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__POS_ROW_INI_DATA:
				setPosRowIniData(POS_ROW_INI_DATA_EDEFAULT);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__POS_CELL_INI_DATA:
				setPosCellIniData(POS_CELL_INI_DATA_EDEFAULT);
				return;
			case GeneratorsPackage.EXCEL_GENERATOR__THE_DOMAIN:
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
			case GeneratorsPackage.EXCEL_GENERATOR__ABSOLUTE_PATH:
				return ABSOLUTE_PATH_EDEFAULT == null ? absolutePath != null : !ABSOLUTE_PATH_EDEFAULT.equals(absolutePath);
			case GeneratorsPackage.EXCEL_GENERATOR__WORKBOOK:
				return WORKBOOK_EDEFAULT == null ? workbook != null : !WORKBOOK_EDEFAULT.equals(workbook);
			case GeneratorsPackage.EXCEL_GENERATOR__NEW_DATA_SHEET:
				return NEW_DATA_SHEET_EDEFAULT == null ? newDataSheet != null : !NEW_DATA_SHEET_EDEFAULT.equals(newDataSheet);
			case GeneratorsPackage.EXCEL_GENERATOR__DATA_SHEET:
				return DATA_SHEET_EDEFAULT == null ? dataSheet != null : !DATA_SHEET_EDEFAULT.equals(dataSheet);
			case GeneratorsPackage.EXCEL_GENERATOR__COLUMN_SHEET:
				return COLUMN_SHEET_EDEFAULT == null ? columnSheet != null : !COLUMN_SHEET_EDEFAULT.equals(columnSheet);
			case GeneratorsPackage.EXCEL_GENERATOR__SHEET:
				return SHEET_EDEFAULT == null ? sheet != null : !SHEET_EDEFAULT.equals(sheet);
			case GeneratorsPackage.EXCEL_GENERATOR__QUERY_STRING:
				return QUERY_STRING_EDEFAULT == null ? queryString != null : !QUERY_STRING_EDEFAULT.equals(queryString);
			case GeneratorsPackage.EXCEL_GENERATOR__MODEL_FACTORY_QM:
				return MODEL_FACTORY_QM_EDEFAULT == null ? modelFactoryQM != null : !MODEL_FACTORY_QM_EDEFAULT.equals(modelFactoryQM);
			case GeneratorsPackage.EXCEL_GENERATOR__RESULT_SET:
				return RESULT_SET_EDEFAULT == null ? resultSet != null : !RESULT_SET_EDEFAULT.equals(resultSet);
			case GeneratorsPackage.EXCEL_GENERATOR__NAMES_FILTERS:
				return NAMES_FILTERS_EDEFAULT == null ? namesFilters != null : !NAMES_FILTERS_EDEFAULT.equals(namesFilters);
			case GeneratorsPackage.EXCEL_GENERATOR__POS_FILTERS:
				return POS_FILTERS_EDEFAULT == null ? posFilters != null : !POS_FILTERS_EDEFAULT.equals(posFilters);
			case GeneratorsPackage.EXCEL_GENERATOR__TITLES_MAP:
				return TITLES_MAP_EDEFAULT == null ? titlesMap != null : !TITLES_MAP_EDEFAULT.equals(titlesMap);
			case GeneratorsPackage.EXCEL_GENERATOR__SET_RESULT:
				return SET_RESULT_EDEFAULT == null ? setResult != null : !SET_RESULT_EDEFAULT.equals(setResult);
			case GeneratorsPackage.EXCEL_GENERATOR__LIST_FIXED:
				return LIST_FIXED_EDEFAULT == null ? listFixed != null : !LIST_FIXED_EDEFAULT.equals(listFixed);
			case GeneratorsPackage.EXCEL_GENERATOR__RESULT:
				return RESULT_EDEFAULT == null ? result != null : !RESULT_EDEFAULT.equals(result);
			case GeneratorsPackage.EXCEL_GENERATOR__TUPLES_LIST:
				return TUPLES_LIST_EDEFAULT == null ? tuplesList != null : !TUPLES_LIST_EDEFAULT.equals(tuplesList);
			case GeneratorsPackage.EXCEL_GENERATOR__COLUMNS:
				return COLUMNS_EDEFAULT == null ? columns != null : !COLUMNS_EDEFAULT.equals(columns);
			case GeneratorsPackage.EXCEL_GENERATOR__COLUMNS_NAMES:
				return COLUMNS_NAMES_EDEFAULT == null ? columnsNames != null : !COLUMNS_NAMES_EDEFAULT.equals(columnsNames);
			case GeneratorsPackage.EXCEL_GENERATOR__COLUMNS_INDEX:
				return COLUMNS_INDEX_EDEFAULT == null ? columnsIndex != null : !COLUMNS_INDEX_EDEFAULT.equals(columnsIndex);
			case GeneratorsPackage.EXCEL_GENERATOR__ACC:
				return acc != ACC_EDEFAULT;
			case GeneratorsPackage.EXCEL_GENERATOR__FIRST_ROW_FILTER:
				return firstRowFilter != FIRST_ROW_FILTER_EDEFAULT;
			case GeneratorsPackage.EXCEL_GENERATOR__POS_ROW_INI_DATA:
				return posRowIniData != POS_ROW_INI_DATA_EDEFAULT;
			case GeneratorsPackage.EXCEL_GENERATOR__POS_CELL_INI_DATA:
				return posCellIniData != POS_CELL_INI_DATA_EDEFAULT;
			case GeneratorsPackage.EXCEL_GENERATOR__THE_DOMAIN:
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
			case GeneratorsPackage.EXCEL_GENERATOR___EXCEL_GENERATOR__STRING_ARRAYLIST_ARRAYLIST_MODELFACTORY_INT_INT_STRING:
				ExcelGenerator((String)arguments.get(0), (ArrayList)arguments.get(1), (ArrayList)arguments.get(2), (ModelFactory)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5), (String)arguments.get(6));
				return null;
			case GeneratorsPackage.EXCEL_GENERATOR___EXCEL_GENERATOR__STRING_ARRAYLIST_ARRAYLIST:
				ExcelGenerator((String)arguments.get(0), (ArrayList)arguments.get(1), (ArrayList)arguments.get(2));
				return null;
			case GeneratorsPackage.EXCEL_GENERATOR___CREATE_RELATIONS:
				createRelations();
				return null;
			case GeneratorsPackage.EXCEL_GENERATOR___INIT:
				init();
				return null;
			case GeneratorsPackage.EXCEL_GENERATOR___INIT_DATA_SHEET__ARRAYLIST:
				initDataSheet((ArrayList)arguments.get(0));
				return null;
			case GeneratorsPackage.EXCEL_GENERATOR___WRITE_FILE_COLUMNS__RESULTSET:
				writeFileColumns((ResultSet)arguments.get(0));
				return null;
			case GeneratorsPackage.EXCEL_GENERATOR___CREATE_TABLE__ARRAYLIST_INT_XSSFSHEET:
				createTable((ArrayList)arguments.get(0), (Integer)arguments.get(1), (XSSFSheet)arguments.get(2));
				return null;
			case GeneratorsPackage.EXCEL_GENERATOR___CREATE_DATA_SHEET__RESULTSET:
				createDataSheet((ResultSet)arguments.get(0));
				return null;
			case GeneratorsPackage.EXCEL_GENERATOR___EXPLORE_RESULT__ELIST_STRING:
				exploreResult((EList)arguments.get(0), (String)arguments.get(1));
				return null;
			case GeneratorsPackage.EXCEL_GENERATOR___EXECUTE__ARRAYLIST_HASHMAP_INT_INT_INT:
				execute((ArrayList)arguments.get(0), (HashMap)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
				return null;
			case GeneratorsPackage.EXCEL_GENERATOR___READ_FILE:
				return readFile();
			case GeneratorsPackage.EXCEL_GENERATOR___SAVE_EXCEL:
				saveExcel();
				return null;
			case GeneratorsPackage.EXCEL_GENERATOR___CREATE_NAMES:
				createNames();
				return null;
			case GeneratorsPackage.EXCEL_GENERATOR___READ_SHEET:
				readSheet();
				return null;
			case GeneratorsPackage.EXCEL_GENERATOR___GET_NUM_TO_COL__INT:
				return getNumToCol((Integer)arguments.get(0));
			case GeneratorsPackage.EXCEL_GENERATOR___GET_RESUL_SET__XSSFSHEET:
				return getResulSet((XSSFSheet)arguments.get(0));
			case GeneratorsPackage.EXCEL_GENERATOR___GET_SET_COLUM__ARRAYLIST_INT:
				return getSetColum((ArrayList)arguments.get(0), (Integer)arguments.get(1));
			case GeneratorsPackage.EXCEL_GENERATOR___GET_MAP_OF_COLUMN_BY_COLUMN__ARRAYLIST_INT_INT:
				return getMapOfColumnByColumn((ArrayList)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case GeneratorsPackage.EXCEL_GENERATOR___CREATE_LIST_BOX__ARRAYLIST_XSSFSHEET_INT_INT:
				createListBox((ArrayList)arguments.get(0), (XSSFSheet)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
				return null;
			case GeneratorsPackage.EXCEL_GENERATOR___BUILD_DATA_SHEET__XSSFSHEET_HASHMAP_INT:
				buildDataSheet((XSSFSheet)arguments.get(0), (HashMap)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case GeneratorsPackage.EXCEL_GENERATOR___SET_INDIRECT:
				setIndirect();
				return null;
			case GeneratorsPackage.EXCEL_GENERATOR___DELETE_NAMES__XSSFWORKBOOK:
				deleteNames((XSSFWorkbook)arguments.get(0));
				return null;
			case GeneratorsPackage.EXCEL_GENERATOR___NAME_TABLE_TO_NAME_RANGE__XSSFSHEET_ARRAYLIST:
				nameTableToNameRange((XSSFSheet)arguments.get(0), (ArrayList)arguments.get(1));
				return null;
			case GeneratorsPackage.EXCEL_GENERATOR___COUNT_FORMULA__INT_INT:
				countFormula((Integer)arguments.get(0), (Integer)arguments.get(1));
				return null;
			case GeneratorsPackage.EXCEL_GENERATOR___THE_FORMULA__INT_INT_INT_INT_INTEGER_INT_INT:
				theFormula((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5), (Integer)arguments.get(6));
				return null;
			case GeneratorsPackage.EXCEL_GENERATOR___CREATE_DEPENDENCE__ARRAYLIST_HASHMAP_ARRAYLIST:
				return createDependence((ArrayList)arguments.get(0), (HashMap)arguments.get(1), (ArrayList)arguments.get(2));
			case GeneratorsPackage.EXCEL_GENERATOR___GET_TITLES__ARRAYLIST:
				return getTitles((ArrayList)arguments.get(0));
			case GeneratorsPackage.EXCEL_GENERATOR___REMOVE_DUPLICATE_VALUES__ARRAYLIST:
				return removeDuplicateValues((ArrayList)arguments.get(0));
			case GeneratorsPackage.EXCEL_GENERATOR___GET_ATRIBUTTES__RESULTELEMENT:
				return getAtributtes((ResultElement)arguments.get(0));
			case GeneratorsPackage.EXCEL_GENERATOR___CREATE_SHEET_QUERY:
				createSheetQuery();
				return null;
			case GeneratorsPackage.EXCEL_GENERATOR___REMOVE_SHEETS:
				removeSheets();
				return null;
			case GeneratorsPackage.EXCEL_GENERATOR___COPY_EXCEL__STRING_STRING:
				copyExcel((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case GeneratorsPackage.EXCEL_GENERATOR___OPEN_FILE_INTO_EDITOR__STRING:
				openFileIntoEditor((String)arguments.get(0));
				return null;
			case GeneratorsPackage.EXCEL_GENERATOR___GET_DIR__STRING:
				return getDir((String)arguments.get(0));
			case GeneratorsPackage.EXCEL_GENERATOR___GET_CELL_VALUE__XSSFCELL:
				return getCellValue((XSSFCell)arguments.get(0));
			case GeneratorsPackage.EXCEL_GENERATOR___GET_ARRAY_LIST_FROM_SET__SET:
				return getArrayListFromSet((Set)arguments.get(0));
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
		result.append(" (absolutePath: ");
		result.append(absolutePath);
		result.append(", workbook: ");
		result.append(workbook);
		result.append(", newDataSheet: ");
		result.append(newDataSheet);
		result.append(", dataSheet: ");
		result.append(dataSheet);
		result.append(", columnSheet: ");
		result.append(columnSheet);
		result.append(", sheet: ");
		result.append(sheet);
		result.append(", queryString: ");
		result.append(queryString);
		result.append(", modelFactoryQM: ");
		result.append(modelFactoryQM);
		result.append(", resultSet: ");
		result.append(resultSet);
		result.append(", namesFilters: ");
		result.append(namesFilters);
		result.append(", posFilters: ");
		result.append(posFilters);
		result.append(", titlesMap: ");
		result.append(titlesMap);
		result.append(", setResult: ");
		result.append(setResult);
		result.append(", listFixed: ");
		result.append(listFixed);
		result.append(", result: ");
		result.append(result);
		result.append(", tuplesList: ");
		result.append(tuplesList);
		result.append(", columns: ");
		result.append(columns);
		result.append(", columnsNames: ");
		result.append(columnsNames);
		result.append(", columnsIndex: ");
		result.append(columnsIndex);
		result.append(", acc: ");
		result.append(acc);
		result.append(", firstRowFilter: ");
		result.append(firstRowFilter);
		result.append(", posRowIniData: ");
		result.append(posRowIniData);
		result.append(", posCellIniData: ");
		result.append(posCellIniData);
		result.append(')');
		return result.toString();
	}

} //ExcelGeneratorImpl
