package com.dodecaedro.patterns.command;

/**
 * Created by jm on 12/9/13.
 */
public enum DimmerState implements StateCommand{
  OFF {
    @Override
    public void applyTo(DimmerCallback dimmerCallback) {
      dimmerCallback.disable();
    }
  },
  DIM {
    @Override
    public void applyTo(DimmerCallback dimmerCallback) {
      dimmerCallback.beginDimCycle();
    }
  },
  ON {
    @Override
    public void applyTo(DimmerCallback dimmerCallback) {
      dimmerCallback.beginFullCycle();
    }
  };
}
