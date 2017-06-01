/**
 */
package pgr.ui.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import pgr.ui.ReportView;
import pgr.ui.UiFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Report View</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReportViewTest extends TestCase {

	/**
	 * The fixture for this Report View test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportView fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReportViewTest.class);
	}

	/**
	 * Constructs a new Report View test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportViewTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Report View test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ReportView fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Report View test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportView getFixture() {
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
		setFixture(UiFactory.eINSTANCE.createReportView());
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

} //ReportViewTest
