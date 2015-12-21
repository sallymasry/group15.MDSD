/**
 */
package classes.Data;

import classes.Business.PaymentDetails;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Managment</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see classes.Data.DataPackage#getPaymentManagment()
 * @model
 * @generated
 */
public interface PaymentManagment extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model paymentDetailsRequired="true" paymentDetailsOrdered="false"
	 * @generated
	 */
	void isCardValid(PaymentDetails paymentDetails);

} // PaymentManagment
