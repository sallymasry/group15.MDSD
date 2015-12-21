/**
 */
package classes.Business.impl;

import classes.Business.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessFactoryImpl extends EFactoryImpl implements BusinessFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BusinessFactory init() {
		try {
			BusinessFactory theBusinessFactory = (BusinessFactory)EPackage.Registry.INSTANCE.getEFactory(BusinessPackage.eNS_URI);
			if (theBusinessFactory != null) {
				return theBusinessFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BusinessFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BusinessPackage.RESERVATION_HANDLER: return createReservationHandler();
			case BusinessPackage.ROOM_HANDLER: return createroomHandler();
			case BusinessPackage.COPY_OF_CLASS1_1: return createCopyOf_Class1_1();
			case BusinessPackage.ACCOUNT_HANDLER: return createAccountHandler();
			case BusinessPackage.PAYMENT_HANDLER: return createPaymentHandler();
			case BusinessPackage.PAYMENT_DETAILS: return createPaymentDetails();
			case BusinessPackage.PERSON_INFO: return createPersonInfo();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationHandler createReservationHandler() {
		ReservationHandlerImpl reservationHandler = new ReservationHandlerImpl();
		return reservationHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public roomHandler createroomHandler() {
		roomHandlerImpl roomHandler = new roomHandlerImpl();
		return roomHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CopyOf_Class1_1 createCopyOf_Class1_1() {
		CopyOf_Class1_1Impl copyOf_Class1_1 = new CopyOf_Class1_1Impl();
		return copyOf_Class1_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountHandler createAccountHandler() {
		AccountHandlerImpl accountHandler = new AccountHandlerImpl();
		return accountHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentHandler createPaymentHandler() {
		PaymentHandlerImpl paymentHandler = new PaymentHandlerImpl();
		return paymentHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentDetails createPaymentDetails() {
		PaymentDetailsImpl paymentDetails = new PaymentDetailsImpl();
		return paymentDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonInfo createPersonInfo() {
		PersonInfoImpl personInfo = new PersonInfoImpl();
		return personInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessPackage getBusinessPackage() {
		return (BusinessPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BusinessPackage getPackage() {
		return BusinessPackage.eINSTANCE;
	}

} //BusinessFactoryImpl
