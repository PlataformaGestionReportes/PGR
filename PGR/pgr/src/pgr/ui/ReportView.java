/**
 */
package pgr.ui;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Report View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pgr.ui.ReportView#getOwnedByUI <em>Owned By UI</em>}</li>
 *   <li>{@link pgr.ui.ReportView#getListReportViewModel <em>List Report View Model</em>}</li>
 * </ul>
 *
 * @see pgr.ui.UiPackage#getReportView()
 * @model
 * @generated
 */
public interface ReportView extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned By UI</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link pgr.ui.UI#getTheReportView <em>The Report View</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned By UI</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned By UI</em>' container reference.
	 * @see #setOwnedByUI(UI)
	 * @see pgr.ui.UiPackage#getReportView_OwnedByUI()
	 * @see pgr.ui.UI#getTheReportView
	 * @model opposite="theReportView"
	 * @generated
	 */
	UI getOwnedByUI();

	/**
	 * Sets the value of the '{@link pgr.ui.ReportView#getOwnedByUI <em>Owned By UI</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned By UI</em>' container reference.
	 * @see #getOwnedByUI()
	 * @generated
	 */
	void setOwnedByUI(UI value);

	/**
	 * Returns the value of the '<em><b>List Report View Model</b></em>' containment reference list.
	 * The list contents are of type {@link pgr.ui.ReportViewModel}.
	 * It is bidirectional and its opposite is '{@link pgr.ui.ReportViewModel#getOwnedByReportView <em>Owned By Report View</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Report View Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Report View Model</em>' containment reference list.
	 * @see pgr.ui.UiPackage#getReportView_ListReportViewModel()
	 * @see pgr.ui.ReportViewModel#getOwnedByReportView
	 * @model opposite="ownedByReportView" containment="true"
	 * @generated
	 */
	EList<ReportViewModel> getListReportViewModel();

} // ReportView
