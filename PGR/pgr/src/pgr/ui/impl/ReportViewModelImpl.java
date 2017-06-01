/**
 */
package pgr.ui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import pgr.ui.ReportView;
import pgr.ui.ReportViewModel;
import pgr.ui.UiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Report View Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pgr.ui.impl.ReportViewModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link pgr.ui.impl.ReportViewModelImpl#getOwnedByReportView <em>Owned By Report View</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReportViewModelImpl extends MinimalEObjectImpl.Container implements ReportViewModel {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportViewModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.REPORT_VIEW_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.REPORT_VIEW_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportView getOwnedByReportView() {
		if (eContainerFeatureID() != UiPackage.REPORT_VIEW_MODEL__OWNED_BY_REPORT_VIEW) return null;
		return (ReportView)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedByReportView(ReportView newOwnedByReportView, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedByReportView, UiPackage.REPORT_VIEW_MODEL__OWNED_BY_REPORT_VIEW, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedByReportView(ReportView newOwnedByReportView) {
		if (newOwnedByReportView != eInternalContainer() || (eContainerFeatureID() != UiPackage.REPORT_VIEW_MODEL__OWNED_BY_REPORT_VIEW && newOwnedByReportView != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedByReportView))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedByReportView != null)
				msgs = ((InternalEObject)newOwnedByReportView).eInverseAdd(this, UiPackage.REPORT_VIEW__LIST_REPORT_VIEW_MODEL, ReportView.class, msgs);
			msgs = basicSetOwnedByReportView(newOwnedByReportView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.REPORT_VIEW_MODEL__OWNED_BY_REPORT_VIEW, newOwnedByReportView, newOwnedByReportView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiPackage.REPORT_VIEW_MODEL__OWNED_BY_REPORT_VIEW:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedByReportView((ReportView)otherEnd, msgs);
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
			case UiPackage.REPORT_VIEW_MODEL__OWNED_BY_REPORT_VIEW:
				return basicSetOwnedByReportView(null, msgs);
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
			case UiPackage.REPORT_VIEW_MODEL__OWNED_BY_REPORT_VIEW:
				return eInternalContainer().eInverseRemove(this, UiPackage.REPORT_VIEW__LIST_REPORT_VIEW_MODEL, ReportView.class, msgs);
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
			case UiPackage.REPORT_VIEW_MODEL__NAME:
				return getName();
			case UiPackage.REPORT_VIEW_MODEL__OWNED_BY_REPORT_VIEW:
				return getOwnedByReportView();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UiPackage.REPORT_VIEW_MODEL__NAME:
				setName((String)newValue);
				return;
			case UiPackage.REPORT_VIEW_MODEL__OWNED_BY_REPORT_VIEW:
				setOwnedByReportView((ReportView)newValue);
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
			case UiPackage.REPORT_VIEW_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UiPackage.REPORT_VIEW_MODEL__OWNED_BY_REPORT_VIEW:
				setOwnedByReportView((ReportView)null);
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
			case UiPackage.REPORT_VIEW_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UiPackage.REPORT_VIEW_MODEL__OWNED_BY_REPORT_VIEW:
				return getOwnedByReportView() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ReportViewModelImpl
