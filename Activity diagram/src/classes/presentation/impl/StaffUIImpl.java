/**
 */
package classes.presentation.impl;

import classes.Business.ReservationHandler;

import classes.presentation.PresentationPackage;
import classes.presentation.StaffUI;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Staff UI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link classes.presentation.impl.StaffUIImpl#getReservationhandler <em>Reservationhandler</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StaffUIImpl extends MinimalEObjectImpl.Container implements StaffUI {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaffUIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationPackage.Literals.STAFF_UI;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PresentationPackage.STAFF_UI__RESERVATIONHANDLER, oldReservationhandler, reservationhandler));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.STAFF_UI__RESERVATIONHANDLER, oldReservationhandler, reservationhandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void searchRoomType(String roomType, int price, int arrvDate, int depDate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addRoom() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deleteRoom() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void makeRes(String customerInfo) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void editRes(int resNr) {
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PresentationPackage.STAFF_UI__RESERVATIONHANDLER:
				if (resolve) return getReservationhandler();
				return basicGetReservationhandler();
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
			case PresentationPackage.STAFF_UI__RESERVATIONHANDLER:
				setReservationhandler((ReservationHandler)newValue);
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
			case PresentationPackage.STAFF_UI__RESERVATIONHANDLER:
				setReservationhandler((ReservationHandler)null);
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
			case PresentationPackage.STAFF_UI__RESERVATIONHANDLER:
				return reservationhandler != null;
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
			case PresentationPackage.STAFF_UI___SEARCH_ROOM_TYPE__STRING_INT_INT_INT:
				searchRoomType((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
				return null;
			case PresentationPackage.STAFF_UI___ADD_ROOM:
				addRoom();
				return null;
			case PresentationPackage.STAFF_UI___DELETE_ROOM:
				deleteRoom();
				return null;
			case PresentationPackage.STAFF_UI___MAKE_RES__STRING:
				makeRes((String)arguments.get(0));
				return null;
			case PresentationPackage.STAFF_UI___EDIT_RES__INT:
				editRes((Integer)arguments.get(0));
				return null;
			case PresentationPackage.STAFF_UI___CANCEL_RES:
				cancelRes();
				return null;
			case PresentationPackage.STAFF_UI___GET_RES_INFO__INT:
				getResInfo((Integer)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //StaffUIImpl
