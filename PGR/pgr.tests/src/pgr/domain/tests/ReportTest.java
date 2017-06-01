/**
 */
package pgr.domain.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import pgr.domain.DomainFactory;
import pgr.domain.Report;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Report</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReportTest extends TestCase {

	/**
	 * The fixture for this Report test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Report fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReportTest.class);
	}

	/**
	 * Constructs a new Report test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Report test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Report fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Report test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Report getFixture() {
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
		setFixture(DomainFactory.eINSTANCE.createReport());
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

} //ReportTest