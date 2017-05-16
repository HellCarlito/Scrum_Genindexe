package core;

import java.util.*;

public class Specie {
  /**
   * Name of the specie
   */
  private String name;
  private ArrayList<Specie> base;

  public Specie(String n) {
	name = n;
  }

  public final String getName() {
    return name;
  }
  
  /**
   * This method return the arraylist of species after adding the curent specie
   * @return arraylist
   */
  public ArrayList<Specie> baseSpecies(){
	   base = new ArrayList<Specie>();
	   base.add(this);
	return base;
  }
  
}
