/**
 */
package pgr.datatypes.datatypesdataform.impl;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import pgr.PgrPackage;

import pgr.datatypes.DatatypesPackage;

import pgr.datatypes.datatypeapachepoi.DatatypeapachepoiPackage;

import pgr.datatypes.datatypeapachepoi.impl.DatatypeapachepoiPackageImpl;

import pgr.datatypes.datatypesdataform.DatatypesdataformFactory;
import pgr.datatypes.datatypesdataform.DatatypesdataformPackage;

import pgr.datatypes.datatypesgmf.DatatypesgmfPackage;

import pgr.datatypes.datatypesgmf.impl.DatatypesgmfPackageImpl;

import pgr.datatypes.datatypesjava.DatatypesjavaPackage;

import pgr.datatypes.datatypesjava.impl.DatatypesjavaPackageImpl;

import pgr.datatypes.datatypesjavautil.DatatypesjavautilPackage;

import pgr.datatypes.datatypesjavautil.impl.DatatypesjavautilPackageImpl;

import pgr.datatypes.datatypesqm.DatatypesqmPackage;

import pgr.datatypes.datatypesqm.impl.DatatypesqmPackageImpl;

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

import tooldataform.ModelFactory;

import tooldataform.core.Domain_Diagram;
import tooldataform.core.Project;

import tooldataform.formmodel.concreta.Containment;
import tooldataform.formmodel.concreta.DataForm_Diagram;
import tooldataform.formmodel.concreta.Interface;

import tooldataform.formmodel.containers.GraphicalContainer;

import tooldataform.pmoo.Clase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatatypesdataformPackageImpl extends EPackageImpl implements DatatypesdataformPackage {
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
	private EDataType dataForm_DiagramEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType domain_DiagramEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType containmentEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType containerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType interfaceEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType graphicalContainerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType claseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType projectEDataType = null;

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
	 * @see pgr.datatypes.datatypesdataform.DatatypesdataformPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatatypesdataformPackageImpl() {
		super(eNS_URI, DatatypesdataformFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DatatypesdataformPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DatatypesdataformPackage init() {
		if (isInited) return (DatatypesdataformPackage)EPackage.Registry.INSTANCE.getEPackage(DatatypesdataformPackage.eNS_URI);

		// Obtain or create and register package
		DatatypesdataformPackageImpl theDatatypesdataformPackage = (DatatypesdataformPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DatatypesdataformPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DatatypesdataformPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		PgrPackageImpl thePgrPackage = (PgrPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PgrPackage.eNS_URI) instanceof PgrPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PgrPackage.eNS_URI) : PgrPackage.eINSTANCE);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
		GeneratorsPackageImpl theGeneratorsPackage = (GeneratorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GeneratorsPackage.eNS_URI) instanceof GeneratorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GeneratorsPackage.eNS_URI) : GeneratorsPackage.eINSTANCE);
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) instanceof UtilPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) : UtilPackage.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) : DatatypesPackage.eINSTANCE);
		DatatypesqmPackageImpl theDatatypesqmPackage = (DatatypesqmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesqmPackage.eNS_URI) instanceof DatatypesqmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesqmPackage.eNS_URI) : DatatypesqmPackage.eINSTANCE);
		DatatypesgmfPackageImpl theDatatypesgmfPackage = (DatatypesgmfPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesgmfPackage.eNS_URI) instanceof DatatypesgmfPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesgmfPackage.eNS_URI) : DatatypesgmfPackage.eINSTANCE);
		DatatypesjavautilPackageImpl theDatatypesjavautilPackage = (DatatypesjavautilPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesjavautilPackage.eNS_URI) instanceof DatatypesjavautilPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesjavautilPackage.eNS_URI) : DatatypesjavautilPackage.eINSTANCE);
		DatatypeapachepoiPackageImpl theDatatypeapachepoiPackage = (DatatypeapachepoiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypeapachepoiPackage.eNS_URI) instanceof DatatypeapachepoiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypeapachepoiPackage.eNS_URI) : DatatypeapachepoiPackage.eINSTANCE);
		DatatypesjavaPackageImpl theDatatypesjavaPackage = (DatatypesjavaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesjavaPackage.eNS_URI) instanceof DatatypesjavaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesjavaPackage.eNS_URI) : DatatypesjavaPackage.eINSTANCE);

		// Create package meta-data objects
		theDatatypesdataformPackage.createPackageContents();
		thePgrPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theGeneratorsPackage.createPackageContents();
		theUtilPackage.createPackageContents();
		theUiPackage.createPackageContents();
		theDatatypesPackage.createPackageContents();
		theDatatypesqmPackage.createPackageContents();
		theDatatypesgmfPackage.createPackageContents();
		theDatatypesjavautilPackage.createPackageContents();
		theDatatypeapachepoiPackage.createPackageContents();
		theDatatypesjavaPackage.createPackageContents();

		// Initialize created meta-data
		theDatatypesdataformPackage.initializePackageContents();
		thePgrPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theGeneratorsPackage.initializePackageContents();
		theUtilPackage.initializePackageContents();
		theUiPackage.initializePackageContents();
		theDatatypesPackage.initializePackageContents();
		theDatatypesqmPackage.initializePackageContents();
		theDatatypesgmfPackage.initializePackageContents();
		theDatatypesjavautilPackage.initializePackageContents();
		theDatatypeapachepoiPackage.initializePackageContents();
		theDatatypesjavaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatatypesdataformPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatatypesdataformPackage.eNS_URI, theDatatypesdataformPackage);
		return theDatatypesdataformPackage;
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
	public EDataType getDataForm_Diagram() {
		return dataForm_DiagramEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDomain_Diagram() {
		return domain_DiagramEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getContainment() {
		return containmentEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getContainer() {
		return containerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInterface() {
		return interfaceEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGraphicalContainer() {
		return graphicalContainerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getClase() {
		return claseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getProject() {
		return projectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypesdataformFactory getDatatypesdataformFactory() {
		return (DatatypesdataformFactory)getEFactoryInstance();
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
		dataForm_DiagramEDataType = createEDataType(DATA_FORM_DIAGRAM);
		domain_DiagramEDataType = createEDataType(DOMAIN_DIAGRAM);
		containmentEDataType = createEDataType(CONTAINMENT);
		containerEDataType = createEDataType(CONTAINER);
		interfaceEDataType = createEDataType(INTERFACE);
		graphicalContainerEDataType = createEDataType(GRAPHICAL_CONTAINER);
		claseEDataType = createEDataType(CLASE);
		projectEDataType = createEDataType(PROJECT);
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
		initEDataType(dataForm_DiagramEDataType, DataForm_Diagram.class, "DataForm_Diagram", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(domain_DiagramEDataType, Domain_Diagram.class, "Domain_Diagram", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(containmentEDataType, Containment.class, "Containment", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(containerEDataType, tooldataform.formmodel.concreta.Container.class, "Container", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(interfaceEDataType, Interface.class, "Interface", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(graphicalContainerEDataType, GraphicalContainer.class, "GraphicalContainer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(claseEDataType, Clase.class, "Clase", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(projectEDataType, Project.class, "Project", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //DatatypesdataformPackageImpl
