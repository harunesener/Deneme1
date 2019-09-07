package com.harun.denemeler.hasan;

public abstract class A {
    private int age;

    public A(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }

    public abstract int getRisk() ;
}
