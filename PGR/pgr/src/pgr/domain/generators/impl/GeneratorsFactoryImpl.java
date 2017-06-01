/**
 */
package pgr.domain.generators.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pgr.domain.generators.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneratorsFactoryImpl extends EFactoryImpl implements GeneratorsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GeneratorsFactory init() {
		try {
			GeneratorsFactory theGeneratorsFactory = (GeneratorsFactory)EPackage.Registry.INSTANCE.getEFactory(GeneratorsPackage.eNS_URI);
			if (theGeneratorsFactory != null) {
				return theGeneratorsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GeneratorsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorsFactoryImpl() {
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
			case GeneratorsPackage.VIEW_MODEL_GENERATOR: return createViewModelGenerator();
			case GeneratorsPackage.DATAFORM_DIAGRAM_GENERATOR: return createDataformDiagramGenerator();
			case GeneratorsPackage.DATAFORM_GENERATOR: return createDataformGenerator();
			case GeneratorsPackage.EXCEL_GENERATOR: return createExcelGenerator();
			case GeneratorsPackage.EXCEL_UPDATER: return createExcelUpdater();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewModelGenerator createViewModelGenerator() {
		ViewModelGeneratorImpl viewModelGenerator = new ViewModelGeneratorImpl();
		return viewModelGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataformDiagramGenerator createDataformDiagramGenerator() {
		DataformDiagramGeneratorImpl dataformDiagramGenerator = new DataformDiagramGeneratorImpl();
		return dataformDiagramGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataformGenerator createDataformGenerator() {
		DataformGeneratorImpl dataformGenerator = new DataformGeneratorImpl();
		return dataformGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExcelGenerator createExcelGenerator() {
		ExcelGeneratorImpl excelGenerator = new ExcelGeneratorImpl();
		return excelGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExcelUpdater createExcelUpdater() {
		ExcelUpdaterImpl excelUpdater = new ExcelUpdaterImpl();
		return excelUpdater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorsPackage getGeneratorsPackage() {
		return (GeneratorsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GeneratorsPackage getPackage() {
		return GeneratorsPackage.eINSTANCE;
	}

} //GeneratorsFactoryImpl
