package InterfacingPractice01;

import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort implements ISortable{
    @Override
    public void sort(ArrayList<Integer> l) {
        l.sort(null);
        System.out.println("ISortable Interface>>> calling selectionSort method.");
        System.out.println(Arrays.toString(l.toArray()));
    }
}
