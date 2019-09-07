package com.harun.denemeler.codeacademy;

import java.util.ArrayList;

public class Dna {
    public static void main(String[] args) {
       // this program determines whether there is a protein in a strand of DNA.

        ArrayList<String> dnaList = new ArrayList<String>();
        String[] dnaArray = {"ATGCGATACGCTTGA","ATGCGATACGTGA","ATTAATATGTACTGA"};

        dnaList.add("ATGCGATACGCTTGA");
        dnaList.add("ATGCGATACGTGA");
        dnaList.add("ATTAATATGTACTGA");

        System.out.println("The Solution in Arrays");
        System.out.println("----------------------");


        for (String dna:dnaArray)
        {
            int length = dna.length();

            if (dna.substring(0, 3).equals("ATG") && dna.substring(length - 3, length).equals("TGA") && (length % 3 == 0)) {
                System.out.println(dna + " this is a protein");
            } else {
                System.out.println(dna + " this is not a protein");
            }
        }
        System.out.println("----------------------------");
        System.out.println("Tha Solution in ArrayList...");
        System.out.println("----------------------------");

        for (String dna:dnaList)
        {
            int length = dna.length();

            if (dna.substring(0, 3).equals("ATG") && dna.substring(length - 3, length).equals("TGA") && (length % 3 == 0)) {
                System.out.println(dna + " this is a protein");
            } else {
                System.out.println(dna + " this is not a protein");
            }
        }





    }

}