/**
 */
package pgr.domain.generators;

import gestionmodelosconsultas.ModelFactory;

import gestionmodelosconsultas.modeloconsultas.resultset.ResultElement;
import gestionmodelosconsultas.modeloconsultas.resultset.Resultado;

import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import pgr.domain.Domain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Excel Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#getAbsolutePath <em>Absolute Path</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#getWorkbook <em>Workbook</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#getNewDataSheet <em>New Data Sheet</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#getDataSheet <em>Data Sheet</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#getColumnSheet <em>Column Sheet</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#getSheet <em>Sheet</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#getQueryString <em>Query String</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#getModelFactoryQM <em>Model Factory QM</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#getResultSet <em>Result Set</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#getNamesFilters <em>Names Filters</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#getPosFilters <em>Pos Filters</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#getTitlesMap <em>Titles Map</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#getSetResult <em>Set Result</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#getListFixed <em>List Fixed</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#getResult <em>Result</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#getTuplesList <em>Tuples List</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#getColumns <em>Columns</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#getColumnsNames <em>Columns Names</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#getColumnsIndex <em>Columns Index</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#getAcc <em>Acc</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#getFirstRowFilter <em>First Row Filter</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#getPosRowIniData <em>Pos Row Ini Data</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#getPosCellIniData <em>Pos Cell Ini Data</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelGenerator#getTheDomain <em>The Domain</em>}</li>
 * </ul>
 *
 * @see pgr.domain.generators.GeneratorsPackage#getExcelGenerator()
 * @model
 * @generated
 */
public interface ExcelGenerator extends EObject {
	/**
	 * Returns the value of the '<em><b>Absolute Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Absolute Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Absolute Path</em>' attribute.
	 * @see #setAbsolutePath(String)
	 * @see pgr.domain.generators.GeneratorsPackage#getExcelGenerator_AbsolutePath()
	 * @model
	 * @generated
	 */
	String getAbsolutePath();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.ExcelGenerator#getAbsolutePath <em>Absolute Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Absolute Path</em>' attribute.
	 * @see #getAbsolutePath()
	 * @generated
	 */
	void setAbsolutePath(String value);

	/**
	 * Returns the value of the '<em><b>Workbook</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workbook</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workbook</em>' attribute.
	 * @see #setWorkbook(XSSFWorkbook)
	 * @see pgr.domain.generators.GeneratorsPackage#getExcelGenerator_Workbook()
	 * @model dataType="pgr.datatypes.datatypeapachepoi.XSSFWorkbook"
	 * @generated
	 */
	XSSFWorkbook getWorkbook();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.ExcelGenerator#getWorkbook <em>Workbook</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workbook</em>' attribute.
	 * @see #getWorkbook()
	 * @generated
	 */
	void setWorkbook(XSSFWorkbook value);

	/**
	 * Returns the value of the '<em><b>New Data Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Data Sheet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Data Sheet</em>' attribute.
	 * @see #setNewDataSheet(XSSFSheet)
	 * @see pgr.domain.generators.GeneratorsPackage#getExcelGenerator_NewDataSheet()
	 * @model dataType="pgr.datatypes.datatypeapachepoi.XSSFSheet"
	 * @generated
	 */
	XSSFSheet getNewDataSheet();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.ExcelGenerator#getNewDataSheet <em>New Data Sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Data Sheet</em>' attribute.
	 * @see #getNewDataSheet()
	 * @generated
	 */
	void setNewDataSheet(XSSFSheet value);

	/**
	 * Returns the value of the '<em><b>Data Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Sheet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Sheet</em>' attribute.
	 * @see #setDataSheet(XSSFSheet)
	 * @see pgr.domain.generators.GeneratorsPackage#getExcelGenerator_DataSheet()
	 * @model dataType="pgr.datatypes.datatypeapachepoi.XSSFSheet"
	 * @generated
	 */
	XSSFSheet getDataSheet();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.ExcelGenerator#getDataSheet <em>Data Sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Sheet</em>' attribute.
	 * @see #getDataSheet()
	 * @generated
	 */
	void setDataSheet(XSSFSheet value);

	/**
	 * Returns the value of the '<em><b>Column Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Sheet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Sheet</em>' attribute.
	 * @see #setColumnSheet(XSSFSheet)
	 * @see pgr.domain.generators.GeneratorsPackage#getExcelGenerator_ColumnSheet()
	 * @model dataType="pgr.datatypes.datatypeapachepoi.XSSFSheet"
	 * @generated
	 */
	XSSFSheet getColumnSheet();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.ExcelGenerator#getColumnSheet <em>Column Sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Sheet</em>' attribute.
	 * @see #getColumnSheet()
	 * @generated
	 */
	void setColumnSheet(XSSFSheet value);

	/**
	 * Returns the value of the '<em><b>Sheet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sheet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheet</em>' attribute.
	 * @see #setSheet(XSSFSheet)
	 * @see pgr.domain.generators.GeneratorsPackage#getExcelGenerator_Sheet()
	 * @model dataType="pgr.datatypes.datatypeapachepoi.XSSFSheet"
	 * @generated
	 */
	XSSFSheet getSheet();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.ExcelGenerator#getSheet <em>Sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheet</em>' attribute.
	 * @see #getSheet()
	 * @generated
	 */
	void setSheet(XSSFSheet value);

	/**
	 * Returns the value of the '<em><b>Query String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query String</em>' attribute.
	 * @see #setQueryString(String)
	 * @see pgr.domain.generators.GeneratorsPackage#getExcelGenerator_QueryString()
	 * @model
	 * @generated
	 */
	String getQueryString();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.ExcelGenerator#getQueryString <em>Query String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query String</em>' attribute.
	 * @see #getQueryString()
	 * @generated
	 */
	void setQueryString(String value);

	/**
	 * Returns the value of the '<em><b>Model Factory QM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Factory QM</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Factory QM</em>' attribute.
	 * @see #setModelFactoryQM(ModelFactory)
	 * @see pgr.domain.generators.GeneratorsPackage#getExcelGenerator_ModelFactoryQM()
	 * @model dataType="pgr.datatypes.datatypesqm.ModelFactory"
	 * @generated
	 */
	ModelFactory getModelFactoryQM();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.ExcelGenerator#getModelFactoryQM <em>Model Factory QM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Factory QM</em>' attribute.
	 * @see #getModelFactoryQM()
	 * @generated
	 */
	void setModelFactoryQM(ModelFactory value);

	/**
	 * Returns the value of the '<em><b>Result Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Set</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Set</em>' attribute.
	 * @see #setResultSet(ArrayList)
	 * @see pgr.domain.generators.GeneratorsPackage#getExcelGenerator_ResultSet()
	 * @model dataType="pgr.datatypes.datatypesjavautil.ArrayList"
	 * @generated
	 */
	ArrayList getResultSet();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.ExcelGenerator#getResultSet <em>Result Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Set</em>' attribute.
	 * @see #getResultSet()
	 * @generated
	 */
	void setResultSet(ArrayList value);

	/**
	 * Returns the value of the '<em><b>Names Filters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Names Filters</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Names Filters</em>' attribute.
	 * @see #setNamesFilters(ArrayList)
	 * @see pgr.domain.generators.GeneratorsPackage#getExcelGenerator_NamesFilters()
	 * @model dataType="pgr.datatypes.datatypesjavautil.ArrayList"
	 * @generated
	 */
	ArrayList getNamesFilters();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.ExcelGenerator#getNamesFilters <em>Names Filters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Names Filters</em>' attribute.
	 * @see #getNamesFilters()
	 * @generated
	 */
	void setNamesFilters(ArrayList value);

	/**
	 * Returns the value of the '<em><b>Pos Filters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Filters</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Filters</em>' attribute.
	 * @see #setPosFilters(ArrayList)
	 * @see pgr.domain.generators.GeneratorsPackage#getExcelGenerator_PosFilters()
	 * @model dataType="pgr.datatypes.datatypesjavautil.ArrayList"
	 * @generated
	 */
	ArrayList getPosFilters();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.ExcelGenerator#getPosFilters <em>Pos Filters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Filters</em>' attribute.
	 * @see #getPosFilters()
	 * @generated
	 */
	void setPosFilters(ArrayList value);

	/**
	 * Returns the value of the '<em><b>Titles Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Titles Map</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titles Map</em>' attribute.
	 * @see #setTitlesMap(HashMap)
	 * @see pgr.domain.generators.GeneratorsPackage#getExcelGenerator_TitlesMap()
	 * @model dataType="pgr.datatypes.datatypesjavautil.HashMapStringElementoConsulta"
	 * @generated
	 */
	HashMap getTitlesMap();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.ExcelGenerator#getTitlesMap <em>Titles Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titles Map</em>' attribute.
	 * @see #getTitlesMap()
	 * @generated
	 */
	void setTitlesMap(HashMap value);

	/**
	 * Returns the value of the '<em><b>Set Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Result</em>' attribute.
	 * @see #setSetResult(ArrayList)
	 * @see pgr.domain.generators.GeneratorsPackage#getExcelGenerator_SetResult()
	 * @model dataType="pgr.datatypes.datatypesjavautil.ArrayList"
	 * @generated
	 */
	ArrayList getSetResult();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.ExcelGenerator#getSetResult <em>Set Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Result</em>' attribute.
	 * @see #getSetResult()
	 * @generated
	 */
	void setSetResult(ArrayList value);

