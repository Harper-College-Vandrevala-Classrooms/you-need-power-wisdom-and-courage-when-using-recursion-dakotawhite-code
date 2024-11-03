package com.csc;

import java.util.ArrayList;
import java.util.List;

public class TriangleNumberCalculator {
    public int value(int n) {
        if (n == 1) {
          return 1;
        }
      return n + value(n - 1);
    }

    public int add(int n, int m) {
        return value(n) + value(m);
    }

    public int subtract(int n, int m) {
        return value(n) - value(m);
    }

    public int multiply(int n, int m) {
        return value(n) * value(m);
    }

    public double divide(int n, int m) {
        if (m == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return (double) value(n) / value(m);
    }

    public List<Integer> sequence(int n) {
        List<Integer> trianglenums = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            trianglenums.add(value(i));
        }
        return trianglenums;
    }

    public static void main(String[] args) {
        TriangleNumberCalculator calculator = new TriangleNumberCalculator();
        
        System.out.println(calculator.value(1));
        System.out.println(calculator.value(4));
        System.out.println(calculator.value(9));
        
        System.out.println(calculator.add(1, 1));
        System.out.println(calculator.add(3, 4));
        System.out.println(calculator.add(8, 5));
        
        System.out.println(calculator.subtract(1, 1));
        System.out.println(calculator.subtract(5, 6));
        System.out.println(calculator.subtract(8, 2));

        System.out.println(calculator.multiply(2, 3));
        System.out.println(calculator.multiply(4, 4));

        System.out.println(calculator.divide(9, 4));
        System.out.println(calculator.divide(2, 2));

        System.out.println(calculator.sequence(2));
        System.out.println(calculator.sequence(6));


    }
}
