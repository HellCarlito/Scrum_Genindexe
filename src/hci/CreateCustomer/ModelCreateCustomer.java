package hci.CreateCustomer;
import java.util.ArrayList;
import core.Customer;
import core.CustomerBase;

public class ModelCreateCustomer
{
	private CustomerBase customerBase;

    public ModelCreateCustomer()
    {
    }

    public ArrayList<Customer> getArrayListCustomer(){
        return customerBase.getCustomers();
    }
}
