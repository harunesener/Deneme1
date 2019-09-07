package samle.java8;


public class Sample2 {

    interface MathOps<T> {
        T execute(T a, T b);
    }

     static class AddOps<T extends Number> implements MathOps<T>{

        public T execute(T x, T y) {

            Double sum;
            sum = x.doubleValue() + y.doubleValue();
            return (T) sum;
        }
    }

    public static void main(String[] args) {
        AddOps addInteger = new AddOps<Integer>();
        AddOps addDouble  = new AddOps<Double>();


        System.out.println("Add ops(5,7): " + addInteger.execute(5,7));
        System.out.println("Add ops(5.5,5.6): " + addDouble.execute(5.5,5.6));


        System.out.println("-----------------------------------------------------------------");
        System.out.println("Add ops(5,7) used calculate : " + calculate(addInteger,5,7));
        System.out.println("Add ops(5.5,5.6) used calculate : " + calculate(addDouble,5.5,5.6));



    }

    private static <T> T calculate (MathOps<T> mathOps, T a, T b){
        return mathOps.execute(a,b);

    }



}

