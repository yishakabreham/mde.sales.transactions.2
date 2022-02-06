/**
 */
package emf.salestransactions.assignment2.tests;

import emf.salestransactions.assignment2.AdditionalCharge;
import emf.salestransactions.assignment2.Assignment2Factory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Additional Charge</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdditionalChargeTest extends TestCase {

	/**
	 * The fixture for this Additional Charge test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdditionalCharge fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AdditionalChargeTest.class);
	}

	/**
	 * Constructs a new Additional Charge test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalChargeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Additional Charge test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AdditionalCharge fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Additional Charge test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdditionalCharge getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Assignment2Factory.eINSTANCE.createAdditionalCharge());
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

} //AdditionalChargeTest
