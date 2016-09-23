package offLine4.task1;


public class Square extends View {

    private int counter = 0;
    @Override
    public void show() {
        System.out.println("New square " + counter + " showing");
        counter++;
    }

    @Override
    public void hide() {
        if (counter <= 0) {
            System.out.println("Sorry there is no any square");
        }else {
            System.out.println("Sqare " + counter + " hide");
           counter--;
        }

    }
}
