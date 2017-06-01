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

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import pgr.PgrPackage;

import pgr.datatypes.DatatypesPackage;

import pgr.datatypes.datatypeapachepoi.DatatypeapachepoiPackage;

import pgr.datatypes.datatypeapachepoi.impl.DatatypeapachepoiPackageImpl;

import pgr.datatypes.datatypesdataform.DatatypesdataformPackage;

import pgr.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl;

import pgr.datatypes.datatypesgmf.DatatypesgmfPackage;

import pgr.datatypes.datatypesgmf.impl.DatatypesgmfPackageImpl;

import pgr.datatypes.datatypesjava.DatatypesjavaPackage;

import pgr.datatypes.datatypesjava.impl.DatatypesjavaPackageImpl;

import pgr.datatypes.datatypesjavautil.DatatypesjavautilPackage;

import pgr.datatypes.datatypesjavautil.impl.DatatypesjavautilPackageImpl;

import pgr.datatypes.datatypesqm.DatatypesqmFactory;
import pgr.datatypes.datatypesqm.DatatypesqmPackage;

import pgr.datatypes.impl.DatatypesPackageImpl;

import pgr.domain.DomainPackage;

import pgr.domain.generators.GeneratorsPackage;

import pgr.domain.generators.impl.GeneratorsPackageImpl;

import pgr.domain.impl.DomainPackageImpl;

import pgr.domain.util.UtilPackage;

import pgr.domain.util.impl.UtilPackageImpl;

import pgr.impl.PgrPackageImpl;

import pgr.ui.UiPackage;

import pgr.ui.impl.UiPackageImpl;

import tooldataform.formmodel.concreta.TableView;

