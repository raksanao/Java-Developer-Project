import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(4,5,3,9);
int result= numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println(result);

        //no initial value
        Optional<Integer>result2=numbers.stream().reduce((a,b)->a+b);
        System.out.println( result2);

        //Max and min
      Optional<Integer> min= numbers.stream().reduce(Integer::min);
        System.out.println(min+" max");

        Optional<Integer>max=numbers.stream().reduce(Integer::max);
        System.out.println(max+" min");

        Optional<Integer>sum=numbers.stream().reduce(Integer::sum);
        System.out.println(sum+" sum");









    }
}
