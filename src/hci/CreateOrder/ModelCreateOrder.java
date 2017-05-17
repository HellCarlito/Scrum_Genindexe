package hci.CreateOrder;

import core.Customer;
import core.CustomerBase;
import core.IntegrationTest;
import core.Order;

import java.util.ArrayList;

public class ModelCreateOrder {

    private ArrayList<Customer> customers;
    private Order order;
    private IntegrationTest integrationTest;

    public ModelCreateOrder(IntegrationTest integrationT) {
        order = new Order();
        integrationTest = integrationT;
        customers = integrationT.theCustomers;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public Order getOrder() {
        return order;
    }

    public IntegrationTest getIntegrationTest() {
        return integrationTest;
    }
}
