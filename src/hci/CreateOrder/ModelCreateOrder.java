package hci.CreateOrder;

import core.Customer;
import core.CustomerBase;

import java.util.ArrayList;

public class ModelCreateOrder {

    private CustomerBase customerBase;

    public ModelCreateOrder() {

    }

    public ArrayList<Customer> getArrayListCustomer(){
        return customerBase.getCustomers();
    }
}
