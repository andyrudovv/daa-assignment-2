package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OptimizedInsertionAlgorithmTest {

    @Test
    void testEmptyArray() {
        int[] numbers = {};

        Metrics m = new Metrics();

        m.start();
        OptimizedInsertionAlgorithm.insertionSort(numbers);
        m.stop();

        double time = m.getExecutionTimeNs();
        System.out.println("Execution Time: " + time);
        assertArrayEquals(new int[]{}, numbers, "Empty array should remain empty");
    }

    @Test
    void testSingleElement() {
        int[] numbers = {42};
        Metrics m = new Metrics();

        m.start();
        OptimizedInsertionAlgorithm.insertionSort(numbers);
        m.stop();

        double time = m.getExecutionTimeNs();
        System.out.println("Execution Time: " + time);
        assertArrayEquals(new int[]{42}, numbers, "Single-element array should remain unchanged");
    }

    @Test
    void testAlreadySorted() {
        int[] numbers = {1, 2, 3, 4, 5};
        Metrics m = new Metrics();

        m.start();
        OptimizedInsertionAlgorithm.insertionSort(numbers);
        m.stop();

        double time = m.getExecutionTimeNs();
        System.out.println("Execution Time: " + time);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, numbers, "Already sorted array should remain unchanged");
    }

    @Test
    void testReverseSorted() {
        int[] numbers = {5, 4, 3, 2, 1};
        Metrics m = new Metrics();

        m.start();
        OptimizedInsertionAlgorithm.insertionSort(numbers);
        m.stop();

        double time = m.getExecutionTimeNs();
        System.out.println("Execution Time: " + time);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, numbers, "Reverse-sorted array should be sorted ascending");
    }

    @Test
    void testRandomOrder() {
        int[] numbers = {3, 5, 2, 4, 6, 1};
        Metrics m = new Metrics();

        m.start();
        OptimizedInsertionAlgorithm.insertionSort(numbers);
        m.stop();

        double time = m.getExecutionTimeNs();
        System.out.println("Execution Time: " + time);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, numbers, "Unsorted array should be sorted ascending");
    }

    @Test
    void testWithDuplicates() {
        int[] numbers = {4, 2, 4, 1, 3, 2};
        Metrics m = new Metrics();

        m.start();
        OptimizedInsertionAlgorithm.insertionSort(numbers);
        m.stop();

        double time = m.getExecutionTimeNs();
        System.out.println("Execution Time: " + time);
        assertArrayEquals(new int[]{1, 2, 2, 3, 4, 4}, numbers, "Array with duplicates should be sorted correctly");
    }

    @Test
    void testNearlySorted() {
        int[] numbers = {1, 2, 4, 3, 5, 6};
        Metrics m = new Metrics();

        m.start();
        OptimizedInsertionAlgorithm.insertionSort(numbers);
        m.stop();

        double time = m.getExecutionTimeNs();
        System.out.println("Execution Time: " + time);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, numbers, "Nearly sorted array should be sorted correctly");
    }
}
