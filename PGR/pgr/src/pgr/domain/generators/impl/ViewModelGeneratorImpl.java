/**
 */
package pgr.domain.generators.impl;

import gestionmodelosconsultas.ModelFactory;

import gestionmodelosconsultas.modeloconsultas.model.EADiagram;
import gestionmodelosconsultas.modeloconsultas.model.ElementoConsulta;
import gestionmodelosconsultas.modeloconsultas.model.Proyeccion;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import pgr.domain.Domain;
import pgr.domain.DomainPackage;

import pgr.domain.generators.GeneratorsPackage;
import pgr.domain.generators.ViewModelGenerator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Model Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pgr.domain.generators.impl.ViewModelGeneratorImpl#getModelFactoryQM <em>Model Factory QM</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.ViewModelGeneratorImpl#getProjection <em>Projection</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.ViewModelGeneratorImpl#getViewModel <em>View Model</em>}</li>
 *   <li>{@link pgr.domain.generators.impl.ViewModelGeneratorImpl#getTheDomain <em>The Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewModelGeneratorImpl extends MinimalEObjectImpl.Container implements ViewModelGenerator {
	/**
	 * The default value of the '{@link #getModelFactoryQM() <em>Model Factory QM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelFactoryQM()
	 * @generated
	 * @ordered
	 */
	protected static final ModelFactory MODEL_FACTORY_QM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelFactoryQM() <em>Model Factory QM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelFactoryQM()
	 * @generated
	 * @ordered
	 */
	protected ModelFactory modelFactoryQM = MODEL_FACTORY_QM_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjection() <em>Projection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjection()
	 * @generated
	 * @ordered
	 */
	protected static final Proyeccion PROJECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjection() <em>Projection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjection()
	 * @generated
	 * @ordered
	 */
	protected Proyeccion projection = PROJECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getViewModel() <em>View Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewModel()
	 * @generated
	 * @ordered
	 */
	protected static final EADiagram VIEW_MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getViewModel() <em>View Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewModel()
	 * @generated
	 * @ordered
	 */
	protected EADiagram viewModel = VIEW_MODEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewModelGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorsPackage.Literals.VIEW_MODEL_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactoryQM() {
		return modelFactoryQM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelFactoryQM(ModelFactory newModelFactoryQM) {
		ModelFactory oldModelFactoryQM = modelFactoryQM;
		modelFactoryQM = newModelFactoryQM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.VIEW_MODEL_GENERATOR__MODEL_FACTORY_QM, oldModelFactoryQM, modelFactoryQM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Proyeccion getProjection() {
		return projection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjection(Proyeccion newProjection) {
		Proyeccion oldProjection = projection;
		projection = newProjection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.VIEW_MODEL_GENERATOR__PROJECTION, oldProjection, projection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EADiagram getViewModel() {
		return viewModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewModel(EADiagram newViewModel) {
		EADiagram oldViewModel = viewModel;
		viewModel = newViewModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.VIEW_MODEL_GENERATOR__VIEW_MODEL, oldViewModel, viewModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getTheDomain() {
		if (eContainerFeatureID() != GeneratorsPackage.VIEW_MODEL_GENERATOR__THE_DOMAIN) return null;
		return (Domain)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheDomain(Domain newTheDomain, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTheDomain, GeneratorsPackage.VIEW_MODEL_GENERATOR__THE_DOMAIN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheDomain(Domain newTheDomain) {
		if (newTheDomain != eInternalContainer() || (eContainerFeatureID() != GeneratorsPackage.VIEW_MODEL_GENERATOR__THE_DOMAIN && newTheDomain != null)) {
			if (EcoreUtil.isAncestor(this, newTheDomain))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTheDomain != null)
				msgs = ((InternalEObject)newTheDomain).eInverseAdd(this, DomainPackage.DOMAIN__THE_VIEW_MODEL_GENERATOR, Domain.class, msgs);
			msgs = basicSetTheDomain(newTheDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorsPackage.VIEW_MODEL_GENERATOR__THE_DOMAIN, newTheDomain, newTheDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void ViewModelGenerator(final ModelFactory modelFactoryQM) {
		this.modelFactoryQM = modelFactoryQM;
				
				getProjectionQM();
				viewModel = gestionmodelosconsultas.modeloconsultas.model.ModelFactory.eINSTANCE.createViewModel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void generateViewModel() {
		createViewModel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void exploreRelations(final ElementoConsulta parent, final ElementoConsulta parentViewModel, final Integer order) {
		for(int i=0;i<projection.getListRelacion().size();i++){
					gestionmodelosconsultas.modeloconsultas.model.Relacion relacion = projection.getListRelacion().get(i);
					if(relacion.getSource().equals(parent)){
						
						ElementoConsulta queryElement = createElement((ElementoConsulta) relacion.getTarget());
						queryElement.setOrder(order);
						viewModel.getListElementoConsulta().add(queryElement);	
						
						
						gestionmodelosconsultas.modeloconsultas.model.Relacion relation = 
								gestionmodelosconsultas.modeloconsultas.model.ModelFactory.eINSTANCE.createRelacion();
						relation.setSource(parent);
						relation.setTarget(queryElement);
						viewModel.getListRelacion().add(relation);
						
						
						exploreRelations(relacion.getTarget(), queryElement, order+1);
					}
				}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createViewModel() {
		EList<gestionmodelosconsultas.modeloconsultas.ModeloConsulta> listQueryModel = 
								modelFactoryQM.getFactoryModeloConsultas().getListModeloConsulta();
						
						gestionmodelosconsultas.modeloconsultas.ModeloConsulta queryModel = listQueryModel.get(0);
						EList<gestionmodelosconsultas.modeloconsultas.model.EADiagram> listViewModel = queryModel.getListEADiagram();
						
						EList<gestionmodelosconsultas.modeloconsultas.model.EADiagram> newList = queryModel.createtListEADiagram();
						
						for(int i=0;i<listViewModel.size();i++){
							if(!(listViewModel.get(i) instanceof gestionmodelosconsultas.modeloconsultas.model.ViewModel))
								newList.add(listViewModel.get(i));
						}
						
						queryModel.setEADiagram(newList);
						listViewModel = newList;
						
						ElementoConsulta root = getParent();
						ElementoConsulta queryElement = createElement((ElementoConsulta) root);
						queryElement.setOrder(1);
						viewModel.getListElementoConsulta().add(queryElement);	
						
						exploreRelations(root, queryElement, 2);
						
						listViewModel.add(viewModel);
						modelFactoryQM.salvar();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementoConsulta createElement(final ElementoConsulta e) {
				if(e instanceof gestionmodelosconsultas.modeloconsultas.quien.impl.UnidadOrganizacionalImpl)
					return  gestionmodelosconsultas.modeloconsultas.quien.QuienFactory.eINSTANCE.createUnidadOrganizacional();
			
				if(e instanceof gestionmodelosconsultas.modeloconsultas.quien.impl.ActorImpl)
					return gestionmodelosconsultas.modeloconsultas.quien.QuienFactory.eINSTANCE.createActor();
			
				if(e instanceof gestionmodelosconsultas.modeloconsultas.quien.impl.RolImpl)
					return gestionmodelosconsultas.modeloconsultas.quien.QuienFactory.eINSTANCE.createRol();
			
				if(e instanceof gestionmodelosconsultas.modeloconsultas.quien.impl.ContactoImpl)
					return gestionmodelosconsultas.modeloconsultas.quien.QuienFactory.eINSTANCE.createContacto();
				
				if(e instanceof gestionmodelosconsultas.modeloconsultas.quien.impl.QuienImpl)
					return gestionmodelosconsultas.modeloconsultas.quien.QuienFactory.eINSTANCE.createQuien();
				
				if(e instanceof gestionmodelosconsultas.modeloconsultas.que.impl.DocumentoImpl)
					return gestionmodelosconsultas.modeloconsultas.que.QueFactory.eINSTANCE.createDocumento();
				
				if(e instanceof gestionmodelosconsultas.modeloconsultas.que.impl.ComunicacionImpl)
					return gestionmodelosconsultas.modeloconsultas.que.QueFactory.eINSTANCE.createComunicacion();
			
				if(e instanceof gestionmodelosconsultas.modeloconsultas.como.impl.ActividadProcesoImpl)
					return gestionmodelosconsultas.modeloconsultas.como.ComoFactory.eINSTANCE.createActividadProceso();
		
				if(e instanceof gestionmodelosconsultas.modeloconsultas.como.impl.InstanciaProcesoImpl)
					return gestionmodelosconsultas.modeloconsultas.como.ComoFactory.eINSTANCE.createInstanciaProceso();
				
				if(e instanceof gestionmodelosconsultas.modeloconsultas.donde.impl.DepositoImpl)
				return  gestionmodelosconsultas.modeloconsultas.donde.DondeFactory.eINSTANCE.createDeposito();
				
				if(e instanceof gestionmodelosconsultas.modeloconsultas.donde.impl.DiscoImpl)
					return  gestionmodelosconsultas.modeloconsultas.donde.DondeFactory.eINSTANCE.createDisco();
		
				if(e instanceof gestionmodelosconsultas.modeloconsultas.donde.impl.ArmarioImpl)
					return gestionmodelosconsultas.modeloconsultas.donde.DondeFactory.eINSTANCE.createArmario();
				
				if(e instanceof gestionmodelosconsultas.modeloconsultas.cuando.impl.FechaImpl)
					return gestionmodelosconsultas.modeloconsultas.cuando.CuandoFactory.eINSTANCE.createFecha();
				return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getProjectionQM() {
		for(int i=0; i<modelFactoryQM.getFactoryModeloConsultas().getListModeloConsulta().get(0).getListEADiagram().size();i++){
					
					if(modelFactoryQM.getFactoryModeloConsultas().getListModeloConsulta().get(0).getListEADiagram().get(i) 
							instanceof gestionmodelosconsultas.modeloconsultas.model.Proyeccion){
						
						projection = (gestionmodelosconsultas.modeloconsultas.model.Proyeccion)
								modelFactoryQM.getFactoryModeloConsultas().getListModeloConsulta().get(0).getListEADiagram().get(i);
						break;
					}
				}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementoConsulta getParent() {
		if(projection.getListRelacion().size() == 0 &&
						projection.getListElementoConsulta().size() == 1) {
					return projection.getListElementoConsulta().get(0);
				}
				
				ElementoConsulta firstElement=null;
				for (int i = 0; i < projection.getListElementoConsulta().size(); i++) {
					
					boolean source=false, target=false;
					
					for(int j=0;j<projection.getListRelacion().size();j++){
						gestionmodelosconsultas.modeloconsultas.model.Relacion relacion = projection.getListRelacion().get(j); 
						if(relacion.getSource().equals(projection.getListElementoConsulta().get(i)))
							source=true;
						if(relacion.getTarget().equals( projection.getListElementoConsulta().get(i)    ))
							target=true;
					}
					
					if(source && !target){
						firstElement = projection.getListElementoConsulta().get(i);
					}
				}
				
				return firstElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeneratorsPackage.VIEW_MODEL_GENERATOR__THE_DOMAIN:
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
			case GeneratorsPackage.VIEW_MODEL_GENERATOR__THE_DOMAIN:
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
			case GeneratorsPackage.VIEW_MODEL_GENERATOR__THE_DOMAIN:
				return eInternalContainer().eInverseRemove(this, DomainPackage.DOMAIN__THE_VIEW_MODEL_GENERATOR, Domain.class, msgs);
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
			case GeneratorsPackage.VIEW_MODEL_GENERATOR__MODEL_FACTORY_QM:
				return getModelFactoryQM();
			case GeneratorsPackage.VIEW_MODEL_GENERATOR__PROJECTION:
				return getProjection();
			case GeneratorsPackage.VIEW_MODEL_GENERATOR__VIEW_MODEL:
				return getViewModel();
			case GeneratorsPackage.VIEW_MODEL_GENERATOR__THE_DOMAIN:
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
			case GeneratorsPackage.VIEW_MODEL_GENERATOR__MODEL_FACTORY_QM:
				setModelFactoryQM((ModelFactory)newValue);
				return;
			case GeneratorsPackage.VIEW_MODEL_GENERATOR__PROJECTION:
				setProjection((Proyeccion)newValue);
				return;
			case GeneratorsPackage.VIEW_MODEL_GENERATOR__VIEW_MODEL:
				setViewModel((EADiagram)newValue);
				return;
			case GeneratorsPackage.VIEW_MODEL_GENERATOR__THE_DOMAIN:
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
			case GeneratorsPackage.VIEW_MODEL_GENERATOR__MODEL_FACTORY_QM:
				setModelFactoryQM(MODEL_FACTORY_QM_EDEFAULT);
				return;
			case GeneratorsPackage.VIEW_MODEL_GENERATOR__PROJECTION:
				setProjection(PROJECTION_EDEFAULT);
				return;
			case GeneratorsPackage.VIEW_MODEL_GENERATOR__VIEW_MODEL:
				setViewModel(VIEW_MODEL_EDEFAULT);
				return;
			case GeneratorsPackage.VIEW_MODEL_GENERATOR__THE_DOMAIN:
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
			case GeneratorsPackage.VIEW_MODEL_GENERATOR__MODEL_FACTORY_QM:
				return MODEL_FACTORY_QM_EDEFAULT == null ? modelFactoryQM != null : !MODEL_FACTORY_QM_EDEFAULT.equals(modelFactoryQM);
			case GeneratorsPackage.VIEW_MODEL_GENERATOR__PROJECTION:
				return PROJECTION_EDEFAULT == null ? projection != null : !PROJECTION_EDEFAULT.equals(projection);
			case GeneratorsPackage.VIEW_MODEL_GENERATOR__VIEW_MODEL:
				return VIEW_MODEL_EDEFAULT == null ? viewModel != null : !VIEW_MODEL_EDEFAULT.equals(viewModel);
			case GeneratorsPackage.VIEW_MODEL_GENERATOR__THE_DOMAIN:
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
			case GeneratorsPackage.VIEW_MODEL_GENERATOR___VIEW_MODEL_GENERATOR__MODELFACTORY:
				ViewModelGenerator((ModelFactory)arguments.get(0));
				return null;
			case GeneratorsPackage.VIEW_MODEL_GENERATOR___GENERATE_VIEW_MODEL:
				generateViewModel();
				return null;
			case GeneratorsPackage.VIEW_MODEL_GENERATOR___EXPLORE_RELATIONS__ELEMENTOCONSULTA_ELEMENTOCONSULTA_INTEGER:
				exploreRelations((ElementoConsulta)arguments.get(0), (ElementoConsulta)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case GeneratorsPackage.VIEW_MODEL_GENERATOR___CREATE_VIEW_MODEL:
				createViewModel();
				return null;
			case GeneratorsPackage.VIEW_MODEL_GENERATOR___CREATE_ELEMENT__ELEMENTOCONSULTA:
				return createElement((ElementoConsulta)arguments.get(0));
			case GeneratorsPackage.VIEW_MODEL_GENERATOR___GET_PROJECTION_QM:
				getProjectionQM();
				return null;
			case GeneratorsPackage.VIEW_MODEL_GENERATOR___GET_PARENT:
				return getParent();
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
		result.append(" (modelFactoryQM: ");
		result.append(modelFactoryQM);
		result.append(", projection: ");
		result.append(projection);
		result.append(", viewModel: ");
		result.append(viewModel);
		result.append(')');
		return result.toString();
	}

} //ViewModelGeneratorImpl
