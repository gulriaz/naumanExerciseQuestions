package AssignmentTwoIfElseIf;

public class IfElseIf {

    public static final char CALCULATE_ADDITION = '+';
    public static final char CALCULATE_SUBTRACTION = '-';
    public static final char CALCULATE_MULTIPLICATION = '*';
    public static final char CALCULATE_DIVISION = '/';
    final static float UPTO199 = 1.20f;
    final static float UPTO399 = 1.50f;
    final static float UPTO599 = 1.80f;
    final static float UPTOMAX = 2.00f;
    final static float FIFTEEN_PERCENT = 0.15f;
    final static int SURCHARGE_LIMIT = 400;
    final static float FIFTY = 50f;
    final static float ONE_FIFTY = 150f;
    final static float TWO_FIFTY = 250f;
    final static float LIBRARY_FINE_FIRST_FIVE_DAYS_FINE = 0.50F;
    final static int LIBRARY_FINE_SIX_TO_TEN_DAYS_FINE = 1;
    final static int LIBRARY_FINE_ABOVE_TEN_DAYS = 5;
    final static String LIBRARY_MEMBERSHIP_STATUS_CANCELLED = "CANCELLED";
    private final static float PRODUCT_DISCOUNT = 0.10f;
    private final static int CONVERSION_CENTIMETER_TO_METER_DIVISOR = 100;
    private final static int CONVERSION_METER_TO_KILOMETER_DIVISOR = 100000;
    private static String CLOCK_AM = "AM";
    private static String CLOCK_PM = "PM";
    final int ZERO = 0;
    final int ONE_NINTY_NINE = 199;
    final int TWO_HUNDRED = 200;
    final int THREE_NINTY_NINE = 399;
    final int FOUR_HUNDRED = 400;
    final int FIVE_NINTY_NINE = 599;
    final int SIX_HUNDRED = 600;
    //-----------------------------------
    float forFirst50UnitsRs = 0.50f;
    float for150UnitsRs = 0.75f;
    float for250UnitsRs = 1.20F;
    float forUnitAbove250Rs = 1.50F;
    double unitsConsumedToPrint = 0;
    double forAdditionalSurchargeOf20Per = 0.20;
    double chargesAsPerUnitConsumed = 0.0;
    double totalBill = 0.0;
    //-----------------------------------
    private String NumberStringInput;
    //----------------------------------
    private float conversionCentimeterUserInput;
    private float conversionCentimeterToMeters;
    private float conversionCentimeterToKilometers;
    //-----------------------------------
    private int clockHours;
    private int clockMinutes;
    //-----------------------------------
    private float TriangleAngle1;
    private float TriangleAngle2;
    private float TriangleAngle3;
    private float TriangleSumOfAngles;
    //-----------------------------------
    private float libraryChargesAFine;
    private float LibraryNumberOfDays;
    //-----------------------------------
    private float timeTakenByWorker;
    //------------------------------------
    private float calculateVal1;
    private float calculateVal2;
    private float calculateResult;
    private char calculateOperator;
    //-----------------------------------
    private int numberInput1;
    private int numberInput2;
    private int numberInput3;
    //-----------------------------------
    private double productPrice = 0;
    private long productQuantity = 0;
    private double productRevenue = 0;
    //----------------------------------
    private float areaRectangle;
    private float perimeterRectangle;
    private float lengthRectangle;
    private float breadthRectangle;
    //-----------------------------------
    private double basicSalary;
    private double houseRentAllowance = 0;
    private double dearnessAllowance = 0;
    //-----------------------------------
    private int userInputNumber;
    //-----------------------------------
    private int customerId;
    private String customerName;
    private float customerUnitConsumed;
    private float customerBillToPay;
    private float customerTotalBillWithSurcharge;
    private float customerSurcharge;
    //----------------------------------
    private char isCharacter;
    //-----------------------------------
    private int a;
    private int b;

    public static String getClockAm() {
        return CLOCK_AM;
    }

