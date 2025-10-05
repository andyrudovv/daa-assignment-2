package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class CLI {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Sorting Algorithm CLI ===");
        System.out.println("Available algorithms: insertion");
        System.out.println("Type the algorithm name:");

        String algorithm = scanner.nextLine().trim().toLowerCase();

        System.out.println("Enter numbers separated by spaces:");
        String[] parts = scanner.nextLine().trim().split("\\s+");
        int[] numbers = Arrays.stream(parts)
                .mapToInt(Integer::parseInt)
                .toArray();


        Metrics metrics = new Metrics();
        metrics.start();
        InsertionAlgorithm.insertionSort(numbers);
        metrics.stop();


        System.out.println("\n=== Sorted Result ===");
        System.out.println(Arrays.toString(numbers));

        System.out.println("\n=== Performance Metrics ===");
        System.out.println(metrics.getExecutionTimeNs());
    }
}
