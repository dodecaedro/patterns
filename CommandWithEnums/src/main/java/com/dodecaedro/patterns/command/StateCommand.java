package com.dodecaedro.patterns.command;

/**
 * Created by jm on 12/9/13.
 */
public interface StateCommand {
  void applyTo(DimmerCallback dimmerCallback);
}
