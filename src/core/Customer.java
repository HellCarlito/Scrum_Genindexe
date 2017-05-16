package core;
import core.WordUtils;
import java.util.*;

public class Customer
{
  /**
   * The different orders for the customer
   */
  private List<Order> orders;
  private WordUtils word;
  
  private boolean professional; //Status of the customer
  private String name; //Name of the customer
  private String town;//Address (only the town) from the customer
  private String corporate; //The corporate name of the company
  private int phoneNumber; //The phone number of the customer
  private int fax; //The fax of the customer
  private int cellNumber; //The cell phone number of the customer
  private String address; //The invoicing address of the company
  private String invoicingName; //The invoicing contact of the company
  private String login; //The login of the costumer for the Internet services
  private String password; //The password of the costumer for the Internet services
  private String email; //The email of the costumer for the Internet services

  public final String getName() {
    return name;
  }

  public final String getTown() {
    return town;
  }
  
  public final String getCorporateName() {
    return corporate;
  }

  public int getPhoneNumber() {
    return phoneNumber;
  }
  
  public int getFax() {
	return fax;
  }

  public int getCellNumber() {
	return cellNumber;
  }
  
  public String getAddress() {
    return address;
  }

  public String getInvoicingName() {
	return invoicingName;
  }
 
  public final String getLogin() {
	return login;
  }

  public String getPassword() {
    return password;
  }
  
  public String getEmail() {
	return email;
  }
  
  public void setPhoneNumber(int p){
	  phoneNumber =p;
  }
  
  public void setFax(int f){
	  fax =f;
  }
  
  public void setCellNumber(int c){
	  cellNumber =c;
  }
  
  public void setAddress(String a){
	  address =a;
  }
  
  public void setInvoicingName(String in){
	  invoicingName =in;
  }
  
  public void setPassword(String p){
	  password =p;
  }
  
  public void setEmail(String e){
	  email =e;
  }

  /**
   * Constructor for the customer
   * 
   * @param n name of the customer
   * @param t town for the customer
   */
  public Customer(boolean pro,String n, String t, String c, int p, int f, int cell, String ad, String fac,
		  String log, String pass, String mail)
  {
	  professional = pro;
	  name = word.capitalize(n);
	  town = word.capitalize(t);
	  corporate = word.capitalize(c);
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
  
  public Customer(String n, String t)
  {
	  name = word.capitalize(n);
	  town = word.capitalize(t);
	  orders = new ArrayList<Order>();
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
