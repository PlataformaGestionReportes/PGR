/**
 */
package pgr.domain;

import java.util.Comparator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import pgr.ModelFactory;

import pgr.domain.generators.DataformDiagramGenerator;
import pgr.domain.generators.DataformGenerator;
import pgr.domain.generators.ExcelGenerator;
import pgr.domain.generators.ExcelUpdater;
import pgr.domain.generators.ViewModelGenerator;

import pgr.domain.util.MergedRegion;
import pgr.domain.util.Unzip;

import pgr.ui.UI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pgr.domain.Domain#getTheUI <em>The UI</em>}</li>
 *   <li>{@link pgr.domain.Domain#getTheModelFactory <em>The Model Factory</em>}</li>
 *   <li>{@link pgr.domain.Domain#getListReport <em>List Report</em>}</li>
 *   <li>{@link pgr.domain.Domain#getTheViewModelGenerator <em>The View Model Generator</em>}</li>
 *   <li>{@link pgr.domain.Domain#getTheDataformDiagramGenerator <em>The Dataform Diagram Generator</em>}</li>
 *   <li>{@link pgr.domain.Domain#getTheDataformGenerator <em>The Dataform Generator</em>}</li>
 *   <li>{@link pgr.domain.Domain#getTheExcelGenerator <em>The Excel Generator</em>}</li>
 *   <li>{@link pgr.domain.Domain#getTheExcelUpdater <em>The Excel Updater</em>}</li>
 *   <li>{@link pgr.domain.Domain#getTheCoordinate <em>The Coordinate</em>}</li>
 *   <li>{@link pgr.domain.Domain#getTheMergedRegion <em>The Merged Region</em>}</li>
 *   <li>{@link pgr.domain.Domain#getTheComparatorRange <em>The Comparator Range</em>}</li>
 *   <li>{@link pgr.domain.Domain#getTheUnzip <em>The Unzip</em>}</li>
 * </ul>
 *
 * @see pgr.domain.DomainPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>The UI</b></em>' reference list.
	 * The list contents are of type {@link pgr.ui.UI}.
	 * It is bidirectional and its opposite is '{@link pgr.ui.UI#getTheDomain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The UI</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The UI</em>' reference list.
	 * @see pgr.domain.DomainPackage#getDomain_TheUI()
	 * @see pgr.ui.UI#getTheDomain
	 * @model opposite="theDomain"
	 * @generated
	 */
	EList<UI> getTheUI();

	/**
	 * Returns the value of the '<em><b>The Model Factory</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link pgr.ModelFactory#getTheDomain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Model Factory</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Model Factory</em>' container reference.
	 * @see #setTheModelFactory(ModelFactory)
	 * @see pgr.domain.DomainPackage#getDomain_TheModelFactory()
	 * @see pgr.ModelFactory#getTheDomain
	 * @model opposite="theDomain"
	 * @generated
	 */
	ModelFactory getTheModelFactory();

	/**
	 * Sets the value of the '{@link pgr.domain.Domain#getTheModelFactory <em>The Model Factory</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Model Factory</em>' container reference.
	 * @see #getTheModelFactory()
	 * @generated
	 */
	void setTheModelFactory(ModelFactory value);

	/**
	 * Returns the value of the '<em><b>List Report</b></em>' containment reference list.
	 * The list contents are of type {@link pgr.domain.Report}.
	 * It is bidirectional and its opposite is '{@link pgr.domain.Report#getOwnedByDomain <em>Owned By Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Report</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Report</em>' containment reference list.
	 * @see pgr.domain.DomainPackage#getDomain_ListReport()
	 * @see pgr.domain.Report#getOwnedByDomain
	 * @model opposite="ownedByDomain" containment="true"
	 * @generated
	 */
	EList<Report> getListReport();

	/**
	 * Returns the value of the '<em><b>The View Model Generator</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link pgr.domain.generators.ViewModelGenerator#getTheDomain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The View Model Generator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The View Model Generator</em>' containment reference.
	 * @see #setTheViewModelGenerator(ViewModelGenerator)
	 * @see pgr.domain.DomainPackage#getDomain_TheViewModelGenerator()
	 * @see pgr.domain.generators.ViewModelGenerator#getTheDomain
	 * @model opposite="theDomain" containment="true" required="true"
	 * @generated
	 */
	ViewModelGenerator getTheViewModelGenerator();

	/**
	 * Sets the value of the '{@link pgr.domain.Domain#getTheViewModelGenerator <em>The View Model Generator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The View Model Generator</em>' containment reference.
	 * @see #getTheViewModelGenerator()
	 * @generated
	 */
	void setTheViewModelGenerator(ViewModelGenerator value);

	/**
	 * Returns the value of the '<em><b>The Dataform Diagram Generator</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link pgr.domain.generators.DataformDiagramGenerator#getTheDomain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Dataform Diagram Generator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Dataform Diagram Generator</em>' containment reference.
	 * @see #setTheDataformDiagramGenerator(DataformDiagramGenerator)
	 * @see pgr.domain.DomainPackage#getDomain_TheDataformDiagramGenerator()
	 * @see pgr.domain.generators.DataformDiagramGenerator#getTheDomain
	 * @model opposite="theDomain" containment="true" required="true"
	 * @generated
	 */
	DataformDiagramGenerator getTheDataformDiagramGenerator();

	/**
	 * Sets the value of the '{@link pgr.domain.Domain#getTheDataformDiagramGenerator <em>The Dataform Diagram Generator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Dataform Diagram Generator</em>' containment reference.
	 * @see #getTheDataformDiagramGenerator()
	 * @generated
	 */
	void setTheDataformDiagramGenerator(DataformDiagramGenerator value);

	/**
	 * Returns the value of the '<em><b>The Dataform Generator</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link pgr.domain.generators.DataformGenerator#getTheDomain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Dataform Generator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Dataform Generator</em>' containment reference.
	 * @see #setTheDataformGenerator(DataformGenerator)
	 * @see pgr.domain.DomainPackage#getDomain_TheDataformGenerator()
	 * @see pgr.domain.generators.DataformGenerator#getTheDomain
	 * @model opposite="theDomain" containment="true" required="true"
	 * @generated
	 */
	DataformGenerator getTheDataformGenerator();

	/**
	 * Sets the value of the '{@link pgr.domain.Domain#getTheDataformGenerator <em>The Dataform Generator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Dataform Generator</em>' containment reference.
	 * @see #getTheDataformGenerator()
	 * @generated
	 */
	void setTheDataformGenerator(DataformGenerator value);

	/**
	 * Returns the value of the '<em><b>The Excel Generator</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link pgr.domain.generators.ExcelGenerator#getTheDomain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Excel Generator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Excel Generator</em>' containment reference.
	 * @see #setTheExcelGenerator(ExcelGenerator)
	 * @see pgr.domain.DomainPackage#getDomain_TheExcelGenerator()
	 * @see pgr.domain.generators.ExcelGenerator#getTheDomain
	 * @model opposite="theDomain" containment="true" required="true"
	 * @generated
	 */
	ExcelGenerator getTheExcelGenerator();

	/**
	 * Sets the value of the '{@link pgr.domain.Domain#getTheExcelGenerator <em>The Excel Generator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Excel Generator</em>' containment reference.
	 * @see #getTheExcelGenerator()
	 * @generated
	 */
	void setTheExcelGenerator(ExcelGenerator value);

	/**
	 * Returns the value of the '<em><b>The Excel Updater</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link pgr.domain.generators.ExcelUpdater#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Excel Updater</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Excel Updater</em>' containment reference.
	 * @see #setTheExcelUpdater(ExcelUpdater)
	 * @see pgr.domain.DomainPackage#getDomain_TheExcelUpdater()
	 * @see pgr.domain.generators.ExcelUpdater#getDomain
	 * @model opposite="Domain" containment="true" required="true"
	 * @generated
	 */
	ExcelUpdater getTheExcelUpdater();

	/**
	 * Sets the value of the '{@link pgr.domain.Domain#getTheExcelUpdater <em>The Excel Updater</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Excel Updater</em>' containment reference.
	 * @see #getTheExcelUpdater()
	 * @generated
	 */
	void setTheExcelUpdater(ExcelUpdater value);

	/**
	 * Returns the value of the '<em><b>The Coordinate</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link Comparable#getTheDomain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Coordinate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Coordinate</em>' containment reference.
	 * @see #setTheCoordinate(Comparable)
	 * @see pgr.domain.DomainPackage#getDomain_TheCoordinate()
	 * @see Comparable#getTheDomain
	 * @model type="pgr.domain.util.Coordinate" opposite="theDomain" containment="true" required="true"
	 * @generated
	 */
	Comparable getTheCoordinate();

	/**
	 * Sets the value of the '{@link pgr.domain.Domain#getTheCoordinate <em>The Coordinate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Coordinate</em>' containment reference.
	 * @see #getTheCoordinate()
	 * @generated
	 */
	void setTheCoordinate(Comparable value);

	/**
	 * Returns the value of the '<em><b>The Merged Region</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link pgr.domain.util.MergedRegion#getTheDomain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Merged Region</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Merged Region</em>' containment reference.
	 * @see #setTheMergedRegion(MergedRegion)
	 * @see pgr.domain.DomainPackage#getDomain_TheMergedRegion()
	 * @see pgr.domain.util.MergedRegion#getTheDomain
	 * @model opposite="theDomain" containment="true" required="true"
	 * @generated
	 */
	MergedRegion getTheMergedRegion();

	/**
	 * Sets the value of the '{@link pgr.domain.Domain#getTheMergedRegion <em>The Merged Region</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Merged Region</em>' containment reference.
	 * @see #getTheMergedRegion()
	 * @generated
	 */
	void setTheMergedRegion(MergedRegion value);

	/**
	 * Returns the value of the '<em><b>The Comparator Range</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link java.util.Comparator#getTheDomain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Comparator Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Comparator Range</em>' containment reference.
	 * @see #setTheComparatorRange(Comparator)
	 * @see pgr.domain.DomainPackage#getDomain_TheComparatorRange()
	 * @see java.util.Comparator#getTheDomain
	 * @model type="pgr.domain.util.ComparatorRange" opposite="theDomain" containment="true" required="true"
	 * @generated
	 */
	Comparator getTheComparatorRange();

	/**
	 * Sets the value of the '{@link pgr.domain.Domain#getTheComparatorRange <em>The Comparator Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Comparator Range</em>' containment reference.
	 * @see #getTheComparatorRange()
	 * @generated
	 */
	void setTheComparatorRange(Comparator value);

	/**
	 * Returns the value of the '<em><b>The Unzip</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link pgr.domain.util.Unzip#getTheDomain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Unzip</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Unzip</em>' containment reference.
	 * @see #setTheUnzip(Unzip)
	 * @see pgr.domain.DomainPackage#getDomain_TheUnzip()
	 * @see pgr.domain.util.Unzip#getTheDomain
	 * @model opposite="theDomain" containment="true" required="true"
	 * @generated
	 */
	Unzip getTheUnzip();

	/**
	 * Sets the value of the '{@link pgr.domain.Domain#getTheUnzip <em>The Unzip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Unzip</em>' containment reference.
	 * @see #getTheUnzip()
	 * @generated
	 */
	void setTheUnzip(Unzip value);

} // Domain
