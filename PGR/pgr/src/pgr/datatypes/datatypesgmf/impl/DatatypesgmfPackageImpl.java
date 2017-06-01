/**
 */
package pgr.datatypes.datatypesgmf.impl;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Node;

import pgr.PgrPackage;

import pgr.datatypes.DatatypesPackage;

import pgr.datatypes.datatypeapachepoi.DatatypeapachepoiPackage;

import pgr.datatypes.datatypeapachepoi.impl.DatatypeapachepoiPackageImpl;

import pgr.datatypes.datatypesdataform.DatatypesdataformPackage;

import pgr.datatypes.datatypesdataform.impl.DatatypesdataformPackageImpl;

import pgr.datatypes.datatypesgmf.DatatypesgmfFactory;
import pgr.datatypes.datatypesgmf.DatatypesgmfPackage;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatatypesgmfPackageImpl extends EPackageImpl implements DatatypesgmfPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType boundsEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType diagramEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nodeEDataType = null;

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
	 * @see pgr.datatypes.datatypesgmf.DatatypesgmfPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatatypesgmfPackageImpl() {
		super(eNS_URI, DatatypesgmfFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DatatypesgmfPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DatatypesgmfPackage init() {
		if (isInited) return (DatatypesgmfPackage)EPackage.Registry.INSTANCE.getEPackage(DatatypesgmfPackage.eNS_URI);

		// Obtain or create and register package
		DatatypesgmfPackageImpl theDatatypesgmfPackage = (DatatypesgmfPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DatatypesgmfPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DatatypesgmfPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		PgrPackageImpl thePgrPackage = (PgrPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PgrPackage.eNS_URI) instanceof PgrPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PgrPackage.eNS_URI) : PgrPackage.eINSTANCE);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
		GeneratorsPackageImpl theGeneratorsPackage = (GeneratorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GeneratorsPackage.eNS_URI) instanceof GeneratorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GeneratorsPackage.eNS_URI) : GeneratorsPackage.eINSTANCE);
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) instanceof UtilPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) : UtilPackage.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) : DatatypesPackage.eINSTANCE);
		DatatypesqmPackageImpl theDatatypesqmPackage = (DatatypesqmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesqmPackage.eNS_URI) instanceof DatatypesqmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesqmPackage.eNS_URI) : DatatypesqmPackage.eINSTANCE);
		DatatypesdataformPackageImpl theDatatypesdataformPackage = (DatatypesdataformPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesdataformPackage.eNS_URI) instanceof DatatypesdataformPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesdataformPackage.eNS_URI) : DatatypesdataformPackage.eINSTANCE);
		DatatypesjavautilPackageImpl theDatatypesjavautilPackage = (DatatypesjavautilPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesjavautilPackage.eNS_URI) instanceof DatatypesjavautilPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesjavautilPackage.eNS_URI) : DatatypesjavautilPackage.eINSTANCE);
		DatatypeapachepoiPackageImpl theDatatypeapachepoiPackage = (DatatypeapachepoiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypeapachepoiPackage.eNS_URI) instanceof DatatypeapachepoiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypeapachepoiPackage.eNS_URI) : DatatypeapachepoiPackage.eINSTANCE);
		DatatypesjavaPackageImpl theDatatypesjavaPackage = (DatatypesjavaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesjavaPackage.eNS_URI) instanceof DatatypesjavaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesjavaPackage.eNS_URI) : DatatypesjavaPackage.eINSTANCE);

		// Create package meta-data objects
		theDatatypesgmfPackage.createPackageContents();
		thePgrPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theGeneratorsPackage.createPackageContents();
		theUtilPackage.createPackageContents();
		theUiPackage.createPackageContents();
		theDatatypesPackage.createPackageContents();
		theDatatypesqmPackage.createPackageContents();
		theDatatypesdataformPackage.createPackageContents();
		theDatatypesjavautilPackage.createPackageContents();
		theDatatypeapachepoiPackage.createPackageContents();
		theDatatypesjavaPackage.createPackageContents();

		// Initialize created meta-data
		theDatatypesgmfPackage.initializePackageContents();
		thePgrPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theGeneratorsPackage.initializePackageContents();
		theUtilPackage.initializePackageContents();
		theUiPackage.initializePackageContents();
		theDatatypesPackage.initializePackageContents();
		theDatatypesqmPackage.initializePackageContents();
		theDatatypesdataformPackage.initializePackageContents();
		theDatatypesjavautilPackage.initializePackageContents();
		theDatatypeapachepoiPackage.initializePackageContents();
		theDatatypesjavaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatatypesgmfPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatatypesgmfPackage.eNS_URI, theDatatypesgmfPackage);
		return theDatatypesgmfPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBounds() {
		return boundsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDiagram() {
		return diagramEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNode() {
		return nodeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypesgmfFactory getDatatypesgmfFactory() {
		return (DatatypesgmfFactory)getEFactoryInstance();
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
		boundsEDataType = createEDataType(BOUNDS);
		diagramEDataType = createEDataType(DIAGRAM);
		nodeEDataType = createEDataType(NODE);
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
		initEDataType(boundsEDataType, Bounds.class, "Bounds", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(diagramEDataType, Diagram.class, "Diagram", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nodeEDataType, Node.class, "Node", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //DatatypesgmfPackageImpl
