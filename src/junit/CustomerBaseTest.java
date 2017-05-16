package junit;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import core.Customer;
import core.CustomerBase;

public class CustomerBaseTest
{
	private Customer aCustomer, aNewCustomer, anotherCustomer;
	private CustomerBase aBase;

	@Before
	public void setUp() throws Exception
	{
		aCustomer = new Customer ("Parrots Academy","London");
		aBase = new CustomerBase();
		aBase.addCustomer(aCustomer);
	}

	@After
	public void tearDown() throws Exception
	{
	}
	
	/**
	 * Method testAlreadyCustomer
	 * <p>test the constructor with the setUp value</p>
	 */
	@Test
	public void testAlreadyCustomer()
	{
		aNewCustomer = new Customer ("Parrots Academy", "London");
		anotherCustomer = new Customer ("Universite", "Poitiers");
		assertEquals(aBase.alreadyCustomer(aCustomer),true);
		assertEquals(aBase.alreadyCustomer(aNewCustomer),true);
		assertEquals(aBase.alreadyCustomer(anotherCustomer),false);
	}
	
	/**
	 * Method testAddCustomer
	 * <p>test the constructor with the setUp value</p>
	 */
	@Test
	public void testAddCustomer()
	{
		aNewCustomer = new Customer ("Parrots Academy", "London");
		anotherCustomer = new Customer ("Universite", "Poitiers");
		assertEquals(aBase.addCustomer(aNewCustomer),false);
		assertEquals(aBase.addCustomer(anotherCustomer),true);
	}

}
