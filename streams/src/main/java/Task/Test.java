package Task;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class Test {
    public static void main(String[] args) {
        List<Dish> menu= Arrays.asList(
                new Dish("pork",false,800,Type.MAET),
                new Dish("beef",false,700,Type.MAET),
                new Dish("chicken",false,400,Type.MAET),
                new Dish("fries",true,530,Type.MAET),
                new Dish("rice",true,350,Type.MAET),
                new Dish("fruit",true,120,Type.MAET),
                new Dish("pizza",true,550,Type.MAET),
                new Dish("prawns",false,300,Type.MAET),
                new Dish("salmon",false,450,Type.MAET)) ;
      //print all dishes name that has less than 400 calories
        menu.stream().filter(i->i.getCalories()<400).map(Dish::getName).
    forEach(System.out::println);

        //print the length of the name of each dish
        menu.stream().map(i->i.getName().length()).forEach(System.out::println);
        System.out.println("***************");

        //Print three high caloric dish name>300

        menu.stream().filter(i->i.getCalories()>300).map(i->i.getName()).limit(3).forEach(System.out::println);
        System.out.println("*****************");
//print all dish name that are below 400 colories in sorted
        menu.stream().filter(i->i.getCalories()<400).sorted(comparing(Dish::getCalories)).
                map(Dish::getName).forEach(System.out::println);






    }
}
