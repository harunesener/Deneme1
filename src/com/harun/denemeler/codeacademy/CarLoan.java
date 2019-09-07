package com.harun.denemeler.codeacademy;

public class CarLoan {
    int carLoan = 10000;
    int loanLength = 3; // loan length is 3 years
    int interestRate = 5; // interest rate of %5 on the loan
    int downPayment = 2000; // down payment = pay in advance


    public static void main(String[] args) {
        CarLoan cL = new CarLoan();


        if (cL.loanLength <= 0 || cL.interestRate <= 0) {
            System.out.println("Error! You must take out a valid car loan.");
        } else if (cL.downPayment >= cL.carLoan) {
            System.out.println("The car can be paid in full.");
        } else {
            int remainingBalance = cL.carLoan - cL.downPayment;
            int months = cL.loanLength * 12;
            int monthlyBalance = remainingBalance / months;
            int interest = monthlyBalance * cL.interestRate / 100;
            int monthlyPayment = monthlyBalance + interest;

            System.out.println(monthlyPayment);

        }

    }
}