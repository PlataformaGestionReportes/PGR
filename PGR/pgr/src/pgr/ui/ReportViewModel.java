/**
 */
package pgr.ui;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Report View Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pgr.ui.ReportViewModel#getName <em>Name</em>}</li>
 *   <li>{@link pgr.ui.ReportViewModel#getOwnedByReportView <em>Owned By Report View</em>}</li>
 * </ul>
 *
 * @see pgr.ui.UiPackage#getReportViewModel()
 * @model
 * @generated
 */
public interface ReportViewModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pgr.ui.UiPackage#getReportViewModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pgr.ui.ReportViewModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Owned By Report View</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link pgr.ui.ReportView#getListReportViewModel <em>List Report View Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By Report View</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By Report View</em>' container reference.
	 * @see #setOwnedByReportView(ReportView)
	 * @see pgr.ui.UiPackage#getReportViewModel_OwnedByReportView()
	 * @see pgr.ui.ReportView#getListReportViewModel
	 * @model opposite="listReportViewModel"
	 * @generated
	 */
	ReportView getOwnedByReportView();

	/**
	 * Sets the value of the '{@link pgr.ui.ReportViewModel#getOwnedByReportView <em>Owned By Report View</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By Report View</em>' container reference.
	 * @see #getOwnedByReportView()
	 * @generated
	 */
	void setOwnedByReportView(ReportView value);

} // ReportViewModel
