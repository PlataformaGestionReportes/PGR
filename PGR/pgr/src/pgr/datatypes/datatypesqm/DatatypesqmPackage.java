/**
 */
package pgr.datatypes.datatypesqm;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pgr.datatypes.datatypesqm.DatatypesqmFactory
 * @model kind="package"
 * @generated
 */
public interface DatatypesqmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "datatypesqm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///pgr/datatypes/datatypesqm.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pgr.datatypes.datatypesqm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatatypesqmPackage eINSTANCE = pgr.datatypes.datatypesqm.impl.DatatypesqmPackageImpl.init();

	/**
	 * The meta object id for the '<em>Model Factory</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.ModelFactory
	 * @see pgr.datatypes.datatypesqm.impl.DatatypesqmPackageImpl#getModelFactory()
	 * @generated
	 */
	int MODEL_FACTORY = 0;

	/**
	 * The meta object id for the '<em>Elemento Consulta</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta
	 * @see pgr.datatypes.datatypesqm.impl.DatatypesqmPackageImpl#getElementoConsulta()
	 * @generated
	 */
	int ELEMENTO_CONSULTA = 1;

	/**
	 * The meta object id for the '<em>Result Element</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.ResultElement
	 * @see pgr.datatypes.datatypesqm.impl.DatatypesqmPackageImpl#getResultElement()
	 * @generated
	 */
	int RESULT_ELEMENT = 2;

	/**
	 * The meta object id for the '<em>Elemento Modelo Resultado</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado
	 * @see pgr.datatypes.datatypesqm.impl.DatatypesqmPackageImpl#getElementoModeloResultado()
	 * @generated
	 */
	int ELEMENTO_MODELO_RESULTADO = 3;

	/**
	 * The meta object id for the '<em>Resultado</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.Resultado
	 * @see pgr.datatypes.datatypesqm.impl.DatatypesqmPackageImpl#getResultado()
	 * @generated
	 */
	int RESULTADO = 4;

	/**
	 * The meta object id for the '<em>Table View</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tooldataform.formmodel.concreta.TableView
	 * @see pgr.datatypes.datatypesqm.impl.DatatypesqmPackageImpl#getTableView()
	 * @generated
	 */
	int TABLE_VIEW = 5;

	/**
	 * The meta object id for the '<em>Data Connection</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionconsultassqlmodels.generate.conexionBD.DataConnection
	 * @see pgr.datatypes.datatypesqm.impl.DatatypesqmPackageImpl#getDataConnection()
	 * @generated
	 */
	int DATA_CONNECTION = 6;

	/**
	 * The meta object id for the '<em>Whoownmemodel Model Factory Model</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see whoownme.model.ModelFactoryModel
	 * @see pgr.datatypes.datatypesqm.impl.DatatypesqmPackageImpl#getWhoownmemodelModelFactoryModel()
	 * @generated
	 */
	int WHOOWNMEMODEL_MODEL_FACTORY_MODEL = 7;

	/**
	 * The meta object id for the '<em>Proyeccion</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.model.Proyeccion
	 * @see pgr.datatypes.datatypesqm.impl.DatatypesqmPackageImpl#getProyeccion()
	 * @generated
	 */
	int PROYECCION = 8;

	/**
	 * The meta object id for the '<em>EA Diagram</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gestionmodelosconsultas.modeloconsultas.model.EADiagram
	 * @see pgr.datatypes.datatypesqm.impl.DatatypesqmPackageImpl#getEADiagram()
	 * @generated
	 */
	int EA_DIAGRAM = 9;


	/**
	 * Returns the meta object for data type '{@link gestionmodelosconsultas.ModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Model Factory</em>'.
	 * @see gestionmodelosconsultas.ModelFactory
	 * @model instanceClass="gestionmodelosconsultas.ModelFactory"
	 * @generated
	 */
	EDataType getModelFactory();

	/**
	 * Returns the meta object for data type '{@link gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta <em>Elemento Consulta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Elemento Consulta</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta
	 * @model instanceClass="gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta"
	 * @generated
	 */
	EDataType getElementoConsulta();

	/**
	 * Returns the meta object for data type '{@link gestionmodelosconsultas.modeloconsultas.resultset.ResultElement <em>Result Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Result Element</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.ResultElement
	 * @model instanceClass="gestionmodelosconsultas.modeloconsultas.resultset.ResultElement"
	 * @generated
	 */
	EDataType getResultElement();

	/**
	 * Returns the meta object for data type '{@link gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado <em>Elemento Modelo Resultado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Elemento Modelo Resultado</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado
	 * @model instanceClass="gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado"
	 * @generated
	 */
	EDataType getElementoModeloResultado();

	/**
	 * Returns the meta object for data type '{@link gestionmodelosconsultas.modeloconsultas.resultset.Resultado <em>Resultado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Resultado</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.resultset.Resultado
	 * @model instanceClass="gestionmodelosconsultas.modeloconsultas.resultset.Resultado"
	 * @generated
	 */
	EDataType getResultado();

	/**
	 * Returns the meta object for data type '{@link tooldataform.formmodel.concreta.TableView <em>Table View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Table View</em>'.
	 * @see tooldataform.formmodel.concreta.TableView
	 * @model instanceClass="tooldataform.formmodel.concreta.TableView"
	 * @generated
	 */
	EDataType getTableView();

	/**
	 * Returns the meta object for data type '{@link gestionconsultassqlmodels.generate.conexionBD.DataConnection <em>Data Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Data Connection</em>'.
	 * @see gestionconsultassqlmodels.generate.conexionBD.DataConnection
	 * @model instanceClass="gestionconsultassqlmodels.generate.conexionBD.DataConnection"
	 * @generated
	 */
	EDataType getDataConnection();

	/**
	 * Returns the meta object for data type '{@link whoownme.model.ModelFactoryModel <em>Whoownmemodel Model Factory Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Whoownmemodel Model Factory Model</em>'.
	 * @see whoownme.model.ModelFactoryModel
	 * @model instanceClass="whoownme.model.ModelFactoryModel"
	 * @generated
	 */
	EDataType getWhoownmemodelModelFactoryModel();

	/**
	 * Returns the meta object for data type '{@link gestionmodelosconsultas.modeloconsultas.model.Proyeccion <em>Proyeccion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Proyeccion</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.model.Proyeccion
	 * @model instanceClass="gestionmodelosconsultas.modeloconsultas.model.Proyeccion"
	 * @generated
	 */
	EDataType getProyeccion();

	/**
	 * Returns the meta object for data type '{@link gestionmodelosconsultas.modeloconsultas.model.EADiagram <em>EA Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EA Diagram</em>'.
	 * @see gestionmodelosconsultas.modeloconsultas.model.EADiagram
	 * @model instanceClass="gestionmodelosconsultas.modeloconsultas.model.EADiagram"
	 * @generated
	 */
	EDataType getEADiagram();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatatypesqmFactory getDatatypesqmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '<em>Model Factory</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.ModelFactory
		 * @see pgr.datatypes.datatypesqm.impl.DatatypesqmPackageImpl#getModelFactory()
		 * @generated
		 */
		EDataType MODEL_FACTORY = eINSTANCE.getModelFactory();

		/**
		 * The meta object literal for the '<em>Elemento Consulta</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta
		 * @see pgr.datatypes.datatypesqm.impl.DatatypesqmPackageImpl#getElementoConsulta()
		 * @generated
		 */
		EDataType ELEMENTO_CONSULTA = eINSTANCE.getElementoConsulta();

		/**
		 * The meta object literal for the '<em>Result Element</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.resultset.ResultElement
		 * @see pgr.datatypes.datatypesqm.impl.DatatypesqmPackageImpl#getResultElement()
		 * @generated
		 */
		EDataType RESULT_ELEMENT = eINSTANCE.getResultElement();

		/**
		 * The meta object literal for the '<em>Elemento Modelo Resultado</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.resultset.ElementoModeloResultado
		 * @see pgr.datatypes.datatypesqm.impl.DatatypesqmPackageImpl#getElementoModeloResultado()
		 * @generated
		 */
		EDataType ELEMENTO_MODELO_RESULTADO = eINSTANCE.getElementoModeloResultado();

		/**
		 * The meta object literal for the '<em>Resultado</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.resultset.Resultado
		 * @see pgr.datatypes.datatypesqm.impl.DatatypesqmPackageImpl#getResultado()
		 * @generated
		 */
		EDataType RESULTADO = eINSTANCE.getResultado();

		/**
		 * The meta object literal for the '<em>Table View</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tooldataform.formmodel.concreta.TableView
		 * @see pgr.datatypes.datatypesqm.impl.DatatypesqmPackageImpl#getTableView()
		 * @generated
		 */
		EDataType TABLE_VIEW = eINSTANCE.getTableView();

		/**
		 * The meta object literal for the '<em>Data Connection</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionconsultassqlmodels.generate.conexionBD.DataConnection
		 * @see pgr.datatypes.datatypesqm.impl.DatatypesqmPackageImpl#getDataConnection()
		 * @generated
		 */
		EDataType DATA_CONNECTION = eINSTANCE.getDataConnection();

		/**
		 * The meta object literal for the '<em>Whoownmemodel Model Factory Model</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see whoownme.model.ModelFactoryModel
		 * @see pgr.datatypes.datatypesqm.impl.DatatypesqmPackageImpl#getWhoownmemodelModelFactoryModel()
		 * @generated
		 */
		EDataType WHOOWNMEMODEL_MODEL_FACTORY_MODEL = eINSTANCE.getWhoownmemodelModelFactoryModel();

		/**
		 * The meta object literal for the '<em>Proyeccion</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.model.Proyeccion
		 * @see pgr.datatypes.datatypesqm.impl.DatatypesqmPackageImpl#getProyeccion()
		 * @generated
		 */
		EDataType PROYECCION = eINSTANCE.getProyeccion();

		/**
		 * The meta object literal for the '<em>EA Diagram</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gestionmodelosconsultas.modeloconsultas.model.EADiagram
		 * @see pgr.datatypes.datatypesqm.impl.DatatypesqmPackageImpl#getEADiagram()
		 * @generated
		 */
		EDataType EA_DIAGRAM = eINSTANCE.getEADiagram();

	}

} //DatatypesqmPackage
