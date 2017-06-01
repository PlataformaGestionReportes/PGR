/**
 */
package pgr.datatypes;

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
 * @see pgr.datatypes.DatatypesFactory
 * @model kind="package"
 * @generated
 */
public interface DatatypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "datatypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///pgr/datatypes.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pgr.datatypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatatypesPackage eINSTANCE = pgr.datatypes.impl.DatatypesPackageImpl.init();

	/**
	 * The meta object id for the '<em>Document</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3c.dom.Document
	 * @see pgr.datatypes.impl.DatatypesPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 0;

	/**
	 * The meta object id for the '<em>Result Set</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.sql.ResultSet
	 * @see pgr.datatypes.impl.DatatypesPackageImpl#getResultSet()
	 * @generated
	 */
	int RESULT_SET = 1;

	/**
	 * The meta object id for the '<em>EList</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.EList
	 * @see pgr.datatypes.impl.DatatypesPackageImpl#getEList()
	 * @generated
	 */
	int ELIST = 2;


	/**
	 * Returns the meta object for data type '{@link org.w3c.dom.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Document</em>'.
	 * @see org.w3c.dom.Document
	 * @model instanceClass="org.w3c.dom.Document"
	 * @generated
	 */
	EDataType getDocument();

	/**
	 * Returns the meta object for data type '{@link java.sql.ResultSet <em>Result Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Result Set</em>'.
	 * @see java.sql.ResultSet
	 * @model instanceClass="java.sql.ResultSet"
	 * @generated
	 */
	EDataType getResultSet();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.EList <em>EList</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EList</em>'.
	 * @see org.eclipse.emf.common.util.EList
	 * @model instanceClass="org.eclipse.emf.common.util.EList"
	 * @generated
	 */
	EDataType getEList();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatatypesFactory getDatatypesFactory();

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
		 * The meta object literal for the '<em>Document</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3c.dom.Document
		 * @see pgr.datatypes.impl.DatatypesPackageImpl#getDocument()
		 * @generated
		 */
		EDataType DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em>Result Set</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.sql.ResultSet
		 * @see pgr.datatypes.impl.DatatypesPackageImpl#getResultSet()
		 * @generated
		 */
		EDataType RESULT_SET = eINSTANCE.getResultSet();

		/**
		 * The meta object literal for the '<em>EList</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.EList
		 * @see pgr.datatypes.impl.DatatypesPackageImpl#getEList()
		 * @generated
		 */
		EDataType ELIST = eINSTANCE.getEList();

	}

} //DatatypesPackage
