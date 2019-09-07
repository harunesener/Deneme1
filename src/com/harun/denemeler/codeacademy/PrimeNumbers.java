package com.harun.denemeler.codeacademy;

// Import statement:

import java.util.ArrayList;
import java.util.Arrays;

class PrimeNumbers {

    // Add your methods here:
    public static boolean isPrime(int number) {
        int i = 2;
        int limit = number / 2 + 1;
        boolean b = false;
        int counter = 0;

        /* while Loop

        while (i < limit) {
            if (number % i == 0) {
                b = false;

                System.out.println(" not prime, i : " + i);

                i = number;
            } else {
                b = true;
                System.out.println(" still prime, i : " + i);
                i++;
            }

            counter ++;
        } */

        // For Loop
        if (number == 2) {
            System.out.println("smallest prime number is : " + number);
            return true;
        } else if (number <= 2) {
            System.out.println(number + " is not a prime number");
            return false;
        } else {
            for (i = 2; i < limit; i++) {
                if (number % i == 0) {
                    System.out.println(number + " is not a prime number");

                    counter++;
                    return false;
                }
                counter++;
            }
            //System.out.println("counter : " + counter);
            return true;
        }
    }

    public ArrayList onlyPrimes(int[] numbers) {
        ArrayList<Integer> primes = new ArrayList<Integer>();

        for (int i = 0; i < numbers.length; i++) {
            if (isPrime(numbers[i])) {
                //System.out.println(numbers[i]);
                primes.add(numbers[i]);
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (!isPrime(numbers[i])) {
                //System.out.println(numbers[i]);
                numbers[i] = -1;
            }
        }
        return primes;
    }


    public static void main(String[] args) {

        PrimeNumbers pd = new PrimeNumbers();
        int[] numbers = {2, 3, 1, 29, 28, 33, 11, 100, 101, 43, 89};

      //new int[100];
/*
    for (int i = 0; i< 100;i++)
    {
      numbers [i] = i +1;
    }
*/
        System.out.println("Whole Numbers List : ");
        System.out.println(Arrays.toString(numbers));
        System.out.println("Prime Numbers List : ");
        /*
        for (int i = 0; i < numbers.length; i++) {
            if (pd.isPrime(numbers[i])) {
                System.out.println(numbers[i]);
            }
        }
         */

        ArrayList<Integer> primeNumbersList = new ArrayList<Integer>();
        primeNumbersList = pd.onlyPrimes(numbers);

        System.out.println("-------------------------------------------");
        for (int num : primeNumbersList) {
            System.out.println(num);
        }

        System.out.println("-------------------------------------------");
        for (int num : numbers) {
            System.out.println(num);
        }
    }

}