package core;

public class Specie {
  /**
   * Name of the specie
   */
  private String name;

  public Specie(String n) {
	name = n;
  }

  public final String getName() {
    return name;
  }

  @Override
  public String toString(){
      return name;
  }

}
