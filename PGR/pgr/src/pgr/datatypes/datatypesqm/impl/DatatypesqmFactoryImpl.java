/**
 */
package pgr.datatypes.datatypesqm.impl;

import gestionconsultassqlmodels.generate.conexionBD.DataConnection;

import gestionmodelosconsultas.ModelFactory;

import gestionmodelosconsultas.modeloconsultas.model.EADiagram;
import gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta;
import gestionmodelosconsultas.modeloconsultas.model.Proyeccion;

import gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado;
import gestionmodelosconsultas.modeloconsultas.resultset.ResultElement;
import gestionmodelosconsultas.modeloconsultas.resultset.Resultado;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pgr.datatypes.datatypesqm.*;

import tooldataform.formmodel.concreta.TableView;

import whoownme.model.ModelFactoryModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatatypesqmFactoryImpl extends EFactoryImpl implements DatatypesqmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatatypesqmFactory init() {
		try {
			DatatypesqmFactory theDatatypesqmFactory = (DatatypesqmFactory)EPackage.Registry.INSTANCE.getEFactory(DatatypesqmPackage.eNS_URI);
			if (theDatatypesqmFactory != null) {
				return theDatatypesqmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DatatypesqmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypesqmFactoryImpl() {
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
			case DatatypesqmPackage.MODEL_FACTORY:
				return createModelFactoryFromString(eDataType, initialValue);
			case DatatypesqmPackage.ELEMENTO_CONSULTA:
				return createElementoConsultaFromString(eDataType, initialValue);
			case DatatypesqmPackage.RESULT_ELEMENT:
				return createResultElementFromString(eDataType, initialValue);
			case DatatypesqmPackage.ELEMENTO_MODELO_RESULTADO:
				return createElementoModeloResultadoFromString(eDataType, initialValue);
			case DatatypesqmPackage.RESULTADO:
				return createResultadoFromString(eDataType, initialValue);
			case DatatypesqmPackage.TABLE_VIEW:
				return createTableViewFromString(eDataType, initialValue);
			case DatatypesqmPackage.DATA_CONNECTION:
				return createDataConnectionFromString(eDataType, initialValue);
			case DatatypesqmPackage.WHOOWNMEMODEL_MODEL_FACTORY_MODEL:
				return createWhoownmemodelModelFactoryModelFromString(eDataType, initialValue);
			case DatatypesqmPackage.PROYECCION:
				return createProyeccionFromString(eDataType, initialValue);
			case DatatypesqmPackage.EA_DIAGRAM:
				return createEADiagramFromString(eDataType, initialValue);
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
			case DatatypesqmPackage.MODEL_FACTORY:
				return convertModelFactoryToString(eDataType, instanceValue);
			case DatatypesqmPackage.ELEMENTO_CONSULTA:
				return convertElementoConsultaToString(eDataType, instanceValue);
			case DatatypesqmPackage.RESULT_ELEMENT:
				return convertResultElementToString(eDataType, instanceValue);
			case DatatypesqmPackage.ELEMENTO_MODELO_RESULTADO:
				return convertElementoModeloResultadoToString(eDataType, instanceValue);
			case DatatypesqmPackage.RESULTADO:
				return convertResultadoToString(eDataType, instanceValue);
			case DatatypesqmPackage.TABLE_VIEW:
				return convertTableViewToString(eDataType, instanceValue);
			case DatatypesqmPackage.DATA_CONNECTION:
				return convertDataConnectionToString(eDataType, instanceValue);
			case DatatypesqmPackage.WHOOWNMEMODEL_MODEL_FACTORY_MODEL:
				return convertWhoownmemodelModelFactoryModelToString(eDataType, instanceValue);
			case DatatypesqmPackage.PROYECCION:
				return convertProyeccionToString(eDataType, instanceValue);
			case DatatypesqmPackage.EA_DIAGRAM:
				return convertEADiagramToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory createModelFactoryFromString(EDataType eDataType, String initialValue) {
		return (ModelFactory)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModelFactoryToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementoConsulta createElementoConsultaFromString(EDataType eDataType, String initialValue) {
		return (ElementoConsulta)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertElementoConsultaToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultElement createResultElementFromString(EDataType eDataType, String initialValue) {
		return (ResultElement)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResultElementToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementoModeloResultado createElementoModeloResultadoFromString(EDataType eDataType, String initialValue) {
		return (ElementoModeloResultado)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertElementoModeloResultadoToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resultado createResultadoFromString(EDataType eDataType, String initialValue) {
		return (Resultado)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResultadoToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableView createTableViewFromString(EDataType eDataType, String initialValue) {
		return (TableView)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTableViewToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataConnection createDataConnectionFromString(EDataType eDataType, String initialValue) {
		return (DataConnection)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataConnectionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryModel createWhoownmemodelModelFactoryModelFromString(EDataType eDataType, String initialValue) {
		return (ModelFactoryModel)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWhoownmemodelModelFactoryModelToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Proyeccion createProyeccionFromString(EDataType eDataType, String initialValue) {
		return (Proyeccion)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProyeccionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EADiagram createEADiagramFromString(EDataType eDataType, String initialValue) {
		return (EADiagram)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEADiagramToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypesqmPackage getDatatypesqmPackage() {
		return (DatatypesqmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DatatypesqmPackage getPackage() {
		return DatatypesqmPackage.eINSTANCE;
	}

} //DatatypesqmFactoryImpl
