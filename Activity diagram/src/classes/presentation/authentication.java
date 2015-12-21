/**
 */
package classes.presentation;

import classes.Business.AccountHandler;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>authentication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link classes.presentation.authentication#getAccounthandler <em>Accounthandler</em>}</li>
 *   <li>{@link classes.presentation.authentication#getStaffui <em>Staffui</em>}</li>
 * </ul>
 *
 * @see classes.presentation.PresentationPackage#getauthentication()
 * @model
 * @generated
 */
public interface authentication extends EObject {
	/**
	 * Returns the value of the '<em><b>Accounthandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accounthandler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accounthandler</em>' reference.
	 * @see #setAccounthandler(AccountHandler)
	 * @see classes.presentation.PresentationPackage#getauthentication_Accounthandler()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AccountHandler getAccounthandler();

	/**
	 * Sets the value of the '{@link classes.presentation.authentication#getAccounthandler <em>Accounthandler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accounthandler</em>' reference.
	 * @see #getAccounthandler()
	 * @generated
	 */
	void setAccounthandler(AccountHandler value);

	/**
	 * Returns the value of the '<em><b>Staffui</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Staffui</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staffui</em>' reference.
	 * @see #setStaffui(StaffUI)
	 * @see classes.presentation.PresentationPackage#getauthentication_Staffui()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StaffUI getStaffui();

	/**
	 * Sets the value of the '{@link classes.presentation.authentication#getStaffui <em>Staffui</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Staffui</em>' reference.
	 * @see #getStaffui()
	 * @generated
	 */
	void setStaffui(StaffUI value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model IdRequired="true" IdOrdered="false" passRequired="true" passOrdered="false"
	 * @generated
	 */
	void logIn(String Id, String pass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void LogOut();

} // authentication
