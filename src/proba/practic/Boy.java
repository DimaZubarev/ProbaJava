package proba.practic;

public class Boy extends Man{

    public Boy(Car car) {
        super(car);
    }

    @Override
    public void runDistance(int distance) {
        if (distance <= 12){
            System.out.println("Run: " + RunTapes.BY_FOOT);
        }
        if (distance > 16 && distance <=550){
            System.out.println("Run: " + RunTapes.BY_CAR);
            System.out.println("Fuel spend:" + getCar().fuelNeeds());
        }
        if (distance >= 551){
            System.out.println("Run: " + RunTapes.BY_PLANE);
        }
    }
}