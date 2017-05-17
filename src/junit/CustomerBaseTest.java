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
	 * <p>test the method with the setUp value</p>
	 */
	@Test
	public void testAlreadyCustomer()
	{
		aNewCustomer = new Customer ("Parrots Academy", "London");
		anotherCustomer = new Customer ("Universite", "Poitiers");
		assertEquals(true,aBase.alreadyCustomer(aCustomer));
		assertEquals(true,aBase.alreadyCustomer(aNewCustomer));
		assertEquals(false,aBase.alreadyCustomer(anotherCustomer));
	}
	
	/**
	 * Method testAddCustomer
	 * <p>test the constructor with the setUp value</p>
	 */
	@Test
	public void testAddCustomer()
	{
		aNewCustomer = new Customer ("Parrots Academy", "London");
		anotherCustomer = new Customer ("Parrots Academy", "Newcastle");
		assertEquals(aBase.addCustomer(aNewCustomer),false);
		assertEquals(aBase.addCustomer(anotherCustomer),true);
	}
	
	
	/**
	 * Method testSignIn
	 * <p>test the method with the setUp value</p>
	 */
	@Test
	public void testSignIn()
	{
		aNewCustomer = new Customer (true, "Parrots Academy", "Newcastle", "yo",
				"1", "2", "3", "na", "ka", "toto", "titi", "hko");
		aBase.addCustomer(aNewCustomer);
		assertEquals(aBase.signIn("toto", "titi"), aNewCustomer);
		assertEquals(aBase.signIn("kjlk",  "kjhklj"), null);
	}
}
