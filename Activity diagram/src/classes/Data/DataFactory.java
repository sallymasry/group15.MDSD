/**
 */
package classes.Data;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see classes.Data.DataPackage
 * @generated
 */
public interface DataFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataFactory eINSTANCE = classes.Data.impl.DataFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Reservation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reservation</em>'.
	 * @generated
	 */
	Reservation createReservation();

	/**
	 * Returns a new object of class '<em>Room Manage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Manage</em>'.
	 * @generated
	 */
	RoomManage createRoomManage();

	/**
	 * Returns a new object of class '<em>room Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>room Information</em>'.
	 * @generated
	 */
	roomInformation createroomInformation();

	/**
	 * Returns a new object of class '<em>Staff Details</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Staff Details</em>'.
	 * @generated
	 */
	StaffDetails createStaffDetails();

	/**
	 * Returns a new object of class '<em>Payment Managment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payment Managment</em>'.
	 * @generated
	 */
	PaymentManagment createPaymentManagment();

	/**
	 * Returns a new object of class '<em>Statistics Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statistics Handler</em>'.
	 * @generated
	 */
	StatisticsHandler createStatisticsHandler();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DataPackage getDataPackage();

} //DataFactory
