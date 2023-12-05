package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
/*选择Tritype.Triang方法中的以下决策:
if (Side1 <= 0 || Side2 <= 0 || Side3 <= 0) {
        triOut = 4;
        return (triOut);
        }

 */
public class TritypeConditionTest {

    @Test
    public void testTritypeCondition() {
        // Test cases for condition coverage

        // Test case 1: Side1 <= 0 is false, Side2 <= 0 is false
        int result1 = Tritype.Triang(1, 2, 3);
        assertEquals(4, result1);

        // Test case 2: Side1 <= 0 is true, Side2 <= 0 is false
        int result2 = Tritype.Triang(-1, 2, 3);
        assertEquals(4, result2);

        // Test case 3: Side1 <= 0 is true, Side2 <= 0 is true
        int result3 = Tritype.Triang(-1, -2, 3);
        assertEquals(4, result3);
    }
}