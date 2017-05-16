
/**
 * Delivers a unique ID number for the samples.
 */
class UniqueIdSample {
  private int number = 0;

  public int newNumber() {
	return ++number;
  }

}
