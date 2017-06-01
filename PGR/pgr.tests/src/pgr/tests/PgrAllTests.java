/**
 */
package pgr.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

import pgr.domain.generators.tests.GeneratorsTests;

import pgr.domain.util.tests.UtilTests;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Pgr</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class PgrAllTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new PgrAllTests("Pgr Tests");
		suite.addTest(PgrTests.suite());
		suite.addTest(GeneratorsTests.suite());
		suite.addTest(UtilTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PgrAllTests(String name) {
		super(name);
	}

} //PgrAllTests
