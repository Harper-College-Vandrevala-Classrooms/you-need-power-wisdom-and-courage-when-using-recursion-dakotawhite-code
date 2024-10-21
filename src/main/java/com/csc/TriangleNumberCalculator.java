package com.csc;
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
    }
}