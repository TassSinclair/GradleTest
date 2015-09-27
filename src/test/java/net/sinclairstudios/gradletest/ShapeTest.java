package net.sinclairstudios.gradletest;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ShapeTest {
  @Test
  public void shouldAddSidesTogetherToFindPerimeter() {
    Shape shape = new Shape(new int[]{2, 3}) {};

    assertThat(shape.getPerimeter(), is(5));
  }
}
