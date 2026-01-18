// Group users by age

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Users {
    private String name;
    private int age;

    Users(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}

public class groupUsersByAge {
    public static void main(String[] args) {

        List<Users> lst1 = Arrays.asList(new Users("muskan", 26), new Users("prateek", 26),
                new Users("ankit", 28), new Users("siraj", 28));

        Map<Integer, List<Users>> map = lst1.stream().collect(Collectors.groupingBy(Users::getAge));

        for (Map.Entry<Integer, List<Users>> entry : map.entrySet()) {
            Integer age = entry.getKey();
            List<Users> lst = entry.getValue();

            System.out.println(age + " ");
            for (Users u : lst) {
                System.out.println(u.getName());
            }
        }

    }
}
