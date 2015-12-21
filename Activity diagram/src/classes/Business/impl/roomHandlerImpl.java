/**
 */
package classes.Business.impl;

import classes.Business.BusinessPackage;
import classes.Business.roomHandler;

import classes.Data.RoomManage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>room Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link classes.Business.impl.roomHandlerImpl#isAvailability <em>Availability</em>}</li>
 *   <li>{@link classes.Business.impl.roomHandlerImpl#getRoommanage <em>Roommanage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class roomHandlerImpl extends MinimalEObjectImpl.Container implements roomHandler {
	/**
	 * The default value of the '{@link #isAvailability() <em>Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAvailability()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AVAILABILITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAvailability() <em>Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAvailability()
	 * @generated
	 * @ordered
	 */
	protected boolean availability = AVAILABILITY_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected roomHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BusinessPackage.Literals.ROOM_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAvailability() {
		return availability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailability(boolean newAvailability) {
		boolean oldAvailability = availability;
		availability = newAvailability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.ROOM_HANDLER__AVAILABILITY, oldAvailability, availability));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BusinessPackage.ROOM_HANDLER__ROOMMANAGE, oldRoommanage, roommanage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.ROOM_HANDLER__ROOMMANAGE, oldRoommanage, roommanage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkavailability() {
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
			case BusinessPackage.ROOM_HANDLER__AVAILABILITY:
				return isAvailability();
			case BusinessPackage.ROOM_HANDLER__ROOMMANAGE:
				if (resolve) return getRoommanage();
				return basicGetRoommanage();
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
			case BusinessPackage.ROOM_HANDLER__AVAILABILITY:
				setAvailability((Boolean)newValue);
				return;
			case BusinessPackage.ROOM_HANDLER__ROOMMANAGE:
				setRoommanage((RoomManage)newValue);
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
			case BusinessPackage.ROOM_HANDLER__AVAILABILITY:
				setAvailability(AVAILABILITY_EDEFAULT);
				return;
			case BusinessPackage.ROOM_HANDLER__ROOMMANAGE:
				setRoommanage((RoomManage)null);
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
			case BusinessPackage.ROOM_HANDLER__AVAILABILITY:
				return availability != AVAILABILITY_EDEFAULT;
			case BusinessPackage.ROOM_HANDLER__ROOMMANAGE:
				return roommanage != null;
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
			case BusinessPackage.ROOM_HANDLER___CHECKAVAILABILITY:
				checkavailability();
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
		result.append(" (availability: ");
		result.append(availability);
		result.append(')');
		return result.toString();
	}

} //roomHandlerImpl
