/**
 */
package pgr.domain.generators;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.eclipse.emf.ecore.EObject;

import org.w3c.dom.Document;

import pgr.domain.Domain;

import pgr.domain.util.MergedRegion;

import tooldataform.ModelFactory;

import tooldataform.core.Domain_Diagram;
import tooldataform.core.Project;

import tooldataform.formmodel.concreta.Container;
import tooldataform.formmodel.concreta.Containment;
import tooldataform.formmodel.concreta.DataForm_Diagram;
import tooldataform.formmodel.concreta.Interface;
import tooldataform.formmodel.concreta.TableView;

import tooldataform.formmodel.containers.GraphicalContainer;

import tooldataform.pmoo.Clase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dataform Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getModelFactory <em>Model Factory</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getProject <em>Project</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getDataformDiagram <em>Dataform Diagram</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getDomainDiagram <em>Domain Diagram</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getDomainClass <em>Domain Class</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getInterface1 <em>Interface1</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getContainer <em>Container</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getPath <em>Path</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getAbsolutePath <em>Absolute Path</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getDimens <em>Dimens</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getAmountContainers <em>Amount Containers</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getAmountTables <em>Amount Tables</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getRelativeX <em>Relative X</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getRelativeY <em>Relative Y</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getDataStartRow <em>Data Start Row</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getDataStartCell <em>Data Start Cell</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getAmountCombos <em>Amount Combos</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getReportName <em>Report Name</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getContainerEndRow <em>Container End Row</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getContainerEndCell <em>Container End Cell</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getWorkbook <em>Workbook</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getSheet <em>Sheet</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getAdjacenciesX <em>Adjacencies X</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getAdjacenciesY <em>Adjacencies Y</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getVisitedCells <em>Visited Cells</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getComboNamesSorted <em>Combo Names Sorted</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getCoordenadasComboBox <em>Coordenadas Combo Box</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getListTables <em>List Tables</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getListComboBox <em>List Combo Box</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getListComboCordinate <em>List Combo Cordinate</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getMergedRegions <em>Merged Regions</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getCoordenadasInicioContenedores <em>Coordenadas Inicio Contenedores</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getCoordenadasFinContenedores <em>Coordenadas Fin Contenedores</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getContainers <em>Containers</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformGenerator#getTheDomain <em>The Domain</em>}</li>
 * </ul>
 *
 * @see pgr.domain.generators.GeneratorsPackage#getDataformGenerator()
 * @model
 * @generated
 */
