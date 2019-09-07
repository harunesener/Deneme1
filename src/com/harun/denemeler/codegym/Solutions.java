package com.harun.denemeler.codegym;

public class Solutions {

    private static String Text = "The Legend is Back...";

    public static void main(String[] args) {
        String name;
        int age;
        String city;

        name = "Harun";
        age = 40;
        city = "London";

        System.out.println(name + " is " + age + " years old and lives in " + city);
        System.out.println("------------------------------------------------------");
        System.out.println(Text);

        String str = "Hello Pappa... your son is back...";

        printTextMoreTimes(str, 3);
        System.out.println("str :" + str);
    }

    public static void printTextMoreTimes(String s, int count) {

        for (int i = 0; i < count; i++)
            System.out.println(s);

        s = "changed";
        System.out.println("s :" + s);

    }

}
