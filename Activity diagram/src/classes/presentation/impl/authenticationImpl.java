/**
 */
package classes.presentation.impl;

import classes.Business.AccountHandler;

import classes.presentation.PresentationPackage;
import classes.presentation.StaffUI;
import classes.presentation.authentication;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>authentication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link classes.presentation.impl.authenticationImpl#getAccounthandler <em>Accounthandler</em>}</li>
 *   <li>{@link classes.presentation.impl.authenticationImpl#getStaffui <em>Staffui</em>}</li>
 * </ul>
 *
 * @generated
 */
public class authenticationImpl extends MinimalEObjectImpl.Container implements authentication {
	/**
	 * The cached value of the '{@link #getAccounthandler() <em>Accounthandler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccounthandler()
	 * @generated
	 * @ordered
	 */
	protected AccountHandler accounthandler;

	/**
	 * The cached value of the '{@link #getStaffui() <em>Staffui</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaffui()
	 * @generated
	 * @ordered
	 */
	protected StaffUI staffui;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected authenticationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PresentationPackage.Literals.AUTHENTICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountHandler getAccounthandler() {
		if (accounthandler != null && accounthandler.eIsProxy()) {
			InternalEObject oldAccounthandler = (InternalEObject)accounthandler;
			accounthandler = (AccountHandler)eResolveProxy(oldAccounthandler);
			if (accounthandler != oldAccounthandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PresentationPackage.AUTHENTICATION__ACCOUNTHANDLER, oldAccounthandler, accounthandler));
			}
		}
		return accounthandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountHandler basicGetAccounthandler() {
		return accounthandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccounthandler(AccountHandler newAccounthandler) {
		AccountHandler oldAccounthandler = accounthandler;
		accounthandler = newAccounthandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.AUTHENTICATION__ACCOUNTHANDLER, oldAccounthandler, accounthandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffUI getStaffui() {
		if (staffui != null && staffui.eIsProxy()) {
			InternalEObject oldStaffui = (InternalEObject)staffui;
			staffui = (StaffUI)eResolveProxy(oldStaffui);
			if (staffui != oldStaffui) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PresentationPackage.AUTHENTICATION__STAFFUI, oldStaffui, staffui));
			}
		}
		return staffui;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffUI basicGetStaffui() {
		return staffui;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaffui(StaffUI newStaffui) {
		StaffUI oldStaffui = staffui;
		staffui = newStaffui;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PresentationPackage.AUTHENTICATION__STAFFUI, oldStaffui, staffui));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void logIn(String Id, String pass) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void LogOut() {
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
			case PresentationPackage.AUTHENTICATION__ACCOUNTHANDLER:
				if (resolve) return getAccounthandler();
				return basicGetAccounthandler();
			case PresentationPackage.AUTHENTICATION__STAFFUI:
				if (resolve) return getStaffui();
				return basicGetStaffui();
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
			case PresentationPackage.AUTHENTICATION__ACCOUNTHANDLER:
				setAccounthandler((AccountHandler)newValue);
				return;
			case PresentationPackage.AUTHENTICATION__STAFFUI:
				setStaffui((StaffUI)newValue);
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
			case PresentationPackage.AUTHENTICATION__ACCOUNTHANDLER:
				setAccounthandler((AccountHandler)null);
				return;
			case PresentationPackage.AUTHENTICATION__STAFFUI:
				setStaffui((StaffUI)null);
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
			case PresentationPackage.AUTHENTICATION__ACCOUNTHANDLER:
				return accounthandler != null;
			case PresentationPackage.AUTHENTICATION__STAFFUI:
				return staffui != null;
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
			case PresentationPackage.AUTHENTICATION___LOG_IN__STRING_STRING:
				logIn((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case PresentationPackage.AUTHENTICATION___LOG_OUT:
				LogOut();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //authenticationImpl
