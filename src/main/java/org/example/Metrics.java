package org.example;

import java.util.function.Supplier;

/**
 * Universal performance metrics collector.
 * Can wrap any algorithm or operation (like a Python decorator).
 */
public class Metrics {

    private static long startTime;
    private static long endTime;
    private static long executionTimeNs;


    public static void start() {
        startTime = System.nanoTime();
    }

    public void stop() {
        endTime = System.nanoTime();
        executionTimeNs = endTime - startTime;
    }

    public static long getExecutionTimeNs() {
        return executionTimeNs;
    }

    @Override
    public String toString() {
        return "Metrics {" +
                "\n  Execution Time (ns): " + executionTimeNs +
                "\n}";
    }

    /**
     * Generic method to measure execution time of any function returning a result.
     * @param task The function or algorithm to run
     * @param <T> The type of result returned by the function
     * @return Result of the function
     */
}
