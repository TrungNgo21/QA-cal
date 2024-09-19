package Calculator;

public class Calculator {
  // Basic operators
  public static int add(int a, int b) {
    return a + b;
  }

  public static int subtract(int a, int b) {
    return a - b;
  }

  public static int multiply(int a, int b) {
    return a * b;
  }

  public static double divide(int a, int b) {
    if (b == 0) {
      throw new ArithmeticException("Division by zero is not allowed");
    }
    return (double) a / b;
  }

  public static int modulo(int a, int b) {
    if (b == 0) {
      throw new ArithmeticException("Modulo by zero is not allowed");
    }
    return a % b;
  }

  public static long power(int base, int exponent) {
    if (exponent < 0) {
      throw new IllegalArgumentException("Exponent must be non-negative");
    }
    if (exponent == 0) {
      return 1;
    }
    long result = 1;
    for (int i = 0; i < exponent; i++) {
      result *= base;
    }
    return result;
  }

  // Advanced operators
  public static int gcd(int a, int b) {
    a = abs(a);
    b = abs(b);
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }

  public static int lcm(int a, int b) {
    if (a == 0 || b == 0) {
      return 0;
    }
    return abs(a * b) / gcd(a, b);
  }

  public static long fibonacci(int n) {
    if (n < 0) {
      throw new IllegalArgumentException("Input must be non-negative");
    }
    if (n <= 1) {
      return n;
    }
    long a = 0, b = 1;
    for (int i = 2; i <= n; i++) {
      long temp = a + b;
      a = b;
      b = temp;
    }
    return b;
  }

  // Helper method to calculate absolute value without using Math.abs
  private static int abs(int n) {
    return n < 0 ? -n : n;
  }
}