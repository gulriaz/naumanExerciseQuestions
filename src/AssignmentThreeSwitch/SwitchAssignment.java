package AssignmentThreeSwitch;

import java.util.Scanner;

public class SwitchAssignment {

    private final static int THIRTY = 30;
    private final static int THIRTY_ONE = 31;
    private final static int TWENTY_EIGHT = 28;
    private float quadraticEquationVariableA;
    private float quadraticEquationVariableB;
    private float quadraticEquationVariableC;
    private float quadraticEquationDiscriminant;
    private int quadraticEquationDiscriminantToZeroOneAndMinusOne;
    private float quadraticEquationRoot1;
    private float quadraticEquationRoot2;
    private float quadraticEquationVariableBSquare;
    //--------------------------------------
    private int userID;
    private String userName;
    private String userFName;
    private String userEducation;
    private String userJobStatus;
    //--------------------------------------
    private String passwordUserinput;
    private String passwordSaved = "PASSWORD";
    private int caseVariable = 1;
    //--------------------------------------
    private String stringInput;
    //--------------------------------------
    private int numberInput;
    //--------------------------------------
    private int operand1;
    private int operand2;
    private char operator;
    //--------------------------------------
    private int compareNumber1;
    private int compareNumber2;
    private int compareStatus;
    //--------------------------------------
    private char userInputChar;
    private int userInputChoice;
    //--------------------------------------
    private String monthName;
    private int monthInput;
    //--------------------------------------
    private int dayNameOfWeek;

    public static int getThirty() {
        return THIRTY;
    }

    public static int getThirtyOne() {
        return THIRTY_ONE;
    }

