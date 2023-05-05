package tutorial.adressbook.generics;

public class TwoNumbers <T extends Number>{
    T numberOne;
    T numberTwo;

    public TwoNumbers(T numberOne, T numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public T getNumberOne() {
        return numberOne;
    }

    public T getNumberTwo() {
        return numberTwo;
    }
}
