/**
 */
package classes.Business.impl;

import classes.Business.BusinessPackage;
import classes.Business.PersonInfo;
import classes.Business.ReservationHandler;
import classes.Business.roomHandler;

import classes.Data.Reservation;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reservation Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link classes.Business.impl.ReservationHandlerImpl#getArrDate <em>Arr Date</em>}</li>
 *   <li>{@link classes.Business.impl.ReservationHandlerImpl#getDepDate <em>Dep Date</em>}</li>
 *   <li>{@link classes.Business.impl.ReservationHandlerImpl#getReservationNr <em>Reservation Nr</em>}</li>
 *   <li>{@link classes.Business.impl.ReservationHandlerImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link classes.Business.impl.ReservationHandlerImpl#getGuests <em>Guests</em>}</li>
 *   <li>{@link classes.Business.impl.ReservationHandlerImpl#getRoomhandler <em>Roomhandler</em>}</li>
 *   <li>{@link classes.Business.impl.ReservationHandlerImpl#getReservation <em>Reservation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReservationHandlerImpl extends MinimalEObjectImpl.Container implements ReservationHandler {
	/**
	 * The default value of the '{@link #getArrDate() <em>Arr Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrDate()
	 * @generated
	 * @ordered
	 */
	protected static final int ARR_DATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getArrDate() <em>Arr Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrDate()
	 * @generated
	 * @ordered
	 */
	protected int arrDate = ARR_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDepDate() <em>Dep Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepDate()
	 * @generated
	 * @ordered
	 */
	protected static final int DEP_DATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDepDate() <em>Dep Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepDate()
	 * @generated
	 * @ordered
	 */
	protected int depDate = DEP_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReservationNr() <em>Reservation Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservationNr()
	 * @generated
	 * @ordered
	 */
	protected static final int RESERVATION_NR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReservationNr() <em>Reservation Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservationNr()
	 * @generated
	 * @ordered
	 */
	protected int reservationNr = RESERVATION_NR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonInfo> person;

	/**
	 * The cached value of the '{@link #getGuests() <em>Guests</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuests()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonInfo> guests;

	/**
	 * The cached value of the '{@link #getRoomhandler() <em>Roomhandler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomhandler()
	 * @generated
	 * @ordered
	 */
	protected roomHandler roomhandler;

	/**
	 * The cached value of the '{@link #getReservation() <em>Reservation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservation()
	 * @generated
	 * @ordered
	 */
	protected Reservation reservation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReservationHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BusinessPackage.Literals.RESERVATION_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getArrDate() {
		return arrDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrDate(int newArrDate) {
		int oldArrDate = arrDate;
		arrDate = newArrDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.RESERVATION_HANDLER__ARR_DATE, oldArrDate, arrDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDepDate() {
		return depDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepDate(int newDepDate) {
		int oldDepDate = depDate;
		depDate = newDepDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.RESERVATION_HANDLER__DEP_DATE, oldDepDate, depDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getReservationNr() {
		return reservationNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservationNr(int newReservationNr) {
		int oldReservationNr = reservationNr;
		reservationNr = newReservationNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.RESERVATION_HANDLER__RESERVATION_NR, oldReservationNr, reservationNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonInfo> getPerson() {
		if (person == null) {
			person = new EObjectResolvingEList<PersonInfo>(PersonInfo.class, this, BusinessPackage.RESERVATION_HANDLER__PERSON);
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonInfo> getGuests() {
		if (guests == null) {
			guests = new EObjectResolvingEList<PersonInfo>(PersonInfo.class, this, BusinessPackage.RESERVATION_HANDLER__GUESTS);
		}
		return guests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public roomHandler getRoomhandler() {
		if (roomhandler != null && roomhandler.eIsProxy()) {
			InternalEObject oldRoomhandler = (InternalEObject)roomhandler;
			roomhandler = (roomHandler)eResolveProxy(oldRoomhandler);
			if (roomhandler != oldRoomhandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BusinessPackage.RESERVATION_HANDLER__ROOMHANDLER, oldRoomhandler, roomhandler));
			}
		}
		return roomhandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public roomHandler basicGetRoomhandler() {
		return roomhandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomhandler(roomHandler newRoomhandler) {
		roomHandler oldRoomhandler = roomhandler;
		roomhandler = newRoomhandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.RESERVATION_HANDLER__ROOMHANDLER, oldRoomhandler, roomhandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservation getReservation() {
		if (reservation != null && reservation.eIsProxy()) {
			InternalEObject oldReservation = (InternalEObject)reservation;
			reservation = (Reservation)eResolveProxy(oldReservation);
			if (reservation != oldReservation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BusinessPackage.RESERVATION_HANDLER__RESERVATION, oldReservation, reservation));
			}
		}
		return reservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservation basicGetReservation() {
		return reservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservation(Reservation newReservation) {
		Reservation oldReservation = reservation;
		reservation = newReservation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.RESERVATION_HANDLER__RESERVATION, oldReservation, reservation));
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
	public void removeRoom() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addReservation() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateReservation() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeReservation() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void EditRoom() {
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
			case BusinessPackage.RESERVATION_HANDLER__ARR_DATE:
				return getArrDate();
			case BusinessPackage.RESERVATION_HANDLER__DEP_DATE:
				return getDepDate();
			case BusinessPackage.RESERVATION_HANDLER__RESERVATION_NR:
				return getReservationNr();
			case BusinessPackage.RESERVATION_HANDLER__PERSON:
				return getPerson();
			case BusinessPackage.RESERVATION_HANDLER__GUESTS:
				return getGuests();
			case BusinessPackage.RESERVATION_HANDLER__ROOMHANDLER:
				if (resolve) return getRoomhandler();
				return basicGetRoomhandler();
			case BusinessPackage.RESERVATION_HANDLER__RESERVATION:
				if (resolve) return getReservation();
				return basicGetReservation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BusinessPackage.RESERVATION_HANDLER__ARR_DATE:
				setArrDate((Integer)newValue);
				return;
			case BusinessPackage.RESERVATION_HANDLER__DEP_DATE:
				setDepDate((Integer)newValue);
				return;
			case BusinessPackage.RESERVATION_HANDLER__RESERVATION_NR:
				setReservationNr((Integer)newValue);
				return;
			case BusinessPackage.RESERVATION_HANDLER__PERSON:
				getPerson().clear();
				getPerson().addAll((Collection<? extends PersonInfo>)newValue);
				return;
			case BusinessPackage.RESERVATION_HANDLER__GUESTS:
				getGuests().clear();
				getGuests().addAll((Collection<? extends PersonInfo>)newValue);
				return;
			case BusinessPackage.RESERVATION_HANDLER__ROOMHANDLER:
				setRoomhandler((roomHandler)newValue);
				return;
			case BusinessPackage.RESERVATION_HANDLER__RESERVATION:
				setReservation((Reservation)newValue);
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
			case BusinessPackage.RESERVATION_HANDLER__ARR_DATE:
				setArrDate(ARR_DATE_EDEFAULT);
				return;
			case BusinessPackage.RESERVATION_HANDLER__DEP_DATE:
				setDepDate(DEP_DATE_EDEFAULT);
				return;
			case BusinessPackage.RESERVATION_HANDLER__RESERVATION_NR:
				setReservationNr(RESERVATION_NR_EDEFAULT);
				return;
			case BusinessPackage.RESERVATION_HANDLER__PERSON:
				getPerson().clear();
				return;
			case BusinessPackage.RESERVATION_HANDLER__GUESTS:
				getGuests().clear();
				return;
			case BusinessPackage.RESERVATION_HANDLER__ROOMHANDLER:
				setRoomhandler((roomHandler)null);
				return;
			case BusinessPackage.RESERVATION_HANDLER__RESERVATION:
				setReservation((Reservation)null);
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
			case BusinessPackage.RESERVATION_HANDLER__ARR_DATE:
				return arrDate != ARR_DATE_EDEFAULT;
			case BusinessPackage.RESERVATION_HANDLER__DEP_DATE:
				return depDate != DEP_DATE_EDEFAULT;
			case BusinessPackage.RESERVATION_HANDLER__RESERVATION_NR:
				return reservationNr != RESERVATION_NR_EDEFAULT;
			case BusinessPackage.RESERVATION_HANDLER__PERSON:
				return person != null && !person.isEmpty();
			case BusinessPackage.RESERVATION_HANDLER__GUESTS:
				return guests != null && !guests.isEmpty();
			case BusinessPackage.RESERVATION_HANDLER__ROOMHANDLER:
				return roomhandler != null;
			case BusinessPackage.RESERVATION_HANDLER__RESERVATION:
				return reservation != null;
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
			case BusinessPackage.RESERVATION_HANDLER___ADD_ROOM:
				addRoom();
				return null;
			case BusinessPackage.RESERVATION_HANDLER___REMOVE_ROOM:
				removeRoom();
				return null;
			case BusinessPackage.RESERVATION_HANDLER___ADD_RESERVATION:
				addReservation();
				return null;
			case BusinessPackage.RESERVATION_HANDLER___UPDATE_RESERVATION:
				updateReservation();
				return null;
			case BusinessPackage.RESERVATION_HANDLER___REMOVE_RESERVATION:
				removeReservation();
				return null;
			case BusinessPackage.RESERVATION_HANDLER___EDIT_ROOM:
				EditRoom();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (arrDate: ");
		result.append(arrDate);
		result.append(", DepDate: ");
		result.append(depDate);
		result.append(", ReservationNr: ");
		result.append(reservationNr);
		result.append(')');
		return result.toString();
	}

} //ReservationHandlerImpl
