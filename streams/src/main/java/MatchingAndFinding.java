import java.util.Optional;

public class MatchingAndFinding {
    public static void main(String[] args) {
        boolean isHealthy = DishData.getAll().stream().allMatch(dish -> dish.getCalories() < 1000);
        System.out.println(isHealthy);


        //ANY MATCH

        if (DishData.getAll().stream().anyMatch(Dish::isVegetarian))
            System.out.println("The menu vegitarian friendly" +
                    "");



        //None match
    boolean isHealthey2 = DishData.getAll().stream().noneMatch(dish->dish.getCalories()>=1000);
        System.out.println(isHealthey2);

        //find anydata
     Optional<Dish> dish= DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish.get());

        //find first

        Optional<Dish> dish2= DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(dish2);






    }
}
