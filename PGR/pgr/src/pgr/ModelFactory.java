/**
 */
package pgr;

import org.eclipse.emf.ecore.EObject;

import pgr.domain.Domain;

import pgr.ui.UI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pgr.ModelFactory#getTheDomain <em>The Domain</em>}</li>
 *   <li>{@link pgr.ModelFactory#getTheUI <em>The UI</em>}</li>
 * </ul>
 *
 * @see pgr.PgrPackage#getModelFactory()
 * @model
 * @generated
 */
public interface ModelFactory extends EObject {
	/**
	 * Returns the value of the '<em><b>The Domain</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link pgr.domain.Domain#getTheModelFactory <em>The Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Domain</em>' containment reference.
	 * @see #setTheDomain(Domain)
	 * @see pgr.PgrPackage#getModelFactory_TheDomain()
	 * @see pgr.domain.Domain#getTheModelFactory
	 * @model opposite="theModelFactory" containment="true" required="true"
	 * @generated
	 */
	Domain getTheDomain();

	/**
	 * Sets the value of the '{@link pgr.ModelFactory#getTheDomain <em>The Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Domain</em>' containment reference.
	 * @see #getTheDomain()
	 * @generated
	 */
	void setTheDomain(Domain value);

	/**
	 * Returns the value of the '<em><b>The UI</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link pgr.ui.UI#getTheModelFactory <em>The Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The UI</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The UI</em>' containment reference.
	 * @see #setTheUI(UI)
	 * @see pgr.PgrPackage#getModelFactory_TheUI()
	 * @see pgr.ui.UI#getTheModelFactory
	 * @model opposite="theModelFactory" containment="true" required="true"
	 * @generated
	 */
	UI getTheUI();

	/**
	 * Sets the value of the '{@link pgr.ModelFactory#getTheUI <em>The UI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The UI</em>' containment reference.
	 * @see #getTheUI()
	 * @generated
	 */
	void setTheUI(UI value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tModelFactory modelFactory = null;\r\n\t\t\r\n\t\torg.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI(\"platform:/resource/PGR/models/production.pgr\");\r\n\t\torg.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();\r\n\t\torg.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);\r\n\t\ttry {\r\n\t\t\tresource.load(java.util.Collections.EMPTY_MAP);\r\n\t\t\tmodelFactory = (ModelFactory) resource.getContents().get(0);\r\n\t\t} catch (java.io.IOException e) {\r\n\t\t\t// TO-DO Auto-generated catch block\r\n\t\t\te.printStackTrace();\r\n\t\t}\r\n\r\n\t\treturn modelFactory;'"
	 * @generated
	 */
	ModelFactory load();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tModelFactory modelFactory = this;\r\n\t\t\r\n\t\torg.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI(\"platform:/resource/PGR/models/production.pgr\");\r\n\t\torg.eclipse.emf.ecore.resource.ResourceSet resourceSet= new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();\r\n\t\torg.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);\r\n\t\tresource.getContents().add(modelFactory);\r\n\t\ttry {\r\n\t\t\tresource.save(java.util.Collections.EMPTY_MAP);\r\n\t\t} catch (java.io.IOException e) {\r\n\t\t\t// TO-DO Auto-generated catch block\r\n\t\t\te.printStackTrace();\r\n\t\t}'"
	 * @generated
	 */
	void save();

} // ModelFactory
