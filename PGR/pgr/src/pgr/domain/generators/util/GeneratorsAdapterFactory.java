/**
 */
package pgr.domain.generators.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import pgr.domain.generators.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see pgr.domain.generators.GeneratorsPackage
 * @generated
 */
public class GeneratorsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GeneratorsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GeneratorsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorsSwitch<Adapter> modelSwitch =
		new GeneratorsSwitch<Adapter>() {
			@Override
			public Adapter caseViewModelGenerator(ViewModelGenerator object) {
				return createViewModelGeneratorAdapter();
			}
			@Override
			public Adapter caseDataformDiagramGenerator(DataformDiagramGenerator object) {
				return createDataformDiagramGeneratorAdapter();
			}
			@Override
			public Adapter caseDataformGenerator(DataformGenerator object) {
				return createDataformGeneratorAdapter();
			}
			@Override
			public Adapter caseExcelGenerator(ExcelGenerator object) {
				return createExcelGeneratorAdapter();
			}
			@Override
			public Adapter caseExcelUpdater(ExcelUpdater object) {
				return createExcelUpdaterAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link pgr.domain.generators.ViewModelGenerator <em>View Model Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pgr.domain.generators.ViewModelGenerator
	 * @generated
	 */
	public Adapter createViewModelGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pgr.domain.generators.DataformDiagramGenerator <em>Dataform Diagram Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pgr.domain.generators.DataformDiagramGenerator
	 * @generated
	 */
	public Adapter createDataformDiagramGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pgr.domain.generators.DataformGenerator <em>Dataform Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pgr.domain.generators.DataformGenerator
	 * @generated
	 */
	public Adapter createDataformGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pgr.domain.generators.ExcelGenerator <em>Excel Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pgr.domain.generators.ExcelGenerator
	 * @generated
	 */
	public Adapter createExcelGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pgr.domain.generators.ExcelUpdater <em>Excel Updater</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pgr.domain.generators.ExcelUpdater
	 * @generated
	 */
	public Adapter createExcelUpdaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GeneratorsAdapterFactory
