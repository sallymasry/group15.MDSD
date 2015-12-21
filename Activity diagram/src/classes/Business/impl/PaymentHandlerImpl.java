/**
 */
package classes.Business.impl;

import classes.Business.BusinessPackage;
import classes.Business.PaymentDetails;
import classes.Business.PaymentHandler;

import classes.Data.PaymentManagment;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link classes.Business.impl.PaymentHandlerImpl#getPaymentinfo <em>Paymentinfo</em>}</li>
 *   <li>{@link classes.Business.impl.PaymentHandlerImpl#getPaymentmanagment <em>Paymentmanagment</em>}</li>
 *   <li>{@link classes.Business.impl.PaymentHandlerImpl#getPaymentdetails <em>Paymentdetails</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentHandlerImpl extends MinimalEObjectImpl.Container implements PaymentHandler {
	/**
	 * The cached value of the '{@link #getPaymentinfo() <em>Paymentinfo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentinfo()
	 * @generated
	 * @ordered
	 */
	protected PaymentDetails paymentinfo;

	/**
	 * The cached value of the '{@link #getPaymentmanagment() <em>Paymentmanagment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentmanagment()
	 * @generated
	 * @ordered
	 */
	protected PaymentManagment paymentmanagment;

	/**
	 * The cached value of the '{@link #getPaymentdetails() <em>Paymentdetails</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentdetails()
	 * @generated
	 * @ordered
	 */
	protected PaymentDetails paymentdetails;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BusinessPackage.Literals.PAYMENT_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentDetails getPaymentinfo() {
		if (paymentinfo != null && paymentinfo.eIsProxy()) {
			InternalEObject oldPaymentinfo = (InternalEObject)paymentinfo;
			paymentinfo = (PaymentDetails)eResolveProxy(oldPaymentinfo);
			if (paymentinfo != oldPaymentinfo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BusinessPackage.PAYMENT_HANDLER__PAYMENTINFO, oldPaymentinfo, paymentinfo));
			}
		}
		return paymentinfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentDetails basicGetPaymentinfo() {
		return paymentinfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentinfo(PaymentDetails newPaymentinfo) {
		PaymentDetails oldPaymentinfo = paymentinfo;
		paymentinfo = newPaymentinfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.PAYMENT_HANDLER__PAYMENTINFO, oldPaymentinfo, paymentinfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentManagment getPaymentmanagment() {
		if (paymentmanagment != null && paymentmanagment.eIsProxy()) {
			InternalEObject oldPaymentmanagment = (InternalEObject)paymentmanagment;
			paymentmanagment = (PaymentManagment)eResolveProxy(oldPaymentmanagment);
			if (paymentmanagment != oldPaymentmanagment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BusinessPackage.PAYMENT_HANDLER__PAYMENTMANAGMENT, oldPaymentmanagment, paymentmanagment));
			}
		}
		return paymentmanagment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentManagment basicGetPaymentmanagment() {
		return paymentmanagment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentmanagment(PaymentManagment newPaymentmanagment) {
		PaymentManagment oldPaymentmanagment = paymentmanagment;
		paymentmanagment = newPaymentmanagment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.PAYMENT_HANDLER__PAYMENTMANAGMENT, oldPaymentmanagment, paymentmanagment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentDetails getPaymentdetails() {
		if (paymentdetails != null && paymentdetails.eIsProxy()) {
			InternalEObject oldPaymentdetails = (InternalEObject)paymentdetails;
			paymentdetails = (PaymentDetails)eResolveProxy(oldPaymentdetails);
			if (paymentdetails != oldPaymentdetails) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BusinessPackage.PAYMENT_HANDLER__PAYMENTDETAILS, oldPaymentdetails, paymentdetails));
			}
		}
		return paymentdetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentDetails basicGetPaymentdetails() {
		return paymentdetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentdetails(PaymentDetails newPaymentdetails) {
		PaymentDetails oldPaymentdetails = paymentdetails;
		paymentdetails = newPaymentdetails;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.PAYMENT_HANDLER__PAYMENTDETAILS, oldPaymentdetails, paymentdetails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void makePayment(PaymentDetails paymentsDetails) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BusinessPackage.PAYMENT_HANDLER__PAYMENTINFO:
				if (resolve) return getPaymentinfo();
				return basicGetPaymentinfo();
			case BusinessPackage.PAYMENT_HANDLER__PAYMENTMANAGMENT:
				if (resolve) return getPaymentmanagment();
				return basicGetPaymentmanagment();
			case BusinessPackage.PAYMENT_HANDLER__PAYMENTDETAILS:
				if (resolve) return getPaymentdetails();
				return basicGetPaymentdetails();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BusinessPackage.PAYMENT_HANDLER__PAYMENTINFO:
				setPaymentinfo((PaymentDetails)newValue);
				return;
			case BusinessPackage.PAYMENT_HANDLER__PAYMENTMANAGMENT:
				setPaymentmanagment((PaymentManagment)newValue);
				return;
			case BusinessPackage.PAYMENT_HANDLER__PAYMENTDETAILS:
				setPaymentdetails((PaymentDetails)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BusinessPackage.PAYMENT_HANDLER__PAYMENTINFO:
				setPaymentinfo((PaymentDetails)null);
				return;
			case BusinessPackage.PAYMENT_HANDLER__PAYMENTMANAGMENT:
				setPaymentmanagment((PaymentManagment)null);
				return;
			case BusinessPackage.PAYMENT_HANDLER__PAYMENTDETAILS:
				setPaymentdetails((PaymentDetails)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BusinessPackage.PAYMENT_HANDLER__PAYMENTINFO:
				return paymentinfo != null;
			case BusinessPackage.PAYMENT_HANDLER__PAYMENTMANAGMENT:
				return paymentmanagment != null;
			case BusinessPackage.PAYMENT_HANDLER__PAYMENTDETAILS:
				return paymentdetails != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BusinessPackage.PAYMENT_HANDLER___MAKE_PAYMENT__PAYMENTDETAILS:
				makePayment((PaymentDetails)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //PaymentHandlerImpl
