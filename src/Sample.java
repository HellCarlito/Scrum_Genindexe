
import java.util.*;

/**
 * Describes a sample to be analysed
 * Here, very partial implementation. We can only add a result, and recover the last result
 */
class Sample {
  /**
   * The animal specie for the sample
   */
  private Specie specie;

  /**
   * This analysis to be made on the sample
   */
  private Analysis analysis;

  /**
   * The order that corresponds to the sample
   */
  private Order order;

  /**
   * The results of analyses
   */
  private List<Result> results;

  /**
   * Factory for unique ids
   */
  private static UniqueIdSample idFactory;

  /**
   * Id number for the sample.
   * The id must be unique.
   * It is assigned during sample creation
   */
  private int idSample;

  public Sample(Analysis theAnalysis, Specie theSpecie, Order theOrder) {
	if (idFactory==null) idFactory = new UniqueIdSample();
	
	idSample = idFactory.newNumber();
	analysis = theAnalysis;
	specie = theSpecie;
	order = theOrder;
	results = new ArrayList<Result>();
  }

  public final int getIdSample() {
    return idSample;
  }

  public void addResult(Result theResult) {
	results.add(theResult);	
  }

  /**
   * Returns the last result of the sample, as the toString function of the result
   * Returns the null String if no result available
   */
  public String getResult() {
    // Bouml preserved body begin 00025982
       if (results.isEmpty()) return "";
       else return results.get(results.size()-1).toString();
    // Bouml preserved body end 00025982
  }

  public final List<Result> getResults() {
    return results;
  }

  public final Analysis getAnalysis() {
    return analysis;
  }

  public final Order getOrder() {
    return order;
  }

  /**
   * States if the sample has been completely analysed :
   * 	- the result is known and validated
   * 	- or, after three attempts, it is not readable
   */
  public boolean isCompleted() {
    if (results.isEmpty()) return false;
    Result currentResult = results.get(results.size()-1);
    ResultStatus status = currentResult.getStatus();
    if (status==ResultStatus.VALIDATED) return true;
    if (status==ResultStatus.UNREADABLE && results.size()>=3) return true;
    return false;
  }

}
