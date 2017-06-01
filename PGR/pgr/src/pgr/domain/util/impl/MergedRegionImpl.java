/**
 */
package pgr.domain.util.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import pgr.domain.Domain;
import pgr.domain.DomainPackage;

import pgr.domain.util.MergedRegion;
import pgr.domain.util.UtilPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Merged Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pgr.domain.util.impl.MergedRegionImpl#getText <em>Text</em>}</li>
 *   <li>{@link pgr.domain.util.impl.MergedRegionImpl#getFirstColumn <em>First Column</em>}</li>
 *   <li>{@link pgr.domain.util.impl.MergedRegionImpl#getLastColumn <em>Last Column</em>}</li>
 *   <li>{@link pgr.domain.util.impl.MergedRegionImpl#getFirstRow <em>First Row</em>}</li>
 *   <li>{@link pgr.domain.util.impl.MergedRegionImpl#getLastRow <em>Last Row</em>}</li>
 *   <li>{@link pgr.domain.util.impl.MergedRegionImpl#getTheDomain <em>The Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MergedRegionImpl extends MinimalEObjectImpl.Container implements MergedRegion {
	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstColumn() <em>First Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstColumn()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FIRST_COLUMN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstColumn() <em>First Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstColumn()
	 * @generated
	 * @ordered
	 */
	protected Integer firstColumn = FIRST_COLUMN_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastColumn() <em>Last Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastColumn()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LAST_COLUMN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastColumn() <em>Last Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastColumn()
	 * @generated
	 * @ordered
	 */
	protected Integer lastColumn = LAST_COLUMN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstRow() <em>First Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstRow()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FIRST_ROW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstRow() <em>First Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstRow()
	 * @generated
	 * @ordered
	 */
	protected Integer firstRow = FIRST_ROW_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastRow() <em>Last Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastRow()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LAST_ROW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastRow() <em>Last Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastRow()
	 * @generated
	 * @ordered
	 */
	protected Integer lastRow = LAST_ROW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MergedRegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UtilPackage.Literals.MERGED_REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilPackage.MERGED_REGION__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getFirstColumn() {
		return firstColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstColumn(Integer newFirstColumn) {
		Integer oldFirstColumn = firstColumn;
		firstColumn = newFirstColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilPackage.MERGED_REGION__FIRST_COLUMN, oldFirstColumn, firstColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getLastColumn() {
		return lastColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastColumn(Integer newLastColumn) {
		Integer oldLastColumn = lastColumn;
		lastColumn = newLastColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilPackage.MERGED_REGION__LAST_COLUMN, oldLastColumn, lastColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getFirstRow() {
		return firstRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstRow(Integer newFirstRow) {
		Integer oldFirstRow = firstRow;
		firstRow = newFirstRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilPackage.MERGED_REGION__FIRST_ROW, oldFirstRow, firstRow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getLastRow() {
		return lastRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastRow(Integer newLastRow) {
		Integer oldLastRow = lastRow;
		lastRow = newLastRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilPackage.MERGED_REGION__LAST_ROW, oldLastRow, lastRow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getTheDomain() {
		if (eContainerFeatureID() != UtilPackage.MERGED_REGION__THE_DOMAIN) return null;
		return (Domain)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheDomain(Domain newTheDomain, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTheDomain, UtilPackage.MERGED_REGION__THE_DOMAIN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheDomain(Domain newTheDomain) {
		if (newTheDomain != eInternalContainer() || (eContainerFeatureID() != UtilPackage.MERGED_REGION__THE_DOMAIN && newTheDomain != null)) {
			if (EcoreUtil.isAncestor(this, newTheDomain))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTheDomain != null)
				msgs = ((InternalEObject)newTheDomain).eInverseAdd(this, DomainPackage.DOMAIN__THE_MERGED_REGION, Domain.class, msgs);
			msgs = basicSetTheDomain(newTheDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UtilPackage.MERGED_REGION__THE_DOMAIN, newTheDomain, newTheDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void MergedRegion(final String text, final Integer firstColumn, final Integer lastColumn, final Integer firstRow, final Integer lastRow) {
				this.text = text;
				this.firstColumn = firstColumn;
				this.lastColumn = lastColumn;
				this.firstRow = firstRow;
				this.lastRow = lastRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UtilPackage.MERGED_REGION__THE_DOMAIN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTheDomain((Domain)otherEnd, msgs);
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
			case UtilPackage.MERGED_REGION__THE_DOMAIN:
				return basicSetTheDomain(null, msgs);
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
			case UtilPackage.MERGED_REGION__THE_DOMAIN:
				return eInternalContainer().eInverseRemove(this, DomainPackage.DOMAIN__THE_MERGED_REGION, Domain.class, msgs);
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
			case UtilPackage.MERGED_REGION__TEXT:
				return getText();
			case UtilPackage.MERGED_REGION__FIRST_COLUMN:
				return getFirstColumn();
			case UtilPackage.MERGED_REGION__LAST_COLUMN:
				return getLastColumn();
			case UtilPackage.MERGED_REGION__FIRST_ROW:
				return getFirstRow();
			case UtilPackage.MERGED_REGION__LAST_ROW:
				return getLastRow();
			case UtilPackage.MERGED_REGION__THE_DOMAIN:
				return getTheDomain();
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
			case UtilPackage.MERGED_REGION__TEXT:
				setText((String)newValue);
				return;
			case UtilPackage.MERGED_REGION__FIRST_COLUMN:
				setFirstColumn((Integer)newValue);
				return;
			case UtilPackage.MERGED_REGION__LAST_COLUMN:
				setLastColumn((Integer)newValue);
				return;
			case UtilPackage.MERGED_REGION__FIRST_ROW:
				setFirstRow((Integer)newValue);
				return;
			case UtilPackage.MERGED_REGION__LAST_ROW:
				setLastRow((Integer)newValue);
				return;
			case UtilPackage.MERGED_REGION__THE_DOMAIN:
				setTheDomain((Domain)newValue);
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
			case UtilPackage.MERGED_REGION__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case UtilPackage.MERGED_REGION__FIRST_COLUMN:
				setFirstColumn(FIRST_COLUMN_EDEFAULT);
				return;
			case UtilPackage.MERGED_REGION__LAST_COLUMN:
				setLastColumn(LAST_COLUMN_EDEFAULT);
				return;
			case UtilPackage.MERGED_REGION__FIRST_ROW:
				setFirstRow(FIRST_ROW_EDEFAULT);
				return;
			case UtilPackage.MERGED_REGION__LAST_ROW:
				setLastRow(LAST_ROW_EDEFAULT);
				return;
			case UtilPackage.MERGED_REGION__THE_DOMAIN:
				setTheDomain((Domain)null);
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
			case UtilPackage.MERGED_REGION__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case UtilPackage.MERGED_REGION__FIRST_COLUMN:
				return FIRST_COLUMN_EDEFAULT == null ? firstColumn != null : !FIRST_COLUMN_EDEFAULT.equals(firstColumn);
			case UtilPackage.MERGED_REGION__LAST_COLUMN:
				return LAST_COLUMN_EDEFAULT == null ? lastColumn != null : !LAST_COLUMN_EDEFAULT.equals(lastColumn);
			case UtilPackage.MERGED_REGION__FIRST_ROW:
				return FIRST_ROW_EDEFAULT == null ? firstRow != null : !FIRST_ROW_EDEFAULT.equals(firstRow);
			case UtilPackage.MERGED_REGION__LAST_ROW:
				return LAST_ROW_EDEFAULT == null ? lastRow != null : !LAST_ROW_EDEFAULT.equals(lastRow);
			case UtilPackage.MERGED_REGION__THE_DOMAIN:
				return getTheDomain() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case UtilPackage.MERGED_REGION___MERGED_REGION__STRING_INTEGER_INTEGER_INTEGER_INTEGER:
				MergedRegion((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (text: ");
		result.append(text);
		result.append(", firstColumn: ");
		result.append(firstColumn);
		result.append(", lastColumn: ");
		result.append(lastColumn);
		result.append(", firstRow: ");
		result.append(firstRow);
		result.append(", lastRow: ");
		result.append(lastRow);
		result.append(')');
		return result.toString();
	}

} //MergedRegionImpl
