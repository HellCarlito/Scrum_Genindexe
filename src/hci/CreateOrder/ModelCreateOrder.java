package hci.CreateOrder;

import core.Customer;
import core.CustomerBase;
import core.Order;

import java.util.ArrayList;

public class ModelCreateOrder {

    private CustomerBase customerBase;
    private Order order;

    public ModelCreateOrder(CustomerBase customerBase) {
        order = new Order();
        customerBase = customerBase;
    }

    public ArrayList<Customer> getArrayListCustomer(){
        if(null != customerBase)
            return customerBase.getCustomers();
        else
            return new ArrayList<Customer>(){{add(new Customer("Pat","Poitiers"));}};
    }

    public Order getOrder() {
        return order;
    }
}
