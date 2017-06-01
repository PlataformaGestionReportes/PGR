/**
 */
package pgr.domain.generators.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>generators</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneratorsTests extends TestSuite {

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
		TestSuite suite = new GeneratorsTests("generators Tests");
		suite.addTestSuite(ViewModelGeneratorTest.class);
		suite.addTestSuite(DataformDiagramGeneratorTest.class);
		suite.addTestSuite(DataformGeneratorTest.class);
		suite.addTestSuite(ExcelGeneratorTest.class);
		suite.addTestSuite(ExcelUpdaterTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorsTests(String name) {
		super(name);
	}

} //GeneratorsTests
