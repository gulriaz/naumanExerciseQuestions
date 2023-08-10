package AssignmentThreeSwitch;

import java.util.Scanner;

public class MainSwitch {
    public static void main(String[] args) {
//
        //question20
        /*SwitchAssignment s = new SwitchAssignment();
        Scanner sc = new Scanner(System.in);
        char tryAgain;
        do {
            System.out.print("Enter a character: ");
            s.setCaseVariableChar(sc.next().charAt(0));
            if(Character.isLowerCase(s.getCaseVariableChar())){
                s.setCaseVariableInt(1);
            } else if (Character.isUpperCase(s.getCaseVariableChar())) {
                s.setCaseVariableInt(0);
            }else s.setCaseVariableInt(-1);

            switch (s.getCaseVariableInt()){
                case 1 -> System.out.println("\u001B[33m" + "character is lower case."+SwitchAssignment.ANSI_RESET);
                case 0 -> System.out.println("\u001B[35m" + "character is upper case."+SwitchAssignment.ANSI_RESET);
                case -1 -> System.out.println("\u001B[31m" + "character is not an alphabet case."+SwitchAssignment.ANSI_RESET);
                default -> System.out.println("Invalid Alphabet");
            }

            System.out.print("\ndo you want to try again: ");
            tryAgain=sc.next().charAt(0);

        } while (tryAgain=='y' || tryAgain=='Y');*/


        //question19
        /*SwitchAssignment s = new SwitchAssignment();
        Scanner sc = new Scanner(System.in);
        char tryAgain;
        do {
            System.out.print("Enter a value: ");
            s.setNumberInt1(sc.nextInt());
            String intStringValue=Integer.toString(s.getNumberInt1());
            char oneValue=intStringValue.charAt((intStringValue.length()-1));
            intStringValue=Character.toString(oneValue);
            int value=Integer.parseInt(intStringValue);//one char String to int.
            switch (value){
                case 1 -> System.out.printf("result is: %.3f",((float)value)/10);
                case 5 -> System.out.printf("result is: %.3f",((float)value)/100);
                case 9 -> System.out.printf("result is: %.3f",((float)value)/1000);
                default -> System.out.printf("result is: %.3f",((float)value)/20);
            }
            System.out.print("\ndo you want to try again: ");
            tryAgain=sc.next().charAt(0);

        } while (tryAgain=='y' || tryAgain=='Y');*/

        //question18
        /*SwitchAssignment s = new SwitchAssignment();
        Scanner sc = new Scanner(System.in);
        char tryAgain;
        do {
        System.out.print("Enter your age: ");
        s.setNumberInt1(sc.nextInt());

        if (s.getNumberInt1() >= 18 && s.getNumberInt1() <= 80) {
            s.setCaseVariableInt(1); // yes vote
        } else if (s.getNumberInt1() < 18 && s.getNumberInt1() > 0) {
            s.setCaseVariableInt(0); // no vote
        } else s.setCaseVariableInt(-1);

        switch (s.getCaseVariableInt()) {
            case 1 -> System.out.println("you are eligible.");
            case 0 -> System.out.println("you are not eligible.");
            case -1 -> System.out.println("invalid age.");
            default -> System.out.println("invalid case");
        }

        System.out.print("do you want to try again: ");
        tryAgain=sc.next().charAt(0);

    } while (tryAgain=='y' || tryAgain=='Y');*/


        //question17
        /*SwitchAssignment s = new SwitchAssignment();
        Scanner sc = new Scanner(System.in);
        char tryAgain;
        do {
            System.out.print("Enter your marks: ");
            s.setNumberInt1(sc.nextInt());

            if (s.getNumberInt1() >= 50 && s.getNumberInt1() < 60) {
                s.setCaseVariableString("D");
            } else if (s.getNumberInt1() >= 60 && s.getNumberInt1() < 69) {
                s.setCaseVariableString("C");
            } else if (s.getNumberInt1() >= 70 && s.getNumberInt1() < 79) {
                s.setCaseVariableString("B");
            } else if (s.getNumberInt1() >= 80 && s.getNumberInt1() < 89) {
                s.setCaseVariableString("A");
            } else if (s.getNumberInt1() >= 90 && s.getNumberInt1() <= 100) {
                s.setCaseVariableString("A+");
            } else s.setCaseVariableString("F");

            switch (s.getCaseVariableString()) {
                case "D" -> System.out.println(s.getCaseVariableString() + " Passed: Need improvement");
                case "C" -> System.out.println(s.getCaseVariableString() + " Passed: Result is satisfactory");
                case "B" -> System.out.println(s.getCaseVariableString() + " Passed: Result is good");
                case "A" -> System.out.println(s.getCaseVariableString() + " Passed: Result is excellent");
                case "A+" -> System.out.println(s.getCaseVariableString() + " Passed: Result with distinction");
                case "F" -> System.out.println(s.getCaseVariableString() + " Fail: very poor result");
                default -> throw new IllegalArgumentException("invalid value.");
            }

            System.out.print("do you want to try again: ");
            tryAgain=sc.next().charAt(0);

        } while (tryAgain=='y' || tryAgain=='Y');*/

        //question16
        /*SwitchAssignment s = new SwitchAssignment();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        s.setNumberInt1(sc.nextInt());
        System.out.print("Enter number 2: ");
        s.setNumberInt2(sc.nextInt());
        System.out.print("Enter number 3: ");
        s.setNumberInt3(sc.nextInt());

        if(s.getNumberInt1()>s.getNumberInt2() && s.getNumberInt1()>s.getNumberInt3()){
            s.setCaseVariable(1);
        }else if(s.getNumberInt2()>s.getNumberInt1() && s.getNumberInt2()>s.getNumberInt3()){
            s.setCaseVariable(2);
        }else if(s.getNumberInt3()>s.getNumberInt1() && s.getNumberInt3()>s.getNumberInt2()){
            s.setCaseVariable(3);
        }else s.setCaseVariable(9);

        switch (s.getCaseVariable()){
            case 1 -> System.out.println(s.getNumberInt1()+" is greater than all.");
            case 2 -> System.out.println(s.getNumberInt2()+" is greater than all.");
            case 3 -> System.out.println(s.getNumberInt3()+" is greater than all.");
            default -> throw new IllegalArgumentException("invalid value.");
        }*/


        //question15
        /*SwitchAssignment s = new SwitchAssignment();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number up to 20: ");
        s.setIntUserInput(sc.nextInt());

        switch (s.getIntUserInput()){
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            case 4 -> System.out.println("Four");
            case 5 -> System.out.println("Five");
            case 6 -> System.out.println("Six");
            case 7 -> System.out.println("Seven");
            case 8 -> System.out.println("Eight");
            case 9 -> System.out.println("Nine");
            case 10 -> System.out.println("Ten");
            case 11 -> System.out.println("Eleven");
            case 12 -> System.out.println("Twelve");
            case 13 -> System.out.println("Thirteen");
            case 14 -> System.out.println("Fourteen");
            case 15 -> System.out.println("Fifteen");
            case 16 -> System.out.println("Sixteen");
            case 17 -> System.out.println("Seventeen");
            case 18 -> System.out.println("Eighteen");
            case 19 -> System.out.println("Ninteen");
            case 20 -> System.out.println("Twenty");
            default -> throw new IllegalArgumentException("invalid input.");
        }*/

        /*SwitchAssignment s = new SwitchAssignment();
        Scanner sc = new Scanner(System.in);
        String wordCacheIntValues;
        int choice;
        System.out.println("Enter your choice; word with digit 1 or without digit 2: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.print("Enter any word including number in it: ");
                s.setWordUserInput(sc.next());
                String wordCache = s.getWordUserInput();
                StringBuilder str = new StringBuilder();
                for (int i = 0; i < wordCache.length(); i++) {
                    if(((i+1)<=(wordCache.length()-1))) {
                    if ((Character.isDigit(wordCache.charAt(i))) && (Character.isDigit(wordCache.charAt(i + 1)))) {
                        str.append(wordCache.charAt(i));
                        str.append(wordCache.charAt(i + 1));
                        str.append("_");
                        if(i+1==(wordCache.length()-1)){
                            wordCacheIntValues = str.toString();
                            System.out.print("values in the word are: " + wordCacheIntValues);
                            System.exit(0);
                        }
                    }else  if ((Character.isDigit(wordCache.charAt(i)))){

                        str.append(wordCache.charAt(i));
                        str.append("_");
                        if(i==(wordCache.length()-1)){
                            wordCacheIntValues = str.toString();
                            System.out.print("values in the word are: " + wordCacheIntValues);
                            System.exit(0);
                        }
                    }
                    }else if ((Character.isDigit(wordCache.charAt(i)))) {
                        str.append(wordCache.charAt(i));
                        str.append("_");
                    }

                }
                wordCacheIntValues = str.toString();
                System.out.print("values in the word are: " + wordCacheIntValues);
            }
            case 2 -> System.out.println("you have entered a word without digit: " + s.getWordUserInput());
            default -> System.out.println("invalid choice");
        }*/


        //question14
        /*SwitchAssignment s = new SwitchAssignment();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your gender m for male, f for female: ");
        s.setGenderUserInput(sc.next());
        switch (s.getGenderUserInput()){
            case "m" -> System.out.println("your gender is male.");
            case "f" -> System.out.println("your gender is female.");
            default -> System.out.println("invalid gender.");
        }*/


        //question13
        /*SwitchAssignment s = new SwitchAssignment();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your ID: ");
        s.setUserID(sc.nextInt());
        if(s.getUserID()==31202){
        System.out.print("Enter your user name: ");
        s.setUserName(sc.next());
        System.out.print("Enter your user father name: ");
        s.setUserFName(sc.next());
        System.out.print("Enter your user education: ");
        s.setUserEducation(sc.next());
        System.out.print("Enter your user job status (yes,no): ");
        s.setUserJobStatus(sc.next());
        switch (s.getUserID()){
            case 31202-> {
                System.out.printf("1. user  ID is: %s",s.getUserID());
                System.out.println();
                System.out.printf("2. user  Name is: %s",s.getUserName());
                System.out.println();
                System.out.printf("3. user  Father Name is: %s",s.getUserFName());
                System.out.println();
                System.out.printf("4. user  Education is: %s",s.getUserEducation());
                System.out.println();
                System.out.printf("5. user  Job Status is: %s",s.getUserJobStatus());
            }
            default -> throw new IllegalArgumentException("invalid id");
        }
        } else throw new IllegalArgumentException("invalid id");*/


        //question12
        /*SwitchAssignment s = new SwitchAssignment();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        s.setPasswordUserinput(sc.next());
        if(s.getPasswordUserinput().equals(s.getPasswordSaved())){
        switch (s.getCaseVariable()){
            case 1-> System.out.println("Password matched");
            default -> System.out.println("PASSWORD NOT MATCH");
        }
        }else System.out.println("PASSWORD NOT MATCH");*/


        /*//question11
        SwitchAssignment s = new SwitchAssignment();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter department ID: ");
        s.setStringInput(sc.next());
        switch (s.getStringInput()){
            case "CS-1"-> System.out.println("Computer Science");
            case "SE-2"-> System.out.println("Software Engineering");
            case "IT-3"-> System.out.println("Information Technology");
            case "AI-4"-> System.out.println("Artificial Intelligence");
            case "AD-0"-> System.out.println("Anonymous Department");
            default -> System.out.println("invalid department id");
        }*/

        //question10
        /*SwitchAssignment s = new SwitchAssignment();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        s.setNumberInput(sc.nextInt());
        switch (s.getNumberInput()) {
            case 1,2,3,4,5,6,7,8,9,10:
                System.out.println("Character is: "+(char)s.getNumberInput());
                break;
            default:
                throw new IllegalArgumentException("value is more than 10; invalid");
        }*/

        //question9
/*
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
*/

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
