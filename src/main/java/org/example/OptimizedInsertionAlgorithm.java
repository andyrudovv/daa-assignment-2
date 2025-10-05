package org.example;

import java.util.Arrays;

public class OptimizedInsertionAlgorithm {
    public static void insertionSort(int[] numbers) {
        int length = numbers.length;
        if (length < 2) return;

        // Early exit: check if already sorted
        boolean sorted = true;
        for (int i = 1; i < length; i++) {
            if (numbers[i - 1] > numbers[i]) {
                sorted = false;
                break;
            }
        }
        if (sorted) return;

        for (int i = 1; i < length; i++) {
            int currentValue = numbers[i];

            // Skip if already in correct order
            if (numbers[i - 1] <= currentValue) {
                continue;
            }

            // Find correct insertion position using binary search
            int insertPos = binarySearch(numbers, 0, i - 1, currentValue);

            // Shift elements to make room for currentValue
            int shiftCount = i - insertPos;
            System.arraycopy(numbers, insertPos, numbers, insertPos + 1, shiftCount);

            // Insert currentValue into sorted part
            numbers[insertPos] = currentValue;
        }
    }

    private static int binarySearch(int[] arr, int low, int high, int key) {
        while (low <= high) {
            int mid = (low + high) >>> 1;
            if (arr[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void printArray(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }
}
