/**
 */
package classes.Data;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Manage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link classes.Data.RoomManage#getRoomInfo <em>Room Info</em>}</li>
 *   <li>{@link classes.Data.RoomManage#getRoomdetails <em>Roomdetails</em>}</li>
 *   <li>{@link classes.Data.RoomManage#getCheckinDate <em>Checkin Date</em>}</li>
 *   <li>{@link classes.Data.RoomManage#getCheckoutDate <em>Checkout Date</em>}</li>
 *   <li>{@link classes.Data.RoomManage#getResNr <em>Res Nr</em>}</li>
 * </ul>
 *
 * @see classes.Data.DataPackage#getRoomManage()
 * @model
 * @generated
 */
public interface RoomManage extends EObject {
	/**
	 * Returns the value of the '<em><b>Room Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Info</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Info</em>' reference.
	 * @see #setRoomInfo(roomInformation)
	 * @see classes.Data.DataPackage#getRoomManage_RoomInfo()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	roomInformation getRoomInfo();

	/**
	 * Sets the value of the '{@link classes.Data.RoomManage#getRoomInfo <em>Room Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Info</em>' reference.
	 * @see #getRoomInfo()
	 * @generated
	 */
	void setRoomInfo(roomInformation value);

	/**
	 * Returns the value of the '<em><b>Roomdetails</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roomdetails</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roomdetails</em>' reference.
	 * @see #setRoomdetails(roomInformation)
	 * @see classes.Data.DataPackage#getRoomManage_Roomdetails()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	roomInformation getRoomdetails();

	/**
	 * Sets the value of the '{@link classes.Data.RoomManage#getRoomdetails <em>Roomdetails</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roomdetails</em>' reference.
	 * @see #getRoomdetails()
	 * @generated
	 */
	void setRoomdetails(roomInformation value);

	/**
	 * Returns the value of the '<em><b>Checkin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checkin Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checkin Date</em>' attribute.
	 * @see #setCheckinDate(int)
	 * @see classes.Data.DataPackage#getRoomManage_CheckinDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getCheckinDate();

	/**
	 * Sets the value of the '{@link classes.Data.RoomManage#getCheckinDate <em>Checkin Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checkin Date</em>' attribute.
	 * @see #getCheckinDate()
	 * @generated
	 */
	void setCheckinDate(int value);

	/**
	 * Returns the value of the '<em><b>Checkout Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checkout Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checkout Date</em>' attribute.
	 * @see #setCheckoutDate(int)
	 * @see classes.Data.DataPackage#getRoomManage_CheckoutDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getCheckoutDate();

	/**
	 * Sets the value of the '{@link classes.Data.RoomManage#getCheckoutDate <em>Checkout Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checkout Date</em>' attribute.
	 * @see #getCheckoutDate()
	 * @generated
	 */
	void setCheckoutDate(int value);

	/**
	 * Returns the value of the '<em><b>Res Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Res Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Res Nr</em>' attribute.
	 * @see #setResNr(int)
	 * @see classes.Data.DataPackage#getRoomManage_ResNr()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getResNr();

	/**
	 * Sets the value of the '{@link classes.Data.RoomManage#getResNr <em>Res Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Res Nr</em>' attribute.
	 * @see #getResNr()
	 * @generated
	 */
	void setResNr(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomRequired="true" roomOrdered="false"
	 * @generated
	 */
	void createRoom(roomInformation room);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomRequired="true" roomOrdered="false"
	 * @generated
	 */
	void updateRoom(roomInformation room);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomRequired="true" roomOrdered="false"
	 * @generated
	 */
	void removeRoom(roomInformation room);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomNrRequired="true" roomNrOrdered="false"
	 * @generated
	 */
	roomInformation getRoomInfo(int roomNr);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model arrDateRequired="true" arrDateOrdered="false" depDateRequired="true" depDateOrdered="false" resNrRequired="true" resNrOrdered="false"
	 * @generated
	 */
	void checkIn(int arrDate, int depDate, int resNr);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model resNrRequired="true" resNrOrdered="false"
	 * @generated
	 */
	void CheckOut(int resNr);

} // RoomManage
