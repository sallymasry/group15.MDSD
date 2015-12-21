/**
 */
package classes.Data;

import classes.Business.PersonInfo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reservation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link classes.Data.Reservation#getArrDate <em>Arr Date</em>}</li>
 *   <li>{@link classes.Data.Reservation#getDepDate <em>Dep Date</em>}</li>
 *   <li>{@link classes.Data.Reservation#getResNr <em>Res Nr</em>}</li>
 *   <li>{@link classes.Data.Reservation#getPersonDetails <em>Person Details</em>}</li>
 *   <li>{@link classes.Data.Reservation#getRoommanage <em>Roommanage</em>}</li>
 *   <li>{@link classes.Data.Reservation#getStatisticshandler <em>Statisticshandler</em>}</li>
 * </ul>
 *
 * @see classes.Data.DataPackage#getReservation()
 * @model
 * @generated
 */
public interface Reservation extends EObject {
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
	 * @see classes.Data.DataPackage#getReservation_ArrDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getArrDate();

	/**
	 * Sets the value of the '{@link classes.Data.Reservation#getArrDate <em>Arr Date</em>}' attribute.
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
	 * @see classes.Data.DataPackage#getReservation_DepDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getDepDate();

	/**
	 * Sets the value of the '{@link classes.Data.Reservation#getDepDate <em>Dep Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dep Date</em>' attribute.
	 * @see #getDepDate()
	 * @generated
	 */
	void setDepDate(int value);

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
	 * @see classes.Data.DataPackage#getReservation_ResNr()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getResNr();

	/**
	 * Sets the value of the '{@link classes.Data.Reservation#getResNr <em>Res Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Res Nr</em>' attribute.
	 * @see #getResNr()
	 * @generated
	 */
	void setResNr(int value);

	/**
	 * Returns the value of the '<em><b>Person Details</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person Details</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person Details</em>' reference.
	 * @see #setPersonDetails(PersonInfo)
	 * @see classes.Data.DataPackage#getReservation_PersonDetails()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PersonInfo getPersonDetails();

	/**
	 * Sets the value of the '{@link classes.Data.Reservation#getPersonDetails <em>Person Details</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person Details</em>' reference.
	 * @see #getPersonDetails()
	 * @generated
	 */
	void setPersonDetails(PersonInfo value);

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
	 * @see classes.Data.DataPackage#getReservation_Roommanage()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomManage getRoommanage();

	/**
	 * Sets the value of the '{@link classes.Data.Reservation#getRoommanage <em>Roommanage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roommanage</em>' reference.
	 * @see #getRoommanage()
	 * @generated
	 */
	void setRoommanage(RoomManage value);

	/**
	 * Returns the value of the '<em><b>Statisticshandler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statisticshandler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statisticshandler</em>' reference.
	 * @see #setStatisticshandler(StatisticsHandler)
	 * @see classes.Data.DataPackage#getReservation_Statisticshandler()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StatisticsHandler getStatisticshandler();

	/**
	 * Sets the value of the '{@link classes.Data.Reservation#getStatisticshandler <em>Statisticshandler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statisticshandler</em>' reference.
	 * @see #getStatisticshandler()
	 * @generated
	 */
	void setStatisticshandler(StatisticsHandler value);

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
	void createRes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void updateRes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeRes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addPaymentDetails();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void edirRoom();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void validateResNr();

} // Reservation
