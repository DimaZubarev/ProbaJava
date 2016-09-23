package proba.practic;


public class Man extends Person {

    public Man(Car car) {
        super(car);
    }

    @Override
    public void runDistance(int distance) {

        if (distance <= 15){
            System.out.println("Run: " + RunTapes.BY_FOOT);
        }
        if (distance > 16 && distance <=800){
            System.out.println("Run: " + RunTapes.BY_CAR);
            System.out.println("Fuel spend:" + getCar().fuelNeeds());
        }
        if (distance > 801){
            System.out.println("Run: " + RunTapes.BY_PLANE);
        }
    }

}
