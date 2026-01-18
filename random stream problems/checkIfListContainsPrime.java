//Check if a list of integers contains a prime number using Java streams

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class checkIfListContainsPrime {
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7, 8, 9, 10));
        // int res=lst.stream().filter(s -> isPrime(s)).findFirst().orElse(0);
        Boolean res = lst.stream().anyMatch(s -> isPrime(s));
        System.out.print(res);

    }
}
