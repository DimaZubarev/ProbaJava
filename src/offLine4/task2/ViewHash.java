package offLine4.task2;

import javax.swing.text.View;

public class ViewHash {

    private int currentIndex = 0;
    private View [] views = new View[10];

    public void addView(View view) {
        if (views != null) {
            int length = views.length;
            View [] tempViews = views;
            views = new View[length + 1];
            int i = 0;
            for (;i < tempViews.length; i++){
                views[i] = tempViews[i];
            }
            views[i+1] = view;
        }
        views[currentIndex] = view;
        currentIndex++;
    }
}
