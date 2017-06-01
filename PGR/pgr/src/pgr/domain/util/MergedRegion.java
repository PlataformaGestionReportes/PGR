/**
 */
package pgr.domain.util;

import org.eclipse.emf.ecore.EObject;

import pgr.domain.Domain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merged Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pgr.domain.util.MergedRegion#getText <em>Text</em>}</li>
 *   <li>{@link pgr.domain.util.MergedRegion#getFirstColumn <em>First Column</em>}</li>
 *   <li>{@link pgr.domain.util.MergedRegion#getLastColumn <em>Last Column</em>}</li>
 *   <li>{@link pgr.domain.util.MergedRegion#getFirstRow <em>First Row</em>}</li>
 *   <li>{@link pgr.domain.util.MergedRegion#getLastRow <em>Last Row</em>}</li>
 *   <li>{@link pgr.domain.util.MergedRegion#getTheDomain <em>The Domain</em>}</li>
 * </ul>
 *
 * @see pgr.domain.util.UtilPackage#getMergedRegion()
 * @model
 * @generated
 */
public interface MergedRegion extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see pgr.domain.util.UtilPackage#getMergedRegion_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link pgr.domain.util.MergedRegion#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>First Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Column</em>' attribute.
	 * @see #setFirstColumn(Integer)
	 * @see pgr.domain.util.UtilPackage#getMergedRegion_FirstColumn()
	 * @model
	 * @generated
	 */
	Integer getFirstColumn();

	/**
	 * Sets the value of the '{@link pgr.domain.util.MergedRegion#getFirstColumn <em>First Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Column</em>' attribute.
	 * @see #getFirstColumn()
	 * @generated
	 */
	void setFirstColumn(Integer value);

	/**
	 * Returns the value of the '<em><b>Last Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Column</em>' attribute.
	 * @see #setLastColumn(Integer)
	 * @see pgr.domain.util.UtilPackage#getMergedRegion_LastColumn()
	 * @model
	 * @generated
	 */
	Integer getLastColumn();

	/**
	 * Sets the value of the '{@link pgr.domain.util.MergedRegion#getLastColumn <em>Last Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Column</em>' attribute.
	 * @see #getLastColumn()
	 * @generated
	 */
	void setLastColumn(Integer value);

	/**
	 * Returns the value of the '<em><b>First Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Row</em>' attribute.
	 * @see #setFirstRow(Integer)
	 * @see pgr.domain.util.UtilPackage#getMergedRegion_FirstRow()
	 * @model
	 * @generated
	 */
	Integer getFirstRow();

	/**
	 * Sets the value of the '{@link pgr.domain.util.MergedRegion#getFirstRow <em>First Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Row</em>' attribute.
	 * @see #getFirstRow()
	 * @generated
	 */
	void setFirstRow(Integer value);

	/**
	 * Returns the value of the '<em><b>Last Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Row</em>' attribute.
	 * @see #setLastRow(Integer)
	 * @see pgr.domain.util.UtilPackage#getMergedRegion_LastRow()
	 * @model
	 * @generated
	 */
	Integer getLastRow();

	/**
	 * Sets the value of the '{@link pgr.domain.util.MergedRegion#getLastRow <em>Last Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Row</em>' attribute.
	 * @see #getLastRow()
	 * @generated
	 */
	void setLastRow(Integer value);

	/**
	 * Returns the value of the '<em><b>The Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link pgr.domain.Domain#getTheMergedRegion <em>The Merged Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Domain</em>' container reference.
	 * @see #setTheDomain(Domain)
	 * @see pgr.domain.util.UtilPackage#getMergedRegion_TheDomain()
	 * @see pgr.domain.Domain#getTheMergedRegion
	 * @model opposite="theMergedRegion"
	 * @generated
	 */
	Domain getTheDomain();

	/**
	 * Sets the value of the '{@link pgr.domain.util.MergedRegion#getTheDomain <em>The Domain</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Domain</em>' container reference.
	 * @see #getTheDomain()
	 * @generated
	 */
	void setTheDomain(Domain value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tthis.text = text;\r\n\t\tthis.firstColumn = firstColumn;\r\n\t\tthis.lastColumn = lastColumn;\r\n\t\tthis.firstRow = firstRow;\r\n\t\tthis.lastRow = lastRow;'"
	 * @generated
	 */
	void MergedRegion(String text, Integer firstColumn, Integer lastColumn, Integer firstRow, Integer lastRow);

} // MergedRegion
