package com.harun.denemeler;

import com.harun.denemeler.math.Addition;
import com.harun.denemeler.math.Substruction;
import com.harun.denemeler.zoo.Cat;
import com.harun.denemeler.zoo.Dog;
import com.harun.denemeler.zoo.Zoo;

public class Server {
    public static void main(String[] args) {
        sample1();
        sample2();
        callSubs(9, 78);

        //Tasks.main();
        //Solutions.main();
    }

    public static void sample1() {
        Addition addition = new Addition();
        long result = addition.add(16, 20);
        System.out.println("result :" + result);

    }

    public static void sample2() {
        Zoo zoo = new Zoo();
        Dog dog = new Dog();
        Cat cat = new Cat();

        zoo.printVoice(dog);
        zoo.printVoice(cat);
    }

    public static void sample3(){
        Zoo zoo = new Zoo();
    }

    public static void callSubs(long x, long y){
        Substruction substruction = new Substruction();
        long difference = substruction.sub(x,y);
        System.out.println("Çıkarma işleminin sonucu : " + difference);

    }


}
