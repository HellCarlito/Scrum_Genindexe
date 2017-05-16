
/**
 * Creates a new result for a Scrapie Test
 */
public class ScrapieTest extends Analysis {
  private static String name = "Scrapie test";

  /**
   * Position and value for scrapie sensibility
   */
  private RawData scrapieSensibility;

  public Result newResult() {
	return new ScrapieResult();
  }

  /**
   * Name of the analysis
   * 
   * @return the name of the analysis
   */
  public String getName() {
	return name;
  }

  public  ScrapieTest(Specie s, int pos, int val) {
	super(s);
	scrapieSensibility = new RawData(pos, val);
  }

  public final RawData getScrapieSensibility() {
    return scrapieSensibility;
  }

}
