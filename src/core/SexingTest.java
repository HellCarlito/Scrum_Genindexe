package core;

public class SexingTest extends Analysis {
  /**
   * Name of the test - the same for all objects of the class
   */
  private static String name = "Sexing test";

  /**
   * Represents the correct value for males on the specific position
   */
  private RawData maleValue;

  /**
   * Represents the correct value for females on the specific position
   */
  private RawData femaleValue;

  public SexingTest(Specie s, int pMale, int vMale, int pFemale, int vFemale) {
	super(s);
	maleValue = new RawData(pMale, vMale);
	femaleValue = new RawData(pFemale, vFemale);
  }

    public SexingTest(Specie s) {
        super(s);
    }

    public Result newResult() {
	return new SexingResult();
  }

  /**
   * Name of the analysis
   * 
   * @return the name of the analysis
   */
  public String getName() {
	return name;
  }

  public final RawData getMaleValue() {
    return maleValue;
  }

  public final RawData getFemaleValue() {
    return femaleValue;
  }

}
