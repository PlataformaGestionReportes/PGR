/**
 */
package pgr.datatypes.datatypeapachepoi;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

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
 * @see pgr.datatypes.datatypeapachepoi.DatatypeapachepoiFactory
 * @model kind="package"
 * @generated
 */
public interface DatatypeapachepoiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "datatypeapachepoi";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///pgr/datatypes/datatypeapachepoi.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pgr.datatypes.datatypeapachepoi";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatatypeapachepoiPackage eINSTANCE = pgr.datatypes.datatypeapachepoi.impl.DatatypeapachepoiPackageImpl.init();

	/**
	 * The meta object id for the '<em>XSSF Workbook</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.apache.poi.xssf.usermodel.XSSFWorkbook
	 * @see pgr.datatypes.datatypeapachepoi.impl.DatatypeapachepoiPackageImpl#getXSSFWorkbook()
	 * @generated
	 */
	int XSSF_WORKBOOK = 0;

	/**
	 * The meta object id for the '<em>XSSF Sheet</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.apache.poi.xssf.usermodel.XSSFSheet
	 * @see pgr.datatypes.datatypeapachepoi.impl.DatatypeapachepoiPackageImpl#getXSSFSheet()
	 * @generated
	 */
	int XSSF_SHEET = 1;

	/**
	 * The meta object id for the '<em>XSSF Cell</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.apache.poi.xssf.usermodel.XSSFCell
	 * @see pgr.datatypes.datatypeapachepoi.impl.DatatypeapachepoiPackageImpl#getXSSFCell()
	 * @generated
	 */
	int XSSF_CELL = 2;


	/**
	 * Returns the meta object for data type '{@link org.apache.poi.xssf.usermodel.XSSFWorkbook <em>XSSF Workbook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>XSSF Workbook</em>'.
	 * @see org.apache.poi.xssf.usermodel.XSSFWorkbook
	 * @model instanceClass="org.apache.poi.xssf.usermodel.XSSFWorkbook"
	 * @generated
	 */
	EDataType getXSSFWorkbook();

	/**
	 * Returns the meta object for data type '{@link org.apache.poi.xssf.usermodel.XSSFSheet <em>XSSF Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>XSSF Sheet</em>'.
	 * @see org.apache.poi.xssf.usermodel.XSSFSheet
	 * @model instanceClass="org.apache.poi.xssf.usermodel.XSSFSheet"
	 * @generated
	 */
	EDataType getXSSFSheet();

	/**
	 * Returns the meta object for data type '{@link org.apache.poi.xssf.usermodel.XSSFCell <em>XSSF Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>XSSF Cell</em>'.
	 * @see org.apache.poi.xssf.usermodel.XSSFCell
	 * @model instanceClass="org.apache.poi.xssf.usermodel.XSSFCell"
	 * @generated
	 */
	EDataType getXSSFCell();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatatypeapachepoiFactory getDatatypeapachepoiFactory();

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
		 * The meta object literal for the '<em>XSSF Workbook</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.apache.poi.xssf.usermodel.XSSFWorkbook
		 * @see pgr.datatypes.datatypeapachepoi.impl.DatatypeapachepoiPackageImpl#getXSSFWorkbook()
		 * @generated
		 */
		EDataType XSSF_WORKBOOK = eINSTANCE.getXSSFWorkbook();

		/**
		 * The meta object literal for the '<em>XSSF Sheet</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.apache.poi.xssf.usermodel.XSSFSheet
		 * @see pgr.datatypes.datatypeapachepoi.impl.DatatypeapachepoiPackageImpl#getXSSFSheet()
		 * @generated
		 */
		EDataType XSSF_SHEET = eINSTANCE.getXSSFSheet();

		/**
		 * The meta object literal for the '<em>XSSF Cell</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.apache.poi.xssf.usermodel.XSSFCell
		 * @see pgr.datatypes.datatypeapachepoi.impl.DatatypeapachepoiPackageImpl#getXSSFCell()
		 * @generated
		 */
		EDataType XSSF_CELL = eINSTANCE.getXSSFCell();

	}

} //DatatypeapachepoiPackage