public interface DataformGenerator extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Factory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Factory</em>' attribute.
	 * @see #setModelFactory(ModelFactory)
	 * @see pgr.domain.generators.GeneratorsPackage#getDataformGenerator_ModelFactory()
	 * @model dataType="pgr.datatypes.datatypesdataform.ModelFactory"
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.DataformGenerator#getModelFactory <em>Model Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Factory</em>' attribute.
	 * @see #getModelFactory()
	 * @generated
	 */
	void setModelFactory(ModelFactory value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' attribute.
	 * @see #setProject(Project)
	 * @see pgr.domain.generators.GeneratorsPackage#getDataformGenerator_Project()
	 * @model dataType="pgr.datatypes.datatypesdataform.Project"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.DataformGenerator#getProject <em>Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' attribute.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

	/**
	 * Returns the value of the '<em><b>Dataform Diagram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dataform Diagram</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataform Diagram</em>' attribute.
	 * @see #setDataformDiagram(DataForm_Diagram)
	 * @see pgr.domain.generators.GeneratorsPackage#getDataformGenerator_DataformDiagram()
	 * @model dataType="pgr.datatypes.datatypesdataform.DataForm_Diagram"
	 * @generated
	 */
	DataForm_Diagram getDataformDiagram();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.DataformGenerator#getDataformDiagram <em>Dataform Diagram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataform Diagram</em>' attribute.
	 * @see #getDataformDiagram()
	 * @generated
	 */
	void setDataformDiagram(DataForm_Diagram value);

	/**
	 * Returns the value of the '<em><b>Domain Diagram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Diagram</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Diagram</em>' attribute.
	 * @see #setDomainDiagram(Domain_Diagram)
	 * @see pgr.domain.generators.GeneratorsPackage#getDataformGenerator_DomainDiagram()
	 * @model dataType="pgr.datatypes.datatypesdataform.Domain_Diagram"
	 * @generated
	 */
	Domain_Diagram getDomainDiagram();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.DataformGenerator#getDomainDiagram <em>Domain Diagram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Diagram</em>' attribute.
	 * @see #getDomainDiagram()
	 * @generated
	 */
	void setDomainDiagram(Domain_Diagram value);

	/**
	 * Returns the value of the '<em><b>Domain Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Class</em>' attribute.
	 * @see #setDomainClass(Clase)
	 * @see pgr.domain.generators.GeneratorsPackage#getDataformGenerator_DomainClass()
	 * @model dataType="pgr.datatypes.datatypesdataform.Clase"
	 * @generated
	 */
	Clase getDomainClass();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.DataformGenerator#getDomainClass <em>Domain Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Class</em>' attribute.
	 * @see #getDomainClass()
	 * @generated
	 */
	void setDomainClass(Clase value);

	/**
	 * Returns the value of the '<em><b>Interface1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface1</em>' attribute.
	 * @see #setInterface1(Interface)
	 * @see pgr.domain.generators.GeneratorsPackage#getDataformGenerator_Interface1()
	 * @model dataType="pgr.datatypes.datatypesdataform.Interface"
	 * @generated
	 */
	Interface getInterface1();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.DataformGenerator#getInterface1 <em>Interface1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface1</em>' attribute.
	 * @see #getInterface1()
	 * @generated
	 */
	void setInterface1(Interface value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' attribute.
	 * @see #setContainer(Container)
	 * @see pgr.domain.generators.GeneratorsPackage#getDataformGenerator_Container()
	 * @model dataType="pgr.datatypes.datatypesdataform.Container"
	 * @generated
	 */
	Container getContainer();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.DataformGenerator#getContainer <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' attribute.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Container value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see pgr.domain.generators.GeneratorsPackage#getDataformGenerator_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.DataformGenerator#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

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
	 * @see pgr.domain.generators.GeneratorsPackage#getDataformGenerator_AbsolutePath()
	 * @model
	 * @generated
	 */
	String getAbsolutePath();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.DataformGenerator#getAbsolutePath <em>Absolute Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Absolute Path</em>' attribute.
	 * @see #getAbsolutePath()
	 * @generated
	 */
	void setAbsolutePath(String value);

	/**
	 * Returns the value of the '<em><b>Dimens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimens</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimens</em>' attribute.
	 * @see #setDimens(String)
	 * @see pgr.domain.generators.GeneratorsPackage#getDataformGenerator_Dimens()
	 * @model
	 * @generated
	 */
	String getDimens();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.DataformGenerator#getDimens <em>Dimens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimens</em>' attribute.
	 * @see #getDimens()
	 * @generated
	 */
	void setDimens(String value);

	/**
	 * Returns the value of the '<em><b>Amount Containers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Containers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Containers</em>' attribute.
	 * @see #setAmountContainers(int)
	 * @see pgr.domain.generators.GeneratorsPackage#getDataformGenerator_AmountContainers()
	 * @model
	 * @generated
	 */
	int getAmountContainers();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.DataformGenerator#getAmountContainers <em>Amount Containers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Containers</em>' attribute.
	 * @see #getAmountContainers()
	 * @generated
	 */
	void setAmountContainers(int value);

	/**
	 * Returns the value of the '<em><b>Amount Tables</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Tables</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Tables</em>' attribute.
	 * @see #setAmountTables(int)
	 * @see pgr.domain.generators.GeneratorsPackage#getDataformGenerator_AmountTables()
	 * @model
	 * @generated
	 */
	int getAmountTables();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.DataformGenerator#getAmountTables <em>Amount Tables</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Tables</em>' attribute.
	 * @see #getAmountTables()
	 * @generated
	 */
	void setAmountTables(int value);

	/**
	 * Returns the value of the '<em><b>Relative X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative X</em>' attribute.
	 * @see #setRelativeX(int)
	 * @see pgr.domain.generators.GeneratorsPackage#getDataformGenerator_RelativeX()
	 * @model
	 * @generated
	 */
	int getRelativeX();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.DataformGenerator#getRelativeX <em>Relative X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative X</em>' attribute.
	 * @see #getRelativeX()
	 * @generated
	 */
	void setRelativeX(int value);

	/**
	 * Returns the value of the '<em><b>Relative Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Y</em>' attribute.
	 * @see #setRelativeY(int)
	 * @see pgr.domain.generators.GeneratorsPackage#getDataformGenerator_RelativeY()
	 * @model
	 * @generated
	 */
	int getRelativeY();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.DataformGenerator#getRelativeY <em>Relative Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Y</em>' attribute.
	 * @see #getRelativeY()
	 * @generated
	 */
	void setRelativeY(int value);

	/**
	 * Returns the value of the '<em><b>Data Start Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Start Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Start Row</em>' attribute.
	 * @see #setDataStartRow(int)
	 * @see pgr.domain.generators.GeneratorsPackage#getDataformGenerator_DataStartRow()
	 * @model
	 * @generated
	 */
	int getDataStartRow();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.DataformGenerator#getDataStartRow <em>Data Start Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Start Row</em>' attribute.
	 * @see #getDataStartRow()
	 * @generated
	 */
	void setDataStartRow(int value);

	/**
	 * Returns the value of the '<em><b>Data Start Cell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Start Cell</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Start Cell</em>' attribute.
	 * @see #setDataStartCell(int)
	 * @see pgr.domain.generators.GeneratorsPackage#getDataformGenerator_DataStartCell()
	 * @model
	 * @generated
	 */
	int getDataStartCell();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.DataformGenerator#getDataStartCell <em>Data Start Cell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Start Cell</em>' attribute.
	 * @see #getDataStartCell()
	 * @generated
	 */
	void setDataStartCell(int value);

	/**
	 * Returns the value of the '<em><b>Amount Combos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Combos</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Combos</em>' attribute.
	 * @see #setAmountCombos(int)
	 * @see pgr.domain.generators.GeneratorsPackage#getDataformGenerator_AmountCombos()
	 * @model
	 * @generated
	 */
	int getAmountCombos();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.DataformGenerator#getAmountCombos <em>Amount Combos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Combos</em>' attribute.
	 * @see #getAmountCombos()
	 * @generated
	 */
	void setAmountCombos(int value);

	/**
	 * Returns the value of the '<em><b>Report Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Report Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Report Name</em>' attribute.
	 * @see #setReportName(String)
	 * @see pgr.domain.generators.GeneratorsPackage#getDataformGenerator_ReportName()
	 * @model
	 * @generated
	 */
	String getReportName();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.DataformGenerator#getReportName <em>Report Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report Name</em>' attribute.
	 * @see #getReportName()
	 * @generated
	 */
	void setReportName(String value);

	/**
	 * Returns the value of the '<em><b>Container End Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container End Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container End Row</em>' attribute.
	 * @see #setContainerEndRow(int)
	 * @see pgr.domain.generators.GeneratorsPackage#getDataformGenerator_ContainerEndRow()
	 * @model
	 * @generated
	 */
	int getContainerEndRow();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.DataformGenerator#getContainerEndRow <em>Container End Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container End Row</em>' attribute.
	 * @see #getContainerEndRow()
	 * @generated
	 */
	void setContainerEndRow(int value);

	/**
	 * Returns the value of the '<em><b>Container End Cell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container End Cell</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container End Cell</em>' attribute.
	 * @see #setContainerEndCell(int)
	 * @see pgr.domain.generators.GeneratorsPackage#getDataformGenerator_ContainerEndCell()
	 * @model
	 * @generated
	 */
	int getContainerEndCell();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.DataformGenerator#getContainerEndCell <em>Container End Cell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container End Cell</em>' attribute.
	 * @see #getContainerEndCell()
	 * @generated
	 */
	void setContainerEndCell(int value);

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
	 * @see pgr.domain.generators.GeneratorsPackage#getDataformGenerator_Workbook()
	 * @model dataType="pgr.datatypes.datatypeapachepoi.XSSFWorkbook"
	 * @generated
	 */
	XSSFWorkbook getWorkbook();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.DataformGenerator#getWorkbook <em>Workbook</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workbook</em>' attribute.
	 * @see #getWorkbook()
	 * @generated
	 */
	void setWorkbook(XSSFWorkbook value);

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
	 * @see pgr.domain.generators.GeneratorsPackage#getDataformGenerator_Sheet()
	 * @model dataType="pgr.datatypes.datatypeapachepoi.XSSFSheet"
	 * @generated
	 */
	XSSFSheet getSheet();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.DataformGenerator#getSheet <em>Sheet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheet</em>' attribute.
	 * @see #getSheet()
	 * @generated
	 */
	void setSheet(XSSFSheet value);

	/**
	 * Returns the value of the '<em><b>Adjacencies X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adjacencies X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adjacencies X</em>' attribute.
	 * @see #setAdjacenciesX(ArrayList)
	 * @see pgr.domain.generators.GeneratorsPackage#getDataformGenerator_AdjacenciesX()
	 * @model dataType="pgr.datatypes.datatypesjavautil.ArrayList"
	 * @generated
	 */
	ArrayList getAdjacenciesX();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.DataformGenerator#getAdjacenciesX <em>Adjacencies X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adjacencies X</em>' attribute.
	 * @see #getAdjacenciesX()
	 * @generated
	 */
	void setAdjacenciesX(ArrayList value);

	/**
	 * Returns the value of the '<em><b>Adjacencies Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adjacencies Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adjacencies Y</em>' attribute.
	 * @see #setAdjacenciesY(ArrayList)
	 * @see pgr.domain.generators.GeneratorsPackage#getDataformGenerator_AdjacenciesY()
	 * @model dataType="pgr.datatypes.datatypesjavautil.ArrayList"
	 * @generated
	 */
	ArrayList getAdjacenciesY();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.DataformGenerator#getAdjacenciesY <em>Adjacencies Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adjacencies Y</em>' attribute.
	 * @see #getAdjacenciesY()
	 * @generated
	 */
	void setAdjacenciesY(ArrayList value);

	/**
	 * Returns the value of the '<em><b>Visited Cells</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visited Cells</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visited Cells</em>' attribute.
	 * @see #setVisitedCells(ArrayList)
	 * @see pgr.domain.generators.GeneratorsPackage#getDataformGenerator_VisitedCells()
	 * @model dataType="pgr.datatypes.datatypesjavautil.ArrayList"
	 * @generated
	 */
	ArrayList getVisitedCells();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.DataformGenerator#getVisitedCells <em>Visited Cells</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visited Cells</em>' attribute.
	 * @see #getVisitedCells()
	 * @generated
	 */
	void setVisitedCells(ArrayList value);

	/**
	 * Returns the value of the '<em><b>Combo Names Sorted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Combo Names Sorted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combo Names Sorted</em>' attribute.
	 * @see #setComboNamesSorted(ArrayList)
	 * @see pgr.domain.generators.GeneratorsPackage#getDataformGenerator_ComboNamesSorted()
	 * @model dataType="pgr.datatypes.datatypesjavautil.ArrayList"
	 * @generated
	 */
	ArrayList getComboNamesSorted();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.DataformGenerator#getComboNamesSorted <em>Combo Names Sorted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combo Names Sorted</em>' attribute.
	 * @see #getComboNamesSorted()
	 * @generated
	 */
	void setComboNamesSorted(ArrayList value);

	/**
	 * Returns the value of the '<em><b>Coordenadas Combo Box</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordenadas Combo Box</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordenadas Combo Box</em>' attribute.
	 * @see #setCoordenadasComboBox(ArrayList)
	 * @see pgr.domain.generators.GeneratorsPackage#getDataformGenerator_CoordenadasComboBox()
	 * @model dataType="pgr.datatypes.datatypesjavautil.ArrayList"
	 * @generated
	 */
	ArrayList getCoordenadasComboBox();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.DataformGenerator#getCoordenadasComboBox <em>Coordenadas Combo Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordenadas Combo Box</em>' attribute.
	 * @see #getCoordenadasComboBox()
	 * @generated
	 */
	void setCoordenadasComboBox(ArrayList value);

	/**
	 * Returns the value of the '<em><b>List Tables</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Tables</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Tables</em>' attribute.
	 * @see #setListTables(ArrayList)
	 * @see pgr.domain.generators.GeneratorsPackage#getDataformGenerator_ListTables()
	 * @model dataType="pgr.datatypes.datatypesjavautil.ArrayList"
	 * @generated
	 */
	ArrayList getListTables();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.DataformGenerator#getListTables <em>List Tables</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Tables</em>' attribute.
	 * @see #getListTables()
	 * @generated
	 */
	void setListTables(ArrayList value);

	/**
	 * Returns the value of the '<em><b>List Combo Box</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Combo Box</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Combo Box</em>' attribute.
	 * @see #setListComboBox(ArrayList)
	 * @see pgr.domain.generators.GeneratorsPackage#getDataformGenerator_ListComboBox()
	 * @model dataType="pgr.datatypes.datatypesjavautil.ArrayList"
	 * @generated
	 */
	ArrayList getListComboBox();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.DataformGenerator#getListComboBox <em>List Combo Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Combo Box</em>' attribute.
	 * @see #getListComboBox()
	 * @generated
	 */
	void setListComboBox(ArrayList value);

	/**
	 * Returns the value of the '<em><b>List Combo Cordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Combo Cordinate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Combo Cordinate</em>' attribute.
	 * @see #setListComboCordinate(ArrayList)
	 * @see pgr.domain.generators.GeneratorsPackage#getDataformGenerator_ListComboCordinate()
	 * @model dataType="pgr.datatypes.datatypesjavautil.ArrayList"
	 * @generated
	 */
	ArrayList getListComboCordinate();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.DataformGenerator#getListComboCordinate <em>List Combo Cordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Combo Cordinate</em>' attribute.
	 * @see #getListComboCordinate()
	 * @generated
	 */
	void setListComboCordinate(ArrayList value);

	/**
	 * Returns the value of the '<em><b>Merged Regions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merged Regions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merged Regions</em>' attribute.
	 * @see #setMergedRegions(ArrayList)
	 * @see pgr.domain.generators.GeneratorsPackage#getDataformGenerator_MergedRegions()
	 * @model dataType="pgr.datatypes.datatypesjavautil.ArrayList"
	 * @generated
	 */
	ArrayList getMergedRegions();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.DataformGenerator#getMergedRegions <em>Merged Regions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merged Regions</em>' attribute.
	 * @see #getMergedRegions()
	 * @generated
	 */
	void setMergedRegions(ArrayList value);

	/**
	 * Returns the value of the '<em><b>Coordenadas Inicio Contenedores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordenadas Inicio Contenedores</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordenadas Inicio Contenedores</em>' attribute.
	 * @see #setCoordenadasInicioContenedores(ArrayList)
	 * @see pgr.domain.generators.GeneratorsPackage#getDataformGenerator_CoordenadasInicioContenedores()
	 * @model dataType="pgr.datatypes.datatypesjavautil.ArrayList"
	 * @generated
	 */
	ArrayList getCoordenadasInicioContenedores();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.DataformGenerator#getCoordenadasInicioContenedores <em>Coordenadas Inicio Contenedores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordenadas Inicio Contenedores</em>' attribute.
	 * @see #getCoordenadasInicioContenedores()
	 * @generated
	 */
	void setCoordenadasInicioContenedores(ArrayList value);

	/**
	 * Returns the value of the '<em><b>Coordenadas Fin Contenedores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordenadas Fin Contenedores</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordenadas Fin Contenedores</em>' attribute.
	 * @see #setCoordenadasFinContenedores(ArrayList)
	 * @see pgr.domain.generators.GeneratorsPackage#getDataformGenerator_CoordenadasFinContenedores()
	 * @model dataType="pgr.datatypes.datatypesjavautil.ArrayList"
	 * @generated
	 */
	ArrayList getCoordenadasFinContenedores();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.DataformGenerator#getCoordenadasFinContenedores <em>Coordenadas Fin Contenedores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordenadas Fin Contenedores</em>' attribute.
	 * @see #getCoordenadasFinContenedores()
	 * @generated
	 */
	void setCoordenadasFinContenedores(ArrayList value);

	/**
	 * Returns the value of the '<em><b>Containers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containers</em>' attribute.
	 * @see #setContainers(ArrayList)
	 * @see pgr.domain.generators.GeneratorsPackage#getDataformGenerator_Containers()
	 * @model dataType="pgr.datatypes.datatypesjavautil.ArrayList"
	 * @generated
	 */
	ArrayList getContainers();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.DataformGenerator#getContainers <em>Containers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containers</em>' attribute.
	 * @see #getContainers()
	 * @generated
	 */
	void setContainers(ArrayList value);

	/**
	 * Returns the value of the '<em><b>The Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link pgr.domain.Domain#getTheDataformGenerator <em>The Dataform Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Domain</em>' container reference.
	 * @see #setTheDomain(Domain)
	 * @see pgr.domain.generators.GeneratorsPackage#getDataformGenerator_TheDomain()
	 * @see pgr.domain.Domain#getTheDataformGenerator
	 * @model opposite="theDataformGenerator"
	 * @generated
	 */
	Domain getTheDomain();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.DataformGenerator#getTheDomain <em>The Domain</em>}' container reference.
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t this.path = \"OpenXML/\"+ruta+\"/xl/\";\r\n\t this.absolutePath = as;\r\n\t \r\n\t reportName  = ruta;\r\n\t \r\n\t /*Inicializacion de las listas para evitar \r\n\t  *NullPointer Exception\r\n\t  \052/\r\n\t listTables = new ArrayList<String>();\r\n\t listComboBox = new ArrayList<String>();\r\n\t listComboCordinate = new ArrayList<pgr.domain.util.impl.CoordinateImpl>();\r\n\t containers = new ArrayList<GraphicalContainer>();\r\n\t coordenadasInicioContenedores = new ArrayList<pgr.domain.util.impl.CoordinateImpl>();\r\n\t coordenadasFinContenedores  = new ArrayList<pgr.domain.util.impl.CoordinateImpl>();\r\n\t \r\n\t comboNamesSorted = new ArrayList<String>();\r\n\t for (int i = 0; i < 100; i++) {\r\n\t\t comboNamesSorted.add(\"\");\r\n\t }\r\n\t coordenadasComboBox = new ArrayList<pgr.domain.util.impl.CoordinateImpl>();\r\n\t for (int i = 0; i < 100; i++) {\r\n\t\t pgr.domain.util.impl.CoordinateImpl c = (pgr.domain.util.impl.CoordinateImpl)\r\n\t\t\t\t pgr.domain.util.UtilFactory.eINSTANCE.createCoordinate();\r\n\t\t c.setX(0); c.setY(0);\r\n\t\t coordenadasComboBox.add(c);\r\n\t }'"
	 * @generated
	 */
	void DataformGenerator(String ruta, String as);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\t\t//Incializa la model factory y el diagrama para agregar elementos en el\r\n\t\t\tinit();\r\n\t\t\t\r\n\t\t\t//Se carga el excel a analizar\r\n\t\t\tjava.io.InputStream is;\r\n\t\t\ttry {\r\n\t\t\t\tis = new java.io.FileInputStream(absolutePath);\r\n\t\t\t\tworkbook = new XSSFWorkbook(is);\r\n\t\t\t\tsheet = workbook.getSheetAt(0);\r\n\t\t\t    \r\n\t\t\t    getOrderViewModel();\r\n\t\t\t    \r\n\t\t\t    amountContainers++;\r\n\t\t\t    \r\n\t\t\t    //Se realiza identifican y se agregan las mergedRegions\r\n\t\t\t    identifyMergedRegions();\r\n\t\t\t      \r\n\t\t\t\t//Identifica las tablas en el XML y obtiene sus dimenciones\r\n\t\t\t\tgetTables();\r\n\t\t\t\t\r\n\t\t\t\t//En el libro de visitados, marca dichas tablas para que no sean analizadas \r\n\t\t\t\t//en el metodo de getExtraInformation\r\n\t\t\t\tmarcarTablas(listTables);\r\n\t\t\t\t\r\n\t\t\t\t//Se encarga de indetificar los componentes restantes que estan en el excel\r\n\t\t\t\t//Ya sea contenedores, labels, combobox etc\r\n\t\t\t\tgetExtraInformation();\r\n\t\t\t\t\r\n\t\t\t\tsearchBegin();\r\n\t\t\t\t\r\n\t\t\t\t//Se salva la produccion  del dataform\r\n\t\t\t\tsalvarDF();\r\n\t\t\t\t\r\n\t\t\t} catch (java.io.FileNotFoundException e) {\r\n\t\t\t\t// TODO Auto-generated catch block\r\n\t\t\t\te.printStackTrace();\r\n\t\t\t} catch (java.lang.IndexOutOfBoundsException e) {\r\n\t\t\t\t// TODO Auto-generated catch block\r\n\t\t\t\tjavax.swing.JOptionPane.showMessageDialog(null, \"El excel debe estar etiquetado para poder capturar el modelo mental.\"\r\n\t\t\t\t\t\t  , null, javax.swing.JOptionPane.ERROR_MESSAGE);\r\n\t\t\t} catch (java.io.IOException e) {\r\n\t\t\t\t// TODO Auto-generated catch block\r\n\t\t\t\tjavax.swing.JOptionPane.showMessageDialog(null, \"Debe seleccionar primero el archivo al \"\r\n\t\t\t\t\t\t\t\t\t\t\t\t  + \"cual se le capturara el modelo mental.\"\r\n\t\t\t\t\t\t, null, javax.swing.JOptionPane.ERROR_MESSAGE);\r\n\t\t\t}'"
	 * @generated
	 */
	void generate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\torg.apache.poi.xssf.usermodel.XSSFRow r;\r\n\t\tXSSFCell c;\r\n\t\tfor(int i = 0; i < visitedCells.size(); i++) {\r\n\t\t\tr = sheet.getRow(i);\r\n\t\t\tif (r != null) {\r\n\t\t\t\tArrayList<Integer> aux = (ArrayList<Integer>)visitedCells.get(0);\r\n\t\t\t\tfor(int j = 0; j < aux.size(); j++) {\r\n\t\t\t\t\tc = r.getCell(j);\r\n\t\t\t\t\tif(c != null) {\r\n\t\t\t\t\t\tc.setCellType(XSSFCell.CELL_TYPE_STRING);\r\n\t\t\t\t\t\tif(c.getStringCellValue().equals(\"<start>\")) {\r\n\t\t\t\t\t\t\tdataStartRow = i;\r\n\t\t\t\t\t\t\tdataStartCell = j;\r\n\t\t\t\t\t\t}\r\n\t\t\t\t\t}\r\n\t\t\t\t}\r\n\t\t\t}\r\n\t\t\t\r\n\t\t}\r\n\t'"
	 * @generated
	 */
	void searchBegin();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model graphicalContainerDataType="pgr.datatypes.datatypesdataform.GraphicalContainer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tgraphicalContainer.setWidth(new Integer(width));\r\n\t\tgraphicalContainer.setHeight(new Integer(height));\r\n\t\tgraphicalContainer.setPositionX(x);\r\n\t\tgraphicalContainer.setPositionY(y);\r\n\t'"
	 * @generated
	 */
	void setBoundsGraphicalContainer(GraphicalContainer graphicalContainer, int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model cDataType="pgr.datatypes.datatypesdataform.Containment"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tc.setAMultiplicidad(tooldataform.pmoo.Cardinalidad.N);\r\n\t\tc.setBMultiplicidad(tooldataform.pmoo.Cardinalidad.N);\r\n\t\tc.setANavegable(tooldataform.pmoo.Valores.SI);\r\n\t\tc.setBNavegable(tooldataform.pmoo.Valores.SI);\r\n\t\tc.setBinding(tooldataform.pmoo.Valores.SI);\r\n\t\tc.setARol(\"ownedByTable\"+name);\r\n\t\tc.setBRol(\"listTable\"+name);\r\n\t\tc.setName(\"name\"+name);\r\n\t'"
	 * @generated
	 */
	void setAtributesContaimentRelation(Containment c, String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\tadjacenciesX = new ArrayList<Integer>();\r\n\tadjacenciesX.add(new Integer(1));\r\n\tadjacenciesX.add(new Integer(-1));\r\n\tadjacenciesX.add(new Integer(0));\r\n\tadjacenciesX.add(new Integer(0));\r\n\t\r\n\tadjacenciesY = new ArrayList<Integer>();\r\n\tadjacenciesY.add(new Integer(0));\r\n\tadjacenciesY.add(new Integer(0));\r\n\tadjacenciesY.add(new Integer(1));\r\n\tadjacenciesY.add(new Integer(-1));\r\n\t\r\n\t/*Obtiene la dimenscion del excel\r\n\t *formato de la dimension\r\n\t *ejemplo: A3:D7\r\n\t \052/\r\n\tdimens = getDimention();\r\n\t\r\n\tString inicio = dimens.split(\":\")[0];\r\n\tString fin = \tdimens.split(\":\")[1];\r\n\t\r\n\t//Se obtienen las dimensiones de la matriz de visitados\r\n\tint w = toInt(stractColumn(fin)); \r\n\tint h = ( Integer.parseInt(capturarNumeros(fin)));\r\n\t\r\n\tvisitedCells = new ArrayList<ArrayList<Integer>>();\r\n\tfor (int i = 0; i < h + 1; i++) {\r\n\t\tArrayList<Integer> aux = new ArrayList<Integer>();\r\n\t\tfor (int j = 0; j < w + 1; j++) {\r\n\t\t\taux.add(new Integer(0));\r\n\t\t}\r\n\t\tvisitedCells.add(aux);\r\n\t}\r\n\r\n\t\r\n\t\r\n\tamountContainers = 0;\r\n\t\r\n\t//Se obtienen las coordenandas relativas\r\n\tpgr.domain.util.impl.CoordinateImpl coordinate = (pgr.domain.util.impl.CoordinateImpl) getCoordinates(inicio);\r\n\trelativeX = coordinate.getX();   relativeY = coordinate.getY();\r\n\r\n\t//Se instancian los objetos necesarios para crear la produccion\r\n\tmodelFactory    = tooldataform.TooldataformFactory.eINSTANCE.createModelFactory();\r\n\tproject         = tooldataform.core.CoreFactory.eINSTANCE.createProject();\r\n\tdataformDiagram = tooldataform.formmodel.concreta.ConcretaFactory.eINSTANCE.createDataForm_Diagram();\r\n\tdomainDiagram   = tooldataform.core.CoreFactory.eINSTANCE.createDomain_Diagram();\r\n\tinterface1      = tooldataform.formmodel.concreta.ConcretaFactory.eINSTANCE.createInterface();\r\n\tcontainer       = tooldataform.formmodel.concreta.ConcretaFactory.eINSTANCE.createContainer();\r\n\tcontainer.setName(reportName);\r\n\t\r\n\t//Se dan las dimensiones y ubicacion de la interfaz\r\n\tsetBoundsGraphicalContainer(interface1, 10, 10 , 850, 850);\t\r\n\tsetBoundsGraphicalContainer(container, 15, 15, 800, 700);\r\n\t\r\n\t/*Se relacionan adecuadamente los objetos incializados anteriormente\r\n\t *Para generar un dataform sin errores\r\n\t \052/\r\n\tdataformDiagram.setTheInterface(interface1);\r\n\tdataformDiagram.setOwnedByProject(project);\r\n\tdataformDiagram.setItsDiagram(domainDiagram);\r\n\tdataformDiagram.setName(\"model.tooldataform_diagram\");\r\n\t\r\n\tdomainClass = tooldataform.pmoo.PmooFactory.eINSTANCE.createClase();\r\n\tdomainClass.setName(\"Domain\");\r\n\tdomainDiagram.getListClase().add(domainClass);\r\n\t\r\n\tproject.getListDiagram().add(domainDiagram);\r\n\tproject.getListDataFormDiagram().add(dataformDiagram);\r\n\tproject.setTheModelFactory(modelFactory);\r\n\t\r\n\tinterface1.getListGraphicalContainer().add(container);\r\n\tinterface1.setName(reportName);\r\n\tmodelFactory.getListProyecto().add(project);'"
	 * @generated
	 */
	void init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tdataformDiagram.setTheInterface(null);\r\n\t\tsalvarDF();\r\n\t'"
	 * @generated
	 */
	void resetDataform();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='               /*Se obtiene la ultima fila a analizar\r\n\t *de la hoja\r\n\t \052/\r\n\tint nmax = sheet.getLastRowNum()+1;\r\n\t\r\n\t//Objeto necesario para obtener una celda en el excel\r\n\tXSSFCell c;\r\n\t//Obejto necesario para obtener una fila en el excel\r\n\torg.apache.poi.xssf.usermodel.XSSFRow r = null;\r\n\t\r\n\tamountCombos = 0;\r\n\t//Recorre la hoja hasta encontrar el primer Combo\r\n\tfor (int i = 0; i <nmax; i++) {\r\n\t\tr =  sheet.getRow(i);\r\n    \tif(r == null) continue;\r\n    \tfor (int j = 0; j <r.getLastCellNum(); j++) {\r\n    \t\tc = r.getCell(j);\r\n            \r\n    \t\tif(c != null && getCellValue(c).contains(\"*\") ) { \r\n            \t//Es combo          \t\t    \t\t\t\r\n    \t\t\tint id = Integer.parseInt( getCellValue(c).substring(2,getCellValue(c).length() -1 ) );\r\n    \t\t\t\r\n    \t\t\t//listComboCordinate.add(new Coordinate(i, j-1));\r\n    \t\t\tamountContainers++;\r\n    \t\t\tArrayList<Integer> aux = (ArrayList<Integer>) visitedCells.get(i);\r\n    \t\t\taux.set(j, amountContainers);\r\n    \t\t\taux.set(j-1, amountContainers);\r\n    \t\t\t\r\n    \t\t\tc = r.getCell(j-1);\r\n    \t\t\t\r\n    \t\t\tcomboNamesSorted.set(id-1, getCellValue(c));\r\n    \t\t\tcoordenadasComboBox.set(id-1, createCoordinate(i, j));\r\n    \t\t\t\r\n    \t\t\tcoordenadasInicioContenedores.add(createCoordinate(i, j-1));\r\n    \t    \tcoordenadasFinContenedores.add(createCoordinate(i, j));\r\n    \t\t\t\r\n    \t    \ttooldataform.formmodel.concreta.ComboView combo =  tooldataform.formmodel.concreta.ConcretaFactory.eINSTANCE.createComboView();\r\n    \t\t\tcombo.setName(getCellValue(c));\r\n    \t\t\tsetBoundsGraphicalContainer(combo, 0 , 0, 240, 20);\r\n    \t\t\ttooldataform.formmodel.concreta.ItemCombo item = tooldataform.formmodel.concreta.ConcretaFactory.eINSTANCE.createItemCombo();\r\n    \t\t\titem.setName(\"nombre\");\r\n    \t\t\tcombo.setTheItem(item);\r\n    \t\t\tcontainer .getListGraphicalContainer().add(combo);\r\n    \t\t\tamountCombos++;\r\n            }\r\n        }\r\n    }\r\n\t\r\n\tfor(int i=0;i < amountCombos ;i++ ){\r\n    \tlistComboBox.add((String) comboNamesSorted.get(i));\r\n\t   \tlistComboCordinate.add((pgr.domain.util.impl.CoordinateImpl) coordenadasComboBox.get(i));\r\n\t}\r\n\t\t\t\t\r\n\t\t\t\r\n\t'"
	 * @generated
	 */
	void getOrderViewModel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='        //Se recorre la hoja para extraer la futura \r\n        recorrerHoja();\r\n\t'"
	 * @generated
	 */
	void getExtraInformation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\t\t\t\t\t\t\t\t\r\n\t\t//Obtiene la lista de merged regions de la hoja\r\n\t\tList sortedRegions = sheet.getMergedRegions();\r\n\t\r\n\t\t//Ordenamos de mayor a menor las regiones con respecto a las filas\r\n\t\tpgr.domain.util.impl.ComparatorRangeImpl c = (pgr.domain.util.impl.ComparatorRangeImpl) pgr.domain.util.UtilFactory.eINSTANCE.createComparatorRange();\r\n\t\tjava.util.Collections.sort(sortedRegions, c );\r\n\t\t\r\n\t\t//Inicializamos la estructura de datos que se tiene por conveniencia\r\n\t\t//y facilidad para manejar las regiones combinadas\r\n\t\tInitMergedRegions(sortedRegions);\r\n\t\t\r\n\t\t//Se expoloran todas las regiones de la hoja\r\n\t\tfor(int i=0;i<sortedRegions.size();i++){\r\n\t\t\torg.apache.poi.ss.util.CellRangeAddress range = (org.apache.poi.ss.util.CellRangeAddress) sortedRegions.get(i);  \r\n\t\t\tArrayList<Integer> aux = (ArrayList<Integer>) visitedCells.get(range.getFirstRow());\r\n\t\t\tif(aux.get(range.getFirstColumn()) == 0){\r\n\t\t\t\r\n\t\t\t\tString textRange = sheet.getRow(range.getFirstRow()).getCell(range.getFirstColumn()).getStringCellValue();\r\n\t\t\t\tMergedRegion mergeRegion = pgr.domain.util.UtilFactory.eINSTANCE.createMergedRegion();\r\n\t\t\t\tmergeRegion.MergedRegion(textRange, range.getFirstColumn(), range.getLastColumn(), \r\n\t\t\t\t\t\trange.getFirstRow(), range.getLastRow());\r\n\t\t\t\t\r\n\t\t\t\tcontainerEndRow= range.getFirstRow();\r\n\t\t\t\tcontainerEndCell= range.getFirstColumn();\r\n\t\t\t\t\r\n\t\t\t\tGraphicalContainer container = exploreMergedRegions(mergeRegion);\r\n\t\t\t\t\r\n\t\t\t\tthis.container.getListGraphicalContainer().add(container);\r\n\t\t\t\tcoordenadasInicioContenedores.add(createCoordinate(range.getFirstRow(), range.getFirstColumn()));\r\n\t\t\t\tcoordenadasFinContenedores.add(createCoordinate(containerEndRow, containerEndCell));\r\n\t\t\t\tvisitRegion(mergeRegion);\r\n\t\t\t\tamountContainers++;\r\n\t\t\t}\t\r\n\t\t}\r\n\t\r\n\t'"
	 * @generated
	 */
	void identifyMergedRegions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tArrayList<MergedRegion> aux = (ArrayList<MergedRegion>) mergedRegions.get(nextRow);\r\n\t\tfor(int j=0; j < aux.size(); j++){\r\n\t\t\t\r\n\t\t\tMergedRegion nextMergeRegion = aux.get(j);\r\n\t\t\t\r\n\t\t\tif(nextMergeRegion.getFirstColumn() >= range.getFirstColumn() \r\n\t\t\t\t\t&& nextMergeRegion.getFirstColumn() <= range.getLastColumn()) {\r\n\t\t\t\t\r\n\t\t\t\treturn true;\r\n\t\t\t}\r\n\t\t}\r\n\t\treturn false;\r\n\t'"
	 * @generated
	 */
	boolean searchMergeRegion(MergedRegion range, int nextRow);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="pgr.datatypes.datatypesdataform.GraphicalContainer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\t\t\t\r\n\t\tGraphicalContainer container =  tooldataform.formmodel.concreta.ConcretaFactory.eINSTANCE.createContainer();\r\n\t\tcontainer.setName(range.getText());\r\n\t\tint firstRow = range.getFirstRow(), lastRow = range.getLastRow();\r\n\t\tint firstColumn = range.getFirstColumn(), lastColumn = range.getLastColumn();\r\n\t\tint nextRow = firstRow + (lastRow - firstRow+ 1);\r\n\t\t\r\n\t\tArrayList<MergedRegion> aux = (ArrayList<MergedRegion>) mergedRegions.get(nextRow);\r\n\t\tif(aux.size() == 0 || !searchMergeRegion(range, nextRow)) {\r\n\t\t\t\r\n\t\t\tArrayList<String> columns = getTableColumns(range, nextRow);\r\n\t\t\tTableView table = createTable(range, columns);\r\n\t\t\tcontainer.getListGraphicalContainer().add(table);\r\n\t\t\tint deep = visitTable(range);\r\n\t\t\tsetBoundsGraphicalContainer(table, 15, 15, columns.size()*100 , (deep-range.getFirstRow())*20);\r\n\t\t\t\r\n\t\t\ttooldataform.formmodel.concreta.Containment c = tooldataform.formmodel.concreta.ConcretaFactory.eINSTANCE.createContainment();\r\n\t\t\tsetAtributesContaimentRelation(c,\"\");\r\n\t\t\t\r\n\t\t\t//Se agrega el source y target de la relacion\r\n\t\t\tc.getSource().add(container);\r\n\t\t\tc.getTarget().add(table);\r\n\t\t\t\r\n\t\t\tsetBoundsGraphicalContainer(container, 15, 15 ,  table.getWidth() + 40 , table.getHeight() + 40);\r\n\t\t\treturn container;\r\n\t\t}\r\n\t\t\r\n\t\taux = (ArrayList<MergedRegion>) mergedRegions.get(nextRow);\r\n\t\tfor(int i=0; i < aux.size();i++) {\r\n\t\t\t\r\n\t\t\tMergedRegion nextMergeRegin = aux.get(i);\r\n\t\t\t\r\n\t\t\tif(nextMergeRegin.getFirstColumn()>=firstColumn && nextMergeRegin.getLastColumn()<=lastColumn){\r\n\t\t\t\t\r\n\t\t\t\tif(!isTableColumn(nextMergeRegin)){ \r\n\t\t\t\t\t//sevisita\r\n\t\t\t\t\tvisitRegion(nextMergeRegin);\r\n\t\t\t\t\tGraphicalContainer subContainer = exploreMergedRegions(nextMergeRegin);\r\n\t\t\t\t\tcontainer.getListGraphicalContainer().add(subContainer);\r\n\t\t\t\t\t\r\n\t\t\t\t} else {\r\n\t\t\t\t\t\r\n\t\t\t\t\t//Se construye la tabla\r\n\t\t\t\t\t//Se visita las tuplas de la tabla y los encabezaos\r\n\t\t\t\t\t//Se agrega al contenedor y se retorna\r\n\t\t\t\t\t\r\n\t\t\t\t\tArrayList<String> columns = getTableColumns(range, nextRow);\r\n\t\t\t\t\tTableView table = createTable(range, columns);\r\n\t\t\t\t\t\r\n\t\t\t\t\tcontainer.getListGraphicalContainer().add(table);\r\n\t\t\t\t\tint deep = visitTable(range);\r\n\t\t\t\t\tsetBoundsGraphicalContainer(table, 15, 15, columns.size()*100 , (deep-range.getFirstRow())*20);\r\n\t\t\t\t\t\r\n\t\t\t\t\ttooldataform.formmodel.concreta.Containment c = tooldataform.formmodel.concreta.ConcretaFactory.eINSTANCE.createContainment();\r\n\t\t\t\t\tsetAtributesContaimentRelation(c,\"\");\r\n\t\t\t\t\t\r\n\t\t\t\t\t//Se agrega el source y target de la relacion\r\n\t\t\t\t\tc.getSource().add(container);\r\n\t\t\t\t\tc.getTarget().add(table);\r\n\t\t\t\t\t\r\n\t\t\t\t\tsetBoundsGraphicalContainer(container, 15, 15 ,  table.getWidth() + 40 , table.getHeight() + 40);\r\n\t\t\t\t\tbreak;\r\n\t\t\t\t}\r\n\t\t\t}\r\n\t\t}\r\n\t\t\r\n\t\tint x  = container.getListGraphicalContainer().get(0).getWidth();\r\n\t\tint y  = container.getListGraphicalContainer().get(0).getPositionY();\r\n\t\t\r\n\t\tx+= 15; y+= 15;\r\n\t\t\r\n\t\r\n\t\tfor(int i = 1  ;i < container.getListGraphicalContainer().size();i++){\r\n\t\t\tx+=40;\r\n\t\t\tcontainer.getListGraphicalContainer().get(i).setPositionX(x);\r\n\t\t\tx+= container.getListGraphicalContainer().get(i).getWidth();\r\n\t\t\ty = Math.max(y,  container.getListGraphicalContainer().get(i).getHeight());\r\n\t\t}\r\n\t\t\r\n\t\tx+=15;\r\n\t\t\r\n\t\tif(container.getListGraphicalContainer().size()>1)\r\n\t\t\tsetBoundsGraphicalContainer(container, 15, 15, x, y);\r\n\t\t\r\n\t\treturn container;\r\n\t'"
	 * @generated
	 */
	GraphicalContainer exploreMergedRegions(MergedRegion range);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\t\r\n\t\tint fila=  region.getFirstRow();\r\n\t\torg.apache.poi.xssf.usermodel.XSSFRow r = sheet.getRow(fila);\r\n\t\t\r\n\t\tint columa = region.getFirstColumn();\r\n\t\tXSSFCell c;\r\n\t\twhile(r!=null){\r\n\t\t\tc = r.getCell(columa);\r\n\t\t\tif(c==null)\r\n\t\t\t\tbreak;\r\n\t\t\t\r\n\t\t\tArrayList<Integer> aux = (ArrayList<Integer>) visitedCells.get(fila);\r\n\t\t\tfor(int i=columa; i <= region.getLastColumn();i++){\r\n\t\t\t\taux.set(i, amountContainers);\r\n\t\t\t\tcontainerEndRow = fila;\r\n\t\t\t\tcontainerEndCell = i;\r\n\t\t\t}\r\n\t\t\tr = sheet.getRow(++fila);\r\n\t\t}\r\n\t\treturn fila;\r\n\t'"
	 * @generated
	 */
	int visitTable(MergedRegion region);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="pgr.datatypes.datatypesjavautil.ArrayList"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\t\r\n\t\tArrayList<String> columns = new ArrayList<String>();\r\n\t\tString column;\r\n\t\t\r\n\t\tint i = region.getFirstColumn();\r\n\t\twhile (i <= region.getLastColumn()) {\r\n\t\t\t\r\n\t\t\tcolumn = sheet.getRow(nextRow).getCell(i).getStringCellValue();\r\n\t\t\tcolumns.add(column);\r\n\t\t\t\r\n\t\t\tif(isCellRange(nextRow, i)) {\r\n\t\t\t\tArrayList<MergedRegion> aux = (ArrayList<MergedRegion>) mergedRegions.get(nextRow);\r\n\t\t\t\tfor(int j=0; j < aux.size(); j++){\r\n\t\t\t\t\t\r\n\t\t\t\t\tMergedRegion nextMergeRegion = aux.get(j);\r\n\t\t\t\t\t\r\n\t\t\t\t\tif(nextMergeRegion.getFirstColumn()==i){\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\tif(nextMergeRegion.getFirstColumn() == nextMergeRegion.getLastColumn()) {\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\ti++;\r\n\t\t\t\t\t\t\tbreak;\r\n\t\t\t\t\t\t}\t\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\ti += nextMergeRegion.getLastColumn() - i + 1;\r\n\t\t\t\t\t\tbreak;\r\n\t\t\t\t\t}\r\n\t\t\t\t}\r\n\t\t\t\t\r\n\t\t\t} else {\r\n\t\t\t\t\r\n\t\t\t\ti++;\r\n\t\t\t}\r\n\t\t}\r\n\t\t\r\n\t\treturn columns;\r\n\t'"
	 * @generated
	 */
	ArrayList getTableColumns(MergedRegion region, int nextRow);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="pgr.datatypes.datatypesqm.TableView" columnsDataType="pgr.datatypes.datatypesjavautil.ArrayList"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='//Se crea  la instancia de la tabla\r\n\t\t\t\tTableView table = tooldataform.formmodel.concreta.ConcretaFactory.eINSTANCE.createTableView();\r\n\t\t\t\ttable.setName(region.getText());\r\n\t\t\t\t\r\n\t\t\t\t//Se agregan las colummnas a la tabla\r\n\t\t\t\tfor(int j=0;j<columns.size();j++){\r\n\t\t\t\t\ttooldataform.formmodel.concreta.ColumView c= tooldataform.formmodel.concreta.ConcretaFactory.eINSTANCE.createColumView();\r\n\t\t\t\t\tc.setName((String)columns.get(j));\r\n\t\t\t\t\ttable.getListColumView().add(c);\r\n\t\t\t\t}\r\n\t\t\t\t\r\n\t\t\t\treturn table;'"
	 * @generated
	 */
	TableView createTable(MergedRegion region, ArrayList columns);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\t\r\n\t\tint firstRow = mergeRegion.getFirstRow(), lastRow = mergeRegion.getLastRow();\r\n\t\tint firstColumn = mergeRegion.getFirstColumn(), lastColumn = mergeRegion.getLastColumn();\r\n\t\tint nextRow = firstRow + (lastRow - firstRow + 1);\r\n\t\t\r\n\t\tArrayList<MergedRegion> aux = (ArrayList<MergedRegion>) mergedRegions.get(nextRow);\r\n\t\tfor(int i=0; i< aux.size();i++){\r\n\t\t\t\r\n\t\t\tMergedRegion nextMergeRegin = aux.get(i);\r\n\t\t\tif(nextMergeRegin.getFirstColumn()==firstColumn &&  nextMergeRegin.getLastColumn()==lastColumn){\r\n\t\t\t\t\r\n\t\t\t\treturn true;\r\n\t\t\t}\r\n\t\t}\r\n\t\t\r\n\t\tif(firstColumn == lastColumn) return true;\r\n\t\t\r\n\t\treturn false;'"
	 * @generated
	 */
	boolean isTableColumn(MergedRegion mergeRegion);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tArrayList<Integer> aux = (ArrayList<Integer>) visitedCells.get(i);\r\n\t\tif(aux.get(j) >= 1 && aux.get(j) <= amountTables)\r\n\t\t\treturn true;\r\n\t\treturn false;'"
	 * @generated
	 */
	boolean isTable(int i, int j);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tfor(int i = mergeRegion.getFirstRow(); i <= mergeRegion.getLastRow(); i++) {\r\n\t\t\tArrayList<Integer> aux = (ArrayList<Integer>) visitedCells.get(i);\r\n\t\t\tfor(int j = mergeRegion.getFirstColumn(); j <= mergeRegion.getLastColumn(); j++)\r\n\t\t\t\taux.set(j, amountContainers);\r\n\t\t}'"
	 * @generated
	 */
	void visitRegion(MergedRegion mergeRegion);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model sortedRegionsDataType="pgr.datatypes.datatypesjavautil.List" sortedRegionsMany="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if(sortedRegions.size()==0)\r\n\t\t\treturn;\r\n\t\tmergedRegions = new ArrayList<ArrayList<MergedRegion>>();\r\n\t\tfor (int i = 0; i < ((org.apache.poi.ss.util.CellRangeAddressBase) sortedRegions.get(sortedRegions.size()-1)).getLastRow()+10; i++) {\r\n\t\t\tmergedRegions.add(new ArrayList<MergedRegion>());\r\n\t\t}\r\n\t\t\r\n\t\tfor(int i=0;i< sortedRegions.size();i++){\r\n\t\t\torg.apache.poi.ss.util.CellRangeAddress range = (org.apache.poi.ss.util.CellRangeAddress) sortedRegions.get(i);\r\n\t\t\t\r\n\t\t\tString text = sheet.getRow(range.getFirstRow()).getCell(range.getFirstColumn()).getStringCellValue();\r\n\t\t\tArrayList<MergedRegion> aux = (ArrayList<MergedRegion>) mergedRegions.get(range.getFirstRow());\r\n\t\t\tMergedRegion mergeRegion = pgr.domain.util.UtilFactory.eINSTANCE.createMergedRegion();\r\n\t\t\tmergeRegion.MergedRegion(text, range.getFirstColumn(), range.getLastColumn(), \r\n\t\t\t\t\trange.getFirstRow(), range.getLastRow());\r\n\t\t\taux.add(mergeRegion);\r\n\t\t}\t\r\n\t'"
	 * @generated
	 */
	void InitMergedRegions(List sortedRegions);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\t\r\n\t\tArrayList<MergedRegion> aux = (ArrayList<MergedRegion>) mergedRegions.get(i);\r\n\t\tif(aux.size()!=0){\r\n\t\t\tfor(int j=0;j<aux.size();j++){\r\n\t\t\t\tif(aux.get(j).getFirstColumn()<= l && aux.get(j).getLastColumn() >= l )\r\n\t\t\t\t\treturn true;\r\n\t\t\t}\r\n\t\t}\r\n\t\treturn false;\r\n\t'"
	 * @generated
	 */
	boolean isCellRange(int i, int l);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\t\r\n\t\t//Carga el xml del excel\r\n\t\torg.w3c.dom.Document doc = getXML(path+\"worksheets/sheet1.xml\");\r\n\t\tdoc.getDocumentElement().normalize();\r\n\t\t\r\n\t\t//Obtiene el tag Dimension\r\n\t\torg.w3c.dom.NodeList nList = doc.getElementsByTagName(\"dimension\");\r\n\t\torg.w3c.dom.Node node = nList.item(0);\r\n\t\tString s=\"\";\r\n\t\tif(node.getNodeType()==org.w3c.dom.Node.ELEMENT_NODE){\r\n\t\t\torg.w3c.dom.Element e = (org.w3c.dom.Element)node;\r\n\t\t\ts = e.getAttribute(\"ref\");\r\n\t\t}\r\n\t\treturn s;\r\n\t'"
	 * @generated
	 */
	String getDimention();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\t\r\n\t\t\r\n\t\t//Carga el xml del excel\r\n\t\torg.w3c.dom.Document doc = getXML(path+\"worksheets/sheet1.xml\");\r\n\t\tdoc.getDocumentElement().normalize();\t\r\n\t\t\r\n\t\t//Obtiene el tag que contiene la lista de tablas\r\n\t\torg.w3c.dom.NodeList nList = doc.getElementsByTagName(\"tablePart\");\r\n\t\t\r\n\t\treturn nList.getLength();\r\n\t'"
	 * @generated
	 */
	int getNumberTables();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\t\r\n\t\t//Obtiene el numero de tablas a agregar al dataform\r\n\t\tint n = getNumberTables();\r\n\t\tamountTables =n;\r\n\t\t//Documento xml del excel\r\n\t\torg.w3c.dom.Document doc;\r\n\t\tfor(int i=1;i<=n;i++){\r\n\t\t\t\r\n\t\t\t//Se crea el container que contendr? la tabla\r\n\t\t\ttooldataform.formmodel.concreta.Container containerTablas = tooldataform.formmodel.concreta.ConcretaFactory.eINSTANCE.createContainer();\r\n\t\t\tcontainerTablas.setName(\"Table\"+i);\r\n\t\t\t\r\n\t\t\t//Se lee el archivo xml relacionado con la tabla a analizar\r\n\t\t\tdoc = getXML(path +\"tables/table\"+i+\".xml\");\r\n\t\t\t\r\n\t\t\t//Se obtiene la dimension de la tabla\r\n\t\t\tString s=\"\";\r\n\t\t\torg.w3c.dom.NodeList es = doc.getElementsByTagName(\"autoFilter\");\r\n\t\t\torg.w3c.dom.Node node = es.item(0);\r\n\t\t\tif(node.getNodeType()==org.w3c.dom.Node.ELEMENT_NODE){\r\n\t\t\t\torg.w3c.dom.Element e = (org.w3c.dom.Element)node;\r\n\t\t\t\ts = e.getAttribute(\"ref\");\r\n\t\t\t\tlistTables.add(s);\r\n\t\t\t}\r\n\t\t\t\r\n\t\t\t//Se extrae la dimencion de la tabla\r\n\t\t\tString inicio = s.split(\":\")[0];\r\n\t\t\tString fin = \ts.split(\":\")[1];\r\n\t\t\t\r\n\t\t\r\n\t\t\t//Se obtienen las coordenandas y el size de la tabla\r\n\t\t\tpgr.domain.util.impl.CoordinateImpl coordinates=  (pgr.domain.util.impl.CoordinateImpl) getCoordinates(inicio);\r\n\t\t\tpgr.domain.util.impl.CoordinateImpl size = (pgr.domain.util.impl.CoordinateImpl) getSizes(inicio, fin);\r\n\t\t\tcoordenadasInicioContenedores.add(coordinates);\r\n\t\t\tcoordenadasFinContenedores.add( getCoordinates(fin));\r\n\t\t\t\r\n\t\t\t//Se obtienen las columnas\r\n\t\t\torg.w3c.dom.NodeList nList = doc.getElementsByTagName(\"tableColumn\");\r\n\t\t\tArrayList<String> columnas = new ArrayList<String>();\t\t\t\r\n\t\t\tfor (int j = 0; j < nList.getLength(); j++) {\r\n\t\t\t\torg.w3c.dom.Node nNode = nList.item(j);\r\n\t\t\t\tif(nNode.getNodeType()==org.w3c.dom.Node.ELEMENT_NODE){\r\n\t\t\t\t\torg.w3c.dom.Element e = (org.w3c.dom.Element)nNode;\r\n\t\t\t\t\tcolumnas.add(e.getAttribute(\"name\"));\r\n\t\t\t\t}\r\n\t\t\t}\r\n\t\t\t\r\n\t\t\t//Se crea  la instancia de la tabla\r\n\t\t\tTableView tb = tooldataform.formmodel.concreta.ConcretaFactory.eINSTANCE.createTableView();\r\n\t\t\ttb.setName(\"Table\"+i);\r\n\t\t\t\r\n\t\t\t//Se agregan las colummnas a la tabla\r\n\t\t\tfor(int j=0;j<columnas.size();j++){\r\n\t\t\t\ttooldataform.formmodel.concreta.ColumView c = tooldataform.formmodel.concreta.ConcretaFactory.eINSTANCE.createColumView();\r\n\t\t\t\tc.setName(columnas.get(j));\r\n\t\t\t\ttb.getListColumView().add(c);\r\n\t\t\t}\r\n\t\t\t\r\n\t\t\t//Se setean las dimensiones y posicion de la tabla\r\n\t\t\tsetBoundsGraphicalContainer(tb, 15, 15, size.getX()+10, size.getY());\r\n\t\t\t\r\n\t\t\t//Se setean las dimensiones y posicion del contenedor\r\n\t\t\tsetBoundsGraphicalContainer(containerTablas,coordinates.getX() - relativeX , coordinates.getY() - relativeY ,size.getX() + 40, size.getY() + 40);\r\n\t\t\t\r\n\t\t\t//Se agrega la tabla al contenedor\r\n\t\t\tcontainerTablas.getListGraphicalContainer().add(tb);\r\n\t\t\t\r\n\t\t\t//Se crea la relacion de contaiment para que la tabla se pueda visualizar\r\n\t\t\ttooldataform.formmodel.concreta.Containment c = tooldataform.formmodel.concreta.ConcretaFactory.eINSTANCE.createContainment();\r\n\t\t\tsetAtributesContaimentRelation(c,\"\" + i);\r\n\t\t\t\r\n\t\t\t//Se agrega el source y target de la relacion\r\n\t\t\tc.getSource().add(containerTablas);\r\n\t\t\tc.getTarget().add(tb);\r\n\t\t\t\r\n\t\t\t//Se agrega la relacion  al diagrama\r\n\t\t\tdataformDiagram.getListarelacion().add(c);\r\n\t\t\t\r\n\t\t\tcontainers.add(containerTablas);\r\n\t\t\t//Se agrega el contendor a la interfaz \r\n\t\t\tcontainer.getListGraphicalContainer().add(containerTablas);\r\n\t\t}\t\t\r\n\r\n\t'"
	 * @generated
	 */
	void getTables();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\torg.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI(\"platform:/resource/PGR/domain/model.tooldataform\");\r\n\t\torg.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();\r\n\t\torg.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);\r\n\t\tresource.getContents().add(modelFactory);\r\n\t\ttry {\r\n\t\t\tresource.save(java.util.Collections.EMPTY_MAP);\r\n\t\t} catch (java.io.IOException e) {\r\n\t\t\te.printStackTrace();\r\n\t\t}\r\n\r\n\t'"
	 * @generated
	 */
	void salvarDF();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="pgr.datatypes.Document"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\t\t\ttry {\r\n\t\t\t\t\tjava.io.File fXmlFile = new java.io.File(url);\r\n\t\t\t\t\tjavax.xml.parsers.DocumentBuilderFactory dbFactory = javax.xml.parsers.DocumentBuilderFactory.newInstance();\r\n\t\t\t\t\tjavax.xml.parsers.DocumentBuilder dBuilder;\r\n\t\t\t\t\t\r\n\t\t\t\t\tdBuilder = dbFactory.newDocumentBuilder();\r\n\t\t\t\t\torg.w3c.dom.Document doc;\r\n\t\t\t\t\tdoc = dBuilder.parse(fXmlFile);\r\n\t\t\t\t\t\r\n\t\t\t\t\treturn doc;\r\n\t\t\t\t} catch (javax.xml.parsers.ParserConfigurationException e) {\r\n\t\t\t\t\t// TODO Auto-generated catch block\r\n\t\t\t\t\te.printStackTrace();\r\n\t\t\t\t}catch (org.xml.sax.SAXException | java.io.IOException e) {\r\n\t\t\t\t\t// TODO Auto-generated catch block\r\n\t\t\t\t\tjavax.swing.JOptionPane.showMessageDialog(null, \"Debe seleccionar primero el archivo al \"\r\n\t\t\t\t\t\t\t  + \"cual se le capturara el modelo mental.\"\r\n\t\t\t\t\t\t\t  , null, javax.swing.JOptionPane.ERROR_MESSAGE);\r\n\t\t\t\t}\r\n\t\t\t\t\r\n\t\t\t\treturn null;'"
	 * @generated
	 */
	Document getXML(String url);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model sizesDataType="pgr.datatypes.datatypesjavautil.ArrayList"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n       \r\n        for(int i=0;i<sizes.size();i++){\r\n        \t//Se obtiene la dimension de la tabla que viene en formato \"CeldaInicio:CeldaFinal\" ejemplo: C1:P44\r\n        \tString inicio = ( (String) sizes.get(i) ).split(\":\")[0], fin = ( (String) sizes.get(i) ).split(\":\")[1];\r\n        \t\r\n        \t\r\n        \t//Se recorre las filas de la dimension\r\n        \tfor(int  j = Integer.parseInt(capturarNumeros(inicio))-1 ; j <Integer.parseInt(capturarNumeros(fin)) ;j++){\r\n        \t\t\r\n        \t\t//Se obtiene la columna inicial y final\r\n        \t\tint wf= toInt(stractColumn(fin))-1;\r\n        \t\tint wi = toInt(stractColumn(inicio))-1;\r\n        \t\t\r\n        \t\t//Se recorre las columnas de la dimension\r\n        \t\tArrayList<Integer> aux = (ArrayList<Integer>) visitedCells.get(j);\r\n        \t\tfor(int k = wi; k <= wf;k++ ){\r\n        \t\t\taux.set(k, amountContainers);\r\n        \t\t}\r\n        \t}\r\n        \tamountContainers++;\r\n        }\r\n\t'"
	 * @generated
	 */
	void marcarTablas(ArrayList sizes);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\t\r\n\t\tfor(int i=0;i<coordenadasInicioContenedores.size();i++){\r\n\t\t\t\r\n\t\t\tint x = ((pgr.domain.util.impl.CoordinateImpl) coordenadasInicioContenedores.get(i) ).getX();\r\n\t\t\tint y = ((pgr.domain.util.impl.CoordinateImpl) coordenadasInicioContenedores.get(i)).getY();\r\n\t\t\t\r\n\t\t\tint h = getAmountContainersH(y);\r\n\t\t\tint v = getAmountContainersV(x);\r\n\t\t\t\r\n\t\t\tint c = calculateV(x);\r\n\t\t\tint b = calculateH(y);\r\n\t\t\t\r\n\t\t\tArrayList<Integer> aux = (ArrayList<Integer>) visitedCells.get(x);\r\n\t\t\tint contenedor = aux.get(y)-1;\r\n\t\t\t\r\n\t\t\tint xs= h*100 + 40;\r\n\t\t\t\r\n\t\t\tif(h>0)\r\n\t\t\t xs+=(b) +  ( (y-h-relativeY)*40);\r\n\t\t\t\r\n\t\t\tint ys = (v*20)+ 25;\r\n\t\t\t\r\n\t\t\tint s  = (x-v-relativeX);\r\n\t\t\t\r\n\t\t\tif(v>0)\r\n\t\t\t ys+= c + (s* 15);\r\n\t\t\t\r\n\t\t\tcontainer.getListGraphicalContainer().get(contenedor).setPositionX(xs);\r\n\t\t\tcontainer.getListGraphicalContainer().get(contenedor).setPositionY(ys);\r\n\t\t}\r\n\t'"
	 * @generated
	 */
	void reOrganizarTablas();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model aDataType="pgr.datatypes.datatypesjavautil.ArrayList"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='int max = -1;\r\n\t\t\t\tfor(int i=0;i<a.size();i++){\r\n\t\t\t\t\tif( ((pgr.domain.util.impl.CoordinateImpl)a.get(i) ).getX() > max){\r\n\t\t\t\t\t\tmax = ((pgr.domain.util.impl.CoordinateImpl) a.get(i) ).getY();\r\n\t\t\t\t\t}\r\n\t\t\t\t}\r\n\t\t\t\treturn max;'"
	 * @generated
	 */
	int getMaxX(ArrayList a);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tArrayList<Integer> aux = (ArrayList<Integer>) visitedCells.get(0);\r\n\t\tif(i >= 0 && i < visitedCells.size()  && j >= 0 && j < aux.size())\r\n\t\t\treturn true;\r\n\t\treturn false;'"
	 * @generated
	 */
	boolean isValid(int i, int j);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="pgr.datatypes.datatypesjavautil.ArrayList"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\t\t\r\n\t\t\t\t\r\n\t\t\t\t//Se extrae la fila y columna inicial\r\n\t\t\t\torg.apache.poi.xssf.usermodel.XSSFRow r = sheet.getRow(i);\r\n\t\t\t\tXSSFCell c = r.getCell(j);\r\n\t\t\t\t\r\n\t\t\t\t//Arreglo que contiene las celdas visitadas en la exploracion\r\n\t\t\t\tArrayList<pgr.domain.util.impl.CoordinateImpl> res = new ArrayList<pgr.domain.util.impl.CoordinateImpl>();\r\n\t\t \t\t\r\n\t\t\t\t//Se prepara la fila y columna en el excel de visitados\r\n\t\t\t\tArrayList<Integer> aux = (ArrayList<Integer>) visitedCells.get(i);\r\n\t\t\t\taux.set(j, amountContainers);\r\n\t\t\t\r\n\t\t\t\t\r\n\t\t\t\t//Agregamos la posicion inicial al arreglo de celdas a retornar\r\n\t\t\t\tres.add((pgr.domain.util.impl.CoordinateImpl)createCoordinate(i, j));\r\n\t\t\t\t\r\n\t\t\t\t//Cola que contendran las celdas a analizar\r\n\t\t\t\tjava.util.Queue<XSSFCell> q =   new java.util.LinkedList<XSSFCell>();\r\n\t\t\t\tq.add(c);\r\n\t\t\t\t\r\n\t\t\t\t/*\r\n\t\t\t\t *Mientras que haya celdas a analizar\r\n\t\t\t\t *Se analizaran sus adyacencias para \r\n\t\t\t\t *encontrar mas celdas No nulas\r\n\t\t\t\t \052/\r\n\t\t\t\twhile (!q.isEmpty()) {\t\r\n\t\t\t\t\tXSSFCell u = q.peek();\r\n\t\t\t\t\tq.poll();\r\n\t\t\t\t\t\r\n\t\t\t\t\t//Se observan las adyacencias de esta celda\r\n\t\t\t\t\t//Las adyancencias de una celda son\r\n\t\t\t\t\t//Arriba, Abajo, Izquierda y Derecha\r\n\t\t\t\t\t\r\n\t\t\t\t\tfor(int k = 0; k < 4; k++) {\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\t//Se obtiene la posible adyacencia en x y en y\r\n\t\t\t\t\t\tint vx = u.getRowIndex()    + (int) adjacenciesX.get(k);\r\n\t\t\t\t\t\tint vy = u.getColumnIndex() + (int) adjacenciesY.get(k);\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\t//Se verifica si es  una adyacencia valida\r\n\t\t\t\t\t\tif(isValid(vx, vy)){\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t//Si la fila no esta creada en el original\r\n\t\t\t\t\t\t\t//No se analiza\r\n\t\t\t\t\t\t\tr = sheet.getRow(vx);\r\n\t\t\t\t\t\t\tif(r==null) continue;\r\n\t\t\t\t\t\t\tc = r.getCell(vy);\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t//Si la celda no esta creada o esta vacia NO se analiza\r\n\t\t\t\t\t\t\tif (c !=null && c.getCellType()!=XSSFCell.CELL_TYPE_BLANK ) {\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t//Se marca en el excel de visitados esta celda \r\n\t\t\t\t\t\t\t\t//Como analizada para no analizarla mas\r\n\t\t\t\t\t\t\t\taux = (ArrayList<Integer>) visitedCells.get(vx);\r\n\t\t\t\t\t\t\t\tif(aux.get(vy) == 0){\r\n\t\t\t\t\t\t\t\t\taux.set(vy, amountContainers);\r\n\t\t\t\t\t\t\t\t\t//Se agrega a lista la celda (vx,vy) como celda\r\n\t\t\t\t\t\t\t\t\t//No NULA y NO VACIA\r\n\t\t\t\t\t\t\t\t\tres.add((pgr.domain.util.impl.CoordinateImpl)createCoordinate(vx, vy));\r\n\t\t\t\t\t\t\t\t\tq.add(c);\r\n\t\t\t\t\t\t\t\t}\r\n\t\t\t\t\t\t\t}\t\t\t\t\t\t\r\n\t\t\t\t\t\t}\r\n\t\t\t\t\t}\r\n\t\t\t\t}\r\n\t\t\t\tamountContainers++;\r\n\t\t\t\treturn res;\r\n\t\t\t\r\n\t'"
	 * @generated
	 */
	ArrayList bfs(int i, int j);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\t\r\n\t\t//Se obtiene la ultima fila a anlizar\r\n\t\tint nmax = sheet.getLastRowNum()+1;\r\n\t\t\r\n\t\tfor (int i = 0; i <nmax; i++) {\r\n\t    \t\r\n\t\t\t//Si la fila no esta creada en el libro orignial, no se analiza y se continua\r\n\t\t\torg.apache.poi.xssf.usermodel.XSSFRow r =  sheet.getRow(i);\r\n\t    \tif(r==null) continue;\r\n\t    \t\r\n\t    \t//Se recorre la fila hasta la ultima columna NO NULA\r\n\t    \tfor (int j = 0; j <r.getLastCellNum(); j++) {\r\n\t    \t\t\r\n\t    \t\t//Se obtienen las celdas del original y el visitado en la posicion J\r\n\t    \t\tXSSFCell c = r.getCell(j);\r\n\t    \t\t\r\n\t    \t\t//Si la celda es nula en el original no se analiza y se continua\r\n\t    \t\tArrayList<Integer> aux = (ArrayList<Integer>) visitedCells.get(i);\r\n\t            if(c != null && aux.get(j) == 0) { \r\n\t            \t\r\n\t            \t//Si la celda esta vacia no se analiza y se continua \r\n\t            \tif(c.getCellType()==XSSFCell.CELL_TYPE_BLANK)\r\n\t            \t\tcontinue;\r\n\t            \t\r\n\t            \ttooldataform.formmodel.concreta.Container containerTablas = createContainer(i, j);\r\n\t            \t\r\n\t         \t\tcontainer.getListGraphicalContainer().add(containerTablas);\r\n\t            }\r\n\t        }\r\n\t    }\r\n\t\t\r\n\t\t//Se reorganizan las tablas\r\n\t\treOrganizarTablas();\r\n\r\n\t'"
	 * @generated
	 */
	void recorrerHoja();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="pgr.datatypes.datatypesdataform.Container"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\t\r\n\t\t\r\n\t\t\t\t//Se crea la instancia del contendor a agregar\r\n\t\t\t\ttooldataform.formmodel.concreta.Container containerTablas = tooldataform.formmodel.concreta.ConcretaFactory.eINSTANCE.createContainer();\r\n\t\t\t    containerTablas.setName(\"Container\"+ (amountContainers));\r\n\t\t\t    \r\n\t\t\t\t//Se ejecuta el BFS con el fin de buscar \r\n\t\t    \t//Mas celdas no nulas \r\n\t\t    \t//Para almacenarlas en un mismo contendor\r\n\t\t    \tArrayList<pgr.domain.util.impl.CoordinateImpl> res = bfs( i, j);\r\n\t\t    \t\r\n\t\t    \t//Se ordenan las celdas encontradas\r\n\t\t    \tjava.util.Collections.sort(res);\r\n\t\t    \t\t\r\n\t\t    \tint m = res.size(); \t\r\n\t\t    \tcoordenadasInicioContenedores.add(createCoordinate(i, j));\r\n\t\t    \tcoordenadasFinContenedores.add(res.get(m-1));\r\n\t\t    \t\r\n\t\t    \t//Se extraen las dimenciones del contenedor que contendra a las celdas encontradas\r\n\t\t    \tString key =res.get(0).getX() +\"-\"+ res.get(0).getY() +\":\" + res.get(m-1).getX() +\"-\" + res.get(m-1).getY();\r\n\t\t    \t    \r\n\t\t    \t//Se delimita el inicio y el final del conentendor\r\n\t\t    \tString inicio = key.split(\":\")[0]; String fin  = key.split(\":\")[1];\r\n\t\t    \t\t\r\n\t\t    \tpgr.domain.util.impl.CoordinateImpl size = (pgr.domain.util.impl.CoordinateImpl) getSizes2(inicio, fin);\r\n\t\t \t\t\t\r\n\t\t\t\t//Se setean los bounds al contenedor se deja en la posicion 0 0\r\n\t\t\t\tsetBoundsGraphicalContainer(containerTablas,0 , 0,  size.getX() + 20, size.getY() + 40);\r\n\t\t\t\t\t\r\n\t\t\t\t//Posiciones relativas para el contenido del contenedor\r\n\t\t\t\tpgr.domain.util.impl.CoordinateImpl relativo =(pgr.domain.util.impl.CoordinateImpl) getCoordinates2( ((pgr.domain.util.impl.CoordinateImpl)res.get(0)).getX() +\"-\" +  ( (pgr.domain.util.impl.CoordinateImpl) res.get(0) ).getY()   );\r\n\t\t \t\tint relativex = relativo.getX();\r\n\t\t \t\tint relativey = relativo.getY();\r\n\t\t \t\t\t\r\n\t\t \t\tfor(int k=0;k<m;k++){\r\n\t\t \t\t\t\r\n\t\t \t\t\t//Se obtiene el X y el Y del componente \r\n\t\t \t\t\tint x = res.get(k).getX();    int y = res.get(k).getY();\r\n\t\t \t\t\t\t\r\n\t\t \t\t\t//Se obtiene su valor\r\n\t\t \t\t\torg.apache.poi.xssf.usermodel.XSSFRow rr = sheet.getRow(x);\r\n\t\t \t\t\tXSSFCell  cc = rr.getCell(y);\r\n\t\t \t\t\tString e = getCellValue(cc);\r\n\t\t \t\t\t\t\r\n\t\t \t\t\t//Se Obtienen las coordenadas NO Relativas al contenedor\r\n\t\t \t\t\tpgr.domain.util.impl.CoordinateImpl cor =(pgr.domain.util.impl.CoordinateImpl) getCoordinates2(x+\"-\"+y);\r\n\t\t \t\t\t\t\r\n\t\t \t\t\t//Se crea la instancia del label\r\n\t\t \t\t\ttooldataform.formmodel.concreta.LabelView label = tooldataform.formmodel.concreta.ConcretaFactory.eINSTANCE.createLabelView();\r\n\t\t \t\t\tlabel.setName(e);\r\n\t\t \t\t\t\t\r\n\t\t \t\t\t//Se setean los bounds\r\n\t\t \t\t\tlabel.setId(\"label\"+ (char)(k+64));\r\n\t\t \t\t\tlabel.setWidth(new Integer(-1));\r\n\t\t    \t\tlabel.setHeight(new Integer(-1));\r\n\t\t    \t\tlabel.setPositionX(new Integer(cor.getX() - relativex + 20 ));\r\n\t\t    \t\tlabel.setPositionY(new Integer(cor.getY() - relativey + 10));\r\n\t\t \t\t\t\t\r\n\t\t    \t\t//Se agrega al contenedor\r\n\t\t    \t\tcontainerTablas.getListIndividualElementDataForm().add(label);\r\n\t\t \t\t}\r\n\t\t \t\treturn containerTablas;\r\n\t\t\t\r\n\t'"
	 * @generated
	 */
	Container createContainer(int i, int j);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tint res=0;\r\n\t\tfor(int i = y-1; i >= 0; i--) {\r\n\t\t\tArrayList<Integer> aux = (ArrayList<Integer>) visitedCells.get(i);\r\n\t\t\tfor(int j = 0; j < aux.size(); j++)\r\n\t\t\t\tif(aux.get(j) != 0){\r\n\t\t\t\t\tres++;\r\n\t\t\t\t\tbreak;\r\n\t\t\t\t}\r\n\t\t}\r\n\t\t\t\r\n\t\treturn res;\r\n\t'"
	 * @generated
	 */
	int getAmountContainersV(int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='int res=0;\r\n\t\tfor(int i = y-1; i >= 0; i--) {\r\n\t\t\tArrayList<Integer> aux = (ArrayList<Integer>) visitedCells.get(i);\r\n\t\t\tfor(int j = 0; j < aux.size(); j++)\r\n\t\t\t\tif(aux.get(j) != 0){\r\n\t\t\t\t\tif(((pgr.domain.util.impl.CoordinateImpl) coordenadasFinContenedores.get(aux.get(j)-1)).getX()== i){\r\n\t\t\t\t\t\t i = ((pgr.domain.util.impl.CoordinateImpl) coordenadasInicioContenedores.get(aux.get(j)-1)).getX();\r\n\t\t\t\t\t\t res+=40;\r\n\t\t\t\t\t\t break;\r\n\t\t\t\t\t }\r\n\t\t\t\t}\r\n\t\t}\r\n\t\treturn res;'"
	 * @generated
	 */
	int calculateV(int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\t\r\n\t\tArrayList<Integer> aux = (ArrayList<Integer>) visitedCells.get(0);\r\n\t\tint [][] matriz = new int[visitedCells.size()][aux.size()];  \r\n\t\t\r\n\t\tfor (int i = 0; i < matriz.length; i++) {\r\n\t\t\taux = (ArrayList<Integer>) visitedCells.get(i);\r\n\t\t\tfor (int j = 0; j < matriz[0].length; j++) {\r\n\t\t\t\tmatriz[i][j] = aux.get(j);\r\n\t\t\t}\r\n\t\t}\r\n\t\tint res = 0;\t\r\n\t\tfor(int i = x-1; i >= 0; i--)\r\n\t\t\tfor(int j = 0; j < matriz.length; j++)\r\n\t\t\t\tif(matriz[j][i]!=0){\r\n\t\t\t\t\tif(((pgr.domain.util.impl.CoordinateImpl) coordenadasFinContenedores.get(matriz[j][i]-1)).getY()== i){\r\n\t\t\t\t\t\t i = ((pgr.domain.util.impl.CoordinateImpl) coordenadasInicioContenedores.get(matriz[j][i]-1)).getY();\r\n\t\t\t\t\t\t res+=40;\r\n\t\t\t\t\t\t break;\r\n\t\t\t\t\t }\r\n\t\t\t\t}\r\n\t\treturn res;\r\n\t'"
	 * @generated
	 */
	int calculateH(int x);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tArrayList<Integer> aux = (ArrayList<Integer>) visitedCells.get(0);\r\n\t\tint [][] matriz = new int[visitedCells.size()][aux.size()];  \r\n\t\t\r\n\t\tfor (int i = 0; i < matriz.length; i++) {\r\n\t\t\taux = (ArrayList<Integer>) visitedCells.get(i);\r\n\t\t\tfor (int j = 0; j < matriz[0].length; j++) {\r\n\t\t\t\tmatriz[i][j] = aux.get(j);\r\n\t\t\t}\r\n\t\t}\r\n\t\tint res=0;\t\r\n\t\tfor(int i = x-1; i >= 0; i--)\r\n\t\t\tfor(int j = 0; j < matriz.length; j++)\r\n\t\t\t\tif(matriz[j][i]!=0){\r\n\t\t\t\t\tres++;\r\n\t\t\t\t\tbreak;\r\n\t\t\t    }\r\n\t\treturn res;\r\n\t'"
	 * @generated
	 */
	int getAmountContainersH(int x);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tint i=0;\r\n\t\tfor(;i<s.length();i++){\r\n\t\t\tif( s.charAt(i) >= 65 && s.charAt(i)<=90){\r\n\t\t\t\tcontinue;\r\n\t\t\t}else{\r\n\t\t\t\tbreak;\r\n\t\t\t}\r\n\t\t}\r\n\t\treturn s.substring(i);\r\n\t'"
	 * @generated
	 */
	String capturarNumeros(String s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="pgr.domain.util.Coordinate"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='int w = toInt(stractColumn(inicio))-1;\r\n\t\t\tint h = ( Integer.parseInt(capturarNumeros(inicio))-1);\r\n\t\t\tpgr.domain.util.impl.CoordinateImpl c = (pgr.domain.util.impl.CoordinateImpl)createCoordinate(h, w);\r\n\t\t\treturn c;'"
	 * @generated
	 */
	Comparable getCoordinates(String inicio);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="pgr.domain.util.Coordinate"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tint wf= toInt(stractColumn(fin))-1;\r\n\t\tint wi = toInt(stractColumn(inicio))-1;\r\n\t\tint w = ( wf - wi + 1)*100;\r\n\t\tint h = ( Integer.parseInt(capturarNumeros(fin)) - Integer.parseInt(capturarNumeros(inicio)) + 1)*20;  \r\n\t\treturn createCoordinate(w,h);\t\t\r\n\t\r\n\t'"
	 * @generated
	 */
	Comparable getSizes(String inicio, String fin);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tString res=\"\";\r\n\t\tfor(int i=0;i<s.length();i++){\r\n\t\t\tif( s.charAt(i) >= 65 && s.charAt(i)<=90){\r\n\t\t\t\tres+= s.charAt(i);\r\n\t\t\t}else{\r\n\t\t\t\tbreak;\r\n\t\t\t}\r\n\t\t}\r\n\t\treturn res;\r\n\t'"
	 * @generated
	 */
	String stractColumn(String s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="pgr.domain.util.Coordinate"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='String ws1 = inicio.split(\"-\")[1];  String hs1 = inicio.split(\"-\")[0];\r\n\t\t\t\tString ws2 = fin.split(\"-\")[1];     String hs2 = fin.split(\"-\")[0];\r\n\t\t\t\tint w = ( (Integer.parseInt(ws2))  -  (Integer.parseInt(ws1)) + 1 )*100;\r\n\t\t\t\tint h = ( Integer.parseInt(hs2) - Integer.parseInt((hs1)) + 1)*20 ;  \r\n\t\t\t\treturn createCoordinate(w, h);'"
	 * @generated
	 */
	Comparable getSizes2(String inicio, String fin);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="pgr.domain.util.Coordinate"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='String ws = inicio.split(\"-\")[1];\r\n\t\t\t\tString hs = inicio.split(\"-\")[0];\r\n\t\t\t\tint w = Integer.parseInt(ws)*80;\r\n\t\t\t\tint h = Integer.parseInt(hs)*20;\r\n\t\t\t\treturn createCoordinate(w, h);'"
	 * @generated
	 */
	Comparable getCoordinates2(String inicio);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tint res =0;\r\n\t\tint m = s.length()-1;\r\n\t\tint e=0;\r\n\t\tfor(int i=m;i>=0;i--){\r\n\t\t\tres += ( (s.charAt(i) - 64))*pow(26,e);\r\n\t\t\te++;\r\n\t\t}\r\n\t\treturn res;'"
	 * @generated
	 */
	int toInt(String s);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tint res =1;\t\r\n\t\tfor(int i=0;i<e;i++){\r\n\t\t\tres*=b;\r\n\t\t}\r\n\t\treturn res;\r\n\t'"
	 * @generated
	 */
	int pow(int b, int e);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model cellDataType="pgr.datatypes.datatypeapachepoi.XSSFCell"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n\t\tint cel_Type = cell.getCellType();                           \r\n\t     String res=\"\";\r\n\t\t switch(cel_Type){\r\n\t     \tcase 0: res+=cell.getNumericCellValue();\r\n\t             \tbreak;\r\n\t     \tcase 1: res+=cell.getStringCellValue();\r\n\t     \t\t\tbreak;\r\n\t     \tcase 4:res+=cell.getBooleanCellValue();\r\n\t             \tbreak;\r\n\t     \tcase 3:res+=\"\";\r\n\t     \t\t\tbreak; \r\n\t     }\r\n\t\t return res;\r\n\t'"
	 * @generated
	 */
	String getCellValue(XSSFCell cell);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="pgr.domain.util.Coordinate"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='pgr.domain.util.impl.CoordinateImpl c = (pgr.domain.util.impl.CoordinateImpl)\r\n\t\t\t\t pgr.domain.util.UtilFactory.eINSTANCE.createCoordinate();\r\n\t\t c.setX(x); c.setY(y);\r\n\t\treturn c;'"
	 * @generated
	 */
	Comparable createCoordinate(int x, int y);

} // DataformGenerator
