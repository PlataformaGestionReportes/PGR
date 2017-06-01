/**
 */
package pgr.ui;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import pgr.ModelFactory;

import pgr.domain.Domain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pgr.ui.UI#getTheDomain <em>The Domain</em>}</li>
 *   <li>{@link pgr.ui.UI#getTheModelFactory <em>The Model Factory</em>}</li>
 *   <li>{@link pgr.ui.UI#getTheReportView <em>The Report View</em>}</li>
 * </ul>
 *
 * @see pgr.ui.UiPackage#getUI()
 * @model
 * @generated
 */
public interface UI extends EObject {
	/**
	 * Returns the value of the '<em><b>The Domain</b></em>' reference list.
	 * The list contents are of type {@link pgr.domain.Domain}.
	 * It is bidirectional and its opposite is '{@link pgr.domain.Domain#getTheUI <em>The UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Domain</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Domain</em>' reference list.
	 * @see pgr.ui.UiPackage#getUI_TheDomain()
	 * @see pgr.domain.Domain#getTheUI
	 * @model opposite="theUI"
	 * @generated
	 */
	EList<Domain> getTheDomain();

	/**
	 * Returns the value of the '<em><b>The Model Factory</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link pgr.ModelFactory#getTheUI <em>The UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Model Factory</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Model Factory</em>' container reference.
	 * @see #setTheModelFactory(ModelFactory)
	 * @see pgr.ui.UiPackage#getUI_TheModelFactory()
	 * @see pgr.ModelFactory#getTheUI
	 * @model opposite="theUI"
	 * @generated
	 */
	ModelFactory getTheModelFactory();

	/**
	 * Sets the value of the '{@link pgr.ui.UI#getTheModelFactory <em>The Model Factory</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Model Factory</em>' container reference.
	 * @see #getTheModelFactory()
	 * @generated
	 */
	void setTheModelFactory(ModelFactory value);

	/**
	 * Returns the value of the '<em><b>The Report View</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link pgr.ui.ReportView#getOwnedByUI <em>Owned By UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Report View</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Report View</em>' containment reference.
	 * @see #setTheReportView(ReportView)
	 * @see pgr.ui.UiPackage#getUI_TheReportView()
	 * @see pgr.ui.ReportView#getOwnedByUI
	 * @model opposite="ownedByUI" containment="true" required="true"
	 * @generated
	 */
	ReportView getTheReportView();

	/**
	 * Sets the value of the '{@link pgr.ui.UI#getTheReportView <em>The Report View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Report View</em>' containment reference.
	 * @see #getTheReportView()
	 * @generated
	 */
	void setTheReportView(ReportView value);

} // UI
