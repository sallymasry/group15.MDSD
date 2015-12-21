/**
 */
package classes.presentation;

import classes.Business.ReservationHandler;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Staff UI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link classes.presentation.StaffUI#getReservationhandler <em>Reservationhandler</em>}</li>
 * </ul>
 *
 * @see classes.presentation.PresentationPackage#getStaffUI()
 * @model
 * @generated
 */
public interface StaffUI extends EObject {
	/**
	 * Returns the value of the '<em><b>Reservationhandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reservationhandler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservationhandler</em>' reference.
	 * @see #setReservationhandler(ReservationHandler)
	 * @see classes.presentation.PresentationPackage#getStaffUI_Reservationhandler()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ReservationHandler getReservationhandler();

	/**
	 * Sets the value of the '{@link classes.presentation.StaffUI#getReservationhandler <em>Reservationhandler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reservationhandler</em>' reference.
	 * @see #getReservationhandler()
	 * @generated
	 */
	void setReservationhandler(ReservationHandler value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomTypeRequired="true" roomTypeOrdered="false" priceRequired="true" priceOrdered="false" arrvDateRequired="true" arrvDateOrdered="false" depDateRequired="true" depDateOrdered="false"
	 * @generated
	 */
	void searchRoomType(String roomType, int price, int arrvDate, int depDate);

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
	void deleteRoom();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model customerInfoRequired="true" customerInfoOrdered="false"
	 * @generated
	 */
	void makeRes(String customerInfo);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model resNrRequired="true" resNrOrdered="false"
	 * @generated
	 */
	void editRes(int resNr);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void cancelRes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model resNrRequired="true" resNrOrdered="false"
	 * @generated
	 */
	void getResInfo(int resNr);

} // StaffUI
