/**
 */
package classes.Business;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see classes.Business.BusinessPackage
 * @generated
 */
public interface BusinessFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BusinessFactory eINSTANCE = classes.Business.impl.BusinessFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Reservation Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reservation Handler</em>'.
	 * @generated
	 */
	ReservationHandler createReservationHandler();

	/**
	 * Returns a new object of class '<em>room Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>room Handler</em>'.
	 * @generated
	 */
	roomHandler createroomHandler();

	/**
	 * Returns a new object of class '<em>Copy Of Class1 1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Copy Of Class1 1</em>'.
	 * @generated
	 */
	CopyOf_Class1_1 createCopyOf_Class1_1();

	/**
	 * Returns a new object of class '<em>Account Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Account Handler</em>'.
	 * @generated
	 */
	AccountHandler createAccountHandler();

	/**
	 * Returns a new object of class '<em>Payment Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payment Handler</em>'.
	 * @generated
	 */
	PaymentHandler createPaymentHandler();

	/**
	 * Returns a new object of class '<em>Payment Details</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payment Details</em>'.
	 * @generated
	 */
	PaymentDetails createPaymentDetails();

	/**
	 * Returns a new object of class '<em>Person Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person Info</em>'.
	 * @generated
	 */
	PersonInfo createPersonInfo();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BusinessPackage getBusinessPackage();

} //BusinessFactory
