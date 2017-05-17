package junit;

import core.Customer;
import core.Order;
import core.Sample;
import core.SexingTest;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * This class is the jUnit test for Order
 *
 * @author astem
 */
public class testOrder {
    private Order ord1;
    private Customer cst1;
    private Sample s1, s2, s3, s4, s5;
    private SexingTest an1;

    @Test
    public void testSamplesNomber() {
        an1 = new SexingTest(null, 0, 0, 0, 0);
        s1 = new Sample(an1, null, ord1);
        s2 = new Sample(an1, null, ord1);
        s3 = new Sample(an1, null, ord1);
        s4 = new Sample(an1, null, ord1);
        s5 = new Sample(an1, null, ord1);
        List<Sample> samples = Arrays.asList(s1, s2, s3, s4, s5);
        cst1 = new Customer("WillyCorp", "Zimbabwe");
        ord1 = new Order(cst1, samples);
        cst1.addOrder(ord1);
        // Verify that the 5 samples were added to the order
        assertEquals(5, ord1.getSamples().size());
        // Verify that when there is no samples a message pf error should show up
        List<Sample> samples2 = Arrays.asList();
        ord1 = new Order(cst1, samples2);
        assertEquals(0, ord1.getSamples().size());
        // Verify that that negative numbers aren't allowed
        assertEquals(-2, ord1.getSamples().size());

    }


}
