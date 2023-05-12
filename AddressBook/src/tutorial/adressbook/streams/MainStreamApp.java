package tutorial.adressbook.streams;

import tutorial.adressbook.entity.Contact;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStreamApp {
    public static void main(String[] args) {
        List<Integer> integers = List.of(2, 6, 3, 4, 8, 9, 11, 23);

        //add only even numbers into another list
        List<Integer> evens = new ArrayList<>();
        for (Integer integer : integers) {
            if (integer % 2 == 0) {
                evens.add(integer);
            }
        }
        System.out.println(evens);

        //using streams
        evens = integers.stream().filter(integer -> integer % 2 == 0).toList();
        System.out.println(evens);

        //multiply each element with 2
        List<Integer> odds = integers.stream().map(ele -> multiply(ele)).toList();
        System.out.println(odds);

        //limit generated list to 100
        Stream<Double> limits = Stream.generate(Math::random).limit(10);
        System.out.println(limits.toList());

        //skips one element and prints rest
        System.out.println(integers.stream().skip(1).toList());

        //take elements until divisible by 2
        System.out.println(integers.stream().takeWhile(ele -> ele % 2 == 0).collect(Collectors.toList()));

        //drop elements until divisible by 2
        System.out.println(integers.stream().dropWhile(ele -> ele % 2 == 0).collect(Collectors.toList()));

        //remove duplicates
        Stream<String> strings = Stream.of("Aline", "Aline", "Alina", "Alex", "Julian");
        System.out.println(strings.distinct().collect(Collectors.toList()));

        //sort on length
        Stream<String> strings1 = Stream.of("Aline", "Alina", "Alex", "Julian");
        System.out.println(strings1.sorted(Comparator.comparing(String::length)).collect(Collectors.toList()));

        //join each value as string by comma separated
        Stream<String> strings2 = Stream.of("Aline", "Alina", "Alex", "Julian");
        System.out.println(strings2.sorted(Comparator.comparing(String::length)).collect(Collectors.joining(";")));

        //dealing with nested collections
        List<List<Integer>> numberLists = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9)
        );

        List<Integer> flattenedList = numberLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(flattenedList);

        //create a map from list of Contacts
        List<Contact> contacts = List.of(new Contact("Alex", 1234), new Contact("Blex", 1236));
        Map<Integer, Contact> collected = contacts.stream().collect(Collectors.toMap(Contact::getMobileNumber, e -> e));
        System.out.println(collected);
    }

    private static Integer multiply(Integer ele) {
        return ele * 2;
    }

}
