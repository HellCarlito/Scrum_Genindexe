package core;

class SexingResult extends Result {
  /**
   * Experimental value for male position
   */
  private RawData maleValue;

  /**
   * Experimental value for female position
   */
  private RawData femaleValue;

  public final RawData getMaleValue() {
    return maleValue;
  }

  public final RawData getFemaleValue() {
    return femaleValue;
  }

  public void setMaleValue(RawData value) {
    maleValue = value;
  }

  public void setFemaleValue(RawData value) {
    femaleValue = value;
  }

}
