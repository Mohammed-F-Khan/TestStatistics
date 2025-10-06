package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {
        int[] scores = {88, 92, 76, 81, 95, 68, 100, 73, 84,90};

        // Average:
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];

        }
        double average = sum / (double) scores.length;

        // sort from smallest to largest

        Arrays.sort(scores);

        // Low and High after sorting.
        int low = scores[0];
        int high = scores[scores.length - 1];

        double median = (scores[4] + scores[5]) / 2.0;

        double difference = Math.abs(average - median);

        // print the results
        System.out.println("=== Test Statistics ===");
        System.out.printf("Average: %.2f%n", average);
        System.out.println("High score: " + high);
        System.out.println("Low score: " + low);
        System.out.printf("Median: %.2f%n", median);
        System.out.printf("Difference (|average - median|): %.2f%n", difference);
    }

}
