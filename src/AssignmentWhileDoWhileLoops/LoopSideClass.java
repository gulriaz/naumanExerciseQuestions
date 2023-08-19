package AssignmentWhileDoWhileLoops;

public class LoopSideClass {
    //------------------------------
    private String stringNewValueUserInput;
    private char charNewvalueUserInput;
    //------------------------------
    private int counterZeroValues = 0;
    private int counterPositiveValues = 0;
    private int counterNegativeValues = 0;
    //------------------------------
    private int intValueUserInput;
    private char stringValueUserInput = 'y';
    private int intResultValue;
    //-----------------------------
    private int multiplicationTable;
    private int multiplicationResult = 0;
    private int multiplicationRange;
    //------------------------------
    private int factorialUserInputInt;
    private int productOfNaturalNumbers = 1;
    //------------------------------
    private int sumOfNaturalNumbers = 0;

    public String getStringNewValueUserInput() {
        return stringNewValueUserInput;
    }

    public void setStringNewValueUserInput(String stringNewValueUserInput) {
        this.stringNewValueUserInput = stringNewValueUserInput;
    }

    public char getCharNewvalueUserInput() {
        return charNewvalueUserInput;
    }

    public void setCharNewvalueUserInput(char charNewvalueUserInput) {
        this.charNewvalueUserInput = charNewvalueUserInput;
    }

    public int getCounterZeroValues() {
        return counterZeroValues;
    }

    public void setCounterZeroValues(int counterZeroValues) {
        this.counterZeroValues = counterZeroValues;
    }

    public int getCounterPositiveValues() {
        return counterPositiveValues;
    }

    public void setCounterPositiveValues(int counterPositiveValues) {
        this.counterPositiveValues = counterPositiveValues;
    }

    public int getCounterNegativeValues() {
        return counterNegativeValues;
    }

    public void setCounterNegativeValues(int counterNegativeValues) {
        this.counterNegativeValues = counterNegativeValues;
    }

    public int getIntValueUserInput() {
        return intValueUserInput;
    }

    public void setIntValueUserInput(int intValueUserInput) {
        this.intValueUserInput = intValueUserInput;
    }

    public char getStringValueUserInput() {
        return stringValueUserInput;
    }

    public void setStringValueUserInput(char stringValueUserInput) {
        this.stringValueUserInput = stringValueUserInput;
    }

    public int getIntResultValue() {
        return intResultValue;
    }

    public void setIntResultValue(int intResultValue) {
        this.intResultValue = intResultValue;
    }

    public int getMultiplicationRange() {
        return multiplicationRange;
    }

    public void setMultiplicationRange(int multiplicationRange) {
        this.multiplicationRange = multiplicationRange;
    }

    //------------------------------

    public boolean isDivisibleBy(int i) {
        if (i % getMultiplicationTable() == 0) {
            return true;
        } else return false;

    }

    public int getMultiplicationTable() {
        return multiplicationTable;
    }

    public void setMultiplicationTable(int multiplicationTable) {
        this.multiplicationTable = multiplicationTable;
    }

    public int getMultiplicationResult() {
        return multiplicationResult;
    }

    public void setMultiplicationResult(int multiplicationResult) {
        this.multiplicationResult = multiplicationResult;
    }

    public int getProductOfNaturalNumbers() {
        return productOfNaturalNumbers;
    }

    public void setProductOfNaturalNumbers(int productOfNaturalNumbers) {
        this.productOfNaturalNumbers = productOfNaturalNumbers;
    }

    public int getFactorialUserInputInt() {
        return factorialUserInputInt;
    }

    public void setFactorialUserInputInt(int factorialUserInputInt) {
        this.factorialUserInputInt = factorialUserInputInt;
    }

    //-------------------------------
    public int getSumOfNaturalNumbers() {
        return sumOfNaturalNumbers;
    }

    public void setSumOfNaturalNumbers(int sumOfNaturalNumbers) {
        this.sumOfNaturalNumbers = sumOfNaturalNumbers;
    }

}
