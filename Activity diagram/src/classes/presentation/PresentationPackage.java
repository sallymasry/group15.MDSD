/**
 */
package classes.presentation;

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
 * @see classes.presentation.PresentationFactory
 * @model kind="package"
 * @generated
 */
public interface PresentationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "presentation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///classes/presentation.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "classes.presentation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PresentationPackage eINSTANCE = classes.presentation.impl.PresentationPackageImpl.init();

	/**
	 * The meta object id for the '{@link classes.presentation.impl.authenticationImpl <em>authentication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see classes.presentation.impl.authenticationImpl
	 * @see classes.presentation.impl.PresentationPackageImpl#getauthentication()
	 * @generated
	 */
	int AUTHENTICATION = 0;

	/**
	 * The feature id for the '<em><b>Accounthandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__ACCOUNTHANDLER = 0;

	/**
	 * The feature id for the '<em><b>Staffui</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION__STAFFUI = 1;

	/**
	 * The number of structural features of the '<em>authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Log In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION___LOG_IN__STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Log Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION___LOG_OUT = 1;

	/**
	 * The number of operations of the '<em>authentication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link classes.presentation.impl.StaffUIImpl <em>Staff UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see classes.presentation.impl.StaffUIImpl
	 * @see classes.presentation.impl.PresentationPackageImpl#getStaffUI()
	 * @generated
	 */
	int STAFF_UI = 1;

	/**
	 * The feature id for the '<em><b>Reservationhandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_UI__RESERVATIONHANDLER = 0;

	/**
	 * The number of structural features of the '<em>Staff UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_UI_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Search Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_UI___SEARCH_ROOM_TYPE__STRING_INT_INT_INT = 0;

	/**
	 * The operation id for the '<em>Add Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_UI___ADD_ROOM = 1;

	/**
	 * The operation id for the '<em>Delete Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_UI___DELETE_ROOM = 2;

	/**
	 * The operation id for the '<em>Make Res</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_UI___MAKE_RES__STRING = 3;

	/**
	 * The operation id for the '<em>Edit Res</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_UI___EDIT_RES__INT = 4;

	/**
	 * The operation id for the '<em>Cancel Res</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_UI___CANCEL_RES = 5;

	/**
	 * The operation id for the '<em>Get Res Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_UI___GET_RES_INFO__INT = 6;

	/**
	 * The number of operations of the '<em>Staff UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_UI_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link classes.presentation.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see classes.presentation.impl.CustomerImpl
	 * @see classes.presentation.impl.PresentationPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 2;

	/**
	 * The feature id for the '<em><b>Reservationhandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__RESERVATIONHANDLER = 0;

	/**
	 * The feature id for the '<em><b>Paymenthandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PAYMENTHANDLER = 1;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Search Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___SEARCH_ROOM_TYPE = 0;

	/**
	 * The operation id for the '<em>Make Res</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___MAKE_RES = 1;

	/**
	 * The operation id for the '<em>Edit Res</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___EDIT_RES = 2;

	/**
	 * The operation id for the '<em>Cancel Res</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___CANCEL_RES = 3;

	/**
	 * The operation id for the '<em>Get Res Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___GET_RES_INFO__INT = 4;

	/**
	 * The operation id for the '<em>Get Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___GET_BILL = 5;

	/**
	 * The operation id for the '<em>Operation1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___OPERATION1 = 6;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link classes.presentation.MainUI <em>Main UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see classes.presentation.MainUI
	 * @see classes.presentation.impl.PresentationPackageImpl#getMainUI()
	 * @generated
	 */
	int MAIN_UI = 3;

	/**
	 * The number of structural features of the '<em>Main UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_UI_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Main UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_UI_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link classes.presentation.authentication <em>authentication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>authentication</em>'.
	 * @see classes.presentation.authentication
	 * @generated
	 */
	EClass getauthentication();

	/**
	 * Returns the meta object for the reference '{@link classes.presentation.authentication#getAccounthandler <em>Accounthandler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Accounthandler</em>'.
	 * @see classes.presentation.authentication#getAccounthandler()
	 * @see #getauthentication()
	 * @generated
	 */
	EReference getauthentication_Accounthandler();

	/**
	 * Returns the meta object for the reference '{@link classes.presentation.authentication#getStaffui <em>Staffui</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Staffui</em>'.
	 * @see classes.presentation.authentication#getStaffui()
	 * @see #getauthentication()
	 * @generated
	 */
	EReference getauthentication_Staffui();

	/**
	 * Returns the meta object for the '{@link classes.presentation.authentication#logIn(java.lang.String, java.lang.String) <em>Log In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Log In</em>' operation.
	 * @see classes.presentation.authentication#logIn(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getauthentication__LogIn__String_String();

	/**
	 * Returns the meta object for the '{@link classes.presentation.authentication#LogOut() <em>Log Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Log Out</em>' operation.
	 * @see classes.presentation.authentication#LogOut()
	 * @generated
	 */
	EOperation getauthentication__LogOut();

	/**
	 * Returns the meta object for class '{@link classes.presentation.StaffUI <em>Staff UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff UI</em>'.
	 * @see classes.presentation.StaffUI
	 * @generated
	 */
	EClass getStaffUI();

	/**
	 * Returns the meta object for the reference '{@link classes.presentation.StaffUI#getReservationhandler <em>Reservationhandler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reservationhandler</em>'.
	 * @see classes.presentation.StaffUI#getReservationhandler()
	 * @see #getStaffUI()
	 * @generated
	 */
	EReference getStaffUI_Reservationhandler();

	/**
	 * Returns the meta object for the '{@link classes.presentation.StaffUI#searchRoomType(java.lang.String, int, int, int) <em>Search Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Room Type</em>' operation.
	 * @see classes.presentation.StaffUI#searchRoomType(java.lang.String, int, int, int)
	 * @generated
	 */
	EOperation getStaffUI__SearchRoomType__String_int_int_int();

	/**
	 * Returns the meta object for the '{@link classes.presentation.StaffUI#addRoom() <em>Add Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room</em>' operation.
	 * @see classes.presentation.StaffUI#addRoom()
	 * @generated
	 */
	EOperation getStaffUI__AddRoom();

	/**
	 * Returns the meta object for the '{@link classes.presentation.StaffUI#deleteRoom() <em>Delete Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Room</em>' operation.
	 * @see classes.presentation.StaffUI#deleteRoom()
	 * @generated
	 */
	EOperation getStaffUI__DeleteRoom();

	/**
	 * Returns the meta object for the '{@link classes.presentation.StaffUI#makeRes(java.lang.String) <em>Make Res</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Res</em>' operation.
	 * @see classes.presentation.StaffUI#makeRes(java.lang.String)
	 * @generated
	 */
	EOperation getStaffUI__MakeRes__String();

	/**
	 * Returns the meta object for the '{@link classes.presentation.StaffUI#editRes(int) <em>Edit Res</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Res</em>' operation.
	 * @see classes.presentation.StaffUI#editRes(int)
	 * @generated
	 */
	EOperation getStaffUI__EditRes__int();

	/**
	 * Returns the meta object for the '{@link classes.presentation.StaffUI#cancelRes() <em>Cancel Res</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel Res</em>' operation.
	 * @see classes.presentation.StaffUI#cancelRes()
	 * @generated
	 */
	EOperation getStaffUI__CancelRes();

	/**
	 * Returns the meta object for the '{@link classes.presentation.StaffUI#getResInfo(int) <em>Get Res Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Res Info</em>' operation.
	 * @see classes.presentation.StaffUI#getResInfo(int)
	 * @generated
	 */
	EOperation getStaffUI__GetResInfo__int();

	/**
	 * Returns the meta object for class '{@link classes.presentation.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see classes.presentation.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the reference '{@link classes.presentation.Customer#getReservationhandler <em>Reservationhandler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reservationhandler</em>'.
	 * @see classes.presentation.Customer#getReservationhandler()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Reservationhandler();

	/**
	 * Returns the meta object for the reference '{@link classes.presentation.Customer#getPaymenthandler <em>Paymenthandler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Paymenthandler</em>'.
	 * @see classes.presentation.Customer#getPaymenthandler()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Paymenthandler();

	/**
	 * Returns the meta object for the '{@link classes.presentation.Customer#searchRoomType() <em>Search Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Room Type</em>' operation.
	 * @see classes.presentation.Customer#searchRoomType()
	 * @generated
	 */
	EOperation getCustomer__SearchRoomType();

	/**
	 * Returns the meta object for the '{@link classes.presentation.Customer#makeRes() <em>Make Res</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Res</em>' operation.
	 * @see classes.presentation.Customer#makeRes()
	 * @generated
	 */
	EOperation getCustomer__MakeRes();

	/**
	 * Returns the meta object for the '{@link classes.presentation.Customer#editRes() <em>Edit Res</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Edit Res</em>' operation.
	 * @see classes.presentation.Customer#editRes()
	 * @generated
	 */
	EOperation getCustomer__EditRes();

	/**
	 * Returns the meta object for the '{@link classes.presentation.Customer#cancelRes() <em>Cancel Res</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel Res</em>' operation.
	 * @see classes.presentation.Customer#cancelRes()
	 * @generated
	 */
	EOperation getCustomer__CancelRes();

	/**
	 * Returns the meta object for the '{@link classes.presentation.Customer#getResInfo(int) <em>Get Res Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Res Info</em>' operation.
	 * @see classes.presentation.Customer#getResInfo(int)
	 * @generated
	 */
	EOperation getCustomer__GetResInfo__int();

	/**
	 * Returns the meta object for the '{@link classes.presentation.Customer#getBill() <em>Get Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bill</em>' operation.
	 * @see classes.presentation.Customer#getBill()
	 * @generated
	 */
	EOperation getCustomer__GetBill();

	/**
	 * Returns the meta object for the '{@link classes.presentation.Customer#Operation1() <em>Operation1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Operation1</em>' operation.
	 * @see classes.presentation.Customer#Operation1()
	 * @generated
	 */
	EOperation getCustomer__Operation1();

	/**
	 * Returns the meta object for class '{@link classes.presentation.MainUI <em>Main UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main UI</em>'.
	 * @see classes.presentation.MainUI
	 * @generated
	 */
	EClass getMainUI();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PresentationFactory getPresentationFactory();

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
		 * The meta object literal for the '{@link classes.presentation.impl.authenticationImpl <em>authentication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see classes.presentation.impl.authenticationImpl
		 * @see classes.presentation.impl.PresentationPackageImpl#getauthentication()
		 * @generated
		 */
		EClass AUTHENTICATION = eINSTANCE.getauthentication();

		/**
		 * The meta object literal for the '<em><b>Accounthandler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHENTICATION__ACCOUNTHANDLER = eINSTANCE.getauthentication_Accounthandler();

		/**
		 * The meta object literal for the '<em><b>Staffui</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHENTICATION__STAFFUI = eINSTANCE.getauthentication_Staffui();

		/**
		 * The meta object literal for the '<em><b>Log In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AUTHENTICATION___LOG_IN__STRING_STRING = eINSTANCE.getauthentication__LogIn__String_String();

		/**
		 * The meta object literal for the '<em><b>Log Out</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AUTHENTICATION___LOG_OUT = eINSTANCE.getauthentication__LogOut();

		/**
		 * The meta object literal for the '{@link classes.presentation.impl.StaffUIImpl <em>Staff UI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see classes.presentation.impl.StaffUIImpl
		 * @see classes.presentation.impl.PresentationPackageImpl#getStaffUI()
		 * @generated
		 */
		EClass STAFF_UI = eINSTANCE.getStaffUI();

		/**
		 * The meta object literal for the '<em><b>Reservationhandler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAFF_UI__RESERVATIONHANDLER = eINSTANCE.getStaffUI_Reservationhandler();

		/**
		 * The meta object literal for the '<em><b>Search Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_UI___SEARCH_ROOM_TYPE__STRING_INT_INT_INT = eINSTANCE.getStaffUI__SearchRoomType__String_int_int_int();

		/**
		 * The meta object literal for the '<em><b>Add Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_UI___ADD_ROOM = eINSTANCE.getStaffUI__AddRoom();

		/**
		 * The meta object literal for the '<em><b>Delete Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_UI___DELETE_ROOM = eINSTANCE.getStaffUI__DeleteRoom();

		/**
		 * The meta object literal for the '<em><b>Make Res</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_UI___MAKE_RES__STRING = eINSTANCE.getStaffUI__MakeRes__String();

		/**
		 * The meta object literal for the '<em><b>Edit Res</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_UI___EDIT_RES__INT = eINSTANCE.getStaffUI__EditRes__int();

		/**
		 * The meta object literal for the '<em><b>Cancel Res</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_UI___CANCEL_RES = eINSTANCE.getStaffUI__CancelRes();

		/**
		 * The meta object literal for the '<em><b>Get Res Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAFF_UI___GET_RES_INFO__INT = eINSTANCE.getStaffUI__GetResInfo__int();

		/**
		 * The meta object literal for the '{@link classes.presentation.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see classes.presentation.impl.CustomerImpl
		 * @see classes.presentation.impl.PresentationPackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>Reservationhandler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__RESERVATIONHANDLER = eINSTANCE.getCustomer_Reservationhandler();

		/**
		 * The meta object literal for the '<em><b>Paymenthandler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__PAYMENTHANDLER = eINSTANCE.getCustomer_Paymenthandler();

		/**
		 * The meta object literal for the '<em><b>Search Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___SEARCH_ROOM_TYPE = eINSTANCE.getCustomer__SearchRoomType();

		/**
		 * The meta object literal for the '<em><b>Make Res</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___MAKE_RES = eINSTANCE.getCustomer__MakeRes();

		/**
		 * The meta object literal for the '<em><b>Edit Res</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___EDIT_RES = eINSTANCE.getCustomer__EditRes();

		/**
		 * The meta object literal for the '<em><b>Cancel Res</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___CANCEL_RES = eINSTANCE.getCustomer__CancelRes();

		/**
		 * The meta object literal for the '<em><b>Get Res Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___GET_RES_INFO__INT = eINSTANCE.getCustomer__GetResInfo__int();

		/**
		 * The meta object literal for the '<em><b>Get Bill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___GET_BILL = eINSTANCE.getCustomer__GetBill();

		/**
		 * The meta object literal for the '<em><b>Operation1</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___OPERATION1 = eINSTANCE.getCustomer__Operation1();

		/**
		 * The meta object literal for the '{@link classes.presentation.MainUI <em>Main UI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see classes.presentation.MainUI
		 * @see classes.presentation.impl.PresentationPackageImpl#getMainUI()
		 * @generated
		 */
		EClass MAIN_UI = eINSTANCE.getMainUI();

	}

} //PresentationPackage
