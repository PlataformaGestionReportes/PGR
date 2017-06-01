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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import pgr.ModelFactory;
import pgr.PgrPackage;

import pgr.domain.Domain;
import pgr.domain.DomainPackage;

import pgr.ui.ReportView;
import pgr.ui.UI;
import pgr.ui.UiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pgr.ui.impl.UIImpl#getTheDomain <em>The Domain</em>}</li>
 *   <li>{@link pgr.ui.impl.UIImpl#getTheModelFactory <em>The Model Factory</em>}</li>
 *   <li>{@link pgr.ui.impl.UIImpl#getTheReportView <em>The Report View</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UIImpl extends MinimalEObjectImpl.Container implements UI {
	/**
	 * The cached value of the '{@link #getTheDomain() <em>The Domain</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheDomain()
	 * @generated
	 * @ordered
	 */
	protected EList<Domain> theDomain;

	/**
	 * The cached value of the '{@link #getTheReportView() <em>The Report View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheReportView()
	 * @generated
	 * @ordered
	 */
	protected ReportView theReportView;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.UI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Domain> getTheDomain() {
		if (theDomain == null) {
			theDomain = new EObjectWithInverseResolvingEList.ManyInverse<Domain>(Domain.class, this, UiPackage.UI__THE_DOMAIN, DomainPackage.DOMAIN__THE_UI);
		}
		return theDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getTheModelFactory() {
		if (eContainerFeatureID() != UiPackage.UI__THE_MODEL_FACTORY) return null;
		return (ModelFactory)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheModelFactory(ModelFactory newTheModelFactory, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTheModelFactory, UiPackage.UI__THE_MODEL_FACTORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheModelFactory(ModelFactory newTheModelFactory) {
		if (newTheModelFactory != eInternalContainer() || (eContainerFeatureID() != UiPackage.UI__THE_MODEL_FACTORY && newTheModelFactory != null)) {
			if (EcoreUtil.isAncestor(this, newTheModelFactory))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTheModelFactory != null)
				msgs = ((InternalEObject)newTheModelFactory).eInverseAdd(this, PgrPackage.MODEL_FACTORY__THE_UI, ModelFactory.class, msgs);
			msgs = basicSetTheModelFactory(newTheModelFactory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI__THE_MODEL_FACTORY, newTheModelFactory, newTheModelFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportView getTheReportView() {
		return theReportView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheReportView(ReportView newTheReportView, NotificationChain msgs) {
		ReportView oldTheReportView = theReportView;
		theReportView = newTheReportView;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiPackage.UI__THE_REPORT_VIEW, oldTheReportView, newTheReportView);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheReportView(ReportView newTheReportView) {
		if (newTheReportView != theReportView) {
			NotificationChain msgs = null;
			if (theReportView != null)
				msgs = ((InternalEObject)theReportView).eInverseRemove(this, UiPackage.REPORT_VIEW__OWNED_BY_UI, ReportView.class, msgs);
			if (newTheReportView != null)
				msgs = ((InternalEObject)newTheReportView).eInverseAdd(this, UiPackage.REPORT_VIEW__OWNED_BY_UI, ReportView.class, msgs);
			msgs = basicSetTheReportView(newTheReportView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.UI__THE_REPORT_VIEW, newTheReportView, newTheReportView));
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
			case UiPackage.UI__THE_DOMAIN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTheDomain()).basicAdd(otherEnd, msgs);
			case UiPackage.UI__THE_MODEL_FACTORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTheModelFactory((ModelFactory)otherEnd, msgs);
			case UiPackage.UI__THE_REPORT_VIEW:
				if (theReportView != null)
					msgs = ((InternalEObject)theReportView).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiPackage.UI__THE_REPORT_VIEW, null, msgs);
				return basicSetTheReportView((ReportView)otherEnd, msgs);
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
			case UiPackage.UI__THE_DOMAIN:
				return ((InternalEList<?>)getTheDomain()).basicRemove(otherEnd, msgs);
			case UiPackage.UI__THE_MODEL_FACTORY:
				return basicSetTheModelFactory(null, msgs);
			case UiPackage.UI__THE_REPORT_VIEW:
				return basicSetTheReportView(null, msgs);
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
			case UiPackage.UI__THE_MODEL_FACTORY:
				return eInternalContainer().eInverseRemove(this, PgrPackage.MODEL_FACTORY__THE_UI, ModelFactory.class, msgs);
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
			case UiPackage.UI__THE_DOMAIN:
				return getTheDomain();
			case UiPackage.UI__THE_MODEL_FACTORY:
				return getTheModelFactory();
			case UiPackage.UI__THE_REPORT_VIEW:
				return getTheReportView();
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
			case UiPackage.UI__THE_DOMAIN:
				getTheDomain().clear();
				getTheDomain().addAll((Collection<? extends Domain>)newValue);
				return;
			case UiPackage.UI__THE_MODEL_FACTORY:
				setTheModelFactory((ModelFactory)newValue);
				return;
			case UiPackage.UI__THE_REPORT_VIEW:
				setTheReportView((ReportView)newValue);
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
			case UiPackage.UI__THE_DOMAIN:
				getTheDomain().clear();
				return;
			case UiPackage.UI__THE_MODEL_FACTORY:
				setTheModelFactory((ModelFactory)null);
				return;
			case UiPackage.UI__THE_REPORT_VIEW:
				setTheReportView((ReportView)null);
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
			case UiPackage.UI__THE_DOMAIN:
				return theDomain != null && !theDomain.isEmpty();
			case UiPackage.UI__THE_MODEL_FACTORY:
				return getTheModelFactory() != null;
			case UiPackage.UI__THE_REPORT_VIEW:
				return theReportView != null;
		}
		return super.eIsSet(featureID);
	}

} //UIImpl
