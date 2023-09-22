package InterfacingPractice01;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort implements ISortable{


    @Override
    public void sort(ArrayList<Integer> l) {
        l.sort(null);
        System.out.println("ISortable Interface>>> calling bubbleSort method.");
        System.out.println(Arrays.toString(l.toArray()));
    }
}
