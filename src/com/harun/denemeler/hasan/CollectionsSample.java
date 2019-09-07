package com.harun.denemeler.hasan;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionsSample {
    public static void main(String[] args) {
        listSample();
        System.out.println("----------------------");
        setSample();
    }

    public static void listSample(){
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Harun");
        list1.add("Hasan");
        list1.add("Hakan");
        list1.add("Hakan");

        System.out.println(list1.contains("haah"));
        System.out.println(list1.get(1));
        System.out.println(list1.size());

        list1.forEach( s -> System.out.println(s));
    }

    public static void setSample() {
        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.add(15);
        set1.add(new Integer(50));
        set1.add(5);
        set1.add(1);
        set1.add(15);
        set1.add(50);
        System.out.println(set1.size());

        set1.stream().map( i -> i * 2).map(j -> j + 5).forEach(t -> System.out.println(t));

    }

}
