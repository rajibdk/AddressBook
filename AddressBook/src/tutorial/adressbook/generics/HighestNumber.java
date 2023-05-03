package tutorial.adressbook.generics;

public class HighestNumber<T extends Number> {
    public T compare(T one, T two) {
        if(one.doubleValue() > two.doubleValue()) {
            return one;
        }
        return two;
    }

    public static void main(String[] args) {
        Double result = new HighestNumber<Double>().compare(5.5, 6.2);
        System.out.println(result);

        Integer result1 = new HighestNumber<Integer>().compare(5, 6);
        System.out.println(result1);

        Float result2 = new HighestNumber<Float>().compare(5.1234f, 6.2345f);
        System.out.println(result2);
    }
}
