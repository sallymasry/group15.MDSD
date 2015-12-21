/**
 */
package classes.Business;

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
 * @see classes.Business.BusinessFactory
 * @model kind="package"
 * @generated
 */
public interface BusinessPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Business";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///classes/Business.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "classes.Business";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BusinessPackage eINSTANCE = classes.Business.impl.BusinessPackageImpl.init();

	/**
	 * The meta object id for the '{@link classes.Business.impl.ReservationHandlerImpl <em>Reservation Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see classes.Business.impl.ReservationHandlerImpl
	 * @see classes.Business.impl.BusinessPackageImpl#getReservationHandler()
	 * @generated
	 */
	int RESERVATION_HANDLER = 0;

	/**
	 * The feature id for the '<em><b>Arr Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_HANDLER__ARR_DATE = 0;

	/**
	 * The feature id for the '<em><b>Dep Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_HANDLER__DEP_DATE = 1;

	/**
	 * The feature id for the '<em><b>Reservation Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_HANDLER__RESERVATION_NR = 2;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_HANDLER__PERSON = 3;

	/**
	 * The feature id for the '<em><b>Guests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_HANDLER__GUESTS = 4;

	/**
	 * The feature id for the '<em><b>Roomhandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_HANDLER__ROOMHANDLER = 5;

	/**
	 * The feature id for the '<em><b>Reservation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_HANDLER__RESERVATION = 6;

	/**
	 * The number of structural features of the '<em>Reservation Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_HANDLER_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Add Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_HANDLER___ADD_ROOM = 0;

	/**
	 * The operation id for the '<em>Remove Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_HANDLER___REMOVE_ROOM = 1;

	/**
	 * The operation id for the '<em>Add Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_HANDLER___ADD_RESERVATION = 2;

	/**
	 * The operation id for the '<em>Update Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_HANDLER___UPDATE_RESERVATION = 3;

	/**
	 * The operation id for the '<em>Remove Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_HANDLER___REMOVE_RESERVATION = 4;

	/**
	 * The operation id for the '<em>Edit Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_HANDLER___EDIT_ROOM = 5;

	/**
	 * The number of operations of the '<em>Reservation Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_HANDLER_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link classes.Business.impl.roomHandlerImpl <em>room Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see classes.Business.impl.roomHandlerImpl
	 * @see classes.Business.impl.BusinessPackageImpl#getroomHandler()
	 * @generated
	 */
	int ROOM_HANDLER = 1;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER__AVAILABILITY = 0;

	/**
	 * The feature id for the '<em><b>Roommanage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER__ROOMMANAGE = 1;

	/**
	 * The number of structural features of the '<em>room Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Checkavailability</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER___CHECKAVAILABILITY = 0;

	/**
	 * The number of operations of the '<em>room Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link classes.Business.impl.CopyOf_Class1_1Impl <em>Copy Of Class1 1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see classes.Business.impl.CopyOf_Class1_1Impl
	 * @see classes.Business.impl.BusinessPackageImpl#getCopyOf_Class1_1()
	 * @generated
	 */
	int COPY_OF_CLASS1_1 = 2;

	/**
	 * The number of structural features of the '<em>Copy Of Class1 1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_OF_CLASS1_1_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Copy Of Class1 1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_OF_CLASS1_1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link classes.Business.impl.AccountHandlerImpl <em>Account Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see classes.Business.impl.AccountHandlerImpl
	 * @see classes.Business.impl.BusinessPackageImpl#getAccountHandler()
	 * @generated
	 */
	int ACCOUNT_HANDLER = 3;

	/**
	 * The feature id for the '<em><b>Staffinfo</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_HANDLER__STAFFINFO = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_HANDLER__ID = 1;

	/**
	 * The feature id for the '<em><b>Pass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_HANDLER__PASS = 2;

	/**
	 * The number of structural features of the '<em>Account Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_HANDLER_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Validate Staff Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_HANDLER___VALIDATE_STAFF_INFO__STRING_STRING = 0;

	/**
	 * The number of operations of the '<em>Account Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_HANDLER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link classes.Business.impl.PaymentHandlerImpl <em>Payment Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see classes.Business.impl.PaymentHandlerImpl
	 * @see classes.Business.impl.BusinessPackageImpl#getPaymentHandler()
	 * @generated
	 */
	int PAYMENT_HANDLER = 4;

	/**
	 * The feature id for the '<em><b>Paymentinfo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_HANDLER__PAYMENTINFO = 0;

	/**
	 * The feature id for the '<em><b>Paymentmanagment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_HANDLER__PAYMENTMANAGMENT = 1;

	/**
	 * The feature id for the '<em><b>Paymentdetails</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_HANDLER__PAYMENTDETAILS = 2;

	/**
	 * The number of structural features of the '<em>Payment Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_HANDLER_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Make Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_HANDLER___MAKE_PAYMENT__PAYMENTDETAILS = 0;

	/**
	 * The number of operations of the '<em>Payment Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_HANDLER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link classes.Business.impl.PaymentDetailsImpl <em>Payment Details</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see classes.Business.impl.PaymentDetailsImpl
	 * @see classes.Business.impl.BusinessPackageImpl#getPaymentDetails()
	 * @generated
	 */
	int PAYMENT_DETAILS = 5;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DETAILS__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DETAILS__LAST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Cars Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DETAILS__CARS_NR = 2;

	/**
	 * The feature id for the '<em><b>Ccv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DETAILS__CCV = 3;

	/**
	 * The feature id for the '<em><b>Exp Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DETAILS__EXP_MONTH = 4;

	/**
	 * The feature id for the '<em><b>Exp Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DETAILS__EXP_YEAR = 5;

	/**
	 * The number of structural features of the '<em>Payment Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DETAILS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Payment Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_DETAILS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link classes.Business.impl.PersonInfoImpl <em>Person Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see classes.Business.impl.PersonInfoImpl
	 * @see classes.Business.impl.BusinessPackageImpl#getPersonInfo()
	 * @generated
	 */
	int PERSON_INFO = 6;

	/**
	 * The feature id for the '<em><b>Irst Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_INFO__IRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_INFO__LAST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_INFO__ADRESS = 2;

	/**
	 * The feature id for the '<em><b>Phone Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_INFO__PHONE_NR = 3;

	/**
	 * The number of structural features of the '<em>Person Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_INFO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Person Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_INFO_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link classes.Business.ReservationHandler <em>Reservation Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservation Handler</em>'.
	 * @see classes.Business.ReservationHandler
	 * @generated
	 */
	EClass getReservationHandler();

	/**
	 * Returns the meta object for the attribute '{@link classes.Business.ReservationHandler#getArrDate <em>Arr Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arr Date</em>'.
	 * @see classes.Business.ReservationHandler#getArrDate()
	 * @see #getReservationHandler()
	 * @generated
	 */
	EAttribute getReservationHandler_ArrDate();

	/**
	 * Returns the meta object for the attribute '{@link classes.Business.ReservationHandler#getDepDate <em>Dep Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dep Date</em>'.
	 * @see classes.Business.ReservationHandler#getDepDate()
	 * @see #getReservationHandler()
	 * @generated
	 */
	EAttribute getReservationHandler_DepDate();

	/**
	 * Returns the meta object for the attribute '{@link classes.Business.ReservationHandler#getReservationNr <em>Reservation Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reservation Nr</em>'.
	 * @see classes.Business.ReservationHandler#getReservationNr()
	 * @see #getReservationHandler()
	 * @generated
	 */
	EAttribute getReservationHandler_ReservationNr();

	/**
	 * Returns the meta object for the reference list '{@link classes.Business.ReservationHandler#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Person</em>'.
	 * @see classes.Business.ReservationHandler#getPerson()
	 * @see #getReservationHandler()
	 * @generated
	 */
	EReference getReservationHandler_Person();

	/**
	 * Returns the meta object for the reference list '{@link classes.Business.ReservationHandler#getGuests <em>Guests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Guests</em>'.
	 * @see classes.Business.ReservationHandler#getGuests()
	 * @see #getReservationHandler()
	 * @generated
	 */
	EReference getReservationHandler_Guests();

	/**
	 * Returns the meta object for the reference '{@link classes.Business.ReservationHandler#getRoomhandler <em>Roomhandler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Roomhandler</em>'.
	 * @see classes.Business.ReservationHandler#getRoomhandler()
	 * @see #getReservationHandler()
	 * @generated
	 */
	EReference getReservationHandler_Roomhandler();

	/**
	 * Returns the meta object for the reference '{@link classes.Business.ReservationHandler#getReservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reservation</em>'.
	 * @see classes.Business.ReservationHandler#getReservation()
	 * @see #getReservationHandler()
	 * @generated
	 */
	EReference getReservationHandler_Reservation();

	/**
	 * Returns the meta object for the '{@link classes.Business.ReservationHandler#addRoom() <em>Add Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room</em>' operation.
	 * @see classes.Business.ReservationHandler#addRoom()
	 * @generated
	 */
	EOperation getReservationHandler__AddRoom();

	/**
	 * Returns the meta object for the '{@link classes.Business.ReservationHandler#removeRoom() <em>Remove Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room</em>' operation.
	 * @see classes.Business.ReservationHandler#removeRoom()
	 * @generated
	 */
	EOperation getReservationHandler__RemoveRoom();

	/**
	 * Returns the meta object for the '{@link classes.Business.ReservationHandler#addReservation() <em>Add Reservation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Reservation</em>' operation.
	 * @see classes.Business.ReservationHandler#addReservation()
	 * @generated
	 */
	EOperation getReservationHandler__AddReservation();

	/**
	 * Returns the meta object for the '{@link classes.Business.ReservationHandler#updateReservation() <em>Update Reservation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Reservation</em>' operation.
	 * @see classes.Business.ReservationHandler#updateReservation()
	 * @generated
	 */
	EOperation getReservationHandler__UpdateReservation();

	/**
	 * Returns the meta object for the '{@link classes.Business.ReservationHandler#removeReservation() <em>Remove Reservation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Reservation</em>' operation.
	 * @see classes.Business.ReservationHandler#removeReservation()
	 * @generated
	 */
	EOperation getReservationHandler__RemoveReservation();

	/**
	 * Returns the meta object for the '{@link classes.Business.ReservationHandler#EditRoom() <em>Edit Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Room</em>' operation.
	 * @see classes.Business.ReservationHandler#EditRoom()
	 * @generated
	 */
	EOperation getReservationHandler__EditRoom();

	/**
	 * Returns the meta object for class '{@link classes.Business.roomHandler <em>room Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>room Handler</em>'.
	 * @see classes.Business.roomHandler
	 * @generated
	 */
	EClass getroomHandler();

	/**
	 * Returns the meta object for the attribute '{@link classes.Business.roomHandler#isAvailability <em>Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability</em>'.
	 * @see classes.Business.roomHandler#isAvailability()
	 * @see #getroomHandler()
	 * @generated
	 */
	EAttribute getroomHandler_Availability();

	/**
	 * Returns the meta object for the reference '{@link classes.Business.roomHandler#getRoommanage <em>Roommanage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Roommanage</em>'.
	 * @see classes.Business.roomHandler#getRoommanage()
	 * @see #getroomHandler()
	 * @generated
	 */
	EReference getroomHandler_Roommanage();

	/**
	 * Returns the meta object for the '{@link classes.Business.roomHandler#checkavailability() <em>Checkavailability</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Checkavailability</em>' operation.
	 * @see classes.Business.roomHandler#checkavailability()
	 * @generated
	 */
	EOperation getroomHandler__Checkavailability();

	/**
	 * Returns the meta object for class '{@link classes.Business.CopyOf_Class1_1 <em>Copy Of Class1 1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Copy Of Class1 1</em>'.
	 * @see classes.Business.CopyOf_Class1_1
	 * @generated
	 */
	EClass getCopyOf_Class1_1();

	/**
	 * Returns the meta object for class '{@link classes.Business.AccountHandler <em>Account Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account Handler</em>'.
	 * @see classes.Business.AccountHandler
	 * @generated
	 */
	EClass getAccountHandler();

	/**
	 * Returns the meta object for the reference list '{@link classes.Business.AccountHandler#getStaffinfo <em>Staffinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Staffinfo</em>'.
	 * @see classes.Business.AccountHandler#getStaffinfo()
	 * @see #getAccountHandler()
	 * @generated
	 */
	EReference getAccountHandler_Staffinfo();

	/**
	 * Returns the meta object for the attribute '{@link classes.Business.AccountHandler#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see classes.Business.AccountHandler#getId()
	 * @see #getAccountHandler()
	 * @generated
	 */
	EAttribute getAccountHandler_Id();

	/**
	 * Returns the meta object for the attribute '{@link classes.Business.AccountHandler#getPass <em>Pass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pass</em>'.
	 * @see classes.Business.AccountHandler#getPass()
	 * @see #getAccountHandler()
	 * @generated
	 */
	EAttribute getAccountHandler_Pass();

	/**
	 * Returns the meta object for the '{@link classes.Business.AccountHandler#ValidateStaffInfo(java.lang.String, java.lang.String) <em>Validate Staff Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Staff Info</em>' operation.
	 * @see classes.Business.AccountHandler#ValidateStaffInfo(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getAccountHandler__ValidateStaffInfo__String_String();

	/**
	 * Returns the meta object for class '{@link classes.Business.PaymentHandler <em>Payment Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment Handler</em>'.
	 * @see classes.Business.PaymentHandler
	 * @generated
	 */
	EClass getPaymentHandler();

	/**
	 * Returns the meta object for the reference '{@link classes.Business.PaymentHandler#getPaymentinfo <em>Paymentinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Paymentinfo</em>'.
	 * @see classes.Business.PaymentHandler#getPaymentinfo()
	 * @see #getPaymentHandler()
	 * @generated
	 */
	EReference getPaymentHandler_Paymentinfo();

	/**
	 * Returns the meta object for the reference '{@link classes.Business.PaymentHandler#getPaymentmanagment <em>Paymentmanagment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Paymentmanagment</em>'.
	 * @see classes.Business.PaymentHandler#getPaymentmanagment()
	 * @see #getPaymentHandler()
	 * @generated
	 */
	EReference getPaymentHandler_Paymentmanagment();

	/**
	 * Returns the meta object for the reference '{@link classes.Business.PaymentHandler#getPaymentdetails <em>Paymentdetails</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Paymentdetails</em>'.
	 * @see classes.Business.PaymentHandler#getPaymentdetails()
	 * @see #getPaymentHandler()
	 * @generated
	 */
	EReference getPaymentHandler_Paymentdetails();

	/**
	 * Returns the meta object for the '{@link classes.Business.PaymentHandler#makePayment(classes.Business.PaymentDetails) <em>Make Payment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Payment</em>' operation.
	 * @see classes.Business.PaymentHandler#makePayment(classes.Business.PaymentDetails)
	 * @generated
	 */
	EOperation getPaymentHandler__MakePayment__PaymentDetails();

	/**
	 * Returns the meta object for class '{@link classes.Business.PaymentDetails <em>Payment Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment Details</em>'.
	 * @see classes.Business.PaymentDetails
	 * @generated
	 */
	EClass getPaymentDetails();

	/**
	 * Returns the meta object for the attribute '{@link classes.Business.PaymentDetails#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see classes.Business.PaymentDetails#getFirstName()
	 * @see #getPaymentDetails()
	 * @generated
	 */
	EAttribute getPaymentDetails_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link classes.Business.PaymentDetails#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see classes.Business.PaymentDetails#getLastName()
	 * @see #getPaymentDetails()
	 * @generated
	 */
	EAttribute getPaymentDetails_LastName();

	/**
	 * Returns the meta object for the attribute '{@link classes.Business.PaymentDetails#getCarsNr <em>Cars Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cars Nr</em>'.
	 * @see classes.Business.PaymentDetails#getCarsNr()
	 * @see #getPaymentDetails()
	 * @generated
	 */
	EAttribute getPaymentDetails_CarsNr();

	/**
	 * Returns the meta object for the attribute '{@link classes.Business.PaymentDetails#getCcv <em>Ccv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ccv</em>'.
	 * @see classes.Business.PaymentDetails#getCcv()
	 * @see #getPaymentDetails()
	 * @generated
	 */
	EAttribute getPaymentDetails_Ccv();

	/**
	 * Returns the meta object for the attribute '{@link classes.Business.PaymentDetails#getExpMonth <em>Exp Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exp Month</em>'.
	 * @see classes.Business.PaymentDetails#getExpMonth()
	 * @see #getPaymentDetails()
	 * @generated
	 */
	EAttribute getPaymentDetails_ExpMonth();

	/**
	 * Returns the meta object for the attribute '{@link classes.Business.PaymentDetails#getExpYear <em>Exp Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exp Year</em>'.
	 * @see classes.Business.PaymentDetails#getExpYear()
	 * @see #getPaymentDetails()
	 * @generated
	 */
	EAttribute getPaymentDetails_ExpYear();

	/**
	 * Returns the meta object for class '{@link classes.Business.PersonInfo <em>Person Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Info</em>'.
	 * @see classes.Business.PersonInfo
	 * @generated
	 */
	EClass getPersonInfo();

	/**
	 * Returns the meta object for the attribute '{@link classes.Business.PersonInfo#getIrstName <em>Irst Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Irst Name</em>'.
	 * @see classes.Business.PersonInfo#getIrstName()
	 * @see #getPersonInfo()
	 * @generated
	 */
	EAttribute getPersonInfo_IrstName();

	/**
	 * Returns the meta object for the attribute '{@link classes.Business.PersonInfo#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see classes.Business.PersonInfo#getLastName()
	 * @see #getPersonInfo()
	 * @generated
	 */
	EAttribute getPersonInfo_LastName();

	/**
	 * Returns the meta object for the attribute '{@link classes.Business.PersonInfo#getAdress <em>Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adress</em>'.
	 * @see classes.Business.PersonInfo#getAdress()
	 * @see #getPersonInfo()
	 * @generated
	 */
	EAttribute getPersonInfo_Adress();

	/**
	 * Returns the meta object for the attribute '{@link classes.Business.PersonInfo#getPhoneNr <em>Phone Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone Nr</em>'.
	 * @see classes.Business.PersonInfo#getPhoneNr()
	 * @see #getPersonInfo()
	 * @generated
	 */
	EAttribute getPersonInfo_PhoneNr();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BusinessFactory getBusinessFactory();

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
		 * The meta object literal for the '{@link classes.Business.impl.ReservationHandlerImpl <em>Reservation Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see classes.Business.impl.ReservationHandlerImpl
		 * @see classes.Business.impl.BusinessPackageImpl#getReservationHandler()
		 * @generated
		 */
		EClass RESERVATION_HANDLER = eINSTANCE.getReservationHandler();

		/**
		 * The meta object literal for the '<em><b>Arr Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_HANDLER__ARR_DATE = eINSTANCE.getReservationHandler_ArrDate();

		/**
		 * The meta object literal for the '<em><b>Dep Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_HANDLER__DEP_DATE = eINSTANCE.getReservationHandler_DepDate();

		/**
		 * The meta object literal for the '<em><b>Reservation Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION_HANDLER__RESERVATION_NR = eINSTANCE.getReservationHandler_ReservationNr();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION_HANDLER__PERSON = eINSTANCE.getReservationHandler_Person();

		/**
		 * The meta object literal for the '<em><b>Guests</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION_HANDLER__GUESTS = eINSTANCE.getReservationHandler_Guests();

		/**
		 * The meta object literal for the '<em><b>Roomhandler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION_HANDLER__ROOMHANDLER = eINSTANCE.getReservationHandler_Roomhandler();

		/**
		 * The meta object literal for the '<em><b>Reservation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION_HANDLER__RESERVATION = eINSTANCE.getReservationHandler_Reservation();

		/**
		 * The meta object literal for the '<em><b>Add Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATION_HANDLER___ADD_ROOM = eINSTANCE.getReservationHandler__AddRoom();

		/**
		 * The meta object literal for the '<em><b>Remove Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATION_HANDLER___REMOVE_ROOM = eINSTANCE.getReservationHandler__RemoveRoom();

		/**
		 * The meta object literal for the '<em><b>Add Reservation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATION_HANDLER___ADD_RESERVATION = eINSTANCE.getReservationHandler__AddReservation();

		/**
		 * The meta object literal for the '<em><b>Update Reservation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATION_HANDLER___UPDATE_RESERVATION = eINSTANCE.getReservationHandler__UpdateReservation();

		/**
		 * The meta object literal for the '<em><b>Remove Reservation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATION_HANDLER___REMOVE_RESERVATION = eINSTANCE.getReservationHandler__RemoveReservation();

		/**
		 * The meta object literal for the '<em><b>Edit Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESERVATION_HANDLER___EDIT_ROOM = eINSTANCE.getReservationHandler__EditRoom();

		/**
		 * The meta object literal for the '{@link classes.Business.impl.roomHandlerImpl <em>room Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see classes.Business.impl.roomHandlerImpl
		 * @see classes.Business.impl.BusinessPackageImpl#getroomHandler()
		 * @generated
		 */
		EClass ROOM_HANDLER = eINSTANCE.getroomHandler();

		/**
		 * The meta object literal for the '<em><b>Availability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_HANDLER__AVAILABILITY = eINSTANCE.getroomHandler_Availability();

		/**
		 * The meta object literal for the '<em><b>Roommanage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_HANDLER__ROOMMANAGE = eINSTANCE.getroomHandler_Roommanage();

		/**
		 * The meta object literal for the '<em><b>Checkavailability</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_HANDLER___CHECKAVAILABILITY = eINSTANCE.getroomHandler__Checkavailability();

		/**
		 * The meta object literal for the '{@link classes.Business.impl.CopyOf_Class1_1Impl <em>Copy Of Class1 1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see classes.Business.impl.CopyOf_Class1_1Impl
		 * @see classes.Business.impl.BusinessPackageImpl#getCopyOf_Class1_1()
		 * @generated
		 */
		EClass COPY_OF_CLASS1_1 = eINSTANCE.getCopyOf_Class1_1();

		/**
		 * The meta object literal for the '{@link classes.Business.impl.AccountHandlerImpl <em>Account Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see classes.Business.impl.AccountHandlerImpl
		 * @see classes.Business.impl.BusinessPackageImpl#getAccountHandler()
		 * @generated
		 */
		EClass ACCOUNT_HANDLER = eINSTANCE.getAccountHandler();

		/**
		 * The meta object literal for the '<em><b>Staffinfo</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT_HANDLER__STAFFINFO = eINSTANCE.getAccountHandler_Staffinfo();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT_HANDLER__ID = eINSTANCE.getAccountHandler_Id();

		/**
		 * The meta object literal for the '<em><b>Pass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT_HANDLER__PASS = eINSTANCE.getAccountHandler_Pass();

		/**
		 * The meta object literal for the '<em><b>Validate Staff Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACCOUNT_HANDLER___VALIDATE_STAFF_INFO__STRING_STRING = eINSTANCE.getAccountHandler__ValidateStaffInfo__String_String();

		/**
		 * The meta object literal for the '{@link classes.Business.impl.PaymentHandlerImpl <em>Payment Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see classes.Business.impl.PaymentHandlerImpl
		 * @see classes.Business.impl.BusinessPackageImpl#getPaymentHandler()
		 * @generated
		 */
		EClass PAYMENT_HANDLER = eINSTANCE.getPaymentHandler();

		/**
		 * The meta object literal for the '<em><b>Paymentinfo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_HANDLER__PAYMENTINFO = eINSTANCE.getPaymentHandler_Paymentinfo();

		/**
		 * The meta object literal for the '<em><b>Paymentmanagment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_HANDLER__PAYMENTMANAGMENT = eINSTANCE.getPaymentHandler_Paymentmanagment();

		/**
		 * The meta object literal for the '<em><b>Paymentdetails</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_HANDLER__PAYMENTDETAILS = eINSTANCE.getPaymentHandler_Paymentdetails();

		/**
		 * The meta object literal for the '<em><b>Make Payment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PAYMENT_HANDLER___MAKE_PAYMENT__PAYMENTDETAILS = eINSTANCE.getPaymentHandler__MakePayment__PaymentDetails();

		/**
		 * The meta object literal for the '{@link classes.Business.impl.PaymentDetailsImpl <em>Payment Details</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see classes.Business.impl.PaymentDetailsImpl
		 * @see classes.Business.impl.BusinessPackageImpl#getPaymentDetails()
		 * @generated
		 */
		EClass PAYMENT_DETAILS = eINSTANCE.getPaymentDetails();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_DETAILS__FIRST_NAME = eINSTANCE.getPaymentDetails_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_DETAILS__LAST_NAME = eINSTANCE.getPaymentDetails_LastName();

		/**
		 * The meta object literal for the '<em><b>Cars Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_DETAILS__CARS_NR = eINSTANCE.getPaymentDetails_CarsNr();

		/**
		 * The meta object literal for the '<em><b>Ccv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_DETAILS__CCV = eINSTANCE.getPaymentDetails_Ccv();

		/**
		 * The meta object literal for the '<em><b>Exp Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_DETAILS__EXP_MONTH = eINSTANCE.getPaymentDetails_ExpMonth();

		/**
		 * The meta object literal for the '<em><b>Exp Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_DETAILS__EXP_YEAR = eINSTANCE.getPaymentDetails_ExpYear();

		/**
		 * The meta object literal for the '{@link classes.Business.impl.PersonInfoImpl <em>Person Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see classes.Business.impl.PersonInfoImpl
		 * @see classes.Business.impl.BusinessPackageImpl#getPersonInfo()
		 * @generated
		 */
		EClass PERSON_INFO = eINSTANCE.getPersonInfo();

		/**
		 * The meta object literal for the '<em><b>Irst Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_INFO__IRST_NAME = eINSTANCE.getPersonInfo_IrstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_INFO__LAST_NAME = eINSTANCE.getPersonInfo_LastName();

		/**
		 * The meta object literal for the '<em><b>Adress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_INFO__ADRESS = eINSTANCE.getPersonInfo_Adress();

		/**
		 * The meta object literal for the '<em><b>Phone Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_INFO__PHONE_NR = eINSTANCE.getPersonInfo_PhoneNr();

	}

} //BusinessPackage
