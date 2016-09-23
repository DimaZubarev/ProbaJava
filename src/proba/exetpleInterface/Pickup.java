package proba.exetpleInterface;


public class Pickup implements PassengerAuto, FreightCar {

    private int numberOfPassengers;
    private  int cargoWeight;

    public Pickup(int numberOfPassengers, int cargoWeight) {
        this.numberOfPassengers = numberOfPassengers;
        this.cargoWeight = cargoWeight;
    }

    @Override
    public void transportPassenger() {
        System.out.println("Я перевожу людей");

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
