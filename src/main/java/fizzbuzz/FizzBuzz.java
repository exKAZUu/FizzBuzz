package fizzbuzz;

public class FizzBuzz {
  public static String fizzBuzz(int i) {
    if (i % 15 == 0) {
      return "fizzbuzz";
    }
    if (i % 3 == 0) {
      return "fizz";
    }
    if (i % 5 == 0) {
      return "buzz";
    }
    return i + "";
  }
}
