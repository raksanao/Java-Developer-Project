import java.util.Arrays;
import java.util.List;

public class TransactionData {
    public  static List<Transaction> getAll(){
        Trader maya=new Trader("Maya","NY");
        Trader faya=new Trader("Faya","SC");
        Trader ruxa=new Trader("Ruxa","TX");
        Trader azize=new Trader("Aziza","TJ");
        return Arrays.asList(new Transaction(maya,1995,27),
                  new Transaction(maya,2011,27),
                   new Transaction(faya,1988,35),
                new Transaction(ruxa,1987,37),
                new Transaction(azize,1991,33),
                new Transaction(maya,1995,27)


        );
    }

}
