package junit;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import core.Sample;
import core.Order;
import core.Customer;
import core.SexingTest;

/**
 * This class is the jUnit test for Order
 * @author astem
 *
 */
public class testOrder {
	private Order ord1;
	private Customer cst1;
	private List<Sample> samples;
	private Sample s1,s2,s3,s4,s5;
	private SexingTest an1;
	@Test
	public void testSamplesNomber() {
		cst1 = new Customer("WillyCorp", "Zimbabwe");
		ord1 = new Order(cst1);
		an1 = new SexingTest(null, 0, 0, 0, 0);
		s1 = new Sample(an1, null, ord1);
		s2 = new Sample(an1, null, ord1);
		s3 = new Sample(an1, null, ord1);
		s4 = new Sample(an1, null, ord1);
		s5 = new Sample(an1, null, ord1);
		//cst1.add(samples);
		samples.add(s1);
		samples.add(s2);
		samples.add(s3);
		samples.add(s4);
		samples.add(s5);
		ord1.setSamples(samples);
		cst1.addOrder(ord1);
		assertEquals(ord1.getSamples().size(),5);
	}

}
