package junit;

import core.Customer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    private Customer c1, c2;

    /**
     * Initialize the customer with the name "Parrots Academy" and the town London
     */
    @Before
    public void setUp() throws Exception {
        c1 = new Customer("Parrots Academy", "London");
    }

    /**
     * Tears down the test fixture.
     * Called after every test case method. Nothing to do in this case.
     */
    @After
    public void tearDown() throws Exception {
    }

    /**
     * Method testCustomer
     * <p>test the constructor with the setUp value</p>
     */
    @Test
    public void testCustomer() {
        assertEquals(c1.getName(), "Parrots Academy");
        assertEquals(c1.getTown(), "London");
    }

    /**
     * Method testCustomer
     * <p>test the constructor with the setUp value</p>
     */
    @Test
    public void testGetMandatory() {
        assertEquals(c2.getMandatory("hi", "hjkl", "vyuh", "gzu", "jk"), true);
        assertEquals(c2.getMandatory("hi", "hjkl", "", "", "jk"), false);
    }
}
