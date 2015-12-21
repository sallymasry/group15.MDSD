/**
 */
package classes.presentation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see classes.presentation.PresentationPackage
 * @generated
 */
public interface PresentationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PresentationFactory eINSTANCE = classes.presentation.impl.PresentationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>authentication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>authentication</em>'.
	 * @generated
	 */
	authentication createauthentication();

	/**
	 * Returns a new object of class '<em>Staff UI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Staff UI</em>'.
	 * @generated
	 */
	StaffUI createStaffUI();

	/**
	 * Returns a new object of class '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer</em>'.
	 * @generated
	 */
	Customer createCustomer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PresentationPackage getPresentationPackage();

} //PresentationFactory
