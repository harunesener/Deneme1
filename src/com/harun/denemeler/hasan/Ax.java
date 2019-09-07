package com.harun.denemeler.hasan;

public class Ax extends A {

    public Ax(int i) {
        super(i);
    }

    public int getRisk() {
        if (getAge() < 20) return 25;
        if (getAge() > 20 && getAge() <= 40) return getAge() + 10;
        return Math.min(100, getAge() * 2);
    }

    @Override
    public int add(int a, int b) {
        return a + b + 5;

    }


}
