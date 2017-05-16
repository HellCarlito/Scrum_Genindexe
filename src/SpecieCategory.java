
import java.util.*;

class SpecieCategory {
  /**
   * Set of species that belong to this category
   */
  private Set<Specie> species;

  /**
   * Description of a group for the species. For example, "birds"
   */
  private String name;

  /**
   * Creates a new SpecieCategory
   */
  public SpecieCategory(String theName) {
	name = theName;
	species = new HashSet<Specie>();
  }

  public final String getName() {
    return name;
  }

  public final Set<Specie> getSpecies() {
    return species;
  }

  /**
   * Add a specie in the category
   */
  public void addSpecie(Specie specie) {
	species.add(specie);
  }

}
