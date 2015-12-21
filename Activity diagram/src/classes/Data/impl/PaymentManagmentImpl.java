/**
 */
package classes.Data.impl;

import classes.Business.PaymentDetails;

import classes.Data.DataPackage;
import classes.Data.PaymentManagment;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payment Managment</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PaymentManagmentImpl extends MinimalEObjectImpl.Container implements PaymentManagment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaymentManagmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.PAYMENT_MANAGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void isCardValid(PaymentDetails paymentDetails) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DataPackage.PAYMENT_MANAGMENT___IS_CARD_VALID__PAYMENTDETAILS:
				isCardValid((PaymentDetails)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //PaymentManagmentImpl
