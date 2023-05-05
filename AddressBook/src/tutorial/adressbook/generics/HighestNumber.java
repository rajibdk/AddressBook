package tutorial.adressbook.generics;

public class HighestNumber<T extends Number> {
    public T compare(T one, T two) {
        if(one.doubleValue() > two.doubleValue()) {
            return one;
        }
        return two;
    }

    public Integer compare1(TwoNumbers<Integer> numbers) {
        if(numbers.getNumberOne().doubleValue() > numbers.getNumberTwo().doubleValue()) {
            return numbers.getNumberOne();
        }
        return numbers.getNumberTwo();
    }

    public Double compare2(TwoNumbers<Double> numbers) {
        if(numbers.getNumberOne().doubleValue() > numbers.getNumberTwo().doubleValue()) {
            return numbers.getNumberOne();
        }
        return numbers.getNumberTwo();
    }

    public T compare3(TwoNumbers<? extends Number> numbers) {
        if(numbers.getNumberOne().doubleValue() > numbers.getNumberTwo().doubleValue()) {
            return (T) numbers.getNumberOne();
        }
        return (T) numbers.getNumberTwo();
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
