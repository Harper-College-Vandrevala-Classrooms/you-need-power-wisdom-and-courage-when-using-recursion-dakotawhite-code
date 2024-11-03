package com.csc;

import java.util.Arrays;
import java.util.List;

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

  @Test
  public void testmultiply() {
      assertEquals(1, calculator.multiply(1, 1));
      assertEquals(100, calculator.multiply(4, 4));
  }

  @Test
  public void testdivide() {
      assertEquals(1, calculator.divide(3, 3));
      assertEquals(7.5, calculator.divide(9, 3));
  }

  @Test
    public void testsequence() {
        List<Integer> expected = Arrays.asList(1);
        assertEquals(expected, calculator.sequence(1));
    }
    
    @Test
    public void testseq3() {
        List<Integer> expected = Arrays.asList(1, 3, 6);
        assertEquals(expected, calculator.sequence(3));
    }

    @Test
    public void testseq5() {
        List<Integer> expected = Arrays.asList(1, 3, 6, 10, 15);
        assertEquals(expected, calculator.sequence(5));
    }
}