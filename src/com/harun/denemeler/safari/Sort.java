package com.harun.denemeler.safari;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Sort {

    public static void selectionSort(int numbers[]) {
        int lowest = 0;
        int length = numbers.length;

        // in here, sorting process has been done...
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (numbers[i] > numbers[j]) {
                    lowest = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = lowest;
                }
            }
        }
    }

    public static void quickSort(int numbers[], int start, int stop) {
        int leftIndex = start;
        int rightIndex = stop;
        int medyanNumber = numbers[(leftIndex + rightIndex) / 2];
        int temp = 0;
        long startTime = (new Date()).getTime();

        //System.out.println("Quick Sort Starts...");

        // in here, sorting process has been done...
        while (leftIndex < rightIndex) {
            while (numbers[leftIndex] < medyanNumber) {
                leftIndex++;
            }

            while (numbers[rightIndex] > medyanNumber) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                temp = numbers[leftIndex];
                numbers[leftIndex] = numbers[rightIndex];
                numbers[rightIndex] = temp;

                leftIndex++;
                rightIndex--;
            }
        }

        if (start < rightIndex) {
            quickSort(numbers, start, rightIndex);
        }

        if (leftIndex < stop) {
            quickSort(numbers, leftIndex, stop);
        }

        // System.out.println("*********** Sorted List **************");
        // System.out.println(Arrays.toString(numbers));
        // System.out.println("**************************************");

        // long finishTime = (new Date()).getTime();
        // System.out.println("Process Time : " + (finishTime - startTime));
    }

    public static void main(String[] args) {
        int numbers[] = new int[15000];
        Random rand = new Random();

        // initialize the Array of Integers by random class...
        for (int i = 0; i < 15000; i++) {
            numbers[i] = rand.nextInt(100000);
        }

        System.out.println("Selection Sort Starts...");
        long startTime = (new Date()).getTime();

        selectionSort(numbers);

        System.out.println("*********** Sorted List **************");
        //System.out.println(Arrays.toString(numbers));
        System.out.println("**************************************");

        long finishTime = (new Date()).getTime();
        System.out.println("Selection Sort Process Time : " + (finishTime - startTime));

        System.out.println("Quick Sort Starts...");



        startTime = (new Date()).getTime();

        quickSort(numbers, 0, numbers.length - 1);

        System.out.println("*********** Sorted List **************");
        System.out.println(Arrays.toString(numbers));
        System.out.println("**************************************");

        finishTime = (new Date()).getTime();
        System.out.println("Quick Sort Process Time : " + (finishTime - startTime));


    }
}
