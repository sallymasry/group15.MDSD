/**
 */
package classes.Business;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link classes.Business.PersonInfo#getIrstName <em>Irst Name</em>}</li>
 *   <li>{@link classes.Business.PersonInfo#getLastName <em>Last Name</em>}</li>
 *   <li>{@link classes.Business.PersonInfo#getAdress <em>Adress</em>}</li>
 *   <li>{@link classes.Business.PersonInfo#getPhoneNr <em>Phone Nr</em>}</li>
 * </ul>
 *
 * @see classes.Business.BusinessPackage#getPersonInfo()
 * @model
 * @generated
 */
public interface PersonInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Irst Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Irst Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Irst Name</em>' attribute.
	 * @see #setIrstName(String)
	 * @see classes.Business.BusinessPackage#getPersonInfo_IrstName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getIrstName();

	/**
	 * Sets the value of the '{@link classes.Business.PersonInfo#getIrstName <em>Irst Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Irst Name</em>' attribute.
	 * @see #getIrstName()
	 * @generated
	 */
	void setIrstName(String value);

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
	 * @see classes.Business.BusinessPackage#getPersonInfo_LastName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link classes.Business.PersonInfo#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adress</em>' attribute.
	 * @see #setAdress(String)
	 * @see classes.Business.BusinessPackage#getPersonInfo_Adress()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getAdress();

	/**
	 * Sets the value of the '{@link classes.Business.PersonInfo#getAdress <em>Adress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adress</em>' attribute.
	 * @see #getAdress()
	 * @generated
	 */
	void setAdress(String value);

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
	 * @see classes.Business.BusinessPackage#getPersonInfo_PhoneNr()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getPhoneNr();

	/**
	 * Sets the value of the '{@link classes.Business.PersonInfo#getPhoneNr <em>Phone Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone Nr</em>' attribute.
	 * @see #getPhoneNr()
	 * @generated
	 */
	void setPhoneNr(int value);

} // PersonInfo