import whoownme.model.ModelFactoryModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatatypesqmPackageImpl extends EPackageImpl implements DatatypesqmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modelFactoryEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType elementoConsultaEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType resultElementEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType elementoModeloResultadoEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType resultadoEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tableViewEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dataConnectionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType whoownmemodelModelFactoryModelEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType proyeccionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eaDiagramEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see pgr.datatypes.datatypesqm.DatatypesqmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatatypesqmPackageImpl() {
		super(eNS_URI, DatatypesqmFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DatatypesqmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DatatypesqmPackage init() {
		if (isInited) return (DatatypesqmPackage)EPackage.Registry.INSTANCE.getEPackage(DatatypesqmPackage.eNS_URI);

		// Obtain or create and register package
		DatatypesqmPackageImpl theDatatypesqmPackage = (DatatypesqmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DatatypesqmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DatatypesqmPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		PgrPackageImpl thePgrPackage = (PgrPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PgrPackage.eNS_URI) instanceof PgrPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PgrPackage.eNS_URI) : PgrPackage.eINSTANCE);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
		GeneratorsPackageImpl theGeneratorsPackage = (GeneratorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GeneratorsPackage.eNS_URI) instanceof GeneratorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GeneratorsPackage.eNS_URI) : GeneratorsPackage.eINSTANCE);
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) instanceof UtilPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) : UtilPackage.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) : DatatypesPackage.eINSTANCE);
		DatatypesdataformPackageImpl theDatatypesdataformPackage = (DatatypesdataformPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesdataformPackage.eNS_URI) instanceof DatatypesdataformPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesdataformPackage.eNS_URI) : DatatypesdataformPackage.eINSTANCE);
		DatatypesgmfPackageImpl theDatatypesgmfPackage = (DatatypesgmfPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesgmfPackage.eNS_URI) instanceof DatatypesgmfPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesgmfPackage.eNS_URI) : DatatypesgmfPackage.eINSTANCE);
		DatatypesjavautilPackageImpl theDatatypesjavautilPackage = (DatatypesjavautilPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesjavautilPackage.eNS_URI) instanceof DatatypesjavautilPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesjavautilPackage.eNS_URI) : DatatypesjavautilPackage.eINSTANCE);
		DatatypeapachepoiPackageImpl theDatatypeapachepoiPackage = (DatatypeapachepoiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypeapachepoiPackage.eNS_URI) instanceof DatatypeapachepoiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypeapachepoiPackage.eNS_URI) : DatatypeapachepoiPackage.eINSTANCE);
		DatatypesjavaPackageImpl theDatatypesjavaPackage = (DatatypesjavaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesjavaPackage.eNS_URI) instanceof DatatypesjavaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesjavaPackage.eNS_URI) : DatatypesjavaPackage.eINSTANCE);

		// Create package meta-data objects
		theDatatypesqmPackage.createPackageContents();
		thePgrPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theGeneratorsPackage.createPackageContents();
		theUtilPackage.createPackageContents();
		theUiPackage.createPackageContents();
		theDatatypesPackage.createPackageContents();
		theDatatypesdataformPackage.createPackageContents();
		theDatatypesgmfPackage.createPackageContents();
		theDatatypesjavautilPackage.createPackageContents();
		theDatatypeapachepoiPackage.createPackageContents();
		theDatatypesjavaPackage.createPackageContents();

		// Initialize created meta-data
		theDatatypesqmPackage.initializePackageContents();
		thePgrPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theGeneratorsPackage.initializePackageContents();
		theUtilPackage.initializePackageContents();
		theUiPackage.initializePackageContents();
		theDatatypesPackage.initializePackageContents();
		theDatatypesdataformPackage.initializePackageContents();
		theDatatypesgmfPackage.initializePackageContents();
		theDatatypesjavautilPackage.initializePackageContents();
		theDatatypeapachepoiPackage.initializePackageContents();
		theDatatypesjavaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatatypesqmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatatypesqmPackage.eNS_URI, theDatatypesqmPackage);
		return theDatatypesqmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getModelFactory() {
		return modelFactoryEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getElementoConsulta() {
		return elementoConsultaEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getResultElement() {
		return resultElementEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getElementoModeloResultado() {
		return elementoModeloResultadoEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getResultado() {
		return resultadoEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTableView() {
		return tableViewEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDataConnection() {
		return dataConnectionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getWhoownmemodelModelFactoryModel() {
		return whoownmemodelModelFactoryModelEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getProyeccion() {
		return proyeccionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEADiagram() {
		return eaDiagramEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypesqmFactory getDatatypesqmFactory() {
		return (DatatypesqmFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create data types
		modelFactoryEDataType = createEDataType(MODEL_FACTORY);
		elementoConsultaEDataType = createEDataType(ELEMENTO_CONSULTA);
		resultElementEDataType = createEDataType(RESULT_ELEMENT);
		elementoModeloResultadoEDataType = createEDataType(ELEMENTO_MODELO_RESULTADO);
		resultadoEDataType = createEDataType(RESULTADO);
		tableViewEDataType = createEDataType(TABLE_VIEW);
		dataConnectionEDataType = createEDataType(DATA_CONNECTION);
		whoownmemodelModelFactoryModelEDataType = createEDataType(WHOOWNMEMODEL_MODEL_FACTORY_MODEL);
		proyeccionEDataType = createEDataType(PROYECCION);
		eaDiagramEDataType = createEDataType(EA_DIAGRAM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Initialize data types
		initEDataType(modelFactoryEDataType, ModelFactory.class, "ModelFactory", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(elementoConsultaEDataType, ElementoConsulta.class, "ElementoConsulta", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(resultElementEDataType, ResultElement.class, "ResultElement", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(elementoModeloResultadoEDataType, ElementoModeloResultado.class, "ElementoModeloResultado", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(resultadoEDataType, Resultado.class, "Resultado", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tableViewEDataType, TableView.class, "TableView", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dataConnectionEDataType, DataConnection.class, "DataConnection", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(whoownmemodelModelFactoryModelEDataType, ModelFactoryModel.class, "WhoownmemodelModelFactoryModel", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(proyeccionEDataType, Proyeccion.class, "Proyeccion", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eaDiagramEDataType, EADiagram.class, "EADiagram", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //DatatypesqmPackageImpl
