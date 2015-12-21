/**
 */
package classes.Data;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statistics Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link classes.Data.StatisticsHandler#getReservationNr <em>Reservation Nr</em>}</li>
 * </ul>
 *
 * @see classes.Data.DataPackage#getStatisticsHandler()
 * @model
 * @generated
 */
public interface StatisticsHandler extends EObject {
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
	 * @see classes.Data.DataPackage#getStatisticsHandler_ReservationNr()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getReservationNr();

	/**
	 * Sets the value of the '{@link classes.Data.StatisticsHandler#getReservationNr <em>Reservation Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reservation Nr</em>' attribute.
	 * @see #getReservationNr()
	 * @generated
	 */
	void setReservationNr(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void fetchReservations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void calculatePercentage();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void GenerateDiagram();

} // StatisticsHandler
