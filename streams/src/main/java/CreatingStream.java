import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {
    public static void main(String[] args) {
        //Creating stream from Array
        String name[]={"aziza","sofia","layla"};
       Stream<String> names= Arrays.stream(name);

       // Creating stream from collection
        List<String>nameList=Arrays.asList("Java","DataStructure","spring");
   Stream<String>nameList2 =nameList.stream();

List<Course>myCourses=Arrays.asList(new Course("Java",100),
        new Course("Payton", 200),
        new Course("JavaScript", 300));
        Stream<Course> myCourcesStream = myCourses.stream();

//Creating Stream from Values
        Stream<Integer>stream=Stream.of(1,2,3,4);











    }
}
