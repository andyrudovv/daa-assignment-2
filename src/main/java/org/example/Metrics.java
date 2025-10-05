package org.example;

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
}
