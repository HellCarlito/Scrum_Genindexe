package core;
import core.WordUtils;

import java.util.*;

public class SpecieCategory {

  private Set<Specie> species; //Set of species that belong to this category
  private String name; //Description of a group for the species. For example, "birds"
  private WordUtils word;

  /**
   * Creates a new core.SpecieCategory
   */
  public SpecieCategory(String theName) {
	name = word.capitalize(theName);
	species = new HashSet<Specie>();
  }

  public final String getName() {
    return name;
  }

  public final Set<Specie> getSpecies() {
    return species;
  }
  
  public boolean alreadyCategory(Specie specie) 
  {
	  boolean trouve = false;
	  for (Specie aSpecie : getSpecies())
	  {
			if (specie.getName().equals(aSpecie.getName()))
			{
				trouve=true;
			}
	  }
	  return trouve;
  }

  /**
   * Add a specie in the category
   */
  public boolean addSpecie(Specie specie) {
	boolean done = false;
	if (!alreadyCategory(specie))
	{
		species.add(specie);
		done = true;
	}
	return done;
  }

}
