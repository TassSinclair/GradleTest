package net.sinclairstudios.gradletest;

import java.util.Arrays;

public abstract class Shape {

  private final int[] sideLengths;

  protected Shape(int[] sideLengths) {
    this.sideLengths = sideLengths;
  }

  public int getPerimeter() {
    return Arrays.stream(sideLengths).sum();
  }
}
