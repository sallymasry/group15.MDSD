/**
 */
package classes.Data.impl;

import classes.Data.DataPackage;
import classes.Data.roomInformation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>room Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link classes.Data.impl.roomInformationImpl#getBedsize <em>Bedsize</em>}</li>
 *   <li>{@link classes.Data.impl.roomInformationImpl#getRoomNr <em>Room Nr</em>}</li>
 *   <li>{@link classes.Data.impl.roomInformationImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link classes.Data.impl.roomInformationImpl#isAvailbility <em>Availbility</em>}</li>
 *   <li>{@link classes.Data.impl.roomInformationImpl#isAccessCard <em>Access Card</em>}</li>
 *   <li>{@link classes.Data.impl.roomInformationImpl#getRoomType <em>Room Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class roomInformationImpl extends MinimalEObjectImpl.Container implements roomInformation {
	/**
	 * The default value of the '{@link #getBedsize() <em>Bedsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedsize()
	 * @generated
	 * @ordered
	 */
	protected static final String BEDSIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBedsize() <em>Bedsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedsize()
	 * @generated
	 * @ordered
	 */
	protected String bedsize = BEDSIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoomNr() <em>Room Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomNr()
	 * @generated
	 * @ordered
	 */
	protected static final int ROOM_NR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRoomNr() <em>Room Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomNr()
	 * @generated
	 * @ordered
	 */
	protected int roomNr = ROOM_NR_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final int PRICE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected int price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #isAvailbility() <em>Availbility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAvailbility()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AVAILBILITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAvailbility() <em>Availbility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAvailbility()
	 * @generated
	 * @ordered
	 */
	protected boolean availbility = AVAILBILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isAccessCard() <em>Access Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAccessCard()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACCESS_CARD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAccessCard() <em>Access Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAccessCard()
	 * @generated
	 * @ordered
	 */
	protected boolean accessCard = ACCESS_CARD_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoomType() <em>Room Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomType()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOM_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoomType() <em>Room Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomType()
	 * @generated
	 * @ordered
	 */
	protected String roomType = ROOM_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected roomInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.ROOM_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBedsize() {
		return bedsize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBedsize(String newBedsize) {
		String oldBedsize = bedsize;
		bedsize = newBedsize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.ROOM_INFORMATION__BEDSIZE, oldBedsize, bedsize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRoomNr() {
		return roomNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomNr(int newRoomNr) {
		int oldRoomNr = roomNr;
		roomNr = newRoomNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.ROOM_INFORMATION__ROOM_NR, oldRoomNr, roomNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(int newPrice) {
		int oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.ROOM_INFORMATION__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAvailbility() {
		return availbility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailbility(boolean newAvailbility) {
		boolean oldAvailbility = availbility;
		availbility = newAvailbility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.ROOM_INFORMATION__AVAILBILITY, oldAvailbility, availbility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAccessCard() {
		return accessCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessCard(boolean newAccessCard) {
		boolean oldAccessCard = accessCard;
		accessCard = newAccessCard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.ROOM_INFORMATION__ACCESS_CARD, oldAccessCard, accessCard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoomType() {
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomType(String newRoomType) {
		String oldRoomType = roomType;
		roomType = newRoomType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.ROOM_INFORMATION__ROOM_TYPE, oldRoomType, roomType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataPackage.ROOM_INFORMATION__BEDSIZE:
				return getBedsize();
			case DataPackage.ROOM_INFORMATION__ROOM_NR:
				return getRoomNr();
			case DataPackage.ROOM_INFORMATION__PRICE:
				return getPrice();
			case DataPackage.ROOM_INFORMATION__AVAILBILITY:
				return isAvailbility();
			case DataPackage.ROOM_INFORMATION__ACCESS_CARD:
				return isAccessCard();
			case DataPackage.ROOM_INFORMATION__ROOM_TYPE:
				return getRoomType();
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
			case DataPackage.ROOM_INFORMATION__BEDSIZE:
				setBedsize((String)newValue);
				return;
			case DataPackage.ROOM_INFORMATION__ROOM_NR:
				setRoomNr((Integer)newValue);
				return;
			case DataPackage.ROOM_INFORMATION__PRICE:
				setPrice((Integer)newValue);
				return;
			case DataPackage.ROOM_INFORMATION__AVAILBILITY:
				setAvailbility((Boolean)newValue);
				return;
			case DataPackage.ROOM_INFORMATION__ACCESS_CARD:
				setAccessCard((Boolean)newValue);
				return;
			case DataPackage.ROOM_INFORMATION__ROOM_TYPE:
				setRoomType((String)newValue);
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
			case DataPackage.ROOM_INFORMATION__BEDSIZE:
				setBedsize(BEDSIZE_EDEFAULT);
				return;
			case DataPackage.ROOM_INFORMATION__ROOM_NR:
				setRoomNr(ROOM_NR_EDEFAULT);
				return;
			case DataPackage.ROOM_INFORMATION__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case DataPackage.ROOM_INFORMATION__AVAILBILITY:
				setAvailbility(AVAILBILITY_EDEFAULT);
				return;
			case DataPackage.ROOM_INFORMATION__ACCESS_CARD:
				setAccessCard(ACCESS_CARD_EDEFAULT);
				return;
			case DataPackage.ROOM_INFORMATION__ROOM_TYPE:
				setRoomType(ROOM_TYPE_EDEFAULT);
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
			case DataPackage.ROOM_INFORMATION__BEDSIZE:
				return BEDSIZE_EDEFAULT == null ? bedsize != null : !BEDSIZE_EDEFAULT.equals(bedsize);
			case DataPackage.ROOM_INFORMATION__ROOM_NR:
				return roomNr != ROOM_NR_EDEFAULT;
			case DataPackage.ROOM_INFORMATION__PRICE:
				return price != PRICE_EDEFAULT;
			case DataPackage.ROOM_INFORMATION__AVAILBILITY:
				return availbility != AVAILBILITY_EDEFAULT;
			case DataPackage.ROOM_INFORMATION__ACCESS_CARD:
				return accessCard != ACCESS_CARD_EDEFAULT;
			case DataPackage.ROOM_INFORMATION__ROOM_TYPE:
				return ROOM_TYPE_EDEFAULT == null ? roomType != null : !ROOM_TYPE_EDEFAULT.equals(roomType);
		}
		return super.eIsSet(featureID);
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
		result.append(" (bedsize: ");
		result.append(bedsize);
		result.append(", roomNr: ");
		result.append(roomNr);
		result.append(", price: ");
		result.append(price);
		result.append(", Availbility: ");
		result.append(availbility);
		result.append(", AccessCard: ");
		result.append(accessCard);
		result.append(", roomType: ");
		result.append(roomType);
		result.append(')');
		return result.toString();
	}

} //roomInformationImpl
