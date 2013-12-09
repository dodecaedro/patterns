package com.dodecaedro.patterns.command;

/**
 * Created by jm on 12/9/13.
 */
public class DimmerCallback {
  public void disable() {
    System.out.println("disabling...");
  }

  public void beginDimCycle() {
    System.out.println("beginning dim cycle...");
  }

  public void beginFullCycle() {
    System.out.println("beginning full cycle...");
  }
}
