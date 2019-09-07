package com.harun.denemeler.hasan;

public class Main {

    public static void main(String[] args) {
        Ax a1 = new Ax(50);
        Ax a2 = new Ax(40);

        a1.add(5,78);
        a2.add("harun","esener");



        System.out.println(a1.add(5,78));
        System.out.println(a2.add("harun","esener"));
    }
}
