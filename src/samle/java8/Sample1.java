package samle.java8;


public class Sample1 {

    interface MathOps {
        int execute(int a, int b);
    }

    static class AddOps implements MathOps{
        @Override
        public int execute(int a, int b) {
            return a+b;
        }
    }
    static class MinusOps implements MathOps{
        @Override
        public int execute(int a, int b) {
            return a-b;
        }
    }
    public static void main(String[] args) {
        AddOps add = new AddOps();
        MinusOps minus = new MinusOps();
        //MultiplyOps multiply = new MultiplyOps();

        MathOps divide = (int i, int j) ->  i / j ;

        System.out.println("Add ops(5,7): " + add.execute(5,7));
        System.out.println("Minus ops(5,7): " + minus.execute(5,7));
        //System.out.println("Multiply ops(5,7): " + multiply.execute(5,7));
        System.out.println("Dıvıde ops(10,2): " + divide.execute(10,2));

        System.out.println("---------------------------------------------------------");

        System.out.println("Calculate (add,5,7): " + calculate(add,5,7));
        System.out.println("Calculate (minus,5,7): " + calculate(minus,5,7));

        System.out.println("Addition ops (12,19) " + calculate( (int a, int b) -> a+b, 12, 19 ));
        System.out.println("Multiply ops (10,7) " + calculate( (int a, int b) -> a*b, 10,7) );
        System.out.println("Divide ops(10,2): " + calculate(  (int i, int j) ->  i / j ,10,2) );

    }

    private static int calculate (MathOps mathOps, Integer a, Integer b){
        return mathOps.execute(a,b);

    }

}

