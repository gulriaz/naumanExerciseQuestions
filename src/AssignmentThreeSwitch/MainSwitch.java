package AssignmentThreeSwitch;

import java.util.Scanner;

public class MainSwitch {
    public static void main(String[] args) {

        //question9
        SwitchAssignment s = new SwitchAssignment();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first operand: ");
        s.setOperand1(sc.nextInt());
        System.out.print("Enter a second operand: ");
        s.setOperand2(sc.nextInt());
        System.out.print("Enter your operator: ");
        s.setOperator(sc.next().charAt(0));

        switch (s.getOperator()){
            case '+' -> System.out.println((float)(s.getOperand1()+s.getOperand2()));
            case '-' -> System.out.println((float)(s.getOperand1()-s.getOperand2()));
            case '*' -> System.out.println((float)(s.getOperand1()*s.getOperand2()));
            case '/' -> System.out.println((float)(s.getOperand1()/s.getOperand2()));
            case '%' -> System.out.println((float)(s.getOperand1()%s.getOperand2()));
            default -> throw new IllegalArgumentException("invalid operator");
        }

        //question8
        /*SwitchAssignment s = new SwitchAssignment();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number value for a: ");
        s.setQuadraticEquationVariableA(sc.nextFloat());
        System.out.print("Enter number value for b: ");
        s.setQuadraticEquationVariableB(sc.nextFloat());
        System.out.print("Enter number value for c: ");
        s.setQuadraticEquationVariableC(sc.nextFloat());
        //b value set to square
        s.setQuadraticEquationVariableBSquare(s.quadraticEquationSquare(s.getQuadraticEquationVariableB()));
        //setting discriminant b2-4ac
        s.setQuadraticEquationDiscriminant(s.getQuadraticEquationVariableBSquare() - (4 * (s.getQuadraticEquationVariableA() * s.getQuadraticEquationVariableC())));
        //setting Discriminant to 1,0 ,-1; using Integer.signum() func
        s.setQuadraticEquationDiscriminantToZeroOneAndMinusOne(Integer.signum((int)s.getQuadraticEquationDiscriminant()));
        //calling switch for discriminant.now, switch can have 1,0,-1
        switch (s.getQuadraticEquationDiscriminantToZeroOneAndMinusOne()) {
            case 1 -> {
                s.setQuadraticEquationRoot1((((-1) * (s.getQuadraticEquationVariableB())) + (int) (Math.sqrt(s.getQuadraticEquationDiscriminant()))) / (2 * s.getQuadraticEquationVariableA()));
                s.setQuadraticEquationRoot2((((-1) * (s.getQuadraticEquationVariableB())) - (int) (Math.sqrt(s.getQuadraticEquationDiscriminant()))) / (2 * s.getQuadraticEquationVariableA()));

                System.out.println("Root1: "+s.getQuadraticEquationRoot1());
                System.out.println("Root2: "+s.getQuadraticEquationRoot2());
            }
            case 0 -> {
                s.setQuadraticEquationRoot1((-(s.getQuadraticEquationVariableB()) / (2 * s.getQuadraticEquationVariableA())));
                s.setQuadraticEquationRoot2(s.getQuadraticEquationRoot1());

                System.out.println("Root 1: " + s.getQuadraticEquationRoot1());
                System.out.println("Root 2: " + s.getQuadraticEquationRoot2());
            }
            case -1 -> {
                s.setQuadraticEquationDiscriminant(s.quadraticEquationAbsoluteValueCreator(s.getQuadraticEquationDiscriminant())); // discriminant value is updated; absolute value
                *//*System.out.println("TEST=> s.getQuadraticEquationVariableB()                                                                        : "+s.getQuadraticEquationVariableB());
                System.out.println("TEST=> s.getQuadraticEquationVariableA()                                                                        : "+s.getQuadraticEquationVariableA());
                System.out.println("TEST=> Math.sqrt(s.getQuadraticEquationDiscriminant())                                                          : "+(int)(Math.sqrt(s.getQuadraticEquationDiscriminant())));
                System.out.println("TEST=> s.getQuadraticEquationVariableA()                                                                        : "+s.getQuadraticEquationVariableA());
                System.out.println("TEST=> (-1 * (((s.getQuadraticEquationVariableB())) / (2 * s.getQuadraticEquationVariableA())))                 : "+ (double)(-1)*((((s.getQuadraticEquationVariableB())) / (2 * s.getQuadraticEquationVariableA()))));
                System.out.println("TEST=> (((float) (Math.sqrt(s.getQuadraticEquationDiscriminant()))) / (2 * s.getQuadraticEquationVariableA()))) : "+ (((float) (Math.sqrt(s.getQuadraticEquationDiscriminant()))) / (2 * s.getQuadraticEquationVariableA())));
*//*
                System.out.println("Root1: "+(-1 * (((s.getQuadraticEquationVariableB())) / (2 * s.getQuadraticEquationVariableA()))) + " + i " + (((float) (Math.sqrt(s.getQuadraticEquationDiscriminant()))) / (2 * s.getQuadraticEquationVariableA())));
                System.out.println("Root2: "+((-1 * (s.getQuadraticEquationVariableB())) / (2 * s.getQuadraticEquationVariableA())) + " - i " + (float)(((int) (Math.sqrt(s.getQuadraticEquationDiscriminant()))) / (2 * s.getQuadraticEquationVariableA())));
            }
            default -> System.out.println("invalid input; Check the code.");
        }*/


        //question7
        /*SwitchAssignment s = new SwitchAssignment();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        s.setCompareNumber1(sc.nextInt());

        s.setCompareStatus(Integer.signum(s.getCompareNumber1()));

        switch (s.getCompareStatus()){
            case 0 -> System.out.println("value is zero.");
            case 1 -> System.out.println("value is positive.");
            case -1 -> System.out.println("value is negative.");
            default -> System.out.println("ERROR: invalid value.");
        }*/


        //question6
        /*SwitchAssignment s = new SwitchAssignment();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        s.setCompareNumber1(sc.nextInt());

        s.setCompareStatus(s.getCompareNumber1()%2); // saves 0, value. 0 mean even value mean odd.

        switch (s.getCompareStatus()){
            case 0 ->
                System.out.println("it is even.");
            default->
                System.out.println("it is odd.");
        }*/

        //question5   learn something new.
        /*SwitchAssignment input = new SwitchAssignment();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        input.setCompareNumber1(sc.nextInt());
        System.out.print("Enter number 2: ");
        input.setCompareNumber2(sc.nextInt());

        //return 1 if result is positive, 0 if equal, -1 if negative.
        input.setCompareStatus(Integer.signum(input.getCompareNumber1()-input.getCompareNumber2()));

*//*
        if (input.getCompareNumber1() > input.getCompareNumber2()) {
            input.setCompareStatus(1);
        }
*//*
        switch (input.getCompareStatus()) {
            case 1 -> System.out.println(input.getCompareNumber1()+" is greater.");
            case 0 -> System.out.println(input.getCompareNumber2()+" and "+input.getCompareNumber1()+" are equal.");
            case -1 -> System.out.println(input.getCompareNumber2()+" is greater.");
            default -> System.out.println("Invalid value.");
        }*/

        //question4
        //second type of code, only using switch.
        /*SwitchAssignment s = new SwitchAssignment();
        Scanner sc = new Scanner(System.in);
        System.out.print("1. Alphabet \n2. Digit \n3. Special Character \nEnter your choice: ");
        s.setUserInputChoice(sc.nextInt());

        System.out.print("Enter a value : ");
        s.setUserInputChar(sc.next().charAt(0));

        System.out.println("TEST=> you have entered: " + s.getUserInputChar());

        switch (s.getUserInputChoice()) {
            case 1:
                if(Character.isLetter(s.getUserInputChar())){
                    System.out.println("you have entered alphabet: "+s.getUserInputChar());
                }break;
            case 2:
                if(Character.isDigit(s.getUserInputChar())){
                    System.out.println("you have entered digit: "+s.getUserInputChar());
                }break;
            case 3:
                if(!(Character.isWhitespace(s.getUserInputChar())&&Character.isDigit(s.getUserInputChar())&&Character.isLetter(s.getUserInputChar()))){
                    System.out.println("you have entered a special character: "+s.getUserInputChar());
                }break;
            default:
                System.out.println("invalid option.");
        }*/


        //********************************************************
        //********************************************************

       /*//first style using switch also function(inside function ifelse used)
        SwitchAssignment s = new SwitchAssignment();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a alphabet, number or special character: ");
        char variable = sc.next().charAt(0);
//        System.out.println("TESTING=> passing to function: "+variable);
        String matchExpression = s.isAlphabetNumberSpecialCharacter(variable);
//        System.out.println("TESTING=> just before into switch: "+matchExpression);
        switch (matchExpression) {
            case "specialCharacter" -> System.out.println("special Character.");
            case "itIsDigit" -> System.out.println("it is digit.");
            case "itIsCharacter" -> System.out.println("it is character.");
            default -> System.out.println("invalid input.");
        }*/

        //question3
        /*SwitchAssignment s = new SwitchAssignment();
        String message = "Enter a character to know it is vowel or consonant.";
        s.setUserInputChar(s.isInputCharOrNot(message));

        System.out.println(s.getUserInputChar());

        switch (s.getUserInputChar()){
            case 'a','e','i','o','u','A','E','I','O','U'-> System.out.println("it is vowel.");
            default -> System.out.println("it is consonant.");
        }*/


        //question2
        /*SwitchAssignment s = new SwitchAssignment();
        //month list is showed.
        System.out.println("1 January");
        System.out.println("2 February");
        System.out.println("3 March");
        System.out.println("4 April");
        System.out.println("5 May");
        System.out.println("6 June");
        System.out.println("7 July");
        System.out.println("8 August");
        System.out.println("9 September");
        System.out.println("10 October");
        System.out.println("11 November");
        System.out.println("12 December");

        //checking it is integer or not.
        s.setMonthInput(s.isInputIntOrNot("Enter the Number of a month (1 to 12) in a week: "));
        //checking which month is selected or not.
        s.setMonthName(s.decideMonthNameForOutput(s.getMonthInput()));

        switch (s.getMonthInput()) {
            case 1,3,5,7,9: {
                System.out.printf("Number of days in the month %s are: %d", s.getMonthName(), SwitchAssignment.getThirtyOne());
                break;
            }
            case 2,10: {
                System.out.printf("Number of days in the month %s are: %d", s.getMonthName(),  SwitchAssignment.getTwentyEight());
                break;
            }
            case 4,6,8,12: {
                System.out.printf("Number of days in the month %s are: %d", s.getMonthName(),  SwitchAssignment.getThirty());
                break;
            }
            default:
                System.out.println("!!!invalid input!!!");
        }*/

        //question1
        /*SwitchAssignment s = new SwitchAssignment();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of a day (1 to 7) in a week.");
        s.setDayNameOfWeek(sc.nextInt());
        if(s.getDayNameOfWeek()>0 && s.getDayNameOfWeek()<=7){
            switch(s.getDayNameOfWeek()){
                case 1:
                    System.out.println("MONDAY");
                    System.out.println("in 1971, rules were established that Monday was considered the beginning of the week in daily life and business practices, recommended by the ISO (International Organization for Standardization).");
                        break;
                case 2:
                    System.out.println("TUESDAY");
                        break;
                case 3:
                    System.out.println("WEDNESDAY");
                    break;
                case 4:
                    System.out.println("THURSDAY");
                    break;
                case 5:
                    System.out.println("FRIDAY");
                    break;
                case 6:
                    System.out.println("SATURDAY");
                    break;
                case 7:
                    System.out.println("SUNDAY");
                    System.out.println("In 1971, rules were established that Sunday will be the last day of the week.");
                    break;
                default:
                    System.out.println("invalid number of a day");
            }
        }*/

    }
}
