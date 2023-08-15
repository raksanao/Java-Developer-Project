import java.util.Arrays;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        //Given a list of words, print the number of characters for each word
        List<String> words= Arrays.asList("Java","Apple","Honda","Developers");
        words.stream().map(i->i.length()).forEach(System.out::println);


    }
}
