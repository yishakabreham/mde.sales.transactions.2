/**
 */
package emf.salestransactions.assignment2.tests;

import emf.salestransactions.assignment2.Assignment2Factory;
import emf.salestransactions.assignment2.Cashier;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cashier</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CashierTest extends PersonTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CashierTest.class);
	}

	/**
	 * Constructs a new Cashier test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CashierTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cashier test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Cashier getFixture() {
		return (Cashier)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Assignment2Factory.eINSTANCE.createCashier());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CashierTest
