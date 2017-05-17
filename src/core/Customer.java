package core;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    /**
     * The different orders for the customer
     */
    private List<Order> orders;
    private WordUtils word;

    private boolean professional; //Status of the customer
    private String name; //Name of the customer
    private String town;//Address (only the town) from the customer
    private String corporate; //The corporate name of the company
    private String phoneNumber; //The phone number of the customer
    private String fax; //The fax of the customer
    private String cellNumber; //The cell phone number of the customer
    private String address; //The invoicing address of the company
    private String invoicingName; //The invoicing contact of the company
    private String login; //The login of the costumer for the Internet services
    private String password; //The password of the costumer for the Internet services
    private String email; //The email of the costumer for the Internet services


    /**
     * Constructor for the customer
     *
     * @param n name of the customer
     * @param t town for the customer
     */
    public Customer(boolean pro, String n, String t, String c, String p, String f, String cell, String ad, String fac,
                    String log, String pass, String mail)

    {
        professional = pro;
        name = word.capitalize(n);
        town = word.capitalize(t);
        corporate = c;
        phoneNumber = p;
        fax = f;
        cellNumber = cell;
        address = ad;
        invoicingName = fac;
        login = log;
        password = pass;
        email = mail;
        orders = new ArrayList<Order>();
    }

    public Customer(String n, String t) {
        name = word.capitalize(n);
        town = word.capitalize(t);
        orders = new ArrayList<Order>();
    }

    public static boolean getMandatory(String name, String town, String phone, String fax, String cell, String login, String password) {
        boolean filled = false;
        if ((!name.isEmpty()) && (!town.isEmpty()) && (!phone.isEmpty()) && (!fax.isEmpty()) && (!cell.isEmpty()) && (!login.isEmpty()) && (!password.isEmpty())) {
            filled = true;
        } else {
            filled = false;
        }
        return filled;
    }

    public final boolean getProfessional() {
        return professional;
    }

    public final String getName() {
        return name;
    }

    public final String getTown() {
        return town;
    }

    public final String getCorporateName() {
        return corporate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String p) {
        phoneNumber = p;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String f) {
        fax = f;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String c) {
        cellNumber = c;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String a) {
        address = a;
    }

    public String getInvoicingName() {
        return invoicingName;
    }

    public void setInvoicingName(String in) {
        invoicingName = in;
    }

    public final String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String p) {
        password = p;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String e) {
        email = e;
    }

    /**
     * Adds an order for this customer
     *
     * @param theOrder the order to be added
     */
    public void addOrder(Order theOrder) {
        orders.add(theOrder);
    }

    public final List<Order> getOrders() {
        return orders;
    }
}
