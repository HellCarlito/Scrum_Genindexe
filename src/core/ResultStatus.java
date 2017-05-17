package core;

public enum ResultStatus {
  UNREADABLE,/**
   * The result cannot be read
   */

  READABLE,/**
   * The result is readable, but not validated yet
   */

  VALIDATED,/**
   * The result is correct, and has been validated
   */
;
}
