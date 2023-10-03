package LinkedList02WithInnerClassConcpetAlongTemplateClass;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Operations<Integer> s = new Operations<>();

        Operations<Integer>.Inner<Integer> s2 = s.new Inner<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your ID: ");
        s2.variableInner = sc.nextInt();
        System.out.println("Name stored is: "+s2.variableInner);

//        s2.accessMethodInner(); //inner class access method for outer class.

        //creating object of inner class in the heapSpace of outer class.
        Operations<Integer>.Inner<String> s3 = s.new Inner<>();
        System.out.print("Enter your name: ");
        s3.variableInner = sc.next();
        System.out.println("Name stored is: "+s3.variableInner);

        //creating object of inner class in the heapSpace of outer class.
        //Operations<String>.Inner s3 = s.new Inner();


//        s3.accessMethodInner(); //inner class access method for outer class.


    }
}
