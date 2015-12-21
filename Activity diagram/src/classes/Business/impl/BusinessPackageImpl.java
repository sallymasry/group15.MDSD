/**
 */
package classes.Business.impl;

import classes.Business.AccountHandler;
import classes.Business.BusinessFactory;
import classes.Business.BusinessPackage;
import classes.Business.CopyOf_Class1_1;
import classes.Business.PaymentDetails;
import classes.Business.PaymentHandler;
import classes.Business.PersonInfo;
import classes.Business.ReservationHandler;
import classes.Business.roomHandler;

import classes.Data.DataPackage;

import classes.Data.impl.DataPackageImpl;

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
public class BusinessPackageImpl extends EPackageImpl implements BusinessPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reservationHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass copyOf_Class1_1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accountHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentDetailsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personInfoEClass = null;

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
	 * @see classes.Business.BusinessPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BusinessPackageImpl() {
		super(eNS_URI, BusinessFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BusinessPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BusinessPackage init() {
		if (isInited) return (BusinessPackage)EPackage.Registry.INSTANCE.getEPackage(BusinessPackage.eNS_URI);

		// Obtain or create and register package
		BusinessPackageImpl theBusinessPackage = (BusinessPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BusinessPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BusinessPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ExternalPackageImpl theExternalPackage = (ExternalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExternalPackage.eNS_URI) instanceof ExternalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExternalPackage.eNS_URI) : ExternalPackage.eINSTANCE);
		DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
		PresentationPackageImpl thePresentationPackage = (PresentationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PresentationPackage.eNS_URI) instanceof PresentationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PresentationPackage.eNS_URI) : PresentationPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theBusinessPackage.createPackageContents();
		theExternalPackage.createPackageContents();
		theDataPackage.createPackageContents();
		thePresentationPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theBusinessPackage.initializePackageContents();
		theExternalPackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		thePresentationPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBusinessPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BusinessPackage.eNS_URI, theBusinessPackage);
		return theBusinessPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReservationHandler() {
		return reservationHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservationHandler_ArrDate() {
		return (EAttribute)reservationHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservationHandler_DepDate() {
		return (EAttribute)reservationHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservationHandler_ReservationNr() {
		return (EAttribute)reservationHandlerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservationHandler_Person() {
		return (EReference)reservationHandlerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservationHandler_Guests() {
		return (EReference)reservationHandlerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservationHandler_Roomhandler() {
		return (EReference)reservationHandlerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservationHandler_Reservation() {
		return (EReference)reservationHandlerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReservationHandler__AddRoom() {
		return reservationHandlerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReservationHandler__RemoveRoom() {
		return reservationHandlerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReservationHandler__AddReservation() {
		return reservationHandlerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReservationHandler__UpdateReservation() {
		return reservationHandlerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReservationHandler__RemoveReservation() {
		return reservationHandlerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReservationHandler__EditRoom() {
		return reservationHandlerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getroomHandler() {
		return roomHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getroomHandler_Availability() {
		return (EAttribute)roomHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getroomHandler_Roommanage() {
		return (EReference)roomHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getroomHandler__Checkavailability() {
		return roomHandlerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCopyOf_Class1_1() {
		return copyOf_Class1_1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccountHandler() {
		return accountHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccountHandler_Staffinfo() {
		return (EReference)accountHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccountHandler_Id() {
		return (EAttribute)accountHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccountHandler_Pass() {
		return (EAttribute)accountHandlerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAccountHandler__ValidateStaffInfo__String_String() {
		return accountHandlerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaymentHandler() {
		return paymentHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentHandler_Paymentinfo() {
		return (EReference)paymentHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentHandler_Paymentmanagment() {
		return (EReference)paymentHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentHandler_Paymentdetails() {
		return (EReference)paymentHandlerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPaymentHandler__MakePayment__PaymentDetails() {
		return paymentHandlerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaymentDetails() {
		return paymentDetailsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentDetails_FirstName() {
		return (EAttribute)paymentDetailsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentDetails_LastName() {
		return (EAttribute)paymentDetailsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentDetails_CarsNr() {
		return (EAttribute)paymentDetailsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentDetails_Ccv() {
		return (EAttribute)paymentDetailsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentDetails_ExpMonth() {
		return (EAttribute)paymentDetailsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPaymentDetails_ExpYear() {
		return (EAttribute)paymentDetailsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonInfo() {
		return personInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonInfo_IrstName() {
		return (EAttribute)personInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonInfo_LastName() {
		return (EAttribute)personInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonInfo_Adress() {
		return (EAttribute)personInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPersonInfo_PhoneNr() {
		return (EAttribute)personInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessFactory getBusinessFactory() {
		return (BusinessFactory)getEFactoryInstance();
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
		reservationHandlerEClass = createEClass(RESERVATION_HANDLER);
		createEAttribute(reservationHandlerEClass, RESERVATION_HANDLER__ARR_DATE);
		createEAttribute(reservationHandlerEClass, RESERVATION_HANDLER__DEP_DATE);
		createEAttribute(reservationHandlerEClass, RESERVATION_HANDLER__RESERVATION_NR);
		createEReference(reservationHandlerEClass, RESERVATION_HANDLER__PERSON);
		createEReference(reservationHandlerEClass, RESERVATION_HANDLER__GUESTS);
		createEReference(reservationHandlerEClass, RESERVATION_HANDLER__ROOMHANDLER);
		createEReference(reservationHandlerEClass, RESERVATION_HANDLER__RESERVATION);
		createEOperation(reservationHandlerEClass, RESERVATION_HANDLER___ADD_ROOM);
		createEOperation(reservationHandlerEClass, RESERVATION_HANDLER___REMOVE_ROOM);
		createEOperation(reservationHandlerEClass, RESERVATION_HANDLER___ADD_RESERVATION);
		createEOperation(reservationHandlerEClass, RESERVATION_HANDLER___UPDATE_RESERVATION);
		createEOperation(reservationHandlerEClass, RESERVATION_HANDLER___REMOVE_RESERVATION);
		createEOperation(reservationHandlerEClass, RESERVATION_HANDLER___EDIT_ROOM);

		roomHandlerEClass = createEClass(ROOM_HANDLER);
		createEAttribute(roomHandlerEClass, ROOM_HANDLER__AVAILABILITY);
		createEReference(roomHandlerEClass, ROOM_HANDLER__ROOMMANAGE);
		createEOperation(roomHandlerEClass, ROOM_HANDLER___CHECKAVAILABILITY);

		copyOf_Class1_1EClass = createEClass(COPY_OF_CLASS1_1);

		accountHandlerEClass = createEClass(ACCOUNT_HANDLER);
		createEReference(accountHandlerEClass, ACCOUNT_HANDLER__STAFFINFO);
		createEAttribute(accountHandlerEClass, ACCOUNT_HANDLER__ID);
		createEAttribute(accountHandlerEClass, ACCOUNT_HANDLER__PASS);
		createEOperation(accountHandlerEClass, ACCOUNT_HANDLER___VALIDATE_STAFF_INFO__STRING_STRING);

		paymentHandlerEClass = createEClass(PAYMENT_HANDLER);
		createEReference(paymentHandlerEClass, PAYMENT_HANDLER__PAYMENTINFO);
		createEReference(paymentHandlerEClass, PAYMENT_HANDLER__PAYMENTMANAGMENT);
		createEReference(paymentHandlerEClass, PAYMENT_HANDLER__PAYMENTDETAILS);
		createEOperation(paymentHandlerEClass, PAYMENT_HANDLER___MAKE_PAYMENT__PAYMENTDETAILS);

		paymentDetailsEClass = createEClass(PAYMENT_DETAILS);
		createEAttribute(paymentDetailsEClass, PAYMENT_DETAILS__FIRST_NAME);
		createEAttribute(paymentDetailsEClass, PAYMENT_DETAILS__LAST_NAME);
		createEAttribute(paymentDetailsEClass, PAYMENT_DETAILS__CARS_NR);
		createEAttribute(paymentDetailsEClass, PAYMENT_DETAILS__CCV);
		createEAttribute(paymentDetailsEClass, PAYMENT_DETAILS__EXP_MONTH);
		createEAttribute(paymentDetailsEClass, PAYMENT_DETAILS__EXP_YEAR);

		personInfoEClass = createEClass(PERSON_INFO);
		createEAttribute(personInfoEClass, PERSON_INFO__IRST_NAME);
		createEAttribute(personInfoEClass, PERSON_INFO__LAST_NAME);
		createEAttribute(personInfoEClass, PERSON_INFO__ADRESS);
		createEAttribute(personInfoEClass, PERSON_INFO__PHONE_NR);
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
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(reservationHandlerEClass, ReservationHandler.class, "ReservationHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReservationHandler_ArrDate(), theTypesPackage.getInteger(), "arrDate", null, 1, 1, ReservationHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReservationHandler_DepDate(), theTypesPackage.getInteger(), "DepDate", null, 1, 1, ReservationHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReservationHandler_ReservationNr(), theTypesPackage.getInteger(), "ReservationNr", null, 1, 1, ReservationHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReservationHandler_Person(), this.getPersonInfo(), null, "Person", null, 1, -1, ReservationHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReservationHandler_Guests(), this.getPersonInfo(), null, "Guests", null, 1, -1, ReservationHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReservationHandler_Roomhandler(), this.getroomHandler(), null, "roomhandler", null, 1, 1, ReservationHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReservationHandler_Reservation(), theDataPackage.getReservation(), null, "reservation", null, 1, 1, ReservationHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getReservationHandler__AddRoom(), null, "addRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getReservationHandler__RemoveRoom(), null, "removeRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getReservationHandler__AddReservation(), null, "addReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getReservationHandler__UpdateReservation(), null, "updateReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getReservationHandler__RemoveReservation(), null, "removeReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getReservationHandler__EditRoom(), null, "EditRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomHandlerEClass, roomHandler.class, "roomHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getroomHandler_Availability(), ecorePackage.getEBoolean(), "availability", null, 1, 1, roomHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getroomHandler_Roommanage(), theDataPackage.getRoomManage(), null, "roommanage", null, 1, 1, roomHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getroomHandler__Checkavailability(), null, "checkavailability", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(copyOf_Class1_1EClass, CopyOf_Class1_1.class, "CopyOf_Class1_1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accountHandlerEClass, AccountHandler.class, "AccountHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccountHandler_Staffinfo(), theDataPackage.getStaffDetails(), null, "staffinfo", null, 1, -1, AccountHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAccountHandler_Id(), ecorePackage.getEString(), "Id", null, 1, 1, AccountHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAccountHandler_Pass(), ecorePackage.getEString(), "pass", null, 1, 1, AccountHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getAccountHandler__ValidateStaffInfo__String_String(), ecorePackage.getEString(), "ValidateStaffInfo", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "Id", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "pass", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(paymentHandlerEClass, PaymentHandler.class, "PaymentHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPaymentHandler_Paymentinfo(), this.getPaymentDetails(), null, "paymentinfo", null, 1, 1, PaymentHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPaymentHandler_Paymentmanagment(), theDataPackage.getPaymentManagment(), null, "paymentmanagment", null, 1, 1, PaymentHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPaymentHandler_Paymentdetails(), this.getPaymentDetails(), null, "paymentdetails", null, 1, 1, PaymentHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getPaymentHandler__MakePayment__PaymentDetails(), null, "makePayment", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPaymentDetails(), "paymentsDetails", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(paymentDetailsEClass, PaymentDetails.class, "PaymentDetails", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPaymentDetails_FirstName(), ecorePackage.getEString(), "firstName", null, 1, 1, PaymentDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPaymentDetails_LastName(), ecorePackage.getEString(), "lastName", null, 1, 1, PaymentDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPaymentDetails_CarsNr(), ecorePackage.getEInt(), "carsNr", null, 1, 1, PaymentDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPaymentDetails_Ccv(), ecorePackage.getEInt(), "ccv", null, 1, 1, PaymentDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPaymentDetails_ExpMonth(), ecorePackage.getEInt(), "expMonth", null, 1, 1, PaymentDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPaymentDetails_ExpYear(), ecorePackage.getEInt(), "expYear", null, 1, 1, PaymentDetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(personInfoEClass, PersonInfo.class, "PersonInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersonInfo_IrstName(), ecorePackage.getEString(), "irstName", null, 1, 1, PersonInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPersonInfo_LastName(), ecorePackage.getEString(), "lastName", null, 1, 1, PersonInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPersonInfo_Adress(), ecorePackage.getEString(), "adress", null, 1, 1, PersonInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPersonInfo_PhoneNr(), ecorePackage.getEInt(), "phoneNr", null, 1, 1, PersonInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BusinessPackageImpl
