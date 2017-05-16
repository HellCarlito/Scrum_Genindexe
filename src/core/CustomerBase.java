package core;
import java.util.ArrayList;
import core.Customer;

public class CustomerBase
{
	private ArrayList<Customer> base;
	
	/**
	 * Constructor for CustomerBase class
	 */
	public CustomerBase()
	{
		base = new ArrayList<>();
	}
	
	/**
	 * Method to return the customers
	 * @return customers
	 */
	public ArrayList<Customer> getCustomers()
	{
		return base;
	}
	
	
	/**
	 * Check if the company has already this customer
	 */
	public boolean alreadyCustomer(Customer aCustomer)
	{
		
	}
	/**
	 * Add a customer if he is not already a client.
	 * @param aCustomer
	 * @return
	 */
	public boolean addCustomer(Customer aCustomer)
	{
		
	}
}
