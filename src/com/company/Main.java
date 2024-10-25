package com.company;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        IntStream.range(0, myIntegers.length).forEach(i -> System.out.println("Element " + i + ", typed value was " + myIntegers[i]));
        System.out.println("The average is " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];
        IntStream.range(0, values.length).forEach(i -> values[i] = scanner.nextInt());
        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return (double) sum / (double) array.length;
    }
}