    public static String getClockPm() {
        return CLOCK_PM;
    }

    public static int GET_CONVERSION_CENTIMETER_TO_METER_DIVISOR() {
        return CONVERSION_CENTIMETER_TO_METER_DIVISOR;
    }

    public static int GET_CONVERSION_METER_TO_KILOMETER_DIVISOR() {
        return CONVERSION_METER_TO_KILOMETER_DIVISOR;
    }

    public static float GET_PRODUCT_DISCOUNT() {
        return PRODUCT_DISCOUNT;
    }

    public String getNumberStringInput() {
        return NumberStringInput;
    }

    public void setNumberStringInput(String numberStringInput) {
        NumberStringInput = numberStringInput;
    }

    public int getClockHours() {
        return clockHours;
    }

    public void setClockHours(int clockHours) {
        this.clockHours = clockHours;
    }

    public int getClockMinutes() {
        return clockMinutes;
    }

    public void setClockMinutes(int clockMinutes) {
        this.clockMinutes = clockMinutes;
    }

    public float getConversionCentimeterUserInput() {
        return conversionCentimeterUserInput;
    }

    public void setConversionCentimeterUserInput(float conversionCentimeterUserInput) {
        this.conversionCentimeterUserInput = conversionCentimeterUserInput;
    }

    public float getConversionCentimeterToMeters() {
        return conversionCentimeterToMeters;
    }

    public void setConversionCentimeterToMeters(float conversionCentimeterToMeters) {
        this.conversionCentimeterToMeters = conversionCentimeterToMeters;
    }

    public float getConversionCentimeterToKilometers() {
        return conversionCentimeterToKilometers;
    }

    public void setConversionCentimeterToKilometers(float conversionCentimeterToKilometers) {
        this.conversionCentimeterToKilometers = conversionCentimeterToKilometers;
    }

    public float getTriangleAngle1() {
        return TriangleAngle1;
    }

    public void setTriangleAngle1(float triangleAngle1) {
        TriangleAngle1 = triangleAngle1;
    }

    public float getTriangleAngle2() {
        return TriangleAngle2;
    }

    public void setTriangleAngle2(float triangleAngle2) {
        TriangleAngle2 = triangleAngle2;
    }

    public float getTriangleAngle3() {
        return TriangleAngle3;
    }

    public void setTriangleAngle3(float triangleAngle3) {
        TriangleAngle3 = triangleAngle3;
    }

    public float getTriangleSumOfAngles() {
        return TriangleSumOfAngles;
    }

    public void setTriangleSumOfAngles(float triangleSumOfAngles) {
        TriangleSumOfAngles = triangleSumOfAngles;
    }

    public float getLibraryChargesAFine() {
        return libraryChargesAFine;
    }

    public void setLibraryChargesAFine(float libraryChargesAFine) {
        this.libraryChargesAFine = libraryChargesAFine;
    }

    public float getLibraryNumberOfDays() {
        return LibraryNumberOfDays;
    }

    public void setLibraryNumberOfDays(float libraryNumberOfDays) {
        LibraryNumberOfDays = libraryNumberOfDays;
    }

    public float getTimeTakenByWorker() {
        return timeTakenByWorker;
    }

    public void setTimeTakenByWorker(float timeTakenByWorker) {
        this.timeTakenByWorker = timeTakenByWorker;
    }

    public char getCalculateOperator() {
        return calculateOperator;
    }

    public void setCalculateOperator(char calculateOperator) {
        this.calculateOperator = calculateOperator;
    }

    public float getCalculateVal1() {
        return calculateVal1;
    }

    public void setCalculateVal1(float calculateVal1) {
        this.calculateVal1 = calculateVal1;
    }

    public float getCalculateVal2() {
        return calculateVal2;
    }

    public void setCalculateVal2(float calculateVal2) {
        this.calculateVal2 = calculateVal2;
    }

    public float getCalculateResult() {
        return calculateResult;
    }

    public void setCalculateResult(float calculateResult) {
        this.calculateResult = calculateResult;
    }

