package core;

/**
 * List of correct values for order status
 */
public enum OrderStatus {
  inProgress,/**
   * First status for the Order
   */

  toAnalyze,/**
   * Order ready for analysis
   */

  inAnalysis,/**
   * Analysis in progress
   */

  completed,/**
   * Analysis completed
   */
;
}
