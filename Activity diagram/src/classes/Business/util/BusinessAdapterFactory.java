/**
 */
package classes.Business.util;

import classes.Business.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see classes.Business.BusinessPackage
 * @generated
 */
public class BusinessAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BusinessPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BusinessPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusinessSwitch<Adapter> modelSwitch =
		new BusinessSwitch<Adapter>() {
			@Override
			public Adapter caseReservationHandler(ReservationHandler object) {
				return createReservationHandlerAdapter();
			}
			@Override
			public Adapter caseroomHandler(roomHandler object) {
				return createroomHandlerAdapter();
			}
			@Override
			public Adapter caseCopyOf_Class1_1(CopyOf_Class1_1 object) {
				return createCopyOf_Class1_1Adapter();
			}
			@Override
			public Adapter caseAccountHandler(AccountHandler object) {
				return createAccountHandlerAdapter();
			}
			@Override
			public Adapter casePaymentHandler(PaymentHandler object) {
				return createPaymentHandlerAdapter();
			}
			@Override
			public Adapter casePaymentDetails(PaymentDetails object) {
				return createPaymentDetailsAdapter();
			}
			@Override
			public Adapter casePersonInfo(PersonInfo object) {
				return createPersonInfoAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link classes.Business.ReservationHandler <em>Reservation Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see classes.Business.ReservationHandler
	 * @generated
	 */
	public Adapter createReservationHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link classes.Business.roomHandler <em>room Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see classes.Business.roomHandler
	 * @generated
	 */
	public Adapter createroomHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link classes.Business.CopyOf_Class1_1 <em>Copy Of Class1 1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see classes.Business.CopyOf_Class1_1
	 * @generated
	 */
	public Adapter createCopyOf_Class1_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link classes.Business.AccountHandler <em>Account Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see classes.Business.AccountHandler
	 * @generated
	 */
	public Adapter createAccountHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link classes.Business.PaymentHandler <em>Payment Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see classes.Business.PaymentHandler
	 * @generated
	 */
	public Adapter createPaymentHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link classes.Business.PaymentDetails <em>Payment Details</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see classes.Business.PaymentDetails
	 * @generated
	 */
	public Adapter createPaymentDetailsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link classes.Business.PersonInfo <em>Person Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see classes.Business.PersonInfo
	 * @generated
	 */
	public Adapter createPersonInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BusinessAdapterFactory
