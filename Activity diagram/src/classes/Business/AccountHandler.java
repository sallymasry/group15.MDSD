/**
 */
package classes.Business;

import classes.Data.StaffDetails;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link classes.Business.AccountHandler#getStaffinfo <em>Staffinfo</em>}</li>
 *   <li>{@link classes.Business.AccountHandler#getId <em>Id</em>}</li>
 *   <li>{@link classes.Business.AccountHandler#getPass <em>Pass</em>}</li>
 * </ul>
 *
 * @see classes.Business.BusinessPackage#getAccountHandler()
 * @model
 * @generated
 */
public interface AccountHandler extends EObject {
	/**
	 * Returns the value of the '<em><b>Staffinfo</b></em>' reference list.
	 * The list contents are of type {@link classes.Data.StaffDetails}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Staffinfo</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staffinfo</em>' reference list.
	 * @see classes.Business.BusinessPackage#getAccountHandler_Staffinfo()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<StaffDetails> getStaffinfo();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see classes.Business.BusinessPackage#getAccountHandler_Id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link classes.Business.AccountHandler#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Pass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pass</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pass</em>' attribute.
	 * @see #setPass(String)
	 * @see classes.Business.BusinessPackage#getAccountHandler_Pass()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getPass();

	/**
	 * Sets the value of the '{@link classes.Business.AccountHandler#getPass <em>Pass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pass</em>' attribute.
	 * @see #getPass()
	 * @generated
	 */
	void setPass(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" IdRequired="true" IdOrdered="false" passRequired="true" passOrdered="false"
	 * @generated
	 */
	String ValidateStaffInfo(String Id, String pass);

} // AccountHandler
