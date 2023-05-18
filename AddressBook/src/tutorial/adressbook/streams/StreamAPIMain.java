package tutorial.adressbook.streams;

import tutorial.adressbook.entity.Contact;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIMain {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 4, 5, 7, 9, 12, 13, 16);

        System.out.println("numbers: " + numbers);
        List<Integer> evenNumbers = numbers.stream().filter(ele -> ele % 2 == 0).toList();
        System.out.println("evens: " + evenNumbers);

        List<Integer> multiplied = evenNumbers.stream().map(ele -> ele * 2).toList();
        System.out.println(multiplied);

        List<Contact> contacts = List.of(new Contact("Alex", 1234), new Contact("Blex", 1236));
        Map<Integer, Contact> contactMap = contacts.stream().collect(Collectors.toMap(Contact::getMobileNumber, contact -> contact));
        System.out.println(contactMap);
    }
}
