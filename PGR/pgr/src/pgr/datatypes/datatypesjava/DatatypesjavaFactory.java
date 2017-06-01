/**
 */
package pgr.datatypes.datatypesjava;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pgr.datatypes.datatypesjava.DatatypesjavaPackage
 * @generated
 */
public interface DatatypesjavaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatatypesjavaFactory eINSTANCE = pgr.datatypes.datatypesjava.impl.DatatypesjavaFactoryImpl.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DatatypesjavaPackage getDatatypesjavaPackage();

} //DatatypesjavaFactory
