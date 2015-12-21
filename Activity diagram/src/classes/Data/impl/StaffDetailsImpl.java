/**
 */
package classes.Data.impl;

import classes.Data.DataPackage;
import classes.Data.StaffDetails;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Staff Details</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link classes.Data.impl.StaffDetailsImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link classes.Data.impl.StaffDetailsImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link classes.Data.impl.StaffDetailsImpl#getPhoneNr <em>Phone Nr</em>}</li>
 *   <li>{@link classes.Data.impl.StaffDetailsImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link classes.Data.impl.StaffDetailsImpl#getId <em>Id</em>}</li>
 *   <li>{@link classes.Data.impl.StaffDetailsImpl#getPass <em>Pass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StaffDetailsImpl extends MinimalEObjectImpl.Container implements StaffDetails {
	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhoneNr() <em>Phone Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNr()
	 * @generated
	 * @ordered
	 */
	protected static final int PHONE_NR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPhoneNr() <em>Phone Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNr()
	 * @generated
	 * @ordered
	 */
	protected int phoneNr = PHONE_NR_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPass() <em>Pass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPass()
	 * @generated
	 * @ordered
	 */
	protected static final String PASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPass() <em>Pass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPass()
	 * @generated
	 * @ordered
	 */
	protected String pass = PASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaffDetailsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.STAFF_DETAILS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.STAFF_DETAILS__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.STAFF_DETAILS__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPhoneNr() {
		return phoneNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhoneNr(int newPhoneNr) {
		int oldPhoneNr = phoneNr;
		phoneNr = newPhoneNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.STAFF_DETAILS__PHONE_NR, oldPhoneNr, phoneNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.STAFF_DETAILS__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.STAFF_DETAILS__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPass() {
		return pass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPass(String newPass) {
		String oldPass = pass;
		pass = newPass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.STAFF_DETAILS__PASS, oldPass, pass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataPackage.STAFF_DETAILS__FIRST_NAME:
				return getFirstName();
			case DataPackage.STAFF_DETAILS__LAST_NAME:
				return getLastName();
			case DataPackage.STAFF_DETAILS__PHONE_NR:
				return getPhoneNr();
			case DataPackage.STAFF_DETAILS__ADDRESS:
				return getAddress();
			case DataPackage.STAFF_DETAILS__ID:
				return getId();
			case DataPackage.STAFF_DETAILS__PASS:
				return getPass();
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
			case DataPackage.STAFF_DETAILS__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case DataPackage.STAFF_DETAILS__LAST_NAME:
				setLastName((String)newValue);
				return;
			case DataPackage.STAFF_DETAILS__PHONE_NR:
				setPhoneNr((Integer)newValue);
				return;
			case DataPackage.STAFF_DETAILS__ADDRESS:
				setAddress((String)newValue);
				return;
			case DataPackage.STAFF_DETAILS__ID:
				setId((String)newValue);
				return;
			case DataPackage.STAFF_DETAILS__PASS:
				setPass((String)newValue);
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
			case DataPackage.STAFF_DETAILS__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case DataPackage.STAFF_DETAILS__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case DataPackage.STAFF_DETAILS__PHONE_NR:
				setPhoneNr(PHONE_NR_EDEFAULT);
				return;
			case DataPackage.STAFF_DETAILS__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case DataPackage.STAFF_DETAILS__ID:
				setId(ID_EDEFAULT);
				return;
			case DataPackage.STAFF_DETAILS__PASS:
				setPass(PASS_EDEFAULT);
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
			case DataPackage.STAFF_DETAILS__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case DataPackage.STAFF_DETAILS__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case DataPackage.STAFF_DETAILS__PHONE_NR:
				return phoneNr != PHONE_NR_EDEFAULT;
			case DataPackage.STAFF_DETAILS__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case DataPackage.STAFF_DETAILS__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DataPackage.STAFF_DETAILS__PASS:
				return PASS_EDEFAULT == null ? pass != null : !PASS_EDEFAULT.equals(pass);
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
		result.append(" (firstName: ");
		result.append(firstName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(", phoneNr: ");
		result.append(phoneNr);
		result.append(", address: ");
		result.append(address);
		result.append(", Id: ");
		result.append(id);
		result.append(", pass: ");
		result.append(pass);
		result.append(')');
		return result.toString();
	}

} //StaffDetailsImpl
