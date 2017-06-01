/**
 */
package pgr.domain.generators.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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

import pgr.datatypes.datatypesqm.DatatypesqmPackage;

import pgr.datatypes.datatypesqm.impl.DatatypesqmPackageImpl;

import pgr.datatypes.impl.DatatypesPackageImpl;

import pgr.domain.DomainPackage;

import pgr.domain.generators.DataformDiagramGenerator;
import pgr.domain.generators.DataformGenerator;
import pgr.domain.generators.ExcelGenerator;
import pgr.domain.generators.ExcelUpdater;
import pgr.domain.generators.GeneratorsFactory;
import pgr.domain.generators.GeneratorsPackage;
import pgr.domain.generators.ViewModelGenerator;

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
public class GeneratorsPackageImpl extends EPackageImpl implements GeneratorsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewModelGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataformDiagramGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataformGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass excelGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass excelUpdaterEClass = null;

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
	 * @see pgr.domain.generators.GeneratorsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GeneratorsPackageImpl() {
		super(eNS_URI, GeneratorsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GeneratorsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GeneratorsPackage init() {
		if (isInited) return (GeneratorsPackage)EPackage.Registry.INSTANCE.getEPackage(GeneratorsPackage.eNS_URI);

		// Obtain or create and register package
		GeneratorsPackageImpl theGeneratorsPackage = (GeneratorsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GeneratorsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GeneratorsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		PgrPackageImpl thePgrPackage = (PgrPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PgrPackage.eNS_URI) instanceof PgrPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PgrPackage.eNS_URI) : PgrPackage.eINSTANCE);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) instanceof DomainPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI) : DomainPackage.eINSTANCE);
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
		theGeneratorsPackage.createPackageContents();
		thePgrPackage.createPackageContents();
		theDomainPackage.createPackageContents();
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
		theGeneratorsPackage.initializePackageContents();
		thePgrPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
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
		theGeneratorsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GeneratorsPackage.eNS_URI, theGeneratorsPackage);
		return theGeneratorsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewModelGenerator() {
		return viewModelGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewModelGenerator_ModelFactoryQM() {
		return (EAttribute)viewModelGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewModelGenerator_Projection() {
		return (EAttribute)viewModelGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewModelGenerator_ViewModel() {
		return (EAttribute)viewModelGeneratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewModelGenerator_TheDomain() {
		return (EReference)viewModelGeneratorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getViewModelGenerator__ViewModelGenerator__ModelFactory() {
		return viewModelGeneratorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getViewModelGenerator__GenerateViewModel() {
		return viewModelGeneratorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getViewModelGenerator__ExploreRelations__ElementoConsulta_ElementoConsulta_Integer() {
		return viewModelGeneratorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getViewModelGenerator__CreateViewModel() {
		return viewModelGeneratorEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getViewModelGenerator__CreateElement__ElementoConsulta() {
		return viewModelGeneratorEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getViewModelGenerator__GetProjectionQM() {
		return viewModelGeneratorEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getViewModelGenerator__GetParent() {
		return viewModelGeneratorEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataformDiagramGenerator() {
		return dataformDiagramGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataformDiagramGenerator_ModelFactory() {
		return (EAttribute)dataformDiagramGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataformDiagramGenerator_DataformDiagram() {
		return (EAttribute)dataformDiagramGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataformDiagramGenerator_Interface1() {
		return (EAttribute)dataformDiagramGeneratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataformDiagramGenerator_TheDomain() {
		return (EReference)dataformDiagramGeneratorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformDiagramGenerator__DataformDiagramGenerator__ModelFactory() {
		return dataformDiagramGeneratorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformDiagramGenerator__SalvarDiagram__Diagram() {
		return dataformDiagramGeneratorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformDiagramGenerator__CargarDiagram() {
		return dataformDiagramGeneratorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformDiagramGenerator__ResetDiagram__String() {
		return dataformDiagramGeneratorEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformDiagramGenerator__GenerateDiagram() {
		return dataformDiagramGeneratorEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformDiagramGenerator__CreateDiagram() {
		return dataformDiagramGeneratorEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformDiagramGenerator__InitComponents__GraphicalContainer_Node() {
		return dataformDiagramGeneratorEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformDiagramGenerator__CreateBounds__int_int_int_int() {
		return dataformDiagramGeneratorEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformDiagramGenerator__OpenDiagram__Diagram() {
		return dataformDiagramGeneratorEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataformGenerator() {
		return dataformGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataformGenerator_ModelFactory() {
		return (EAttribute)dataformGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataformGenerator_Project() {
		return (EAttribute)dataformGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataformGenerator_DataformDiagram() {
		return (EAttribute)dataformGeneratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataformGenerator_DomainDiagram() {
		return (EAttribute)dataformGeneratorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataformGenerator_DomainClass() {
		return (EAttribute)dataformGeneratorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataformGenerator_Interface1() {
		return (EAttribute)dataformGeneratorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataformGenerator_Container() {
		return (EAttribute)dataformGeneratorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataformGenerator_Path() {
		return (EAttribute)dataformGeneratorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataformGenerator_AbsolutePath() {
		return (EAttribute)dataformGeneratorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataformGenerator_Dimens() {
		return (EAttribute)dataformGeneratorEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataformGenerator_AmountContainers() {
		return (EAttribute)dataformGeneratorEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataformGenerator_AmountTables() {
		return (EAttribute)dataformGeneratorEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataformGenerator_RelativeX() {
		return (EAttribute)dataformGeneratorEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataformGenerator_RelativeY() {
		return (EAttribute)dataformGeneratorEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataformGenerator_DataStartRow() {
		return (EAttribute)dataformGeneratorEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataformGenerator_DataStartCell() {
		return (EAttribute)dataformGeneratorEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataformGenerator_AmountCombos() {
		return (EAttribute)dataformGeneratorEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataformGenerator_ReportName() {
		return (EAttribute)dataformGeneratorEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataformGenerator_ContainerEndRow() {
		return (EAttribute)dataformGeneratorEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataformGenerator_ContainerEndCell() {
		return (EAttribute)dataformGeneratorEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataformGenerator_Workbook() {
		return (EAttribute)dataformGeneratorEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataformGenerator_Sheet() {
		return (EAttribute)dataformGeneratorEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataformGenerator_AdjacenciesX() {
		return (EAttribute)dataformGeneratorEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataformGenerator_AdjacenciesY() {
		return (EAttribute)dataformGeneratorEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataformGenerator_VisitedCells() {
		return (EAttribute)dataformGeneratorEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataformGenerator_ComboNamesSorted() {
		return (EAttribute)dataformGeneratorEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataformGenerator_CoordenadasComboBox() {
		return (EAttribute)dataformGeneratorEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataformGenerator_ListTables() {
		return (EAttribute)dataformGeneratorEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataformGenerator_ListComboBox() {
		return (EAttribute)dataformGeneratorEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataformGenerator_ListComboCordinate() {
		return (EAttribute)dataformGeneratorEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataformGenerator_MergedRegions() {
		return (EAttribute)dataformGeneratorEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataformGenerator_CoordenadasInicioContenedores() {
		return (EAttribute)dataformGeneratorEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataformGenerator_CoordenadasFinContenedores() {
		return (EAttribute)dataformGeneratorEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataformGenerator_Containers() {
		return (EAttribute)dataformGeneratorEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataformGenerator_TheDomain() {
		return (EReference)dataformGeneratorEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__DataformGenerator__String_String() {
		return dataformGeneratorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__Generate() {
		return dataformGeneratorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__SearchBegin() {
		return dataformGeneratorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__SetBoundsGraphicalContainer__GraphicalContainer_int_int_int_int() {
		return dataformGeneratorEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__SetAtributesContaimentRelation__Containment_String() {
		return dataformGeneratorEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__Init() {
		return dataformGeneratorEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__ResetDataform() {
		return dataformGeneratorEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__GetOrderViewModel() {
		return dataformGeneratorEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__GetExtraInformation() {
		return dataformGeneratorEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__IdentifyMergedRegions() {
		return dataformGeneratorEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__SearchMergeRegion__MergedRegion_int() {
		return dataformGeneratorEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__ExploreMergedRegions__MergedRegion() {
		return dataformGeneratorEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__VisitTable__MergedRegion() {
		return dataformGeneratorEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__GetTableColumns__MergedRegion_int() {
		return dataformGeneratorEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__CreateTable__MergedRegion_ArrayList() {
		return dataformGeneratorEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__IsTableColumn__MergedRegion() {
		return dataformGeneratorEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__IsTable__int_int() {
		return dataformGeneratorEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__VisitRegion__MergedRegion() {
		return dataformGeneratorEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__InitMergedRegions__List() {
		return dataformGeneratorEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__IsCellRange__int_int() {
		return dataformGeneratorEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__GetDimention() {
		return dataformGeneratorEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__GetNumberTables() {
		return dataformGeneratorEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__GetTables() {
		return dataformGeneratorEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__SalvarDF() {
		return dataformGeneratorEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__GetXML__String() {
		return dataformGeneratorEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__MarcarTablas__ArrayList() {
		return dataformGeneratorEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__ReOrganizarTablas() {
		return dataformGeneratorEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__GetMaxX__ArrayList() {
		return dataformGeneratorEClass.getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__IsValid__int_int() {
		return dataformGeneratorEClass.getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__Bfs__int_int() {
		return dataformGeneratorEClass.getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__RecorrerHoja() {
		return dataformGeneratorEClass.getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__CreateContainer__int_int() {
		return dataformGeneratorEClass.getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__GetAmountContainersV__int() {
		return dataformGeneratorEClass.getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__CalculateV__int() {
		return dataformGeneratorEClass.getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__CalculateH__int() {
		return dataformGeneratorEClass.getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__GetAmountContainersH__int() {
		return dataformGeneratorEClass.getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__CapturarNumeros__String() {
		return dataformGeneratorEClass.getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__GetCoordinates__String() {
		return dataformGeneratorEClass.getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__GetSizes__String_String() {
		return dataformGeneratorEClass.getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__StractColumn__String() {
		return dataformGeneratorEClass.getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__GetSizes2__String_String() {
		return dataformGeneratorEClass.getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__GetCoordinates2__String() {
		return dataformGeneratorEClass.getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__ToInt__String() {
		return dataformGeneratorEClass.getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__Pow__int_int() {
		return dataformGeneratorEClass.getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__GetCellValue__XSSFCell() {
		return dataformGeneratorEClass.getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataformGenerator__CreateCoordinate__int_int() {
		return dataformGeneratorEClass.getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExcelGenerator() {
		return excelGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExcelGenerator_AbsolutePath() {
		return (EAttribute)excelGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExcelGenerator_Workbook() {
		return (EAttribute)excelGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExcelGenerator_NewDataSheet() {
		return (EAttribute)excelGeneratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExcelGenerator_DataSheet() {
		return (EAttribute)excelGeneratorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExcelGenerator_ColumnSheet() {
		return (EAttribute)excelGeneratorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExcelGenerator_Sheet() {
		return (EAttribute)excelGeneratorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExcelGenerator_QueryString() {
		return (EAttribute)excelGeneratorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExcelGenerator_ModelFactoryQM() {
		return (EAttribute)excelGeneratorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExcelGenerator_ResultSet() {
		return (EAttribute)excelGeneratorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExcelGenerator_NamesFilters() {
		return (EAttribute)excelGeneratorEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExcelGenerator_PosFilters() {
		return (EAttribute)excelGeneratorEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExcelGenerator_TitlesMap() {
		return (EAttribute)excelGeneratorEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExcelGenerator_SetResult() {
		return (EAttribute)excelGeneratorEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExcelGenerator_ListFixed() {
		return (EAttribute)excelGeneratorEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExcelGenerator_Result() {
		return (EAttribute)excelGeneratorEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExcelGenerator_TuplesList() {
		return (EAttribute)excelGeneratorEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExcelGenerator_Columns() {
		return (EAttribute)excelGeneratorEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExcelGenerator_ColumnsNames() {
		return (EAttribute)excelGeneratorEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExcelGenerator_ColumnsIndex() {
		return (EAttribute)excelGeneratorEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExcelGenerator_Acc() {
		return (EAttribute)excelGeneratorEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExcelGenerator_FirstRowFilter() {
		return (EAttribute)excelGeneratorEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExcelGenerator_PosRowIniData() {
		return (EAttribute)excelGeneratorEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExcelGenerator_PosCellIniData() {
		return (EAttribute)excelGeneratorEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExcelGenerator_TheDomain() {
		return (EReference)excelGeneratorEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__ExcelGenerator__String_ArrayList_ArrayList_ModelFactory_int_int_String() {
		return excelGeneratorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__ExcelGenerator__String_ArrayList_ArrayList() {
		return excelGeneratorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__CreateRelations() {
		return excelGeneratorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__Init() {
		return excelGeneratorEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__InitDataSheet__ArrayList() {
		return excelGeneratorEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__WriteFileColumns__ResultSet() {
		return excelGeneratorEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__CreateTable__ArrayList_int_XSSFSheet() {
		return excelGeneratorEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__CreateDataSheet__ResultSet() {
		return excelGeneratorEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__ExploreResult__EList_String() {
		return excelGeneratorEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__Execute__ArrayList_HashMap_int_int_int() {
		return excelGeneratorEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__ReadFile() {
		return excelGeneratorEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__SaveExcel() {
		return excelGeneratorEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__CreateNames() {
		return excelGeneratorEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__ReadSheet() {
		return excelGeneratorEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__GetNumToCol__int() {
		return excelGeneratorEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__GetResulSet__XSSFSheet() {
		return excelGeneratorEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__GetSetColum__ArrayList_int() {
		return excelGeneratorEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__GetMapOfColumnByColumn__ArrayList_int_int() {
		return excelGeneratorEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__CreateListBox__ArrayList_XSSFSheet_int_int() {
		return excelGeneratorEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__BuildDataSheet__XSSFSheet_HashMap_int() {
		return excelGeneratorEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__SetIndirect() {
		return excelGeneratorEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__DeleteNames__XSSFWorkbook() {
		return excelGeneratorEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__NameTableToNameRange__XSSFSheet_ArrayList() {
		return excelGeneratorEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__CountFormula__int_int() {
		return excelGeneratorEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__TheFormula__int_int_int_int_Integer_int_int() {
		return excelGeneratorEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__CreateDependence__ArrayList_HashMap_ArrayList() {
		return excelGeneratorEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__GetTitles__ArrayList() {
		return excelGeneratorEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__RemoveDuplicateValues__ArrayList() {
		return excelGeneratorEClass.getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__GetAtributtes__ResultElement() {
		return excelGeneratorEClass.getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__CreateSheetQuery() {
		return excelGeneratorEClass.getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__RemoveSheets() {
		return excelGeneratorEClass.getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__CopyExcel__String_String() {
		return excelGeneratorEClass.getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__OpenFileIntoEditor__String() {
		return excelGeneratorEClass.getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__GetDir__String() {
		return excelGeneratorEClass.getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__GetCellValue__XSSFCell() {
		return excelGeneratorEClass.getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelGenerator__GetArrayListFromSet__Set() {
		return excelGeneratorEClass.getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExcelUpdater() {
		return excelUpdaterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExcelUpdater_FilePath() {
		return (EAttribute)excelUpdaterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExcelUpdater_StringQuery() {
		return (EAttribute)excelUpdaterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExcelUpdater_Workbook() {
		return (EAttribute)excelUpdaterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExcelUpdater_Dc() {
		return (EAttribute)excelUpdaterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExcelUpdater_PosFilter() {
		return (EAttribute)excelUpdaterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExcelUpdater_ListFilter() {
		return (EAttribute)excelUpdaterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExcelUpdater_Domain() {
		return (EReference)excelUpdaterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelUpdater__ExcelUpdater__String() {
		return excelUpdaterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelUpdater__ReadFile() {
		return excelUpdaterEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelUpdater__SaveExcel() {
		return excelUpdaterEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelUpdater__ExecuteQuery() {
		return excelUpdaterEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelUpdater__ReadSheetQuery() {
		return excelUpdaterEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelUpdater__CreateCoordinate__int_int() {
		return excelUpdaterEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExcelUpdater__Refresh() {
		return excelUpdaterEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorsFactory getGeneratorsFactory() {
		return (GeneratorsFactory)getEFactoryInstance();
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
		viewModelGeneratorEClass = createEClass(VIEW_MODEL_GENERATOR);
		createEAttribute(viewModelGeneratorEClass, VIEW_MODEL_GENERATOR__MODEL_FACTORY_QM);
		createEAttribute(viewModelGeneratorEClass, VIEW_MODEL_GENERATOR__PROJECTION);
		createEAttribute(viewModelGeneratorEClass, VIEW_MODEL_GENERATOR__VIEW_MODEL);
		createEReference(viewModelGeneratorEClass, VIEW_MODEL_GENERATOR__THE_DOMAIN);
		createEOperation(viewModelGeneratorEClass, VIEW_MODEL_GENERATOR___VIEW_MODEL_GENERATOR__MODELFACTORY);
		createEOperation(viewModelGeneratorEClass, VIEW_MODEL_GENERATOR___GENERATE_VIEW_MODEL);
		createEOperation(viewModelGeneratorEClass, VIEW_MODEL_GENERATOR___EXPLORE_RELATIONS__ELEMENTOCONSULTA_ELEMENTOCONSULTA_INTEGER);
		createEOperation(viewModelGeneratorEClass, VIEW_MODEL_GENERATOR___CREATE_VIEW_MODEL);
		createEOperation(viewModelGeneratorEClass, VIEW_MODEL_GENERATOR___CREATE_ELEMENT__ELEMENTOCONSULTA);
		createEOperation(viewModelGeneratorEClass, VIEW_MODEL_GENERATOR___GET_PROJECTION_QM);
		createEOperation(viewModelGeneratorEClass, VIEW_MODEL_GENERATOR___GET_PARENT);

		dataformDiagramGeneratorEClass = createEClass(DATAFORM_DIAGRAM_GENERATOR);
		createEAttribute(dataformDiagramGeneratorEClass, DATAFORM_DIAGRAM_GENERATOR__MODEL_FACTORY);
		createEAttribute(dataformDiagramGeneratorEClass, DATAFORM_DIAGRAM_GENERATOR__DATAFORM_DIAGRAM);
		createEAttribute(dataformDiagramGeneratorEClass, DATAFORM_DIAGRAM_GENERATOR__INTERFACE1);
		createEReference(dataformDiagramGeneratorEClass, DATAFORM_DIAGRAM_GENERATOR__THE_DOMAIN);
		createEOperation(dataformDiagramGeneratorEClass, DATAFORM_DIAGRAM_GENERATOR___DATAFORM_DIAGRAM_GENERATOR__MODELFACTORY);
		createEOperation(dataformDiagramGeneratorEClass, DATAFORM_DIAGRAM_GENERATOR___SALVAR_DIAGRAM__DIAGRAM);
		createEOperation(dataformDiagramGeneratorEClass, DATAFORM_DIAGRAM_GENERATOR___CARGAR_DIAGRAM);
		createEOperation(dataformDiagramGeneratorEClass, DATAFORM_DIAGRAM_GENERATOR___RESET_DIAGRAM__STRING);
		createEOperation(dataformDiagramGeneratorEClass, DATAFORM_DIAGRAM_GENERATOR___GENERATE_DIAGRAM);
		createEOperation(dataformDiagramGeneratorEClass, DATAFORM_DIAGRAM_GENERATOR___CREATE_DIAGRAM);
		createEOperation(dataformDiagramGeneratorEClass, DATAFORM_DIAGRAM_GENERATOR___INIT_COMPONENTS__GRAPHICALCONTAINER_NODE);
		createEOperation(dataformDiagramGeneratorEClass, DATAFORM_DIAGRAM_GENERATOR___CREATE_BOUNDS__INT_INT_INT_INT);
		createEOperation(dataformDiagramGeneratorEClass, DATAFORM_DIAGRAM_GENERATOR___OPEN_DIAGRAM__DIAGRAM);

		dataformGeneratorEClass = createEClass(DATAFORM_GENERATOR);
		createEAttribute(dataformGeneratorEClass, DATAFORM_GENERATOR__MODEL_FACTORY);
		createEAttribute(dataformGeneratorEClass, DATAFORM_GENERATOR__PROJECT);
		createEAttribute(dataformGeneratorEClass, DATAFORM_GENERATOR__DATAFORM_DIAGRAM);
		createEAttribute(dataformGeneratorEClass, DATAFORM_GENERATOR__DOMAIN_DIAGRAM);
		createEAttribute(dataformGeneratorEClass, DATAFORM_GENERATOR__DOMAIN_CLASS);
		createEAttribute(dataformGeneratorEClass, DATAFORM_GENERATOR__INTERFACE1);
		createEAttribute(dataformGeneratorEClass, DATAFORM_GENERATOR__CONTAINER);
		createEAttribute(dataformGeneratorEClass, DATAFORM_GENERATOR__PATH);
		createEAttribute(dataformGeneratorEClass, DATAFORM_GENERATOR__ABSOLUTE_PATH);
		createEAttribute(dataformGeneratorEClass, DATAFORM_GENERATOR__DIMENS);
		createEAttribute(dataformGeneratorEClass, DATAFORM_GENERATOR__AMOUNT_CONTAINERS);
		createEAttribute(dataformGeneratorEClass, DATAFORM_GENERATOR__AMOUNT_TABLES);
		createEAttribute(dataformGeneratorEClass, DATAFORM_GENERATOR__RELATIVE_X);
		createEAttribute(dataformGeneratorEClass, DATAFORM_GENERATOR__RELATIVE_Y);
		createEAttribute(dataformGeneratorEClass, DATAFORM_GENERATOR__DATA_START_ROW);
		createEAttribute(dataformGeneratorEClass, DATAFORM_GENERATOR__DATA_START_CELL);
		createEAttribute(dataformGeneratorEClass, DATAFORM_GENERATOR__AMOUNT_COMBOS);
		createEAttribute(dataformGeneratorEClass, DATAFORM_GENERATOR__REPORT_NAME);
		createEAttribute(dataformGeneratorEClass, DATAFORM_GENERATOR__CONTAINER_END_ROW);
		createEAttribute(dataformGeneratorEClass, DATAFORM_GENERATOR__CONTAINER_END_CELL);
		createEAttribute(dataformGeneratorEClass, DATAFORM_GENERATOR__WORKBOOK);
		createEAttribute(dataformGeneratorEClass, DATAFORM_GENERATOR__SHEET);
		createEAttribute(dataformGeneratorEClass, DATAFORM_GENERATOR__ADJACENCIES_X);
		createEAttribute(dataformGeneratorEClass, DATAFORM_GENERATOR__ADJACENCIES_Y);
		createEAttribute(dataformGeneratorEClass, DATAFORM_GENERATOR__VISITED_CELLS);
		createEAttribute(dataformGeneratorEClass, DATAFORM_GENERATOR__COMBO_NAMES_SORTED);
		createEAttribute(dataformGeneratorEClass, DATAFORM_GENERATOR__COORDENADAS_COMBO_BOX);
		createEAttribute(dataformGeneratorEClass, DATAFORM_GENERATOR__LIST_TABLES);
		createEAttribute(dataformGeneratorEClass, DATAFORM_GENERATOR__LIST_COMBO_BOX);
		createEAttribute(dataformGeneratorEClass, DATAFORM_GENERATOR__LIST_COMBO_CORDINATE);
		createEAttribute(dataformGeneratorEClass, DATAFORM_GENERATOR__MERGED_REGIONS);
		createEAttribute(dataformGeneratorEClass, DATAFORM_GENERATOR__COORDENADAS_INICIO_CONTENEDORES);
		createEAttribute(dataformGeneratorEClass, DATAFORM_GENERATOR__COORDENADAS_FIN_CONTENEDORES);
		createEAttribute(dataformGeneratorEClass, DATAFORM_GENERATOR__CONTAINERS);
		createEReference(dataformGeneratorEClass, DATAFORM_GENERATOR__THE_DOMAIN);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___DATAFORM_GENERATOR__STRING_STRING);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___GENERATE);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___SEARCH_BEGIN);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___SET_BOUNDS_GRAPHICAL_CONTAINER__GRAPHICALCONTAINER_INT_INT_INT_INT);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___SET_ATRIBUTES_CONTAIMENT_RELATION__CONTAINMENT_STRING);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___INIT);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___RESET_DATAFORM);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___GET_ORDER_VIEW_MODEL);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___GET_EXTRA_INFORMATION);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___IDENTIFY_MERGED_REGIONS);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___SEARCH_MERGE_REGION__MERGEDREGION_INT);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___EXPLORE_MERGED_REGIONS__MERGEDREGION);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___VISIT_TABLE__MERGEDREGION);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___GET_TABLE_COLUMNS__MERGEDREGION_INT);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___CREATE_TABLE__MERGEDREGION_ARRAYLIST);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___IS_TABLE_COLUMN__MERGEDREGION);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___IS_TABLE__INT_INT);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___VISIT_REGION__MERGEDREGION);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___INIT_MERGED_REGIONS__LIST);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___IS_CELL_RANGE__INT_INT);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___GET_DIMENTION);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___GET_NUMBER_TABLES);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___GET_TABLES);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___SALVAR_DF);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___GET_XML__STRING);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___MARCAR_TABLAS__ARRAYLIST);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___RE_ORGANIZAR_TABLAS);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___GET_MAX_X__ARRAYLIST);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___IS_VALID__INT_INT);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___BFS__INT_INT);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___RECORRER_HOJA);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___CREATE_CONTAINER__INT_INT);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___GET_AMOUNT_CONTAINERS_V__INT);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___CALCULATE_V__INT);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___CALCULATE_H__INT);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___GET_AMOUNT_CONTAINERS_H__INT);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___CAPTURAR_NUMEROS__STRING);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___GET_COORDINATES__STRING);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___GET_SIZES__STRING_STRING);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___STRACT_COLUMN__STRING);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___GET_SIZES2__STRING_STRING);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___GET_COORDINATES2__STRING);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___TO_INT__STRING);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___POW__INT_INT);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___GET_CELL_VALUE__XSSFCELL);
		createEOperation(dataformGeneratorEClass, DATAFORM_GENERATOR___CREATE_COORDINATE__INT_INT);

		excelGeneratorEClass = createEClass(EXCEL_GENERATOR);
		createEAttribute(excelGeneratorEClass, EXCEL_GENERATOR__ABSOLUTE_PATH);
		createEAttribute(excelGeneratorEClass, EXCEL_GENERATOR__WORKBOOK);
		createEAttribute(excelGeneratorEClass, EXCEL_GENERATOR__NEW_DATA_SHEET);
		createEAttribute(excelGeneratorEClass, EXCEL_GENERATOR__DATA_SHEET);
		createEAttribute(excelGeneratorEClass, EXCEL_GENERATOR__COLUMN_SHEET);
		createEAttribute(excelGeneratorEClass, EXCEL_GENERATOR__SHEET);
		createEAttribute(excelGeneratorEClass, EXCEL_GENERATOR__QUERY_STRING);
		createEAttribute(excelGeneratorEClass, EXCEL_GENERATOR__MODEL_FACTORY_QM);
		createEAttribute(excelGeneratorEClass, EXCEL_GENERATOR__RESULT_SET);
		createEAttribute(excelGeneratorEClass, EXCEL_GENERATOR__NAMES_FILTERS);
		createEAttribute(excelGeneratorEClass, EXCEL_GENERATOR__POS_FILTERS);
		createEAttribute(excelGeneratorEClass, EXCEL_GENERATOR__TITLES_MAP);
		createEAttribute(excelGeneratorEClass, EXCEL_GENERATOR__SET_RESULT);
		createEAttribute(excelGeneratorEClass, EXCEL_GENERATOR__LIST_FIXED);
		createEAttribute(excelGeneratorEClass, EXCEL_GENERATOR__RESULT);
		createEAttribute(excelGeneratorEClass, EXCEL_GENERATOR__TUPLES_LIST);
		createEAttribute(excelGeneratorEClass, EXCEL_GENERATOR__COLUMNS);
		createEAttribute(excelGeneratorEClass, EXCEL_GENERATOR__COLUMNS_NAMES);
		createEAttribute(excelGeneratorEClass, EXCEL_GENERATOR__COLUMNS_INDEX);
		createEAttribute(excelGeneratorEClass, EXCEL_GENERATOR__ACC);
		createEAttribute(excelGeneratorEClass, EXCEL_GENERATOR__FIRST_ROW_FILTER);
		createEAttribute(excelGeneratorEClass, EXCEL_GENERATOR__POS_ROW_INI_DATA);
		createEAttribute(excelGeneratorEClass, EXCEL_GENERATOR__POS_CELL_INI_DATA);
		createEReference(excelGeneratorEClass, EXCEL_GENERATOR__THE_DOMAIN);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___EXCEL_GENERATOR__STRING_ARRAYLIST_ARRAYLIST_MODELFACTORY_INT_INT_STRING);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___EXCEL_GENERATOR__STRING_ARRAYLIST_ARRAYLIST);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___CREATE_RELATIONS);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___INIT);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___INIT_DATA_SHEET__ARRAYLIST);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___WRITE_FILE_COLUMNS__RESULTSET);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___CREATE_TABLE__ARRAYLIST_INT_XSSFSHEET);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___CREATE_DATA_SHEET__RESULTSET);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___EXPLORE_RESULT__ELIST_STRING);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___EXECUTE__ARRAYLIST_HASHMAP_INT_INT_INT);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___READ_FILE);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___SAVE_EXCEL);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___CREATE_NAMES);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___READ_SHEET);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___GET_NUM_TO_COL__INT);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___GET_RESUL_SET__XSSFSHEET);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___GET_SET_COLUM__ARRAYLIST_INT);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___GET_MAP_OF_COLUMN_BY_COLUMN__ARRAYLIST_INT_INT);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___CREATE_LIST_BOX__ARRAYLIST_XSSFSHEET_INT_INT);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___BUILD_DATA_SHEET__XSSFSHEET_HASHMAP_INT);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___SET_INDIRECT);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___DELETE_NAMES__XSSFWORKBOOK);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___NAME_TABLE_TO_NAME_RANGE__XSSFSHEET_ARRAYLIST);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___COUNT_FORMULA__INT_INT);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___THE_FORMULA__INT_INT_INT_INT_INTEGER_INT_INT);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___CREATE_DEPENDENCE__ARRAYLIST_HASHMAP_ARRAYLIST);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___GET_TITLES__ARRAYLIST);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___REMOVE_DUPLICATE_VALUES__ARRAYLIST);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___GET_ATRIBUTTES__RESULTELEMENT);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___CREATE_SHEET_QUERY);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___REMOVE_SHEETS);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___COPY_EXCEL__STRING_STRING);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___OPEN_FILE_INTO_EDITOR__STRING);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___GET_DIR__STRING);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___GET_CELL_VALUE__XSSFCELL);
		createEOperation(excelGeneratorEClass, EXCEL_GENERATOR___GET_ARRAY_LIST_FROM_SET__SET);

		excelUpdaterEClass = createEClass(EXCEL_UPDATER);
		createEAttribute(excelUpdaterEClass, EXCEL_UPDATER__FILE_PATH);
		createEAttribute(excelUpdaterEClass, EXCEL_UPDATER__STRING_QUERY);
		createEAttribute(excelUpdaterEClass, EXCEL_UPDATER__WORKBOOK);
		createEAttribute(excelUpdaterEClass, EXCEL_UPDATER__DC);
		createEAttribute(excelUpdaterEClass, EXCEL_UPDATER__POS_FILTER);
		createEAttribute(excelUpdaterEClass, EXCEL_UPDATER__LIST_FILTER);
		createEReference(excelUpdaterEClass, EXCEL_UPDATER__DOMAIN);
		createEOperation(excelUpdaterEClass, EXCEL_UPDATER___EXCEL_UPDATER__STRING);
		createEOperation(excelUpdaterEClass, EXCEL_UPDATER___READ_FILE);
		createEOperation(excelUpdaterEClass, EXCEL_UPDATER___SAVE_EXCEL);
		createEOperation(excelUpdaterEClass, EXCEL_UPDATER___EXECUTE_QUERY);
		createEOperation(excelUpdaterEClass, EXCEL_UPDATER___READ_SHEET_QUERY);
		createEOperation(excelUpdaterEClass, EXCEL_UPDATER___CREATE_COORDINATE__INT_INT);
		createEOperation(excelUpdaterEClass, EXCEL_UPDATER___REFRESH);
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
		DatatypesqmPackage theDatatypesqmPackage = (DatatypesqmPackage)EPackage.Registry.INSTANCE.getEPackage(DatatypesqmPackage.eNS_URI);
		DomainPackage theDomainPackage = (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);
		DatatypesdataformPackage theDatatypesdataformPackage = (DatatypesdataformPackage)EPackage.Registry.INSTANCE.getEPackage(DatatypesdataformPackage.eNS_URI);
		DatatypesgmfPackage theDatatypesgmfPackage = (DatatypesgmfPackage)EPackage.Registry.INSTANCE.getEPackage(DatatypesgmfPackage.eNS_URI);
		DatatypeapachepoiPackage theDatatypeapachepoiPackage = (DatatypeapachepoiPackage)EPackage.Registry.INSTANCE.getEPackage(DatatypeapachepoiPackage.eNS_URI);
		DatatypesjavautilPackage theDatatypesjavautilPackage = (DatatypesjavautilPackage)EPackage.Registry.INSTANCE.getEPackage(DatatypesjavautilPackage.eNS_URI);
		UtilPackage theUtilPackage = (UtilPackage)EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);
		DatatypesPackage theDatatypesPackage = (DatatypesPackage)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(viewModelGeneratorEClass, ViewModelGenerator.class, "ViewModelGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewModelGenerator_ModelFactoryQM(), theDatatypesqmPackage.getModelFactory(), "modelFactoryQM", null, 0, 1, ViewModelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewModelGenerator_Projection(), theDatatypesqmPackage.getProyeccion(), "projection", null, 0, 1, ViewModelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewModelGenerator_ViewModel(), theDatatypesqmPackage.getEADiagram(), "viewModel", null, 0, 1, ViewModelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewModelGenerator_TheDomain(), theDomainPackage.getDomain(), theDomainPackage.getDomain_TheViewModelGenerator(), "theDomain", null, 0, 1, ViewModelGenerator.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getViewModelGenerator__ViewModelGenerator__ModelFactory(), null, "ViewModelGenerator", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesqmPackage.getModelFactory(), "modelFactoryQM", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getViewModelGenerator__GenerateViewModel(), null, "generateViewModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getViewModelGenerator__ExploreRelations__ElementoConsulta_ElementoConsulta_Integer(), null, "exploreRelations", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesqmPackage.getElementoConsulta(), "parent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesqmPackage.getElementoConsulta(), "parentViewModel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "order", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getViewModelGenerator__CreateViewModel(), null, "createViewModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getViewModelGenerator__CreateElement__ElementoConsulta(), theDatatypesqmPackage.getElementoConsulta(), "createElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesqmPackage.getElementoConsulta(), "e", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getViewModelGenerator__GetProjectionQM(), null, "getProjectionQM", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getViewModelGenerator__GetParent(), theDatatypesqmPackage.getElementoConsulta(), "getParent", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataformDiagramGeneratorEClass, DataformDiagramGenerator.class, "DataformDiagramGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataformDiagramGenerator_ModelFactory(), theDatatypesdataformPackage.getModelFactory(), "modelFactory", null, 0, 1, DataformDiagramGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataformDiagramGenerator_DataformDiagram(), theDatatypesdataformPackage.getDataForm_Diagram(), "dataformDiagram", null, 0, 1, DataformDiagramGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataformDiagramGenerator_Interface1(), theDatatypesdataformPackage.getInterface(), "interface1", null, 0, 1, DataformDiagramGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataformDiagramGenerator_TheDomain(), theDomainPackage.getDomain(), theDomainPackage.getDomain_TheDataformDiagramGenerator(), "theDomain", null, 0, 1, DataformDiagramGenerator.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDataformDiagramGenerator__DataformDiagramGenerator__ModelFactory(), null, "DataformDiagramGenerator", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesdataformPackage.getModelFactory(), "modelFactory", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataformDiagramGenerator__SalvarDiagram__Diagram(), null, "salvarDiagram", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesgmfPackage.getDiagram(), "diagram", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataformDiagramGenerator__CargarDiagram(), null, "cargarDiagram", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataformDiagramGenerator__ResetDiagram__String(), null, "resetDiagram", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "path", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataformDiagramGenerator__GenerateDiagram(), null, "generateDiagram", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataformDiagramGenerator__CreateDiagram(), theDatatypesgmfPackage.getDiagram(), "createDiagram", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataformDiagramGenerator__InitComponents__GraphicalContainer_Node(), null, "initComponents", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesdataformPackage.getGraphicalContainer(), "graphicalContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesgmfPackage.getNode(), "parent", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataformDiagramGenerator__CreateBounds__int_int_int_int(), theDatatypesgmfPackage.getBounds(), "createBounds", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "y", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "width", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "height", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataformDiagramGenerator__OpenDiagram__Diagram(), null, "openDiagram", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesgmfPackage.getDiagram(), "diag", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataformGeneratorEClass, DataformGenerator.class, "DataformGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataformGenerator_ModelFactory(), theDatatypesdataformPackage.getModelFactory(), "modelFactory", null, 0, 1, DataformGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataformGenerator_Project(), theDatatypesdataformPackage.getProject(), "project", null, 0, 1, DataformGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataformGenerator_DataformDiagram(), theDatatypesdataformPackage.getDataForm_Diagram(), "dataformDiagram", null, 0, 1, DataformGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataformGenerator_DomainDiagram(), theDatatypesdataformPackage.getDomain_Diagram(), "domainDiagram", null, 0, 1, DataformGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataformGenerator_DomainClass(), theDatatypesdataformPackage.getClase(), "domainClass", null, 0, 1, DataformGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataformGenerator_Interface1(), theDatatypesdataformPackage.getInterface(), "interface1", null, 0, 1, DataformGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataformGenerator_Container(), theDatatypesdataformPackage.getContainer(), "container", null, 0, 1, DataformGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataformGenerator_Path(), ecorePackage.getEString(), "path", null, 0, 1, DataformGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataformGenerator_AbsolutePath(), ecorePackage.getEString(), "absolutePath", null, 0, 1, DataformGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataformGenerator_Dimens(), ecorePackage.getEString(), "dimens", null, 0, 1, DataformGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataformGenerator_AmountContainers(), ecorePackage.getEInt(), "amountContainers", null, 0, 1, DataformGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataformGenerator_AmountTables(), ecorePackage.getEInt(), "amountTables", null, 0, 1, DataformGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataformGenerator_RelativeX(), ecorePackage.getEInt(), "relativeX", null, 0, 1, DataformGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataformGenerator_RelativeY(), ecorePackage.getEInt(), "relativeY", null, 0, 1, DataformGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataformGenerator_DataStartRow(), ecorePackage.getEInt(), "dataStartRow", null, 0, 1, DataformGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataformGenerator_DataStartCell(), ecorePackage.getEInt(), "dataStartCell", null, 0, 1, DataformGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataformGenerator_AmountCombos(), ecorePackage.getEInt(), "amountCombos", null, 0, 1, DataformGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataformGenerator_ReportName(), ecorePackage.getEString(), "reportName", null, 0, 1, DataformGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataformGenerator_ContainerEndRow(), ecorePackage.getEInt(), "containerEndRow", null, 0, 1, DataformGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataformGenerator_ContainerEndCell(), ecorePackage.getEInt(), "containerEndCell", null, 0, 1, DataformGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataformGenerator_Workbook(), theDatatypeapachepoiPackage.getXSSFWorkbook(), "workbook", null, 0, 1, DataformGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataformGenerator_Sheet(), theDatatypeapachepoiPackage.getXSSFSheet(), "sheet", null, 0, 1, DataformGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataformGenerator_AdjacenciesX(), theDatatypesjavautilPackage.getArrayList(), "adjacenciesX", null, 0, 1, DataformGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataformGenerator_AdjacenciesY(), theDatatypesjavautilPackage.getArrayList(), "adjacenciesY", null, 0, 1, DataformGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataformGenerator_VisitedCells(), theDatatypesjavautilPackage.getArrayList(), "visitedCells", null, 0, 1, DataformGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataformGenerator_ComboNamesSorted(), theDatatypesjavautilPackage.getArrayList(), "comboNamesSorted", null, 0, 1, DataformGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataformGenerator_CoordenadasComboBox(), theDatatypesjavautilPackage.getArrayList(), "coordenadasComboBox", null, 0, 1, DataformGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataformGenerator_ListTables(), theDatatypesjavautilPackage.getArrayList(), "listTables", null, 0, 1, DataformGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataformGenerator_ListComboBox(), theDatatypesjavautilPackage.getArrayList(), "listComboBox", null, 0, 1, DataformGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataformGenerator_ListComboCordinate(), theDatatypesjavautilPackage.getArrayList(), "listComboCordinate", null, 0, 1, DataformGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataformGenerator_MergedRegions(), theDatatypesjavautilPackage.getArrayList(), "mergedRegions", null, 0, 1, DataformGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataformGenerator_CoordenadasInicioContenedores(), theDatatypesjavautilPackage.getArrayList(), "coordenadasInicioContenedores", null, 0, 1, DataformGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataformGenerator_CoordenadasFinContenedores(), theDatatypesjavautilPackage.getArrayList(), "coordenadasFinContenedores", null, 0, 1, DataformGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataformGenerator_Containers(), theDatatypesjavautilPackage.getArrayList(), "containers", null, 0, 1, DataformGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataformGenerator_TheDomain(), theDomainPackage.getDomain(), theDomainPackage.getDomain_TheDataformGenerator(), "theDomain", null, 0, 1, DataformGenerator.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDataformGenerator__DataformGenerator__String_String(), null, "DataformGenerator", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ruta", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "as", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataformGenerator__Generate(), null, "generate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataformGenerator__SearchBegin(), null, "searchBegin", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataformGenerator__SetBoundsGraphicalContainer__GraphicalContainer_int_int_int_int(), null, "setBoundsGraphicalContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesdataformPackage.getGraphicalContainer(), "graphicalContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "y", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "width", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "height", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataformGenerator__SetAtributesContaimentRelation__Containment_String(), null, "setAtributesContaimentRelation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesdataformPackage.getContainment(), "c", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataformGenerator__Init(), null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataformGenerator__ResetDataform(), null, "resetDataform", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataformGenerator__GetOrderViewModel(), null, "getOrderViewModel", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataformGenerator__GetExtraInformation(), null, "getExtraInformation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataformGenerator__IdentifyMergedRegions(), null, "identifyMergedRegions", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataformGenerator__SearchMergeRegion__MergedRegion_int(), ecorePackage.getEBoolean(), "searchMergeRegion", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getMergedRegion(), "range", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "nextRow", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataformGenerator__ExploreMergedRegions__MergedRegion(), theDatatypesdataformPackage.getGraphicalContainer(), "exploreMergedRegions", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getMergedRegion(), "range", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataformGenerator__VisitTable__MergedRegion(), ecorePackage.getEInt(), "visitTable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getMergedRegion(), "region", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataformGenerator__GetTableColumns__MergedRegion_int(), theDatatypesjavautilPackage.getArrayList(), "getTableColumns", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getMergedRegion(), "region", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "nextRow", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataformGenerator__CreateTable__MergedRegion_ArrayList(), theDatatypesqmPackage.getTableView(), "createTable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getMergedRegion(), "region", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesjavautilPackage.getArrayList(), "columns", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataformGenerator__IsTableColumn__MergedRegion(), ecorePackage.getEBoolean(), "isTableColumn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getMergedRegion(), "mergeRegion", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataformGenerator__IsTable__int_int(), ecorePackage.getEBoolean(), "isTable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "i", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "j", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataformGenerator__VisitRegion__MergedRegion(), null, "visitRegion", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUtilPackage.getMergedRegion(), "mergeRegion", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataformGenerator__InitMergedRegions__List(), null, "InitMergedRegions", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesjavautilPackage.getList(), "sortedRegions", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataformGenerator__IsCellRange__int_int(), ecorePackage.getEBoolean(), "isCellRange", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "i", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "l", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataformGenerator__GetDimention(), ecorePackage.getEString(), "getDimention", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataformGenerator__GetNumberTables(), ecorePackage.getEInt(), "getNumberTables", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataformGenerator__GetTables(), null, "getTables", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataformGenerator__SalvarDF(), null, "salvarDF", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataformGenerator__GetXML__String(), theDatatypesPackage.getDocument(), "getXML", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "url", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataformGenerator__MarcarTablas__ArrayList(), null, "marcarTablas", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesjavautilPackage.getArrayList(), "sizes", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataformGenerator__ReOrganizarTablas(), null, "reOrganizarTablas", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataformGenerator__GetMaxX__ArrayList(), ecorePackage.getEInt(), "getMaxX", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesjavautilPackage.getArrayList(), "a", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataformGenerator__IsValid__int_int(), ecorePackage.getEBoolean(), "isValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "i", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "j", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataformGenerator__Bfs__int_int(), theDatatypesjavautilPackage.getArrayList(), "bfs", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "i", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "j", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataformGenerator__RecorrerHoja(), null, "recorrerHoja", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataformGenerator__CreateContainer__int_int(), theDatatypesdataformPackage.getContainer(), "createContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "i", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "j", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataformGenerator__GetAmountContainersV__int(), ecorePackage.getEInt(), "getAmountContainersV", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "y", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataformGenerator__CalculateV__int(), ecorePackage.getEInt(), "calculateV", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "y", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataformGenerator__CalculateH__int(), ecorePackage.getEInt(), "calculateH", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataformGenerator__GetAmountContainersH__int(), ecorePackage.getEInt(), "getAmountContainersH", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataformGenerator__CapturarNumeros__String(), ecorePackage.getEString(), "capturarNumeros", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "s", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataformGenerator__GetCoordinates__String(), theUtilPackage.getCoordinate(), "getCoordinates", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "inicio", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataformGenerator__GetSizes__String_String(), theUtilPackage.getCoordinate(), "getSizes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "inicio", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fin", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataformGenerator__StractColumn__String(), ecorePackage.getEString(), "stractColumn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "s", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataformGenerator__GetSizes2__String_String(), theUtilPackage.getCoordinate(), "getSizes2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "inicio", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fin", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataformGenerator__GetCoordinates2__String(), theUtilPackage.getCoordinate(), "getCoordinates2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "inicio", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataformGenerator__ToInt__String(), ecorePackage.getEInt(), "toInt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "s", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataformGenerator__Pow__int_int(), ecorePackage.getEInt(), "pow", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "b", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "e", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataformGenerator__GetCellValue__XSSFCell(), ecorePackage.getEString(), "getCellValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypeapachepoiPackage.getXSSFCell(), "cell", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataformGenerator__CreateCoordinate__int_int(), theUtilPackage.getCoordinate(), "createCoordinate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "y", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(excelGeneratorEClass, ExcelGenerator.class, "ExcelGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExcelGenerator_AbsolutePath(), ecorePackage.getEString(), "absolutePath", null, 0, 1, ExcelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExcelGenerator_Workbook(), theDatatypeapachepoiPackage.getXSSFWorkbook(), "workbook", null, 0, 1, ExcelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExcelGenerator_NewDataSheet(), theDatatypeapachepoiPackage.getXSSFSheet(), "newDataSheet", null, 0, 1, ExcelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExcelGenerator_DataSheet(), theDatatypeapachepoiPackage.getXSSFSheet(), "dataSheet", null, 0, 1, ExcelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExcelGenerator_ColumnSheet(), theDatatypeapachepoiPackage.getXSSFSheet(), "columnSheet", null, 0, 1, ExcelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExcelGenerator_Sheet(), theDatatypeapachepoiPackage.getXSSFSheet(), "sheet", null, 0, 1, ExcelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExcelGenerator_QueryString(), ecorePackage.getEString(), "queryString", null, 0, 1, ExcelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExcelGenerator_ModelFactoryQM(), theDatatypesqmPackage.getModelFactory(), "modelFactoryQM", null, 0, 1, ExcelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExcelGenerator_ResultSet(), theDatatypesjavautilPackage.getArrayList(), "resultSet", null, 0, 1, ExcelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExcelGenerator_NamesFilters(), theDatatypesjavautilPackage.getArrayList(), "namesFilters", null, 0, 1, ExcelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExcelGenerator_PosFilters(), theDatatypesjavautilPackage.getArrayList(), "posFilters", null, 0, 1, ExcelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExcelGenerator_TitlesMap(), theDatatypesjavautilPackage.getHashMapStringElementoConsulta(), "titlesMap", null, 0, 1, ExcelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExcelGenerator_SetResult(), theDatatypesjavautilPackage.getArrayList(), "setResult", null, 0, 1, ExcelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExcelGenerator_ListFixed(), theDatatypesjavautilPackage.getArrayList(), "listFixed", null, 0, 1, ExcelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExcelGenerator_Result(), theDatatypesqmPackage.getResultado(), "result", null, 0, 1, ExcelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExcelGenerator_TuplesList(), theDatatypesjavautilPackage.getArrayList(), "tuplesList", null, 0, 1, ExcelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExcelGenerator_Columns(), theDatatypesjavautilPackage.getArrayList(), "columns", null, 0, 1, ExcelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExcelGenerator_ColumnsNames(), theDatatypesjavautilPackage.getArrayList(), "columnsNames", null, 0, 1, ExcelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExcelGenerator_ColumnsIndex(), theDatatypesjavautilPackage.getArrayList(), "columnsIndex", null, 0, 1, ExcelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExcelGenerator_Acc(), ecorePackage.getEInt(), "acc", null, 0, 1, ExcelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExcelGenerator_FirstRowFilter(), ecorePackage.getEInt(), "firstRowFilter", null, 0, 1, ExcelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExcelGenerator_PosRowIniData(), ecorePackage.getEInt(), "posRowIniData", null, 0, 1, ExcelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExcelGenerator_PosCellIniData(), ecorePackage.getEInt(), "posCellIniData", null, 0, 1, ExcelGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExcelGenerator_TheDomain(), theDomainPackage.getDomain(), theDomainPackage.getDomain_TheExcelGenerator(), "theDomain", null, 0, 1, ExcelGenerator.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getExcelGenerator__ExcelGenerator__String_ArrayList_ArrayList_ModelFactory_int_int_String(), null, "ExcelGenerator", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "absolutePath", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesjavautilPackage.getArrayList(), "listFilter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesjavautilPackage.getArrayList(), "posFilters", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesqmPackage.getModelFactory(), "modelFactoryQM", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "posRowIniData", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "posCellIniData", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "queryString", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__ExcelGenerator__String_ArrayList_ArrayList(), null, "ExcelGenerator", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "absolutePath", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesjavautilPackage.getArrayList(), "listFilter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesjavautilPackage.getArrayList(), "posFilters", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getExcelGenerator__CreateRelations(), null, "createRelations", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getExcelGenerator__Init(), null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__InitDataSheet__ArrayList(), null, "initDataSheet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesjavautilPackage.getArrayList(), "indexColum", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__WriteFileColumns__ResultSet(), null, "writeFileColumns", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getResultSet(), "rs", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__CreateTable__ArrayList_int_XSSFSheet(), null, "createTable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesjavautilPackage.getArrayList(), "columns", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "size", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypeapachepoiPackage.getXSSFSheet(), "sheet", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__CreateDataSheet__ResultSet(), null, "createDataSheet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getResultSet(), "resultSet", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__ExploreResult__EList_String(), null, "exploreResult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesPackage.getEList(), "elementResultList", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "tuple", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__Execute__ArrayList_HashMap_int_int_int(), null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesjavautilPackage.getArrayList(), "listFilter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesjavautilPackage.getHashMapStringElementoConsulta(), "titlesMap", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "acc", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "posRowIniData", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "posCellIniData", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getExcelGenerator__ReadFile(), theDatatypeapachepoiPackage.getXSSFWorkbook(), "readFile", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getExcelGenerator__SaveExcel(), null, "saveExcel", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getExcelGenerator__CreateNames(), null, "createNames", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getExcelGenerator__ReadSheet(), null, "readSheet", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__GetNumToCol__int(), ecorePackage.getEString(), "getNumToCol", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "col", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__GetResulSet__XSSFSheet(), theDatatypesjavautilPackage.getArrayList(), "getResulSet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypeapachepoiPackage.getXSSFSheet(), "sheet", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__GetSetColum__ArrayList_int(), theDatatypesjavautilPackage.getSet(), "getSetColum", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesjavautilPackage.getArrayList(), "resultSet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "column", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__GetMapOfColumnByColumn__ArrayList_int_int(), theDatatypesjavautilPackage.getHashMapStringElementoConsulta(), "getMapOfColumnByColumn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesjavautilPackage.getArrayList(), "resultSet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "columnSource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "columnTarget", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__CreateListBox__ArrayList_XSSFSheet_int_int(), null, "createListBox", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesjavautilPackage.getArrayList(), "comboNames", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypeapachepoiPackage.getXSSFSheet(), "sheet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "row", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "col", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__BuildDataSheet__XSSFSheet_HashMap_int(), null, "buildDataSheet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypeapachepoiPackage.getXSSFSheet(), "sheet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesjavautilPackage.getHashMapStringElementoConsulta(), "mp", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "rowN", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getExcelGenerator__SetIndirect(), null, "setIndirect", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__DeleteNames__XSSFWorkbook(), null, "deleteNames", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypeapachepoiPackage.getXSSFWorkbook(), "workbook", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__NameTableToNameRange__XSSFSheet_ArrayList(), null, "nameTableToNameRange", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypeapachepoiPackage.getXSSFSheet(), "sheet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesjavautilPackage.getArrayList(), "names", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__CountFormula__int_int(), null, "countFormula", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "targetRow", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "targetCell", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__TheFormula__int_int_int_int_Integer_int_int(), null, "theFormula", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "targetRow", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "targetCell", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "countRow", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "countCell", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "firstCellFilter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "sizeX", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "sizeY", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__CreateDependence__ArrayList_HashMap_ArrayList(), theDatatypesjavautilPackage.getArrayList(), "createDependence", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesjavautilPackage.getArrayList(), "resultSet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesjavautilPackage.getHashMapStringElementoConsulta(), "titlesMap", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesjavautilPackage.getArrayList(), "listFilter", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__GetTitles__ArrayList(), theDatatypesjavautilPackage.getHashMapStringElementoConsulta(), "getTitles", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesjavautilPackage.getArrayList(), "resultSet", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__RemoveDuplicateValues__ArrayList(), theDatatypesjavautilPackage.getArrayList(), "removeDuplicateValues", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesjavautilPackage.getArrayList(), "resultSet", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__GetAtributtes__ResultElement(), ecorePackage.getEString(), "getAtributtes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesqmPackage.getResultElement(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getExcelGenerator__CreateSheetQuery(), null, "createSheetQuery", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getExcelGenerator__RemoveSheets(), null, "removeSheets", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__CopyExcel__String_String(), null, "copyExcel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sourcePath", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "targetPath", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__OpenFileIntoEditor__String(), null, "openFileIntoEditor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "path", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__GetDir__String(), ecorePackage.getEString(), "getDir", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "absolutePath", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__GetCellValue__XSSFCell(), ecorePackage.getEString(), "getCellValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypeapachepoiPackage.getXSSFCell(), "cell", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelGenerator__GetArrayListFromSet__Set(), theDatatypesjavautilPackage.getArrayList(), "getArrayListFromSet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDatatypesjavautilPackage.getSet(), "s", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(excelUpdaterEClass, ExcelUpdater.class, "ExcelUpdater", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExcelUpdater_FilePath(), ecorePackage.getEString(), "filePath", null, 0, 1, ExcelUpdater.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExcelUpdater_StringQuery(), ecorePackage.getEString(), "stringQuery", null, 0, 1, ExcelUpdater.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExcelUpdater_Workbook(), theDatatypeapachepoiPackage.getXSSFWorkbook(), "workbook", null, 0, 1, ExcelUpdater.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExcelUpdater_Dc(), theDatatypesqmPackage.getDataConnection(), "dc", null, 0, 1, ExcelUpdater.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExcelUpdater_PosFilter(), theDatatypesjavautilPackage.getArrayList(), "posFilter", null, 0, 1, ExcelUpdater.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExcelUpdater_ListFilter(), theDatatypesjavautilPackage.getArrayList(), "listFilter", null, 0, 1, ExcelUpdater.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExcelUpdater_Domain(), theDomainPackage.getDomain(), theDomainPackage.getDomain_TheExcelUpdater(), "Domain", null, 0, 1, ExcelUpdater.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getExcelUpdater__ExcelUpdater__String(), null, "ExcelUpdater", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filePath", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getExcelUpdater__ReadFile(), theDatatypeapachepoiPackage.getXSSFWorkbook(), "readFile", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getExcelUpdater__SaveExcel(), null, "saveExcel", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getExcelUpdater__ExecuteQuery(), null, "executeQuery", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getExcelUpdater__ReadSheetQuery(), null, "readSheetQuery", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExcelUpdater__CreateCoordinate__int_int(), theUtilPackage.getCoordinate(), "createCoordinate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "y", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getExcelUpdater__Refresh(), null, "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

} //GeneratorsPackageImpl
