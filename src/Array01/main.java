package Array01;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        CArray<String> c = new CArray<>();
        Scanner sc = new Scanner(System.in);
        ArrayList<String> str = new ArrayList<>();

        System.out.println("Welcome!");
//        System.out.print("Enter your name: ");
//        str.add(0,sc.next());
        str.add(0,"Gulraiz");
        c.setNameStu(str); // this str here have name only, but will be updated at line 20. new element added.

//        String s=sc.nextLine();

//        System.out.print("Enter your rollNumber: ");
//        str.add(0,sc.next()); // move previous value to index 1.
        str.add(0,"09cs47");
//        sc.remove();
        c.setRegNumber(str); // this str contains both name and roll number.

        System.out.println("Data Saved: ");
        System.out.println("Reg No.: "+c.getRegNumber().get(0));
        System.out.println("Name: "+c.getNameStu().get(1));
    }
}
