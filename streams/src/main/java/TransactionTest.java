import java.util.Comparator;
import java.util.Optional;

import static java.util.Comparator.comparing;

public class TransactionTest {
    public static void main(String[] args) {
//TASK

        //1. Find all transaction in 2011 and sort by value
TransactionData.getAll().stream().
        filter(transaction -> transaction.
                getYear()==2011).
        sorted(comparing(Transaction::getValue)).forEach(System.out::println);

//2. What are all the unique cities where the trades work
        System.out.println("************TASK 2************");

TransactionData.getAll().
        stream().
        map(transaction -> transaction.
                getTrader().
        getCity()).distinct().
        forEach(System.out::println);

//3. find all traders from Cambrage and sort them by name

        TransactionData.getAll()
                .stream()
                .map(Transaction::getTrader).
                filter(trader -> trader.getCity().equals("TJ")).
                distinct().sorted(comparing(Trader::getName)).forEach(System.out::println);

        //4. return a string of all traders names sorted alphabeticlly
     String result=   TransactionData.getAll().stream().map(transaction->transaction.getTrader().
                getName()).distinct().sorted().reduce(" ",(name1,name2)->name1+name2+" ");
        System.out.println(result);

        //5. Are any traders based in SC
        System.out.println("************Task5***********");

       boolean basedonSC= TransactionData.getAll().stream().
               allMatch(transaction -> transaction.getTrader().
                       getCity().equals("SC"));
        System.out.println(basedonSC);

        //6. Print the values of all transaction from traders living in tx
        TransactionData.getAll().stream().filter(transaction -> transaction.
                getTrader().getCity().equals("TX")).map(Transaction::getValue).forEach(System.out::println);


//7. What is the highers value of all the transactions
        System.out.println("********Task7***********");
        Optional<Integer>high=TransactionData.getAll().stream().map(Transaction::getValue).
                reduce(Integer::max);
        System.out.println("high = " + high);


//8. Find the transaction with smallest value
        Optional<Integer>small=TransactionData.getAll().
                stream().
                map(Transaction::getValue).
                reduce(Integer::min);
        System.out.println("small = " + small);
        
Optional<Transaction>smallValue=TransactionData.getAll().stream().reduce((t1,t2)->t1.getValue()<t2.getValue()?t1:t2);
        System.out.println(smallValue.get());
        System.out.println("another one ");
        
        Optional<Transaction>smallesValue=TransactionData.getAll().stream().min(comparing(Transaction::getValue));
        System.out.println("smallesValue = " + smallesValue);

        System.out.println(smallValue.get());
        

        


    }

}
