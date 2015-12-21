/**
 */
package classes.Data.impl;

import classes.Data.DataPackage;
import classes.Data.RoomManage;
import classes.Data.roomInformation;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Manage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link classes.Data.impl.RoomManageImpl#getRoomInfo <em>Room Info</em>}</li>
 *   <li>{@link classes.Data.impl.RoomManageImpl#getRoomdetails <em>Roomdetails</em>}</li>
 *   <li>{@link classes.Data.impl.RoomManageImpl#getCheckinDate <em>Checkin Date</em>}</li>
 *   <li>{@link classes.Data.impl.RoomManageImpl#getCheckoutDate <em>Checkout Date</em>}</li>
 *   <li>{@link classes.Data.impl.RoomManageImpl#getResNr <em>Res Nr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomManageImpl extends MinimalEObjectImpl.Container implements RoomManage {
	/**
	 * The cached value of the '{@link #getRoomInfo() <em>Room Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomInfo()
	 * @generated
	 * @ordered
	 */
	protected roomInformation roomInfo;

	/**
	 * The cached value of the '{@link #getRoomdetails() <em>Roomdetails</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomdetails()
	 * @generated
	 * @ordered
	 */
	protected roomInformation roomdetails;

	/**
	 * The default value of the '{@link #getCheckinDate() <em>Checkin Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckinDate()
	 * @generated
	 * @ordered
	 */
	protected static final int CHECKIN_DATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCheckinDate() <em>Checkin Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckinDate()
	 * @generated
	 * @ordered
	 */
	protected int checkinDate = CHECKIN_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCheckoutDate() <em>Checkout Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckoutDate()
	 * @generated
	 * @ordered
	 */
	protected static final int CHECKOUT_DATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCheckoutDate() <em>Checkout Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckoutDate()
	 * @generated
	 * @ordered
	 */
	protected int checkoutDate = CHECKOUT_DATE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomManageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.ROOM_MANAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public roomInformation getRoomInfo() {
		if (roomInfo != null && roomInfo.eIsProxy()) {
			InternalEObject oldRoomInfo = (InternalEObject)roomInfo;
			roomInfo = (roomInformation)eResolveProxy(oldRoomInfo);
			if (roomInfo != oldRoomInfo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.ROOM_MANAGE__ROOM_INFO, oldRoomInfo, roomInfo));
			}
		}
		return roomInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public roomInformation basicGetRoomInfo() {
		return roomInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomInfo(roomInformation newRoomInfo) {
		roomInformation oldRoomInfo = roomInfo;
		roomInfo = newRoomInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.ROOM_MANAGE__ROOM_INFO, oldRoomInfo, roomInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public roomInformation getRoomdetails() {
		if (roomdetails != null && roomdetails.eIsProxy()) {
			InternalEObject oldRoomdetails = (InternalEObject)roomdetails;
			roomdetails = (roomInformation)eResolveProxy(oldRoomdetails);
			if (roomdetails != oldRoomdetails) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.ROOM_MANAGE__ROOMDETAILS, oldRoomdetails, roomdetails));
			}
		}
		return roomdetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public roomInformation basicGetRoomdetails() {
		return roomdetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomdetails(roomInformation newRoomdetails) {
		roomInformation oldRoomdetails = roomdetails;
		roomdetails = newRoomdetails;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.ROOM_MANAGE__ROOMDETAILS, oldRoomdetails, roomdetails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCheckinDate() {
		return checkinDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckinDate(int newCheckinDate) {
		int oldCheckinDate = checkinDate;
		checkinDate = newCheckinDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.ROOM_MANAGE__CHECKIN_DATE, oldCheckinDate, checkinDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCheckoutDate() {
		return checkoutDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckoutDate(int newCheckoutDate) {
		int oldCheckoutDate = checkoutDate;
		checkoutDate = newCheckoutDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.ROOM_MANAGE__CHECKOUT_DATE, oldCheckoutDate, checkoutDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.ROOM_MANAGE__RES_NR, oldResNr, resNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createRoom(roomInformation room) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateRoom(roomInformation room) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeRoom(roomInformation room) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public roomInformation getRoomInfo(int roomNr) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkIn(int arrDate, int depDate, int resNr) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void CheckOut(int resNr) {
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
			case DataPackage.ROOM_MANAGE__ROOM_INFO:
				if (resolve) return getRoomInfo();
				return basicGetRoomInfo();
			case DataPackage.ROOM_MANAGE__ROOMDETAILS:
				if (resolve) return getRoomdetails();
				return basicGetRoomdetails();
			case DataPackage.ROOM_MANAGE__CHECKIN_DATE:
				return getCheckinDate();
			case DataPackage.ROOM_MANAGE__CHECKOUT_DATE:
				return getCheckoutDate();
			case DataPackage.ROOM_MANAGE__RES_NR:
				return getResNr();
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
			case DataPackage.ROOM_MANAGE__ROOM_INFO:
				setRoomInfo((roomInformation)newValue);
				return;
			case DataPackage.ROOM_MANAGE__ROOMDETAILS:
				setRoomdetails((roomInformation)newValue);
				return;
			case DataPackage.ROOM_MANAGE__CHECKIN_DATE:
				setCheckinDate((Integer)newValue);
				return;
			case DataPackage.ROOM_MANAGE__CHECKOUT_DATE:
				setCheckoutDate((Integer)newValue);
				return;
			case DataPackage.ROOM_MANAGE__RES_NR:
				setResNr((Integer)newValue);
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
			case DataPackage.ROOM_MANAGE__ROOM_INFO:
				setRoomInfo((roomInformation)null);
				return;
			case DataPackage.ROOM_MANAGE__ROOMDETAILS:
				setRoomdetails((roomInformation)null);
				return;
			case DataPackage.ROOM_MANAGE__CHECKIN_DATE:
				setCheckinDate(CHECKIN_DATE_EDEFAULT);
				return;
			case DataPackage.ROOM_MANAGE__CHECKOUT_DATE:
				setCheckoutDate(CHECKOUT_DATE_EDEFAULT);
				return;
			case DataPackage.ROOM_MANAGE__RES_NR:
				setResNr(RES_NR_EDEFAULT);
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
			case DataPackage.ROOM_MANAGE__ROOM_INFO:
				return roomInfo != null;
			case DataPackage.ROOM_MANAGE__ROOMDETAILS:
				return roomdetails != null;
			case DataPackage.ROOM_MANAGE__CHECKIN_DATE:
				return checkinDate != CHECKIN_DATE_EDEFAULT;
			case DataPackage.ROOM_MANAGE__CHECKOUT_DATE:
				return checkoutDate != CHECKOUT_DATE_EDEFAULT;
			case DataPackage.ROOM_MANAGE__RES_NR:
				return resNr != RES_NR_EDEFAULT;
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
			case DataPackage.ROOM_MANAGE___CREATE_ROOM__ROOMINFORMATION:
				createRoom((roomInformation)arguments.get(0));
				return null;
			case DataPackage.ROOM_MANAGE___UPDATE_ROOM__ROOMINFORMATION:
				updateRoom((roomInformation)arguments.get(0));
				return null;
			case DataPackage.ROOM_MANAGE___REMOVE_ROOM__ROOMINFORMATION:
				removeRoom((roomInformation)arguments.get(0));
				return null;
			case DataPackage.ROOM_MANAGE___GET_ROOM_INFO__INT:
				return getRoomInfo((Integer)arguments.get(0));
			case DataPackage.ROOM_MANAGE___CHECK_IN__INT_INT_INT:
				checkIn((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case DataPackage.ROOM_MANAGE___CHECK_OUT__INT:
				CheckOut((Integer)arguments.get(0));
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
		result.append(" (checkinDate: ");
		result.append(checkinDate);
		result.append(", checkoutDate: ");
		result.append(checkoutDate);
		result.append(", resNr: ");
		result.append(resNr);
		result.append(')');
		return result.toString();
	}

} //RoomManageImpl
