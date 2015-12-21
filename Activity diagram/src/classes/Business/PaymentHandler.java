/**
 */
package classes.Business;

import classes.Data.PaymentManagment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link classes.Business.PaymentHandler#getPaymentinfo <em>Paymentinfo</em>}</li>
 *   <li>{@link classes.Business.PaymentHandler#getPaymentmanagment <em>Paymentmanagment</em>}</li>
 *   <li>{@link classes.Business.PaymentHandler#getPaymentdetails <em>Paymentdetails</em>}</li>
 * </ul>
 *
 * @see classes.Business.BusinessPackage#getPaymentHandler()
 * @model
 * @generated
 */
public interface PaymentHandler extends EObject {
	/**
	 * Returns the value of the '<em><b>Paymentinfo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paymentinfo</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paymentinfo</em>' reference.
	 * @see #setPaymentinfo(PaymentDetails)
	 * @see classes.Business.BusinessPackage#getPaymentHandler_Paymentinfo()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PaymentDetails getPaymentinfo();

	/**
	 * Sets the value of the '{@link classes.Business.PaymentHandler#getPaymentinfo <em>Paymentinfo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paymentinfo</em>' reference.
	 * @see #getPaymentinfo()
	 * @generated
	 */
	void setPaymentinfo(PaymentDetails value);

	/**
	 * Returns the value of the '<em><b>Paymentmanagment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paymentmanagment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paymentmanagment</em>' reference.
	 * @see #setPaymentmanagment(PaymentManagment)
	 * @see classes.Business.BusinessPackage#getPaymentHandler_Paymentmanagment()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PaymentManagment getPaymentmanagment();

	/**
	 * Sets the value of the '{@link classes.Business.PaymentHandler#getPaymentmanagment <em>Paymentmanagment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paymentmanagment</em>' reference.
	 * @see #getPaymentmanagment()
	 * @generated
	 */
	void setPaymentmanagment(PaymentManagment value);

	/**
	 * Returns the value of the '<em><b>Paymentdetails</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paymentdetails</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paymentdetails</em>' reference.
	 * @see #setPaymentdetails(PaymentDetails)
	 * @see classes.Business.BusinessPackage#getPaymentHandler_Paymentdetails()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PaymentDetails getPaymentdetails();

	/**
	 * Sets the value of the '{@link classes.Business.PaymentHandler#getPaymentdetails <em>Paymentdetails</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paymentdetails</em>' reference.
	 * @see #getPaymentdetails()
	 * @generated
	 */
	void setPaymentdetails(PaymentDetails value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model paymentsDetailsRequired="true" paymentsDetailsOrdered="false"
	 * @generated
	 */
	void makePayment(PaymentDetails paymentsDetails);

} // PaymentHandler
