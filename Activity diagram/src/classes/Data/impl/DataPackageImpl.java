/**
 */
package classes.Data.impl;

import classes.Business.BusinessPackage;

import classes.Business.impl.BusinessPackageImpl;

import classes.Data.DataFactory;
import classes.Data.DataPackage;
import classes.Data.PaymentManagment;
import classes.Data.Reservation;
import classes.Data.RoomManage;
import classes.Data.StaffDetails;
import classes.Data.StatisticsHandler;
import classes.Data.roomInformation;

import classes.External.ExternalPackage;

import classes.External.impl.ExternalPackageImpl;

import classes.presentation.PresentationPackage;

import classes.presentation.impl.PresentationPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.types.impl.TypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataPackageImpl extends EPackageImpl implements DataPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomManageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staffDetailsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentManagmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statisticsHandlerEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see classes.Data.DataPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DataPackageImpl() {
		super(eNS_URI, DataFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DataPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataPackage init() {
		if (isInited) return (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);

		// Obtain or create and register package
		DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DataPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ExternalPackageImpl theExternalPackage = (ExternalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExternalPackage.eNS_URI) instanceof ExternalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExternalPackage.eNS_URI) : ExternalPackage.eINSTANCE);
		BusinessPackageImpl theBusinessPackage = (BusinessPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BusinessPackage.eNS_URI) instanceof BusinessPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BusinessPackage.eNS_URI) : BusinessPackage.eINSTANCE);
		PresentationPackageImpl thePresentationPackage = (PresentationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PresentationPackage.eNS_URI) instanceof PresentationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PresentationPackage.eNS_URI) : PresentationPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theDataPackage.createPackageContents();
		theExternalPackage.createPackageContents();
		theBusinessPackage.createPackageContents();
		thePresentationPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theDataPackage.initializePackageContents();
		theExternalPackage.initializePackageContents();
		theBusinessPackage.initializePackageContents();
		thePresentationPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDataPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataPackage.eNS_URI, theDataPackage);
		return theDataPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReservation() {
		return reservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservation_ArrDate() {
		return (EAttribute)reservationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservation_DepDate() {
		return (EAttribute)reservationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservation_ResNr() {
		return (EAttribute)reservationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservation_PersonDetails() {
		return (EReference)reservationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservation_Roommanage() {
		return (EReference)reservationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservation_Statisticshandler() {
		return (EReference)reservationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReservation__AddRoom() {
		return reservationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReservation__RemoveRoom() {
		return reservationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReservation__CreateRes() {
		return reservationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReservation__UpdateRes() {
		return reservationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReservation__RemoveRes() {
		return reservationEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReservation__AddPaymentDetails() {
		return reservationEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReservation__EdirRoom() {
		return reservationEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReservation__ValidateResNr() {
		return reservationEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomManage() {
		return roomManageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomManage_RoomInfo() {
		return (EReference)roomManageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomManage_Roomdetails() {
		return (EReference)roomManageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomManage_CheckinDate() {
		return (EAttribute)roomManageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomManage_CheckoutDate() {
		return (EAttribute)roomManageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomManage_ResNr() {
		return (EAttribute)roomManageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomManage__CreateRoom__roomInformation() {
		return roomManageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomManage__UpdateRoom__roomInformation() {
		return roomManageEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomManage__RemoveRoom__roomInformation() {
		return roomManageEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomManage__GetRoomInfo__int() {
		return roomManageEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomManage__CheckIn__int_int_int() {
		return roomManageEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomManage__CheckOut__int() {
		return roomManageEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getroomInformation() {
		return roomInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getroomInformation_Bedsize() {
		return (EAttribute)roomInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getroomInformation_RoomNr() {
		return (EAttribute)roomInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getroomInformation_Price() {
		return (EAttribute)roomInformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getroomInformation_Availbility() {
		return (EAttribute)roomInformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getroomInformation_AccessCard() {
		return (EAttribute)roomInformationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getroomInformation_RoomType() {
		return (EAttribute)roomInformationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaffDetails() {
		return staffDetailsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaffDetails_FirstName() {
		return (EAttribute)staffDetailsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaffDetails_LastName() {
		return (EAttribute)staffDetailsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaffDetails_PhoneNr() {
		return (EAttribute)staffDetailsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaffDetails_Address() {
		return (EAttribute)staffDetailsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaffDetails_Id() {
		return (EAttribute)staffDetailsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaffDetails_Pass() {
		return (EAttribute)staffDetailsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaymentManagment() {
		return paymentManagmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPaymentManagment__IsCardValid__PaymentDetails() {
		return paymentManagmentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatisticsHandler() {
		return statisticsHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatisticsHandler_ReservationNr() {
		return (EAttribute)statisticsHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStatisticsHandler__FetchReservations() {
		return statisticsHandlerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStatisticsHandler__CalculatePercentage() {
		return statisticsHandlerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStatisticsHandler__GenerateDiagram() {
		return statisticsHandlerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFactory getDataFactory() {
		return (DataFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		reservationEClass = createEClass(RESERVATION);
		createEAttribute(reservationEClass, RESERVATION__ARR_DATE);
		createEAttribute(reservationEClass, RESERVATION__DEP_DATE);
		createEAttribute(reservationEClass, RESERVATION__RES_NR);
		createEReference(reservationEClass, RESERVATION__PERSON_DETAILS);
		createEReference(reservationEClass, RESERVATION__ROOMMANAGE);
		createEReference(reservationEClass, RESERVATION__STATISTICSHANDLER);
		createEOperation(reservationEClass, RESERVATION___ADD_ROOM);
		createEOperation(reservationEClass, RESERVATION___REMOVE_ROOM);
		createEOperation(reservationEClass, RESERVATION___CREATE_RES);
		createEOperation(reservationEClass, RESERVATION___UPDATE_RES);
		createEOperation(reservationEClass, RESERVATION___REMOVE_RES);
		createEOperation(reservationEClass, RESERVATION___ADD_PAYMENT_DETAILS);
		createEOperation(reservationEClass, RESERVATION___EDIR_ROOM);
		createEOperation(reservationEClass, RESERVATION___VALIDATE_RES_NR);

		roomManageEClass = createEClass(ROOM_MANAGE);
		createEReference(roomManageEClass, ROOM_MANAGE__ROOM_INFO);
		createEReference(roomManageEClass, ROOM_MANAGE__ROOMDETAILS);
		createEAttribute(roomManageEClass, ROOM_MANAGE__CHECKIN_DATE);
		createEAttribute(roomManageEClass, ROOM_MANAGE__CHECKOUT_DATE);
		createEAttribute(roomManageEClass, ROOM_MANAGE__RES_NR);
		createEOperation(roomManageEClass, ROOM_MANAGE___CREATE_ROOM__ROOMINFORMATION);
		createEOperation(roomManageEClass, ROOM_MANAGE___UPDATE_ROOM__ROOMINFORMATION);
		createEOperation(roomManageEClass, ROOM_MANAGE___REMOVE_ROOM__ROOMINFORMATION);
		createEOperation(roomManageEClass, ROOM_MANAGE___GET_ROOM_INFO__INT);
		createEOperation(roomManageEClass, ROOM_MANAGE___CHECK_IN__INT_INT_INT);
		createEOperation(roomManageEClass, ROOM_MANAGE___CHECK_OUT__INT);

		roomInformationEClass = createEClass(ROOM_INFORMATION);
		createEAttribute(roomInformationEClass, ROOM_INFORMATION__BEDSIZE);
		createEAttribute(roomInformationEClass, ROOM_INFORMATION__ROOM_NR);
		createEAttribute(roomInformationEClass, ROOM_INFORMATION__PRICE);
		createEAttribute(roomInformationEClass, ROOM_INFORMATION__AVAILBILITY);
		createEAttribute(roomInformationEClass, ROOM_INFORMATION__ACCESS_CARD);
		createEAttribute(roomInformationEClass, ROOM_INFORMATION__ROOM_TYPE);

		staffDetailsEClass = createEClass(STAFF_DETAILS);
		createEAttribute(staffDetailsEClass, STAFF_DETAILS__FIRST_NAME);
		createEAttribute(staffDetailsEClass, STAFF_DETAILS__LAST_NAME);
		createEAttribute(staffDetailsEClass, STAFF_DETAILS__PHONE_NR);
		createEAttribute(staffDetailsEClass, STAFF_DETAILS__ADDRESS);
		createEAttribute(staffDetailsEClass, STAFF_DETAILS__ID);
		createEAttribute(staffDetailsEClass, STAFF_DETAILS__PASS);

		paymentManagmentEClass = createEClass(PAYMENT_MANAGMENT);
		createEOperation(paymentManagmentEClass, PAYMENT_MANAGMENT___IS_CARD_VALID__PAYMENTDETAILS);

		statisticsHandlerEClass = createEClass(STATISTICS_HANDLER);
		createEAttribute(statisticsHandlerEClass, STATISTICS_HANDLER__RESERVATION_NR);
		createEOperation(statisticsHandlerEClass, STATISTICS_HANDLER___FETCH_RESERVATIONS);
		createEOperation(statisticsHandlerEClass, STATISTICS_HANDLER___CALCULATE_PERCENTAGE);
		createEOperation(statisticsHandlerEClass, STATISTICS_HANDLER___GENERATE_DIAGRAM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BusinessPackage theBusinessPackage = (BusinessPackage)EPackage.Registry.INSTANCE.getEPackage(BusinessPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(reservationEClass, Reservation.class, "Reservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReservation_ArrDate(), ecorePackage.getEInt(), "arrDate", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReservation_DepDate(), ecorePackage.getEInt(), "depDate", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReservation_ResNr(), ecorePackage.getEInt(), "resNr", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReservation_PersonDetails(), theBusinessPackage.getPersonInfo(), null, "personDetails", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReservation_Roommanage(), this.getRoomManage(), null, "roommanage", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReservation_Statisticshandler(), this.getStatisticsHandler(), null, "statisticshandler", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getReservation__AddRoom(), null, "addRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getReservation__RemoveRoom(), null, "removeRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getReservation__CreateRes(), null, "createRes", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getReservation__UpdateRes(), null, "updateRes", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getReservation__RemoveRes(), null, "removeRes", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getReservation__AddPaymentDetails(), null, "addPaymentDetails", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getReservation__EdirRoom(), null, "edirRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getReservation__ValidateResNr(), null, "validateResNr", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomManageEClass, RoomManage.class, "RoomManage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoomManage_RoomInfo(), this.getroomInformation(), null, "roomInfo", null, 1, 1, RoomManage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomManage_Roomdetails(), this.getroomInformation(), null, "roomdetails", null, 1, 1, RoomManage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomManage_CheckinDate(), ecorePackage.getEInt(), "checkinDate", null, 1, 1, RoomManage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomManage_CheckoutDate(), ecorePackage.getEInt(), "checkoutDate", null, 1, 1, RoomManage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomManage_ResNr(), ecorePackage.getEInt(), "resNr", null, 1, 1, RoomManage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getRoomManage__CreateRoom__roomInformation(), null, "createRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getroomInformation(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomManage__UpdateRoom__roomInformation(), null, "updateRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getroomInformation(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomManage__RemoveRoom__roomInformation(), null, "removeRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getroomInformation(), "room", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomManage__GetRoomInfo__int(), this.getroomInformation(), "getRoomInfo", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "roomNr", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomManage__CheckIn__int_int_int(), null, "checkIn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "arrDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "depDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "resNr", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomManage__CheckOut__int(), null, "CheckOut", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "resNr", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomInformationEClass, roomInformation.class, "roomInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getroomInformation_Bedsize(), ecorePackage.getEString(), "bedsize", null, 1, 1, roomInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getroomInformation_RoomNr(), theTypesPackage.getInteger(), "roomNr", null, 1, 1, roomInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getroomInformation_Price(), theTypesPackage.getInteger(), "price", null, 1, 1, roomInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getroomInformation_Availbility(), theTypesPackage.getBoolean(), "Availbility", null, 1, 1, roomInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getroomInformation_AccessCard(), ecorePackage.getEBoolean(), "AccessCard", null, 1, 1, roomInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getroomInformation_RoomType(), ecorePackage.getEString(), "roomType", null, 1, 1, roomInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(staffDetailsEClass, StaffDetails.class, "StaffDetails", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStaffDetails_FirstName(), ecorePackage.getEString(), "firstName", null, 1, 1, StaffDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStaffDetails_LastName(), ecorePackage.getEString(), "lastName", null, 1, 1, StaffDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStaffDetails_PhoneNr(), ecorePackage.getEInt(), "phoneNr", null, 1, 1, StaffDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStaffDetails_Address(), ecorePackage.getEString(), "address", null, 1, 1, StaffDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStaffDetails_Id(), ecorePackage.getEString(), "Id", null, 1, 1, StaffDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStaffDetails_Pass(), ecorePackage.getEString(), "pass", null, 1, 1, StaffDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(paymentManagmentEClass, PaymentManagment.class, "PaymentManagment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getPaymentManagment__IsCardValid__PaymentDetails(), null, "isCardValid", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theBusinessPackage.getPaymentDetails(), "paymentDetails", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(statisticsHandlerEClass, StatisticsHandler.class, "StatisticsHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatisticsHandler_ReservationNr(), ecorePackage.getEInt(), "ReservationNr", null, 1, 1, StatisticsHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getStatisticsHandler__FetchReservations(), null, "fetchReservations", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getStatisticsHandler__CalculatePercentage(), null, "calculatePercentage", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getStatisticsHandler__GenerateDiagram(), null, "GenerateDiagram", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DataPackageImpl
