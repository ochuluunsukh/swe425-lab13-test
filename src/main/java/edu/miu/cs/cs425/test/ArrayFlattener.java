package edu.miu.cs.cs425.test;

import java.util.Arrays;

public class ArrayFlattener {
    public int[] flattenArray(int[][] nestedArray) {
        if (nestedArray == null) {
            return null;
        }
        return Arrays.stream(nestedArray)
                .filter(java.util.Objects::nonNull)
                .flatMapToInt(java.util.Arrays::stream)
                .toArray();
    }
}
