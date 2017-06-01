/**
 */
package pgr.ui.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import pgr.ui.ReportViewModel;
import pgr.ui.UiFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Report View Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReportViewModelTest extends TestCase {

	/**
	 * The fixture for this Report View Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportViewModel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReportViewModelTest.class);
	}

	/**
	 * Constructs a new Report View Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportViewModelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Report View Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ReportViewModel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Report View Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportViewModel getFixture() {
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
		setFixture(UiFactory.eINSTANCE.createReportViewModel());
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

} //ReportViewModelTest
