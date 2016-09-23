package proba.exetpleInterface;


public class Truck implements FreightCar {

    private int numberOfPassengers;
    private  int cargoWeight;

    public Truck(int numberOfPassengers, int cargoWeight) {
        this.numberOfPassengers = numberOfPassengers;
        this.cargoWeight = cargoWeight;
    }

    @Override
    public void transportFreight() {
        System.out.println("Я перовужи вантажі");
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }
}
