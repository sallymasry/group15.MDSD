/**
 */
package classes.Data;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Staff Details</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link classes.Data.StaffDetails#getFirstName <em>First Name</em>}</li>
 *   <li>{@link classes.Data.StaffDetails#getLastName <em>Last Name</em>}</li>
 *   <li>{@link classes.Data.StaffDetails#getPhoneNr <em>Phone Nr</em>}</li>
 *   <li>{@link classes.Data.StaffDetails#getAddress <em>Address</em>}</li>
 *   <li>{@link classes.Data.StaffDetails#getId <em>Id</em>}</li>
 *   <li>{@link classes.Data.StaffDetails#getPass <em>Pass</em>}</li>
 * </ul>
 *
 * @see classes.Data.DataPackage#getStaffDetails()
 * @model
 * @generated
 */
public interface StaffDetails extends EObject {
	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see classes.Data.DataPackage#getStaffDetails_FirstName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link classes.Data.StaffDetails#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see classes.Data.DataPackage#getStaffDetails_LastName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link classes.Data.StaffDetails#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Phone Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phone Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone Nr</em>' attribute.
	 * @see #setPhoneNr(int)
	 * @see classes.Data.DataPackage#getStaffDetails_PhoneNr()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getPhoneNr();

	/**
	 * Sets the value of the '{@link classes.Data.StaffDetails#getPhoneNr <em>Phone Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone Nr</em>' attribute.
	 * @see #getPhoneNr()
	 * @generated
	 */
	void setPhoneNr(int value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see classes.Data.DataPackage#getStaffDetails_Address()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link classes.Data.StaffDetails#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

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
	 * @see classes.Data.DataPackage#getStaffDetails_Id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link classes.Data.StaffDetails#getId <em>Id</em>}' attribute.
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
	 * @see classes.Data.DataPackage#getStaffDetails_Pass()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getPass();

	/**
	 * Sets the value of the '{@link classes.Data.StaffDetails#getPass <em>Pass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pass</em>' attribute.
	 * @see #getPass()
	 * @generated
	 */
	void setPass(String value);

} // StaffDetails
