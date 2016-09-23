package proba.polimorf;


public class Main {

    static void draw(SolarSystem solarSystem) {
        solarSystem.drawSolarSystem();
    }

    public static void main(String[] args) {

        SolarSystem sun = new Sun();
        SolarSystem mercury = new Mercury();
        SolarSystem venus = new Venus();

        draw (sun);
        draw (mercury);
        draw(venus);

    }

}
