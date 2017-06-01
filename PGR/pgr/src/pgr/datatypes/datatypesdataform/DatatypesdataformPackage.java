/**
 */
package pgr.datatypes.datatypesdataform;

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
 * @see pgr.datatypes.datatypesdataform.DatatypesdataformFactory
 * @model kind="package"
 * @generated
 */
public interface DatatypesdataformPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "datatypesdataform";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///pgr/datatypes/datatypesdataform.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pgr.datatypes.datatypesdataform";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatatypesdataformPackage eINSTANCE = pgr.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl.init();

	/**
	 * The meta object id for the '<em>Model Factory</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tooldataform.ModelFactory
	 * @see pgr.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl#getModelFactory()
	 * @generated
	 */
	int MODEL_FACTORY = 0;

	/**
	 * The meta object id for the '<em>Data Form Diagram</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tooldataform.formmodel.concreta.DataForm_Diagram
	 * @see pgr.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl#getDataForm_Diagram()
	 * @generated
	 */
	int DATA_FORM_DIAGRAM = 1;

	/**
	 * The meta object id for the '<em>Domain Diagram</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tooldataform.core.Domain_Diagram
	 * @see pgr.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl#getDomain_Diagram()
	 * @generated
	 */
	int DOMAIN_DIAGRAM = 2;

	/**
	 * The meta object id for the '<em>Containment</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tooldataform.formmodel.concreta.Containment
	 * @see pgr.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl#getContainment()
	 * @generated
	 */
	int CONTAINMENT = 3;

	/**
	 * The meta object id for the '<em>Container</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tooldataform.formmodel.concreta.Container
	 * @see pgr.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 4;

	/**
	 * The meta object id for the '<em>Interface</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tooldataform.formmodel.concreta.Interface
	 * @see pgr.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 5;

	/**
	 * The meta object id for the '<em>Graphical Container</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tooldataform.formmodel.containers.GraphicalContainer
	 * @see pgr.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl#getGraphicalContainer()
	 * @generated
	 */
	int GRAPHICAL_CONTAINER = 6;

	/**
	 * The meta object id for the '<em>Clase</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tooldataform.pmoo.Clase
	 * @see pgr.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl#getClase()
	 * @generated
	 */
	int CLASE = 7;

	/**
	 * The meta object id for the '<em>Project</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tooldataform.core.Project
	 * @see pgr.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 8;


	/**
	 * Returns the meta object for data type '{@link tooldataform.ModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Model Factory</em>'.
	 * @see tooldataform.ModelFactory
	 * @model instanceClass="tooldataform.ModelFactory"
	 * @generated
	 */
	EDataType getModelFactory();

	/**
	 * Returns the meta object for data type '{@link tooldataform.formmodel.concreta.DataForm_Diagram <em>Data Form Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Data Form Diagram</em>'.
	 * @see tooldataform.formmodel.concreta.DataForm_Diagram
	 * @model instanceClass="tooldataform.formmodel.concreta.DataForm_Diagram"
	 * @generated
	 */
	EDataType getDataForm_Diagram();

	/**
	 * Returns the meta object for data type '{@link tooldataform.core.Domain_Diagram <em>Domain Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Domain Diagram</em>'.
	 * @see tooldataform.core.Domain_Diagram
	 * @model instanceClass="tooldataform.core.Domain_Diagram"
	 * @generated
	 */
	EDataType getDomain_Diagram();

	/**
	 * Returns the meta object for data type '{@link tooldataform.formmodel.concreta.Containment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Containment</em>'.
	 * @see tooldataform.formmodel.concreta.Containment
	 * @model instanceClass="tooldataform.formmodel.concreta.Containment"
	 * @generated
	 */
	EDataType getContainment();

	/**
	 * Returns the meta object for data type '{@link tooldataform.formmodel.concreta.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Container</em>'.
	 * @see tooldataform.formmodel.concreta.Container
	 * @model instanceClass="tooldataform.formmodel.concreta.Container"
	 * @generated
	 */
	EDataType getContainer();

	/**
	 * Returns the meta object for data type '{@link tooldataform.formmodel.concreta.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Interface</em>'.
	 * @see tooldataform.formmodel.concreta.Interface
	 * @model instanceClass="tooldataform.formmodel.concreta.Interface"
	 * @generated
	 */
	EDataType getInterface();

	/**
	 * Returns the meta object for data type '{@link tooldataform.formmodel.containers.GraphicalContainer <em>Graphical Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Graphical Container</em>'.
	 * @see tooldataform.formmodel.containers.GraphicalContainer
	 * @model instanceClass="tooldataform.formmodel.containers.GraphicalContainer"
	 * @generated
	 */
	EDataType getGraphicalContainer();

	/**
	 * Returns the meta object for data type '{@link tooldataform.pmoo.Clase <em>Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Clase</em>'.
	 * @see tooldataform.pmoo.Clase
	 * @model instanceClass="tooldataform.pmoo.Clase"
	 * @generated
	 */
	EDataType getClase();

	/**
	 * Returns the meta object for data type '{@link tooldataform.core.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Project</em>'.
	 * @see tooldataform.core.Project
	 * @model instanceClass="tooldataform.core.Project"
	 * @generated
	 */
	EDataType getProject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatatypesdataformFactory getDatatypesdataformFactory();

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
		 * @see tooldataform.ModelFactory
		 * @see pgr.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl#getModelFactory()
		 * @generated
		 */
		EDataType MODEL_FACTORY = eINSTANCE.getModelFactory();

		/**
		 * The meta object literal for the '<em>Data Form Diagram</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tooldataform.formmodel.concreta.DataForm_Diagram
		 * @see pgr.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl#getDataForm_Diagram()
		 * @generated
		 */
		EDataType DATA_FORM_DIAGRAM = eINSTANCE.getDataForm_Diagram();

		/**
		 * The meta object literal for the '<em>Domain Diagram</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tooldataform.core.Domain_Diagram
		 * @see pgr.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl#getDomain_Diagram()
		 * @generated
		 */
		EDataType DOMAIN_DIAGRAM = eINSTANCE.getDomain_Diagram();

		/**
		 * The meta object literal for the '<em>Containment</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tooldataform.formmodel.concreta.Containment
		 * @see pgr.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl#getContainment()
		 * @generated
		 */
		EDataType CONTAINMENT = eINSTANCE.getContainment();

		/**
		 * The meta object literal for the '<em>Container</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tooldataform.formmodel.concreta.Container
		 * @see pgr.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl#getContainer()
		 * @generated
		 */
		EDataType CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em>Interface</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tooldataform.formmodel.concreta.Interface
		 * @see pgr.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl#getInterface()
		 * @generated
		 */
		EDataType INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em>Graphical Container</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tooldataform.formmodel.containers.GraphicalContainer
		 * @see pgr.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl#getGraphicalContainer()
		 * @generated
		 */
		EDataType GRAPHICAL_CONTAINER = eINSTANCE.getGraphicalContainer();

		/**
		 * The meta object literal for the '<em>Clase</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tooldataform.pmoo.Clase
		 * @see pgr.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl#getClase()
		 * @generated
		 */
		EDataType CLASE = eINSTANCE.getClase();

		/**
		 * The meta object literal for the '<em>Project</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tooldataform.core.Project
		 * @see pgr.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl#getProject()
		 * @generated
		 */
		EDataType PROJECT = eINSTANCE.getProject();

	}

} //DatatypesdataformPackage
