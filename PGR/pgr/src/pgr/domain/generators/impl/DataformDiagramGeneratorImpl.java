/**
 */
package pgr.domain.generators.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Node;

import pgr.domain.Domain;
import pgr.domain.DomainPackage;

import pgr.domain.generators.DataformDiagramGenerator;
import pgr.domain.generators.GeneratorsPackage;

import tooldataform.ModelFactory;

import tooldataform.formmodel.concreta.DataForm_Diagram;
import tooldataform.formmodel.concreta.Interface;

import tooldataform.formmodel.containers.GraphicalContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dataform Diagram Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pgr.domain.generators.impl.DataformDiagramGeneratorImpl#getModelFactory <em>Model Factory</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.DataformDiagramGeneratorImpl#getDataformDiagram <em>Dataform Diagram</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.DataformDiagramGeneratorImpl#getInterface1 <em>Interface1</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.DataformDiagramGeneratorImpl#getTheDomain <em>The Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataformDiagramGeneratorImpl extends MinimalEObjectImpl.Container implements DataformDiagramGenerator {
	/**
	 * The default value of the '{@link #getModelFactory() <em>Model Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelFactory()
	 * @generated
	 * @ordered
	 */
	protected static final ModelFactory MODEL_FACTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelFactory() <em>Model Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelFactory()
	 * @generated
	 * @ordered
	 */
	protected ModelFactory modelFactory = MODEL_FACTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataformDiagram() <em>Dataform Diagram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataformDiagram()
	 * @generated
	 * @ordered
	 */
	protected static final DataForm_Diagram DATAFORM_DIAGRAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataformDiagram() <em>Dataform Diagram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataformDiagram()
	 * @generated
	 * @ordered
	 */
	protected DataForm_Diagram dataformDiagram = DATAFORM_DIAGRAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterface1() <em>Interface1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface1()
	 * @generated
	 * @ordered
	 */
	protected static final Interface INTERFACE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterface1() <em>Interface1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface1()
	 * @generated
	 * @ordered
	 */
	protected Interface interface1 = INTERFACE1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataformDiagramGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorsPackage.Literals.DATAFORM_DIAGRAM_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return modelFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelFactory(ModelFactory newModelFactory) {
		ModelFactory oldModelFactory = modelFactory;
		modelFactory = newModelFactory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.DATAFORM_DIAGRAM_GENERATOR__MODEL_FACTORY, oldModelFactory, modelFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataForm_Diagram getDataformDiagram() {
		return dataformDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataformDiagram(DataForm_Diagram newDataformDiagram) {
		DataForm_Diagram oldDataformDiagram = dataformDiagram;
		dataformDiagram = newDataformDiagram;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.DATAFORM_DIAGRAM_GENERATOR__DATAFORM_DIAGRAM, oldDataformDiagram, dataformDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getInterface1() {
		return interface1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface1(Interface newInterface1) {
		Interface oldInterface1 = interface1;
		interface1 = newInterface1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.DATAFORM_DIAGRAM_GENERATOR__INTERFACE1, oldInterface1, interface1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getTheDomain() {
		if (eContainerFeatureID() != GeneratorsPackage.DATAFORM_DIAGRAM_GENERATOR__THE_DOMAIN) return null;
		return (Domain)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheDomain(Domain newTheDomain, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTheDomain, GeneratorsPackage.DATAFORM_DIAGRAM_GENERATOR__THE_DOMAIN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheDomain(Domain newTheDomain) {
		if (newTheDomain != eInternalContainer() || (eContainerFeatureID() != GeneratorsPackage.DATAFORM_DIAGRAM_GENERATOR__THE_DOMAIN && newTheDomain != null)) {
			if (EcoreUtil.isAncestor(this, newTheDomain))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTheDomain != null)
				msgs = ((InternalEObject)newTheDomain).eInverseAdd(this, DomainPackage.DOMAIN__THE_DATAFORM_DIAGRAM_GENERATOR, Domain.class, msgs);
			msgs = basicSetTheDomain(newTheDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.DATAFORM_DIAGRAM_GENERATOR__THE_DOMAIN, newTheDomain, newTheDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void DataformDiagramGenerator(final ModelFactory modelFactory) {
		
		
		        this.modelFactory = modelFactory;
		        this.dataformDiagram = this.modelFactory.getListProyecto().get(0).getListDataFormDiagram().get(0);
		        this.interface1 = dataformDiagram.getTheInterface();
		    
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void salvarDiagram(final Diagram diagram) {
		
		
		        org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/PGR/domain/model.tooldataform_diagram");
		        org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		        org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		        resource.getContents().add(diagram);
		        try {
		            resource.save(java.util.Collections.EMPTY_MAP);
		        } catch (java.io.IOException e) {
		            e.printStackTrace();
		        }
		    
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void cargarDiagram() {
		
		
		        
		        org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI("platform:/resource/PGR/domain/model.tooldataform");
		        org.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		        org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);
		        try {
		            resource.load(java.util.Collections.EMPTY_MAP);
		            modelFactory =  (ModelFactory) resource.getContents().get(0);
		        } catch (java.io.IOException e) {
		            // TO-DO Auto-generated catch block
		            e.printStackTrace();
		        }
		    
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void resetDiagram(final String path) {
		
		
		    	
		    	try{
			    	org.eclipse.ui.IWorkbench workbench = org.eclipse.ui.PlatformUI.getWorkbench();
			    	org.eclipse.ui.IWorkbenchPage activePage = workbench.getActiveWorkbenchWindow().getActivePage();
			        activePage.closeEditors(activePage.getEditorReferences(), true);
			        org.apache.commons.io.FileUtils.touch(new java.io.File(path));
			        java.io.File fileToDelete = org.apache.commons.io.FileUtils.getFile(path);
			        org.apache.commons.io.FileUtils.deleteQuietly(fileToDelete);
		    	} 
		    	catch(java.io.IOException e){
		    		 e.printStackTrace();
		    	}
		    
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void generateDiagram() {
		
		
		        
		        Diagram diag = createDiagram();
		        salvarDiagram(diag);
		        openDiagram(diag);
		    
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram createDiagram() {
		
		
		        
		        //create the diagram
		        int diagramVID = tooldataform.diagram.part.MetamodelodataformVisualIDRegistry.getDiagramVisualID(dataformDiagram);
		        if (diagramVID != tooldataform.diagram.edit.parts.DataForm_DiagramEditPart.VISUAL_ID) {
		            // error
		        }
		        Diagram diagram = org.eclipse.gmf.runtime.diagram.core.services.ViewService.createDiagram(dataformDiagram,tooldataform.diagram.edit.parts.DataForm_DiagramEditPart.MODEL_ID,tooldataform.diagram.part.MetamodelodataformDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
		
		        // save the ressource
		        try {
		            dataformDiagram.eResource().save(tooldataform.diagram.part.MetamodelodataformDiagramEditorUtil.getSaveOptions());
		        } catch (java.io.IOException e) {
		        	tooldataform.diagram.part.MetamodelodataformDiagramEditorPlugin.getInstance().logError(
		                    "Save operation failed for: " + dataformDiagram.eResource(), e); //$NON-NLS-1$
		        }
		        
		        		
		        Node node = org.eclipse.gmf.runtime.diagram.core.services.ViewService.getInstance().createNode(new  org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter(interface1), diagram, null, 0, true,tooldataform.diagram.part.MetamodelodataformDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
		        
		        Bounds bounds = createBounds(interface1.getPositionX(),interface1.getPositionY(),
		                interface1.getWidth(),interface1.getHeight());
		        node.setLayoutConstraint(bounds);
		        
		        initComponents(interface1, node);
		        diagram.setName("model.tooldataform_diagram");
		        
		        return diagram;
		    
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initComponents(final GraphicalContainer graphicalContainer, final Node parent) {
		
		
		        
		        for (int i=0; i < graphicalContainer.getListGraphicalContainer().size(); i++) {
		        	
		        	GraphicalContainer gc = graphicalContainer.getListGraphicalContainer().get(i);
		        	        
		            Node node = org.eclipse.gmf.runtime.diagram.core.services.ViewService.getInstance().createNode(new org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter(gc), (Node) parent.getPersistedChildren().get(1), null, i,true ,tooldataform.diagram.part.MetamodelodataformDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
		            Bounds bounds = createBounds(gc.getPositionX(),gc.getPositionY(), gc.getWidth(),gc.getHeight());
		            node.setLayoutConstraint(bounds);
		        	
		        	initComponents(graphicalContainer.getListGraphicalContainer().get(i), node);
		        }
		        
		        int size = graphicalContainer.getListGraphicalContainer().size();
		       
		        for (int j = 0; j < graphicalContainer.getListIndividualElementDataForm().size(); j++) {
		        	tooldataform.formmodel.concreta.GraphicalIndividualEement ie = graphicalContainer.getListIndividualElementDataForm().get(j);          
		            Node node = org.eclipse.gmf.runtime.diagram.core.services.ViewService.getInstance().createNode(new org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter(ie), (Node)parent.getPersistedChildren().get(1), null, size+j,true ,tooldataform.diagram.part.MetamodelodataformDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
		            Bounds bounds = createBounds(ie.getPositionX(),ie.getPositionY(), ie.getWidth(),ie.getHeight());
		            node.setLayoutConstraint(bounds);
		        }
		    
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bounds createBounds(final int x, final int y, final int width, final int height) {
		
		
		        
		        Bounds bounds =  org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createBounds();
		        bounds.setX(x);
		        bounds.setY(y);
		        bounds.setWidth(width);
		        bounds.setHeight(height);
		        return bounds;
		    
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void openDiagram(final Diagram diag) {
		
		
		        
		        //open the diagram
		        try {    
		            //open it
		            org.eclipse.emf.common.util.URI uri = org.eclipse.emf.ecore.util.EcoreUtil.getURI(diag);
		            org.eclipse.ui.IWorkbenchPage page = org.eclipse.ui.PlatformUI.getWorkbench()    .getActiveWorkbenchWindow().getActivePage();
		            page.openEditor(new org.eclipse.emf.common.ui.URIEditorInput(uri,dataformDiagram.getName()),  tooldataform.diagram.part.MetamodelodataformDiagramEditor.ID);
		            
		        } catch (org.eclipse.ui.PartInitException e) {
		        	tooldataform.diagram.part.MetamodelodataformDiagramEditorPlugin.getInstance().logError(
		                    "Unable to open editor", e); //$NON-NLS-1$
		        }
		    
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeneratorsPackage.DATAFORM_DIAGRAM_GENERATOR__THE_DOMAIN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTheDomain((Domain)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeneratorsPackage.DATAFORM_DIAGRAM_GENERATOR__THE_DOMAIN:
				return basicSetTheDomain(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case GeneratorsPackage.DATAFORM_DIAGRAM_GENERATOR__THE_DOMAIN:
				return eInternalContainer().eInverseRemove(this, DomainPackage.DOMAIN__THE_DATAFORM_DIAGRAM_GENERATOR, Domain.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GeneratorsPackage.DATAFORM_DIAGRAM_GENERATOR__MODEL_FACTORY:
				return getModelFactory();
			case GeneratorsPackage.DATAFORM_DIAGRAM_GENERATOR__DATAFORM_DIAGRAM:
				return getDataformDiagram();
			case GeneratorsPackage.DATAFORM_DIAGRAM_GENERATOR__INTERFACE1:
				return getInterface1();
			case GeneratorsPackage.DATAFORM_DIAGRAM_GENERATOR__THE_DOMAIN:
				return getTheDomain();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GeneratorsPackage.DATAFORM_DIAGRAM_GENERATOR__MODEL_FACTORY:
				setModelFactory((ModelFactory)newValue);
				return;
			case GeneratorsPackage.DATAFORM_DIAGRAM_GENERATOR__DATAFORM_DIAGRAM:
				setDataformDiagram((DataForm_Diagram)newValue);
				return;
			case GeneratorsPackage.DATAFORM_DIAGRAM_GENERATOR__INTERFACE1:
				setInterface1((Interface)newValue);
				return;
			case GeneratorsPackage.DATAFORM_DIAGRAM_GENERATOR__THE_DOMAIN:
				setTheDomain((Domain)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GeneratorsPackage.DATAFORM_DIAGRAM_GENERATOR__MODEL_FACTORY:
				setModelFactory(MODEL_FACTORY_EDEFAULT);
				return;
			case GeneratorsPackage.DATAFORM_DIAGRAM_GENERATOR__DATAFORM_DIAGRAM:
				setDataformDiagram(DATAFORM_DIAGRAM_EDEFAULT);
				return;
			case GeneratorsPackage.DATAFORM_DIAGRAM_GENERATOR__INTERFACE1:
				setInterface1(INTERFACE1_EDEFAULT);
				return;
			case GeneratorsPackage.DATAFORM_DIAGRAM_GENERATOR__THE_DOMAIN:
				setTheDomain((Domain)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GeneratorsPackage.DATAFORM_DIAGRAM_GENERATOR__MODEL_FACTORY:
				return MODEL_FACTORY_EDEFAULT == null ? modelFactory != null : !MODEL_FACTORY_EDEFAULT.equals(modelFactory);
			case GeneratorsPackage.DATAFORM_DIAGRAM_GENERATOR__DATAFORM_DIAGRAM:
				return DATAFORM_DIAGRAM_EDEFAULT == null ? dataformDiagram != null : !DATAFORM_DIAGRAM_EDEFAULT.equals(dataformDiagram);
			case GeneratorsPackage.DATAFORM_DIAGRAM_GENERATOR__INTERFACE1:
				return INTERFACE1_EDEFAULT == null ? interface1 != null : !INTERFACE1_EDEFAULT.equals(interface1);
			case GeneratorsPackage.DATAFORM_DIAGRAM_GENERATOR__THE_DOMAIN:
				return getTheDomain() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GeneratorsPackage.DATAFORM_DIAGRAM_GENERATOR___DATAFORM_DIAGRAM_GENERATOR__MODELFACTORY:
				DataformDiagramGenerator((ModelFactory)arguments.get(0));
				return null;
			case GeneratorsPackage.DATAFORM_DIAGRAM_GENERATOR___SALVAR_DIAGRAM__DIAGRAM:
				salvarDiagram((Diagram)arguments.get(0));
				return null;
			case GeneratorsPackage.DATAFORM_DIAGRAM_GENERATOR___CARGAR_DIAGRAM:
				cargarDiagram();
				return null;
			case GeneratorsPackage.DATAFORM_DIAGRAM_GENERATOR___RESET_DIAGRAM__STRING:
				resetDiagram((String)arguments.get(0));
				return null;
			case GeneratorsPackage.DATAFORM_DIAGRAM_GENERATOR___GENERATE_DIAGRAM:
				generateDiagram();
				return null;
			case GeneratorsPackage.DATAFORM_DIAGRAM_GENERATOR___CREATE_DIAGRAM:
				return createDiagram();
			case GeneratorsPackage.DATAFORM_DIAGRAM_GENERATOR___INIT_COMPONENTS__GRAPHICALCONTAINER_NODE:
				initComponents((GraphicalContainer)arguments.get(0), (Node)arguments.get(1));
				return null;
			case GeneratorsPackage.DATAFORM_DIAGRAM_GENERATOR___CREATE_BOUNDS__INT_INT_INT_INT:
				return createBounds((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case GeneratorsPackage.DATAFORM_DIAGRAM_GENERATOR___OPEN_DIAGRAM__DIAGRAM:
				openDiagram((Diagram)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (modelFactory: ");
		result.append(modelFactory);
		result.append(", dataformDiagram: ");
		result.append(dataformDiagram);
		result.append(", interface1: ");
		result.append(interface1);
		result.append(')');
		return result.toString();
	}

} //DataformDiagramGeneratorImpl
