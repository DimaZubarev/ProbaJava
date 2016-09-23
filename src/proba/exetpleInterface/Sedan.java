package proba.exetpleInterface;


public class Sedan implements PassengerAuto {

    private int numberOfPassengers;
    private  int cargoWeight;

    public Sedan(int numberOfPassengers, int cargoWeight) {
        this.numberOfPassengers = numberOfPassengers;
        this.cargoWeight = cargoWeight;
    }

    @Override
    public void transportPassenger() {
        System.out.println("Я перевожу людей");
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }
}
