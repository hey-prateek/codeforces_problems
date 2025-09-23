//Calculate the average age of a list of Person objects using Java streams

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }
}

public class findAverageAge {
    public static void main(String[] args) {
        List<Person> lst = new ArrayList<>(
                Arrays.asList(new Person("prateek", 26), new Person("Bob", 27), new Person("Alice", 28)));
        System.out.print(lst.stream().mapToInt(s -> s.getAge()).average());
    }
}
