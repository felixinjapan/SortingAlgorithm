import static org.junit.Assert.assertArrayEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class MergeSortTest {

    private static MergeSort mergesort;

    @BeforeClass
    public static void setup() {
        mergesort = new MergeSort();
    }

    @Test
    public void testWithAlreadySortedArray() {
        // setup
        int[] inputArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] expectedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // execute
        mergesort.sort(0, inputArray.length, inputArray);
        // verify
        assertArrayEquals(expectedArray, inputArray);
    }

    @Test
    public void testWithUnsortedArray() {
        int[] inputArray = { 10, 2, 4, 5, 6, 3, 2, 1, 3, 4, 6, 70, 100, 0 };
        int[] expectedArray = { 0, 1, 2, 2, 3, 3, 4, 4, 5, 6, 6, 10, 70, 100 };
        mergesort.sort(0, inputArray.length, inputArray);
        assertArrayEquals(expectedArray, inputArray);
    }

    @Test
    public void testWithNegativeIntegerArray() {
        int[] inputArray = { -1, -2, -3, -4, -5, -6, -7, -8, -9, -10 };
        int[] expectedArray = { -10, -9, -8, -7, -6, -5, -4, -3, -2, -1 };
        mergesort.sort(0, inputArray.length, inputArray);
        assertArrayEquals(expectedArray, inputArray);
    }

    @Test
    public void testWithSameIntegerArray() {
        int[] inputArray = { -1, -1, -1, -1, -1, -1, -1, -1, -1 };
        int[] expectedArray = { -1, -1, -1, -1, -1, -1, -1, -1, -1 };
        mergesort.sort(0, inputArray.length, inputArray);
        assertArrayEquals(expectedArray, inputArray);
    }

    @Test
    public void testWithOneSizeArray() {
        int[] inputArray = { 0 };
        int[] expectedArray = { 0 };
        mergesort.sort(0, inputArray.length, inputArray);
        assertArrayEquals(expectedArray, inputArray);
    }

    @Test
    public void testWithEmptyArray() {
        int[] inputArray = {};
        int[] expectedArray = {};
        mergesort.sort(0, inputArray.length, inputArray);
        assertArrayEquals(expectedArray, inputArray);
    }
}