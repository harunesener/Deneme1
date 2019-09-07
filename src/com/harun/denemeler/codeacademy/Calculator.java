package com.harun.denemeler.codeacademy;

public class Calculator {
    String calculatorClass;

    public Calculator(String calculator) {
        calculatorClass = calculator;
        System.out.println("Calculator is " + calculatorClass);
    }

    // Add Function
    public int add(int a, int b) {
        return a + b;
    }

    // Subtract Function
    public int subtract(int a, int b) {
        return a - b;
    }

    //Multiply Function
    public long multiply(int a, int b) {
        return a * b;
    }

    //Divide Function
    public double divide(int a, int b) {
        return a / b;
    }

    // Modulo Function
    public int modulo(int a, int b) {
        return a % b;
    }

    // Main Function
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator("Active");

        System.out.println(" Add function (68,987 )" + myCalculator.add(68,987));
        System.out.println(" Subtract function (68,987) " + myCalculator.subtract(68,987));
        System.out.println(" Multiply function (68,987) " + myCalculator.multiply(68,987));
        System.out.println(" Divide function (68,987) " + myCalculator.divide(68,987));
        System.out.println(" Modulo function (68,987) " + myCalculator.modulo(68,987));
    }
}
