/**
 */
package pgr.domain.generators;

import gestionmodelosconsultas.ModelFactory;

import gestionmodelosconsultas.modeloconsultas.model.EADiagram;
import gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta;
import gestionmodelosconsultas.modeloconsultas.model.Proyeccion;

import org.eclipse.emf.ecore.EObject;

import pgr.domain.Domain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Model Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pgr.domain.generators.ViewModelGenerator#getModelFactoryQM <em>Model Factory QM</em>}</li>
 *   <li>{@link pgr.domain.generators.ViewModelGenerator#getProjection <em>Projection</em>}</li>
 *   <li>{@link pgr.domain.generators.ViewModelGenerator#getViewModel <em>View Model</em>}</li>
 *   <li>{@link pgr.domain.generators.ViewModelGenerator#getTheDomain <em>The Domain</em>}</li>
 * </ul>
 *
 * @see pgr.domain.generators.GeneratorsPackage#getViewModelGenerator()
 * @model
 * @generated
 */
public interface ViewModelGenerator extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Factory QM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Factory QM</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Factory QM</em>' attribute.
	 * @see #setModelFactoryQM(ModelFactory)
	 * @see pgr.domain.generators.GeneratorsPackage#getViewModelGenerator_ModelFactoryQM()
	 * @model dataType="pgr.datatypes.datatypesqm.ModelFactory"
	 * @generated
	 */
	ModelFactory getModelFactoryQM();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.ViewModelGenerator#getModelFactoryQM <em>Model Factory QM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Factory QM</em>' attribute.
	 * @see #getModelFactoryQM()
	 * @generated
	 */
	void setModelFactoryQM(ModelFactory value);

	/**
	 * Returns the value of the '<em><b>Projection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projection</em>' attribute.
	 * @see #setProjection(Proyeccion)
	 * @see pgr.domain.generators.GeneratorsPackage#getViewModelGenerator_Projection()
	 * @model dataType="pgr.datatypes.datatypesqm.Proyeccion"
	 * @generated
	 */
	Proyeccion getProjection();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.ViewModelGenerator#getProjection <em>Projection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Projection</em>' attribute.
	 * @see #getProjection()
	 * @generated
	 */
	void setProjection(Proyeccion value);

	/**
	 * Returns the value of the '<em><b>View Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Model</em>' attribute.
	 * @see #setViewModel(EADiagram)
	 * @see pgr.domain.generators.GeneratorsPackage#getViewModelGenerator_ViewModel()
	 * @model dataType="pgr.datatypes.datatypesqm.EADiagram"
	 * @generated
	 */
	EADiagram getViewModel();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.ViewModelGenerator#getViewModel <em>View Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Model</em>' attribute.
	 * @see #getViewModel()
	 * @generated
	 */
	void setViewModel(EADiagram value);

	/**
	 * Returns the value of the '<em><b>The Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link pgr.domain.Domain#getTheViewModelGenerator <em>The View Model Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Domain</em>' container reference.
	 * @see #setTheDomain(Domain)
	 * @see pgr.domain.generators.GeneratorsPackage#getViewModelGenerator_TheDomain()
	 * @see pgr.domain.Domain#getTheViewModelGenerator
	 * @model opposite="theViewModelGenerator"
	 * @generated
	 */
	Domain getTheDomain();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.ViewModelGenerator#getTheDomain <em>The Domain</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Domain</em>' container reference.
	 * @see #getTheDomain()
	 * @generated
	 */
	void setTheDomain(Domain value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model modelFactoryQMDataType="pgr.datatypes.datatypesqm.ModelFactory"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='this.modelFactoryQM = modelFactoryQM;\r\n\t\t\r\n\t\tgetProjectionQM();\r\n\t\tviewModel = gestionmodelosconsultas.modeloconsultas.model.ModelFactory.eINSTANCE.createViewModel();'"
	 * @generated
	 */
	void ViewModelGenerator(ModelFactory modelFactoryQM);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='createViewModel();'"
	 * @generated
	 */
	void generateViewModel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model parentDataType="pgr.datatypes.datatypesqm.ElementoConsulta" parentViewModelDataType="pgr.datatypes.datatypesqm.ElementoConsulta"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='for(int i=0;i<projection.getListRelacion().size();i++){\r\n\t\t\tgestionmodelosconsultas.modeloconsultas.model.Relacion relacion = projection.getListRelacion().get(i);\r\n\t\t\tif(relacion.getSource().equals(parent)){\r\n\t\t\t\t\r\n\t\t\t\tElementoConsulta queryElement = createElement((ElementoConsulta) relacion.getTarget());\r\n\t\t\t\tqueryElement.setOrder(order);\r\n\t\t\t\tviewModel.getListElementoConsulta().add(queryElement);\t\r\n\t\t\t\t\r\n\t\t\t\t\r\n\t\t\t\tgestionmodelosconsultas.modeloconsultas.model.Relacion relation = \r\n\t\t\t\t\t\tgestionmodelosconsultas.modeloconsultas.model.ModelFactory.eINSTANCE.createRelacion();\r\n\t\t\t\trelation.setSource(parent);\r\n\t\t\t\trelation.setTarget(queryElement);\r\n\t\t\t\tviewModel.getListRelacion().add(relation);\r\n\t\t\t\t\r\n\t\t\t\t\r\n\t\t\t\texploreRelations(relacion.getTarget(), queryElement, order+1);\r\n\t\t\t}\r\n\t\t}'"
	 * @generated
	 */
	void exploreRelations(ElementoConsulta parent, ElementoConsulta parentViewModel, Integer order);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='EList<gestionmodelosconsultas.modeloconsultas.ModeloConsulta> listQueryModel = \r\n\t\t\t\t\t\tmodelFactoryQM.getFactoryModeloConsultas().getListModeloConsulta();\r\n\t\t\t\t\r\n\t\t\t\tgestionmodelosconsultas.modeloconsultas.ModeloConsulta queryModel = listQueryModel.get(0);\r\n\t\t\t\tEList<gestionmodelosconsultas.modeloconsultas.model.EADiagram> listViewModel = queryModel.getListEADiagram();\r\n\t\t\t\t\r\n\t\t\t\tEList<gestionmodelosconsultas.modeloconsultas.model.EADiagram> newList = queryModel.createtListEADiagram();\r\n\t\t\t\t\r\n\t\t\t\tfor(int i=0;i<listViewModel.size();i++){\r\n\t\t\t\t\tif(!(listViewModel.get(i) instanceof gestionmodelosconsultas.modeloconsultas.model.ViewModel))\r\n\t\t\t\t\t\tnewList.add(listViewModel.get(i));\r\n\t\t\t\t}\r\n\t\t\t\t\r\n\t\t\t\tqueryModel.setEADiagram(newList);\r\n\t\t\t\tlistViewModel = newList;\r\n\t\t\t\t\r\n\t\t\t\tElementoConsulta root = getParent();\r\n\t\t\t\tElementoConsulta queryElement = createElement((ElementoConsulta) root);\r\n\t\t\t\tqueryElement.setOrder(1);\r\n\t\t\t\tviewModel.getListElementoConsulta().add(queryElement);\t\r\n\t\t\t\t\r\n\t\t\t\texploreRelations(root, queryElement, 2);\r\n\t\t\t\t\r\n\t\t\t\tlistViewModel.add(viewModel);\r\n\t\t\t\tmodelFactoryQM.salvar();'"
	 * @generated
	 */
	void createViewModel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="pgr.datatypes.datatypesqm.ElementoConsulta" eDataType="pgr.datatypes.datatypesqm.ElementoConsulta"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tif(e instanceof gestionmodelosconsultas.modeloconsultas.quien.impl.UnidadOrganizacionalImpl)\r\n\t\t\treturn  gestionmodelosconsultas.modeloconsultas.quien.QuienFactory.eINSTANCE.createUnidadOrganizacional();\r\n\t\r\n\t\tif(e instanceof gestionmodelosconsultas.modeloconsultas.quien.impl.ActorImpl)\r\n\t\t\treturn gestionmodelosconsultas.modeloconsultas.quien.QuienFactory.eINSTANCE.createActor();\r\n\t\r\n\t\tif(e instanceof gestionmodelosconsultas.modeloconsultas.quien.impl.RolImpl)\r\n\t\t\treturn gestionmodelosconsultas.modeloconsultas.quien.QuienFactory.eINSTANCE.createRol();\r\n\t\r\n\t\tif(e instanceof gestionmodelosconsultas.modeloconsultas.quien.impl.ContactoImpl)\r\n\t\t\treturn gestionmodelosconsultas.modeloconsultas.quien.QuienFactory.eINSTANCE.createContacto();\r\n\t\t\r\n\t\tif(e instanceof gestionmodelosconsultas.modeloconsultas.quien.impl.QuienImpl)\r\n\t\t\treturn gestionmodelosconsultas.modeloconsultas.quien.QuienFactory.eINSTANCE.createQuien();\r\n\t\t\r\n\t\tif(e instanceof gestionmodelosconsultas.modeloconsultas.que.impl.DocumentoImpl)\r\n\t\t\treturn gestionmodelosconsultas.modeloconsultas.que.QueFactory.eINSTANCE.createDocumento();\r\n\t\t\r\n\t\tif(e instanceof gestionmodelosconsultas.modeloconsultas.que.impl.ComunicacionImpl)\r\n\t\t\treturn gestionmodelosconsultas.modeloconsultas.que.QueFactory.eINSTANCE.createComunicacion();\r\n\t\r\n\t\tif(e instanceof gestionmodelosconsultas.modeloconsultas.como.impl.ActividadProcesoImpl)\r\n\t\t\treturn gestionmodelosconsultas.modeloconsultas.como.ComoFactory.eINSTANCE.createActividadProceso();\r\n\r\n\t\tif(e instanceof gestionmodelosconsultas.modeloconsultas.como.impl.InstanciaProcesoImpl)\r\n\t\t\treturn gestionmodelosconsultas.modeloconsultas.como.ComoFactory.eINSTANCE.createInstanciaProceso();\r\n\t\t\r\n\t\tif(e instanceof gestionmodelosconsultas.modeloconsultas.donde.impl.DepositoImpl)\r\n\t\treturn  gestionmodelosconsultas.modeloconsultas.donde.DondeFactory.eINSTANCE.createDeposito();\r\n\t\t\r\n\t\tif(e instanceof gestionmodelosconsultas.modeloconsultas.donde.impl.DiscoImpl)\r\n\t\t\treturn  gestionmodelosconsultas.modeloconsultas.donde.DondeFactory.eINSTANCE.createDisco();\r\n\r\n\t\tif(e instanceof gestionmodelosconsultas.modeloconsultas.donde.impl.ArmarioImpl)\r\n\t\t\treturn gestionmodelosconsultas.modeloconsultas.donde.DondeFactory.eINSTANCE.createArmario();\r\n\t\t\r\n\t\tif(e instanceof gestionmodelosconsultas.modeloconsultas.cuando.impl.FechaImpl)\r\n\t\t\treturn gestionmodelosconsultas.modeloconsultas.cuando.CuandoFactory.eINSTANCE.createFecha();\r\n\t\treturn null;'"
	 * @generated
	 */
	ElementoConsulta createElement(ElementoConsulta e);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='for(int i=0; i<modelFactoryQM.getFactoryModeloConsultas().getListModeloConsulta().get(0).getListEADiagram().size();i++){\r\n\t\t\t\r\n\t\t\tif(modelFactoryQM.getFactoryModeloConsultas().getListModeloConsulta().get(0).getListEADiagram().get(i) \r\n\t\t\t\t\tinstanceof gestionmodelosconsultas.modeloconsultas.model.Proyeccion){\r\n\t\t\t\t\r\n\t\t\t\tprojection = (gestionmodelosconsultas.modeloconsultas.model.Proyeccion)\r\n\t\t\t\t\t\tmodelFactoryQM.getFactoryModeloConsultas().getListModeloConsulta().get(0).getListEADiagram().get(i);\r\n\t\t\t\tbreak;\r\n\t\t\t}\r\n\t\t}'"
	 * @generated
	 */
	void getProjectionQM();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="pgr.datatypes.datatypesqm.ElementoConsulta"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if(projection.getListRelacion().size() == 0 &&\r\n\t\t\t\tprojection.getListElementoConsulta().size() == 1) {\r\n\t\t\treturn projection.getListElementoConsulta().get(0);\r\n\t\t}\r\n\t\t\r\n\t\tElementoConsulta firstElement=null;\r\n\t\tfor (int i = 0; i < projection.getListElementoConsulta().size(); i++) {\r\n\t\t\t\r\n\t\t\tboolean source=false, target=false;\r\n\t\t\t\r\n\t\t\tfor(int j=0;j<projection.getListRelacion().size();j++){\r\n\t\t\t\tgestionmodelosconsultas.modeloconsultas.model.Relacion relacion = projection.getListRelacion().get(j); \r\n\t\t\t\tif(relacion.getSource().equals(projection.getListElementoConsulta().get(i)))\r\n\t\t\t\t\tsource=true;\r\n\t\t\t\tif(relacion.getTarget().equals( projection.getListElementoConsulta().get(i)    ))\r\n\t\t\t\t\ttarget=true;\r\n\t\t\t}\r\n\t\t\t\r\n\t\t\tif(source && !target){\r\n\t\t\t\tfirstElement = projection.getListElementoConsulta().get(i);\r\n\t\t\t}\r\n\t\t}\r\n\t\t\r\n\t\treturn firstElement;'"
	 * @generated
	 */
	ElementoConsulta getParent();

} // ViewModelGenerator
