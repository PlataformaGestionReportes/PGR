/**
 */
package pgr.domain.generators;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pgr.domain.generators.GeneratorsPackage
 * @generated
 */
public interface GeneratorsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeneratorsFactory eINSTANCE = pgr.domain.generators.impl.GeneratorsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>View Model Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Model Generator</em>'.
	 * @generated
	 */
	ViewModelGenerator createViewModelGenerator();

	/**
	 * Returns a new object of class '<em>Dataform Diagram Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dataform Diagram Generator</em>'.
	 * @generated
	 */
	DataformDiagramGenerator createDataformDiagramGenerator();

	/**
	 * Returns a new object of class '<em>Dataform Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dataform Generator</em>'.
	 * @generated
	 */
	DataformGenerator createDataformGenerator();

	/**
	 * Returns a new object of class '<em>Excel Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Excel Generator</em>'.
	 * @generated
	 */
	ExcelGenerator createExcelGenerator();

	/**
	 * Returns a new object of class '<em>Excel Updater</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Excel Updater</em>'.
	 * @generated
	 */
	ExcelUpdater createExcelUpdater();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GeneratorsPackage getGeneratorsPackage();

} //GeneratorsFactory
