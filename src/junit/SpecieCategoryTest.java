package junit;

import static org.junit.Assert.*;

import org.junit.Before;

import core.Customer;
import core.SpecieCategory;
import core.Specie;

import org.junit.Test;

public class SpecieCategoryTest {
	
	private Specie specie;
	private Specie aNewCategory, anotherCategory;
	private SpecieCategory category;

	/**
	 * Initialize the category with the name "Bird"
	 */
	@Before
	public void setUp() throws Exception 
	{
		specie= new Specie ("Bird");
		category.addSpecie(specie);
	}
	
	/**
	 * Method testSpecieCategory
	 * <p>test the constructor with the setUp value</p>
	 */
	@Test
	public void testSpecieCategory()
	{
		assertEquals(specie.getName(), "Bird");
	}
	
	/**
	 * Method testAlreadyCategory
	 * <p>test the constructor with the setUp value</p>
	 */
	@Test
	public void testAlreadyCategory()
	{
		aNewCategory = new Specie("Bird");
		anotherCategory = new Specie ("Horse");
		assertEquals(true,category.alreadyCategory(aNewCategory));
		assertEquals(false,category.alreadyCategory(anotherCategory));
		assertEquals(true,category.alreadyCategory(specie));
	}
	
	/**
	 * Method testAddSpecie
	 * <p>test the constructor with the setUp value</p>
	 */
	@Test
	public void testAddSpecie()
	{
		aNewCategory = new Specie ("Bird");
		anotherCategory = new Specie ("Horse");
		assertEquals(category.addSpecie(aNewCategory),false);
		assertEquals(category.addSpecie(anotherCategory),true);
	}

}
