/**
 */
package pgr.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import pgr.ModelFactory;
import pgr.PgrFactory;
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

import pgr.datatypes.datatypesqm.DatatypesqmPackage;

import pgr.datatypes.datatypesqm.impl.DatatypesqmPackageImpl;

import pgr.datatypes.impl.DatatypesPackageImpl;

import pgr.domain.DomainPackage;

import pgr.domain.generators.GeneratorsPackage;

import pgr.domain.generators.impl.GeneratorsPackageImpl;

import pgr.domain.impl.DomainPackageImpl;

import pgr.domain.util.UtilPackage;

import pgr.domain.util.impl.UtilPackageImpl;

import pgr.ui.UiPackage;

import pgr.ui.impl.UiPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PgrPackageImpl extends EPackageImpl implements PgrPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelFactoryEClass = null;

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
	 * @see pgr.PgrPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PgrPackageImpl() {
		super(eNS_URI, PgrFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PgrPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PgrPackage init() {
		if (isInited) return (PgrPackage)EPackage.Registry.INSTANCE.getEPackage(PgrPackage.eNS_URI);

		// Obtain or create and register package
		PgrPackageImpl thePgrPackage = (PgrPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PgrPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PgrPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
		GeneratorsPackageImpl theGeneratorsPackage = (GeneratorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GeneratorsPackage.eNS_URI) instanceof GeneratorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GeneratorsPackage.eNS_URI) : GeneratorsPackage.eINSTANCE);
		UtilPackageImpl theUtilPackage = (UtilPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) instanceof UtilPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) : UtilPackage.eINSTANCE);
		UiPackageImpl theUiPackage = (UiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) instanceof UiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI) : UiPackage.eINSTANCE);
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) : DatatypesPackage.eINSTANCE);
		DatatypesqmPackageImpl theDatatypesqmPackage = (DatatypesqmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesqmPackage.eNS_URI) instanceof DatatypesqmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesqmPackage.eNS_URI) : DatatypesqmPackage.eINSTANCE);
		DatatypesdataformPackageImpl theDatatypesdataformPackage = (DatatypesdataformPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesdataformPackage.eNS_URI) instanceof DatatypesdataformPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesdataformPackage.eNS_URI) : DatatypesdataformPackage.eINSTANCE);
		DatatypesgmfPackageImpl theDatatypesgmfPackage = (DatatypesgmfPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesgmfPackage.eNS_URI) instanceof DatatypesgmfPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesgmfPackage.eNS_URI) : DatatypesgmfPackage.eINSTANCE);
		DatatypesjavautilPackageImpl theDatatypesjavautilPackage = (DatatypesjavautilPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesjavautilPackage.eNS_URI) instanceof DatatypesjavautilPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesjavautilPackage.eNS_URI) : DatatypesjavautilPackage.eINSTANCE);
		DatatypeapachepoiPackageImpl theDatatypeapachepoiPackage = (DatatypeapachepoiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypeapachepoiPackage.eNS_URI) instanceof DatatypeapachepoiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypeapachepoiPackage.eNS_URI) : DatatypeapachepoiPackage.eINSTANCE);
		DatatypesjavaPackageImpl theDatatypesjavaPackage = (DatatypesjavaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesjavaPackage.eNS_URI) instanceof DatatypesjavaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesjavaPackage.eNS_URI) : DatatypesjavaPackage.eINSTANCE);

		// Create package meta-data objects
		thePgrPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theGeneratorsPackage.createPackageContents();
		theUtilPackage.createPackageContents();
		theUiPackage.createPackageContents();
		theDatatypesPackage.createPackageContents();
		theDatatypesqmPackage.createPackageContents();
		theDatatypesdataformPackage.createPackageContents();
		theDatatypesgmfPackage.createPackageContents();
		theDatatypesjavautilPackage.createPackageContents();
		theDatatypeapachepoiPackage.createPackageContents();
		theDatatypesjavaPackage.createPackageContents();

		// Initialize created meta-data
		thePgrPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theGeneratorsPackage.initializePackageContents();
		theUtilPackage.initializePackageContents();
		theUiPackage.initializePackageContents();
		theDatatypesPackage.initializePackageContents();
		theDatatypesqmPackage.initializePackageContents();
		theDatatypesdataformPackage.initializePackageContents();
		theDatatypesgmfPackage.initializePackageContents();
		theDatatypesjavautilPackage.initializePackageContents();
		theDatatypeapachepoiPackage.initializePackageContents();
		theDatatypesjavaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePgrPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PgrPackage.eNS_URI, thePgrPackage);
		return thePgrPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelFactory() {
		return modelFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelFactory_TheDomain() {
		return (EReference)modelFactoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelFactory_TheUI() {
		return (EReference)modelFactoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelFactory__Load() {
		return modelFactoryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelFactory__Save() {
		return modelFactoryEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PgrFactory getPgrFactory() {
		return (PgrFactory)getEFactoryInstance();
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

		// Create classes and their features
		modelFactoryEClass = createEClass(MODEL_FACTORY);
		createEReference(modelFactoryEClass, MODEL_FACTORY__THE_DOMAIN);
		createEReference(modelFactoryEClass, MODEL_FACTORY__THE_UI);
		createEOperation(modelFactoryEClass, MODEL_FACTORY___LOAD);
		createEOperation(modelFactoryEClass, MODEL_FACTORY___SAVE);
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

		// Obtain other dependent packages
		DomainPackage theDomainPackage = (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);
		UiPackage theUiPackage = (UiPackage)EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI);
		DatatypesPackage theDatatypesPackage = (DatatypesPackage)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theDomainPackage);
		getESubpackages().add(theUiPackage);
		getESubpackages().add(theDatatypesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(modelFactoryEClass, ModelFactory.class, "ModelFactory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelFactory_TheDomain(), theDomainPackage.getDomain(), theDomainPackage.getDomain_TheModelFactory(), "theDomain", null, 1, 1, ModelFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelFactory_TheUI(), theUiPackage.getUI(), theUiPackage.getUI_TheModelFactory(), "theUI", null, 1, 1, ModelFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getModelFactory__Load(), this.getModelFactory(), "load", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getModelFactory__Save(), null, "save", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PgrPackageImpl
