package ProjectCalculatorWithInnerClassConcpet;

import java.util.Scanner;

public class CalcOperations {

    private int addOperation() {
        System.out.println("Welcome in add operation");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value.");
        int a = sc.nextInt();
        System.out.print("Enter the second value.");
        int b = sc.nextInt();
        return a+b;
    }

    private long subOperation() {
        System.out.println("welcome in subtract operation");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value.");
        int a = sc.nextInt();
        System.out.print("Enter the second value.");
        int b = sc.nextInt();

        return a - b;
    }

    private long mulOperation() {
        System.out.println("welcome in multiplication operation");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value.");
        int a = sc.nextInt();
        System.out.print("Enter the second value.");
        int b = sc.nextInt();

        return a * b;
    }

    //Innerclass
    public class Inner01 {
        public void accessMethodInner() {
            System.out.println("welcome to inner class.");
            Scanner s = new Scanner(System.in);

            try {
                System.out.println("case 1 -> addOperation();\n" +
                                   "case 2 -> subOperation();\n" +
                                   "case 3 -> mulOperation();");

                System.out.print("Enter the option: ");
                int optionValue = s.nextInt();

                switch (optionValue) {
                    case 1 -> System.out.println(addOperation());
                    case 2 -> System.out.println(subOperation());
                    case 3 -> System.out.println(mulOperation());
                    default -> throw new IllegalStateException("Unexpected value: " + optionValue);
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Inner class work completed.");
            }

        }

    }
    //inner class end here.

}
