package samle.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sample3 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,10);
        //numbers.stream().forEach( i -> System.out.println("value is " + i));
        //numbers.stream().map( i -> i * 2).forEach(System.out::println); // a -> System.out.println(a)
        System.out.println(numbers.stream().map(i -> i * i ).max(Comparator.comparing(Integer::valueOf)).get());

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MAX_EXPONENT);



    }
}
