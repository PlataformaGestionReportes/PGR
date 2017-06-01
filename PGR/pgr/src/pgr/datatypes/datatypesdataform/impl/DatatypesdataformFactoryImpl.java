/**
 */
package pgr.datatypes.datatypesdataform.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pgr.datatypes.datatypesdataform.*;

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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatatypesdataformFactoryImpl extends EFactoryImpl implements DatatypesdataformFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatatypesdataformFactory init() {
		try {
			DatatypesdataformFactory theDatatypesdataformFactory = (DatatypesdataformFactory)EPackage.Registry.INSTANCE.getEFactory(DatatypesdataformPackage.eNS_URI);
			if (theDatatypesdataformFactory != null) {
				return theDatatypesdataformFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DatatypesdataformFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypesdataformFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DatatypesdataformPackage.MODEL_FACTORY:
				return createModelFactoryFromString(eDataType, initialValue);
			case DatatypesdataformPackage.DATA_FORM_DIAGRAM:
				return createDataForm_DiagramFromString(eDataType, initialValue);
			case DatatypesdataformPackage.DOMAIN_DIAGRAM:
				return createDomain_DiagramFromString(eDataType, initialValue);
			case DatatypesdataformPackage.CONTAINMENT:
				return createContainmentFromString(eDataType, initialValue);
			case DatatypesdataformPackage.CONTAINER:
				return createContainerFromString(eDataType, initialValue);
			case DatatypesdataformPackage.INTERFACE:
				return createInterfaceFromString(eDataType, initialValue);
			case DatatypesdataformPackage.GRAPHICAL_CONTAINER:
				return createGraphicalContainerFromString(eDataType, initialValue);
			case DatatypesdataformPackage.CLASE:
				return createClaseFromString(eDataType, initialValue);
			case DatatypesdataformPackage.PROJECT:
				return createProjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DatatypesdataformPackage.MODEL_FACTORY:
				return convertModelFactoryToString(eDataType, instanceValue);
			case DatatypesdataformPackage.DATA_FORM_DIAGRAM:
				return convertDataForm_DiagramToString(eDataType, instanceValue);
			case DatatypesdataformPackage.DOMAIN_DIAGRAM:
				return convertDomain_DiagramToString(eDataType, instanceValue);
			case DatatypesdataformPackage.CONTAINMENT:
				return convertContainmentToString(eDataType, instanceValue);
			case DatatypesdataformPackage.CONTAINER:
				return convertContainerToString(eDataType, instanceValue);
			case DatatypesdataformPackage.INTERFACE:
				return convertInterfaceToString(eDataType, instanceValue);
			case DatatypesdataformPackage.GRAPHICAL_CONTAINER:
				return convertGraphicalContainerToString(eDataType, instanceValue);
			case DatatypesdataformPackage.CLASE:
				return convertClaseToString(eDataType, instanceValue);
			case DatatypesdataformPackage.PROJECT:
				return convertProjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory createModelFactoryFromString(EDataType eDataType, String initialValue) {
		return (ModelFactory)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModelFactoryToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataForm_Diagram createDataForm_DiagramFromString(EDataType eDataType, String initialValue) {
		return (DataForm_Diagram)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataForm_DiagramToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain_Diagram createDomain_DiagramFromString(EDataType eDataType, String initialValue) {
		return (Domain_Diagram)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDomain_DiagramToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Containment createContainmentFromString(EDataType eDataType, String initialValue) {
		return (Containment)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContainmentToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tooldataform.formmodel.concreta.Container createContainerFromString(EDataType eDataType, String initialValue) {
		return (tooldataform.formmodel.concreta.Container)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContainerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterfaceFromString(EDataType eDataType, String initialValue) {
		return (Interface)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInterfaceToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicalContainer createGraphicalContainerFromString(EDataType eDataType, String initialValue) {
		return (GraphicalContainer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGraphicalContainerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clase createClaseFromString(EDataType eDataType, String initialValue) {
		return (Clase)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClaseToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProjectFromString(EDataType eDataType, String initialValue) {
		return (Project)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypesdataformPackage getDatatypesdataformPackage() {
		return (DatatypesdataformPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DatatypesdataformPackage getPackage() {
		return DatatypesdataformPackage.eINSTANCE;
	}

} //DatatypesdataformFactoryImpl
