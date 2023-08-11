package AssignmentFourLoops;

import java.util.Scanner;

public class LoopsMain {
    public static void main(String[] args) {

        //question12



        //question11
        /*LoopSideClass l = new LoopSideClass();
        Scanner sc = new Scanner(System.in);

        while (l.getStringValueUserInput()=='y' || l.getStringValueUserInput()=='Y') {
            System.out.print("Enter a value? ");
            l.setIntValueUserInput(sc.nextInt());

            switch (l.getIntValueUserInput() == 0 ? l.getIntValueUserInput() : (l.getIntValueUserInput() > 0 ? 1 : -1)) {
                case 0 -> l.setCounterZeroValues(l.getCounterZeroValues() + 1);
                case 1 -> l.setCounterPositiveValues(l.getCounterPositiveValues() + 1);
                case -1 -> l.setCounterNegativeValues(l.getCounterNegativeValues() + 1);
                default -> System.out.println("invalid values");
            }
            System.out.print("Want to continue? press y  ");
            l.setStringValueUserInput(sc.next().charAt(0));
        }
        System.out.print(" --------------------------------");
        System.out.printf("Total number of zeros'     : %d",l.getCounterZeroValues());
        System.out.println();
        System.out.printf("Total number of positives' : %d",l.getCounterPositiveValues());
        System.out.println();
        System.out.printf("Total number of negatives' : %d",l.getCounterNegativeValues());*/

        //question10
        /*LoopSideClass l = new LoopSideClass();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value for the table you want to display? ");
        l.setMultiplicationTable(sc.nextInt());
        System.out.print("Enter the table range you want to display? ");
        l.setMultiplicationRange(sc.nextInt());
        int i=1;
        while (i<=l.getMultiplicationRange()){
            l.setMultiplicationResult(l.getMultiplicationTable()*i);

            switch ((l.isDivisibleBy(l.getMultiplicationResult()))?l.getMultiplicationResult():0) {
                case 0 -> System.out.println("Not divisible by five: invalid result.");
                default->
                {System.out.printf("%d x %d = %d", l.getMultiplicationTable(), i, l.getMultiplicationResult());
                    System.out.println();}}

            i++;
        }*/

        //question9
        /*LoopSideClass l = new LoopSideClass();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value for the table you want to display? ");
        l.setMultiplicationTable(sc.nextInt());
        int i=1;
        while (i<=12){
            l.setMultiplicationResult(l.getMultiplicationTable()*i);

        switch ((l.isDivisibleBy(l.getMultiplicationResult()))?l.getMultiplicationResult():0) {
            case 0 -> System.out.println("Not divisible by five: invalid result.");
            default->
            {System.out.printf("%d x %d = %d", l.getMultiplicationTable(), i, l.getMultiplicationResult());
            System.out.println();}}

            i++;
        }*/

        //question8
        /*LoopSideClass l = new LoopSideClass();
        Scanner sc = new Scanner(System.in);
        int i,j=1,k=1;
        System.out.print("Enter an integer value: ");
        i=sc.nextInt();
        while (j<=3){
            k=i*k;
            j++;
        }
        System.out.printf("cube of an integer(%d) is: %d",i,k);*/

        //question7
        /*LoopSideClass l = new LoopSideClass();
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int i=1;
        while (i<=10){
            switch (i) {
                case 1 ->{
                System.out.printf("Enter %dst value: ", i);
                l.valueUserInput = sc.nextInt();
                sum = sum + l.valueUserInput;
            } case 2 -> {
                System.out.printf("Enter %dnd value: ", i);
                l.valueUserInput = sc.nextInt();
                sum = sum + l.valueUserInput;
            } case 3 -> {System.out.printf("Enter %drd value: ", i);
                    l.valueUserInput = sc.nextInt();
                    sum = sum + l.valueUserInput;
                }
                default -> {System.out.printf("Enter %dth value: ", i);
                    l.valueUserInput = sc.nextInt();
                    sum = sum + l.valueUserInput;
                }
            }

            i++;
        }
        i=i-1;
        System.out.printf("Total numbers(%d) and their sum is: %d",i,sum);
        System.out.println();
        System.out.printf("Total numbers(%d) and their avg is: %.2f",i,(float)(sum/i));*/

        //question6
        /*LoopSideClass l = new LoopSideClass();
        Scanner sc = new Scanner(System.in);

        int i=1;
        while (i<=10){
            int squareResult=i*i;
            System.out.printf("number(%d) square is: %d",i,squareResult);
            System.out.println();
            i++;
        }*/


        //question5
/*
        LoopSideClass loop = new LoopSideClass();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value you to find a factorial: ");
        loop.setFactorialUserInputInt(sc.nextInt());
        int userRequestedFactorialIntValue = loop.getFactorialUserInputInt();
        int i = 1;
        while (loop.getFactorialUserInputInt()>=i){
                    loop.setProductOfNaturalNumbers(loop.getFactorialUserInputInt()*loop.getProductOfNaturalNumbers());
            loop.setFactorialUserInputInt(loop.getFactorialUserInputInt()-1);
        }
        System.out.printf("factorial(%d) is: %d",userRequestedFactorialIntValue,loop.getProductOfNaturalNumbers());
*/

        //question4
        /*LoopSideClass loop = new LoopSideClass();
        int i = 1;
        while (i <= 10) {
            int oldSum = loop.getSumOfNaturalNumbers();
            if(!((i%2)==0)) {
                loop.setSumOfNaturalNumbers(loop.getSumOfNaturalNumbers() + i);
                System.out.println("Sum of " + i + " and " + oldSum + " is: " + loop.getSumOfNaturalNumbers());
            }
            i++;
        }*/

        //question3
        /*LoopSideClass loop = new LoopSideClass();
        int i = 1;
        while (i <= 10) {
            int oldSum = loop.getSumOfNaturalNumbers();
            loop.setSumOfNaturalNumbers(loop.getSumOfNaturalNumbers() + i);
            System.out.println("Sum of " + i + " and " + oldSum + " is: " + loop.getSumOfNaturalNumbers());
            i++;
        }*/

        //question2
        /*LoopSideClass loop = new LoopSideClass();
        int i = 1;
        while (i <= 10) {
            loop.setSumOfNaturalNumbers(loop.getSumOfNaturalNumbers() + i);
            i++;
        }
        System.out.println("Sum of first 10 natural numbers are: " + loop.getSumOfNaturalNumbers());*/

        //question1
        /*int i=1;
        while (i <=10) {
            System.out.println("Natural number: "+i);
            i++;
        }*/


    }
}
