// How to convert a List of objects into a Map by considering duplicated keys and store them in
// sorted order

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

class Person {
    String city;
    String name;

    Person(String city, String name) {
        this.city = city;
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }
}

public class problem17 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Delhi", "Amit"),
                new Person("Mumbai", "Prateek"),
                new Person("Delhi", "Muskan"),
                new Person("Bangalore", "Ravi"),
                new Person("Mumbai", "Rahul"));

        Map<String, List<String>> map = people.stream().collect(Collectors.groupingBy(
                Person::getCity,
                TreeMap::new,
                Collectors.mapping(Person::getName, Collectors.toList())));

        System.out.println(map);

    }
}