package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Queue;
import org.junit.jupiter.api.Test;

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
    try {
      Square.isPerfect(-1);
      fail();
    }catch (IllegalArgumentException expected){
      //Do nothing; this is exactly as expected
    }
  }
}