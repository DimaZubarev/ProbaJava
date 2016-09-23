package proba.exetpleInterface;

public class Main {
    public static void main(String[] args) {

        PassengerAuto Volvo = new Sedan(4, 200);
        FreightCar Man = new Truck(2, 10000);
        Pickup WV = new Pickup(4, 700);

        Volvo.transportPassenger();
        Man.transportFreight();
        WV.transportFreight();
        WV.transportPassenger();
    }
}
