package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }
  /**
   *@param someone
   *@return greeting string
   */
  public final String greet(final String @param someone) {
    return String.format("Hello, %s!", someone);
  }
}
