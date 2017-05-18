package core;

import java.util.ArrayList;

/**
 * Write a description of class core.IntegrationTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IntegrationTest {

    public ArrayList<SpecieCategory> theCategories;
    
    //theSpecies stores the available species
    public ArrayList<Specie> theSpecies;
    
    public ArrayList<Analysis> theAnalyses;
    
    // theCustomers gives access to all samples and results
    public ArrayList<Customer> theCustomers;
    
    private ArrayList<SpecieCategory> base;

    /**
     * Constructor for objects of class core.IntegrationTest
     * For this test, are created:
     * - the Mammals core.SpecieCategory, the Sheep specie and the ScrapietTest for sheeps
     * - the Bird core.SpecieCategory, the Parrot, Canary and Budgerigar species and
     * the sexing tests for birds
     * - the customer "Mrs Rosemary Plumket", in Poitiers, with an order of two canaries (not yet)
     * - the customer "La Palmyre Zoo" in Royan, with orders for sexing parrots and budgerigars (not yet)
     * - the customer "M. Paul Cameron", in Parthenay, with an order of 11 sheep scrapie tests
     * - the customer "M. Tom Brown", in Montmorillon, with orders of 24, 12, 8 and 36 sheep
     * scrapie tests
     * Samples are in different status
     */
    public IntegrationTest() {
        // Init all lists;
        theCategories = new ArrayList<SpecieCategory>();
        theAnalyses = new ArrayList<Analysis>();
        theCustomers = new ArrayList<Customer>();
        theSpecies = new ArrayList<Specie>();

        Customer rose = new Customer("Mrs Rosemary Plumket", "Poitiers");
        theCustomers.add(rose);
        // core.Customer "La Palmyre Zoo" in Royan
        Customer zoo = new Customer("La Palmyre Zoo", "Royan");
        theCustomers.add(zoo);
        // core.Customer "M. Tom Brown", in Montmorillon
        Customer tom = new Customer("M. Tom Brown", "Montmorillon");
        theCustomers.add(tom);
        // core.Customer "M. Paul Cameron", in Parthenay
        Customer paul = new Customer("M. Paul Cameron", "Parthenay");
        theCustomers.add(paul);

        // core.ScrapieTest management
        SpecieCategory sc = new SpecieCategory("Mammals");
        theCategories.add(sc);
        Specie s = new Specie("Sheep");
        sc.addSpecie(s);
        ScrapieTest sct = new ScrapieTest(s, 354, 224);
        theAnalyses.add(sct);
        // core.Order for Tom Brown - 24 sheeps, status toAnalyse
        Order o = new Order(tom, new ArrayList<>());
        tom.addOrder(o);
        ArrayList<Sample> ls = new ArrayList<Sample>();
        Sample sam;
        for (int i = 0; i < 24; i++) ls.add(new Sample(sct, s, o));
        o.setSamples(ls);

        // core.RawData results
        RawData scrapieOk = new RawData(354, 224);
        RawData scrapieDoubt = new RawData(354, 221);
        RawData scrapieNotOk = new RawData(354, 155);
        RawData scrapieNotReadable = new RawData(354, 0);

        // Several scrapie results :
        ScrapieResult scrFirstReadOkSensible = new ScrapieResult();
        scrFirstReadOkSensible.setScrapieValue(scrapieOk);
        scrFirstReadOkSensible.firstRead(true, "Sensible");
        ScrapieResult scrFirstReadOkNotSensible = new ScrapieResult();
        scrFirstReadOkNotSensible.setScrapieValue(scrapieNotOk);
        scrFirstReadOkNotSensible.firstRead(true, "Not Sensible");
        ScrapieResult scrFirstReadDoubtful = new ScrapieResult();
        scrFirstReadDoubtful.setScrapieValue(scrapieDoubt);
        scrFirstReadDoubtful.firstRead(false, "Doubtful");
        ScrapieResult scrValidatedNotSensible = new ScrapieResult();
        scrValidatedNotSensible.setScrapieValue(scrapieNotOk);
        scrValidatedNotSensible.firstRead(true, "Not Sensible");
        scrValidatedNotSensible.validate(true);

        // core.Order for Tom Brown - 36 sheeps, all firstRead, not sensible - order status = completed
        o = new Order(tom, new ArrayList<>());
        tom.addOrder(o);
        ls = new ArrayList<Sample>();
        for (int i = 0; i < 36; i++) {
            sam = new Sample(sct, s, o);
            sam.addResult(scrValidatedNotSensible);
            ls.add(sam);
        }
        o.setSamples(ls);

        // core.Order for Tom Brown - 12 sheeps, ready to analyse - order status = toAnalyse
        o = new Order(tom, new ArrayList<>());
        tom.addOrder(o);
        ls = new ArrayList<Sample>();
        for (int i = 0; i < 12; i++) {
            sam = new Sample(sct, s, o);
            sam.addResult(new ScrapieResult());
            ls.add(sam);
        }
        o.setSamples(ls);

        // core.Order for Tom Brown - 8 sheeps, different status - order status = inAnalysis
        o = new Order(tom, new ArrayList<>());
        tom.addOrder(o);
        ls = new ArrayList<Sample>();
        for (int i = 0; i < 4; i++) {
            sam = new Sample(sct, s, o);
            sam.addResult(new ScrapieResult());
            ls.add(sam);
        }
        sam = new Sample(sct, s, o);
        sam.addResult(scrFirstReadOkSensible);
        ls.add(sam);
        sam = new Sample(sct, s, o);
        sam.addResult(scrFirstReadDoubtful);
        ls.add(sam);
        sam = new Sample(sct, s, o);
        sam.addResult(scrValidatedNotSensible);
        ls.add(sam);
        sam = new Sample(sct, s, o);
        sam.addResult(scrFirstReadOkNotSensible);
        ls.add(sam);
        o.setSamples(ls);

        // core.Order for Paul Cameron, status in progress (samples are not created yet)
        o = new Order(paul, new ArrayList<>());
        paul.addOrder(o);

        // Sexing tests management - no order created yet
        sc = new SpecieCategory("Birds");
        theCategories.add(sc);
        s = new Specie("Parrot");
        sc.addSpecie(s);
        SexingTest sxt = new SexingTest(s, 155, 46, 264, 32);
        theAnalyses.add(sxt);
        Specie budge = new Specie("Budgerigar");
        sc.addSpecie(budge);
        sxt = new SexingTest(budge, 175, 35, 333, 18);
        theAnalyses.add(sxt);
        s = new Specie("Canary");
        sc.addSpecie(s);
        sxt = new SexingTest(s, 133, 35, 135, 67);
        theAnalyses.add(sxt);
    }

    /**
     * Method to return the customers
     *
     * @return customers
     */
    public ArrayList<SpecieCategory> getCategory() {
        return base;
    }

    public boolean addCategory(SpecieCategory aCategory) {
        boolean ajout = false;
        aCategory.getName();
        if (!alreadyCategory(aCategory)) {
            this.theCategories.add(aCategory);
            ajout = true;
        } else {
            ajout = false;
        }
        return ajout;
    }


    public boolean alreadyCategory(SpecieCategory aCategory) {
        String name1, name2;
        for (SpecieCategory category : theCategories) {
            if (aCategory.getName().equals(category.getName()
            )) {
                return true;
            }
        }
        return false;
    }



    /**
     * Check if the company has already this customer
     * True if the customer is already in the database
     * False if the customer is not in the database
     */
    public boolean alreadyCustomer(Customer aCustomer) {
        boolean trouve = false;
        for (Customer customer : theCustomers) {
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
            theCustomers.add(aCustomer);
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
        for (Customer aCustomer : theCustomers)
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
