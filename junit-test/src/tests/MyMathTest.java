package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import junit.MyMath;

public class MyMathTest {
    private MyMath myMath = new MyMath();
    @Test
    public void test() {
        int[] nums = {1, 2, 3};
        int result = myMath.calculateSum(nums);
        int expected = 6;
        assertEquals(expected, result);
    }
}
