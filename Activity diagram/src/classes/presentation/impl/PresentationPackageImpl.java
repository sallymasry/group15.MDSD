/**
 */
package classes.presentation.impl;

import classes.Business.BusinessPackage;

import classes.Business.impl.BusinessPackageImpl;

import classes.Data.DataPackage;

import classes.Data.impl.DataPackageImpl;

import classes.External.ExternalPackage;

import classes.External.impl.ExternalPackageImpl;

import classes.presentation.Customer;
import classes.presentation.MainUI;
import classes.presentation.PresentationFactory;
import classes.presentation.PresentationPackage;
import classes.presentation.StaffUI;
import classes.presentation.authentication;

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
public class PresentationPackageImpl extends EPackageImpl implements PresentationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staffUIEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mainUIEClass = null;

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
	 * @see classes.presentation.PresentationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PresentationPackageImpl() {
		super(eNS_URI, PresentationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PresentationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PresentationPackage init() {
		if (isInited) return (PresentationPackage)EPackage.Registry.INSTANCE.getEPackage(PresentationPackage.eNS_URI);

		// Obtain or create and register package
		PresentationPackageImpl thePresentationPackage = (PresentationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PresentationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PresentationPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ExternalPackageImpl theExternalPackage = (ExternalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExternalPackage.eNS_URI) instanceof ExternalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExternalPackage.eNS_URI) : ExternalPackage.eINSTANCE);
		DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
		BusinessPackageImpl theBusinessPackage = (BusinessPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BusinessPackage.eNS_URI) instanceof BusinessPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BusinessPackage.eNS_URI) : BusinessPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		thePresentationPackage.createPackageContents();
		theExternalPackage.createPackageContents();
		theDataPackage.createPackageContents();
		theBusinessPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		thePresentationPackage.initializePackageContents();
		theExternalPackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theBusinessPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePresentationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PresentationPackage.eNS_URI, thePresentationPackage);
		return thePresentationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getauthentication() {
		return authenticationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getauthentication_Accounthandler() {
		return (EReference)authenticationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getauthentication_Staffui() {
		return (EReference)authenticationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getauthentication__LogIn__String_String() {
		return authenticationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getauthentication__LogOut() {
		return authenticationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaffUI() {
		return staffUIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaffUI_Reservationhandler() {
		return (EReference)staffUIEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaffUI__SearchRoomType__String_int_int_int() {
		return staffUIEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaffUI__AddRoom() {
		return staffUIEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaffUI__DeleteRoom() {
		return staffUIEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaffUI__MakeRes__String() {
		return staffUIEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaffUI__EditRes__int() {
		return staffUIEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaffUI__CancelRes() {
		return staffUIEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaffUI__GetResInfo__int() {
		return staffUIEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomer() {
		return customerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomer_Reservationhandler() {
		return (EReference)customerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomer_Paymenthandler() {
		return (EReference)customerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__SearchRoomType() {
		return customerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__MakeRes() {
		return customerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__EditRes() {
		return customerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__CancelRes() {
		return customerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__GetResInfo__int() {
		return customerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__GetBill() {
		return customerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__Operation1() {
		return customerEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMainUI() {
		return mainUIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationFactory getPresentationFactory() {
		return (PresentationFactory)getEFactoryInstance();
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
		authenticationEClass = createEClass(AUTHENTICATION);
		createEReference(authenticationEClass, AUTHENTICATION__ACCOUNTHANDLER);
		createEReference(authenticationEClass, AUTHENTICATION__STAFFUI);
		createEOperation(authenticationEClass, AUTHENTICATION___LOG_IN__STRING_STRING);
		createEOperation(authenticationEClass, AUTHENTICATION___LOG_OUT);

		staffUIEClass = createEClass(STAFF_UI);
		createEReference(staffUIEClass, STAFF_UI__RESERVATIONHANDLER);
		createEOperation(staffUIEClass, STAFF_UI___SEARCH_ROOM_TYPE__STRING_INT_INT_INT);
		createEOperation(staffUIEClass, STAFF_UI___ADD_ROOM);
		createEOperation(staffUIEClass, STAFF_UI___DELETE_ROOM);
		createEOperation(staffUIEClass, STAFF_UI___MAKE_RES__STRING);
		createEOperation(staffUIEClass, STAFF_UI___EDIT_RES__INT);
		createEOperation(staffUIEClass, STAFF_UI___CANCEL_RES);
		createEOperation(staffUIEClass, STAFF_UI___GET_RES_INFO__INT);

		customerEClass = createEClass(CUSTOMER);
		createEReference(customerEClass, CUSTOMER__RESERVATIONHANDLER);
		createEReference(customerEClass, CUSTOMER__PAYMENTHANDLER);
		createEOperation(customerEClass, CUSTOMER___SEARCH_ROOM_TYPE);
		createEOperation(customerEClass, CUSTOMER___MAKE_RES);
		createEOperation(customerEClass, CUSTOMER___EDIT_RES);
		createEOperation(customerEClass, CUSTOMER___CANCEL_RES);
		createEOperation(customerEClass, CUSTOMER___GET_RES_INFO__INT);
		createEOperation(customerEClass, CUSTOMER___GET_BILL);
		createEOperation(customerEClass, CUSTOMER___OPERATION1);

		mainUIEClass = createEClass(MAIN_UI);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(authenticationEClass, authentication.class, "authentication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getauthentication_Accounthandler(), theBusinessPackage.getAccountHandler(), null, "accounthandler", null, 1, 1, authentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getauthentication_Staffui(), this.getStaffUI(), null, "staffui", null, 1, 1, authentication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getauthentication__LogIn__String_String(), null, "logIn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "Id", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "pass", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getauthentication__LogOut(), null, "LogOut", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(staffUIEClass, StaffUI.class, "StaffUI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStaffUI_Reservationhandler(), theBusinessPackage.getReservationHandler(), null, "reservationhandler", null, 1, 1, StaffUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getStaffUI__SearchRoomType__String_int_int_int(), null, "searchRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "arrvDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "depDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getStaffUI__AddRoom(), null, "addRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getStaffUI__DeleteRoom(), null, "deleteRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getStaffUI__MakeRes__String(), null, "makeRes", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "customerInfo", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getStaffUI__EditRes__int(), null, "editRes", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "resNr", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getStaffUI__CancelRes(), null, "cancelRes", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getStaffUI__GetResInfo__int(), null, "getResInfo", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "resNr", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(customerEClass, Customer.class, "Customer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomer_Reservationhandler(), theBusinessPackage.getReservationHandler(), null, "reservationhandler", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCustomer_Paymenthandler(), theBusinessPackage.getPaymentHandler(), null, "paymenthandler", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getCustomer__SearchRoomType(), null, "searchRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCustomer__MakeRes(), null, "makeRes", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCustomer__EditRes(), null, "editRes", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCustomer__CancelRes(), null, "cancelRes", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getCustomer__GetResInfo__int(), null, "getResInfo", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "resNr", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCustomer__GetBill(), null, "getBill", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCustomer__Operation1(), null, "Operation1", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(mainUIEClass, MainUI.class, "MainUI", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //PresentationPackageImpl
