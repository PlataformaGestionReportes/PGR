/**
 */
package gestionmodelosconsultas.impl;

import gestionmodelosconsultas.GestionmodelosconsultasFactory;
import gestionmodelosconsultas.GestionmodelosconsultasPackage;
import gestionmodelosconsultas.ModelFactory;

import gestionmodelosconsultas.datatypes.DatatypesPackage;

import gestionmodelosconsultas.datatypes.impl.DatatypesPackageImpl;

import gestionmodelosconsultas.entitymodel.EntitymodelPackage;

import gestionmodelosconsultas.entitymodel.impl.EntitymodelPackageImpl;

import gestionmodelosconsultas.memoms.MemomsPackage;

import gestionmodelosconsultas.memoms.comunicacion.ComunicacionPackage;

import gestionmodelosconsultas.memoms.comunicacion.impl.ComunicacionPackageImpl;

import gestionmodelosconsultas.memoms.impl.MemomsPackageImpl;

import gestionmodelosconsultas.memoms.info.InfoPackage;

import gestionmodelosconsultas.memoms.info.impl.InfoPackageImpl;

import gestionmodelosconsultas.modeloconsultas.ModeloconsultasPackage;

import gestionmodelosconsultas.modeloconsultas.como.ComoPackage;

import gestionmodelosconsultas.modeloconsultas.como.impl.ComoPackageImpl;

import gestionmodelosconsultas.modeloconsultas.cuando.CuandoPackage;

import gestionmodelosconsultas.modeloconsultas.cuando.impl.CuandoPackageImpl;

import gestionmodelosconsultas.modeloconsultas.donde.DondePackage;

import gestionmodelosconsultas.modeloconsultas.donde.impl.DondePackageImpl;

import gestionmodelosconsultas.modeloconsultas.impl.ModeloconsultasPackageImpl;

import gestionmodelosconsultas.modeloconsultas.model.ModelPackage;

import gestionmodelosconsultas.modeloconsultas.model.impl.ModelPackageImpl;

import gestionmodelosconsultas.modeloconsultas.que.QuePackage;

import gestionmodelosconsultas.modeloconsultas.que.impl.QuePackageImpl;

import gestionmodelosconsultas.modeloconsultas.quien.QuienPackage;

import gestionmodelosconsultas.modeloconsultas.quien.impl.QuienPackageImpl;

import gestionmodelosconsultas.modeloconsultas.resultset.ResultsetPackage;

import gestionmodelosconsultas.modeloconsultas.resultset.impl.ResultsetPackageImpl;

import gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.ResultcomoPackage;

import gestionmodelosconsultas.modeloconsultas.resultset.resultcomo.impl.ResultcomoPackageImpl;

import gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.ResultdondePackage;

import gestionmodelosconsultas.modeloconsultas.resultset.resultdonde.impl.ResultdondePackageImpl;

import gestionmodelosconsultas.modeloconsultas.resultset.resultque.ResultquePackage;

import gestionmodelosconsultas.modeloconsultas.resultset.resultque.impl.ResultquePackageImpl;

import gestionmodelosconsultas.modeloconsultas.resultset.resultquien.ResultquienPackage;

import gestionmodelosconsultas.modeloconsultas.resultset.resultquien.impl.ResultquienPackageImpl;

import gestionmodelosconsultas.rules.factoryrules.FactoryrulesPackage;

import gestionmodelosconsultas.rules.factoryrules.impl.FactoryrulesPackageImpl;

import gestionmodelosconsultas.sysinfo.SysinfoPackage;

import gestionmodelosconsultas.sysinfo.core.CorePackage;

import gestionmodelosconsultas.sysinfo.core.impl.CorePackageImpl;

import gestionmodelosconsultas.sysinfo.data.DataPackage;

import gestionmodelosconsultas.sysinfo.data.docmgt.DocmgtPackage;

import gestionmodelosconsultas.sysinfo.data.docmgt.impl.DocmgtPackageImpl;

import gestionmodelosconsultas.sysinfo.data.impl.DataPackageImpl;

import gestionmodelosconsultas.sysinfo.function.FunctionPackage;