    public static int getTwentyEight() {
        return TWENTY_EIGHT;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserFName() {
        return userFName;
    }

    public void setUserFName(String userFName) {
        this.userFName = userFName;
    }

    public String getUserEducation() {
        return userEducation;
    }

    public void setUserEducation(String userEducation) {
        this.userEducation = userEducation;
    }

    public String getUserJobStatus() {
        return userJobStatus;
    }

    public void setUserJobStatus(String userJobStatus) {
        this.userJobStatus = userJobStatus;
    }

    public int getCaseVariable() {
        return caseVariable;
    }

    public void setCaseVariable(int caseVariable) {
        this.caseVariable = caseVariable;
    }

    public String getPasswordSaved() {
        return passwordSaved;
    }

    public String getPasswordUserinput() {
        return passwordUserinput;
    }

    public void setPasswordUserinput(String passwordUserinput) {
        this.passwordUserinput = passwordUserinput;
    }

    public String getStringInput() {
        return stringInput;
    }

    public void setStringInput(String stringInput) {
        this.stringInput = stringInput;
    }

    public int getNumberInput() {
        return numberInput;
    }

    public void setNumberInput(int numberInput) {
        this.numberInput = numberInput;
    }

    public int getOperand1() {
        return operand1;
    }

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public float getQuadraticEquationVariableBSquare() {
        return quadraticEquationVariableBSquare;
    }

    public void setQuadraticEquationVariableBSquare(float quadraticEquationVariableBSquare) {
        this.quadraticEquationVariableBSquare = quadraticEquationVariableBSquare;
    }

    public int getQuadraticEquationDiscriminantToZeroOneAndMinusOne() {
        return quadraticEquationDiscriminantToZeroOneAndMinusOne;
    }

    public void setQuadraticEquationDiscriminantToZeroOneAndMinusOne(int quadraticEquationDiscriminantToZeroOneAndMinusOne) {
        this.quadraticEquationDiscriminantToZeroOneAndMinusOne = quadraticEquationDiscriminantToZeroOneAndMinusOne;
    }

    //--------------------------------------
    public float quadraticEquationSquare(float value) {
        value = value * value;
        return value;
    }

    public float quadraticEquationAbsoluteValueCreator(float value) {
        value = value * (-1);

        return value;
    }

    public float getQuadraticEquationVariableA() {
        return quadraticEquationVariableA;
    }

    public void setQuadraticEquationVariableA(float quadraticEquationVariableA) {
        this.quadraticEquationVariableA = quadraticEquationVariableA;
    }

    public float getQuadraticEquationVariableB() {
        return quadraticEquationVariableB;
    }

    public void setQuadraticEquationVariableB(float quadraticEquationVariableB) {
        this.quadraticEquationVariableB = quadraticEquationVariableB;
    }

    public float getQuadraticEquationVariableC() {
        return quadraticEquationVariableC;
    }

    public void setQuadraticEquationVariableC(float quadraticEquationVariableC) {
        this.quadraticEquationVariableC = quadraticEquationVariableC;
    }

    public float getQuadraticEquationDiscriminant() {
        return quadraticEquationDiscriminant;
    }

    public void setQuadraticEquationDiscriminant(float quadraticEquationDiscriminant) {
        this.quadraticEquationDiscriminant = quadraticEquationDiscriminant;
    }

    public float getQuadraticEquationRoot1() {
        return quadraticEquationRoot1;
    }

    public void setQuadraticEquationRoot1(float quadraticEquationRoot1) {
        this.quadraticEquationRoot1 = quadraticEquationRoot1;
    }

    public float getQuadraticEquationRoot2() {
        return quadraticEquationRoot2;
    }

    public void setQuadraticEquationRoot2(float quadraticEquationRoot2) {
        this.quadraticEquationRoot2 = quadraticEquationRoot2;
    }

    public int getCompareStatus() {
        return compareStatus;
    }

    public void setCompareStatus(int compareStatus) {
        this.compareStatus = compareStatus;
    }

    public int getCompareNumber1() {
        return compareNumber1;
    }

    public void setCompareNumber1(int compareNumber1) {
        this.compareNumber1 = compareNumber1;
    }

    public int getCompareNumber2() {
        return compareNumber2;
    }

    public void setCompareNumber2(int compareNumber2) {
        this.compareNumber2 = compareNumber2;
    }

    public int getUserInputChoice() {
        return userInputChoice;
    }

    public void setUserInputChoice(int userInputChoice) {
        this.userInputChoice = userInputChoice;
    }

    public char getUserInputChar() {
        return userInputChar;
    }

    public void setUserInputChar(char userInputChar) {
        this.userInputChar = userInputChar;
    }

    public String isAlphabetNumberSpecialCharacter(char valueOfCharFromMainToFunction) {
        String message = null;
        if (!(Character.isWhitespace(valueOfCharFromMainToFunction) || Character.isDigit(valueOfCharFromMainToFunction) || Character.isLetter(valueOfCharFromMainToFunction))) {
            message = "specialCharacter";
        } else if (Character.isDigit(valueOfCharFromMainToFunction)) {
            message = "itIsDigit";
        } else if (Character.isLetter(valueOfCharFromMainToFunction)) {
            message = "itIsCharacter";
        }
//        System.out.println("TESTING=> inside function: "+message);
        return message;

    }

    public char isInputCharOrNot(String message) {
        char valueObtained = '$';
        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNext("[a-zA-Z]+")) {
            System.out.println("!!!Try again!!!");
            System.out.println(message);
            sc.nextLine(); // this fetch all in scanner as one line;
            // to discard what wrong value we obtained from has not Next an Int.
            // discarding: because we are not assigning it.
        }
//        char s=sc.nextLine().;
//        valueObtained = sc.next().getChars(0,sc.next().length(),,0); //parsing complete string to int and store it in valueObtained variable.
        valueObtained = sc.next().charAt(0);
        return valueObtained;
    }

    public int isInputIntOrNot(String message) {
        int valueObtained = 0;
        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.println("!!!Try again!!!");
            System.out.println(message);
            sc.nextLine(); // this fetch all in scanner as one line;
            // to discard what wrong value we obtained from has not Next an Int.
            // discarding: because we are not assigning it.
        }
        return valueObtained = Integer.parseInt(sc.nextLine()); //parsing complete string to int and store it in valueObtained variable.
    }

    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    public int getMonthInput() {
        return monthInput;
    }

    public void setMonthInput(int monthInput) {
        this.monthInput = monthInput;
    }

    public String decideMonthNameForOutput(int monthUserInput) {
        String monthName = switch (monthUserInput) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "NotValid";
        };
        return monthName;
    }

    public int getDayNameOfWeek() {
        return dayNameOfWeek;
    }

    public void setDayNameOfWeek(int dayNameOfWeek) {
        this.dayNameOfWeek = dayNameOfWeek;
    }

}
