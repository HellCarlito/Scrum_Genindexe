package core;

public class ScrapieResult extends Result {
  /**
   * Experimental value for the scrapie position
   */
  private RawData scrapieValue;

  public final RawData getScrapieValue() {
    return scrapieValue;
  }

  public void setScrapieValue(RawData value) {
    scrapieValue = value;
  }

}
