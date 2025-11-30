package cn.gy;

import static org.junit.Assert.*;

public class calTest {

  @org.junit.Test
  public void add() {
    assertEquals(5, cal.add(2, 3));
  }

  @org.junit.Test
  public void sub() {
    assertEquals(1, cal.sub(3, 2));
  }

  @org.junit.Test
  public void mul() {
    assertEquals(6, cal.mul(2, 3));
  }

  @org.junit.Test
  public void div() {
    assertEquals(1, cal.div(3, 2));
  }

  @org.junit.Test
  public void mod() {
    assertEquals(1, cal.mod(3, 2));
  }
}