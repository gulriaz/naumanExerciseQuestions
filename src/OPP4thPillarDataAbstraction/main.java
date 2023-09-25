package OPP4thPillarDataAbstraction;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class main {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        DateTimeFormatter timeFormated = DateTimeFormatter.ofPattern("HH:mm:ss");
        String Newtime=time.format(timeFormated);
        System.out.println(date+"\n"+Newtime);

        HashSet<String> h = new HashSet<>();
        h.add("Electronics");
        h.add("Electronics");
        System.out.println(h);

        HashMap<Integer,String> hM = new HashMap<>();

        hM.put(75,"Berlin");
        hM.put(null,null);
        hM.put(null,null);
        System.out.println(hM);

        Hashtable<Integer,String> hT = new Hashtable<>();

        hT.put(75,"Berlin");
        hT.put(8,"null");
        System.out.println(hT);


        System.out.println();
        CSound t = new stero();
        t.Alist = new Stack();

        t.Alist.add("Stero");
        t.Alist.add("Stero");
        t.Alist.add(30);

        System.out.println(t.Alist);

        CSound m = new mono();
        m.sound();
        m.Alist = new LinkedList();
        m.Alist.add("Ali");
        m.Alist.add(25);

        m.name = "Ali";
        System.out.println(m.name);

        System.out.println(m.Alist);



    }


}

