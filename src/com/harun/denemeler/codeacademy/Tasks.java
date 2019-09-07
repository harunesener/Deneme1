package com.harun.denemeler.codeacademy;

public class Tasks {
    public void print(){
        System.out.println("----------------------------------------------------------");
        System.out.println(" Now I am in print function and Called from main method...");
    }

    public static void main(String[] args) {
        Tasks t = new Tasks();

        System.out.println("I am called first...");
        System.out.println("calling another method now....");

        t.print();

    }
}
