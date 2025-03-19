package edu.miu.cs.cs425.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayFlattenerTest {
    private ArrayFlattener arrayFlattener;
    @BeforeEach
    void setUp() {
        arrayFlattener = new ArrayFlattener();
    }

    @AfterEach
    void tearDown() {
        arrayFlattener = null;
    }

    @Test
    void flattenArray() {
        int[][] input = {{1, 3}, {0}, {4, 5, 9}};
        int[] expected = {1, 3, 0, 4, 5, 9};
        assertArrayEquals(expected, arrayFlattener.flattenArray(input));
    }

    @Test
    public void testFlattenArrayNull() {
        ArrayFlattener arrayFlattener = new ArrayFlattener();
        assertNull(arrayFlattener.flattenArray(null));
    }
}