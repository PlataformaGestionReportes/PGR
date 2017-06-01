/**
 */
package pgr.domain.generators.impl;

import gestionconsultassqlmodels.generate.conexionBD.DataConnection;

import java.lang.reflect.InvocationTargetException;

import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

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

import pgr.domain.generators.ExcelUpdater;
import pgr.domain.generators.GeneratorsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Excel Updater</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pgr.domain.generators.impl.ExcelUpdaterImpl#getFilePath <em>File Path</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.ExcelUpdaterImpl#getStringQuery <em>String Query</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.ExcelUpdaterImpl#getWorkbook <em>Workbook</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.ExcelUpdaterImpl#getDc <em>Dc</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.ExcelUpdaterImpl#getPosFilter <em>Pos Filter</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.ExcelUpdaterImpl#getListFilter <em>List Filter</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.ExcelUpdaterImpl#getDomain <em>Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExcelUpdaterImpl extends MinimalEObjectImpl.Container implements ExcelUpdater {
	/**
	 * The default value of the '{@link #getFilePath() <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilePath()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilePath() <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilePath()
	 * @generated
	 * @ordered
	 */
	protected String filePath = FILE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getStringQuery() <em>String Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringQuery()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_QUERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStringQuery() <em>String Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringQuery()
	 * @generated
	 * @ordered
	 */
	protected String stringQuery = STRING_QUERY_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorkbook() <em>Workbook</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkbook()
	 * @generated
	 * @ordered
	 */
	protected static final XSSFWorkbook WORKBOOK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkbook() <em>Workbook</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkbook()
	 * @generated
	 * @ordered
	 */
	protected XSSFWorkbook workbook = WORKBOOK_EDEFAULT;

	/**
	 * The default value of the '{@link #getDc() <em>Dc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDc()
	 * @generated
	 * @ordered
	 */
	protected static final DataConnection DC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDc() <em>Dc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDc()
	 * @generated
	 * @ordered
	 */
	protected DataConnection dc = DC_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosFilter() <em>Pos Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosFilter()
	 * @generated
	 * @ordered
	 */
	protected static final ArrayList POS_FILTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPosFilter() <em>Pos Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosFilter()
	 * @generated
	 * @ordered
	 */
	protected ArrayList posFilter = POS_FILTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getListFilter() <em>List Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListFilter()
	 * @generated
	 * @ordered
	 */
	protected static final ArrayList LIST_FILTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getListFilter() <em>List Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListFilter()
	 * @generated
	 * @ordered
	 */
	protected ArrayList listFilter = LIST_FILTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExcelUpdaterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorsPackage.Literals.EXCEL_UPDATER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilePath(String newFilePath) {
		String oldFilePath = filePath;
		filePath = newFilePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.EXCEL_UPDATER__FILE_PATH, oldFilePath, filePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStringQuery() {
		return stringQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringQuery(String newStringQuery) {
		String oldStringQuery = stringQuery;
		stringQuery = newStringQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.EXCEL_UPDATER__STRING_QUERY, oldStringQuery, stringQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSSFWorkbook getWorkbook() {
		return workbook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkbook(XSSFWorkbook newWorkbook) {
		XSSFWorkbook oldWorkbook = workbook;
		workbook = newWorkbook;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.EXCEL_UPDATER__WORKBOOK, oldWorkbook, workbook));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataConnection getDc() {
		return dc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDc(DataConnection newDc) {
		DataConnection oldDc = dc;
		dc = newDc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.EXCEL_UPDATER__DC, oldDc, dc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList getPosFilter() {
		return posFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosFilter(ArrayList newPosFilter) {
		ArrayList oldPosFilter = posFilter;
		posFilter = newPosFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.EXCEL_UPDATER__POS_FILTER, oldPosFilter, posFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayList getListFilter() {
		return listFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListFilter(ArrayList newListFilter) {
		ArrayList oldListFilter = listFilter;
		listFilter = newListFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.EXCEL_UPDATER__LIST_FILTER, oldListFilter, listFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getDomain() {
		if (eContainerFeatureID() != GeneratorsPackage.EXCEL_UPDATER__DOMAIN) return null;
		return (Domain)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomain(Domain newDomain, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDomain, GeneratorsPackage.EXCEL_UPDATER__DOMAIN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(Domain newDomain) {
		if (newDomain != eInternalContainer() || (eContainerFeatureID() != GeneratorsPackage.EXCEL_UPDATER__DOMAIN && newDomain != null)) {
			if (EcoreUtil.isAncestor(this, newDomain))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDomain != null)
				msgs = ((InternalEObject)newDomain).eInverseAdd(this, DomainPackage.DOMAIN__THE_EXCEL_UPDATER, Domain.class, msgs);
			msgs = basicSetDomain(newDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.EXCEL_UPDATER__DOMAIN, newDomain, newDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void ExcelUpdater(final String filePath) {
		
		
				
				this.filePath = filePath;
				try {
					dc = DataConnection.getInstance();
					workbook = readFile();
				} catch (java.lang.ClassNotFoundException | java.sql.SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSSFWorkbook readFile() {
		
		
				// Se lee el archivo
				try{
					java.io.FileInputStream file = new java.io.FileInputStream(new java.io.File(filePath));
					XSSFWorkbook workbook = new XSSFWorkbook(file);
					return workbook;
				}catch (java.io.FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (java.io.IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return null;
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void saveExcel() {
		
		
				
				// Se escribe el archivo con las modificaciones
				try{
					java.io.FileOutputStream fileOutputStream;
					fileOutputStream = new java.io.FileOutputStream(filePath);
					workbook.write(fileOutputStream);
					fileOutputStream.close();
				}catch (java.io.FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (java.io.IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void executeQuery() {
		
		
					
						try{
							com.mysql.jdbc.Connection connection = dc.getConnection();
							com.mysql.jdbc.PreparedStatement ps = (com.mysql.jdbc.PreparedStatement)connection.prepareStatement(stringQuery);
							java.sql.ResultSet rs = ps.executeQuery();
							
							pgr.domain.generators.ExcelGenerator excelGenerator = pgr.domain.generators.GeneratorsFactory.eINSTANCE.createExcelGenerator();
							excelGenerator.ExcelGenerator(filePath,listFilter,posFilter);
							excelGenerator.createDataSheet(rs);
							if(excelGenerator.getNamesFilters().size() != 0)
								excelGenerator.createRelations();
						}catch (java.sql.SQLException e){
							e.printStackTrace();
						}
					
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void readSheetQuery() {
		
		
				
				// Se obtienen las sheet necesarias para el proceso
				org.apache.poi.xssf.usermodel.XSSFSheet sheet = workbook.getSheet("Query");
				if (sheet != null) {
					org.apache.poi.xssf.usermodel.XSSFRow row = sheet.getRow(0);
					org.apache.poi.xssf.usermodel.XSSFCell cell = row.getCell(0);
					stringQuery = cell.getStringCellValue();
				}
				
				posFilter = new ArrayList< pgr.domain.util.impl.CoordinateImpl>();
				listFilter = new ArrayList<String>();
				
				org.apache.poi.xssf.usermodel.XSSFCell c;
				org.apache.poi.xssf.usermodel.XSSFRow r;
				String x,y,name;
				for(int i=1;i<sheet.getLastRowNum();i++){
					r  = sheet.getRow(i);
					
					c = r.getCell(0);
					x = c.getStringCellValue();
					
					c = r.getCell(1);
					y = c.getStringCellValue();
					
					c = r.getCell(2);
					name = c.getStringCellValue();
					
					posFilter.add( createCoordinate(Integer.parseInt(x), Integer.parseInt(y)));
					listFilter.add(name);
				}
				r = sheet.getRow(sheet.getLastRowNum());
				
				c = r.getCell(0);
				x = c.getStringCellValue();
				
				c = r.getCell(1);
				y = c.getStringCellValue();
				posFilter.add( createCoordinate(Integer.parseInt(x), Integer.parseInt(y)));
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comparable createCoordinate(final int x, final int y) {
		
		
				pgr.domain.util.impl.CoordinateImpl c = (pgr.domain.util.impl.CoordinateImpl)
								 pgr.domain.util.UtilFactory.eINSTANCE.createCoordinate();
						 c.setX(x); c.setY(y);
						return c;
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void refresh() {
		
		
				readSheetQuery();
				executeQuery();
			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeneratorsPackage.EXCEL_UPDATER__DOMAIN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDomain((Domain)otherEnd, msgs);
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
			case GeneratorsPackage.EXCEL_UPDATER__DOMAIN:
				return basicSetDomain(null, msgs);
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
			case GeneratorsPackage.EXCEL_UPDATER__DOMAIN:
				return eInternalContainer().eInverseRemove(this, DomainPackage.DOMAIN__THE_EXCEL_UPDATER, Domain.class, msgs);
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
			case GeneratorsPackage.EXCEL_UPDATER__FILE_PATH:
				return getFilePath();
			case GeneratorsPackage.EXCEL_UPDATER__STRING_QUERY:
				return getStringQuery();
			case GeneratorsPackage.EXCEL_UPDATER__WORKBOOK:
				return getWorkbook();
			case GeneratorsPackage.EXCEL_UPDATER__DC:
				return getDc();
			case GeneratorsPackage.EXCEL_UPDATER__POS_FILTER:
				return getPosFilter();
			case GeneratorsPackage.EXCEL_UPDATER__LIST_FILTER:
				return getListFilter();
			case GeneratorsPackage.EXCEL_UPDATER__DOMAIN:
				return getDomain();
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
			case GeneratorsPackage.EXCEL_UPDATER__FILE_PATH:
				setFilePath((String)newValue);
				return;
			case GeneratorsPackage.EXCEL_UPDATER__STRING_QUERY:
				setStringQuery((String)newValue);
				return;
			case GeneratorsPackage.EXCEL_UPDATER__WORKBOOK:
				setWorkbook((XSSFWorkbook)newValue);
				return;
			case GeneratorsPackage.EXCEL_UPDATER__DC:
				setDc((DataConnection)newValue);
				return;
			case GeneratorsPackage.EXCEL_UPDATER__POS_FILTER:
				setPosFilter((ArrayList)newValue);
				return;
			case GeneratorsPackage.EXCEL_UPDATER__LIST_FILTER:
				setListFilter((ArrayList)newValue);
				return;
			case GeneratorsPackage.EXCEL_UPDATER__DOMAIN:
				setDomain((Domain)newValue);
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
			case GeneratorsPackage.EXCEL_UPDATER__FILE_PATH:
				setFilePath(FILE_PATH_EDEFAULT);
				return;
			case GeneratorsPackage.EXCEL_UPDATER__STRING_QUERY:
				setStringQuery(STRING_QUERY_EDEFAULT);
				return;
			case GeneratorsPackage.EXCEL_UPDATER__WORKBOOK:
				setWorkbook(WORKBOOK_EDEFAULT);
				return;
			case GeneratorsPackage.EXCEL_UPDATER__DC:
				setDc(DC_EDEFAULT);
				return;
			case GeneratorsPackage.EXCEL_UPDATER__POS_FILTER:
				setPosFilter(POS_FILTER_EDEFAULT);
				return;
			case GeneratorsPackage.EXCEL_UPDATER__LIST_FILTER:
				setListFilter(LIST_FILTER_EDEFAULT);
				return;
			case GeneratorsPackage.EXCEL_UPDATER__DOMAIN:
				setDomain((Domain)null);
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
			case GeneratorsPackage.EXCEL_UPDATER__FILE_PATH:
				return FILE_PATH_EDEFAULT == null ? filePath != null : !FILE_PATH_EDEFAULT.equals(filePath);
			case GeneratorsPackage.EXCEL_UPDATER__STRING_QUERY:
				return STRING_QUERY_EDEFAULT == null ? stringQuery != null : !STRING_QUERY_EDEFAULT.equals(stringQuery);
			case GeneratorsPackage.EXCEL_UPDATER__WORKBOOK:
				return WORKBOOK_EDEFAULT == null ? workbook != null : !WORKBOOK_EDEFAULT.equals(workbook);
			case GeneratorsPackage.EXCEL_UPDATER__DC:
				return DC_EDEFAULT == null ? dc != null : !DC_EDEFAULT.equals(dc);
			case GeneratorsPackage.EXCEL_UPDATER__POS_FILTER:
				return POS_FILTER_EDEFAULT == null ? posFilter != null : !POS_FILTER_EDEFAULT.equals(posFilter);
			case GeneratorsPackage.EXCEL_UPDATER__LIST_FILTER:
				return LIST_FILTER_EDEFAULT == null ? listFilter != null : !LIST_FILTER_EDEFAULT.equals(listFilter);
			case GeneratorsPackage.EXCEL_UPDATER__DOMAIN:
				return getDomain() != null;
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
			case GeneratorsPackage.EXCEL_UPDATER___EXCEL_UPDATER__STRING:
				ExcelUpdater((String)arguments.get(0));
				return null;
			case GeneratorsPackage.EXCEL_UPDATER___READ_FILE:
				return readFile();
			case GeneratorsPackage.EXCEL_UPDATER___SAVE_EXCEL:
				saveExcel();
				return null;
			case GeneratorsPackage.EXCEL_UPDATER___EXECUTE_QUERY:
				executeQuery();
				return null;
			case GeneratorsPackage.EXCEL_UPDATER___READ_SHEET_QUERY:
				readSheetQuery();
				return null;
			case GeneratorsPackage.EXCEL_UPDATER___CREATE_COORDINATE__INT_INT:
				return createCoordinate((Integer)arguments.get(0), (Integer)arguments.get(1));
			case GeneratorsPackage.EXCEL_UPDATER___REFRESH:
				refresh();
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
		result.append(" (filePath: ");
		result.append(filePath);
		result.append(", stringQuery: ");
		result.append(stringQuery);
		result.append(", workbook: ");
		result.append(workbook);
		result.append(", dc: ");
		result.append(dc);
		result.append(", posFilter: ");
		result.append(posFilter);
		result.append(", listFilter: ");
		result.append(listFilter);
		result.append(')');
		return result.toString();
	}

} //ExcelUpdaterImpl
