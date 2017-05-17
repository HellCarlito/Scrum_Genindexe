package core;

import java.sql.Timestamp;
import java.util.*;

/**
 * Describes the orders for the customers
 */
public class Order {

    /**
     * Save the time when the order is created
     */
    private Timestamp timestamp;

  /**
   * link to the customer
   */
  private Customer customer;

  /**
   * Status of the order
   */
  private OrderStatus status = OrderStatus.inProgress;

  public Order(){

  }

  /**
   * Constructor for the core.Order
   */
  public Order(Customer customer,List<Sample> s) {
	this.customer = customer;
	this.samples = s;
	status = OrderStatus.inProgress;
	setTimestamp();
  }

  /**
   * List of samples to analyse
   */
  private List<Sample> samples;

  public void setCustomer(Customer c){
      this.customer = c;
  }

  public final OrderStatus getStatus() {
    return status;
  }

  public void setStatus(OrderStatus value) {
    status = value;
  }

  public final Customer getCustomer() {
    return customer;
  }

  public List<Sample> getSamples() {
	return samples;
  }

  public void setSamples(List<Sample> s) {
	samples = s;
	status = OrderStatus.toAnalyze;
  }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp() {
      if(null == timestamp)
        timestamp = new Timestamp(System.currentTimeMillis());
    }
}
