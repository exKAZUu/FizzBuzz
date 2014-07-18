package fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {
  @Test
  public void testFizzBuzz1() {
    String ret = FizzBuzz.fizzBuzz(1);
    assertEquals("1", ret);
  }

  @Test
  public void testFizzBuzz2() {
    String ret = FizzBuzz.fizzBuzz(2);
    assertEquals("2", ret);
  }

  @Test
  public void testFizzBuzz3() {
    String ret = FizzBuzz.fizzBuzz(3);
    assertEquals("fizz", ret);
  }
}
