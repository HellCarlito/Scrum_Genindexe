package core;

import java.sql.Timestamp;
import java.util.List;

/**
 * Describes the orders for the customers
 */
public class Order {
    /**
     * remember exactly when the order has been created
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
    /**
     * List of samples to analyse
     */
    private List<Sample> samples;

    public Order() {

    }

    /**
     * Constructor for the core.Order
     */
    public Order(Customer customer, List<Sample> s) {
        this.customer = customer;
        this.samples = s;
        status = OrderStatus.inProgress;
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

    public void setCustomer(Customer c) {
        this.customer = c;
    }

    public List<Sample> getSamples() {
        return samples;
    }

    public void setSamples(List<Sample> s) {
        samples = s;
        status = OrderStatus.toAnalyze;
    }

    /**
     * initiate the timeStamp of the sample
     */
    public void setTimestamp(){
        if(null != timestamp)
            timestamp = new Timestamp(System.currentTimeMillis());
    }

}
