import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// simple Person class
class person {
    int id;
    String name;

    // constructor
    person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // getter for id
    int getId() {
        return this.id;
    }

    // getter for name
    String getName() {
        return this.name;
    }
}

public class convertListToMap {
    public static void main(String[] args) {

        // list of person objects (note: id=3 appears twice)
        List<person> lst = new ArrayList<>(Arrays.asList(
                new person(1, "kanye"),
                new person(2, "drake"),
                new person(3, "kendrick"),
                new person(3, "cole")
        ));

        // convert list to map using stream
        // key = id, value = name
        // merge function handles duplicate keys (keeps the duplicate)
        Map<Integer, String> map = lst.stream()
                .collect(Collectors.toMap(
                        person::getId,                 // map key
                        person::getName,               // map value
                        (existing, duplicate) -> duplicate // handle duplicate id
                ));

        // print the map
        // map.forEach((k, v) -> System.out.println(k + "-" + v));
        for(Map.Entry<Integer, String> mp : map.entrySet())
        {
            System.out.println(mp.getKey()+" -> "+mp.getValue());
        }
    }
}
