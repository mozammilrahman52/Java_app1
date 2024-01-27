package CompanyInter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Transaction {
//     Assuming you have a Transaction class with fields like:
     private String name;
     private int year;
     private int amount;

    // ... constructor and getters
    public Transaction(String name, int year, int amount) {
        this.name = name;
        this.year = year;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getAmount() {
        return amount;
    }


    @Override
    public String toString() {
        return "Transaction{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", amount=" + amount +
                '}';
    }
}

class TransactionSortingExample {
    public static void main(String[] args) {
        // Assuming you have Transaction objects and a list as given in the question
        List<Transaction> transactions = Arrays.asList(
                new Transaction("brian", 2011, 300),
                new Transaction("raoul", 2012, 1000),
                new Transaction("raoul", 2011, 400),
                new Transaction("mario", 2012, 710),
                new Transaction("mario", 2012, 700),
                new Transaction("alan", 2012, 950)
        );

        // Sorting based on the year 2011
        List<Transaction> sortedTransactions = transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getAmount))
                .collect(Collectors.toList());

        // Displaying the sorted transactions for the year 2011
        sortedTransactions.forEach(System.out::println);
        System.out.println("==========================");

        List<Transaction> sortedTran = transactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getAmount))
                .collect(Collectors.toList());

        // Displaying the sorted transactions based on the amount
        sortedTran.forEach(System.out::println);
    }
}

