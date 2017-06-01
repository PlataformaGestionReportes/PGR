/**
 */
package pgr.ui;

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
 * @see pgr.ui.UiFactory
 * @model kind="package"
 * @generated
 */
public interface UiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ui";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///pgr/ui.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pgr.ui";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UiPackage eINSTANCE = pgr.ui.impl.UiPackageImpl.init();

	/**
	 * The meta object id for the '{@link pgr.ui.impl.UIImpl <em>UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.ui.impl.UIImpl
	 * @see pgr.ui.impl.UiPackageImpl#getUI()
	 * @generated
	 */
	int UI = 0;

	/**
	 * The feature id for the '<em><b>The Domain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__THE_DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>The Model Factory</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__THE_MODEL_FACTORY = 1;

	/**
	 * The feature id for the '<em><b>The Report View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__THE_REPORT_VIEW = 2;

	/**
	 * The number of structural features of the '<em>UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pgr.ui.impl.ReportViewImpl <em>Report View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.ui.impl.ReportViewImpl
	 * @see pgr.ui.impl.UiPackageImpl#getReportView()
	 * @generated
	 */
	int REPORT_VIEW = 1;

	/**
	 * The feature id for the '<em><b>Owned By UI</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_VIEW__OWNED_BY_UI = 0;

	/**
	 * The feature id for the '<em><b>List Report View Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_VIEW__LIST_REPORT_VIEW_MODEL = 1;

	/**
	 * The number of structural features of the '<em>Report View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_VIEW_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Report View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pgr.ui.impl.ReportViewModelImpl <em>Report View Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.ui.impl.ReportViewModelImpl
	 * @see pgr.ui.impl.UiPackageImpl#getReportViewModel()
	 * @generated
	 */
	int REPORT_VIEW_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_VIEW_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owned By Report View</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_VIEW_MODEL__OWNED_BY_REPORT_VIEW = 1;

	/**
	 * The number of structural features of the '<em>Report View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_VIEW_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Report View Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_VIEW_MODEL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link pgr.ui.UI <em>UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI</em>'.
	 * @see pgr.ui.UI
	 * @generated
	 */
	EClass getUI();

	/**
	 * Returns the meta object for the reference list '{@link pgr.ui.UI#getTheDomain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>The Domain</em>'.
	 * @see pgr.ui.UI#getTheDomain()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_TheDomain();

	/**
	 * Returns the meta object for the container reference '{@link pgr.ui.UI#getTheModelFactory <em>The Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>The Model Factory</em>'.
	 * @see pgr.ui.UI#getTheModelFactory()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_TheModelFactory();

	/**
	 * Returns the meta object for the containment reference '{@link pgr.ui.UI#getTheReportView <em>The Report View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>The Report View</em>'.
	 * @see pgr.ui.UI#getTheReportView()
	 * @see #getUI()
	 * @generated
	 */
	EReference getUI_TheReportView();

	/**
	 * Returns the meta object for class '{@link pgr.ui.ReportView <em>Report View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Report View</em>'.
	 * @see pgr.ui.ReportView
	 * @generated
	 */
	EClass getReportView();

	/**
	 * Returns the meta object for the container reference '{@link pgr.ui.ReportView#getOwnedByUI <em>Owned By UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By UI</em>'.
	 * @see pgr.ui.ReportView#getOwnedByUI()
	 * @see #getReportView()
	 * @generated
	 */
	EReference getReportView_OwnedByUI();

	/**
	 * Returns the meta object for the containment reference list '{@link pgr.ui.ReportView#getListReportViewModel <em>List Report View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Report View Model</em>'.
	 * @see pgr.ui.ReportView#getListReportViewModel()
	 * @see #getReportView()
	 * @generated
	 */
	EReference getReportView_ListReportViewModel();

	/**
	 * Returns the meta object for class '{@link pgr.ui.ReportViewModel <em>Report View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Report View Model</em>'.
	 * @see pgr.ui.ReportViewModel
	 * @generated
	 */
	EClass getReportViewModel();

	/**
	 * Returns the meta object for the attribute '{@link pgr.ui.ReportViewModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pgr.ui.ReportViewModel#getName()
	 * @see #getReportViewModel()
	 * @generated
	 */
	EAttribute getReportViewModel_Name();

	/**
	 * Returns the meta object for the container reference '{@link pgr.ui.ReportViewModel#getOwnedByReportView <em>Owned By Report View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owned By Report View</em>'.
	 * @see pgr.ui.ReportViewModel#getOwnedByReportView()
	 * @see #getReportViewModel()
	 * @generated
	 */
	EReference getReportViewModel_OwnedByReportView();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UiFactory getUiFactory();

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
		 * The meta object literal for the '{@link pgr.ui.impl.UIImpl <em>UI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pgr.ui.impl.UIImpl
		 * @see pgr.ui.impl.UiPackageImpl#getUI()
		 * @generated
		 */
		EClass UI = eINSTANCE.getUI();

		/**
		 * The meta object literal for the '<em><b>The Domain</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__THE_DOMAIN = eINSTANCE.getUI_TheDomain();

		/**
		 * The meta object literal for the '<em><b>The Model Factory</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__THE_MODEL_FACTORY = eINSTANCE.getUI_TheModelFactory();

		/**
		 * The meta object literal for the '<em><b>The Report View</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI__THE_REPORT_VIEW = eINSTANCE.getUI_TheReportView();

		/**
		 * The meta object literal for the '{@link pgr.ui.impl.ReportViewImpl <em>Report View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pgr.ui.impl.ReportViewImpl
		 * @see pgr.ui.impl.UiPackageImpl#getReportView()
		 * @generated
		 */
		EClass REPORT_VIEW = eINSTANCE.getReportView();

		/**
		 * The meta object literal for the '<em><b>Owned By UI</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT_VIEW__OWNED_BY_UI = eINSTANCE.getReportView_OwnedByUI();

		/**
		 * The meta object literal for the '<em><b>List Report View Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT_VIEW__LIST_REPORT_VIEW_MODEL = eINSTANCE.getReportView_ListReportViewModel();

		/**
		 * The meta object literal for the '{@link pgr.ui.impl.ReportViewModelImpl <em>Report View Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pgr.ui.impl.ReportViewModelImpl
		 * @see pgr.ui.impl.UiPackageImpl#getReportViewModel()
		 * @generated
		 */
		EClass REPORT_VIEW_MODEL = eINSTANCE.getReportViewModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_VIEW_MODEL__NAME = eINSTANCE.getReportViewModel_Name();

		/**
		 * The meta object literal for the '<em><b>Owned By Report View</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT_VIEW_MODEL__OWNED_BY_REPORT_VIEW = eINSTANCE.getReportViewModel_OwnedByReportView();

	}

} //UiPackage
