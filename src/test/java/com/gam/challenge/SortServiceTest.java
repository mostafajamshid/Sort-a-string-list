package com.gam.challenge;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static com.gam.challenge.TestUtils.isSortedArray;
import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {

    private SortService service = new SortService();

    @Test
    void whenGivenNull_shouldThrowsNullPointerException() {
        NullPointerException ex = assertThrows(NullPointerException.class, () -> service.sort(null));
        assertEquals("require non null", ex.getMessage());
    }

    @Test
    void sortEmptyArray() {
        String[] sorted = service.sort(new String[]{});
        assertTrue(isSortedArray(sorted));
    }

    @Test
    void sortArrayWithOneItem() {
        String[] sorted = service.sort(new String[]{"a"});
        assertTrue(isSortedArray(sorted));
    }

    @Test
    void sortFacts() {
        String[] sorted = service.sort(new String[]{"b", "a"});
        assertTrue(isSortedArray(sorted));

        String[] sorted1 = service.sort(new String[]{"b", "a", "c", "d", "e"});
        assertTrue(isSortedArray(sorted1));

        String[] sorted2 = service.sort(new String[]{"b", "a", "c", "d", "e", "a", "b"});
        assertTrue(isSortedArray(sorted2));
    }

    @Test
    void whenGivenInputContainsNull_shouldThrowsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> service.sort(new String[]{"b", "a", null}));
    }

    @Test
    void sortBigRandomInputs() {
        int len = 100000;
        String[] input = generateRandomArrayWithSize(len);
        String[] sorted = service.sort(input);
        assertTrue(isSortedArray(sorted));
    }

    private String[] generateRandomArrayWithSize(int len) {
        String[] input = new String[len];
        for (int i = 0; i < len; i++) {
            input[i] = UUID.randomUUID().toString();
        }
        return input;
    }

}
