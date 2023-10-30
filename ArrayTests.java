import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlaceOne() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test 
	public void testReverseInPlaceReg() {
    int[] input1 = {3,2,1};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{1,2,3}, input1);
	}

  @Test
  public void testReverseInPlaceEmpty() {
    int[] input1 = { };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ }, input1);
  }

  //--------------------------------------------------

  @Test 
	public void testReversedOne() {
    int[] input1 = { 3 };
    assertArrayEquals(new int[]{ 3 }, ArrayExamples.reversed(input1));
	}

  @Test 
	public void testReversedReg() {
    int[] input1 = {3,2,1};
    assertArrayEquals(new int[]{1,2,3}, ArrayExamples.reversed(input1));
	}

  @Test
  public void testReversedEmpty() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
}
