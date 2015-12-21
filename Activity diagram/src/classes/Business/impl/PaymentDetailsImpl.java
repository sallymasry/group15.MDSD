/**
 */
package classes.Business.impl;

import classes.Business.BusinessPackage;
import classes.Business.PaymentDetails;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Details</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link classes.Business.impl.PaymentDetailsImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link classes.Business.impl.PaymentDetailsImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link classes.Business.impl.PaymentDetailsImpl#getCarsNr <em>Cars Nr</em>}</li>
 *   <li>{@link classes.Business.impl.PaymentDetailsImpl#getCcv <em>Ccv</em>}</li>
 *   <li>{@link classes.Business.impl.PaymentDetailsImpl#getExpMonth <em>Exp Month</em>}</li>
 *   <li>{@link classes.Business.impl.PaymentDetailsImpl#getExpYear <em>Exp Year</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaymentDetailsImpl extends MinimalEObjectImpl.Container implements PaymentDetails {
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
	 * The default value of the '{@link #getCarsNr() <em>Cars Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarsNr()
	 * @generated
	 * @ordered
	 */
	protected static final int CARS_NR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCarsNr() <em>Cars Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarsNr()
	 * @generated
	 * @ordered
	 */
	protected int carsNr = CARS_NR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCcv() <em>Ccv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcv()
	 * @generated
	 * @ordered
	 */
	protected static final int CCV_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCcv() <em>Ccv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCcv()
	 * @generated
	 * @ordered
	 */
	protected int ccv = CCV_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpMonth() <em>Exp Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpMonth()
	 * @generated
	 * @ordered
	 */
	protected static final int EXP_MONTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExpMonth() <em>Exp Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpMonth()
	 * @generated
	 * @ordered
	 */
	protected int expMonth = EXP_MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpYear() <em>Exp Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpYear()
	 * @generated
	 * @ordered
	 */
	protected static final int EXP_YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExpYear() <em>Exp Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpYear()
	 * @generated
	 * @ordered
	 */
	protected int expYear = EXP_YEAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentDetailsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BusinessPackage.Literals.PAYMENT_DETAILS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.PAYMENT_DETAILS__FIRST_NAME, oldFirstName, firstName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.PAYMENT_DETAILS__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCarsNr() {
		return carsNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarsNr(int newCarsNr) {
		int oldCarsNr = carsNr;
		carsNr = newCarsNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.PAYMENT_DETAILS__CARS_NR, oldCarsNr, carsNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCcv() {
		return ccv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCcv(int newCcv) {
		int oldCcv = ccv;
		ccv = newCcv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.PAYMENT_DETAILS__CCV, oldCcv, ccv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExpMonth() {
		return expMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpMonth(int newExpMonth) {
		int oldExpMonth = expMonth;
		expMonth = newExpMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.PAYMENT_DETAILS__EXP_MONTH, oldExpMonth, expMonth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExpYear() {
		return expYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpYear(int newExpYear) {
		int oldExpYear = expYear;
		expYear = newExpYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.PAYMENT_DETAILS__EXP_YEAR, oldExpYear, expYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BusinessPackage.PAYMENT_DETAILS__FIRST_NAME:
				return getFirstName();
			case BusinessPackage.PAYMENT_DETAILS__LAST_NAME:
				return getLastName();
			case BusinessPackage.PAYMENT_DETAILS__CARS_NR:
				return getCarsNr();
			case BusinessPackage.PAYMENT_DETAILS__CCV:
				return getCcv();
			case BusinessPackage.PAYMENT_DETAILS__EXP_MONTH:
				return getExpMonth();
			case BusinessPackage.PAYMENT_DETAILS__EXP_YEAR:
				return getExpYear();
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
			case BusinessPackage.PAYMENT_DETAILS__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case BusinessPackage.PAYMENT_DETAILS__LAST_NAME:
				setLastName((String)newValue);
				return;
			case BusinessPackage.PAYMENT_DETAILS__CARS_NR:
				setCarsNr((Integer)newValue);
				return;
			case BusinessPackage.PAYMENT_DETAILS__CCV:
				setCcv((Integer)newValue);
				return;
			case BusinessPackage.PAYMENT_DETAILS__EXP_MONTH:
				setExpMonth((Integer)newValue);
				return;
			case BusinessPackage.PAYMENT_DETAILS__EXP_YEAR:
				setExpYear((Integer)newValue);
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
			case BusinessPackage.PAYMENT_DETAILS__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case BusinessPackage.PAYMENT_DETAILS__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case BusinessPackage.PAYMENT_DETAILS__CARS_NR:
				setCarsNr(CARS_NR_EDEFAULT);
				return;
			case BusinessPackage.PAYMENT_DETAILS__CCV:
				setCcv(CCV_EDEFAULT);
				return;
			case BusinessPackage.PAYMENT_DETAILS__EXP_MONTH:
				setExpMonth(EXP_MONTH_EDEFAULT);
				return;
			case BusinessPackage.PAYMENT_DETAILS__EXP_YEAR:
				setExpYear(EXP_YEAR_EDEFAULT);
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
			case BusinessPackage.PAYMENT_DETAILS__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case BusinessPackage.PAYMENT_DETAILS__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case BusinessPackage.PAYMENT_DETAILS__CARS_NR:
				return carsNr != CARS_NR_EDEFAULT;
			case BusinessPackage.PAYMENT_DETAILS__CCV:
				return ccv != CCV_EDEFAULT;
			case BusinessPackage.PAYMENT_DETAILS__EXP_MONTH:
				return expMonth != EXP_MONTH_EDEFAULT;
			case BusinessPackage.PAYMENT_DETAILS__EXP_YEAR:
				return expYear != EXP_YEAR_EDEFAULT;
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
		result.append(", carsNr: ");
		result.append(carsNr);
		result.append(", ccv: ");
		result.append(ccv);
		result.append(", expMonth: ");
		result.append(expMonth);
		result.append(", expYear: ");
		result.append(expYear);
		result.append(')');
		return result.toString();
	}

} //PaymentDetailsImpl
