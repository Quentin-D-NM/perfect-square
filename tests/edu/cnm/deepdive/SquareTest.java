package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Queue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class SquareTest {

  @Test
  void isPerfect() {
    assertTrue(Square.isPerfect(4));
    assertFalse(Square.isPerfect(5));
    assertTrue(Square.isPerfect(9));
    assertFalse(Square.isPerfect(2));
    assertTrue(Square.isPerfect(16));
    assertFalse(Square.isPerfect(10));
  }

  @Test
  void isPerfectException() {
    assertThrows(IllegalArgumentException.class, new ExecuteIsPerfectSquare());
  }

  private static class ExecuteIsPerfectSquare implements Executable {

    @Override
    public void execute() throws Throwable {
      Square.isPerfect(-1);
    }
  }
}