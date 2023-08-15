import java.util.Arrays;
import java.util.List;

public class StreamOperations {
    public static void main(String[] args) {
        List<Integer> myList= Arrays.asList(2,26,9,10,6,5,6,7,7);
      //  filter.forEach(x-> System.out.println(x));
       myList.forEach(System.out::println);
        System.out.println("Filtering ");
        //Filter
   myList
           .stream()
           .filter(i->i%2==0)
           .distinct()// it means show uniq one
           .forEach(System.out::println);



//        List<String>myList=Arrays.asList("Aziza","sofia","Amar","sofia","s","s");
//        myList.stream().filter(i->i.startsWith("s"))
//                .distinct().forEach(System.out::println);
//
//List<Integer>myList=Arrays.asList(6,3,30,40);
//myList.stream().limit(1).filter(i->i%3==0).forEach(System.out::println);

        //LIMIT
        System.out.println("LIMIT");
        myList.
                stream().
                limit(1).
                filter(i->i%2==0).
                forEach(System.out::println);

        System.out.println("SKIP");
        myList.stream()
                .filter(i->i%2==0).
                skip(2).
                forEach(System.out::println);
        //Map
        System.out.println("MAP");
        myList.stream()
                .map(number->number*2)
                .filter(i->i%3==0)
                .forEach(System.out::println);













    }
}
