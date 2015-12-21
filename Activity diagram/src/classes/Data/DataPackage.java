/**
 */
package classes.Data;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see classes.Data.DataFactory
 * @model kind="package"
 * @generated
 */
public interface DataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Data";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///classes/Data.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "classes.Data";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataPackage eINSTANCE = classes.Data.impl.DataPackageImpl.init();

	/**
	 * The meta object id for the '{@link classes.Data.impl.ReservationImpl <em>Reservation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see classes.Data.impl.ReservationImpl
	 * @see classes.Data.impl.DataPackageImpl#getReservation()
	 * @generated
	 */
	int RESERVATION = 0;

	/**
	 * The feature id for the '<em><b>Arr Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__ARR_DATE = 0;

	/**
	 * The feature id for the '<em><b>Dep Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__DEP_DATE = 1;

	/**
	 * The feature id for the '<em><b>Res Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__RES_NR = 2;

	/**
	 * The feature id for the '<em><b>Person Details</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__PERSON_DETAILS = 3;

	/**
	 * The feature id for the '<em><b>Roommanage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__ROOMMANAGE = 4;

	/**
	 * The feature id for the '<em><b>Statisticshandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__STATISTICSHANDLER = 5;

	/**
	 * The number of structural features of the '<em>Reservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Add Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION___ADD_ROOM = 0;

	/**
	 * The operation id for the '<em>Remove Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION___REMOVE_ROOM = 1;

	/**
	 * The operation id for the '<em>Create Res</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION___CREATE_RES = 2;

	/**
	 * The operation id for the '<em>Update Res</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION___UPDATE_RES = 3;

	/**
	 * The operation id for the '<em>Remove Res</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION___REMOVE_RES = 4;

	/**
	 * The operation id for the '<em>Add Payment Details</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION___ADD_PAYMENT_DETAILS = 5;

	/**
	 * The operation id for the '<em>Edir Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION___EDIR_ROOM = 6;

	/**
	 * The operation id for the '<em>Validate Res Nr</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION___VALIDATE_RES_NR = 7;

	/**
	 * The number of operations of the '<em>Reservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link classes.Data.impl.RoomManageImpl <em>Room Manage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see classes.Data.impl.RoomManageImpl
	 * @see classes.Data.impl.DataPackageImpl#getRoomManage()
	 * @generated
	 */
	int ROOM_MANAGE = 1;

	/**
	 * The feature id for the '<em><b>Room Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGE__ROOM_INFO = 0;

	/**
	 * The feature id for the '<em><b>Roomdetails</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGE__ROOMDETAILS = 1;

	/**
	 * The feature id for the '<em><b>Checkin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGE__CHECKIN_DATE = 2;

	/**
	 * The feature id for the '<em><b>Checkout Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGE__CHECKOUT_DATE = 3;

	/**
	 * The feature id for the '<em><b>Res Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGE__RES_NR = 4;

	/**
	 * The number of structural features of the '<em>Room Manage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGE_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Create Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGE___CREATE_ROOM__ROOMINFORMATION = 0;

	/**
	 * The operation id for the '<em>Update Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGE___UPDATE_ROOM__ROOMINFORMATION = 1;

	/**
	 * The operation id for the '<em>Remove Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGE___REMOVE_ROOM__ROOMINFORMATION = 2;

	/**
	 * The operation id for the '<em>Get Room Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGE___GET_ROOM_INFO__INT = 3;

	/**
	 * The operation id for the '<em>Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGE___CHECK_IN__INT_INT_INT = 4;

	/**
	 * The operation id for the '<em>Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGE___CHECK_OUT__INT = 5;

	/**
	 * The number of operations of the '<em>Room Manage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MANAGE_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link classes.Data.impl.roomInformationImpl <em>room Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see classes.Data.impl.roomInformationImpl
	 * @see classes.Data.impl.DataPackageImpl#getroomInformation()
	 * @generated
	 */
	int ROOM_INFORMATION = 2;

	/**
	 * The feature id for the '<em><b>Bedsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_INFORMATION__BEDSIZE = 0;

	/**
	 * The feature id for the '<em><b>Room Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_INFORMATION__ROOM_NR = 1;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_INFORMATION__PRICE = 2;

	/**
	 * The feature id for the '<em><b>Availbility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_INFORMATION__AVAILBILITY = 3;

	/**
	 * The feature id for the '<em><b>Access Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_INFORMATION__ACCESS_CARD = 4;

	/**
	 * The feature id for the '<em><b>Room Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_INFORMATION__ROOM_TYPE = 5;

	/**
	 * The number of structural features of the '<em>room Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_INFORMATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>room Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link classes.Data.impl.StaffDetailsImpl <em>Staff Details</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see classes.Data.impl.StaffDetailsImpl
	 * @see classes.Data.impl.DataPackageImpl#getStaffDetails()
	 * @generated
	 */
	int STAFF_DETAILS = 3;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_DETAILS__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_DETAILS__LAST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Phone Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_DETAILS__PHONE_NR = 2;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_DETAILS__ADDRESS = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_DETAILS__ID = 4;

	/**
	 * The feature id for the '<em><b>Pass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_DETAILS__PASS = 5;

	/**
	 * The number of structural features of the '<em>Staff Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_DETAILS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Staff Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_DETAILS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link classes.Data.impl.PaymentManagmentImpl <em>Payment Managment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see classes.Data.impl.PaymentManagmentImpl
	 * @see classes.Data.impl.DataPackageImpl#getPaymentManagment()
	 * @generated
	 */
	int PAYMENT_MANAGMENT = 4;

	/**
	 * The number of structural features of the '<em>Payment Managment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_MANAGMENT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Is Card Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_MANAGMENT___IS_CARD_VALID__PAYMENTDETAILS = 0;

	/**
	 * The number of operations of the '<em>Payment Managment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_MANAGMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link classes.Data.impl.StatisticsHandlerImpl <em>Statistics Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see classes.Data.impl.StatisticsHandlerImpl
	 * @see classes.Data.impl.DataPackageImpl#getStatisticsHandler()
	 * @generated
	 */
	int STATISTICS_HANDLER = 5;

	/**
	 * The feature id for the '<em><b>Reservation Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS_HANDLER__RESERVATION_NR = 0;

	/**
	 * The number of structural features of the '<em>Statistics Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS_HANDLER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Fetch Reservations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS_HANDLER___FETCH_RESERVATIONS = 0;

	/**
	 * The operation id for the '<em>Calculate Percentage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS_HANDLER___CALCULATE_PERCENTAGE = 1;

	/**
	 * The operation id for the '<em>Generate Diagram</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS_HANDLER___GENERATE_DIAGRAM = 2;

	/**
	 * The number of operations of the '<em>Statistics Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS_HANDLER_OPERATION_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link classes.Data.Reservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservation</em>'.
	 * @see classes.Data.Reservation
	 * @generated
	 */
	EClass getReservation();

	/**
	 * Returns the meta object for the attribute '{@link classes.Data.Reservation#getArrDate <em>Arr Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arr Date</em>'.
	 * @see classes.Data.Reservation#getArrDate()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_ArrDate();

	/**
	 * Returns the meta object for the attribute '{@link classes.Data.Reservation#getDepDate <em>Dep Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dep Date</em>'.
	 * @see classes.Data.Reservation#getDepDate()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_DepDate();

	/**
	 * Returns the meta object for the attribute '{@link classes.Data.Reservation#getResNr <em>Res Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Res Nr</em>'.
	 * @see classes.Data.Reservation#getResNr()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_ResNr();

	/**
	 * Returns the meta object for the reference '{@link classes.Data.Reservation#getPersonDetails <em>Person Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Person Details</em>'.
	 * @see classes.Data.Reservation#getPersonDetails()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_PersonDetails();

	/**
	 * Returns the meta object for the reference '{@link classes.Data.Reservation#getRoommanage <em>Roommanage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Roommanage</em>'.
	 * @see classes.Data.Reservation#getRoommanage()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_Roommanage();

	/**
	 * Returns the meta object for the reference '{@link classes.Data.Reservation#getStatisticshandler <em>Statisticshandler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Statisticshandler</em>'.
	 * @see classes.Data.Reservation#getStatisticshandler()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_Statisticshandler();

	/**
	 * Returns the meta object for the '{@link classes.Data.Reservation#addRoom() <em>Add Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room</em>' operation.
	 * @see classes.Data.Reservation#addRoom()
	 * @generated
	 */
	EOperation getReservation__AddRoom();

	/**
	 * Returns the meta object for the '{@link classes.Data.Reservation#removeRoom() <em>Remove Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room</em>' operation.
	 * @see classes.Data.Reservation#removeRoom()
	 * @generated
	 */
	EOperation getReservation__RemoveRoom();

	/**
	 * Returns the meta object for the '{@link classes.Data.Reservation#createRes() <em>Create Res</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Res</em>' operation.
	 * @see classes.Data.Reservation#createRes()
	 * @generated
	 */
	EOperation getReservation__CreateRes();

	/**
	 * Returns the meta object for the '{@link classes.Data.Reservation#updateRes() <em>Update Res</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Res</em>' operation.
	 * @see classes.Data.Reservation#updateRes()
	 * @generated
	 */
	EOperation getReservation__UpdateRes();

	/**
	 * Returns the meta object for the '{@link classes.Data.Reservation#removeRes() <em>Remove Res</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Res</em>' operation.
	 * @see classes.Data.Reservation#removeRes()
	 * @generated
	 */
	EOperation getReservation__RemoveRes();

	/**
	 * Returns the meta object for the '{@link classes.Data.Reservation#addPaymentDetails() <em>Add Payment Details</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Payment Details</em>' operation.
	 * @see classes.Data.Reservation#addPaymentDetails()
	 * @generated
	 */
	EOperation getReservation__AddPaymentDetails();

	/**
	 * Returns the meta object for the '{@link classes.Data.Reservation#edirRoom() <em>Edir Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edir Room</em>' operation.
	 * @see classes.Data.Reservation#edirRoom()
	 * @generated
	 */
	EOperation getReservation__EdirRoom();

	/**
	 * Returns the meta object for the '{@link classes.Data.Reservation#validateResNr() <em>Validate Res Nr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Res Nr</em>' operation.
	 * @see classes.Data.Reservation#validateResNr()
	 * @generated
	 */
	EOperation getReservation__ValidateResNr();

	/**
	 * Returns the meta object for class '{@link classes.Data.RoomManage <em>Room Manage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Manage</em>'.
	 * @see classes.Data.RoomManage
	 * @generated
	 */
	EClass getRoomManage();

	/**
	 * Returns the meta object for the reference '{@link classes.Data.RoomManage#getRoomInfo <em>Room Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room Info</em>'.
	 * @see classes.Data.RoomManage#getRoomInfo()
	 * @see #getRoomManage()
	 * @generated
	 */
	EReference getRoomManage_RoomInfo();

	/**
	 * Returns the meta object for the reference '{@link classes.Data.RoomManage#getRoomdetails <em>Roomdetails</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Roomdetails</em>'.
	 * @see classes.Data.RoomManage#getRoomdetails()
	 * @see #getRoomManage()
	 * @generated
	 */
	EReference getRoomManage_Roomdetails();

	/**
	 * Returns the meta object for the attribute '{@link classes.Data.RoomManage#getCheckinDate <em>Checkin Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checkin Date</em>'.
	 * @see classes.Data.RoomManage#getCheckinDate()
	 * @see #getRoomManage()
	 * @generated
	 */
	EAttribute getRoomManage_CheckinDate();

	/**
	 * Returns the meta object for the attribute '{@link classes.Data.RoomManage#getCheckoutDate <em>Checkout Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checkout Date</em>'.
	 * @see classes.Data.RoomManage#getCheckoutDate()
	 * @see #getRoomManage()
	 * @generated
	 */
	EAttribute getRoomManage_CheckoutDate();

	/**
	 * Returns the meta object for the attribute '{@link classes.Data.RoomManage#getResNr <em>Res Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Res Nr</em>'.
	 * @see classes.Data.RoomManage#getResNr()
	 * @see #getRoomManage()
	 * @generated
	 */
	EAttribute getRoomManage_ResNr();

	/**
	 * Returns the meta object for the '{@link classes.Data.RoomManage#createRoom(classes.Data.roomInformation) <em>Create Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Room</em>' operation.
	 * @see classes.Data.RoomManage#createRoom(classes.Data.roomInformation)
	 * @generated
	 */
	EOperation getRoomManage__CreateRoom__roomInformation();

	/**
	 * Returns the meta object for the '{@link classes.Data.RoomManage#updateRoom(classes.Data.roomInformation) <em>Update Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Room</em>' operation.
	 * @see classes.Data.RoomManage#updateRoom(classes.Data.roomInformation)
	 * @generated
	 */
	EOperation getRoomManage__UpdateRoom__roomInformation();

	/**
	 * Returns the meta object for the '{@link classes.Data.RoomManage#removeRoom(classes.Data.roomInformation) <em>Remove Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room</em>' operation.
	 * @see classes.Data.RoomManage#removeRoom(classes.Data.roomInformation)
	 * @generated
	 */
	EOperation getRoomManage__RemoveRoom__roomInformation();

	/**
	 * Returns the meta object for the '{@link classes.Data.RoomManage#getRoomInfo(int) <em>Get Room Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Info</em>' operation.
	 * @see classes.Data.RoomManage#getRoomInfo(int)
	 * @generated
	 */
	EOperation getRoomManage__GetRoomInfo__int();

	/**
	 * Returns the meta object for the '{@link classes.Data.RoomManage#checkIn(int, int, int) <em>Check In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check In</em>' operation.
	 * @see classes.Data.RoomManage#checkIn(int, int, int)
	 * @generated
	 */
	EOperation getRoomManage__CheckIn__int_int_int();

	/**
	 * Returns the meta object for the '{@link classes.Data.RoomManage#CheckOut(int) <em>Check Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Out</em>' operation.
	 * @see classes.Data.RoomManage#CheckOut(int)
	 * @generated
	 */
	EOperation getRoomManage__CheckOut__int();

	/**
	 * Returns the meta object for class '{@link classes.Data.roomInformation <em>room Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>room Information</em>'.
	 * @see classes.Data.roomInformation
	 * @generated
	 */
	EClass getroomInformation();

	/**
	 * Returns the meta object for the attribute '{@link classes.Data.roomInformation#getBedsize <em>Bedsize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bedsize</em>'.
	 * @see classes.Data.roomInformation#getBedsize()
	 * @see #getroomInformation()
	 * @generated
	 */
	EAttribute getroomInformation_Bedsize();

	/**
	 * Returns the meta object for the attribute '{@link classes.Data.roomInformation#getRoomNr <em>Room Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Nr</em>'.
	 * @see classes.Data.roomInformation#getRoomNr()
	 * @see #getroomInformation()
	 * @generated
	 */
	EAttribute getroomInformation_RoomNr();

	/**
	 * Returns the meta object for the attribute '{@link classes.Data.roomInformation#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see classes.Data.roomInformation#getPrice()
	 * @see #getroomInformation()
	 * @generated
	 */
	EAttribute getroomInformation_Price();

	/**
	 * Returns the meta object for the attribute '{@link classes.Data.roomInformation#isAvailbility <em>Availbility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availbility</em>'.
	 * @see classes.Data.roomInformation#isAvailbility()
	 * @see #getroomInformation()
	 * @generated
	 */
	EAttribute getroomInformation_Availbility();

	/**
	 * Returns the meta object for the attribute '{@link classes.Data.roomInformation#isAccessCard <em>Access Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Card</em>'.
	 * @see classes.Data.roomInformation#isAccessCard()
	 * @see #getroomInformation()
	 * @generated
	 */
	EAttribute getroomInformation_AccessCard();

	/**
	 * Returns the meta object for the attribute '{@link classes.Data.roomInformation#getRoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Type</em>'.
	 * @see classes.Data.roomInformation#getRoomType()
	 * @see #getroomInformation()
	 * @generated
	 */
	EAttribute getroomInformation_RoomType();

	/**
	 * Returns the meta object for class '{@link classes.Data.StaffDetails <em>Staff Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff Details</em>'.
	 * @see classes.Data.StaffDetails
	 * @generated
	 */
	EClass getStaffDetails();

	/**
	 * Returns the meta object for the attribute '{@link classes.Data.StaffDetails#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see classes.Data.StaffDetails#getFirstName()
	 * @see #getStaffDetails()
	 * @generated
	 */
	EAttribute getStaffDetails_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link classes.Data.StaffDetails#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see classes.Data.StaffDetails#getLastName()
	 * @see #getStaffDetails()
	 * @generated
	 */
	EAttribute getStaffDetails_LastName();

	/**
	 * Returns the meta object for the attribute '{@link classes.Data.StaffDetails#getPhoneNr <em>Phone Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone Nr</em>'.
	 * @see classes.Data.StaffDetails#getPhoneNr()
	 * @see #getStaffDetails()
	 * @generated
	 */
	EAttribute getStaffDetails_PhoneNr();

	/**
	 * Returns the meta object for the attribute '{@link classes.Data.StaffDetails#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see classes.Data.StaffDetails#getAddress()
	 * @see #getStaffDetails()
	 * @generated
	 */
	EAttribute getStaffDetails_Address();

	/**
	 * Returns the meta object for the attribute '{@link classes.Data.StaffDetails#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see classes.Data.StaffDetails#getId()
	 * @see #getStaffDetails()
	 * @generated
	 */
	EAttribute getStaffDetails_Id();

	/**
	 * Returns the meta object for the attribute '{@link classes.Data.StaffDetails#getPass <em>Pass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pass</em>'.
	 * @see classes.Data.StaffDetails#getPass()
	 * @see #getStaffDetails()
	 * @generated
	 */
	EAttribute getStaffDetails_Pass();

	/**
	 * Returns the meta object for class '{@link classes.Data.PaymentManagment <em>Payment Managment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment Managment</em>'.
	 * @see classes.Data.PaymentManagment
	 * @generated
	 */
	EClass getPaymentManagment();

	/**
	 * Returns the meta object for the '{@link classes.Data.PaymentManagment#isCardValid(classes.Business.PaymentDetails) <em>Is Card Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Card Valid</em>' operation.
	 * @see classes.Data.PaymentManagment#isCardValid(classes.Business.PaymentDetails)
	 * @generated
	 */
	EOperation getPaymentManagment__IsCardValid__PaymentDetails();

	/**
	 * Returns the meta object for class '{@link classes.Data.StatisticsHandler <em>Statistics Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statistics Handler</em>'.
	 * @see classes.Data.StatisticsHandler
	 * @generated
	 */
	EClass getStatisticsHandler();

	/**
	 * Returns the meta object for the attribute '{@link classes.Data.StatisticsHandler#getReservationNr <em>Reservation Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reservation Nr</em>'.
	 * @see classes.Data.StatisticsHandler#getReservationNr()
	 * @see #getStatisticsHandler()
	 * @generated
	 */
	EAttribute getStatisticsHandler_ReservationNr();

	/**
	 * Returns the meta object for the '{@link classes.Data.StatisticsHandler#fetchReservations() <em>Fetch Reservations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fetch Reservations</em>' operation.
	 * @see classes.Data.StatisticsHandler#fetchReservations()
	 * @generated
	 */
	EOperation getStatisticsHandler__FetchReservations();

	/**
	 * Returns the meta object for the '{@link classes.Data.StatisticsHandler#calculatePercentage() <em>Calculate Percentage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Percentage</em>' operation.
	 * @see classes.Data.StatisticsHandler#calculatePercentage()
	 * @generated
	 */
	EOperation getStatisticsHandler__CalculatePercentage();

	/**
	 * Returns the meta object for the '{@link classes.Data.StatisticsHandler#GenerateDiagram() <em>Generate Diagram</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Diagram</em>' operation.
	 * @see classes.Data.StatisticsHandler#GenerateDiagram()
	 * @generated
	 */
	EOperation getStatisticsHandler__GenerateDiagram();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataFactory getDataFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link classes.Data.impl.ReservationImpl <em>Reservation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see classes.Data.impl.ReservationImpl
		 * @see classes.Data.impl.DataPackageImpl#getReservation()
		 * @generated
		 */
		EClass RESERVATION = eINSTANCE.getReservation();

		/**
		 * The meta object literal for the '<em><b>Arr Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__ARR_DATE = eINSTANCE.getReservation_ArrDate();

		/**
		 * The meta object literal for the '<em><b>Dep Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__DEP_DATE = eINSTANCE.getReservation_DepDate();

		/**
		 * The meta object literal for the '<em><b>Res Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__RES_NR = eINSTANCE.getReservation_ResNr();

		/**
		 * The meta object literal for the '<em><b>Person Details</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION__PERSON_DETAILS = eINSTANCE.getReservation_PersonDetails();

		/**
		 * The meta object literal for the '<em><b>Roommanage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION__ROOMMANAGE = eINSTANCE.getReservation_Roommanage();

		/**
		 * The meta object literal for the '<em><b>Statisticshandler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION__STATISTICSHANDLER = eINSTANCE.getReservation_Statisticshandler();

		/**
		 * The meta object literal for the '<em><b>Add Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATION___ADD_ROOM = eINSTANCE.getReservation__AddRoom();

		/**
		 * The meta object literal for the '<em><b>Remove Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATION___REMOVE_ROOM = eINSTANCE.getReservation__RemoveRoom();

		/**
		 * The meta object literal for the '<em><b>Create Res</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATION___CREATE_RES = eINSTANCE.getReservation__CreateRes();

		/**
		 * The meta object literal for the '<em><b>Update Res</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATION___UPDATE_RES = eINSTANCE.getReservation__UpdateRes();

		/**
		 * The meta object literal for the '<em><b>Remove Res</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATION___REMOVE_RES = eINSTANCE.getReservation__RemoveRes();

		/**
		 * The meta object literal for the '<em><b>Add Payment Details</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATION___ADD_PAYMENT_DETAILS = eINSTANCE.getReservation__AddPaymentDetails();

		/**
		 * The meta object literal for the '<em><b>Edir Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATION___EDIR_ROOM = eINSTANCE.getReservation__EdirRoom();

		/**
		 * The meta object literal for the '<em><b>Validate Res Nr</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATION___VALIDATE_RES_NR = eINSTANCE.getReservation__ValidateResNr();

		/**
		 * The meta object literal for the '{@link classes.Data.impl.RoomManageImpl <em>Room Manage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see classes.Data.impl.RoomManageImpl
		 * @see classes.Data.impl.DataPackageImpl#getRoomManage()
		 * @generated
		 */
		EClass ROOM_MANAGE = eINSTANCE.getRoomManage();

		/**
		 * The meta object literal for the '<em><b>Room Info</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_MANAGE__ROOM_INFO = eINSTANCE.getRoomManage_RoomInfo();

		/**
		 * The meta object literal for the '<em><b>Roomdetails</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_MANAGE__ROOMDETAILS = eINSTANCE.getRoomManage_Roomdetails();

		/**
		 * The meta object literal for the '<em><b>Checkin Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_MANAGE__CHECKIN_DATE = eINSTANCE.getRoomManage_CheckinDate();

		/**
		 * The meta object literal for the '<em><b>Checkout Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_MANAGE__CHECKOUT_DATE = eINSTANCE.getRoomManage_CheckoutDate();

		/**
		 * The meta object literal for the '<em><b>Res Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_MANAGE__RES_NR = eINSTANCE.getRoomManage_ResNr();

		/**
		 * The meta object literal for the '<em><b>Create Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_MANAGE___CREATE_ROOM__ROOMINFORMATION = eINSTANCE.getRoomManage__CreateRoom__roomInformation();

		/**
		 * The meta object literal for the '<em><b>Update Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_MANAGE___UPDATE_ROOM__ROOMINFORMATION = eINSTANCE.getRoomManage__UpdateRoom__roomInformation();

		/**
		 * The meta object literal for the '<em><b>Remove Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_MANAGE___REMOVE_ROOM__ROOMINFORMATION = eINSTANCE.getRoomManage__RemoveRoom__roomInformation();

		/**
		 * The meta object literal for the '<em><b>Get Room Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_MANAGE___GET_ROOM_INFO__INT = eINSTANCE.getRoomManage__GetRoomInfo__int();

		/**
		 * The meta object literal for the '<em><b>Check In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_MANAGE___CHECK_IN__INT_INT_INT = eINSTANCE.getRoomManage__CheckIn__int_int_int();

		/**
		 * The meta object literal for the '<em><b>Check Out</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_MANAGE___CHECK_OUT__INT = eINSTANCE.getRoomManage__CheckOut__int();

		/**
		 * The meta object literal for the '{@link classes.Data.impl.roomInformationImpl <em>room Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see classes.Data.impl.roomInformationImpl
		 * @see classes.Data.impl.DataPackageImpl#getroomInformation()
		 * @generated
		 */
		EClass ROOM_INFORMATION = eINSTANCE.getroomInformation();

		/**
		 * The meta object literal for the '<em><b>Bedsize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_INFORMATION__BEDSIZE = eINSTANCE.getroomInformation_Bedsize();

		/**
		 * The meta object literal for the '<em><b>Room Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_INFORMATION__ROOM_NR = eINSTANCE.getroomInformation_RoomNr();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_INFORMATION__PRICE = eINSTANCE.getroomInformation_Price();

		/**
		 * The meta object literal for the '<em><b>Availbility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_INFORMATION__AVAILBILITY = eINSTANCE.getroomInformation_Availbility();

		/**
		 * The meta object literal for the '<em><b>Access Card</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_INFORMATION__ACCESS_CARD = eINSTANCE.getroomInformation_AccessCard();

		/**
		 * The meta object literal for the '<em><b>Room Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_INFORMATION__ROOM_TYPE = eINSTANCE.getroomInformation_RoomType();

		/**
		 * The meta object literal for the '{@link classes.Data.impl.StaffDetailsImpl <em>Staff Details</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see classes.Data.impl.StaffDetailsImpl
		 * @see classes.Data.impl.DataPackageImpl#getStaffDetails()
		 * @generated
		 */
		EClass STAFF_DETAILS = eINSTANCE.getStaffDetails();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_DETAILS__FIRST_NAME = eINSTANCE.getStaffDetails_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_DETAILS__LAST_NAME = eINSTANCE.getStaffDetails_LastName();

		/**
		 * The meta object literal for the '<em><b>Phone Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_DETAILS__PHONE_NR = eINSTANCE.getStaffDetails_PhoneNr();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_DETAILS__ADDRESS = eINSTANCE.getStaffDetails_Address();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_DETAILS__ID = eINSTANCE.getStaffDetails_Id();

		/**
		 * The meta object literal for the '<em><b>Pass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF_DETAILS__PASS = eINSTANCE.getStaffDetails_Pass();

		/**
		 * The meta object literal for the '{@link classes.Data.impl.PaymentManagmentImpl <em>Payment Managment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see classes.Data.impl.PaymentManagmentImpl
		 * @see classes.Data.impl.DataPackageImpl#getPaymentManagment()
		 * @generated
		 */
		EClass PAYMENT_MANAGMENT = eINSTANCE.getPaymentManagment();

		/**
		 * The meta object literal for the '<em><b>Is Card Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_MANAGMENT___IS_CARD_VALID__PAYMENTDETAILS = eINSTANCE.getPaymentManagment__IsCardValid__PaymentDetails();

		/**
		 * The meta object literal for the '{@link classes.Data.impl.StatisticsHandlerImpl <em>Statistics Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see classes.Data.impl.StatisticsHandlerImpl
		 * @see classes.Data.impl.DataPackageImpl#getStatisticsHandler()
		 * @generated
		 */
		EClass STATISTICS_HANDLER = eINSTANCE.getStatisticsHandler();

		/**
		 * The meta object literal for the '<em><b>Reservation Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTICS_HANDLER__RESERVATION_NR = eINSTANCE.getStatisticsHandler_ReservationNr();

		/**
		 * The meta object literal for the '<em><b>Fetch Reservations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATISTICS_HANDLER___FETCH_RESERVATIONS = eINSTANCE.getStatisticsHandler__FetchReservations();

		/**
		 * The meta object literal for the '<em><b>Calculate Percentage</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATISTICS_HANDLER___CALCULATE_PERCENTAGE = eINSTANCE.getStatisticsHandler__CalculatePercentage();

		/**
		 * The meta object literal for the '<em><b>Generate Diagram</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATISTICS_HANDLER___GENERATE_DIAGRAM = eINSTANCE.getStatisticsHandler__GenerateDiagram();

	}

} //DataPackage
