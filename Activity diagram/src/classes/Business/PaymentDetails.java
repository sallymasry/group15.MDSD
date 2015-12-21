/**
 */
package classes.Business;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment Details</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link classes.Business.PaymentDetails#getFirstName <em>First Name</em>}</li>
 *   <li>{@link classes.Business.PaymentDetails#getLastName <em>Last Name</em>}</li>
 *   <li>{@link classes.Business.PaymentDetails#getCarsNr <em>Cars Nr</em>}</li>
 *   <li>{@link classes.Business.PaymentDetails#getCcv <em>Ccv</em>}</li>
 *   <li>{@link classes.Business.PaymentDetails#getExpMonth <em>Exp Month</em>}</li>
 *   <li>{@link classes.Business.PaymentDetails#getExpYear <em>Exp Year</em>}</li>
 * </ul>
 *
 * @see classes.Business.BusinessPackage#getPaymentDetails()
 * @model
 * @generated
 */
public interface PaymentDetails extends EObject {
	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see classes.Business.BusinessPackage#getPaymentDetails_FirstName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link classes.Business.PaymentDetails#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see classes.Business.BusinessPackage#getPaymentDetails_LastName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link classes.Business.PaymentDetails#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Cars Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cars Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cars Nr</em>' attribute.
	 * @see #setCarsNr(int)
	 * @see classes.Business.BusinessPackage#getPaymentDetails_CarsNr()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getCarsNr();

	/**
	 * Sets the value of the '{@link classes.Business.PaymentDetails#getCarsNr <em>Cars Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cars Nr</em>' attribute.
	 * @see #getCarsNr()
	 * @generated
	 */
	void setCarsNr(int value);

	/**
	 * Returns the value of the '<em><b>Ccv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ccv</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ccv</em>' attribute.
	 * @see #setCcv(int)
	 * @see classes.Business.BusinessPackage#getPaymentDetails_Ccv()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getCcv();

	/**
	 * Sets the value of the '{@link classes.Business.PaymentDetails#getCcv <em>Ccv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ccv</em>' attribute.
	 * @see #getCcv()
	 * @generated
	 */
	void setCcv(int value);

	/**
	 * Returns the value of the '<em><b>Exp Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp Month</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp Month</em>' attribute.
	 * @see #setExpMonth(int)
	 * @see classes.Business.BusinessPackage#getPaymentDetails_ExpMonth()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getExpMonth();

	/**
	 * Sets the value of the '{@link classes.Business.PaymentDetails#getExpMonth <em>Exp Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp Month</em>' attribute.
	 * @see #getExpMonth()
	 * @generated
	 */
	void setExpMonth(int value);

	/**
	 * Returns the value of the '<em><b>Exp Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp Year</em>' attribute.
	 * @see #setExpYear(int)
	 * @see classes.Business.BusinessPackage#getPaymentDetails_ExpYear()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getExpYear();

	/**
	 * Sets the value of the '{@link classes.Business.PaymentDetails#getExpYear <em>Exp Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp Year</em>' attribute.
	 * @see #getExpYear()
	 * @generated
	 */
	void setExpYear(int value);

} // PaymentDetails
