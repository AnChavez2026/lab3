import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace2(){
    int[] input1 = {1, 2, 3, 4};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{4, 3, 2, 1}, input1);
  }

  @Test
  public void testReversed2() {
    int[] input1 = {1, 2, 3};

    assertArrayEquals(new int[]{3, 2, 1}, ArrayExamples.reversed(input1));
  } 

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = {1.2, 2.7, 3.9, 4.5, 5.2};
    assertEquals(4.075, ArrayExamples.averageWithoutLowest(input1), .01);
    double[] input2 = {1.0, 2.0};
    assertEquals(2.0, ArrayExamples.averageWithoutLowest(input2), .01);
    double[] input3 = {0.01, .3, .2, .5};
    assertEquals(0.333333, ArrayExamples.averageWithoutLowest(input3), 0);
  }
}

