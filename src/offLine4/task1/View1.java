package offLine4.task1;


import offLine4.task1.View;

public class View1 extends View {

    private boolean isShowing = false;

    @Override
    public void show() {
        if (isShowing) {
            System.out.println("Sorry, this View showing now");
        } else {
            System.out.println("showing View");
            isShowing = true;
        }
    }

        @Override
        public void hide () {
            if (!isShowing) {
                System.out.println("Sorry, this View showing is not");
            }else {
            System.out.println("hiding View");
                isShowing = false;
            }
    }

//    private void changeViewState(String message){
//
//        String hiding = "hiding";
//        String showing = "showing";
//        if (message.equals(showing) && isShowing || message.equals(hiding) && ){
//            System.out.println("Sorry, this View showing is " + message + " showing now");
//        }
//        else{
//                System.out.println(showing + ); }




    public  boolean isShowing(){
        System.out.println("View is " + (isShowing ? "showing" : "not showing"));
        return isShowing;}
}
