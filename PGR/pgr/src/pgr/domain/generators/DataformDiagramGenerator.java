/**
 */
package pgr.domain.generators;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Node;

import pgr.domain.Domain;

import tooldataform.ModelFactory;

import tooldataform.formmodel.concreta.DataForm_Diagram;
import tooldataform.formmodel.concreta.Interface;

import tooldataform.formmodel.containers.GraphicalContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dataform Diagram Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pgr.domain.generators.DataformDiagramGenerator#getModelFactory <em>Model Factory</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformDiagramGenerator#getDataformDiagram <em>Dataform Diagram</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformDiagramGenerator#getInterface1 <em>Interface1</em>}</li>
 *   <li>{@link pgr.domain.generators.DataformDiagramGenerator#getTheDomain <em>The Domain</em>}</li>
 * </ul>
 *
 * @see pgr.domain.generators.GeneratorsPackage#getDataformDiagramGenerator()
 * @model
 * @generated
 */
public interface DataformDiagramGenerator extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Factory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Factory</em>' attribute.
	 * @see #setModelFactory(ModelFactory)
	 * @see pgr.domain.generators.GeneratorsPackage#getDataformDiagramGenerator_ModelFactory()
	 * @model dataType="pgr.datatypes.datatypesdataform.ModelFactory"
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.DataformDiagramGenerator#getModelFactory <em>Model Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Factory</em>' attribute.
	 * @see #getModelFactory()
	 * @generated
	 */
	void setModelFactory(ModelFactory value);

	/**
	 * Returns the value of the '<em><b>Dataform Diagram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dataform Diagram</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataform Diagram</em>' attribute.
	 * @see #setDataformDiagram(DataForm_Diagram)
	 * @see pgr.domain.generators.GeneratorsPackage#getDataformDiagramGenerator_DataformDiagram()
	 * @model dataType="pgr.datatypes.datatypesdataform.DataForm_Diagram"
	 * @generated
	 */
	DataForm_Diagram getDataformDiagram();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.DataformDiagramGenerator#getDataformDiagram <em>Dataform Diagram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataform Diagram</em>' attribute.
	 * @see #getDataformDiagram()
	 * @generated
	 */
	void setDataformDiagram(DataForm_Diagram value);

	/**
	 * Returns the value of the '<em><b>Interface1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface1</em>' attribute.
	 * @see #setInterface1(Interface)
	 * @see pgr.domain.generators.GeneratorsPackage#getDataformDiagramGenerator_Interface1()
	 * @model dataType="pgr.datatypes.datatypesdataform.Interface"
	 * @generated
	 */
	Interface getInterface1();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.DataformDiagramGenerator#getInterface1 <em>Interface1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface1</em>' attribute.
	 * @see #getInterface1()
	 * @generated
	 */
	void setInterface1(Interface value);

	/**
	 * Returns the value of the '<em><b>The Domain</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link pgr.domain.Domain#getTheDataformDiagramGenerator <em>The Dataform Diagram Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Domain</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Domain</em>' container reference.
	 * @see #setTheDomain(Domain)
	 * @see pgr.domain.generators.GeneratorsPackage#getDataformDiagramGenerator_TheDomain()
	 * @see pgr.domain.Domain#getTheDataformDiagramGenerator
	 * @model opposite="theDataformDiagramGenerator"
	 * @generated
	 */
	Domain getTheDomain();

	/**
	 * Sets the value of the '{@link pgr.domain.generators.DataformDiagramGenerator#getTheDomain <em>The Domain</em>}' container reference.
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
	 * @model modelFactoryDataType="pgr.datatypes.datatypesdataform.ModelFactory"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n        this.modelFactory = modelFactory;\r\n        this.dataformDiagram = this.modelFactory.getListProyecto().get(0).getListDataFormDiagram().get(0);\r\n        this.interface1 = dataformDiagram.getTheInterface();\r\n    '"
	 * @generated
	 */
	void DataformDiagramGenerator(ModelFactory modelFactory);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model diagramDataType="pgr.datatypes.datatypesgmf.Diagram"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n        org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI(\"platform:/resource/PGR/domain/model.tooldataform_diagram\");\r\n        org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();\r\n        org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);\r\n        resource.getContents().add(diagram);\r\n        try {\r\n            resource.save(java.util.Collections.EMPTY_MAP);\r\n        } catch (java.io.IOException e) {\r\n            e.printStackTrace();\r\n        }\r\n    '"
	 * @generated
	 */
	void salvarDiagram(Diagram diagram);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n        \r\n        org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI(\"platform:/resource/PGR/domain/model.tooldataform\");\r\n        org.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();\r\n        org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);\r\n        try {\r\n            resource.load(java.util.Collections.EMPTY_MAP);\r\n            modelFactory =  (ModelFactory) resource.getContents().get(0);\r\n        } catch (java.io.IOException e) {\r\n            // TO-DO Auto-generated catch block\r\n            e.printStackTrace();\r\n        }\r\n    '"
	 * @generated
	 */
	void cargarDiagram();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n    \t\r\n    \ttry{\r\n\t    \torg.eclipse.ui.IWorkbench workbench = org.eclipse.ui.PlatformUI.getWorkbench();\r\n\t    \torg.eclipse.ui.IWorkbenchPage activePage = workbench.getActiveWorkbenchWindow().getActivePage();\r\n\t        activePage.closeEditors(activePage.getEditorReferences(), true);\r\n\t        org.apache.commons.io.FileUtils.touch(new java.io.File(path));\r\n\t        java.io.File fileToDelete = org.apache.commons.io.FileUtils.getFile(path);\r\n\t        org.apache.commons.io.FileUtils.deleteQuietly(fileToDelete);\r\n    \t} \r\n    \tcatch(java.io.IOException e){\r\n    \t\t e.printStackTrace();\r\n    \t}\r\n    '"
	 * @generated
	 */
	void resetDiagram(String path);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n        \r\n        Diagram diag = createDiagram();\r\n        salvarDiagram(diag);\r\n        openDiagram(diag);\r\n    '"
	 * @generated
	 */
	void generateDiagram();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="pgr.datatypes.datatypesgmf.Diagram"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n        \r\n        //create the diagram\r\n        int diagramVID = tooldataform.diagram.part.MetamodelodataformVisualIDRegistry.getDiagramVisualID(dataformDiagram);\r\n        if (diagramVID != tooldataform.diagram.edit.parts.DataForm_DiagramEditPart.VISUAL_ID) {\r\n            // error\r\n        }\r\n        Diagram diagram = org.eclipse.gmf.runtime.diagram.core.services.ViewService.createDiagram(dataformDiagram,tooldataform.diagram.edit.parts.DataForm_DiagramEditPart.MODEL_ID,tooldataform.diagram.part.MetamodelodataformDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);\r\n\r\n        // save the ressource\r\n        try {\r\n            dataformDiagram.eResource().save(tooldataform.diagram.part.MetamodelodataformDiagramEditorUtil.getSaveOptions());\r\n        } catch (java.io.IOException e) {\r\n        \ttooldataform.diagram.part.MetamodelodataformDiagramEditorPlugin.getInstance().logError(\r\n                    \"Save operation failed for: \" + dataformDiagram.eResource(), e); //$NON-NLS-1$\r\n        }\r\n        \r\n        \t\t\r\n        Node node = org.eclipse.gmf.runtime.diagram.core.services.ViewService.getInstance().createNode(new  org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter(interface1), diagram, null, 0, true,tooldataform.diagram.part.MetamodelodataformDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);\r\n        \r\n        Bounds bounds = createBounds(interface1.getPositionX(),interface1.getPositionY(),\r\n                interface1.getWidth(),interface1.getHeight());\r\n        node.setLayoutConstraint(bounds);\r\n        \r\n        initComponents(interface1, node);\r\n        diagram.setName(\"model.tooldataform_diagram\");\r\n        \r\n        return diagram;\r\n    '"
	 * @generated
	 */
	Diagram createDiagram();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model graphicalContainerDataType="pgr.datatypes.datatypesdataform.GraphicalContainer" parentDataType="pgr.datatypes.datatypesgmf.Node"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n        \r\n        for (int i=0; i < graphicalContainer.getListGraphicalContainer().size(); i++) {\r\n        \t\r\n        \tGraphicalContainer gc = graphicalContainer.getListGraphicalContainer().get(i);\r\n        \t        \r\n            Node node = org.eclipse.gmf.runtime.diagram.core.services.ViewService.getInstance().createNode(new org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter(gc), (Node) parent.getPersistedChildren().get(1), null, i,true ,tooldataform.diagram.part.MetamodelodataformDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);\r\n            Bounds bounds = createBounds(gc.getPositionX(),gc.getPositionY(), gc.getWidth(),gc.getHeight());\r\n            node.setLayoutConstraint(bounds);\r\n        \t\r\n        \tinitComponents(graphicalContainer.getListGraphicalContainer().get(i), node);\r\n        }\r\n        \r\n        int size = graphicalContainer.getListGraphicalContainer().size();\r\n       \r\n        for (int j = 0; j < graphicalContainer.getListIndividualElementDataForm().size(); j++) {\r\n        \ttooldataform.formmodel.concreta.GraphicalIndividualEement ie = graphicalContainer.getListIndividualElementDataForm().get(j);          \r\n            Node node = org.eclipse.gmf.runtime.diagram.core.services.ViewService.getInstance().createNode(new org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter(ie), (Node)parent.getPersistedChildren().get(1), null, size+j,true ,tooldataform.diagram.part.MetamodelodataformDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);\r\n            Bounds bounds = createBounds(ie.getPositionX(),ie.getPositionY(), ie.getWidth(),ie.getHeight());\r\n            node.setLayoutConstraint(bounds);\r\n        }\r\n    '"
	 * @generated
	 */
	void initComponents(GraphicalContainer graphicalContainer, Node parent);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="pgr.datatypes.datatypesgmf.Bounds"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n        \r\n        Bounds bounds =  org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createBounds();\r\n        bounds.setX(x);\r\n        bounds.setY(y);\r\n        bounds.setWidth(width);\r\n        bounds.setHeight(height);\r\n        return bounds;\r\n    '"
	 * @generated
	 */
	Bounds createBounds(int x, int y, int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model diagDataType="pgr.datatypes.datatypesgmf.Diagram"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\n\r\n        \r\n        //open the diagram\r\n        try {    \r\n            //open it\r\n            org.eclipse.emf.common.util.URI uri = org.eclipse.emf.ecore.util.EcoreUtil.getURI(diag);\r\n            org.eclipse.ui.IWorkbenchPage page = org.eclipse.ui.PlatformUI.getWorkbench()    .getActiveWorkbenchWindow().getActivePage();\r\n            page.openEditor(new org.eclipse.emf.common.ui.URIEditorInput(uri,dataformDiagram.getName()),  tooldataform.diagram.part.MetamodelodataformDiagramEditor.ID);\r\n            \r\n        } catch (org.eclipse.ui.PartInitException e) {\r\n        \ttooldataform.diagram.part.MetamodelodataformDiagramEditorPlugin.getInstance().logError(\r\n                    \"Unable to open editor\", e); //$NON-NLS-1$\r\n        }\r\n    '"
	 * @generated
	 */
	void openDiagram(Diagram diag);

} // DataformDiagramGenerator
