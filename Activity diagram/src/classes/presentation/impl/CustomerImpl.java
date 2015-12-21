/**
 */
package classes.presentation.impl;

import classes.Business.PaymentHandler;
import classes.Business.ReservationHandler;

import classes.presentation.Customer;
import classes.presentation.PresentationPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link classes.presentation.impl.CustomerImpl#getReservationhandler <em>Reservationhandler</em>}</li>
 *   <li>{@link classes.presentation.impl.CustomerImpl#getPaymenthandler <em>Paymenthandler</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerImpl extends MinimalEObjectImpl.Container implements Customer {
	/**
	 * The cached value of the '{@link #getReservationhandler() <em>Reservationhandler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservationhandler()
	 * @generated
	 * @ordered
	 */
	protected ReservationHandler reservationhandler;

	/**
	 * The cached value of the '{@link #getPaymenthandler() <em>Paymenthandler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymenthandler()
	 * @generated
	 * @ordered
	 */
	protected PaymentHandler paymenthandler;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationPackage.Literals.CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationHandler getReservationhandler() {
		if (reservationhandler != null && reservationhandler.eIsProxy()) {
			InternalEObject oldReservationhandler = (InternalEObject)reservationhandler;
			reservationhandler = (ReservationHandler)eResolveProxy(oldReservationhandler);
			if (reservationhandler != oldReservationhandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PresentationPackage.CUSTOMER__RESERVATIONHANDLER, oldReservationhandler, reservationhandler));
			}
		}
		return reservationhandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationHandler basicGetReservationhandler() {
		return reservationhandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservationhandler(ReservationHandler newReservationhandler) {
		ReservationHandler oldReservationhandler = reservationhandler;
		reservationhandler = newReservationhandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.CUSTOMER__RESERVATIONHANDLER, oldReservationhandler, reservationhandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentHandler getPaymenthandler() {
		if (paymenthandler != null && paymenthandler.eIsProxy()) {
			InternalEObject oldPaymenthandler = (InternalEObject)paymenthandler;
			paymenthandler = (PaymentHandler)eResolveProxy(oldPaymenthandler);
			if (paymenthandler != oldPaymenthandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PresentationPackage.CUSTOMER__PAYMENTHANDLER, oldPaymenthandler, paymenthandler));
			}
		}
		return paymenthandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentHandler basicGetPaymenthandler() {
		return paymenthandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymenthandler(PaymentHandler newPaymenthandler) {
		PaymentHandler oldPaymenthandler = paymenthandler;
		paymenthandler = newPaymenthandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.CUSTOMER__PAYMENTHANDLER, oldPaymenthandler, paymenthandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void searchRoomType() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void makeRes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void editRes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void cancelRes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getResInfo(int resNr) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getBill() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void Operation1() {
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
			case PresentationPackage.CUSTOMER__RESERVATIONHANDLER:
				if (resolve) return getReservationhandler();
				return basicGetReservationhandler();
			case PresentationPackage.CUSTOMER__PAYMENTHANDLER:
				if (resolve) return getPaymenthandler();
				return basicGetPaymenthandler();
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
			case PresentationPackage.CUSTOMER__RESERVATIONHANDLER:
				setReservationhandler((ReservationHandler)newValue);
				return;
			case PresentationPackage.CUSTOMER__PAYMENTHANDLER:
				setPaymenthandler((PaymentHandler)newValue);
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
			case PresentationPackage.CUSTOMER__RESERVATIONHANDLER:
				setReservationhandler((ReservationHandler)null);
				return;
			case PresentationPackage.CUSTOMER__PAYMENTHANDLER:
				setPaymenthandler((PaymentHandler)null);
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
			case PresentationPackage.CUSTOMER__RESERVATIONHANDLER:
				return reservationhandler != null;
			case PresentationPackage.CUSTOMER__PAYMENTHANDLER:
				return paymenthandler != null;
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
			case PresentationPackage.CUSTOMER___SEARCH_ROOM_TYPE:
				searchRoomType();
				return null;
			case PresentationPackage.CUSTOMER___MAKE_RES:
				makeRes();
				return null;
			case PresentationPackage.CUSTOMER___EDIT_RES:
				editRes();
				return null;
			case PresentationPackage.CUSTOMER___CANCEL_RES:
				cancelRes();
				return null;
			case PresentationPackage.CUSTOMER___GET_RES_INFO__INT:
				getResInfo((Integer)arguments.get(0));
				return null;
			case PresentationPackage.CUSTOMER___GET_BILL:
				getBill();
				return null;
			case PresentationPackage.CUSTOMER___OPERATION1:
				Operation1();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //CustomerImpl
