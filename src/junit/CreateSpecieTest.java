package junit;

import core.Specie;
import core.SpecieCategory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by carlito on 17/05/17.
 */
public class CreateSpecieTest {

    private Specie specie, newSpecie, anotherSpecie;
    private SpecieCategory specieCat;

    @Before
    /**
     * Create a specie and add it to a category
     * in order to have Parrot, Bird
     */
    public void setUp() throws Exception {
        specie = new Specie("Parrot");
        specieCat = new SpecieCategory("Bird");
        specieCat.addSpecie(specie);
    }

    @After
    public void tearDown() throws Exception {

    }

    /**
     * Method testAddSpecie
     */
    @Test
    public void testAddSpecie() {
        newSpecie = new Specie("Parrot");
        anotherSpecie = new Specie("parrot");
        assertEquals(specieCat.addSpecie(newSpecie), false);
        // Doit retourner faux mais retourne vrai car pas de différence entre Parrot et parrot
        assertEquals(specieCat.addSpecie(anotherSpecie), false);
    }

    /**
     * Method testAlreadyCategory
     */
    @Test
    public void testAlreadyCategory() {
        newSpecie = new Specie("Parrot");
        anotherSpecie = new Specie("parrot");
        assertEquals(true, specieCat.alreadyCategory(specie));
        assertEquals(true, specieCat.alreadyCategory(newSpecie));
        // Doit retourner vrai mais false car pas de différence entre Parrot et parrot
        assertEquals(true, specieCat.alreadyCategory(anotherSpecie));
    }


}
