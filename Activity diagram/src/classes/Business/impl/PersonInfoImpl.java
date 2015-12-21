/**
 */
package classes.Business.impl;

import classes.Business.BusinessPackage;
import classes.Business.PersonInfo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link classes.Business.impl.PersonInfoImpl#getIrstName <em>Irst Name</em>}</li>
 *   <li>{@link classes.Business.impl.PersonInfoImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link classes.Business.impl.PersonInfoImpl#getAdress <em>Adress</em>}</li>
 *   <li>{@link classes.Business.impl.PersonInfoImpl#getPhoneNr <em>Phone Nr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonInfoImpl extends MinimalEObjectImpl.Container implements PersonInfo {
	/**
	 * The default value of the '{@link #getIrstName() <em>Irst Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIrstName()
	 * @generated
	 * @ordered
	 */
	protected static final String IRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIrstName() <em>Irst Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIrstName()
	 * @generated
	 * @ordered
	 */
	protected String irstName = IRST_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getAdress() <em>Adress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdress() <em>Adress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdress()
	 * @generated
	 * @ordered
	 */
	protected String adress = ADRESS_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BusinessPackage.Literals.PERSON_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIrstName() {
		return irstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIrstName(String newIrstName) {
		String oldIrstName = irstName;
		irstName = newIrstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.PERSON_INFO__IRST_NAME, oldIrstName, irstName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.PERSON_INFO__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdress() {
		return adress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdress(String newAdress) {
		String oldAdress = adress;
		adress = newAdress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.PERSON_INFO__ADRESS, oldAdress, adress));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.PERSON_INFO__PHONE_NR, oldPhoneNr, phoneNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BusinessPackage.PERSON_INFO__IRST_NAME:
				return getIrstName();
			case BusinessPackage.PERSON_INFO__LAST_NAME:
				return getLastName();
			case BusinessPackage.PERSON_INFO__ADRESS:
				return getAdress();
			case BusinessPackage.PERSON_INFO__PHONE_NR:
				return getPhoneNr();
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
			case BusinessPackage.PERSON_INFO__IRST_NAME:
				setIrstName((String)newValue);
				return;
			case BusinessPackage.PERSON_INFO__LAST_NAME:
				setLastName((String)newValue);
				return;
			case BusinessPackage.PERSON_INFO__ADRESS:
				setAdress((String)newValue);
				return;
			case BusinessPackage.PERSON_INFO__PHONE_NR:
				setPhoneNr((Integer)newValue);
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
			case BusinessPackage.PERSON_INFO__IRST_NAME:
				setIrstName(IRST_NAME_EDEFAULT);
				return;
			case BusinessPackage.PERSON_INFO__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case BusinessPackage.PERSON_INFO__ADRESS:
				setAdress(ADRESS_EDEFAULT);
				return;
			case BusinessPackage.PERSON_INFO__PHONE_NR:
				setPhoneNr(PHONE_NR_EDEFAULT);
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
			case BusinessPackage.PERSON_INFO__IRST_NAME:
				return IRST_NAME_EDEFAULT == null ? irstName != null : !IRST_NAME_EDEFAULT.equals(irstName);
			case BusinessPackage.PERSON_INFO__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case BusinessPackage.PERSON_INFO__ADRESS:
				return ADRESS_EDEFAULT == null ? adress != null : !ADRESS_EDEFAULT.equals(adress);
			case BusinessPackage.PERSON_INFO__PHONE_NR:
				return phoneNr != PHONE_NR_EDEFAULT;
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
		result.append(" (irstName: ");
		result.append(irstName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(", adress: ");
		result.append(adress);
		result.append(", phoneNr: ");
		result.append(phoneNr);
		result.append(')');
		return result.toString();
	}

} //PersonInfoImpl
