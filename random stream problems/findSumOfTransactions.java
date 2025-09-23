//Given a list of transactions, find the sum of transaction amounts for each day using Java streams

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Transaction {
    String date;
    int amount;

    Transaction(String date, int amount) {
        this.date = date;
        this.amount = amount;
    }

    String getDate() {
        return this.date;
    }

    int getAmount() {
        return this.amount;
    }

}

public class findSumOfTransactions {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("2022-01-01", 100),
                new Transaction("2022-01-01", 200),
                new Transaction("2022-01-02", 300),
                new Transaction("2022-01-02", 400),
                new Transaction("2022-01-03", 500));

        Map<String, Integer> res = transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getDate, Collectors.summingInt(Transaction::getAmount)));
        res.forEach((s, s1) -> System.out.println(s + " " + s1));

    }
}
