package com.gam.challenge;

public class TestUtils {

    public static boolean isSortedArray(String[] values) {
        if (values.length <= 1) return true;
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i].compareTo(values[i + 1]) > 0) return false;
        }
        return true;
    }
}
