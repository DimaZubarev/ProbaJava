package proba.practic;

public class BeerSong{
    public static void main(String[] args) {
        int beerNut = 99;
        String bottle = "пляшок";
        while (beerNut > 0){
            //if (beerNut == 1){ bottle = "пляшка";}
            System.out.println(beerNut + " " + bottle + " " + "пива на стені");
            System.out.println(beerNut + " " + bottle + " " + "пива");
            System.out.println("Возьми одну");
            System.out.println("Пусти по колу");
            beerNut = beerNut - 1;
            if (beerNut > 0){
                System.out.println(beerNut + " " + bottle + "пива на стені");}
                else {System.out.println("Нема більше пляшок пива на стені");}

        }
    }
}





