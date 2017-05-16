package core;

class RawData {
  /**
   * Peak position
   */
  private int position;

  /**
   * Peak value
   */
  private int value;

  public RawData(int pos, int val) {
	position = pos;
	value = val;
  }

  public final int getPosition() {
    return position;
  }

  public final int getValue() {
    return value;
  }

  
}
