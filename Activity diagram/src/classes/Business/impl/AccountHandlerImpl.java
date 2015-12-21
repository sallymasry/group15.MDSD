/**
 */
package classes.Business.impl;

import classes.Business.AccountHandler;
import classes.Business.BusinessPackage;

import classes.Data.StaffDetails;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link classes.Business.impl.AccountHandlerImpl#getStaffinfo <em>Staffinfo</em>}</li>
 *   <li>{@link classes.Business.impl.AccountHandlerImpl#getId <em>Id</em>}</li>
 *   <li>{@link classes.Business.impl.AccountHandlerImpl#getPass <em>Pass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccountHandlerImpl extends MinimalEObjectImpl.Container implements AccountHandler {
	/**
	 * The cached value of the '{@link #getStaffinfo() <em>Staffinfo</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaffinfo()
	 * @generated
	 * @ordered
	 */
	protected EList<StaffDetails> staffinfo;

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
	protected AccountHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BusinessPackage.Literals.ACCOUNT_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StaffDetails> getStaffinfo() {
		if (staffinfo == null) {
			staffinfo = new EObjectResolvingEList<StaffDetails>(StaffDetails.class, this, BusinessPackage.ACCOUNT_HANDLER__STAFFINFO);
		}
		return staffinfo;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.ACCOUNT_HANDLER__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BusinessPackage.ACCOUNT_HANDLER__PASS, oldPass, pass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String ValidateStaffInfo(String Id, String pass) {
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
			case BusinessPackage.ACCOUNT_HANDLER__STAFFINFO:
				return getStaffinfo();
			case BusinessPackage.ACCOUNT_HANDLER__ID:
				return getId();
			case BusinessPackage.ACCOUNT_HANDLER__PASS:
				return getPass();
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
			case BusinessPackage.ACCOUNT_HANDLER__STAFFINFO:
				getStaffinfo().clear();
				getStaffinfo().addAll((Collection<? extends StaffDetails>)newValue);
				return;
			case BusinessPackage.ACCOUNT_HANDLER__ID:
				setId((String)newValue);
				return;
			case BusinessPackage.ACCOUNT_HANDLER__PASS:
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
			case BusinessPackage.ACCOUNT_HANDLER__STAFFINFO:
				getStaffinfo().clear();
				return;
			case BusinessPackage.ACCOUNT_HANDLER__ID:
				setId(ID_EDEFAULT);
				return;
			case BusinessPackage.ACCOUNT_HANDLER__PASS:
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
			case BusinessPackage.ACCOUNT_HANDLER__STAFFINFO:
				return staffinfo != null && !staffinfo.isEmpty();
			case BusinessPackage.ACCOUNT_HANDLER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case BusinessPackage.ACCOUNT_HANDLER__PASS:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BusinessPackage.ACCOUNT_HANDLER___VALIDATE_STAFF_INFO__STRING_STRING:
				return ValidateStaffInfo((String)arguments.get(0), (String)arguments.get(1));
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
		result.append(" (Id: ");
		result.append(id);
		result.append(", pass: ");
		result.append(pass);
		result.append(')');
		return result.toString();
	}

} //AccountHandlerImpl
