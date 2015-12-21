/**
 */
package classes.Business;

import classes.Data.Reservation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reservation Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link classes.Business.ReservationHandler#getArrDate <em>Arr Date</em>}</li>
 *   <li>{@link classes.Business.ReservationHandler#getDepDate <em>Dep Date</em>}</li>
 *   <li>{@link classes.Business.ReservationHandler#getReservationNr <em>Reservation Nr</em>}</li>
 *   <li>{@link classes.Business.ReservationHandler#getPerson <em>Person</em>}</li>
 *   <li>{@link classes.Business.ReservationHandler#getGuests <em>Guests</em>}</li>
 *   <li>{@link classes.Business.ReservationHandler#getRoomhandler <em>Roomhandler</em>}</li>
 *   <li>{@link classes.Business.ReservationHandler#getReservation <em>Reservation</em>}</li>
 * </ul>
 *
 * @see classes.Business.BusinessPackage#getReservationHandler()
 * @model
 * @generated
 */
public interface ReservationHandler extends EObject {
	/**
	 * Returns the value of the '<em><b>Arr Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arr Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arr Date</em>' attribute.
	 * @see #setArrDate(int)
	 * @see classes.Business.BusinessPackage#getReservationHandler_ArrDate()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getArrDate();

	/**
	 * Sets the value of the '{@link classes.Business.ReservationHandler#getArrDate <em>Arr Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arr Date</em>' attribute.
	 * @see #getArrDate()
	 * @generated
	 */
	void setArrDate(int value);

	/**
	 * Returns the value of the '<em><b>Dep Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dep Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dep Date</em>' attribute.
	 * @see #setDepDate(int)
	 * @see classes.Business.BusinessPackage#getReservationHandler_DepDate()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getDepDate();

	/**
	 * Sets the value of the '{@link classes.Business.ReservationHandler#getDepDate <em>Dep Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dep Date</em>' attribute.
	 * @see #getDepDate()
	 * @generated
	 */
	void setDepDate(int value);

	/**
	 * Returns the value of the '<em><b>Reservation Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reservation Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservation Nr</em>' attribute.
	 * @see #setReservationNr(int)
	 * @see classes.Business.BusinessPackage#getReservationHandler_ReservationNr()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getReservationNr();

	/**
	 * Sets the value of the '{@link classes.Business.ReservationHandler#getReservationNr <em>Reservation Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reservation Nr</em>' attribute.
	 * @see #getReservationNr()
	 * @generated
	 */
	void setReservationNr(int value);

	/**
	 * Returns the value of the '<em><b>Person</b></em>' reference list.
	 * The list contents are of type {@link classes.Business.PersonInfo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' reference list.
	 * @see classes.Business.BusinessPackage#getReservationHandler_Person()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<PersonInfo> getPerson();

	/**
	 * Returns the value of the '<em><b>Guests</b></em>' reference list.
	 * The list contents are of type {@link classes.Business.PersonInfo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guests</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guests</em>' reference list.
	 * @see classes.Business.BusinessPackage#getReservationHandler_Guests()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<PersonInfo> getGuests();

	/**
	 * Returns the value of the '<em><b>Roomhandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roomhandler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roomhandler</em>' reference.
	 * @see #setRoomhandler(roomHandler)
	 * @see classes.Business.BusinessPackage#getReservationHandler_Roomhandler()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	roomHandler getRoomhandler();

	/**
	 * Sets the value of the '{@link classes.Business.ReservationHandler#getRoomhandler <em>Roomhandler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roomhandler</em>' reference.
	 * @see #getRoomhandler()
	 * @generated
	 */
	void setRoomhandler(roomHandler value);

	/**
	 * Returns the value of the '<em><b>Reservation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reservation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservation</em>' reference.
	 * @see #setReservation(Reservation)
	 * @see classes.Business.BusinessPackage#getReservationHandler_Reservation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Reservation getReservation();

	/**
	 * Sets the value of the '{@link classes.Business.ReservationHandler#getReservation <em>Reservation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reservation</em>' reference.
	 * @see #getReservation()
	 * @generated
	 */
	void setReservation(Reservation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addRoom();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeRoom();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addReservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void updateReservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeReservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void EditRoom();

} // ReservationHandler
