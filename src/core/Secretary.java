package core;

import core.Order;

import java.util.ArrayList;
import java.util.List;

import core.Customer;
/**
 * This is the class that represents the Secretary. IS composed of :
 * - name
 * - surname
 * - 
 * @author astem
 *
 */
public class Secretary {
	private String name, surname;
	private Integer ID;
	private Order order;
	private Customer customer;
	private CustomerBase base;
	private ArrayList<Customer> bdd;
	/**
	 * This is the constructor of the Secretary
	 * @param id
	 * @param nom
	 * @param prenom
	 */
	public Secretary(Integer id, String nom, String prenom) {
		this.ID = id;
		this.name= nom;
		this.surname = prenom;
	}
	/**
	 * This method allows to create an order
	 * @param customer : the customer selected
	 * @param samples : the samples
	 */
	public void createOrder(Customer customer, List<Sample> samples){
		order = new Order(customer, samples);
		customer.addOrder(order);
	}
	
}
