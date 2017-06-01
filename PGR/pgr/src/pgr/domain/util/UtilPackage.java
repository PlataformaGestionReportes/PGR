/**
 */
package pgr.domain.util;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see pgr.domain.util.UtilFactory
 * @model kind="package"
 * @generated
 */
public interface UtilPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "util";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///pgr/domain/util.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pgr.domain.util";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UtilPackage eINSTANCE = pgr.domain.util.impl.UtilPackageImpl.init();

	/**
	 * The meta object id for the '{@link pgr.domain.util.impl.CoordinateImpl <em>Coordinate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.util.impl.CoordinateImpl
	 * @see pgr.domain.util.impl.UtilPackageImpl#getCoordinate()
	 * @generated
	 */
	int COORDINATE = 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE__Y = 1;

	/**
	 * The feature id for the '<em><b>The Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE__THE_DOMAIN = 2;

	/**
	 * The number of structural features of the '<em>Coordinate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Compare To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE___COMPARE_TO__OBJECT = 0;

	/**
	 * The number of operations of the '<em>Coordinate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link pgr.domain.util.impl.MergedRegionImpl <em>Merged Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.util.impl.MergedRegionImpl
	 * @see pgr.domain.util.impl.UtilPackageImpl#getMergedRegion()
	 * @generated
	 */
	int MERGED_REGION = 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_REGION__TEXT = 0;

	/**
	 * The feature id for the '<em><b>First Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_REGION__FIRST_COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Last Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_REGION__LAST_COLUMN = 2;

	/**
	 * The feature id for the '<em><b>First Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_REGION__FIRST_ROW = 3;

	/**
	 * The feature id for the '<em><b>Last Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_REGION__LAST_ROW = 4;

	/**
	 * The feature id for the '<em><b>The Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_REGION__THE_DOMAIN = 5;

	/**
	 * The number of structural features of the '<em>Merged Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_REGION_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Merged Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_REGION___MERGED_REGION__STRING_INTEGER_INTEGER_INTEGER_INTEGER = 0;

	/**
	 * The number of operations of the '<em>Merged Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_REGION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link pgr.domain.util.impl.ComparatorRangeImpl <em>Comparator Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.util.impl.ComparatorRangeImpl
	 * @see pgr.domain.util.impl.UtilPackageImpl#getComparatorRange()
	 * @generated
	 */
	int COMPARATOR_RANGE = 2;

	/**
	 * The feature id for the '<em><b>The Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATOR_RANGE__THE_DOMAIN = 0;

	/**
	 * The number of structural features of the '<em>Comparator Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATOR_RANGE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Compare</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATOR_RANGE___COMPARE__OBJECT_OBJECT = 0;

	/**
	 * The number of operations of the '<em>Comparator Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATOR_RANGE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link pgr.domain.util.impl.UnzipImpl <em>Unzip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pgr.domain.util.impl.UnzipImpl
	 * @see pgr.domain.util.impl.UtilPackageImpl#getUnzip()
	 * @generated
	 */
	int UNZIP = 3;

	/**
	 * The feature id for the '<em><b>The Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNZIP__THE_DOMAIN = 0;

	/**
	 * The number of structural features of the '<em>Unzip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNZIP_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Copy Input Stream</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNZIP___COPY_INPUT_STREAM__INPUTSTREAM_OUTPUTSTREAM = 0;

	/**
	 * The operation id for the '<em>Remove Extension</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNZIP___REMOVE_EXTENSION__STRING = 1;

	/**
	 * The operation id for the '<em>Unzip</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNZIP___UNZIP__STRING_STRING = 2;

	/**
	 * The number of operations of the '<em>Unzip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNZIP_OPERATION_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link Comparable <em>Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinate</em>'.
	 * @see Comparable
	 * @model instanceClass="Comparable"
	 * @generated
	 */
	EClass getCoordinate();

	/**
	 * Returns the meta object for the attribute '{@link Comparable#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see Comparable#getX()
	 * @see #getCoordinate()
	 * @generated
	 */
	EAttribute getCoordinate_X();

	/**
	 * Returns the meta object for the attribute '{@link Comparable#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see Comparable#getY()
	 * @see #getCoordinate()
	 * @generated
	 */
	EAttribute getCoordinate_Y();

	/**
	 * Returns the meta object for the container reference '{@link Comparable#getTheDomain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>The Domain</em>'.
	 * @see Comparable#getTheDomain()
	 * @see #getCoordinate()
	 * @generated
	 */
	EReference getCoordinate_TheDomain();

	/**
	 * Returns the meta object for the '{@link Comparable#compareTo(java.lang.Object) <em>Compare To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compare To</em>' operation.
	 * @see Comparable#compareTo(java.lang.Object)
	 * @generated
	 */
	EOperation getCoordinate__CompareTo__Object();

	/**
	 * Returns the meta object for class '{@link pgr.domain.util.MergedRegion <em>Merged Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merged Region</em>'.
	 * @see pgr.domain.util.MergedRegion
	 * @generated
	 */
	EClass getMergedRegion();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.util.MergedRegion#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see pgr.domain.util.MergedRegion#getText()
	 * @see #getMergedRegion()
	 * @generated
	 */
	EAttribute getMergedRegion_Text();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.util.MergedRegion#getFirstColumn <em>First Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Column</em>'.
	 * @see pgr.domain.util.MergedRegion#getFirstColumn()
	 * @see #getMergedRegion()
	 * @generated
	 */
	EAttribute getMergedRegion_FirstColumn();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.util.MergedRegion#getLastColumn <em>Last Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Column</em>'.
	 * @see pgr.domain.util.MergedRegion#getLastColumn()
	 * @see #getMergedRegion()
	 * @generated
	 */
	EAttribute getMergedRegion_LastColumn();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.util.MergedRegion#getFirstRow <em>First Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Row</em>'.
	 * @see pgr.domain.util.MergedRegion#getFirstRow()
	 * @see #getMergedRegion()
	 * @generated
	 */
	EAttribute getMergedRegion_FirstRow();

	/**
	 * Returns the meta object for the attribute '{@link pgr.domain.util.MergedRegion#getLastRow <em>Last Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Row</em>'.
	 * @see pgr.domain.util.MergedRegion#getLastRow()
	 * @see #getMergedRegion()
	 * @generated
	 */
	EAttribute getMergedRegion_LastRow();

	/**
	 * Returns the meta object for the container reference '{@link pgr.domain.util.MergedRegion#getTheDomain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>The Domain</em>'.
	 * @see pgr.domain.util.MergedRegion#getTheDomain()
	 * @see #getMergedRegion()
	 * @generated
	 */
	EReference getMergedRegion_TheDomain();

	/**
	 * Returns the meta object for the '{@link pgr.domain.util.MergedRegion#MergedRegion(java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer) <em>Merged Region</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Merged Region</em>' operation.
	 * @see pgr.domain.util.MergedRegion#MergedRegion(java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer)
	 * @generated
	 */
	EOperation getMergedRegion__MergedRegion__String_Integer_Integer_Integer_Integer();

	/**
	 * Returns the meta object for class '{@link java.util.Comparator <em>Comparator Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparator Range</em>'.
	 * @see java.util.Comparator
	 * @model instanceClass="java.util.Comparator"
	 * @generated
	 */
	EClass getComparatorRange();

	/**
	 * Returns the meta object for the container reference '{@link java.util.Comparator#getTheDomain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>The Domain</em>'.
	 * @see java.util.Comparator#getTheDomain()
	 * @see #getComparatorRange()
	 * @generated
	 */
	EReference getComparatorRange_TheDomain();

	/**
	 * Returns the meta object for the '{@link java.util.Comparator#compare(java.lang.Object, java.lang.Object) <em>Compare</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compare</em>' operation.
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 * @generated
	 */
	EOperation getComparatorRange__Compare__Object_Object();

	/**
	 * Returns the meta object for class '{@link pgr.domain.util.Unzip <em>Unzip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unzip</em>'.
	 * @see pgr.domain.util.Unzip
	 * @generated
	 */
	EClass getUnzip();

	/**
	 * Returns the meta object for the container reference '{@link pgr.domain.util.Unzip#getTheDomain <em>The Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>The Domain</em>'.
	 * @see pgr.domain.util.Unzip#getTheDomain()
	 * @see #getUnzip()
	 * @generated
	 */
	EReference getUnzip_TheDomain();

	/**
	 * Returns the meta object for the '{@link pgr.domain.util.Unzip#copyInputStream(java.io.InputStream, java.io.OutputStream) <em>Copy Input Stream</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Copy Input Stream</em>' operation.
	 * @see pgr.domain.util.Unzip#copyInputStream(java.io.InputStream, java.io.OutputStream)
	 * @generated
	 */
	EOperation getUnzip__CopyInputStream__InputStream_OutputStream();

	/**
	 * Returns the meta object for the '{@link pgr.domain.util.Unzip#removeExtension(java.lang.String) <em>Remove Extension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Extension</em>' operation.
	 * @see pgr.domain.util.Unzip#removeExtension(java.lang.String)
	 * @generated
	 */
	EOperation getUnzip__RemoveExtension__String();

	/**
	 * Returns the meta object for the '{@link pgr.domain.util.Unzip#unzip(java.lang.String, java.lang.String) <em>Unzip</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unzip</em>' operation.
	 * @see pgr.domain.util.Unzip#unzip(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getUnzip__Unzip__String_String();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UtilFactory getUtilFactory();

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
		 * The meta object literal for the '{@link pgr.domain.util.impl.CoordinateImpl <em>Coordinate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pgr.domain.util.impl.CoordinateImpl
		 * @see pgr.domain.util.impl.UtilPackageImpl#getCoordinate()
		 * @generated
		 */
		EClass COORDINATE = eINSTANCE.getCoordinate();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATE__X = eINSTANCE.getCoordinate_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATE__Y = eINSTANCE.getCoordinate_Y();

		/**
		 * The meta object literal for the '<em><b>The Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATE__THE_DOMAIN = eINSTANCE.getCoordinate_TheDomain();

		/**
		 * The meta object literal for the '<em><b>Compare To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COORDINATE___COMPARE_TO__OBJECT = eINSTANCE.getCoordinate__CompareTo__Object();

		/**
		 * The meta object literal for the '{@link pgr.domain.util.impl.MergedRegionImpl <em>Merged Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pgr.domain.util.impl.MergedRegionImpl
		 * @see pgr.domain.util.impl.UtilPackageImpl#getMergedRegion()
		 * @generated
		 */
		EClass MERGED_REGION = eINSTANCE.getMergedRegion();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGED_REGION__TEXT = eINSTANCE.getMergedRegion_Text();

		/**
		 * The meta object literal for the '<em><b>First Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGED_REGION__FIRST_COLUMN = eINSTANCE.getMergedRegion_FirstColumn();

		/**
		 * The meta object literal for the '<em><b>Last Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGED_REGION__LAST_COLUMN = eINSTANCE.getMergedRegion_LastColumn();

		/**
		 * The meta object literal for the '<em><b>First Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGED_REGION__FIRST_ROW = eINSTANCE.getMergedRegion_FirstRow();

		/**
		 * The meta object literal for the '<em><b>Last Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGED_REGION__LAST_ROW = eINSTANCE.getMergedRegion_LastRow();

		/**
		 * The meta object literal for the '<em><b>The Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGED_REGION__THE_DOMAIN = eINSTANCE.getMergedRegion_TheDomain();

		/**
		 * The meta object literal for the '<em><b>Merged Region</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MERGED_REGION___MERGED_REGION__STRING_INTEGER_INTEGER_INTEGER_INTEGER = eINSTANCE.getMergedRegion__MergedRegion__String_Integer_Integer_Integer_Integer();

		/**
		 * The meta object literal for the '{@link pgr.domain.util.impl.ComparatorRangeImpl <em>Comparator Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pgr.domain.util.impl.ComparatorRangeImpl
		 * @see pgr.domain.util.impl.UtilPackageImpl#getComparatorRange()
		 * @generated
		 */
		EClass COMPARATOR_RANGE = eINSTANCE.getComparatorRange();

		/**
		 * The meta object literal for the '<em><b>The Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARATOR_RANGE__THE_DOMAIN = eINSTANCE.getComparatorRange_TheDomain();

		/**
		 * The meta object literal for the '<em><b>Compare</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPARATOR_RANGE___COMPARE__OBJECT_OBJECT = eINSTANCE.getComparatorRange__Compare__Object_Object();

		/**
		 * The meta object literal for the '{@link pgr.domain.util.impl.UnzipImpl <em>Unzip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pgr.domain.util.impl.UnzipImpl
		 * @see pgr.domain.util.impl.UtilPackageImpl#getUnzip()
		 * @generated
		 */
		EClass UNZIP = eINSTANCE.getUnzip();

		/**
		 * The meta object literal for the '<em><b>The Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNZIP__THE_DOMAIN = eINSTANCE.getUnzip_TheDomain();

		/**
		 * The meta object literal for the '<em><b>Copy Input Stream</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UNZIP___COPY_INPUT_STREAM__INPUTSTREAM_OUTPUTSTREAM = eINSTANCE.getUnzip__CopyInputStream__InputStream_OutputStream();

		/**
		 * The meta object literal for the '<em><b>Remove Extension</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UNZIP___REMOVE_EXTENSION__STRING = eINSTANCE.getUnzip__RemoveExtension__String();

		/**
		 * The meta object literal for the '<em><b>Unzip</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UNZIP___UNZIP__STRING_STRING = eINSTANCE.getUnzip__Unzip__String_String();

	}

} //UtilPackage
