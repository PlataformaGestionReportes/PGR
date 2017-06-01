/**
 */
package pgr.domain;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see pgr.domain.DomainFactory
 * @model kind="package"
 * @generated
 */
public interface DomainPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "domain";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///pgr/domain.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pgr.domain";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DomainPackage eINSTANCE = pgr.domain.impl.DomainPackageImpl.init();

	/**
	 * The meta object id for the '{@link pgr.domain.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.impl.DomainImpl
	 * @see pgr.domain.impl.DomainPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>The UI</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__THE_UI = 0;

	/**
	 * The feature id for the '<em><b>The Model Factory</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__THE_MODEL_FACTORY = 1;

	/**
	 * The feature id for the '<em><b>List Report</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__LIST_REPORT = 2;

	/**
	 * The feature id for the '<em><b>The View Model Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__THE_VIEW_MODEL_GENERATOR = 3;

	/**
	 * The feature id for the '<em><b>The Dataform Diagram Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__THE_DATAFORM_DIAGRAM_GENERATOR = 4;

	/**
	 * The feature id for the '<em><b>The Dataform Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__THE_DATAFORM_GENERATOR = 5;

	/**
	 * The feature id for the '<em><b>The Excel Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__THE_EXCEL_GENERATOR = 6;

	/**
	 * The feature id for the '<em><b>The Excel Updater</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__THE_EXCEL_UPDATER = 7;

	/**
	 * The feature id for the '<em><b>The Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__THE_COORDINATE = 8;

	/**
	 * The feature id for the '<em><b>The Merged Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__THE_MERGED_REGION = 9;

	/**
	 * The feature id for the '<em><b>The Comparator Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__THE_COMPARATOR_RANGE = 10;

	/**
	 * The feature id for the '<em><b>The Unzip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__THE_UNZIP = 11;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pgr.domain.impl.ReportImpl <em>Report</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.impl.ReportImpl
	 * @see pgr.domain.impl.DomainPackageImpl#getReport()
	 * @generated
	 */
	int REPORT = 1;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__FILE_PATH = 0;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__FILE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Owned By Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT__OWNED_BY_DOMAIN = 2;

	/**
	 * The number of structural features of the '<em>Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link pgr.domain.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see pgr.domain.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the reference list '{@link pgr.domain.Domain#getTheUI <em>The UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>The UI</em>'.
	 * @see pgr.domain.Domain#getTheUI()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_TheUI();

	/**
	 * Returns the meta object for the container reference '{@link pgr.domain.Domain#getTheModelFactory <em>The Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>The Model Factory</em>'.
	 * @see pgr.domain.Domain#getTheModelFactory()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_TheModelFactory();

	/**
	 * Returns the meta object for the containment reference list '{@link pgr.domain.Domain#getListReport <em>List Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Report</em>'.
	 * @see pgr.domain.Domain#getListReport()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_ListReport();

	/**
	 * Returns the meta object for the containment reference '{@link pgr.domain.Domain#getTheViewModelGenerator <em>The View Model Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The View Model Generator</em>'.
	 * @see pgr.domain.Domain#getTheViewModelGenerator()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_TheViewModelGenerator();

	/**
	 * Returns the meta object for the containment reference '{@link pgr.domain.Domain#getTheDataformDiagramGenerator <em>The Dataform Diagram Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Dataform Diagram Generator</em>'.
	 * @see pgr.domain.Domain#getTheDataformDiagramGenerator()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_TheDataformDiagramGenerator();

	/**
	 * Returns the meta object for the containment reference '{@link pgr.domain.Domain#getTheDataformGenerator <em>The Dataform Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Dataform Generator</em>'.
	 * @see pgr.domain.Domain#getTheDataformGenerator()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_TheDataformGenerator();

	/**
	 * Returns the meta object for the containment reference '{@link pgr.domain.Domain#getTheExcelGenerator <em>The Excel Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Excel Generator</em>'.
	 * @see pgr.domain.Domain#getTheExcelGenerator()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_TheExcelGenerator();

	/**
	 * Returns the meta object for the containment reference '{@link pgr.domain.Domain#getTheExcelUpdater <em>The Excel Updater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Excel Updater</em>'.
	 * @see pgr.domain.Domain#getTheExcelUpdater()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_TheExcelUpdater();

	/**
	 * Returns the meta object for the containment reference '{@link pgr.domain.Domain#getTheCoordinate <em>The Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Coordinate</em>'.
	 * @see pgr.domain.Domain#getTheCoordinate()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_TheCoordinate();

	/**
	 * Returns the meta object for the containment reference '{@link pgr.domain.Domain#getTheMergedRegion <em>The Merged Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Merged Region</em>'.
	 * @see pgr.domain.Domain#getTheMergedRegion()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_TheMergedRegion();

	/**
	 * Returns the meta object for the containment reference '{@link pgr.domain.Domain#getTheComparatorRange <em>The Comparator Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Comparator Range</em>'.
	 * @see pgr.domain.Domain#getTheComparatorRange()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_TheComparatorRange();

	/**
	 * Returns the meta object for the containment reference '{@link pgr.domain.Domain#getTheUnzip <em>The Unzip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Unzip</em>'.
	 * @see pgr.domain.Domain#getTheUnzip()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_TheUnzip();

	/**
	 * Returns the meta object for class '{@link pgr.domain.Report <em>Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Report</em>'.
	 * @see pgr.domain.Report
	 * @generated
	 */
	EClass getReport();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.Report#getFilePath <em>File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Path</em>'.
	 * @see pgr.domain.Report#getFilePath()
	 * @see #getReport()
	 * @generated
	 */
	EAttribute getReport_FilePath();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.Report#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see pgr.domain.Report#getFileName()
	 * @see #getReport()
	 * @generated
	 */
	EAttribute getReport_FileName();

	/**
	 * Returns the meta object for the container reference '{@link pgr.domain.Report#getOwnedByDomain <em>Owned By Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Domain</em>'.
	 * @see pgr.domain.Report#getOwnedByDomain()
	 * @see #getReport()
	 * @generated
	 */
	EReference getReport_OwnedByDomain();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DomainFactory getDomainFactory();

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
		 * The meta object literal for the '{@link pgr.domain.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pgr.domain.impl.DomainImpl
		 * @see pgr.domain.impl.DomainPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>The UI</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__THE_UI = eINSTANCE.getDomain_TheUI();

		/**
		 * The meta object literal for the '<em><b>The Model Factory</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__THE_MODEL_FACTORY = eINSTANCE.getDomain_TheModelFactory();

		/**
		 * The meta object literal for the '<em><b>List Report</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__LIST_REPORT = eINSTANCE.getDomain_ListReport();

		/**
		 * The meta object literal for the '<em><b>The View Model Generator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__THE_VIEW_MODEL_GENERATOR = eINSTANCE.getDomain_TheViewModelGenerator();

		/**
		 * The meta object literal for the '<em><b>The Dataform Diagram Generator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__THE_DATAFORM_DIAGRAM_GENERATOR = eINSTANCE.getDomain_TheDataformDiagramGenerator();

		/**
		 * The meta object literal for the '<em><b>The Dataform Generator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__THE_DATAFORM_GENERATOR = eINSTANCE.getDomain_TheDataformGenerator();

		/**
		 * The meta object literal for the '<em><b>The Excel Generator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__THE_EXCEL_GENERATOR = eINSTANCE.getDomain_TheExcelGenerator();

		/**
		 * The meta object literal for the '<em><b>The Excel Updater</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__THE_EXCEL_UPDATER = eINSTANCE.getDomain_TheExcelUpdater();

		/**
		 * The meta object literal for the '<em><b>The Coordinate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__THE_COORDINATE = eINSTANCE.getDomain_TheCoordinate();

		/**
		 * The meta object literal for the '<em><b>The Merged Region</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__THE_MERGED_REGION = eINSTANCE.getDomain_TheMergedRegion();

		/**
		 * The meta object literal for the '<em><b>The Comparator Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__THE_COMPARATOR_RANGE = eINSTANCE.getDomain_TheComparatorRange();

		/**
		 * The meta object literal for the '<em><b>The Unzip</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__THE_UNZIP = eINSTANCE.getDomain_TheUnzip();

		/**
		 * The meta object literal for the '{@link pgr.domain.impl.ReportImpl <em>Report</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pgr.domain.impl.ReportImpl
		 * @see pgr.domain.impl.DomainPackageImpl#getReport()
		 * @generated
		 */
		EClass REPORT = eINSTANCE.getReport();

		/**
		 * The meta object literal for the '<em><b>File Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT__FILE_PATH = eINSTANCE.getReport_FilePath();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT__FILE_NAME = eINSTANCE.getReport_FileName();

		/**
		 * The meta object literal for the '<em><b>Owned By Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT__OWNED_BY_DOMAIN = eINSTANCE.getReport_OwnedByDomain();

	}

} //DomainPackage
