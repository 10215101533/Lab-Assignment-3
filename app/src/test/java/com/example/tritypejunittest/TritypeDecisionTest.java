package com.example.tritypejunittest;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
/*选择Tritype.Triang方法中的以下决策:
if (Side1 <= 0 || Side2 <= 0 || Side3 <= 0) {
        triOut = 4;
        return (triOut);
        }

 */
public class TritypeDecisionTest {

    @Test
    public void testTritypeDecision() {
        // Test cases for decision coverage

        // Test case 1: Side1 <= 0 is false, Side2 <= 0 is false
        int result1 = Tritype.Triang(1, 2, 3);
        assertEquals(4, result1);

        // Test case 2: Side1 <= 0 is true, Side2 <= 0 is false
        int result2 = Tritype.Triang(-1, 2, 3);
        assertEquals(4, result2);
    }
}