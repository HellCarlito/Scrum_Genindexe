package core;

import java.util.ArrayList;

public class CustomerBase {
    private ArrayList<Customer> base;

    /**
     * Constructor for CustomerBase class
     */
    public CustomerBase() {
        base = new ArrayList<>();
    }

    /**
     * Method to return the customers
     *
     * @return customers
     */
    public ArrayList<Customer> getCustomers() {
        return base;
    }


    /**
     * Check if the company has already this customer
     * True if the customer is already in the database
     * False if the customer is not in the database
     */
    public boolean alreadyCustomer(Customer aCustomer) {
        boolean trouve = false;
        for (Customer customer : getCustomers()) {
            if (aCustomer.getName().equals(customer.getName()) && aCustomer.getTown().equals(customer.getTown())) {
                trouve = true;
            }
        }
        return trouve;
    }

    /**
     * Add a customer if he is not already a client.
     *
     * @param aCustomer
     * @return True if the customer is added
     * False if the customer is not added (already in the database)
     */
    public boolean addCustomer(Customer aCustomer) {
        boolean ajout = false;
        if (!alreadyCustomer(aCustomer)) {
            this.base.add(aCustomer);
            ajout = true;
        } else {
            ajout = false;
        }
        return ajout;
    }

    /**
     * Method to sign in the system
     * Check if the login and the password correspond to a customer
     */
    public Customer signIn(String log, String pass)
    {
        Customer logCustomer = new Customer("", "");
        boolean trouve = false;
        for (Customer aCustomer : getCustomers())
        {
            if (aCustomer.getLogin() != null && aCustomer.getPassword() != null)
            {
                if (aCustomer.getLogin().equals(log) && (aCustomer.getPassword().equals(pass)))
                {
                    logCustomer = aCustomer;
                    trouve = true;
                }
            }
        }
        if (trouve == true)
        {
            return logCustomer;
        }
        else
        {
            return null;
        }
    }
}
