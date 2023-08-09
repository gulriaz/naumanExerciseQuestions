package pk.gravity;

import java.util.Scanner;

public class Rough {
        public static void main(String[] args) {
int input1,input2,input3;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1st value: ");
            input1=sc.nextInt();
            System.out.println("Enter 2nd value: ");
            input2=sc.nextInt();
            System.out.println("Enter 3rd value: ");
            input3=sc.nextInt();

if(input1>(input2>input3?input2:input3)){
    System.out.println(input1);
}else System.out.println("input 1 is not larger.");

        }
}
