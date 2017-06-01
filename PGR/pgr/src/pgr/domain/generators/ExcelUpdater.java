/**
 */
package pgr.domain.generators;

import gestionconsultassqlmodels.generate.conexionBD.DataConnection;

import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.eclipse.emf.ecore.EObject;

import pgr.domain.Domain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Excel Updater</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pgr.domain.generators.ExcelUpdater#getFilePath <em>File Path</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelUpdater#getStringQuery <em>String Query</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelUpdater#getWorkbook <em>Workbook</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelUpdater#getDc <em>Dc</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelUpdater#getPosFilter <em>Pos Filter</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelUpdater#getListFilter <em>List Filter</em>}</li>
 *   <li>{@link pgr.domain.generators.ExcelUpdater#getDomain <em>Domain</em>}</li>
 * </ul>
 *
 * @see pgr.domain.generators.GeneratorsPackage#getExcelUpdater()
 * @model
 * @generated
 */
public interface ExcelUpdater extends EObject {
	/**
	 * Returns the value of the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Path</em>' attribute.
	 * @see #setFilePath(String)
	 * @see pgr.domain.generators.GeneratorsPackage#getExcelUpdater_FilePath()
	 * @model
	 * @generated
	 */
	String getFilePath();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.ExcelUpdater#getFilePath <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Path</em>' attribute.
	 * @see #getFilePath()
	 * @generated
	 */
	void setFilePath(String value);

	/**
	 * Returns the value of the '<em><b>String Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Query</em>' attribute.
	 * @see #setStringQuery(String)
	 * @see pgr.domain.generators.GeneratorsPackage#getExcelUpdater_StringQuery()
	 * @model
	 * @generated
	 */
	String getStringQuery();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.ExcelUpdater#getStringQuery <em>String Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Query</em>' attribute.
	 * @see #getStringQuery()
	 * @generated
	 */
	void setStringQuery(String value);

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
	 * @see pgr.domain.generators.GeneratorsPackage#getExcelUpdater_Workbook()
	 * @model dataType="pgr.datatypes.datatypeapachepoi.XSSFWorkbook"
	 * @generated
	 */
	XSSFWorkbook getWorkbook();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.ExcelUpdater#getWorkbook <em>Workbook</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workbook</em>' attribute.
	 * @see #getWorkbook()
	 * @generated
	 */
	void setWorkbook(XSSFWorkbook value);

	/**
	 * Returns the value of the '<em><b>Dc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dc</em>' attribute.
	 * @see #setDc(DataConnection)
	 * @see pgr.domain.generators.GeneratorsPackage#getExcelUpdater_Dc()
	 * @model dataType="pgr.datatypes.datatypesqm.DataConnection"
	 * @generated
	 */
	DataConnection getDc();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.ExcelUpdater#getDc <em>Dc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dc</em>' attribute.
	 * @see #getDc()
	 * @generated
	 */
	void setDc(DataConnection value);

	/**
	 * Returns the value of the '<em><b>Pos Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos Filter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos Filter</em>' attribute.
	 * @see #setPosFilter(ArrayList)
	 * @see pgr.domain.generators.GeneratorsPackage#getExcelUpdater_PosFilter()
	 * @model dataType="pgr.datatypes.datatypesjavautil.ArrayList"
	 * @generated
	 */
	ArrayList getPosFilter();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.ExcelUpdater#getPosFilter <em>Pos Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos Filter</em>' attribute.
	 * @see #getPosFilter()
	 * @generated
	 */
	void setPosFilter(ArrayList value);

	/**
	 * Returns the value of the '<em><b>List Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Filter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Filter</em>' attribute.
	 * @see #setListFilter(ArrayList)
	 * @see pgr.domain.generators.GeneratorsPackage#getExcelUpdater_ListFilter()
	 * @model dataType="pgr.datatypes.datatypesjavautil.ArrayList"
	 * @generated
	 */
	ArrayList getListFilter();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.ExcelUpdater#getListFilter <em>List Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Filter</em>' attribute.
	 * @see #getListFilter()
	 * @generated
	 */
	void setListFilter(ArrayList value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link pgr.domain.Domain#getTheExcelUpdater <em>The Excel Updater</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' container reference.
	 * @see #setDomain(Domain)
	 * @see pgr.domain.generators.GeneratorsPackage#getExcelUpdater_Domain()
	 * @see pgr.domain.Domain#getTheExcelUpdater
	 * @model opposite="theExcelUpdater"
	 * @generated
	 */
	Domain getDomain();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.ExcelUpdater#getDomain <em>Domain</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' container reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(Domain value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\t\r\n\t\tthis.filePath = filePath;\r\n\t\ttry {\r\n\t\t\tdc = DataConnection.getInstance();\r\n\t\t\tworkbook = readFile();\r\n\t\t} catch (java.lang.ClassNotFoundException | java.sql.SQLException e) {\r\n\t\t\t// TODO Auto-generated catch block\r\n\t\t\te.printStackTrace();\r\n\t\t}\r\n\t\t\r\n\t'"
	 * @generated
	 */
	void ExcelUpdater(String filePath);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="pgr.datatypes.datatypeapachepoi.XSSFWorkbook"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\t// Se lee el archivo\r\n\t\ttry{\r\n\t\t\tjava.io.FileInputStream file = new java.io.FileInputStream(new java.io.File(filePath));\r\n\t\t\tXSSFWorkbook workbook = new XSSFWorkbook(file);\r\n\t\t\treturn workbook;\r\n\t\t}catch (java.io.FileNotFoundException e) {\r\n\t\t\t// TODO Auto-generated catch block\r\n\t\t\te.printStackTrace();\r\n\t\t} catch (java.io.IOException e) {\r\n\t\t\t// TODO Auto-generated catch block\r\n\t\t\te.printStackTrace();\r\n\t\t}\r\n\t\treturn null;\r\n\t'"
	 * @generated
	 */
	XSSFWorkbook readFile();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\t\r\n\t\t// Se escribe el archivo con las modificaciones\r\n\t\ttry{\r\n\t\t\tjava.io.FileOutputStream fileOutputStream;\r\n\t\t\tfileOutputStream = new java.io.FileOutputStream(filePath);\r\n\t\t\tworkbook.write(fileOutputStream);\r\n\t\t\tfileOutputStream.close();\r\n\t\t}catch (java.io.FileNotFoundException e) {\r\n\t\t\t// TODO Auto-generated catch block\r\n\t\t\te.printStackTrace();\r\n\t\t} catch (java.io.IOException e) {\r\n\t\t\t// TODO Auto-generated catch block\r\n\t\t\te.printStackTrace();\r\n\t\t}\r\n\t'"
	 * @generated
	 */
	void saveExcel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\t\t\r\n\t\t\t\ttry{\r\n\t\t\t\t\tcom.mysql.jdbc.Connection connection = dc.getConnection();\r\n\t\t\t\t\tcom.mysql.jdbc.PreparedStatement ps = (com.mysql.jdbc.PreparedStatement)connection.prepareStatement(stringQuery);\r\n\t\t\t\t\tjava.sql.ResultSet rs = ps.executeQuery();\r\n\t\t\t\t\t\r\n\t\t\t\t\tpgr.domain.generators.ExcelGenerator excelGenerator = pgr.domain.generators.GeneratorsFactory.eINSTANCE.createExcelGenerator();\r\n\t\t\t\t\texcelGenerator.ExcelGenerator(filePath,listFilter,posFilter);\r\n\t\t\t\t\texcelGenerator.createDataSheet(rs);\r\n\t\t\t\t\tif(excelGenerator.getNamesFilters().size() != 0)\r\n\t\t\t\t\t\texcelGenerator.createRelations();\r\n\t\t\t\t}catch (java.sql.SQLException e){\r\n\t\t\t\t\te.printStackTrace();\r\n\t\t\t\t}\r\n\t\t\t\r\n\t'"
	 * @generated
	 */
	void executeQuery();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\t\r\n\t\t// Se obtienen las sheet necesarias para el proceso\r\n\t\torg.apache.poi.xssf.usermodel.XSSFSheet sheet = workbook.getSheet(\"Query\");\r\n\t\tif (sheet != null) {\r\n\t\t\torg.apache.poi.xssf.usermodel.XSSFRow row = sheet.getRow(0);\r\n\t\t\torg.apache.poi.xssf.usermodel.XSSFCell cell = row.getCell(0);\r\n\t\t\tstringQuery = cell.getStringCellValue();\r\n\t\t}\r\n\t\t\r\n\t\tposFilter = new ArrayList< pgr.domain.util.impl.CoordinateImpl>();\r\n\t\tlistFilter = new ArrayList<String>();\r\n\t\t\r\n\t\torg.apache.poi.xssf.usermodel.XSSFCell c;\r\n\t\torg.apache.poi.xssf.usermodel.XSSFRow r;\r\n\t\tString x,y,name;\r\n\t\tfor(int i=1;i<sheet.getLastRowNum();i++){\r\n\t\t\tr  = sheet.getRow(i);\r\n\t\t\t\r\n\t\t\tc = r.getCell(0);\r\n\t\t\tx = c.getStringCellValue();\r\n\t\t\t\r\n\t\t\tc = r.getCell(1);\r\n\t\t\ty = c.getStringCellValue();\r\n\t\t\t\r\n\t\t\tc = r.getCell(2);\r\n\t\t\tname = c.getStringCellValue();\r\n\t\t\t\r\n\t\t\tposFilter.add( createCoordinate(Integer.parseInt(x), Integer.parseInt(y)));\r\n\t\t\tlistFilter.add(name);\r\n\t\t}\r\n\t\tr = sheet.getRow(sheet.getLastRowNum());\r\n\t\t\r\n\t\tc = r.getCell(0);\r\n\t\tx = c.getStringCellValue();\r\n\t\t\r\n\t\tc = r.getCell(1);\r\n\t\ty = c.getStringCellValue();\r\n\t\tposFilter.add( createCoordinate(Integer.parseInt(x), Integer.parseInt(y)));\r\n\t'"
	 * @generated
	 */
	void readSheetQuery();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="pgr.domain.util.Coordinate"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tpgr.domain.util.impl.CoordinateImpl c = (pgr.domain.util.impl.CoordinateImpl)\r\n\t\t\t\t\t\t pgr.domain.util.UtilFactory.eINSTANCE.createCoordinate();\r\n\t\t\t\t c.setX(x); c.setY(y);\r\n\t\t\t\treturn c;\r\n\t'"
	 * @generated
	 */
	Comparable createCoordinate(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\treadSheetQuery();\r\n\t\texecuteQuery();\r\n\t'"
	 * @generated
	 */
	void refresh();

} // ExcelUpdater
