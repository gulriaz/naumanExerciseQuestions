package MushtaqBhai;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RoughMushtaqMain {
    public static void main(String[] args) {

        ArrayList <String> stuNameIUB= new ArrayList<String>(20);

        stuNameIUB.add("Mushtaq");
        stuNameIUB.add("Irfan");

        System.out.println("stuNames size: "+stuNameIUB.size());
        System.out.println("stuName index: "+stuNameIUB.indexOf("Irfan"));
        System.out.println(stuNameIUB);
        System.out.println("=====================================");
        ArrayList<String> stuUOL = new ArrayList<String>(stuNameIUB.size());
        stuNameIUB.add("Gulraiz");
        stuUOL.addAll(stuNameIUB);

        System.out.println("stuNames size: "+stuUOL.size());
        System.out.println("stuName index: "+stuUOL.indexOf("Irfan"));
        System.out.println(stuUOL);






        /*Scanner sc = new Scanner(System.in);

        int[][] rollNumber = new int[2][];

        for (int i = 0; i < rollNumber.length; i++) {
            if(i==0) {
                System.out.println("Enter no. of admissions BS program: ");
            }else System.out.println("Enter no. of admissions MS program: ");

                int admission = sc.nextInt();

                rollNumber[i] = new int[admission];

            }


        for (int i = 0; i < rollNumber.length; i++) {
            for (int j = 0; j < rollNumber[i].length; j++) {
                if(i==0) {
                    System.out.print("Enter no. of admissions BS program: ");

                    rollNumber[i][j]=sc.nextInt();

                }else {
                    System.out.print("Enter no. of admissions MS program: ");
                    rollNumber[i][j]=sc.nextInt();

            }}}




        for (int i = 0; i < rollNumber.length; i++) {
            for (int j = 0; j < rollNumber[i].length; j++) {
                if(i==0) {
                    System.out.println("Admissions BS program: ");

                    System.out.println("show: "+rollNumber[i][j]);

                }else {
                    System.out.println("Admissions MS program: ");
                System.out.println("show: "+rollNumber[i][j]);}



            }}*/











        /*int[][] rollNumber = new int[2][2];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < rollNumber.length; i++) {
            for (int j = 0; j < rollNumber[i].length; j++) {
            System.out.print("Enter value: ");
            rollNumber[i][j] =sc.nextInt();
            System.out.println("saved.");
        }}

            for (int i = 0; i < rollNumber.length; i++) {
                for (int j = 0; j < rollNumber[i].length; j++) {

//                    String valueSaved=Arrays.toString(new int[] {rollNumber[i][j]});

//                    System.out.println("show: "+valueSaved);

                    System.out.println("show: "+rollNumber[i][j]);

        }
            }*/

    }
}


