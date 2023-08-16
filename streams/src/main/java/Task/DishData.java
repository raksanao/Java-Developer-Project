package Task;

import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;

public  class DishData {
   // public static void main(String[] args) {
       public static List<Dish> getAll() {
           return Arrays.asList(
                   new Dish("pork", false, 800, Type.MEAT),
                   new Dish("beef", false, 700, Type.MEAT),
                   new Dish("chicken", false, 400, Type.MEAT),
                   new Dish("fries", true, 530, Type.MEAT),
                   new Dish("rice", true, 350, Type.MEAT),
                   new Dish("fruit", true, 120, Type.MEAT),
                   new Dish("pizza", true, 550, Type.MEAT),
                   new Dish("prawns", false, 300, Type.MEAT),
                   new Dish("salmon", false, 450, Type.MEAT));

//      //print all dishes name that has less than 400 calories
//       getAll().stream().filter(i->i.getCalories()<400).map(Dish::getName).
//    forEach(System.out::println);
//
//        //print the length of the name of each dish
//       getAll().stream().map(i->i.getName().length()).forEach(System.out::println);
//        System.out.println("***************");
//
//        //Print three high caloric dish name>300
//
//      getAll().stream().filter(i->i.getCalories()>300).map(i->i.getName()).limit(3).forEach(System.out::println);
//        System.out.println("*****************");
////print all dish name that are below 400 colories in sorted
//      getAll().stream().filter(i->i.getCalories()<400).sorted(comparing(Dish::getCalories)).
//                map(Dish::getName).forEach(System.out::println);
//
    }
}
