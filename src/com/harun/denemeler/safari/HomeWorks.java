package com.harun.denemeler.safari;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorks {

    public static void main(String[] args) {
        HomeWorks hw = new HomeWorks();

        //hw.stringFunctions();
        //hw.intControls();


        double t = Math.random();
        int i = (int) (Math.random() * 100);

        //System.out.println(t);
        //System.out.println(i);

        //System.out.println("input : " + hw.readInput());



        hw.calculator();
        hw.multiDimensionalArrays();
        hw.stringBuilder(7);
    }

    public void multiDimensionalArrays(){

        int [][] multiDimenArr = new int[3][3];

        for (int i = 0; i < multiDimenArr.length;i ++){
            int total = 0;

            for (int j=0; j < multiDimenArr[i].length; j++){
                multiDimenArr[i][j] = (int)(Math.random()* 10);
                total = total + multiDimenArr[i][j];
            }

            System.out.print(Arrays.toString(multiDimenArr[i]));
            System.out.println (" " + i + ".row, total number is " + total);
            System.out.println("------------------------------");
        }
    }

    public void calculator(){

        Scanner scn = new Scanner(System.in);
        boolean flag = true;
        int option;

        while (flag){
            System.out.println("-=-=-=-=-=-=-=-=-=-");
            System.out.println();
            System.out.println("1) Add");
            System.out.println("2) Subtract");
            System.out.println("3) Multiply");
            System.out.println("4) Divide");
            System.out.println("5) Quit");
            System.out.println();

            System.out.print("Which option: ");

            option = scn.nextInt();
            int a, b;

            switch (option){
                case 1:
                    System.out.println("Enter the first number");
                    a = scn.nextInt();
                    System.out.println("Enter the second number");
                    b = scn.nextInt();
                    System.out.println("Result is : " + (a+b));
                    break;

                case 2:
                    System.out.println("Enter the first number");
                    a = scn.nextInt();
                    System.out.println("Enter the second number");
                    b = scn.nextInt();
                    System.out.println("Result is : " + (a-b));
                    break;
                case 3:
                    System.out.println("Enter the first number");
                    a = scn.nextInt();
                    System.out.println("Enter the second number");
                    b = scn.nextInt();
                    System.out.println("Result is : " + (a*b));
                    break;
                case 4 :
                    System.out.println("Enter the first number");
                    a = scn.nextInt();
                    System.out.println("Enter the second number");
                    b = scn.nextInt();
                    System.out.println("Result is : " + (a/b));
                    break;
                case 5:
                    flag = false;
                    System.out.println("GoodByeee...");
                    break;
                default:
                    break;
            }


        }


    }

    public int readInput() {
        int input;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        do {
            System.out.println("-=-=-=-=-=-=-=-=-=-");
            System.out.println("Please Enter a number");

            input = sc.nextInt();

            if (input == 0) {
                flag = false;
            }

        } while (flag);

        System.out.println("goodbye11");

        return input;

    }

    public void intControls() {
        int a, b, c;
        a = 10 * 76;
        b = 9 * 73;
        c = 8 * 65;
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);

        if (a >= b) {
            if (b > c) {
                System.out.println("a > b > c");
            } else if (a > c) {
                System.out.println("a > c > b");
            } else {
                System.out.println("c > a > b");
            }
        } else if (a > c) {
            System.out.println("b > a > c");
        } else if (b > c) {
            System.out.println("b > c > a");
        } else {
            System.out.println("c > b > a");
        }

    }

    public void stringFunctions() {
        String s1 = "Hi";
        String s2 = "Hey";
        String s3 = "Hello";
        String s4 = "Hows it going";
        String s5 = "Whats up";

        String result;

        result = "" + s1.charAt(0);
        result += s2.charAt(0);
        result += s3.charAt(0);
        result += s4.charAt(0);
        result += s5.charAt(0);

        result += "-";
        result += s1.charAt(s1.length() - 1);
        result += s2.charAt(s2.length() - 1);
        result += s3.charAt(s3.length() - 1);
        result += s4.charAt(s4.length() - 1);
        result += s5.charAt(s5.length() - 1);

        System.out.println("--------------------------------");
        System.out.println(result);
    }

    public void stringBuilder(int count){
        String candidateChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        String finalString = "";

        for(int i =0;i<count; i++) {
            finalString = finalString + " " + candidateChars.charAt((int) (Math.random() * candidateChars.length()));
        }
        System.out.println(finalString);
    }
}
