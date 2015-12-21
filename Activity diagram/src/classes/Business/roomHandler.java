/**
 */
package classes.Business;

import classes.Data.RoomManage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>room Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link classes.Business.roomHandler#isAvailability <em>Availability</em>}</li>
 *   <li>{@link classes.Business.roomHandler#getRoommanage <em>Roommanage</em>}</li>
 * </ul>
 *
 * @see classes.Business.BusinessPackage#getroomHandler()
 * @model
 * @generated
 */
public interface roomHandler extends EObject {
	/**
	 * Returns the value of the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Availability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availability</em>' attribute.
	 * @see #setAvailability(boolean)
	 * @see classes.Business.BusinessPackage#getroomHandler_Availability()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isAvailability();

	/**
	 * Sets the value of the '{@link classes.Business.roomHandler#isAvailability <em>Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability</em>' attribute.
	 * @see #isAvailability()
	 * @generated
	 */
	void setAvailability(boolean value);

	/**
	 * Returns the value of the '<em><b>Roommanage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roommanage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roommanage</em>' reference.
	 * @see #setRoommanage(RoomManage)
	 * @see classes.Business.BusinessPackage#getroomHandler_Roommanage()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomManage getRoommanage();

	/**
	 * Sets the value of the '{@link classes.Business.roomHandler#getRoommanage <em>Roommanage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roommanage</em>' reference.
	 * @see #getRoommanage()
	 * @generated
	 */
	void setRoommanage(RoomManage value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void checkavailability();

} // roomHandler
