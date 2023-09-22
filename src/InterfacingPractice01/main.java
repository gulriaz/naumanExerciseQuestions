package InterfacingPractice01;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList() {{add(12);add(26);}};
        list.add(25);
        list.add(26);
        list.add(0);
        list.add(2);
        list.add(30);


        ISortable b = new BubbleSort();
        System.out.println(Arrays.toString(list.toArray()));
        b.sort(list); //complete array of list of passed.

        System.out.println();

        ISortable s = new SelectionSort();
        System.out.println(Arrays.toString(list.toArray()));
        s.sort(list); //complete array of list of passed.


    }
}
