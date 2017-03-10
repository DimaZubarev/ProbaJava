package praktik_Schildt.glava7_classesAndMethods.boxs;

public class Box {
    private double weidth;
    private double heidth;
    private double depth;

    public Box(double weidth, double heidth, double depth) {
        this.weidth = weidth;
        this.heidth = heidth;
        this.depth = depth;
    }
    public Box(){
//        weidth = -1;
//        heidth = -1;
//        depth = -1;
    }
    public Box(Box box){
        weidth = box.weidth;
        heidth = box.heidth;
        depth = box.depth;
    }
    public Box(double len){
         weidth = heidth = depth = len;
    }
    double volume(){
        return weidth * heidth * depth;
    }
}