	/**
	 * Returns the value of the '<em><b>List Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Fixed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Fixed</em>' attribute.
	 * @see #setListFixed(ArrayList)
	 * @see pgr.domain.generators.GeneratorsPackage#getExcelGenerator_ListFixed()
	 * @model dataType="pgr.datatypes.datatypesjavautil.ArrayList"
	 * @generated
	 */
	ArrayList getListFixed();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.ExcelGenerator#getListFixed <em>List Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Fixed</em>' attribute.
	 * @see #getListFixed()
	 * @generated
	 */
	void setListFixed(ArrayList value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see #setResult(Resultado)
	 * @see pgr.domain.generators.GeneratorsPackage#getExcelGenerator_Result()
	 * @model dataType="pgr.datatypes.datatypesqm.Resultado"
	 * @generated
	 */
	Resultado getResult();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.ExcelGenerator#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(Resultado value);

	/**
	 * Returns the value of the '<em><b>Tuples List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tuples List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tuples List</em>' attribute.
	 * @see #setTuplesList(ArrayList)
	 * @see pgr.domain.generators.GeneratorsPackage#getExcelGenerator_TuplesList()
	 * @model dataType="pgr.datatypes.datatypesjavautil.ArrayList"
	 * @generated
	 */
	ArrayList getTuplesList();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.ExcelGenerator#getTuplesList <em>Tuples List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tuples List</em>' attribute.
	 * @see #getTuplesList()
	 * @generated
	 */
	void setTuplesList(ArrayList value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' attribute.
	 * @see #setColumns(ArrayList)
	 * @see pgr.domain.generators.GeneratorsPackage#getExcelGenerator_Columns()
	 * @model dataType="pgr.datatypes.datatypesjavautil.ArrayList"
	 * @generated
	 */
	ArrayList getColumns();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.ExcelGenerator#getColumns <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columns</em>' attribute.
	 * @see #getColumns()
	 * @generated
	 */
	void setColumns(ArrayList value);

	/**
	 * Returns the value of the '<em><b>Columns Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns Names</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns Names</em>' attribute.
	 * @see #setColumnsNames(ArrayList)
	 * @see pgr.domain.generators.GeneratorsPackage#getExcelGenerator_ColumnsNames()
	 * @model dataType="pgr.datatypes.datatypesjavautil.ArrayList"
	 * @generated
	 */
	ArrayList getColumnsNames();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.ExcelGenerator#getColumnsNames <em>Columns Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columns Names</em>' attribute.
	 * @see #getColumnsNames()
	 * @generated
	 */
	void setColumnsNames(ArrayList value);

	/**
	 * Returns the value of the '<em><b>Columns Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns Index</em>' attribute.
	 * @see #setColumnsIndex(ArrayList)
	 * @see pgr.domain.generators.GeneratorsPackage#getExcelGenerator_ColumnsIndex()
	 * @model dataType="pgr.datatypes.datatypesjavautil.ArrayList"
	 * @generated
	 */
	ArrayList getColumnsIndex();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.ExcelGenerator#getColumnsIndex <em>Columns Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columns Index</em>' attribute.
	 * @see #getColumnsIndex()
	 * @generated
	 */
	void setColumnsIndex(ArrayList value);

	/**
	 * Returns the value of the '<em><b>Acc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acc</em>' attribute.
	 * @see #setAcc(int)
	 * @see pgr.domain.generators.GeneratorsPackage#getExcelGenerator_Acc()
	 * @model
	 * @generated
	 */
	int getAcc();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.ExcelGenerator#getAcc <em>Acc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acc</em>' attribute.
	 * @see #getAcc()
	 * @generated
	 */
	void setAcc(int value);

	/**
	 * Returns the value of the '<em><b>First Row Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Row Filter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Row Filter</em>' attribute.
	 * @see #setFirstRowFilter(int)
	 * @see pgr.domain.generators.GeneratorsPackage#getExcelGenerator_FirstRowFilter()
	 * @model
	 * @generated
	 */
	int getFirstRowFilter();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.ExcelGenerator#getFirstRowFilter <em>First Row Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Row Filter</em>' attribute.
	 * @see #getFirstRowFilter()
	 * @generated
	 */
	void setFirstRowFilter(int value);

	/**
	 * Returns the value of the '<em><b>Pos Row Ini Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Row Ini Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Row Ini Data</em>' attribute.
	 * @see #setPosRowIniData(int)
	 * @see pgr.domain.generators.GeneratorsPackage#getExcelGenerator_PosRowIniData()
	 * @model
	 * @generated
	 */
	int getPosRowIniData();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.ExcelGenerator#getPosRowIniData <em>Pos Row Ini Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Row Ini Data</em>' attribute.
	 * @see #getPosRowIniData()
	 * @generated
	 */
	void setPosRowIniData(int value);

	/**
	 * Returns the value of the '<em><b>Pos Cell Ini Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Cell Ini Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Cell Ini Data</em>' attribute.
	 * @see #setPosCellIniData(int)
	 * @see pgr.domain.generators.GeneratorsPackage#getExcelGenerator_PosCellIniData()
	 * @model
	 * @generated
	 */
	int getPosCellIniData();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.ExcelGenerator#getPosCellIniData <em>Pos Cell Ini Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Cell Ini Data</em>' attribute.
	 * @see #getPosCellIniData()
	 * @generated
	 */
	void setPosCellIniData(int value);

	/**
	 * Returns the value of the '<em><b>The Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link pgr.domain.Domain#getTheExcelGenerator <em>The Excel Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Domain</em>' container reference.
	 * @see #setTheDomain(Domain)
	 * @see pgr.domain.generators.GeneratorsPackage#getExcelGenerator_TheDomain()
	 * @see pgr.domain.Domain#getTheExcelGenerator
	 * @model opposite="theExcelGenerator"
	 * @generated
	 */
	Domain getTheDomain();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.ExcelGenerator#getTheDomain <em>The Domain</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Domain</em>' container reference.
	 * @see #getTheDomain()
	 * @generated
	 */
	void setTheDomain(Domain value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model listFilterDataType="pgr.datatypes.datatypesjavautil.ArrayList" posFiltersDataType="pgr.datatypes.datatypesjavautil.ArrayList" modelFactoryQMDataType="pgr.datatypes.datatypesqm.ModelFactory"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\t\r\n\r\n\t\t\tthis.absolutePath = absolutePath;\r\n\t\t\tthis.namesFilters = listFilter;\r\n\t\t\tthis.posFilters = posFilters;\r\n\t\t\tthis.posRowIniData = posRowIniData;\r\n\t\t\tthis.posCellIniData = posCellIniData;\r\n\t\t\tthis.queryString = queryString;\r\n\t\t\tfirstRowFilter = 2;\r\n\t\t\t\r\n\t\t\ttitlesMap = new HashMap<String, Integer>();\r\n\t\t\t\r\n\t\t\ttuplesList = new ArrayList<String>();\r\n\t\t\tcolumns  =    new ArrayList<String>();\r\n\t\t\tcolumnsNames = new ArrayList<String>();\r\n\t\t\tcolumnsIndex = new ArrayList<Integer>();\r\n\t\t\t\r\n\t\t\tthis.modelFactoryQM = modelFactoryQM;\r\n\t\t\t\r\n\t\t\tresult = modelFactoryQM.getFactoryModeloConsultas().getListModeloConsulta().get(0).getListResultado().get(0);\r\n\t\t\t\r\n\t\t\tworkbook = readFile();\r\n\t\t\t\r\n\t\t\tcreateSheetQuery();\r\n\t\t\r\n\t'"
	 * @generated
	 */
	void ExcelGenerator(String absolutePath, ArrayList listFilter, ArrayList posFilters, ModelFactory modelFactoryQM, int posRowIniData, int posCellIniData, String queryString);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model listFilterDataType="pgr.datatypes.datatypesjavautil.ArrayList" posFiltersDataType="pgr.datatypes.datatypesjavautil.ArrayList"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\t\r\n\t\t\r\n\t\t\t\tthis.absolutePath = absolutePath;\r\n\t\t\t\tthis.namesFilters=listFilter;\r\n\t\t\t\tthis.posFilters = posFilters;\r\n\t\t\t\tposCellIniData = ( (pgr.domain.util.impl.CoordinateImpl)posFilters.get( posFilters.size()-1)).getY();\r\n\t\t\t\tposRowIniData  = ( (pgr.domain.util.impl.CoordinateImpl)posFilters.get( posFilters.size()-1)).getX();\r\n\t\t\t\tthis.posFilters.remove(posFilters.size()-1);\r\n\t\t\t\t\r\n\t\t\t\tcolumnsNames = new ArrayList<String>();\r\n\t\t\t\tcolumnsIndex = new ArrayList<Integer>();\r\n\t\t\t\ttuplesList = new ArrayList<String>();\r\n\t\t\t\ttitlesMap = new HashMap<String, Integer>();\r\n\t\t\t\tfirstRowFilter = 2;\r\n\t\t\t\r\n\t'"
	 * @generated
	 */
	void ExcelGenerator(String absolutePath, ArrayList listFilter, ArrayList posFilters);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\t\r\n\t\t\tsheet = workbook.getSheetAt(0);\r\n\t\t\t\r\n\t\t\tif(workbook.getSheet(\"Datos\")==null){\r\n\t\t\t\tnewDataSheet = workbook.createSheet(\"Datos\");\r\n\t\t\t}else{\r\n\t\t\t\tworkbook.removeSheetAt(workbook.getSheetIndex(\"Datos\"));\r\n\t\t\t\tnewDataSheet = workbook.createSheet(\"Datos\");\r\n\t\t\t}\r\n\t\t\t\r\n\t\t\tresultSet = getResulSet(dataSheet);\r\n\t\t\tcreateNames();\r\n\t\t\tinit();\r\n\t\t\tworkbook.setActiveSheet(0);\r\n\t\t\tsheet.showInPane(0, 0);\r\n\t\t\tsaveExcel();\r\n\t\t\texecute(namesFilters, titlesMap, acc, posRowIniData, posCellIniData);\r\n\t\t\tworkbook.setSheetHidden(workbook.getSheetIndex(\"Query\"), true);\r\n\t\t\tworkbook.setSheetHidden(workbook.getSheetIndex(\"ResultSet\"), true);\r\n\t\t\tworkbook.setSheetHidden(workbook.getSheetIndex(\"Datos\"), true);\r\n\t\t\tworkbook.setSheetHidden(workbook.getSheetIndex(\"Columns\"), true);\r\n\t\t\tsaveExcel();\r\n\t\t\r\n\t'"
	 * @generated
	 */
	void createRelations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\ttitlesMap = getTitles(resultSet);\r\n\t\tsetResult = removeDuplicateValues(resultSet);\r\n\r\n\t\tString cadena = (String) namesFilters.get(0);\r\n\t\tInteger n = (Integer) titlesMap.get(cadena);\r\n\t\tlistFixed = getArrayListFromSet((Set) setResult.get(n));\r\n\t\t\r\n\t\tcreateListBox(listFixed, sheet, ((pgr.domain.util.impl.CoordinateImpl) posFilters.get(0)).getX(),\r\n\t\t\t\t((pgr.domain.util.impl.CoordinateImpl) posFilters.get(0)).getY());\r\n\r\n\t\t// Se crean las dependencias de los filtros\r\n\t\tArrayList<HashMap<String, Set<String>>> listDependenceMap = createDependence(resultSet, titlesMap,\r\n\t\t\t\tnamesFilters);\r\n\r\n\t\tacc = 1;\r\n\r\n\t\t// Se escribe en la sheet para utilizar los datos dentro del workbook\r\n\t\tfor (int i = 0; i < listDependenceMap.size(); i++) {\r\n\t\t\tbuildDataSheet(newDataSheet, listDependenceMap.get(i), acc);\r\n\t\t\tacc += listDependenceMap.get(i).size();\r\n\t\t}'"
	 * @generated
	 */
	void init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model indexColumDataType="pgr.datatypes.datatypesjavautil.ArrayList"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\t\r\n\t\t\r\n\t\t\t\t\r\n\t\t\t\t//dataSheet = workbook.createSheet();\r\n\t\t\t\t\t\r\n\t\tgestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado element;\r\n\t\t\t\t\r\n\t\t\t\tfor(int i=0;i<result.getListResultElement().size();i++){\r\n\t\t\t\t\telement = (gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado) result.getListResultElement().get(i);\r\n\t\t\t\t\tString s = getAtributtes(element);\r\n\t\t\t\t\texploreResult(element.getListElementoModeloResultado(),s);\t\r\n\t\t\t\t}\r\n\t\t\t\t\r\n\t\t\t\tdataSheet = workbook.createSheet();\r\n\t\t\t\t\r\n\t\t\t\t\r\n\t\t\t\tfor(int i=0;i<tuplesList.size();i++){\r\n\t\t\t\t\tString s= (String) tuplesList.get(i);\r\n\t\t\t\t\torg.apache.poi.ss.usermodel.Row row = dataSheet.createRow(i);\r\n\t\t\t\t\t\r\n\t\t\t\t\tString tuplas[] = s.split(\",\");\r\n\t\t\t\t\t\r\n\t\t\t\t\tfor(int j=0;j<indexColum.size();j++){\r\n\t\t\t\t\t\torg.apache.poi.ss.usermodel.Cell c = row.createCell(j);\r\n\t\t\t\t\t\tc.setCellValue(  tuplas[ (int) indexColum.get(i) ] );\r\n\t\t\t\t\t}\r\n\t\t\t\t}\r\n\t\t\t\t\r\n\t\t\t\tsaveExcel();\r\n\t\t\t\r\n\t'"
	 * @generated
	 */
	void initDataSheet(ArrayList indexColum);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model rsDataType="pgr.datatypes.ResultSet"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\t\r\n\t\ttry {\r\n\t\t\t\r\n\t\t\tjava.sql.ResultSetMetaData data = rs.getMetaData();\r\n\t\t\t\r\n\t\t\tint column = data.getColumnCount();\t\r\n\t\t\t\r\n\t\t\tfor(int i=1;i<=column ;i++){\r\n\t\t\t\tString columnName = data.getTableName(i)+\".\"+data.getColumnName(i);\r\n\t\t\t\tcolumns.add(columnName);\r\n\t\t\t}\r\n\t\t\t\r\n\t\t\tcolumnSheet = workbook.getSheet(\"Columns\");\r\n\t\t\tif(columnSheet == null)\r\n\t\t\t\tcolumnSheet = workbook.createSheet(\"Columns\");\r\n\t\t\t\r\n\t\t\tcreateTable(columns, 1, columnSheet);\r\n\t\t\tsaveExcel();\r\n\t\t\t\r\n\t\t} catch (java.sql.SQLException e) {\r\n\t\t\t// TODO Auto-generated catch block\r\n\t\t\te.printStackTrace();\r\n\t\t}\r\n\t'"
	 * @generated
	 */
	void writeFileColumns(ResultSet rs);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model columnsDataType="pgr.datatypes.datatypesjavautil.ArrayList" sheetDataType="pgr.datatypes.datatypeapachepoi.XSSFSheet"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\t\r\n\t\torg.apache.poi.xssf.usermodel.XSSFTable table =  sheet.createTable();\r\n\t\t\r\n\t\torg.openxmlformats.schemas.spreadsheetml.x2006.main.CTTable cttable = table.getCTTable();\r\n\t\t\r\n\t\torg.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleInfo table_style = cttable.addNewTableStyleInfo();\r\n\t    table_style.setName(\"TableStyleMedium9\"); \r\n\t    table_style.setShowColumnStripes(false); //showColumnStripes=0\r\n\t    table_style.setShowRowStripes(true); //showRowStripes=1\r\n\t\t\r\n\t    /* Define the data range including headers \052/\r\n\t    org.apache.poi.hssf.util.AreaReference my_data_range = \r\n\t    \t\tnew org.apache.poi.hssf.util.AreaReference(new org.apache.poi.hssf.util.CellReference(0, 0), \r\n\t    \t\t\t\t\t\t\t\tnew org.apache.poi.hssf.util.CellReference(size, columns.size()-1));\r\n\t    \r\n\t    /* Set Range to the Table \052/ \r\n\t    cttable.setRef(my_data_range.formatAsString());\r\n\t    cttable.setDisplayName(sheet.getSheetName());      /* this is the display name of the table \052/\r\n\t    cttable.setName(sheet.getSheetName());    /* This maps to \"displayName\" attribute in <table>, OOXML \052/            \r\n\t    cttable.setId( (long) (workbook.getSheetIndex(sheet)+1) ); //id attribute against table as long value\r\n\t    \r\n\t    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumns columnsTable = cttable.addNewTableColumns();\r\n\t    columnsTable.setCount(columns.size()); //define number of columns\r\n\t    \r\n\t    /* Define Header Information for the Table \052/\r\n\t    org.apache.poi.xssf.usermodel.XSSFRow row = sheet.createRow(0);\r\n\t    XSSFCell cell;\r\n\t    \t    \r\n\t    for (int i = 0; i < columns.size(); i++) {\r\n\t    \torg.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn column = columnsTable.addNewTableColumn();   \r\n\t    \tcolumn.setName(\"Column\");      \r\n\t        column.setId(i+1);\r\n\t        cell = row.createCell(i);\r\n            cell.setCellValue((String)columns.get(i));\r\n\t    }\r\n\t'"
	 * @generated
	 */
	void createTable(ArrayList columns, int size, XSSFSheet sheet);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model resultSetDataType="pgr.datatypes.ResultSet"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='                                                                     try {\r\n\t\t\t\t\tworkbook = readFile();\r\n\t\t\t\t\tcolumnSheet = workbook.getSheet(\"Columns\");\r\n\t\t\t\t\torg.apache.poi.xssf.usermodel.XSSFRow row = columnSheet.getRow(1);\r\n\t\t\t\t\tXSSFCell cell;\r\n\t\t\t\t\tHashMap<String, int[]> map = new HashMap<String, int[]>();\r\n\t\t\r\n\t\t\t\t\tfor (int i = 0; i <= row.getLastCellNum(); i++) {\r\n\t\t\t\t\t\tcell = row.getCell(i);\r\n\t\t\r\n\t\t\t\t\t\tif (cell != null) {\r\n\t\t\t\t\t\t\tString value = getCellValue(cell);\r\n\t\t\t\t\t\t\tif (value != \"\") {\r\n\t\t\t\t\t\t\t\tint a[] = new int[100];\r\n\t\t\r\n\t\t\t\t\t\t\t\tfor (int j = 0; j < 100; j++)\r\n\t\t\t\t\t\t\t\t\ta[j] = -1;\r\n\t\t\r\n\t\t\t\t\t\t\t\tif (value.contains(\".\")) {\r\n\t\t\t\t\t\t\t\t\tString ss[] = value.split(\"\\\\.\");\r\n\t\t\t\t\t\t\t\t\tString name = ss[0];\r\n\t\t\t\t\t\t\t\t\tint order = Integer.parseInt(ss[1]);\r\n\t\t\r\n\t\t\t\t\t\t\t\t\tif (map.containsKey(name)) {\r\n\t\t\t\t\t\t\t\t\t\ta = map.get(name);\r\n\t\t\t\t\t\t\t\t\t\ta[order - 1] = i;\r\n\t\t\t\t\t\t\t\t\t\tmap.put(name, a);\r\n\t\t\t\t\t\t\t\t\t} else {\r\n\t\t\t\t\t\t\t\t\t\ta[order - 1] = i;\r\n\t\t\t\t\t\t\t\t\t\tmap.put(name, a);\r\n\t\t\r\n\t\t\t\t\t\t\t\t\t}\r\n\t\t\r\n\t\t\t\t\t\t\t\t} else {\r\n\t\t\t\t\t\t\t\t\ta[0] = i;\r\n\t\t\t\t\t\t\t\t\tmap.put(value, a);\r\n\t\t\t\t\t\t\t\t}\r\n\t\t\t\t\t\t\t}\r\n\t\t\t\t\t\t}\r\n\t\t\t\t\t}\r\n\t\t\r\n\t\t\t\t\tint size = 0;\r\n\t\t\t\t\tfor (java.util.Map.Entry<String, int[]> entry : map.entrySet()) {\r\n\t\t\t\t\t\tString name = entry.getKey();\r\n\t\t\t\t\t\tcolumnsNames.add(name);\r\n\t\t\t\t\t\tsize++;\r\n\t\t\t\t\t}\r\n\t\t\r\n\t\t\t\t\tjava.sql.ResultSetMetaData resultSetMetaData = resultSet.getMetaData();\r\n\t\t\t\t\tint column = resultSetMetaData.getColumnCount();\r\n\t\t\r\n\t\t\t\t\twhile (resultSet.next()) {\r\n\t\t\t\t\t\tString string = \"\";\r\n\t\t\r\n\t\t\t\t\t\tfor (int i = 1; i <= column; i++) {\r\n\t\t\t\t\t\t\tif (i == column)\r\n\t\t\t\t\t\t\t\tstring += resultSet.getString(i);\r\n\t\t\t\t\t\t\telse\r\n\t\t\t\t\t\t\t\tstring += resultSet.getString(i) + \",\";\r\n\t\t\t\t\t\t}\r\n\t\t\t\t\t\ttuplesList.add(string);\r\n\t\t\t\t\t}\r\n\t\t\r\n\t\t\t\t\tif (namesFilters.size() == 0) {\r\n\t\t\t\t\t\tdataSheet = workbook.getSheetAt(0);\r\n\t\t\r\n\t\t\t\t\t\tfor (int i = 0, rowIndex = posRowIniData; i < tuplesList.size(); i++, rowIndex++) {\r\n\t\t\r\n\t\t\t\t\t\t\tString s = (String) tuplesList.get(i);\r\n\t\t\t\t\t\t\torg.apache.poi.xssf.usermodel.XSSFRow r = dataSheet.getRow(rowIndex);\r\n\t\t\r\n\t\t\t\t\t\t\tif (r == null)\r\n\t\t\t\t\t\t\t\tr = dataSheet.createRow(rowIndex);\r\n\t\t\t\t\t\t\tString tuplas[] = s.split(\",\");\r\n\t\t\t\t\t\t\tint cellIndex = posCellIniData;\r\n\t\t\r\n\t\t\t\t\t\t\tfor (java.util.Map.Entry<String, int[]> entry : map.entrySet()) {\r\n\t\t\t\t\t\t\t\tint orders[] = entry.getValue();\r\n\t\t\t\t\t\t\t\tString concat = \"\";\r\n\t\t\r\n\t\t\t\t\t\t\t\tfor (int k = 0; k < orders.length && orders[k] != -1; k++) {\r\n\t\t\t\t\t\t\t\t\tconcat += tuplas[orders[k]] + \" \";\r\n\t\t\t\t\t\t\t\t}\r\n\t\t\t\t\t\t\t\torg.apache.poi.xssf.usermodel.XSSFCell c = r.createCell(cellIndex);\r\n\t\t\t\t\t\t\t\tc.setCellValue(concat.substring(0, concat.length() - 1));\r\n\t\t\t\t\t\t\t\tcellIndex++;\r\n\t\t\t\t\t\t\t}\r\n\t\t\t\t\t\t}\r\n\t\t\r\n\t\t\t\t\t} else {\r\n\t\t\r\n\t\t\t\t\t\tworkbook.setSheetHidden(workbook.getSheetIndex(\"Columns\"), true);\r\n\t\t\t\t\t\tif (workbook.getSheet(\"ResultSet\") == null)\r\n\t\t\t\t\t\t\tdataSheet = workbook.createSheet(\"ResultSet\");\r\n\t\t\t\t\t\telse {\r\n\t\t\t\t\t\t\tworkbook.removeSheetAt(workbook.getSheetIndex(\"ResultSet\"));\r\n\t\t\t\t\t\t\tdataSheet = workbook.createSheet(\"ResultSet\");\r\n\t\t\t\t\t\t}\r\n\t\t\r\n\t\t\t\t\t\tcreateTable(columnsNames, tuplesList.size(), dataSheet);\r\n\t\t\r\n\t\t\t\t\t\tfor (int i = 0; i < tuplesList.size(); i++) {\r\n\t\t\r\n\t\t\t\t\t\t\tString s = (String) tuplesList.get(i);\r\n\t\t\t\t\t\t\torg.apache.poi.xssf.usermodel.XSSFRow r = dataSheet.createRow(i + 1);\r\n\t\t\r\n\t\t\t\t\t\t\tString tuplas[] = s.split(\",\");\r\n\t\t\r\n\t\t\t\t\t\t\tint j = 0;\r\n\t\t\t\t\t\t\tfor (java.util.Map.Entry<String, int[]> entry : map.entrySet()) {\r\n\t\t\r\n\t\t\t\t\t\t\t\tint orders[] = entry.getValue();\r\n\t\t\r\n\t\t\t\t\t\t\t\tString concat = \"\";\r\n\t\t\t\t\t\t\t\tfor (int k = 0; k < orders.length && orders[k] != -1; k++) {\r\n\t\t\t\t\t\t\t\t\tconcat += tuplas[orders[k]] + \" \";\r\n\t\t\t\t\t\t\t\t}\r\n\t\t\t\t\t\t\t\torg.apache.poi.xssf.usermodel.XSSFCell c = r.createCell(j);\r\n\t\t\t\t\t\t\t\tc.setCellValue(concat.substring(0, concat.length() - 1));\r\n\t\t\t\t\t\t\t\tj++;\r\n\t\t\t\t\t\t\t}\r\n\t\t\t\t\t\t}\r\n\t\t\t\t\t}\r\n\t\t\r\n\t\t\t\t\tworkbook.setSheetHidden(workbook.getSheetIndex(\"Columns\"), true);\r\n\t\t\t\t\tworkbook.setSheetHidden(workbook.getSheetIndex(\"Query\"), true);\r\n\t\t\t\t\tsaveExcel();\r\n\t\t\t\t} catch (java.sql.SQLException e) {\r\n\t\t\t\t\t// TODO Auto-generated catch block\r\n\t\t\t\t\te.printStackTrace();\r\n\t\t\t\t}\r\n\t\t\t\r\n\t\t\t\r\n\t'"
	 * @generated
	 */
	void createDataSheet(ResultSet resultSet);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model elementResultListDataType="pgr.datatypes.EList" elementResultListMany="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\t\r\n\t\t\r\n\t\t\t\t\r\n\t\t\t\tif(elementResultList.size() == 0){\r\n\t\t\t\t\ttuplesList.add(tuple);\r\n\t\t\t\t\treturn;\r\n\t\t\t\t}\r\n\t\t\t\t\r\n\t\t\t\tgestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado element;\r\n\t\t\t\tfor(int i=0;i < elementResultList.size();i++){\r\n\t\t\t\t\telement = (gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado) elementResultList.get(i);\r\n\t\t\t\t\tString s = getAtributtes(element);\r\n\t\t\t\t\texploreResult(element.getListElementoModeloResultado() ,tuple+ \",\" +s);\r\n\t\t\t\t}\r\n\t\t\t\r\n\t'"
	 * @generated
	 */
	void exploreResult(EList elementResultList, String tuple);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model listFilterDataType="pgr.datatypes.datatypesjavautil.ArrayList" titlesMapDataType="pgr.datatypes.datatypesjavautil.HashMapStringElementoConsulta"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\t\r\n\t\t// Se escriben las formulas de indirecto en el Excel\r\n\t\tsetIndirect();\r\n\r\n\t\t// Se escribe la formula de contar valores del resultset en el Excel\r\n\t\tcountFormula(acc + 1, 0);\r\n\r\n\t\t// Se escribe la formula que actualiza los datos en la tabla\r\n\t\ttheFormula(posRowIniData+1, posCellIniData, acc + 1, 0, (int) titlesMap.get(listFilter.get(listFilter.size() - 1)), ((ArrayList<String> )resultSet.get(0) ).size(), resultSet.size());\r\n\t'"
	 * @generated
	 */
	void execute(ArrayList listFilter, HashMap titlesMap, int acc, int posRowIniData, int posCellIniData);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="pgr.datatypes.datatypeapachepoi.XSSFWorkbook"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\t// Se lee el archivo\r\n\t\ttry{\r\n\t\t\tjava.io.FileInputStream file = new java.io.FileInputStream(new java.io.File(absolutePath));\r\n\t\t\tXSSFWorkbook workbook = new XSSFWorkbook(file);\r\n\t\t\treturn workbook;\r\n\t\t}catch (java.io.FileNotFoundException e) {\r\n\t\t\t// TODO Auto-generated catch block\r\n\t\t\te.printStackTrace();\r\n\t\t} catch (java.io.IOException e) {\r\n\t\t\t// TODO Auto-generated catch block\r\n\t\t\te.printStackTrace();\r\n\t\t}\r\n\t\treturn null;\r\n\t'"
	 * @generated
	 */
	XSSFWorkbook readFile();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\t// Se escribe el archivo con las modificaciones\r\n\t\ttry{\r\n\t\t\tjava.io.FileOutputStream fileOutputStream;\r\n\t\t\tfileOutputStream = new java.io.FileOutputStream(absolutePath);\r\n\t\t\tworkbook.write(fileOutputStream);\r\n\t\t\tfileOutputStream.close();\r\n\t\t}catch (java.io.FileNotFoundException e) {\r\n\t\t\t// TODO Auto-generated catch block\r\n\t\t\te.printStackTrace();\r\n\t\t} catch (java.io.IOException e) {\r\n\t\t\t// TODO Auto-generated catch block\r\n\t\t\te.printStackTrace();\r\n\t\t}\r\n\t'"
	 * @generated
	 */
	void saveExcel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\t// Se borran los nombres del workbook para actualizarlos\r\n\t\tdeleteNames(workbook);\r\n\r\n\t\t// Se crean los nombres en el workbook de las columnas del result set\r\n\t\tnameTableToNameRange(dataSheet, (ArrayList<String>)resultSet.get(0));\r\n\t'"
	 * @generated
	 */
	void createNames();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\t\r\n\t\t// Se obtienen las sheet necesarias para el proceso\r\n\t\tif (workbook.getSheet(\"Datos\") == null) {\r\n\t\t\tnewDataSheet = workbook.createSheet(\"Datos\");\r\n\t\t} else {\r\n\t\t\tworkbook.removeSheetAt(workbook.getSheetIndex(\"Datos\"));\r\n\t\t\tnewDataSheet = workbook.createSheet(\"Datos\");\r\n\t\t}\r\n\t\t\r\n\t\tint numSheet = workbook.getNumberOfSheets();\r\n\t\tdataSheet = workbook.getSheetAt(numSheet - 2);\r\n\t\tsheet = workbook.getSheetAt(0);\r\n\t'"
	 * @generated
	 */
	void readSheet();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\treturn org.apache.poi.hssf.util.CellReference.convertNumToColString(col);\r\n\t'"
	 * @generated
	 */
	String getNumToCol(int col);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="pgr.datatypes.datatypesjavautil.ArrayList" sheetDataType="pgr.datatypes.datatypeapachepoi.XSSFSheet"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\r\n\t\tArrayList<ArrayList<String>> resultSet = new ArrayList<>();\r\n\r\n\t\tjava.util.Iterator<org.apache.poi.ss.usermodel.Row> rowIterator = sheet.iterator();\r\n\t\torg.apache.poi.ss.usermodel.Row row;\r\n\t\t\r\n\t\twhile (rowIterator.hasNext()) {\r\n\t\t\trow = rowIterator.next();\r\n\r\n\t\t\tjava.util.Iterator<org.apache.poi.ss.usermodel.Cell> cellIterator = row.cellIterator();\r\n\t\t\torg.apache.poi.ss.usermodel.Cell celda;\r\n\t\t\tArrayList<String> tupla = new ArrayList<>();\r\n\t\t\twhile (cellIterator.hasNext()) {\r\n\t\t\t\tcelda = cellIterator.next();\r\n\t\t\t\tcelda.setCellType(org.apache.poi.ss.usermodel.Cell.CELL_TYPE_STRING);\r\n\t\t\t\ttupla.add(celda.getStringCellValue());\r\n\t\t\t}\r\n\t\t\tresultSet.add(tupla);\r\n\t\t}\r\n\r\n\t\treturn resultSet;\r\n\t'"
	 * @generated
	 */
	ArrayList getResulSet(XSSFSheet sheet);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="pgr.datatypes.datatypesjavautil.Set" resultSetDataType="pgr.datatypes.datatypesjavautil.ArrayList"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tSet<String> setColumn = new java.util.HashSet<>();\r\n\t\tfor (int i = 1; i < resultSet.size(); i++) {\r\n\t\t\tsetColumn.add( ( (ArrayList<String> )resultSet.get(i) ).get(column));\r\n\t\t}\r\n\t\treturn setColumn;\r\n\t'"
	 * @generated
	 */
	Set getSetColum(ArrayList resultSet, int column);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="pgr.datatypes.datatypesjavautil.HashMapStringElementoConsulta" resultSetDataType="pgr.datatypes.datatypesjavautil.ArrayList"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\t\r\n\t\t\r\n\t\t\t\tHashMap<String, Set<String>> mapColumn = new HashMap<>();\r\n\t\t\t\tfor (int i = 1; i < resultSet.size(); i++) {\r\n\t\t\t\t\tString key = ((ArrayList<String>) resultSet.get(i)).get(columnSource);\r\n\t\t\t\t\tString value = ((ArrayList<String>) resultSet.get(i)).get(columnTarget);\r\n\t\t\t\t\tif (mapColumn.get(key) == null) {\r\n\t\t\t\t\t\tSet<String> name = new java.util.HashSet<>();\r\n\t\t\t\t\t\tname.add(value);\r\n\t\t\t\t\t\tmapColumn.put(key, name);\r\n\t\t\t\t\t} else {\r\n\t\t\t\t\t\tmapColumn.get(key).add(value);\r\n\t\t\t\t\t}\r\n\t\t\t\t}\r\n\t\t\t\treturn mapColumn;\r\n\t\t\t\r\n\t'"
	 * @generated
	 */
	HashMap getMapOfColumnByColumn(ArrayList resultSet, int columnSource, int columnTarget);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model comboNamesDataType="pgr.datatypes.datatypesjavautil.ArrayList" sheetDataType="pgr.datatypes.datatypeapachepoi.XSSFSheet"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.apache.poi.xssf.usermodel.XSSFWorkbook workbook = (XSSFWorkbook) sheet.getWorkbook();\r\n\t\torg.apache.poi.ss.usermodel.Name name = null;\r\n\r\n\t\tname = workbook.createName();\r\n\t\tString replaceAll = ((String) namesFilters.get(0) + \"s\").replaceAll(\" \", \"_\");\r\n\t\tname.setNameName(replaceAll);\r\n\t\tString colIni = getNumToCol(0);\r\n\t\tXSSFSheet sheet2 = workbook.getSheet(\"Datos\");\r\n\t\torg.apache.poi.ss.usermodel.Row rowS = sheet2.createRow(0);\r\n\t\tint k = 0;\r\n\t\tfor (; k < comboNames.size(); k++) {\r\n\t\t\torg.apache.poi.ss.usermodel.Cell cellS = rowS.createCell(k);\r\n\t\t\tcellS.setCellValue((String)comboNames.get(k));\r\n\t\t}\r\n\t\tString colFin = getNumToCol(k - 1);\r\n\r\n\t\tname.setRefersToFormula(\r\n\t\t\t\tsheet2.getSheetName() + \"!$\" + colIni + \"$\" + 1 + \":$\" + colFin + \"$\" + 1);\r\n\t\tSystem.out.println(\tsheet2.getSheetName() + \"!$\" + colIni + \"$\" + 1 + \":$\" + colFin + \"$\" + 1);\r\n\t\torg.apache.poi.ss.usermodel.DataValidationHelper helper = sheet.getDataValidationHelper();\r\n\t\torg.apache.poi.ss.usermodel.DataValidationConstraint constraint = null;\r\n\t\torg.apache.poi.ss.usermodel.DataValidation validation = null;\r\n\t\t\r\n\t\tconstraint = helper.createFormulaListConstraint(replaceAll);\r\n\t\tSystem.out.println(\"\"+(String) namesFilters.get(0)+\"s\");\r\n\t\tvalidation = helper.createValidation(constraint,\r\n\t\t\t\tnew org.apache.poi.ss.util.CellRangeAddressList(\r\n\t\t\t\t\t\t((pgr.domain.util.impl.CoordinateImpl) posFilters.get(0)).getX(),\r\n\t\t\t\t\t\t((pgr.domain.util.impl.CoordinateImpl) posFilters.get(0)).getX(),\r\n\t\t\t\t\t\t((pgr.domain.util.impl.CoordinateImpl) posFilters.get(0)).getY(),\r\n\t\t\t\t\t\t((pgr.domain.util.impl.CoordinateImpl) posFilters.get(0)).getY()));\r\n\t\tsheet.addValidationData(validation);\r\n\t'"
	 * @generated
	 */
	void createListBox(ArrayList comboNames, XSSFSheet sheet, int row, int col);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model sheetDataType="pgr.datatypes.datatypeapachepoi.XSSFSheet" mpDataType="pgr.datatypes.datatypesjavautil.HashMapStringElementoConsulta"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\torg.apache.poi.xssf.usermodel.XSSFRow row = null;\r\n\t\tXSSFCell cell = null;\r\n\t\torg.apache.poi.ss.usermodel.Name name = null;\r\n\t\tint i = rowN;\r\n\t\t\r\n\t\tHashMap<String, Set<String>> map = mp;\r\n\t\tjava.util.Iterator<String> it = map.keySet().iterator();\r\n\t\t\r\n\t\twhile (it.hasNext()) {\r\n\t\t\tint j = 0; \r\n\t\t\tString key = (String) it.next();\r\n\t\t\trow = sheet.createRow(i);\r\n\t\t\tfor (String value : map.get(key)) {\r\n\t\t\t\tcell = row.createCell(j);\r\n\t\t\t\tcell.setCellValue(value);\r\n\t\t\t\tj++;\r\n\t\t\t}\r\n\t\t\tname = sheet.getWorkbook().createName();\r\n\t\t\tname.setNameName(key.replaceAll(\" \", \"_\"));\r\n\t\t\tString colIni = getNumToCol(0);\r\n\t\t\tString colFin = getNumToCol(j - 1);\r\n\t\t\tname.setRefersToFormula(\r\n\t\t\t\t\tsheet.getSheetName() + \"!$\" + colIni + \"$\" + (i + 1) + \":$\" + colFin + \"$\" + (i + 1));\r\n\t\t\ti++;\r\n\t\t}\r\n\t'"
	 * @generated
	 */
	void buildDataSheet(XSSFSheet sheet, HashMap mp, int rowN);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\t\r\n\t\t\r\n\t\t\t\torg.apache.poi.ss.usermodel.DataValidationHelper helper = sheet.getDataValidationHelper();\r\n\t\t\t\torg.apache.poi.ss.usermodel.DataValidationConstraint constraint = null;\r\n\t\t\t\torg.apache.poi.ss.usermodel.DataValidation validation = null;\r\n\t\t\t\tfor (int i = 1; i < posFilters.size(); i++) {\r\n\t\t\t\t\tString cell = getNumToCol(  ((pgr.domain.util.impl.CoordinateImpl)posFilters.get(i-1)).getY());\r\n\t\t\t\t\tconstraint = helper.createFormulaListConstraint(\r\n\t\t\t\t\t\t\t\"INDIRECT(SUBSTITUTE(\" + sheet.getSheetName() + \"!$\" + cell + \"$\" +   ( ((pgr.domain.util.impl.CoordinateImpl)posFilters.get(i-1)).getX() + 1) + \",\\\" \\\", \\\"_\\\"))\");\t\t\t\r\n\t\t\t\t\tvalidation = helper.createValidation(constraint, new org.apache.poi.ss.util.CellRangeAddressList(  ((pgr.domain.util.impl.CoordinateImpl) posFilters.get(i)).getX(),\r\n\t\t\t\t\t\t\t((pgr.domain.util.impl.CoordinateImpl)posFilters.get(i)).getX(),((pgr.domain.util.impl.CoordinateImpl) posFilters.get(i)).getY(), ((pgr.domain.util.impl.CoordinateImpl) posFilters.get(i)).getY()));\r\n\t\t\t\t\tsheet.addValidationData(validation);\r\n\t\t\t\t}\r\n\t\t\t\r\n\t'"
	 * @generated
	 */
	void setIndirect();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model workbookDataType="pgr.datatypes.datatypeapachepoi.XSSFWorkbook"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tint n = workbook.getNumberOfNames();\r\n\t\twhile (n != 0) {\r\n\t\t\tString del = workbook.getNameAt(0).getNameName();\r\n\t\t\tworkbook.removeName(del);\r\n\t\t\tn--;\r\n\t\t}\r\n\t'"
	 * @generated
	 */
	void deleteNames(XSSFWorkbook workbook);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model sheetDataType="pgr.datatypes.datatypeapachepoi.XSSFSheet" namesDataType="pgr.datatypes.datatypesjavautil.ArrayList"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tXSSFWorkbook workbook = (XSSFWorkbook) sheet.getWorkbook();\r\n\t\torg.apache.poi.ss.usermodel.Name name = null;\r\n\t\tfor (int i = 0; i < names.size(); i++) {\r\n\t\t\tname = workbook.createName();\r\n\t\t\tname.setNameName( ( (String) names.get(i)).replaceAll(\" \", \"_\"));\r\n\t\t\tname.setRefersToFormula(\"ResultSet[\" + names.get(i) + \"]\");\r\n\t\t}\r\n\t'"
	 * @generated
	 */
	void nameTableToNameRange(XSSFSheet sheet, ArrayList names);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\t\r\n\t\t\r\n\t\t\t\torg.apache.poi.xssf.usermodel.XSSFRow row = newDataSheet.createRow(targetRow);\r\n\t\t\t\tXSSFCell cell = row.createCell(targetCell);\r\n\t\t\t\tString formula = \"COUNTIFS(ResultSet[\"+namesFilters.get(0)+\"],\"+sheet.getSheetName()+\"!\"+getNumToCol(  ((pgr.domain.util.impl.CoordinateImpl)posFilters.get(0)).getY())+(  ((pgr.domain.util.impl.CoordinateImpl)posFilters.get(0)).getX()+1);\r\n\t\t\t\tfor(int i = 1; i < namesFilters.size();i++){\r\n\t\t\t\t\tformula+=\",ResultSet[\"+namesFilters.get(i)+\"],\"+sheet.getSheetName()+\"!\"+getNumToCol( ((pgr.domain.util.impl.CoordinateImpl)posFilters.get(i)).getY())+(((pgr.domain.util.impl.CoordinateImpl)posFilters.get(i)).getX()+1);\r\n\t\t\t\t}\r\n\t\t\t\tformula+=\")\";\r\n\t\t\t\tcell.setCellFormula(formula);\r\n\t\t\t\r\n\t'"
	 * @generated
	 */
	void countFormula(int targetRow, int targetCell);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\r\n\t\r\n\t\t\t\r\n\t\t\tString sheet1 = sheet.getSheetName();\r\n\t\t\tString sheet2 = dataSheet.getSheetName();\r\n\t\t\t\r\n\t\t\tfor (int i = 0; i < sizeY; i++) {\r\n\t\t\t\tfor (int j = 0; j < sizeX; j++) {\r\n\t\t\t\t\tString filas = \"ROWS(\" + sheet1 + \"!\" + getNumToCol(targetCell + j) + \"$\" + targetRow + \":\" + sheet1 + \"!\"\r\n\t\t\t\t\t\t+ getNumToCol(targetCell + j) + (targetRow + i) + \")\";\r\n\t\t\t\tint n = namesFilters.size();\r\n\t\t\t\tString constraint =\"((\"+ ((String)namesFilters.get(n-1)).replaceAll(\" \", \"_\")+\"=$\"+getNumToCol( ((pgr.domain.util.impl.CoordinateImpl)posFilters.get(n-1)).getY())+\"$\"+(((pgr.domain.util.impl.CoordinateImpl)posFilters.get(n-1)).getX()+1)+\")\";\r\n\t\t\t\tfor (int k = n-2; k >= 0; k--) {\r\n\t\t\t\t\tconstraint += \"*(\"+ ((String)namesFilters.get(k)).replaceAll(\" \", \"_\") + \"=$\" + getNumToCol( ((pgr.domain.util.impl.CoordinateImpl)posFilters.get(k)).getY()) + \"$\" + ( ((pgr.domain.util.impl.CoordinateImpl)posFilters.get(k)).getX()+1)+\")\";\r\n\t\t\t\t}\r\n\t\t\t\tconstraint+=\")\";\r\n\t\t\t\tString si = \"IF(\" + constraint + \",ROW(\" + ( (String)namesFilters.get(namesFilters.size()-1) ) .replaceAll(\" \", \"_\")\r\n\t\t\t\t\t\t+ \")-ROW(\" + sheet2 + \"!$\" + getNumToCol(firstCellFilter) + \"$\" + firstRowFilter + \")+1)\";\r\n\t\t\t\tString formula = \"IF(\" + filas + \"<=\" + newDataSheet.getSheetName() + \"!$\" + getNumToCol(countCell) + \"$\"\r\n\t\t\t\t\t\t+ (countRow + 1) + \",INDEX(INDIRECT(SUBSTITUTE(\" + getNumToCol(targetCell + j) + \"$\" + (targetRow - 1)\r\n\t\t\t\t\t\t+ \",\\\" \\\",\\\"_\\\")),SMALL(\" + si + \",\" + filas + \")),\\\"\\\")\";\r\n\t\t\t\tsheet.setArrayFormula(formula,\r\n\t\t\t\t\t\tnew org.apache.poi.ss.util.CellRangeAddress((targetRow + i) - 1, (targetRow + i) - 1, targetCell + j, targetCell + j));\r\n\t\t\t}\r\n\t\t}\r\n\r\n\t\r\n'"
	 * @generated
	 */
	void theFormula(int targetRow, int targetCell, int countRow, int countCell, Integer firstCellFilter, int sizeX, int sizeY);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="pgr.datatypes.datatypesjavautil.ArrayList" resultSetDataType="pgr.datatypes.datatypesjavautil.ArrayList" titlesMapDataType="pgr.datatypes.datatypesjavautil.HashMapStringElementoConsulta" listFilterDataType="pgr.datatypes.datatypesjavautil.ArrayList"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\t\r\n\t\tArrayList< HashMap<String, Set<String>>> listDependenceMap = new ArrayList<>();\r\n\t\t\r\n\t\tfor (int i = 1; i < listFilter.size(); i++)\r\n\t\t\tlistDependenceMap.add(getMapOfColumnByColumn(resultSet,(int) titlesMap.get(listFilter.get((i - 1))),\r\n\t\t\t\t\t(int)titlesMap.get(listFilter.get(i))));\r\n\t\t\r\n\t\treturn listDependenceMap;\r\n\t'"
	 * @generated
	 */
	ArrayList createDependence(ArrayList resultSet, HashMap titlesMap, ArrayList listFilter);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="pgr.datatypes.datatypesjavautil.HashMapStringElementoConsulta" resultSetDataType="pgr.datatypes.datatypesjavautil.ArrayList"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tHashMap<String, Integer> titlesMap = new HashMap<>();\r\n\t\tArrayList<ArrayList<String>> result = resultSet;\r\n\t\tfor (int i = 0; i < result.get(0).size(); i++) {\r\n\t\t\tString key = result.get(0).get(i);\r\n\t\t\ttitlesMap.put(key, new Integer(i));\r\n\t\t}\r\n\t\treturn titlesMap;\r\n\t'"
	 * @generated
	 */
	HashMap getTitles(ArrayList resultSet);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="pgr.datatypes.datatypesjavautil.ArrayList" resultSetDataType="pgr.datatypes.datatypesjavautil.ArrayList"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tArrayList<Set<String>> setResult = new ArrayList<>();\r\n\t\tfor (int i = 0; i <((ArrayList<String>) resultSet.get(0)).size(); i++)\r\n\t\t\tsetResult.add(getSetColum(resultSet, i));\r\n\t\treturn setResult;\r\n\t'"
	 * @generated
	 */
	ArrayList removeDuplicateValues(ArrayList resultSet);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model elementDataType="pgr.datatypes.datatypesqm.ResultElement"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='String answer = \"\";\r\n\r\n\t\tif (element instanceof gestionmodelosconsultas.modeloconsultas.resultset.resultquien.UnidadOrganizacional) {\r\n\r\n\t\t\tgestionmodelosconsultas.modeloconsultas.resultset.resultquien.UnidadOrganizacional unidadOrganizacional = (gestionmodelosconsultas.modeloconsultas.resultset.resultquien.UnidadOrganizacional) element;\r\n\r\n\t\t\tif (unidadOrganizacional.getIdUnidadOrganizacional() != null)\r\n\t\t\t\tanswer += unidadOrganizacional.getIdUnidadOrganizacional();\r\n\t\t\tif (unidadOrganizacional.getNombre() != null) {\r\n\t\t\t\tif (answer.length() > 0)\r\n\t\t\t\t\tanswer += \",\";\r\n\t\t\t\tanswer += unidadOrganizacional.getNombre();\r\n\t\t\t}\r\n\t\t\tif (unidadOrganizacional.getDescripcion() != null) {\r\n\t\t\t\tif (answer.length() > 0)\r\n\t\t\t\t\tanswer += \",\";\r\n\t\t\t\tanswer += unidadOrganizacional.getDescripcion();\r\n\t\t\t}\r\n\t\t\t\t\r\n\t\t} else if (element instanceof gestionmodelosconsultas.modeloconsultas.resultset.resultquien.Actor) {\r\n\r\n\t\t\tgestionmodelosconsultas.modeloconsultas.resultset.resultquien.Actor actor = (gestionmodelosconsultas.modeloconsultas.resultset.resultquien.Actor) element;\r\n\t\t\t\r\n\t\t\tif (actor.getIdActor() != null)\r\n\t\t\t\tanswer += actor.getIdActor();\r\n\t\t\tif (actor.getNombre() != null) {\r\n\t\t\t\tif (answer.length() > 0)\r\n\t\t\t\t\tanswer += \",\";\r\n\t\t\t\tanswer += actor.getNombre();\r\n\t\t\t}\r\n\t\t\tif (actor.getApellido() != null) {\r\n\t\t\t\tif (answer.length() > 0)\r\n\t\t\t\t\tanswer += \",\";\r\n\t\t\t\tanswer += actor.getApellido();\r\n\t\t\t}\r\n\t\t\tif (actor.getEmail() != null) {\r\n\t\t\t\tif (answer.length() > 0)\r\n\t\t\t\t\tanswer += \",\";\r\n\t\t\t\tanswer += actor.getEmail();\r\n\t\t\t}\r\n\t\t\tif (actor.getDescripcion() != null) {\r\n\t\t\t\tif (answer.length() > 0)\r\n\t\t\t\t\tanswer += \",\";\r\n\t\t\t\tanswer += actor.getDescripcion();\r\n\t\t\t}\r\n\t\t\t\r\n\t\t\t\r\n\t\t} else if (element instanceof gestionmodelosconsultas.modeloconsultas.resultset.resultquien.Rol) {\r\n\r\n\t\t\tgestionmodelosconsultas.modeloconsultas.resultset.resultquien.Rol rol = (gestionmodelosconsultas.modeloconsultas.resultset.resultquien.Rol) element;\r\n\t\t\t\r\n\t\t\tif (rol.getIdRol() != null)\r\n\t\t\t\tanswer += rol.getIdRol();\r\n\t\t\tif (rol.getNombre() != null)\r\n\t\t\t\tif (answer.length() > 0)\r\n\t\t\t\t\tanswer += \",\";\r\n\t\t\t\tanswer += rol.getNombre();\r\n\t\t\tif (rol.getDescripcion() != null) {\r\n\t\t\t\tif (answer.length() > 0)\r\n\t\t\t\t\tanswer += \",\";\r\n\t\t\t\tanswer += rol.getDescripcion();\r\n\t\t\t}\r\n\r\n\t\t} else if (element instanceof gestionmodelosconsultas.modeloconsultas.resultset.resultquien.Contacto) {\r\n\r\n\t\t\tgestionmodelosconsultas.modeloconsultas.resultset.resultquien.Contacto contacto = (gestionmodelosconsultas.modeloconsultas.resultset.resultquien.Contacto) element;\r\n\t\t\t\r\n\t\t\tif (contacto.getIdContacto() != null)\r\n\t\t\t\tanswer += contacto.getIdContacto();\r\n\t\t\tif (contacto.getNombre() != null) {\r\n\t\t\t\tif (answer.length() > 0)\r\n\t\t\t\t\tanswer += \",\";\r\n\t\t\t\tanswer += contacto.getNombre();\r\n\t\t\t}\r\n\t\t\tif (contacto.getUsername() != null) {\r\n\t\t\t\tif (answer.length() > 0)\r\n\t\t\t\t\tanswer += \",\";\r\n\t\t\t\tanswer += contacto.getUsername();\r\n\t\t\t}\r\n\t\t\tif (contacto.getTelefono() != null) {\r\n\t\t\t\tif (answer.length() > 0)\r\n\t\t\t\t\tanswer += \",\";\r\n\t\t\t\tanswer += contacto.getTelefono();\r\n\t\t\t}\r\n\t\t\tif (contacto.getPassword() != null) {\r\n\t\t\t\tif (answer.length() > 0)\r\n\t\t\t\t\tanswer += \",\";\r\n\t\t\t\tanswer += contacto.getPassword();\r\n\t\t\t}\r\n\t\t\tif (contacto.getDescripcion() != null) {\r\n\t\t\t\tif (answer.length() > 0)\r\n\t\t\t\t\tanswer += \",\";\r\n\t\t\t\tanswer += contacto.getDescripcion();\r\n\t\t\t}\r\n\t\t} else if (element instanceof gestionmodelosconsultas.modeloconsultas.resultset.resultque.Documento) {\r\n\r\n\t\t\tgestionmodelosconsultas.modeloconsultas.resultset.resultque.Documento documento = (gestionmodelosconsultas.modeloconsultas.resultset.resultque.Documento) element;\r\n\r\n\t\t\tif (documento.getIdDocumento() != null)\r\n\t\t\t\tanswer += documento.getIdDocumento();\r\n\t\t\tif (documento.getTitulo() != null) {\r\n\t\t\t\tif (answer.length() > 0)\r\n\t\t\t\t\tanswer += \",\";\r\n\t\t\t\tanswer += documento.getTitulo();\r\n\t\t\t}\r\n\t\t\tif (documento.getTipo() != null) {\r\n\t\t\t\tif (answer.length() > 0)\r\n\t\t\t\t\tanswer += \",\";\r\n\t\t\t\tanswer += documento.getTipo();\r\n\t\t\t}\r\n\t\t\tif (documento.getFechaCreacion() != null) {\r\n\t\t\t\tif (answer.length() > 0)\r\n\t\t\t\t\tanswer += \",\";\r\n\t\t\t\tanswer += documento.getFechaCreacion();\r\n\t\t\t}\r\n\t\t\tif (documento.getEstado() != null) {\r\n\t\t\t\tif (answer.length() > 0)\r\n\t\t\t\t\tanswer += \",\";\r\n\t\t\t\tanswer += documento.getEstado();\r\n\t\t\t}\r\n\t\t\tif (documento.getComentarios() != null) {\r\n\t\t\t\tif (answer.length() > 0)\r\n\t\t\t\t\tanswer += \",\";\r\n\t\t\t\tanswer += documento.getComentarios();\r\n\t\t\t}\r\n\t\t\tif (documento.getEdicion() != null) {\r\n\t\t\t\tif (answer.length() > 0)\r\n\t\t\t\t\tanswer += \",\";\r\n\t\t\t\tanswer += documento.getEdicion();\r\n\t\t\t}\r\n\t\t\tif (documento.getAnexo() != null) {\r\n\t\t\t\tif (answer.length() > 0)\r\n\t\t\t\t\tanswer += \",\";\r\n\t\t\t\tanswer += documento.getAnexo();\r\n\t\t\t}\r\n\t\t\tif (documento.getVigencia() != null) {\r\n\t\t\t\tif (answer.length() > 0)\r\n\t\t\t\t\tanswer += \",\";\r\n\t\t\t\tanswer += documento.getVigencia();\r\n\t\t\t}\r\n\t\t} else if (element instanceof gestionmodelosconsultas.modeloconsultas.resultset.resultque.Comunicacion) {\r\n\r\n\t\t\tgestionmodelosconsultas.modeloconsultas.resultset.resultque.Comunicacion comunicacion = (gestionmodelosconsultas.modeloconsultas.resultset.resultque.Comunicacion) element;\r\n\r\n\t\t\tif (comunicacion.getIdComunicacion() != null)\r\n\t\t\t\tanswer += comunicacion.getIdComunicacion();\r\n\t\t\tif (comunicacion.getAsunto() != null) {\r\n\t\t\t\tif (answer.length() > 0)\r\n\t\t\t\t\tanswer += \",\";\r\n\t\t\t\tanswer += comunicacion.getAsunto();\r\n\t\t\t}\r\n\t\t} else if (element instanceof gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.ActividadProceso) {\r\n\r\n\t\t\tgestionmodelosconsultas.modeloconsultas.resultset.resultcomo.ActividadProceso actividadProceso = (gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.ActividadProceso) element;\r\n\r\n\t\t\tif (actividadProceso.getIdActividadProceso() != null)\r\n\t\t\t\tanswer += actividadProceso.getIdActividadProceso();\r\n\t\t\tif (actividadProceso.getNombre() != null) {\r\n\t\t\t\tif (answer.length() > 0)\r\n\t\t\t\t\tanswer += \",\";\r\n\t\t\t\tanswer += actividadProceso.getNombre();\r\n\t\t\t}\r\n\t\t\tif (actividadProceso.getDescripcion() != null) {\r\n\t\t\t\tif (answer.length() > 0)\r\n\t\t\t\t\tanswer += \",\";\r\n\t\t\t\tanswer += actividadProceso.getDescripcion();\r\n\t\t\t}\r\n\t\t\tif (actividadProceso.getFechaInicio() != null) {\r\n\t\t\t\tif (answer.length() > 0)\r\n\t\t\t\t\tanswer += \",\";\r\n\t\t\t\tanswer += actividadProceso.getFechaInicio();\r\n\t\t\t}\r\n\t\t\tif (actividadProceso.getFechaFin() != null) {\r\n\t\t\t\tif (answer.length() > 0)\r\n\t\t\t\t\tanswer += \",\";\r\n\t\t\t\tanswer += actividadProceso.getFechaFin();\r\n\t\t\t}\r\n\t\t} else if (element instanceof gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.InstanciaProceso) {\r\n\r\n\t\t\tgestionmodelosconsultas.modeloconsultas.resultset.resultcomo.InstanciaProceso instanciaProceso = (gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.InstanciaProceso) element;\r\n\r\n\t\t\tif (instanciaProceso.getIdInstanciaProceso() != null)\r\n\t\t\t\tanswer += instanciaProceso.getIdInstanciaProceso();\r\n\t\t\tif (instanciaProceso.getNombre() != null) {\r\n\t\t\t\tif (answer.length() > 0)\r\n\t\t\t\t\tanswer += \",\";\r\n\t\t\t\tanswer += instanciaProceso.getNombre();\r\n\t\t\t}\r\n\t\t\tif (instanciaProceso.getDescripcion() != null) {\r\n\t\t\t\tif (answer.length() > 0)\r\n\t\t\t\t\tanswer += \",\";\r\n\t\t\t\tanswer += instanciaProceso.getDescripcion();\r\n\t\t\t}\r\n\t\t} else if (element instanceof gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.Deposito) {\r\n\r\n\t\t\tgestionmodelosconsultas.modeloconsultas.resultset.resultdonde.Deposito deposito = (gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.Deposito) element;\r\n\t\t\t\r\n\t\t\tif (deposito.getIdDeposito() != null)\r\n\t\t\t\tanswer += deposito.getIdDeposito();\r\n\t\t\tif (deposito.getDescripcion() != null) {\r\n\t\t\t\tif (answer.length() > 0)\r\n\t\t\t\t\tanswer += \",\";\r\n\t\t\t\tanswer += deposito.getDescripcion();\r\n\t\t\t}\r\n\t\t} else if (element instanceof gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.Disco) {\r\n\r\n\t\t\tgestionmodelosconsultas.modeloconsultas.resultset.resultdonde.Disco disco = (gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.Disco) element;\r\n\t\t\t\r\n\t\t\tif (disco.getIdDisco() != null)\r\n\t\t\t\tanswer += disco.getIdDisco();\r\n\t\t\tif (disco.getReferencia() != null) {\r\n\t\t\t\tif (answer.length() > 0)\r\n\t\t\t\t\tanswer += \",\";\r\n\t\t\t\tanswer += disco.getReferencia();\r\n\t\t\t}\r\n\t\t\tif (disco.getDescripcion() != null) {\r\n\t\t\t\tif (answer.length() > 0)\r\n\t\t\t\t\tanswer += \",\";\r\n\t\t\t\tanswer += disco.getDescripcion();\r\n\t\t\t}\r\n\t\t} else if (element instanceof gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.Armario) {\r\n\r\n\t\t\tgestionmodelosconsultas.modeloconsultas.resultset.resultdonde.Armario armario = (gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.Armario) element;\r\n\t\t\t\r\n\t\t\tif (armario.getIdArmario() != null)\r\n\t\t\t\tanswer += armario.getIdArmario();\r\n\t\t\tif (armario.getDescripcion() != null) {\r\n\t\t\t\tif (answer.length() > 0)\r\n\t\t\t\t\tanswer += \",\";\r\n\t\t\t\tanswer += armario.getDescripcion();\r\n\t\t\t}\r\n\t\t}\r\n\r\n\t\treturn answer;'"
	 * @generated
	 */
	String getAtributtes(ResultElement element);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\t\r\n\t\t\r\n\t\t\t\t\r\n\t\t\t\tXSSFSheet query = workbook.createSheet(\"Query\");\r\n\t\t\t\torg.apache.poi.xssf.usermodel.XSSFRow row = query.createRow(0);\r\n\t\t\t\tXSSFCell cell = row.createCell(0);\r\n\t\t\t\tcell.setCellValue(queryString);\r\n\t\t\t\t\r\n\t\t\t\tint i =1;\r\n\t\t\t\tfor(;i<= namesFilters.size();i++){\r\n\t\t\t\t\trow = query.createRow(i);\r\n\t\t\t\t\t\r\n\t\t\t\t\tcell = row.createCell(0);\r\n\t\t\t\t\tcell.setCellValue(\"\"+  ((pgr.domain.util.impl.CoordinateImpl)posFilters.get(i-1)).getX());\r\n\t\t\t\t\t\r\n\t\t\t\t\tcell = row.createCell(1);\r\n\t\t\t\t\tcell.setCellValue(\"\"+ ((pgr.domain.util.impl.CoordinateImpl)posFilters.get(i-1)).getY());\r\n\t\t\t\t\t\r\n\t\t\t\t\tcell = row.createCell(2);\r\n\t\t\t\t\tcell.setCellValue(\"\"+ namesFilters.get(i-1));\r\n\t\t\t\t}\r\n\t\t\t\t\r\n\t\t\t\trow = query.createRow(i);\r\n\t\t\t\t\r\n\t\t\t\tcell = row.createCell(0);\r\n\t\t\t\tcell.setCellValue(\"\"+ posRowIniData);\r\n\t\t\t\t\r\n\t\t\t\tcell = row.createCell(1);\r\n\t\t\t\tcell.setCellValue(\"\"+ posCellIniData);\r\n\t\t\t\t\r\n\t\t\t\tworkbook.setSheetHidden(workbook.getSheetIndex(\"Query\"), XSSFWorkbook.SHEET_STATE_HIDDEN);\r\n\t\t\t\r\n\t'"
	 * @generated
	 */
	void createSheetQuery();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tworkbook.removeSheetAt(workbook.getSheetIndex(\"Query\"));\r\n\t\tworkbook.removeSheetAt(workbook.getSheetIndex(\"Columns\"));\r\n\t\tsaveExcel();\r\n\t'"
	 * @generated
	 */
	void removeSheets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\ttry {\r\n\t\t\tjava.io.File sourceFile = new java.io.File(sourcePath);\r\n\t\t\tjava.io.File targetDir  = new java.io.File(targetPath);\r\n\t\t\torg.apache.commons.io.FileUtils.copyFileToDirectory(sourceFile, targetDir);\r\n\t\t} catch (java.io.IOException e) {\r\n\t\t\t// TODO Auto-generated catch block\r\n\t\t\te.printStackTrace();\r\n\t\t}\r\n\t'"
	 * @generated
	 */
	void copyExcel(String sourcePath, String targetPath);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tjava.io.File fileToOpen = new java.io.File(path);\r\n\t\t \r\n\t\tif (fileToOpen.exists() && fileToOpen.isFile()) {\r\n\t\t\torg.eclipse.core.filesystem.IFileStore fileStore = org.eclipse.core.filesystem.EFS.getLocalFileSystem().getStore(fileToOpen.toURI());\r\n\t\t\torg.eclipse.ui.IWorkbenchPage page = org.eclipse.ui.PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();\r\n\t\t \r\n\t\t    try {\r\n\t\t    \torg.eclipse.ui.ide.IDE.openEditorOnFileStore( page, fileStore);\r\n\t\t    } catch ( org.eclipse.ui.PartInitException e ) {\r\n\t\t        //Put your exception handler here if you wish to\r\n\t\t    }\r\n\t\t} else {\r\n\t\t    //Do something if the file does not exist\r\n\t\t}\r\n\t'"
	 * @generated
	 */
	void openFileIntoEditor(String path);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\t\r\n\t\tint index = absolutePath.length()-1;\r\n\t\t\r\n\t\tchar c = absolutePath.charAt(index);\r\n\t\twhile(c!=\'/\'){\r\n\t\t\tindex--;\r\n\t\t\tc = absolutePath.charAt(index);\r\n\t\t}\r\n\t\treturn absolutePath.substring(0, index);\r\n\t'"
	 * @generated
	 */
	String getDir(String absolutePath);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model cellDataType="pgr.datatypes.datatypeapachepoi.XSSFCell"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\t int cel_Type = cell.getCellType();                           \r\n\t     String res=\"\";\r\n\t\t switch(cel_Type){\r\n\t     \tcase 0: res+=cell.getNumericCellValue();\r\n\t             \tbreak;\r\n\t     \tcase 1: res+=cell.getStringCellValue();\r\n\t     \t\t\tbreak;\r\n\t     \tcase 4:res+=cell.getBooleanCellValue();\r\n\t             \tbreak;\r\n\t     \tcase 3:res+=\"\";\r\n\t     \t\t\tbreak; \r\n\t     }\r\n\t\t return res;\r\n\t'"
	 * @generated
	 */
	String getCellValue(XSSFCell cell);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="pgr.datatypes.datatypesjavautil.ArrayList" sDataType="pgr.datatypes.datatypesjavautil.Set"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tArrayList<String> names=new ArrayList<String>();\r\n\t\tnames.addAll(s);\r\n\t\treturn names;\r\n\t'"
	 * @generated
	 */
	ArrayList getArrayListFromSet(Set s);

} // ExcelGenerator
