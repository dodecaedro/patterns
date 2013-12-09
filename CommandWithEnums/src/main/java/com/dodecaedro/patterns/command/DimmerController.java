package com.dodecaedro.patterns.command;

/**
 * Created by jm on 12/9/13.
 */
public class DimmerController {
  private final DimmerCallback dimmerCallback = new DimmerCallback();

  public void setIntensity(DimmerState intensity) {
    //doStuffBeforeChangingIntensity();
    intensity.applyTo(dimmerCallback);
    //doStuffAfterChangingIntensity();
  }
}
