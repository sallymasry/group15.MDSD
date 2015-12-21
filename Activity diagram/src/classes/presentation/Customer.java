/**
 */
package classes.presentation;

import classes.Business.PaymentHandler;
import classes.Business.ReservationHandler;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link classes.presentation.Customer#getReservationhandler <em>Reservationhandler</em>}</li>
 *   <li>{@link classes.presentation.Customer#getPaymenthandler <em>Paymenthandler</em>}</li>
 * </ul>
 *
 * @see classes.presentation.PresentationPackage#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends EObject {
	/**
	 * Returns the value of the '<em><b>Reservationhandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reservationhandler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservationhandler</em>' reference.
	 * @see #setReservationhandler(ReservationHandler)
	 * @see classes.presentation.PresentationPackage#getCustomer_Reservationhandler()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ReservationHandler getReservationhandler();

	/**
	 * Sets the value of the '{@link classes.presentation.Customer#getReservationhandler <em>Reservationhandler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reservationhandler</em>' reference.
	 * @see #getReservationhandler()
	 * @generated
	 */
	void setReservationhandler(ReservationHandler value);

	/**
	 * Returns the value of the '<em><b>Paymenthandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paymenthandler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paymenthandler</em>' reference.
	 * @see #setPaymenthandler(PaymentHandler)
	 * @see classes.presentation.PresentationPackage#getCustomer_Paymenthandler()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PaymentHandler getPaymenthandler();

	/**
	 * Sets the value of the '{@link classes.presentation.Customer#getPaymenthandler <em>Paymenthandler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paymenthandler</em>' reference.
	 * @see #getPaymenthandler()
	 * @generated
	 */
	void setPaymenthandler(PaymentHandler value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void searchRoomType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void makeRes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void editRes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void cancelRes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model resNrRequired="true" resNrOrdered="false"
	 * @generated
	 */
	void getResInfo(int resNr);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getBill();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void Operation1();

} // Customer
