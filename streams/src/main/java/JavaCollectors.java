import java.util.*;
import java.util.stream.Collectors;

public class JavaCollectors {
    public static void main(String[] args) {
        //toCollection(Supplire):is used to create a collection using collector

        System.out.println("*********ToCollection*********");
        List<Integer> numbers= Arrays.asList(3,4,5,6,6,7);

      List<Integer> numberList= numbers.stream().
                filter(x->x%2==0).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(numberList);
      Set<Integer>numberSet=numbers.stream().filter(x->x%2==0).collect(Collectors.toCollection(HashSet::new));
        System.out.println(numberSet);

        System.out.println("*******ToList*********");
        //toList: returns a collector interface that gathers the input data into a new list

List<Integer>numberList2=numbers.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(numberList2);
        
        //toSet: returns a Collector interface that gathers the input data into a new set
        System.out.println("*******toSet**********");
        Set<Integer>numberSet2=numbers.stream().filter(x->x%2==0).collect(Collectors.toSet());
        System.out.println("numberSet2 = " + numberSet2);

//toMap(Function,Function):returns a Collector interface that gather the input data into a new map

        System.out.println("********ToMap********");

Map<String,Integer>dishMap=DishData.getAll().stream().
        collect(Collectors.toMap(Dish::getName,Dish::getCalories));

        System.out.println("dishMap = " + dishMap);






        //counting():return a collector that count the number of the elements
       Long evenCount= numbers.stream().filter(x->x%2==0).collect(Collectors.counting());

        System.out.println("evenCount = " + evenCount);
        
        
        
        //sumingInt(toIntFunction):returns a Collector that produces the sum of integer-values func
        Integer sum=DishData.getAll().stream().collect(Collectors.summingInt(Dish::getCalories));
        System.out.println("sum = " + sum);

        //averageInt(ToIntFunction):returns the avarage of the integer passed values
       Double calories= DishData.getAll().stream().
               collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println("calories = " + calories);


        System.out.println("******Joining********");
        //joinging():is used to join variouse elements of a character or string array into a single string object
        List<String>cources=Arrays.asList("Java","JS","TS");
        
       String stre= cources.stream().collect(Collectors.joining(","));
        System.out.println(stre);
        //partioningBy(): is used to partition a stream of objects(or set of elements)based on a given predicate
        
      Map<Boolean,List<Dish>>  vaggieDish=DishData.getAll().stream().collect(Collectors.partitioningBy(Dish::isVegetarian));

        System.out.println("vaggieDish = " + vaggieDish);


        System.out.println("*******Grouping by********");
        
        Map<Type,List<Dish>>dishType=DishData.getAll().stream().collect(Collectors.groupingBy(Dish::getType));
        System.out.println("dishType = " + dishType);




    }
}
