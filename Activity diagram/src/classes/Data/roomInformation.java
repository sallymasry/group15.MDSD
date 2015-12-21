/**
 */
package classes.Data;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>room Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link classes.Data.roomInformation#getBedsize <em>Bedsize</em>}</li>
 *   <li>{@link classes.Data.roomInformation#getRoomNr <em>Room Nr</em>}</li>
 *   <li>{@link classes.Data.roomInformation#getPrice <em>Price</em>}</li>
 *   <li>{@link classes.Data.roomInformation#isAvailbility <em>Availbility</em>}</li>
 *   <li>{@link classes.Data.roomInformation#isAccessCard <em>Access Card</em>}</li>
 *   <li>{@link classes.Data.roomInformation#getRoomType <em>Room Type</em>}</li>
 * </ul>
 *
 * @see classes.Data.DataPackage#getroomInformation()
 * @model
 * @generated
 */
public interface roomInformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Bedsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bedsize</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bedsize</em>' attribute.
	 * @see #setBedsize(String)
	 * @see classes.Data.DataPackage#getroomInformation_Bedsize()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getBedsize();

	/**
	 * Sets the value of the '{@link classes.Data.roomInformation#getBedsize <em>Bedsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bedsize</em>' attribute.
	 * @see #getBedsize()
	 * @generated
	 */
	void setBedsize(String value);

	/**
	 * Returns the value of the '<em><b>Room Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Nr</em>' attribute.
	 * @see #setRoomNr(int)
	 * @see classes.Data.DataPackage#getroomInformation_RoomNr()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getRoomNr();

	/**
	 * Sets the value of the '{@link classes.Data.roomInformation#getRoomNr <em>Room Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Nr</em>' attribute.
	 * @see #getRoomNr()
	 * @generated
	 */
	void setRoomNr(int value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(int)
	 * @see classes.Data.DataPackage#getroomInformation_Price()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getPrice();

	/**
	 * Sets the value of the '{@link classes.Data.roomInformation#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(int value);

	/**
	 * Returns the value of the '<em><b>Availbility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Availbility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availbility</em>' attribute.
	 * @see #setAvailbility(boolean)
	 * @see classes.Data.DataPackage#getroomInformation_Availbility()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isAvailbility();

	/**
	 * Sets the value of the '{@link classes.Data.roomInformation#isAvailbility <em>Availbility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availbility</em>' attribute.
	 * @see #isAvailbility()
	 * @generated
	 */
	void setAvailbility(boolean value);

	/**
	 * Returns the value of the '<em><b>Access Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Card</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Card</em>' attribute.
	 * @see #setAccessCard(boolean)
	 * @see classes.Data.DataPackage#getroomInformation_AccessCard()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isAccessCard();

	/**
	 * Sets the value of the '{@link classes.Data.roomInformation#isAccessCard <em>Access Card</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Card</em>' attribute.
	 * @see #isAccessCard()
	 * @generated
	 */
	void setAccessCard(boolean value);

	/**
	 * Returns the value of the '<em><b>Room Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Type</em>' attribute.
	 * @see #setRoomType(String)
	 * @see classes.Data.DataPackage#getroomInformation_RoomType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getRoomType();

	/**
	 * Sets the value of the '{@link classes.Data.roomInformation#getRoomType <em>Room Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Type</em>' attribute.
	 * @see #getRoomType()
	 * @generated
	 */
	void setRoomType(String value);

} // roomInformation
