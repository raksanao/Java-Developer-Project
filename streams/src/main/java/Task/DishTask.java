package Task;

import java.util.Comparator;

import static java.util.Comparator.comparing;

public class DishTask {
    public static void main(String[] args) {
//print all dishe's name that has less than 400 calories
DishData.getAll().stream().
        filter(i->i.getCalories()<400).
        map(Dish::getName).
    forEach(System.out::println);

        //print the length of the name of each dish
DishData.getAll().
        stream().
        map(i->i.getName()
                .length()).
        forEach(System.out::println);
        System.out.println("***************");

        //Print three high caloric dish name>300

DishData.getAll().stream().
        filter(i->i.getCalories()>300)
        .map(i->i.getName()).
        limit(3).
        forEach(System.out::println);
        System.out.println("*****************");
//print all dish name that are below 400 colories in sorted
DishData.getAll().stream().
        filter(i->i.getCalories()<400).
        sorted(comparing(Dish::getCalories)).
               map(Dish::getName).forEach(System.out::println);


    }
}
