/**
 */
package emf.salestransactions.assignment2.tests;

import emf.salestransactions.assignment2.Assignment2Factory;
import emf.salestransactions.assignment2.Company;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Company</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link emf.salestransactions.assignment2.Company#ValidateCodice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Codice</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class CompanyTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CompanyTest.class);
	}

	/**
	 * Constructs a new Company test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompanyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Company test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Company getFixture() {
		return (Company)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Assignment2Factory.eINSTANCE.createCompany());
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

	/**
	 * Tests the '{@link emf.salestransactions.assignment2.Company#ValidateCodice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Codice</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.salestransactions.assignment2.Company#ValidateCodice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	public void testValidateCodice__DiagnosticChain_Map() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //CompanyTest
