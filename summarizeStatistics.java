// Summarizing Statistics

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class summarizeStatistics {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5, 6);

        IntSummaryStatistics sum = lst.stream().mapToInt(Integer::intValue).summaryStatistics();

        System.out.print(sum);
    }
}
