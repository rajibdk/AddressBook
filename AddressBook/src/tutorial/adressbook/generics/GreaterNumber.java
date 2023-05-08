package tutorial.adressbook.generics;

import tutorial.adressbook.entity.Contact;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GreaterNumber<T extends Number>{
    public T compute(T firstNo, T secondNo) {
        if(firstNo.doubleValue() > secondNo.doubleValue()) {
            return firstNo;
        }
        return secondNo;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(24);
        numbers.add(600);

        List<Double> number_doubles = new ArrayList<>();
        number_doubles.add(10.11);
        number_doubles.add(122.899);

        print_numbers(numbers);
        print_numbers(number_doubles);

        List<Contact> contacts = new ArrayList<>();
        print_numbers(contacts);
    }
    private static void print_numbers(List<? extends Object> numbers) {
        numbers.forEach(no -> {
            System.out.println(((Contact)no).getMobileNumber());
        });
    }
}
