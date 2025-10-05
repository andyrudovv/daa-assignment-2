package org.example;

public class InsertionAlgorithm {

    /**
     * Performs an optimized Insertion Sort on the given array.
     * This version minimizes unnecessary swaps and works especially well
     * for nearly sorted data.
     *
     * @param numbers the array of integers to sort
     */

    public static void insertionSort(int[] numbers) {
        int length = numbers.length;

        for (int currentIndex = 1; currentIndex < length; currentIndex++) {
            int currentValue = numbers[currentIndex];
            int sortedIndex = currentIndex - 1;

            // Skip if already in correct order
            if (numbers[sortedIndex] <= currentValue) {
                continue;
            }

            // Shift larger elements to the right
            while (sortedIndex >= 0 && numbers[sortedIndex] > currentValue) {
                numbers[sortedIndex + 1] = numbers[sortedIndex];
                sortedIndex--;
            }

            // Insert current value into the correct sorted position
            numbers[sortedIndex + 1] = currentValue;
        }
    }

    /** Prints the array elements in one line. */
    public static void printArray(int[] numbers) {
        for (int value : numbers) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
