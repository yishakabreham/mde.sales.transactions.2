/**
 */
package emf.salestransactions.assignment2.tests;

import emf.salestransactions.assignment2.Assignment2Factory;
import emf.salestransactions.assignment2.Tax;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tax</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaxTest extends TestCase {

	/**
	 * The fixture for this Tax test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tax fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TaxTest.class);
	}

	/**
	 * Constructs a new Tax test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaxTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Tax test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Tax fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Tax test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tax getFixture() {
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
		setFixture(Assignment2Factory.eINSTANCE.createTax());
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

} //TaxTest
