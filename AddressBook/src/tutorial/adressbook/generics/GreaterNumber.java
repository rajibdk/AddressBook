package tutorial.adressbook.generics;

public class GreaterNumber<T extends Number>{
    public T compute(T firstNo, T secondNo) {
        if(firstNo.doubleValue() > secondNo.doubleValue()) {
            return firstNo;
        }
        return secondNo;
    }

    public static void main(String[] args) {
        GreaterNumber<Double> greaterNumber = new GreaterNumber();
        Double result = greaterNumber.compute(5.5, 6.66);

        System.out.println("The greater number is " + result);

        GreaterNumber<Integer> greaterNumber1 = new GreaterNumber();
        Integer result1 = greaterNumber1.compute(5, 6);

        System.out.println("The greater number is " + result1);

        GreaterNumber<Float> greaterNumber2 = new GreaterNumber();
        Float result2 = greaterNumber2.compute(5.533f, 6.66f);

        System.out.println("The greater number is " + result2);
    }
}
