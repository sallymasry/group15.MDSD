/**
 */
package classes.Data.impl;

import classes.Business.PersonInfo;

import classes.Data.DataPackage;
import classes.Data.Reservation;
import classes.Data.RoomManage;
import classes.Data.StatisticsHandler;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reservation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link classes.Data.impl.ReservationImpl#getArrDate <em>Arr Date</em>}</li>
 *   <li>{@link classes.Data.impl.ReservationImpl#getDepDate <em>Dep Date</em>}</li>
 *   <li>{@link classes.Data.impl.ReservationImpl#getResNr <em>Res Nr</em>}</li>
 *   <li>{@link classes.Data.impl.ReservationImpl#getPersonDetails <em>Person Details</em>}</li>
 *   <li>{@link classes.Data.impl.ReservationImpl#getRoommanage <em>Roommanage</em>}</li>
 *   <li>{@link classes.Data.impl.ReservationImpl#getStatisticshandler <em>Statisticshandler</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReservationImpl extends MinimalEObjectImpl.Container implements Reservation {
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
	 * The default value of the '{@link #getResNr() <em>Res Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResNr()
	 * @generated
	 * @ordered
	 */
	protected static final int RES_NR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getResNr() <em>Res Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResNr()
	 * @generated
	 * @ordered
	 */
	protected int resNr = RES_NR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPersonDetails() <em>Person Details</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonDetails()
	 * @generated
	 * @ordered
	 */
	protected PersonInfo personDetails;

	/**
	 * The cached value of the '{@link #getRoommanage() <em>Roommanage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoommanage()
	 * @generated
	 * @ordered
	 */
	protected RoomManage roommanage;

	/**
	 * The cached value of the '{@link #getStatisticshandler() <em>Statisticshandler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatisticshandler()
	 * @generated
	 * @ordered
	 */
	protected StatisticsHandler statisticshandler;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.RESERVATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.RESERVATION__ARR_DATE, oldArrDate, arrDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.RESERVATION__DEP_DATE, oldDepDate, depDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getResNr() {
		return resNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResNr(int newResNr) {
		int oldResNr = resNr;
		resNr = newResNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.RESERVATION__RES_NR, oldResNr, resNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonInfo getPersonDetails() {
		if (personDetails != null && personDetails.eIsProxy()) {
			InternalEObject oldPersonDetails = (InternalEObject)personDetails;
			personDetails = (PersonInfo)eResolveProxy(oldPersonDetails);
			if (personDetails != oldPersonDetails) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.RESERVATION__PERSON_DETAILS, oldPersonDetails, personDetails));
			}
		}
		return personDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonInfo basicGetPersonDetails() {
		return personDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonDetails(PersonInfo newPersonDetails) {
		PersonInfo oldPersonDetails = personDetails;
		personDetails = newPersonDetails;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.RESERVATION__PERSON_DETAILS, oldPersonDetails, personDetails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomManage getRoommanage() {
		if (roommanage != null && roommanage.eIsProxy()) {
			InternalEObject oldRoommanage = (InternalEObject)roommanage;
			roommanage = (RoomManage)eResolveProxy(oldRoommanage);
			if (roommanage != oldRoommanage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.RESERVATION__ROOMMANAGE, oldRoommanage, roommanage));
			}
		}
		return roommanage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomManage basicGetRoommanage() {
		return roommanage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoommanage(RoomManage newRoommanage) {
		RoomManage oldRoommanage = roommanage;
		roommanage = newRoommanage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.RESERVATION__ROOMMANAGE, oldRoommanage, roommanage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatisticsHandler getStatisticshandler() {
		if (statisticshandler != null && statisticshandler.eIsProxy()) {
			InternalEObject oldStatisticshandler = (InternalEObject)statisticshandler;
			statisticshandler = (StatisticsHandler)eResolveProxy(oldStatisticshandler);
			if (statisticshandler != oldStatisticshandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.RESERVATION__STATISTICSHANDLER, oldStatisticshandler, statisticshandler));
			}
		}
		return statisticshandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatisticsHandler basicGetStatisticshandler() {
		return statisticshandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatisticshandler(StatisticsHandler newStatisticshandler) {
		StatisticsHandler oldStatisticshandler = statisticshandler;
		statisticshandler = newStatisticshandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.RESERVATION__STATISTICSHANDLER, oldStatisticshandler, statisticshandler));
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
	public void createRes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateRes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeRes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addPaymentDetails() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void edirRoom() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void validateResNr() {
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
			case DataPackage.RESERVATION__ARR_DATE:
				return getArrDate();
			case DataPackage.RESERVATION__DEP_DATE:
				return getDepDate();
			case DataPackage.RESERVATION__RES_NR:
				return getResNr();
			case DataPackage.RESERVATION__PERSON_DETAILS:
				if (resolve) return getPersonDetails();
				return basicGetPersonDetails();
			case DataPackage.RESERVATION__ROOMMANAGE:
				if (resolve) return getRoommanage();
				return basicGetRoommanage();
			case DataPackage.RESERVATION__STATISTICSHANDLER:
				if (resolve) return getStatisticshandler();
				return basicGetStatisticshandler();
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
			case DataPackage.RESERVATION__ARR_DATE:
				setArrDate((Integer)newValue);
				return;
			case DataPackage.RESERVATION__DEP_DATE:
				setDepDate((Integer)newValue);
				return;
			case DataPackage.RESERVATION__RES_NR:
				setResNr((Integer)newValue);
				return;
			case DataPackage.RESERVATION__PERSON_DETAILS:
				setPersonDetails((PersonInfo)newValue);
				return;
			case DataPackage.RESERVATION__ROOMMANAGE:
				setRoommanage((RoomManage)newValue);
				return;
			case DataPackage.RESERVATION__STATISTICSHANDLER:
				setStatisticshandler((StatisticsHandler)newValue);
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
			case DataPackage.RESERVATION__ARR_DATE:
				setArrDate(ARR_DATE_EDEFAULT);
				return;
			case DataPackage.RESERVATION__DEP_DATE:
				setDepDate(DEP_DATE_EDEFAULT);
				return;
			case DataPackage.RESERVATION__RES_NR:
				setResNr(RES_NR_EDEFAULT);
				return;
			case DataPackage.RESERVATION__PERSON_DETAILS:
				setPersonDetails((PersonInfo)null);
				return;
			case DataPackage.RESERVATION__ROOMMANAGE:
				setRoommanage((RoomManage)null);
				return;
			case DataPackage.RESERVATION__STATISTICSHANDLER:
				setStatisticshandler((StatisticsHandler)null);
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
			case DataPackage.RESERVATION__ARR_DATE:
				return arrDate != ARR_DATE_EDEFAULT;
			case DataPackage.RESERVATION__DEP_DATE:
				return depDate != DEP_DATE_EDEFAULT;
			case DataPackage.RESERVATION__RES_NR:
				return resNr != RES_NR_EDEFAULT;
			case DataPackage.RESERVATION__PERSON_DETAILS:
				return personDetails != null;
			case DataPackage.RESERVATION__ROOMMANAGE:
				return roommanage != null;
			case DataPackage.RESERVATION__STATISTICSHANDLER:
				return statisticshandler != null;
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
			case DataPackage.RESERVATION___ADD_ROOM:
				addRoom();
				return null;
			case DataPackage.RESERVATION___REMOVE_ROOM:
				removeRoom();
				return null;
			case DataPackage.RESERVATION___CREATE_RES:
				createRes();
				return null;
			case DataPackage.RESERVATION___UPDATE_RES:
				updateRes();
				return null;
			case DataPackage.RESERVATION___REMOVE_RES:
				removeRes();
				return null;
			case DataPackage.RESERVATION___ADD_PAYMENT_DETAILS:
				addPaymentDetails();
				return null;
			case DataPackage.RESERVATION___EDIR_ROOM:
				edirRoom();
				return null;
			case DataPackage.RESERVATION___VALIDATE_RES_NR:
				validateResNr();
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
		result.append(", depDate: ");
		result.append(depDate);
		result.append(", resNr: ");
		result.append(resNr);
		result.append(')');
		return result.toString();
	}

} //ReservationImpl
