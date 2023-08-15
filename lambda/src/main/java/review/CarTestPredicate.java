package review;

public class CarTestPredicate implements  CarPredicate {

    @Override
    public boolean test(Car car) {
        return car.getTopSpeed()>160;
    }

}