    public int getNumberInput1() {
        return numberInput1;
    }

    public void setNumberInput1(int numberInput1) {
        this.numberInput1 = numberInput1;
    }

    public int getNumberInput2() {
        return numberInput2;
    }

    public void setNumberInput2(int numberInput2) {
        this.numberInput2 = numberInput2;
    }

    public int getNumberInput3() {
        return numberInput3;
    }

    public void setNumberInput3(int numberInput3) {
        this.numberInput3 = numberInput3;
    }

    public float getAreaRectangle() {
        return areaRectangle;
    }

    public void setAreaRectangle(float areaRectangle) {
        this.areaRectangle = areaRectangle;
    }

    public float getPerimeterRectangle() {
        return perimeterRectangle;
    }

    public void setPerimeterRectangle(float perimeterRectangle) {
        this.perimeterRectangle = perimeterRectangle;
    }

    public float getLengthRectangle() {
        return lengthRectangle;
    }

    public void setLengthRectangle(float lengthRectangle) {
        this.lengthRectangle = lengthRectangle;
    }

    public float getBreadthRectangle() {
        return breadthRectangle;
    }

    public void setBreadthRectangle(float breadthRectangle) {
        this.breadthRectangle = breadthRectangle;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public long getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(long productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double getProductRevenue() {
        return productRevenue;
    }

    public void setProductRevenue(double productRevenue) {
        this.productRevenue = productRevenue;
    }

    public double getUnitsConsumedToPrint() {
        return unitsConsumedToPrint;
    }

    public void setUnitsConsumedToPrint(double unitsConsumedToPrint) {
        this.unitsConsumedToPrint = unitsConsumedToPrint;
    }

    public double getForAdditionalSurchargeOf20Per() {
        return forAdditionalSurchargeOf20Per;
    }

    public void setForAdditionalSurchargeOf20Per(double forAdditionalSurchargeOf20Per) {
        this.forAdditionalSurchargeOf20Per = forAdditionalSurchargeOf20Per;
    }

    public double getChargesAsPerUnitConsumed() {
        return chargesAsPerUnitConsumed;
    }

    public void setChargesAsPerUnitConsumed(double chargesAsPerUnitConsumed) {
        this.chargesAsPerUnitConsumed = chargesAsPerUnitConsumed;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getHouseRentAllowance() {
        return houseRentAllowance;
    }

    public void setHouseRentAllowance(double houseRentAllowance) {
        this.houseRentAllowance = houseRentAllowance;
    }

    public double getDearnessAllowance() {
        return dearnessAllowance;
    }

    public void setDearnessAllowance(double dearnessAllowance) {
        this.dearnessAllowance = dearnessAllowance;
    }

    public int getUserInputNumber() {
        return userInputNumber;
    }

    public void setUserInputNumber(int userInputNumber) {
        this.userInputNumber = userInputNumber;
    }

    public float getCustomerTotalBillWithSurcharge() {
        return customerTotalBillWithSurcharge;
    }

    public void setCustomerTotalBillWithSurcharge(float customerTotalBillWithSurcharge) {
        this.customerTotalBillWithSurcharge = customerTotalBillWithSurcharge;
    }

    public float getCustomerSurcharge() {
        return customerSurcharge;
    }

    public void setCustomerSurcharge(float customerSurcharge) {
        this.customerSurcharge = customerSurcharge;
    }

    public float getCustomerBillToPay() {
        return customerBillToPay;
    }

    public void setCustomerBillToPay(float customerBillToPay) {
        this.customerBillToPay = customerBillToPay;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public float getCustomerUnitConsumed() {
        return customerUnitConsumed;
    }

    public void setCustomerUnitConsumed(float customerUnitConsumed) {
        this.customerUnitConsumed = customerUnitConsumed;
    }

    public char getIsCharacter() {
        return isCharacter;
    }

    public void setIsCharacter(char isCharacter) {
        this.isCharacter = isCharacter;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    //----------------------------------------
}
