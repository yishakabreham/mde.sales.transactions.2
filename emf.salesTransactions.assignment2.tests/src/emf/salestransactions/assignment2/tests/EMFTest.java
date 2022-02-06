package emf.salestransactions.assignment2.tests;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import emf.salestransactions.assignment2.Address;
import emf.salestransactions.assignment2.Assignment2Factory;
import emf.salestransactions.assignment2.Company;
import emf.salestransactions.assignment2.Item;
import emf.salestransactions.assignment2.Price;
import emf.salestransactions.assignment2.Store;
import emf.salestransactions.assignment2.UoM;


public class EMFTest {
	public static void main(String[] args) 
	{
		Company company = createCompanyModel();
		serialize(company);
//		boolean isValid = validate(company);
//		if(isValid)
//			serialize(company);
//		else System.out.println("Error occured while validating the metamodel!");
	}
	public static Company createCompanyModel() 
	{
		Company company = Assignment2Factory.eINSTANCE.createCompany();
		company.setName("Carefour");
		company.setCodice("CAOUR12094REF");
		
		Address address = Assignment2Factory.eINSTANCE.createAddress();
		address.setStreet("Via Albert Sabin");
		address.setCity("L'Aquila");
		address.setCountry("Italy");
		address.setTelephone("+39 351 879 8225");
		
		company.setAddress(address);
		
		Store stock = Assignment2Factory.eINSTANCE.createStore();
		stock.setName("Main Store");	
		
		Item item = Assignment2Factory.eINSTANCE.createItem();
		item.setAvailableNumber(100);
		item.setCode("Itm-0001-22");
		item.setDescription("Soap");
		item.setIsActive(true);
		item.setName("Dove");
		item.setUom(UoM.PCS);
		item.setStore(stock);
		
		Price sellingPrice = Assignment2Factory.eINSTANCE.createPrice();
		sellingPrice.setSellingPrice(2.2);
		
		item.setUnitPrice(sellingPrice);
		
		stock.getItem().add(item);
		company.getStore().add(stock);
		
		stock.setName("Reserve Stock");
		company.getStore().add(stock);
	
		return company;
	}
	
	public static void serialize(Company company) 
	{
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = registry.getExtensionToFactoryMap();
		map.put("xmi", new XMIResourceFactoryImpl());
		
		ResourceSet set = new ResourceSetImpl();
		Resource resource = set.createResource(URI.createURI("Carefour.xmi"));
		resource.getContents().add(company);
		
		try 
		{
			resource.save(Collections.EMPTY_MAP);
		}
		catch(IOException exception) 
		{
			exception.printStackTrace();
		}
	}
	
	public static boolean validate(Company company) 
	{
		org.eclipse.emf.common.util.Diagnostic diagnostic = Diagnostician.INSTANCE.validate(company);
		if(diagnostic.getSeverity() == org.eclipse.emf.common.util.Diagnostic.ERROR) {
			return false;
		}
		else return true;
	}
}
