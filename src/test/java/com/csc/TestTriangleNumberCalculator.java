package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTriangleNumberCalculator {
  TriangleNumberCalculator calculator;

  @BeforeEach
  void setUp() {
    calculator = new TriangleNumberCalculator();
  }

@Test
  void testvalue1() {
    assertEquals(1,calculator.value(1));
  }
  @Test
  void testvalue4() {
    assertEquals(10,calculator.value(4));
  }

  @Test
  void testadd1n1() {
    assertEquals(2,calculator.add(1,1));
  }

  @Test
  void testadd4n5() {
    assertEquals(25,calculator.add(4,5));
  }

  @Test
  void testsub1n1() {
    assertEquals(0,calculator.subtract(1,1));
  }

  @Test
  void testsub8n9() {
    assertEquals(-9,calculator.subtract(8,9));
  }
}