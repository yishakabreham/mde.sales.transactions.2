/**
 */
package emf.salestransactions.assignment2.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>assignment2</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class Assignment2Tests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new Assignment2Tests("assignment2 Tests");
		suite.addTestSuite(CompanyTest.class);
		suite.addTestSuite(ItemTest.class);
		suite.addTestSuite(TransactionTest.class);
		suite.addTestSuite(LineItemTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment2Tests(String name) {
		super(name);
	}

} //Assignment2Tests
