/**
 */
package pgr.domain.impl;

import java.util.Collection;
import java.util.Comparator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import pgr.ModelFactory;
import pgr.PgrPackage;

import pgr.domain.Domain;
import pgr.domain.DomainPackage;
import pgr.domain.Report;

import pgr.domain.generators.DataformDiagramGenerator;
import pgr.domain.generators.DataformGenerator;
import pgr.domain.generators.ExcelGenerator;
import pgr.domain.generators.ExcelUpdater;
import pgr.domain.generators.GeneratorsPackage;
import pgr.domain.generators.ViewModelGenerator;

import pgr.domain.util.MergedRegion;
import pgr.domain.util.Unzip;
import pgr.domain.util.UtilPackage;

import pgr.ui.UI;
import pgr.ui.UiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pgr.domain.impl.DomainImpl#getTheUI <em>The UI</em>}</li>
 *   <li>{@link pgr.domain.impl.DomainImpl#getTheModelFactory <em>The Model Factory</em>}</li>
 *   <li>{@link pgr.domain.impl.DomainImpl#getListReport <em>List Report</em>}</li>
 *   <li>{@link pgr.domain.impl.DomainImpl#getTheViewModelGenerator <em>The View Model Generator</em>}</li>
 *   <li>{@link pgr.domain.impl.DomainImpl#getTheDataformDiagramGenerator <em>The Dataform Diagram Generator</em>}</li>
 *   <li>{@link pgr.domain.impl.DomainImpl#getTheDataformGenerator <em>The Dataform Generator</em>}</li>
 *   <li>{@link pgr.domain.impl.DomainImpl#getTheExcelGenerator <em>The Excel Generator</em>}</li>
 *   <li>{@link pgr.domain.impl.DomainImpl#getTheExcelUpdater <em>The Excel Updater</em>}</li>
 *   <li>{@link pgr.domain.impl.DomainImpl#getTheCoordinate <em>The Coordinate</em>}</li>
 *   <li>{@link pgr.domain.impl.DomainImpl#getTheMergedRegion <em>The Merged Region</em>}</li>
 *   <li>{@link pgr.domain.impl.DomainImpl#getTheComparatorRange <em>The Comparator Range</em>}</li>
 *   <li>{@link pgr.domain.impl.DomainImpl#getTheUnzip <em>The Unzip</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainImpl extends MinimalEObjectImpl.Container implements Domain {
	/**
	 * The cached value of the '{@link #getTheUI() <em>The UI</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheUI()
	 * @generated
	 * @ordered
	 */
	protected EList<UI> theUI;

	/**
	 * The cached value of the '{@link #getListReport() <em>List Report</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListReport()
	 * @generated
	 * @ordered
	 */
	protected EList<Report> listReport;

	/**
	 * The cached value of the '{@link #getTheViewModelGenerator() <em>The View Model Generator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheViewModelGenerator()
	 * @generated
	 * @ordered
	 */
	protected ViewModelGenerator theViewModelGenerator;

	/**
	 * The cached value of the '{@link #getTheDataformDiagramGenerator() <em>The Dataform Diagram Generator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheDataformDiagramGenerator()
	 * @generated
	 * @ordered
	 */
	protected DataformDiagramGenerator theDataformDiagramGenerator;

	/**
	 * The cached value of the '{@link #getTheDataformGenerator() <em>The Dataform Generator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheDataformGenerator()
	 * @generated
	 * @ordered
	 */
	protected DataformGenerator theDataformGenerator;

	/**
	 * The cached value of the '{@link #getTheExcelGenerator() <em>The Excel Generator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheExcelGenerator()
	 * @generated
	 * @ordered
	 */
	protected ExcelGenerator theExcelGenerator;

	/**
	 * The cached value of the '{@link #getTheExcelUpdater() <em>The Excel Updater</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheExcelUpdater()
	 * @generated
	 * @ordered
	 */
	protected ExcelUpdater theExcelUpdater;

	/**
	 * The cached value of the '{@link #getTheCoordinate() <em>The Coordinate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheCoordinate()
	 * @generated
	 * @ordered
	 */
	protected Comparable theCoordinate;

	/**
	 * The cached value of the '{@link #getTheMergedRegion() <em>The Merged Region</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheMergedRegion()
	 * @generated
	 * @ordered
	 */
	protected MergedRegion theMergedRegion;

	/**
	 * The cached value of the '{@link #getTheComparatorRange() <em>The Comparator Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheComparatorRange()
	 * @generated
	 * @ordered
	 */
	protected Comparator theComparatorRange;

	/**
	 * The cached value of the '{@link #getTheUnzip() <em>The Unzip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheUnzip()
	 * @generated
	 * @ordered
	 */
	protected Unzip theUnzip;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UI> getTheUI() {
		if (theUI == null) {
			theUI = new EObjectWithInverseResolvingEList.ManyInverse<UI>(UI.class, this, DomainPackage.DOMAIN__THE_UI, UiPackage.UI__THE_DOMAIN);
		}
		return theUI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getTheModelFactory() {
		if (eContainerFeatureID() != DomainPackage.DOMAIN__THE_MODEL_FACTORY) return null;
		return (ModelFactory)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheModelFactory(ModelFactory newTheModelFactory, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTheModelFactory, DomainPackage.DOMAIN__THE_MODEL_FACTORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheModelFactory(ModelFactory newTheModelFactory) {
		if (newTheModelFactory != eInternalContainer() || (eContainerFeatureID() != DomainPackage.DOMAIN__THE_MODEL_FACTORY && newTheModelFactory != null)) {
			if (EcoreUtil.isAncestor(this, newTheModelFactory))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTheModelFactory != null)
				msgs = ((InternalEObject)newTheModelFactory).eInverseAdd(this, PgrPackage.MODEL_FACTORY__THE_DOMAIN, ModelFactory.class, msgs);
			msgs = basicSetTheModelFactory(newTheModelFactory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_MODEL_FACTORY, newTheModelFactory, newTheModelFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Report> getListReport() {
		if (listReport == null) {
			listReport = new EObjectContainmentWithInverseEList<Report>(Report.class, this, DomainPackage.DOMAIN__LIST_REPORT, DomainPackage.REPORT__OWNED_BY_DOMAIN);
		}
		return listReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewModelGenerator getTheViewModelGenerator() {
		return theViewModelGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheViewModelGenerator(ViewModelGenerator newTheViewModelGenerator, NotificationChain msgs) {
		ViewModelGenerator oldTheViewModelGenerator = theViewModelGenerator;
		theViewModelGenerator = newTheViewModelGenerator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_VIEW_MODEL_GENERATOR, oldTheViewModelGenerator, newTheViewModelGenerator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheViewModelGenerator(ViewModelGenerator newTheViewModelGenerator) {
		if (newTheViewModelGenerator != theViewModelGenerator) {
			NotificationChain msgs = null;
			if (theViewModelGenerator != null)
				msgs = ((InternalEObject)theViewModelGenerator).eInverseRemove(this, GeneratorsPackage.VIEW_MODEL_GENERATOR__THE_DOMAIN, ViewModelGenerator.class, msgs);
			if (newTheViewModelGenerator != null)
				msgs = ((InternalEObject)newTheViewModelGenerator).eInverseAdd(this, GeneratorsPackage.VIEW_MODEL_GENERATOR__THE_DOMAIN, ViewModelGenerator.class, msgs);
			msgs = basicSetTheViewModelGenerator(newTheViewModelGenerator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_VIEW_MODEL_GENERATOR, newTheViewModelGenerator, newTheViewModelGenerator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataformDiagramGenerator getTheDataformDiagramGenerator() {
		return theDataformDiagramGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheDataformDiagramGenerator(DataformDiagramGenerator newTheDataformDiagramGenerator, NotificationChain msgs) {
		DataformDiagramGenerator oldTheDataformDiagramGenerator = theDataformDiagramGenerator;
		theDataformDiagramGenerator = newTheDataformDiagramGenerator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_DATAFORM_DIAGRAM_GENERATOR, oldTheDataformDiagramGenerator, newTheDataformDiagramGenerator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheDataformDiagramGenerator(DataformDiagramGenerator newTheDataformDiagramGenerator) {
		if (newTheDataformDiagramGenerator != theDataformDiagramGenerator) {
			NotificationChain msgs = null;
			if (theDataformDiagramGenerator != null)
				msgs = ((InternalEObject)theDataformDiagramGenerator).eInverseRemove(this, GeneratorsPackage.DATAFORM_DIAGRAM_GENERATOR__THE_DOMAIN, DataformDiagramGenerator.class, msgs);
			if (newTheDataformDiagramGenerator != null)
				msgs = ((InternalEObject)newTheDataformDiagramGenerator).eInverseAdd(this, GeneratorsPackage.DATAFORM_DIAGRAM_GENERATOR__THE_DOMAIN, DataformDiagramGenerator.class, msgs);
			msgs = basicSetTheDataformDiagramGenerator(newTheDataformDiagramGenerator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_DATAFORM_DIAGRAM_GENERATOR, newTheDataformDiagramGenerator, newTheDataformDiagramGenerator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataformGenerator getTheDataformGenerator() {
		return theDataformGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheDataformGenerator(DataformGenerator newTheDataformGenerator, NotificationChain msgs) {
		DataformGenerator oldTheDataformGenerator = theDataformGenerator;
		theDataformGenerator = newTheDataformGenerator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_DATAFORM_GENERATOR, oldTheDataformGenerator, newTheDataformGenerator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheDataformGenerator(DataformGenerator newTheDataformGenerator) {
		if (newTheDataformGenerator != theDataformGenerator) {
			NotificationChain msgs = null;
			if (theDataformGenerator != null)
				msgs = ((InternalEObject)theDataformGenerator).eInverseRemove(this, GeneratorsPackage.DATAFORM_GENERATOR__THE_DOMAIN, DataformGenerator.class, msgs);
			if (newTheDataformGenerator != null)
				msgs = ((InternalEObject)newTheDataformGenerator).eInverseAdd(this, GeneratorsPackage.DATAFORM_GENERATOR__THE_DOMAIN, DataformGenerator.class, msgs);
			msgs = basicSetTheDataformGenerator(newTheDataformGenerator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_DATAFORM_GENERATOR, newTheDataformGenerator, newTheDataformGenerator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExcelGenerator getTheExcelGenerator() {
		return theExcelGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheExcelGenerator(ExcelGenerator newTheExcelGenerator, NotificationChain msgs) {
		ExcelGenerator oldTheExcelGenerator = theExcelGenerator;
		theExcelGenerator = newTheExcelGenerator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_EXCEL_GENERATOR, oldTheExcelGenerator, newTheExcelGenerator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheExcelGenerator(ExcelGenerator newTheExcelGenerator) {
		if (newTheExcelGenerator != theExcelGenerator) {
			NotificationChain msgs = null;
			if (theExcelGenerator != null)
				msgs = ((InternalEObject)theExcelGenerator).eInverseRemove(this, GeneratorsPackage.EXCEL_GENERATOR__THE_DOMAIN, ExcelGenerator.class, msgs);
			if (newTheExcelGenerator != null)
				msgs = ((InternalEObject)newTheExcelGenerator).eInverseAdd(this, GeneratorsPackage.EXCEL_GENERATOR__THE_DOMAIN, ExcelGenerator.class, msgs);
			msgs = basicSetTheExcelGenerator(newTheExcelGenerator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_EXCEL_GENERATOR, newTheExcelGenerator, newTheExcelGenerator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExcelUpdater getTheExcelUpdater() {
		return theExcelUpdater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheExcelUpdater(ExcelUpdater newTheExcelUpdater, NotificationChain msgs) {
		ExcelUpdater oldTheExcelUpdater = theExcelUpdater;
		theExcelUpdater = newTheExcelUpdater;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_EXCEL_UPDATER, oldTheExcelUpdater, newTheExcelUpdater);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheExcelUpdater(ExcelUpdater newTheExcelUpdater) {
		if (newTheExcelUpdater != theExcelUpdater) {
			NotificationChain msgs = null;
			if (theExcelUpdater != null)
				msgs = ((InternalEObject)theExcelUpdater).eInverseRemove(this, GeneratorsPackage.EXCEL_UPDATER__DOMAIN, ExcelUpdater.class, msgs);
			if (newTheExcelUpdater != null)
				msgs = ((InternalEObject)newTheExcelUpdater).eInverseAdd(this, GeneratorsPackage.EXCEL_UPDATER__DOMAIN, ExcelUpdater.class, msgs);
			msgs = basicSetTheExcelUpdater(newTheExcelUpdater, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_EXCEL_UPDATER, newTheExcelUpdater, newTheExcelUpdater));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comparable getTheCoordinate() {
		return theCoordinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheCoordinate(Comparable newTheCoordinate, NotificationChain msgs) {
		Comparable oldTheCoordinate = theCoordinate;
		theCoordinate = newTheCoordinate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_COORDINATE, oldTheCoordinate, newTheCoordinate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheCoordinate(Comparable newTheCoordinate) {
		if (newTheCoordinate != theCoordinate) {
			NotificationChain msgs = null;
			if (theCoordinate != null)
				msgs = ((InternalEObject)theCoordinate).eInverseRemove(this, UtilPackage.COORDINATE__THE_DOMAIN, Object.class, msgs);
			if (newTheCoordinate != null)
				msgs = ((InternalEObject)newTheCoordinate).eInverseAdd(this, UtilPackage.COORDINATE__THE_DOMAIN, Object.class, msgs);
			msgs = basicSetTheCoordinate(newTheCoordinate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_COORDINATE, newTheCoordinate, newTheCoordinate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergedRegion getTheMergedRegion() {
		return theMergedRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheMergedRegion(MergedRegion newTheMergedRegion, NotificationChain msgs) {
		MergedRegion oldTheMergedRegion = theMergedRegion;
		theMergedRegion = newTheMergedRegion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_MERGED_REGION, oldTheMergedRegion, newTheMergedRegion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheMergedRegion(MergedRegion newTheMergedRegion) {
		if (newTheMergedRegion != theMergedRegion) {
			NotificationChain msgs = null;
			if (theMergedRegion != null)
				msgs = ((InternalEObject)theMergedRegion).eInverseRemove(this, UtilPackage.MERGED_REGION__THE_DOMAIN, MergedRegion.class, msgs);
			if (newTheMergedRegion != null)
				msgs = ((InternalEObject)newTheMergedRegion).eInverseAdd(this, UtilPackage.MERGED_REGION__THE_DOMAIN, MergedRegion.class, msgs);
			msgs = basicSetTheMergedRegion(newTheMergedRegion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_MERGED_REGION, newTheMergedRegion, newTheMergedRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comparator getTheComparatorRange() {
		return theComparatorRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheComparatorRange(Comparator newTheComparatorRange, NotificationChain msgs) {
		Comparator oldTheComparatorRange = theComparatorRange;
		theComparatorRange = newTheComparatorRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_COMPARATOR_RANGE, oldTheComparatorRange, newTheComparatorRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheComparatorRange(Comparator newTheComparatorRange) {
		if (newTheComparatorRange != theComparatorRange) {
			NotificationChain msgs = null;
			if (theComparatorRange != null)
				msgs = ((InternalEObject)theComparatorRange).eInverseRemove(this, UtilPackage.COMPARATOR_RANGE__THE_DOMAIN, Comparator.class, msgs);
			if (newTheComparatorRange != null)
				msgs = ((InternalEObject)newTheComparatorRange).eInverseAdd(this, UtilPackage.COMPARATOR_RANGE__THE_DOMAIN, Comparator.class, msgs);
			msgs = basicSetTheComparatorRange(newTheComparatorRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_COMPARATOR_RANGE, newTheComparatorRange, newTheComparatorRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unzip getTheUnzip() {
		return theUnzip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheUnzip(Unzip newTheUnzip, NotificationChain msgs) {
		Unzip oldTheUnzip = theUnzip;
		theUnzip = newTheUnzip;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_UNZIP, oldTheUnzip, newTheUnzip);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheUnzip(Unzip newTheUnzip) {
		if (newTheUnzip != theUnzip) {
			NotificationChain msgs = null;
			if (theUnzip != null)
				msgs = ((InternalEObject)theUnzip).eInverseRemove(this, UtilPackage.UNZIP__THE_DOMAIN, Unzip.class, msgs);
			if (newTheUnzip != null)
				msgs = ((InternalEObject)newTheUnzip).eInverseAdd(this, UtilPackage.UNZIP__THE_DOMAIN, Unzip.class, msgs);
			msgs = basicSetTheUnzip(newTheUnzip, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN__THE_UNZIP, newTheUnzip, newTheUnzip));
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
			case DomainPackage.DOMAIN__THE_UI:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTheUI()).basicAdd(otherEnd, msgs);
			case DomainPackage.DOMAIN__THE_MODEL_FACTORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTheModelFactory((ModelFactory)otherEnd, msgs);
			case DomainPackage.DOMAIN__LIST_REPORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getListReport()).basicAdd(otherEnd, msgs);
			case DomainPackage.DOMAIN__THE_VIEW_MODEL_GENERATOR:
				if (theViewModelGenerator != null)
					msgs = ((InternalEObject)theViewModelGenerator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN__THE_VIEW_MODEL_GENERATOR, null, msgs);
				return basicSetTheViewModelGenerator((ViewModelGenerator)otherEnd, msgs);
			case DomainPackage.DOMAIN__THE_DATAFORM_DIAGRAM_GENERATOR:
				if (theDataformDiagramGenerator != null)
					msgs = ((InternalEObject)theDataformDiagramGenerator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN__THE_DATAFORM_DIAGRAM_GENERATOR, null, msgs);
				return basicSetTheDataformDiagramGenerator((DataformDiagramGenerator)otherEnd, msgs);
			case DomainPackage.DOMAIN__THE_DATAFORM_GENERATOR:
				if (theDataformGenerator != null)
					msgs = ((InternalEObject)theDataformGenerator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN__THE_DATAFORM_GENERATOR, null, msgs);
				return basicSetTheDataformGenerator((DataformGenerator)otherEnd, msgs);
			case DomainPackage.DOMAIN__THE_EXCEL_GENERATOR:
				if (theExcelGenerator != null)
					msgs = ((InternalEObject)theExcelGenerator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN__THE_EXCEL_GENERATOR, null, msgs);
				return basicSetTheExcelGenerator((ExcelGenerator)otherEnd, msgs);
			case DomainPackage.DOMAIN__THE_EXCEL_UPDATER:
				if (theExcelUpdater != null)
					msgs = ((InternalEObject)theExcelUpdater).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN__THE_EXCEL_UPDATER, null, msgs);
				return basicSetTheExcelUpdater((ExcelUpdater)otherEnd, msgs);
			case DomainPackage.DOMAIN__THE_COORDINATE:
				if (theCoordinate != null)
					msgs = ((InternalEObject)theCoordinate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN__THE_COORDINATE, null, msgs);
				return basicSetTheCoordinate((Comparable)otherEnd, msgs);
			case DomainPackage.DOMAIN__THE_MERGED_REGION:
				if (theMergedRegion != null)
					msgs = ((InternalEObject)theMergedRegion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN__THE_MERGED_REGION, null, msgs);
				return basicSetTheMergedRegion((MergedRegion)otherEnd, msgs);
			case DomainPackage.DOMAIN__THE_COMPARATOR_RANGE:
				if (theComparatorRange != null)
					msgs = ((InternalEObject)theComparatorRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN__THE_COMPARATOR_RANGE, null, msgs);
				return basicSetTheComparatorRange((Comparator)otherEnd, msgs);
			case DomainPackage.DOMAIN__THE_UNZIP:
				if (theUnzip != null)
					msgs = ((InternalEObject)theUnzip).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomainPackage.DOMAIN__THE_UNZIP, null, msgs);
				return basicSetTheUnzip((Unzip)otherEnd, msgs);
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
			case DomainPackage.DOMAIN__THE_UI:
				return ((InternalEList<?>)getTheUI()).basicRemove(otherEnd, msgs);
			case DomainPackage.DOMAIN__THE_MODEL_FACTORY:
				return basicSetTheModelFactory(null, msgs);
			case DomainPackage.DOMAIN__LIST_REPORT:
				return ((InternalEList<?>)getListReport()).basicRemove(otherEnd, msgs);
			case DomainPackage.DOMAIN__THE_VIEW_MODEL_GENERATOR:
				return basicSetTheViewModelGenerator(null, msgs);
			case DomainPackage.DOMAIN__THE_DATAFORM_DIAGRAM_GENERATOR:
				return basicSetTheDataformDiagramGenerator(null, msgs);
			case DomainPackage.DOMAIN__THE_DATAFORM_GENERATOR:
				return basicSetTheDataformGenerator(null, msgs);
			case DomainPackage.DOMAIN__THE_EXCEL_GENERATOR:
				return basicSetTheExcelGenerator(null, msgs);
			case DomainPackage.DOMAIN__THE_EXCEL_UPDATER:
				return basicSetTheExcelUpdater(null, msgs);
			case DomainPackage.DOMAIN__THE_COORDINATE:
				return basicSetTheCoordinate(null, msgs);
			case DomainPackage.DOMAIN__THE_MERGED_REGION:
				return basicSetTheMergedRegion(null, msgs);
			case DomainPackage.DOMAIN__THE_COMPARATOR_RANGE:
				return basicSetTheComparatorRange(null, msgs);
			case DomainPackage.DOMAIN__THE_UNZIP:
				return basicSetTheUnzip(null, msgs);
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
			case DomainPackage.DOMAIN__THE_MODEL_FACTORY:
				return eInternalContainer().eInverseRemove(this, PgrPackage.MODEL_FACTORY__THE_DOMAIN, ModelFactory.class, msgs);
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
			case DomainPackage.DOMAIN__THE_UI:
				return getTheUI();
			case DomainPackage.DOMAIN__THE_MODEL_FACTORY:
				return getTheModelFactory();
			case DomainPackage.DOMAIN__LIST_REPORT:
				return getListReport();
			case DomainPackage.DOMAIN__THE_VIEW_MODEL_GENERATOR:
				return getTheViewModelGenerator();
			case DomainPackage.DOMAIN__THE_DATAFORM_DIAGRAM_GENERATOR:
				return getTheDataformDiagramGenerator();
			case DomainPackage.DOMAIN__THE_DATAFORM_GENERATOR:
				return getTheDataformGenerator();
			case DomainPackage.DOMAIN__THE_EXCEL_GENERATOR:
				return getTheExcelGenerator();
			case DomainPackage.DOMAIN__THE_EXCEL_UPDATER:
				return getTheExcelUpdater();
			case DomainPackage.DOMAIN__THE_COORDINATE:
				return getTheCoordinate();
			case DomainPackage.DOMAIN__THE_MERGED_REGION:
				return getTheMergedRegion();
			case DomainPackage.DOMAIN__THE_COMPARATOR_RANGE:
				return getTheComparatorRange();
			case DomainPackage.DOMAIN__THE_UNZIP:
				return getTheUnzip();
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
			case DomainPackage.DOMAIN__THE_UI:
				getTheUI().clear();
				getTheUI().addAll((Collection<? extends UI>)newValue);
				return;
			case DomainPackage.DOMAIN__THE_MODEL_FACTORY:
				setTheModelFactory((ModelFactory)newValue);
				return;
			case DomainPackage.DOMAIN__LIST_REPORT:
				getListReport().clear();
				getListReport().addAll((Collection<? extends Report>)newValue);
				return;
			case DomainPackage.DOMAIN__THE_VIEW_MODEL_GENERATOR:
				setTheViewModelGenerator((ViewModelGenerator)newValue);
				return;
			case DomainPackage.DOMAIN__THE_DATAFORM_DIAGRAM_GENERATOR:
				setTheDataformDiagramGenerator((DataformDiagramGenerator)newValue);
				return;
			case DomainPackage.DOMAIN__THE_DATAFORM_GENERATOR:
				setTheDataformGenerator((DataformGenerator)newValue);
				return;
			case DomainPackage.DOMAIN__THE_EXCEL_GENERATOR:
				setTheExcelGenerator((ExcelGenerator)newValue);
				return;
			case DomainPackage.DOMAIN__THE_EXCEL_UPDATER:
				setTheExcelUpdater((ExcelUpdater)newValue);
				return;
			case DomainPackage.DOMAIN__THE_COORDINATE:
				setTheCoordinate((Comparable)newValue);
				return;
			case DomainPackage.DOMAIN__THE_MERGED_REGION:
				setTheMergedRegion((MergedRegion)newValue);
				return;
			case DomainPackage.DOMAIN__THE_COMPARATOR_RANGE:
				setTheComparatorRange((Comparator)newValue);
				return;
			case DomainPackage.DOMAIN__THE_UNZIP:
				setTheUnzip((Unzip)newValue);
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
			case DomainPackage.DOMAIN__THE_UI:
				getTheUI().clear();
				return;
			case DomainPackage.DOMAIN__THE_MODEL_FACTORY:
				setTheModelFactory((ModelFactory)null);
				return;
			case DomainPackage.DOMAIN__LIST_REPORT:
				getListReport().clear();
				return;
			case DomainPackage.DOMAIN__THE_VIEW_MODEL_GENERATOR:
				setTheViewModelGenerator((ViewModelGenerator)null);
				return;
			case DomainPackage.DOMAIN__THE_DATAFORM_DIAGRAM_GENERATOR:
				setTheDataformDiagramGenerator((DataformDiagramGenerator)null);
				return;
			case DomainPackage.DOMAIN__THE_DATAFORM_GENERATOR:
				setTheDataformGenerator((DataformGenerator)null);
				return;
			case DomainPackage.DOMAIN__THE_EXCEL_GENERATOR:
				setTheExcelGenerator((ExcelGenerator)null);
				return;
			case DomainPackage.DOMAIN__THE_EXCEL_UPDATER:
				setTheExcelUpdater((ExcelUpdater)null);
				return;
			case DomainPackage.DOMAIN__THE_COORDINATE:
				setTheCoordinate((Comparable)null);
				return;
			case DomainPackage.DOMAIN__THE_MERGED_REGION:
				setTheMergedRegion((MergedRegion)null);
				return;
			case DomainPackage.DOMAIN__THE_COMPARATOR_RANGE:
				setTheComparatorRange((Comparator)null);
				return;
			case DomainPackage.DOMAIN__THE_UNZIP:
				setTheUnzip((Unzip)null);
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
			case DomainPackage.DOMAIN__THE_UI:
				return theUI != null && !theUI.isEmpty();
			case DomainPackage.DOMAIN__THE_MODEL_FACTORY:
				return getTheModelFactory() != null;
			case DomainPackage.DOMAIN__LIST_REPORT:
				return listReport != null && !listReport.isEmpty();
			case DomainPackage.DOMAIN__THE_VIEW_MODEL_GENERATOR:
				return theViewModelGenerator != null;
			case DomainPackage.DOMAIN__THE_DATAFORM_DIAGRAM_GENERATOR:
				return theDataformDiagramGenerator != null;
			case DomainPackage.DOMAIN__THE_DATAFORM_GENERATOR:
				return theDataformGenerator != null;
			case DomainPackage.DOMAIN__THE_EXCEL_GENERATOR:
				return theExcelGenerator != null;
			case DomainPackage.DOMAIN__THE_EXCEL_UPDATER:
				return theExcelUpdater != null;
			case DomainPackage.DOMAIN__THE_COORDINATE:
				return theCoordinate != null;
			case DomainPackage.DOMAIN__THE_MERGED_REGION:
				return theMergedRegion != null;
			case DomainPackage.DOMAIN__THE_COMPARATOR_RANGE:
				return theComparatorRange != null;
			case DomainPackage.DOMAIN__THE_UNZIP:
				return theUnzip != null;
		}
		return super.eIsSet(featureID);
	}

} //DomainImpl
