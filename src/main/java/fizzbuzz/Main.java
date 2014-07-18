package fizzbuzz;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
      System.out.println(FizzBuzz.fizzBuzz(sc.nextInt()));
    }
    sc.close();
  }
}
