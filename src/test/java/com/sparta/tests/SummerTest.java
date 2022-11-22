package com.sparta.tests;

import com.sparta.Summer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SummerTest {
    @Test
    @DisplayName("Given array with values 1,2,3,4,5 returns 15")
    public void givenArrayWithValues12345Returns15() {
        int[] array = new int[]{1,2,3,4,5};
        int expected = 15;
        int actual = Summer.sumArray(array);
        assertEquals(expected, actual);
    }
}
