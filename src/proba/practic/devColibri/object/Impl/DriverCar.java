package proba.practic.devColibri.object.Impl;

import proba.practic.devColibri.object.objPerson.Person1;

public class DriverCar implements Driver, Transport {

    private String categori;
    private int speed = 60;
    private Person1 person1;

    @Override
    public void categori (String b) {
        this.categori = b;
        person1 = new Person1("Bim", "Bom", 32, null);
    }

    @Override
    public void go() {
        if(person1 != null){
            System.out.println("Go");
        } else {
            System.out.println("Stop!!! Don`t driver");
        }
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
