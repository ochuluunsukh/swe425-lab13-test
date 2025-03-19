package edu.miu.cs.cs425.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.when;


public class ArrayReversorTest {
    ArrayReversor arrayReversor;

    @Mock
    private ArrayFlattener arrayFlattenerMock;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        arrayReversor = new ArrayReversor(arrayFlattenerMock);
    }

    @AfterEach
    void tearDown() {
        arrayReversor = null;
    }

    @Test
    void reversorArray() {
        int[][] input = {{1, 3}, {0}, {4, 5, 9}};
        int[] flattenedArray = {1, 3, 0, 4, 5, 9};
        int[] expected = {9, 5, 4, 0, 3, 1};
        when(arrayFlattenerMock.flattenArray(input)).thenReturn(flattenedArray);
        assertArrayEquals(expected, arrayReversor.reverseArray(input));
    }
    @Test
    void testreversorArrayEmptyArray() {
        int[][] input = new int[0][0];
        int[] flattenedArray = new int[0];
        int[] expected = new int[0];
        when(arrayFlattenerMock.flattenArray(input)).thenReturn(flattenedArray);
        assertArrayEquals(expected, arrayReversor.reverseArray(input));
    }
}