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

  /**
   * Name of the customer
   */
  private String name;

  /**
   * Address (only the town) from the customer
   */
  private String town;

  public final String getName() {
    return name;
  }

  public final String getTown() {
    return town;
  }

  /**
   * Constructor for the customer
   * 
   * @param n name of the customer
   * @param t town for the customer
   */
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
