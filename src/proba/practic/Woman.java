package proba.practic;


public class Woman extends Person {

    public Woman(Car car) {
        super(car);
    }
    @Override
    public void runDistance(int distance) {

        if (distance < 10){
            System.out.println("Run: " + RunTapes.BY_FOOT);
        }
        if (distance > 10 && distance <=500){
            System.out.println("Run: " + RunTapes.BY_CAR);
            System.out.println("Fuel spend:" + getCar().fuelNeeds());
        }
        if (distance > 501){
            System.out.println("Run: " + RunTapes.BY_PLANE);
        }
    }
}