import gestionmodelosconsultas.sysinfo.function.impl.FunctionPackageImpl;

import gestionmodelosconsultas.sysinfo.impl.SysinfoPackageImpl;

import gestionmodelosconsultas.sysinfo.network.NetworkPackage;

import gestionmodelosconsultas.sysinfo.network.impl.NetworkPackageImpl;

import gestionmodelosconsultas.sysinfo.people.PeoplePackage;

import gestionmodelosconsultas.sysinfo.people.impl.PeoplePackageImpl;

import gestionmodelosconsultas.sysinfo.time.TimePackage;

import gestionmodelosconsultas.sysinfo.time.impl.TimePackageImpl;

import gestionmodelosconsultas.sysinfo.vision.VisionPackage;

import gestionmodelosconsultas.sysinfo.vision.impl.VisionPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GestionmodelosconsultasPackageImpl extends EPackageImpl implements GestionmodelosconsultasPackage {
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
	 * @see gestionmodelosconsultas.GestionmodelosconsultasPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GestionmodelosconsultasPackageImpl() {
		super(eNS_URI, GestionmodelosconsultasFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GestionmodelosconsultasPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GestionmodelosconsultasPackage init() {
		if (isInited) return (GestionmodelosconsultasPackage)EPackage.Registry.INSTANCE.getEPackage(GestionmodelosconsultasPackage.eNS_URI);

		// Obtain or create and register package
		GestionmodelosconsultasPackageImpl theGestionmodelosconsultasPackage = (GestionmodelosconsultasPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GestionmodelosconsultasPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GestionmodelosconsultasPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		FactoryrulesPackageImpl theFactoryrulesPackage = (FactoryrulesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FactoryrulesPackage.eNS_URI) instanceof FactoryrulesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FactoryrulesPackage.eNS_URI) : FactoryrulesPackage.eINSTANCE);
		EntitymodelPackageImpl theEntitymodelPackage = (EntitymodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EntitymodelPackage.eNS_URI) instanceof EntitymodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EntitymodelPackage.eNS_URI) : EntitymodelPackage.eINSTANCE);
		SysinfoPackageImpl theSysinfoPackage = (SysinfoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SysinfoPackage.eNS_URI) instanceof SysinfoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SysinfoPackage.eNS_URI) : SysinfoPackage.eINSTANCE);
		PeoplePackageImpl thePeoplePackage = (PeoplePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PeoplePackage.eNS_URI) instanceof PeoplePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PeoplePackage.eNS_URI) : PeoplePackage.eINSTANCE);
		DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
		DocmgtPackageImpl theDocmgtPackage = (DocmgtPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DocmgtPackage.eNS_URI) instanceof DocmgtPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DocmgtPackage.eNS_URI) : DocmgtPackage.eINSTANCE);
		NetworkPackageImpl theNetworkPackage = (NetworkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI) instanceof NetworkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NetworkPackage.eNS_URI) : NetworkPackage.eINSTANCE);
		FunctionPackageImpl theFunctionPackage = (FunctionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FunctionPackage.eNS_URI) instanceof FunctionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FunctionPackage.eNS_URI) : FunctionPackage.eINSTANCE);
		TimePackageImpl theTimePackage = (TimePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TimePackage.eNS_URI) instanceof TimePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TimePackage.eNS_URI) : TimePackage.eINSTANCE);
		VisionPackageImpl theVisionPackage = (VisionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VisionPackage.eNS_URI) instanceof VisionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VisionPackage.eNS_URI) : VisionPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		ModeloconsultasPackageImpl theModeloconsultasPackage = (ModeloconsultasPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModeloconsultasPackage.eNS_URI) instanceof ModeloconsultasPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModeloconsultasPackage.eNS_URI) : ModeloconsultasPackage.eINSTANCE);
		QuePackageImpl theQuePackage = (QuePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QuePackage.eNS_URI) instanceof QuePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QuePackage.eNS_URI) : QuePackage.eINSTANCE);
		QuienPackageImpl theQuienPackage = (QuienPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QuienPackage.eNS_URI) instanceof QuienPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QuienPackage.eNS_URI) : QuienPackage.eINSTANCE);
		ComoPackageImpl theComoPackage = (ComoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComoPackage.eNS_URI) instanceof ComoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComoPackage.eNS_URI) : ComoPackage.eINSTANCE);
		CuandoPackageImpl theCuandoPackage = (CuandoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CuandoPackage.eNS_URI) instanceof CuandoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CuandoPackage.eNS_URI) : CuandoPackage.eINSTANCE);
		DondePackageImpl theDondePackage = (DondePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DondePackage.eNS_URI) instanceof DondePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DondePackage.eNS_URI) : DondePackage.eINSTANCE);
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) : ModelPackage.eINSTANCE);
		ResultsetPackageImpl theResultsetPackage = (ResultsetPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResultsetPackage.eNS_URI) instanceof ResultsetPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResultsetPackage.eNS_URI) : ResultsetPackage.eINSTANCE);
		ResultquienPackageImpl theResultquienPackage = (ResultquienPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResultquienPackage.eNS_URI) instanceof ResultquienPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResultquienPackage.eNS_URI) : ResultquienPackage.eINSTANCE);
		ResultquePackageImpl theResultquePackage = (ResultquePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResultquePackage.eNS_URI) instanceof ResultquePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResultquePackage.eNS_URI) : ResultquePackage.eINSTANCE);
		ResultdondePackageImpl theResultdondePackage = (ResultdondePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResultdondePackage.eNS_URI) instanceof ResultdondePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResultdondePackage.eNS_URI) : ResultdondePackage.eINSTANCE);
		ResultcomoPackageImpl theResultcomoPackage = (ResultcomoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResultcomoPackage.eNS_URI) instanceof ResultcomoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResultcomoPackage.eNS_URI) : ResultcomoPackage.eINSTANCE);
		MemomsPackageImpl theMemomsPackage = (MemomsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MemomsPackage.eNS_URI) instanceof MemomsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MemomsPackage.eNS_URI) : MemomsPackage.eINSTANCE);
		InfoPackageImpl theInfoPackage = (InfoPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InfoPackage.eNS_URI) instanceof InfoPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InfoPackage.eNS_URI) : InfoPackage.eINSTANCE);
		ComunicacionPackageImpl theComunicacionPackage = (ComunicacionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComunicacionPackage.eNS_URI) instanceof ComunicacionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComunicacionPackage.eNS_URI) : ComunicacionPackage.eINSTANCE);
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) : DatatypesPackage.eINSTANCE);

		// Create package meta-data objects
		theGestionmodelosconsultasPackage.createPackageContents();
		theFactoryrulesPackage.createPackageContents();
		theEntitymodelPackage.createPackageContents();
		theSysinfoPackage.createPackageContents();
		thePeoplePackage.createPackageContents();
		theDataPackage.createPackageContents();
		theDocmgtPackage.createPackageContents();
		theNetworkPackage.createPackageContents();
		theFunctionPackage.createPackageContents();
		theTimePackage.createPackageContents();
		theVisionPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theModeloconsultasPackage.createPackageContents();
		theQuePackage.createPackageContents();
		theQuienPackage.createPackageContents();
		theComoPackage.createPackageContents();
		theCuandoPackage.createPackageContents();
		theDondePackage.createPackageContents();
		theModelPackage.createPackageContents();
		theResultsetPackage.createPackageContents();
		theResultquienPackage.createPackageContents();
		theResultquePackage.createPackageContents();
		theResultdondePackage.createPackageContents();
		theResultcomoPackage.createPackageContents();
		theMemomsPackage.createPackageContents();
		theInfoPackage.createPackageContents();
		theComunicacionPackage.createPackageContents();
		theDatatypesPackage.createPackageContents();

		// Initialize created meta-data
		theGestionmodelosconsultasPackage.initializePackageContents();
		theFactoryrulesPackage.initializePackageContents();
		theEntitymodelPackage.initializePackageContents();
		theSysinfoPackage.initializePackageContents();
		thePeoplePackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theDocmgtPackage.initializePackageContents();
		theNetworkPackage.initializePackageContents();
		theFunctionPackage.initializePackageContents();
		theTimePackage.initializePackageContents();
		theVisionPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theModeloconsultasPackage.initializePackageContents();
		theQuePackage.initializePackageContents();
		theQuienPackage.initializePackageContents();
		theComoPackage.initializePackageContents();
		theCuandoPackage.initializePackageContents();
		theDondePackage.initializePackageContents();
		theModelPackage.initializePackageContents();
		theResultsetPackage.initializePackageContents();
		theResultquienPackage.initializePackageContents();
		theResultquePackage.initializePackageContents();
		theResultdondePackage.initializePackageContents();
		theResultcomoPackage.initializePackageContents();
		theMemomsPackage.initializePackageContents();
		theInfoPackage.initializePackageContents();
		theComunicacionPackage.initializePackageContents();
		theDatatypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGestionmodelosconsultasPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GestionmodelosconsultasPackage.eNS_URI, theGestionmodelosconsultasPackage);
		return theGestionmodelosconsultasPackage;
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
	public EReference getModelFactory_RulesFactory() {
		return (EReference)modelFactoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelFactory_FactoryModeloConsultas() {
		return (EReference)modelFactoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelFactory_DiagramEntity() {
		return (EReference)modelFactoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelFactory__Cargar() {
		return modelFactoryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getModelFactory__Salvar() {
		return modelFactoryEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GestionmodelosconsultasFactory getGestionmodelosconsultasFactory() {
		return (GestionmodelosconsultasFactory)getEFactoryInstance();
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
		createEReference(modelFactoryEClass, MODEL_FACTORY__RULES_FACTORY);
		createEReference(modelFactoryEClass, MODEL_FACTORY__FACTORY_MODELO_CONSULTAS);
		createEReference(modelFactoryEClass, MODEL_FACTORY__DIAGRAM_ENTITY);
		createEOperation(modelFactoryEClass, MODEL_FACTORY___CARGAR);
		createEOperation(modelFactoryEClass, MODEL_FACTORY___SALVAR);
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
		FactoryrulesPackage theFactoryrulesPackage = (FactoryrulesPackage)EPackage.Registry.INSTANCE.getEPackage(FactoryrulesPackage.eNS_URI);
		EntitymodelPackage theEntitymodelPackage = (EntitymodelPackage)EPackage.Registry.INSTANCE.getEPackage(EntitymodelPackage.eNS_URI);
		SysinfoPackage theSysinfoPackage = (SysinfoPackage)EPackage.Registry.INSTANCE.getEPackage(SysinfoPackage.eNS_URI);
		ModeloconsultasPackage theModeloconsultasPackage = (ModeloconsultasPackage)EPackage.Registry.INSTANCE.getEPackage(ModeloconsultasPackage.eNS_URI);
		MemomsPackage theMemomsPackage = (MemomsPackage)EPackage.Registry.INSTANCE.getEPackage(MemomsPackage.eNS_URI);
		DatatypesPackage theDatatypesPackage = (DatatypesPackage)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theFactoryrulesPackage);
		getESubpackages().add(theEntitymodelPackage);
		getESubpackages().add(theSysinfoPackage);
		getESubpackages().add(theModeloconsultasPackage);
		getESubpackages().add(theMemomsPackage);
		getESubpackages().add(theDatatypesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(modelFactoryEClass, ModelFactory.class, "ModelFactory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelFactory_RulesFactory(), theFactoryrulesPackage.getRulesFactory(), theFactoryrulesPackage.getRulesFactory_ModelFactory(), "rulesFactory", null, 1, 1, ModelFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelFactory_FactoryModeloConsultas(), theModeloconsultasPackage.getFactoryModeloConsulta(), theModeloconsultasPackage.getFactoryModeloConsulta_ModelFactory(), "factoryModeloConsultas", null, 1, 1, ModelFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelFactory_DiagramEntity(), theEntitymodelPackage.getDiagramEntity(), theEntitymodelPackage.getDiagramEntity_ModelFactory(), "diagramEntity", null, 1, 1, ModelFactory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getModelFactory__Cargar(), this.getModelFactory(), "cargar", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getModelFactory__Salvar(), null, "salvar", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //GestionmodelosconsultasPackageImpl
