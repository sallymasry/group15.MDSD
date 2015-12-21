/**
 */
package classes.External.impl;

import classes.Business.BusinessPackage;

import classes.Business.impl.BusinessPackageImpl;

import classes.Data.DataPackage;

import classes.Data.impl.DataPackageImpl;

import classes.External.ExternalFactory;
import classes.External.ExternalPackage;
import classes.External.Payment;

import classes.presentation.PresentationPackage;

import classes.presentation.impl.PresentationPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.types.impl.TypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExternalPackageImpl extends EPackageImpl implements ExternalPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see classes.External.ExternalPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExternalPackageImpl() {
		super(eNS_URI, ExternalFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ExternalPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExternalPackage init() {
		if (isInited) return (ExternalPackage)EPackage.Registry.INSTANCE.getEPackage(ExternalPackage.eNS_URI);

		// Obtain or create and register package
		ExternalPackageImpl theExternalPackage = (ExternalPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExternalPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExternalPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
		BusinessPackageImpl theBusinessPackage = (BusinessPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BusinessPackage.eNS_URI) instanceof BusinessPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BusinessPackage.eNS_URI) : BusinessPackage.eINSTANCE);
		PresentationPackageImpl thePresentationPackage = (PresentationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PresentationPackage.eNS_URI) instanceof PresentationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PresentationPackage.eNS_URI) : PresentationPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theExternalPackage.createPackageContents();
		theDataPackage.createPackageContents();
		theBusinessPackage.createPackageContents();
		thePresentationPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theExternalPackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theBusinessPackage.initializePackageContents();
		thePresentationPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExternalPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExternalPackage.eNS_URI, theExternalPackage);
		return theExternalPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPayment() {
		return paymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPayment__ValidatePayment() {
		return paymentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalFactory getExternalFactory() {
		return (ExternalFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		paymentEClass = createEClass(PAYMENT);
		createEOperation(paymentEClass, PAYMENT___VALIDATE_PAYMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(paymentEClass, Payment.class, "Payment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getPayment__ValidatePayment(), null, "validatePayment", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ExternalPackageImpl
