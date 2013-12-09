package com.dodecaedro.patterns.command;

/**
 * Created by jm on 12/9/13.
 * Adapted example from:
 * http://codex.grimoire.ca/2010/07/23/breaking-away-from-switch/
 */
public class CommandMain {
  public static void main(String... args) {
    DimmerController controller = new DimmerController();
    controller.setIntensity(DimmerState.ON);
    controller.setIntensity(DimmerState.DIM);
    controller.setIntensity(DimmerState.OFF);
  }
}
