package com.example.tritypejunittest;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

public class TritypeMutationTest {

    @Test
    public void testMutantOne() {
        int result = TritypeMutantTwo.Triang(1, 1, 1);
        Assertions.assertEquals(3, result, "Mutant One should be killed");
    }

    @Test
    public void testMutantTwo() {
        int result = TritypeMutantTwo.Triang(1, 2, 3);
        Assertions.assertEquals(4, result, "Mutant Two should be killed");
    }

}