/**
 */
package pgr.ui.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import pgr.ui.ReportView;
import pgr.ui.ReportViewModel;
import pgr.ui.UI;
import pgr.ui.UiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Report View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pgr.ui.impl.ReportViewImpl#getOwnedByUI <em>Owned By UI</em>}</li>
 *   <li>{@link pgr.ui.impl.ReportViewImpl#getListReportViewModel <em>List Report View Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReportViewImpl extends MinimalEObjectImpl.Container implements ReportView {
	/**
	 * The cached value of the '{@link #getListReportViewModel() <em>List Report View Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListReportViewModel()
	 * @generated
	 * @ordered
	 */
	protected EList<ReportViewModel> listReportViewModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.REPORT_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UI getOwnedByUI() {
		if (eContainerFeatureID() != UiPackage.REPORT_VIEW__OWNED_BY_UI) return null;
		return (UI)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByUI(UI newOwnedByUI, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByUI, UiPackage.REPORT_VIEW__OWNED_BY_UI, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByUI(UI newOwnedByUI) {
		if (newOwnedByUI != eInternalContainer() || (eContainerFeatureID() != UiPackage.REPORT_VIEW__OWNED_BY_UI && newOwnedByUI != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByUI))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByUI != null)
				msgs = ((InternalEObject)newOwnedByUI).eInverseAdd(this, UiPackage.UI__THE_REPORT_VIEW, UI.class, msgs);
			msgs = basicSetOwnedByUI(newOwnedByUI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.REPORT_VIEW__OWNED_BY_UI, newOwnedByUI, newOwnedByUI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReportViewModel> getListReportViewModel() {
		if (listReportViewModel == null) {
			listReportViewModel = new EObjectContainmentWithInverseEList<ReportViewModel>(ReportViewModel.class, this, UiPackage.REPORT_VIEW__LIST_REPORT_VIEW_MODEL, UiPackage.REPORT_VIEW_MODEL__OWNED_BY_REPORT_VIEW);
		}
		return listReportViewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiPackage.REPORT_VIEW__OWNED_BY_UI:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByUI((UI)otherEnd, msgs);
			case UiPackage.REPORT_VIEW__LIST_REPORT_VIEW_MODEL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListReportViewModel()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiPackage.REPORT_VIEW__OWNED_BY_UI:
				return basicSetOwnedByUI(null, msgs);
			case UiPackage.REPORT_VIEW__LIST_REPORT_VIEW_MODEL:
				return ((InternalEList<?>)getListReportViewModel()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case UiPackage.REPORT_VIEW__OWNED_BY_UI:
				return eInternalContainer().eInverseRemove(this, UiPackage.UI__THE_REPORT_VIEW, UI.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UiPackage.REPORT_VIEW__OWNED_BY_UI:
				return getOwnedByUI();
			case UiPackage.REPORT_VIEW__LIST_REPORT_VIEW_MODEL:
				return getListReportViewModel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UiPackage.REPORT_VIEW__OWNED_BY_UI:
				setOwnedByUI((UI)newValue);
				return;
			case UiPackage.REPORT_VIEW__LIST_REPORT_VIEW_MODEL:
				getListReportViewModel().clear();
				getListReportViewModel().addAll((Collection<? extends ReportViewModel>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UiPackage.REPORT_VIEW__OWNED_BY_UI:
				setOwnedByUI((UI)null);
				return;
			case UiPackage.REPORT_VIEW__LIST_REPORT_VIEW_MODEL:
				getListReportViewModel().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UiPackage.REPORT_VIEW__OWNED_BY_UI:
				return getOwnedByUI() != null;
			case UiPackage.REPORT_VIEW__LIST_REPORT_VIEW_MODEL:
				return listReportViewModel != null && !listReportViewModel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReportViewImpl
