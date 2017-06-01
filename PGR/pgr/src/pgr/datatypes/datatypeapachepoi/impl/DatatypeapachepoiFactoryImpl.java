/**
 */
package pgr.datatypes.datatypeapachepoi.impl;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pgr.datatypes.datatypeapachepoi.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatatypeapachepoiFactoryImpl extends EFactoryImpl implements DatatypeapachepoiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatatypeapachepoiFactory init() {
		try {
			DatatypeapachepoiFactory theDatatypeapachepoiFactory = (DatatypeapachepoiFactory)EPackage.Registry.INSTANCE.getEFactory(DatatypeapachepoiPackage.eNS_URI);
			if (theDatatypeapachepoiFactory != null) {
				return theDatatypeapachepoiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DatatypeapachepoiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeapachepoiFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DatatypeapachepoiPackage.XSSF_WORKBOOK:
				return createXSSFWorkbookFromString(eDataType, initialValue);
			case DatatypeapachepoiPackage.XSSF_SHEET:
				return createXSSFSheetFromString(eDataType, initialValue);
			case DatatypeapachepoiPackage.XSSF_CELL:
				return createXSSFCellFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DatatypeapachepoiPackage.XSSF_WORKBOOK:
				return convertXSSFWorkbookToString(eDataType, instanceValue);
			case DatatypeapachepoiPackage.XSSF_SHEET:
				return convertXSSFSheetToString(eDataType, instanceValue);
			case DatatypeapachepoiPackage.XSSF_CELL:
				return convertXSSFCellToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSSFWorkbook createXSSFWorkbookFromString(EDataType eDataType, String initialValue) {
		return (XSSFWorkbook)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXSSFWorkbookToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSSFSheet createXSSFSheetFromString(EDataType eDataType, String initialValue) {
		return (XSSFSheet)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXSSFSheetToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSSFCell createXSSFCellFromString(EDataType eDataType, String initialValue) {
		return (XSSFCell)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXSSFCellToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeapachepoiPackage getDatatypeapachepoiPackage() {
		return (DatatypeapachepoiPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DatatypeapachepoiPackage getPackage() {
		return DatatypeapachepoiPackage.eINSTANCE;
	}

} //DatatypeapachepoiFactoryImpl
