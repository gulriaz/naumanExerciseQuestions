package AssignmentTwoIfElseIf;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //question 45
        //same as question 38. skipped.

        //question 44
 /*       IfElseIf i = new IfElseIf();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        i.setNumberStringInput(sc.next());
        int size=i.getNumberStringInput().length();
        char val=i.getNumberStringInput().charAt((size-1));
        System.out.println(val);

        if((val%3)==0){
            System.out.println("last digit is divisible by 3.");
        }else
            System.out.println("last digit is not divisble by 3.");*/


        //question 43
        /*IfElseIf i = new IfElseIf();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours in 24 hours format: ");
        i.setClockHours(sc.nextInt());
        System.out.print("Enter time in minutes out of 60: ");
        i.setClockMinutes(sc.nextInt());
        if ((i.getClockHours() >= 0 && i.getClockHours() <= 12)) {
            if ((i.getClockMinutes() >= 0 && i.getClockMinutes() <= 60))
                System.out.printf("%d : %d  %s", i.getClockHours(), i.getClockMinutes(), IfElseIf.getClockAm());
            else {
                System.out.printf("%d : ERROR_MINUTES  %s", i.getClockHours(), IfElseIf.getClockAm());
            }
        } else if ((i.getClockHours() > 12 && i.getClockHours() <= 24)) {
            if ((i.getClockMinutes() >= 0 && i.getClockMinutes() <= 60))
                System.out.printf("%d : %d  %s", i.getClockHours(), i.getClockMinutes(), IfElseIf.getClockPm());
            else {
                System.out.printf("%d : ERROR_MINUTES  %s", i.getClockHours(), IfElseIf.getClockPm());
            }
        } else if ((i.getClockMinutes() >= 0 && i.getClockMinutes() <= 60)) {
            if ((i.getClockHours() >= 0 && i.getClockHours() <= 12))
                System.out.printf("%d : %d  %s", i.getClockHours(), i.getClockMinutes(), IfElseIf.getClockAm());
            else if ((i.getClockHours() > 12 && i.getClockHours() <= 24))
                System.out.printf("%d : %d  %s", i.getClockHours(), i.getClockMinutes(), IfElseIf.getClockPm());
            else {
                System.out.printf("ERROR_HOURS : %d  %s", i.getClockMinutes(), IfElseIf.getClockAm());
            }
        }
        else System.out.println("!!!incorrect time FORMAT!!!");*/



        //question 42
        /*IfElseIf i = new IfElseIf();
        Scanner sc = new Scanner(System.in);
        System.out.print("What do you want; 1. Centimeter Conversion to Meters    2. Centimeter Conversion to Kilometers: ");
        i.setConversionCentimeterUserInput(sc.nextFloat());
        if(i.getConversionCentimeterUserInput()==1){
            System.out.print("Enter the value in centimeters: ");
            i.setConversionCentimeterUserInput(sc.nextFloat());
            i.setConversionCentimeterToMeters(i.getConversionCentimeterUserInput()/IfElseIf.GET_CONVERSION_CENTIMETER_TO_METER_DIVISOR());
            System.out.printf("Centimeter Conversion to Meters is; RESULT: %.2f",i.getConversionCentimeterToMeters());
        } else if(i.getConversionCentimeterUserInput()==2){
            System.out.print("Enter the value in centimeters: ");
            i.setConversionCentimeterUserInput(sc.nextFloat());
            i.setConversionCentimeterToKilometers(i.getConversionCentimeterUserInput()/IfElseIf.GET_CONVERSION_METER_TO_KILOMETER_DIVISOR());
            System.out.printf("Centimeter Conversion to Kilometers is; RESULT: %.5f",i.getConversionCentimeterToKilometers());
        }else System.out.println("!!!invalid option!!!");*/

        //question 41
        /*IfElseIf i = new IfElseIf();
        Scanner sc = new Scanner(System.in);
        System.out.println("RULE: Triangle will only be created when sum of all angles are 180.");
        System.out.println("------------------------------");
        System.out.print("Enter first angle of Triangle: ");
        i.setTriangleAngle1(sc.nextFloat());
        System.out.print("Enter second angle of Triangle: ");
        i.setTriangleAngle2(sc.nextFloat());
        System.out.print("Enter third angle of Triangle: ");
        i.setTriangleAngle3(sc.nextFloat());

        i.setTriangleSumOfAngles(i.getTriangleAngle1() + i.getTriangleAngle2() + i.getTriangleAngle3());
        if (i.getTriangleSumOfAngles() > 0 && i.getTriangleSumOfAngles() < 180) {
            System.out.println("Triangle is not created.");
        } else if (i.getTriangleSumOfAngles() == 180) {
            System.out.println("isosceles triangle is created. sum of all agnles are 180.");
        } else System.out.println("triangle cannot be created.");*/

        //question 40
/*        IfElseIf i = new IfElseIf();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days the member is late to return the book: ");
        i.setLibraryNumberOfDays(sc.nextFloat());
        if (i.getLibraryNumberOfDays() > 0 && i.getLibraryNumberOfDays() <= 5) {
            System.out.println("-------------------------------------------------------------------");
            System.out.printf("the number of days the member is late to return the book are: %.1f ", i.getLibraryNumberOfDays());
            i.setLibraryChargesAFine(i.getLibraryNumberOfDays() * IfElseIf.LIBRARY_FINE_FIRST_FIVE_DAYS_FINE);
            System.out.printf("\nthe late book return fine is: %.1f ", i.getLibraryChargesAFine());
        } else if (i.getLibraryNumberOfDays() >= 6 && i.getLibraryNumberOfDays() <= 10) {
            System.out.println("-------------------------------------------------------------------");
            System.out.printf("the number of days the member is late to return the book are: %.1f ", i.getLibraryNumberOfDays());
            i.setLibraryChargesAFine(i.getLibraryNumberOfDays() * IfElseIf.LIBRARY_FINE_SIX_TO_TEN_DAYS_FINE);
            System.out.printf("\nthe late book return fine is: %.1f ", i.getLibraryChargesAFine());
        } else if (i.getLibraryNumberOfDays() > 10 && i.getLibraryNumberOfDays() < 30) {
            System.out.println("-------------------------------------------------------------------");
            System.out.printf("the number of days the member is late to return the book are: %.1f ", i.getLibraryNumberOfDays());
            i.setLibraryChargesAFine(i.getLibraryNumberOfDays() * IfElseIf.LIBRARY_FINE_ABOVE_TEN_DAYS);
            System.out.printf("\nthe late book return fine is: %.1f ", i.getLibraryChargesAFine());
        } else if (i.getLibraryNumberOfDays() >= 30) {
            System.out.println("-------------------------------------------------------------------");
            System.out.printf("the number of days the member is late to return the book are: %.1f ", i.getLibraryNumberOfDays());
            System.out.printf("\nthe membership is %s", IfElseIf.LIBRARY_MEMBERSHIP_STATUS_CANCELLED);
        } else {
            System.out.println("-------------------------------------------------------------------");
            System.out.printf("No fine applied, Days cannot be %.0f", i.getLibraryNumberOfDays());
        }*/

        //question 39
       /* IfElseIf i = new IfElseIf();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the time take by worker: ");
        i.setTimeTakenByWorker(sc.nextFloat());

        if(i.getTimeTakenByWorker()>2 && i.getTimeTakenByWorker()<3){
            System.out.println("the worker is said to be highly efficient");
        }else if(i.getTimeTakenByWorker()>3 && i.getTimeTakenByWorker()<4){
            System.out.println("then the worker is ordered to improve speed");
        } else if(i.getTimeTakenByWorker()>4 && i.getTimeTakenByWorker()<5){
            System.out.println("the worker is given training to improve his speed");
        }if(i.getTimeTakenByWorker()>5){
            System.out.println("the worker has to leave the company");
        }else {
            System.out.println("!!!invalid options.!!!");
        }*/

        //question 38
        /*IfElseIf i = new IfElseIf();
        Scanner sc = new Scanner(System.in);

        System.out.print("Which operation do you want to perform: ");
        i.setCalculateOperator(sc.next().charAt(0));
        System.out.print("Enter a value: ");
        i.setCalculateVal1(sc.nextFloat());
        System.out.print("Enter a value: ");
        i.setCalculateVal2(sc.nextFloat());

        if (i.getCalculateOperator() == IfElseIf.CALCULATE_ADDITION) {
            i.setCalculateResult(i.getCalculateVal1() + i.getCalculateVal2());
            System.out.printf("after %s operator; result is: %.1f", IfElseIf.CALCULATE_ADDITION, i.getCalculateResult());
        } else if (i.getCalculateOperator() == IfElseIf.CALCULATE_DIVISION) {
            i.setCalculateResult(i.getCalculateVal1() / i.getCalculateVal2());
            System.out.printf("after %s operator; result is: %.1f", IfElseIf.CALCULATE_DIVISION, i.getCalculateResult());
        } else if (i.getCalculateOperator() == IfElseIf.CALCULATE_MULTIPLICATION) {
            i.setCalculateResult(i.getCalculateVal1() * i.getCalculateVal2());
            System.out.printf("after %s operator; result is: %.1f", IfElseIf.CALCULATE_MULTIPLICATION, i.getCalculateResult());
        } else if (i.getCalculateOperator() == IfElseIf.CALCULATE_SUBTRACTION) {
            i.setCalculateResult(i.getCalculateVal1() - i.getCalculateVal2());
            System.out.printf("after %s operator; result is: %.1f", IfElseIf.CALCULATE_SUBTRACTION, i.getCalculateResult());
        } else System.out.println("!!!invalid operator!!!");*/


        //question 37
        /*IfElseIf i = new IfElseIf();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        i.setNumberInput1(sc.nextInt());
        System.out.print("Enter a number: ");
        i.setNumberInput2(sc.nextInt());
        System.out.print("Enter a number: ");
        i.setNumberInput3(sc.nextInt());

        if(i.getNumberInput1()<i.getNumberInput2() && i.getNumberInput2()<i.getNumberInput3()){
            System.out.println("numbers are in increasing order.");
        } else if (i.getNumberInput1()>i.getNumberInput2() && i.getNumberInput2()>i.getNumberInput3()) {
            System.out.println("numbers are in decreasing order.");
        }else System.out.println("numbers are in random order.");*/


        //question 36
        /*IfElseIf i = new IfElseIf();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of rectangle: ");
        i.setLengthRectangle(sc.nextFloat());
        System.out.print("Enter the breath of rectangle: ");
        i.setBreadthRectangle((sc.nextFloat()));
        i.setAreaRectangle(i.getLengthRectangle()*i.getBreadthRectangle());
        i.setPerimeterRectangle(2*(i.getLengthRectangle()+i.getBreadthRectangle()));

        if(i.getAreaRectangle()>i.getPerimeterRectangle()){
            System.out.printf("Area %.1f of rectangle is greater than perimeter %.1f of rectangle",i.getAreaRectangle(),i.getPerimeterRectangle());
        }else System.out.printf("Perimeter %.1f of rectangle is greater than area %.1f of rectangle.",i.getAreaRectangle(),i.getPerimeterRectangle());
*/

        //question 35
        /*IfElseIf i = new IfElseIf();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product price: ");
        i.setProductPrice(sc.nextDouble());
        System.out.print("Enter product quantity: ");
        i.setProductQuantity(sc.nextLong());

        i.setProductRevenue(i.getProductPrice()*i.getProductQuantity());

        if(i.getProductRevenue()>5000){
            i.setProductRevenue((i.getProductRevenue()*IfElseIf.GET_PRODUCT_DISCOUNT())+i.getProductRevenue());
            System.out.println("--------------------------------------------");
            System.out.printf("Your discount rate is: %.1f",(IfElseIf.GET_PRODUCT_DISCOUNT()*100));
            System.out.println();
            System.out.printf("Net revenue is: %.1f ",i.getProductRevenue());
        }else {System.out.println("--------------------------------------------");
            System.out.printf("TRY AGAIN: Product revenue is less than FIVE THOUSAND: %.1f",i.getProductRevenue());
        }*/


        //question 34
        /*IfElseIf i = new IfElseIf();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        i.setUserInputNumber(sc.nextDouble());
        if (i.getUserInputNumber() >= 0) {
            if (i.getUserInputNumber() <= IfElseIf.FIFTY) {
                i.setUnitsConsumedToPrint(i.getUserInputNumber());
                i.setChargesAsPerUnitConsumed(i.getUserInputNumber() * i.forFirst50UnitsRs);
                i.setForAdditionalSurchargeOf20Per(i.getChargesAsPerUnitConsumed() * i.forAdditionalSurchargeOf20Per);
                //total bill surcharge + unitsConsumedCharges.
                i.setTotalBill(i.getForAdditionalSurchargeOf20Per() + i.getChargesAsPerUnitConsumed());

                System.out.printf("Your units consumed are: %.1f", i.getUnitsConsumedToPrint());
                System.out.println();
                System.out.printf("Your units consumed bill is: %.1f", i.getChargesAsPerUnitConsumed());
                System.out.println();
                System.out.printf("Your surcharge is:      %.1f", i.getForAdditionalSurchargeOf20Per());
                System.out.println();
                System.out.println("----------------------------------------------------");
                System.out.printf("Your total bill is:     %.1f", i.getTotalBill());
            } else if (i.getUserInputNumber() <= IfElseIf.ONE_FIFTY) {
                i.setUnitsConsumedToPrint(i.getUserInputNumber());
                i.setChargesAsPerUnitConsumed(i.getUserInputNumber() * i.for150UnitsRs);
                i.setForAdditionalSurchargeOf20Per(i.getChargesAsPerUnitConsumed() * i.forAdditionalSurchargeOf20Per);
                //total bill surcharge + unitsConsumedCharges.
                i.setTotalBill(i.getForAdditionalSurchargeOf20Per() + i.getChargesAsPerUnitConsumed());

                System.out.printf("Your units consumed are: %.1f", i.getUnitsConsumedToPrint());
                System.out.println();
                System.out.printf("Your units consumed bill is: %.1f", i.getChargesAsPerUnitConsumed());
                System.out.println();
                System.out.printf("Your surcharge is:      %.1f", i.getForAdditionalSurchargeOf20Per());
                System.out.println();
                System.out.println("----------------------------------------------------");
                System.out.printf("Your total bill is:     %.1f", i.getTotalBill());
            } else if (i.getUserInputNumber() <= IfElseIf.TWO_FIFTY) {
                i.setUnitsConsumedToPrint(i.getUserInputNumber());
                i.setChargesAsPerUnitConsumed(i.getUserInputNumber() * i.for250UnitsRs);
                i.setForAdditionalSurchargeOf20Per(i.getChargesAsPerUnitConsumed() * i.forAdditionalSurchargeOf20Per);
                //total bill surcharge + unitsConsumedCharges.
                i.setTotalBill(i.getForAdditionalSurchargeOf20Per() + i.getChargesAsPerUnitConsumed());

                System.out.printf("Your units consumed are: %.1f", i.getUnitsConsumedToPrint());
                System.out.println();
                System.out.printf("Your units consumed bill is: %.1f", i.getChargesAsPerUnitConsumed());
                System.out.println();
                System.out.printf("Your surcharge is:      %.1f", i.getForAdditionalSurchargeOf20Per());
                System.out.println();
                System.out.println("----------------------------------------------------");
                System.out.printf("Your total bill is:     %.1f", i.getTotalBill());
            } else if (i.getUserInputNumber() > IfElseIf.TWO_FIFTY) {
                i.setUnitsConsumedToPrint(i.getUserInputNumber());
                i.setChargesAsPerUnitConsumed(i.getUserInputNumber() * i.forUnitAbove250Rs);
                i.setForAdditionalSurchargeOf20Per(i.getChargesAsPerUnitConsumed() * i.forAdditionalSurchargeOf20Per);
                //total bill surcharge + unitsConsumedCharges.
                i.setTotalBill(i.getForAdditionalSurchargeOf20Per() + i.getChargesAsPerUnitConsumed());

                System.out.printf("Your units consumed are: %.1f", i.getUnitsConsumedToPrint());
                System.out.println();
                System.out.printf("Your units consumed bill is: %.1f", i.getChargesAsPerUnitConsumed());
                System.out.println();
                System.out.printf("Your surcharge is:      %.1f", i.getForAdditionalSurchargeOf20Per());
                System.out.println();
                System.out.println("----------------------------------------------------");
                System.out.printf("Your total bill is:     %.1f", i.getTotalBill());
            }
        } else System.out.println("!!!invalid value: value must be positive.!!!");*/


        //question 33
        /*IfElseIf i = new IfElseIf();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        i.setBasicSalary(sc.nextDouble());
        System.out.println("Enter House Rent (HR) allowance: ");
        i.setHouseRentAllowance(sc.nextInt());
        System.out.println("Enter Dareness Allowance: ");
        i.setDearnessAllowance(sc.nextInt());

        if(i.getBasicSalary()<=10000){
            i.setHouseRentAllowance((i.getHouseRentAllowance()*(0.20)));
            i.setDearnessAllowance((i.getDearnessAllowance()*(0.80)));
            System.out.printf("you are eligible for HRA = 20per: %.2f , DA = 80per: %.2f",i.getHouseRentAllowance(),i.getDearnessAllowance());
            i.setBasicSalary(i.getHouseRentAllowance()+i.getDearnessAllowance());
            System.out.printf("Your Gross salary is: %f",i.getBasicSalary());
        } else if(i.getBasicSalary()<=20000){
            i.setHouseRentAllowance((i.getHouseRentAllowance()*(0.25)));
            i.setDearnessAllowance((i.getDearnessAllowance()*(0.90)));
            System.out.printf("you are eligible for HRA = 25per: %.2f , DA = 90per: %.2f",i.getHouseRentAllowance(),i.getDearnessAllowance());
            i.setBasicSalary(i.getHouseRentAllowance()+i.getDearnessAllowance());
            System.out.printf("Your Gross salary is: %f",i.getBasicSalary());
        }else if(i.getBasicSalary()>20000){
            i.setHouseRentAllowance((i.getHouseRentAllowance()*(0.30)));
            i.setDearnessAllowance((i.getDearnessAllowance()*(0.95)));
            System.out.printf("you are eligible for HRA = 30per: %.2f , DA = 95per: %.2f",i.getHouseRentAllowance(),i.getDearnessAllowance());
            i.setBasicSalary(i.getHouseRentAllowance()+i.getDearnessAllowance()+i.getBasicSalary());
            System.out.printf("Your Gross salary is: %.2f",i.getBasicSalary());
        }else System.out.println("!!!invalid options.!!!");*/


        //question 32 counting currency notes, ATM
/**
 * this program was really good, i enjoyed alot.
 * */
        int NumberOfValuesScannedANDProcessed=1; //I have considered we have 1,10,100,500,1000,5000 notes only, if value exceeds than
        //how many notes will be needed.
        double resultFiveThousandCount = 0;
        IfElseIf i = new IfElseIf();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Currency value : ");
        i.setUserInputNumber(sc.nextInt());

        String valueIntCurrencyToString = Integer.toString(i.getUserInputNumber()); //int to string
        int lengthOfCurrency = valueIntCurrencyToString.length();
//        System.out.println("Length is: " + lengthOfCurrency);
        int count = lengthOfCurrency - 1;
//        System.out.println("Length count is: " + count);

        if(count >= 0) {
            //1

            char currencyNotesOfOneRupeeCh = valueIntCurrencyToString.charAt(count); //returning how many 1 rupee notes.

            String valueOfChar = String.valueOf(currencyNotesOfOneRupeeCh);   //converting a character to interger.
            int currencyNotesOfOneRupee = Integer.parseInt(valueOfChar);

            count--;

            if(count >= 0) {

                //10
                char currencyNotesOfTenRupeeCh = valueIntCurrencyToString.charAt(count);
                NumberOfValuesScannedANDProcessed++;//2nd
                valueOfChar = String.valueOf(currencyNotesOfTenRupeeCh);
                int currencyNotesOfTenRupee = Integer.parseInt(valueOfChar);


                count--;

                if(count >= 0) {
                    //100
                    NumberOfValuesScannedANDProcessed++;//3rd

                    char currencyNotesOfHUNDREDRupeeCh = valueIntCurrencyToString.charAt(count);
                    valueOfChar = String.valueOf(currencyNotesOfHUNDREDRupeeCh);
                    int currencyNotesOfHUNDREDRupee = 0;
                    int currencyNotesOfFIVEHUNDREDRupee = 0;
                    int resultHundredOnly;
                    if ((Integer.parseInt(valueOfChar) % 5) == 0) {
                        currencyNotesOfFIVEHUNDREDRupee = (Integer.parseInt(valueOfChar) / 5); // only five hundreds.
                    } else if (Integer.parseInt(valueOfChar) < 5) {
                        currencyNotesOfHUNDREDRupee = Integer.parseInt(valueOfChar); //only hundreds
                    } else if (Integer.parseInt(valueOfChar) >= 5) {

                        currencyNotesOfFIVEHUNDREDRupee = Integer.parseInt(valueOfChar) / 5; //remaining five hundreds

//            resultHundredOnly=(Integer.parseInt(valueOfChar)*100)-500;
//            resultHundredOnly=(resultHundredOnly/100);

                        currencyNotesOfHUNDREDRupee = (Integer.parseInt(valueOfChar) - (5)); //remaining hundreds
                    }


                    count--;

                    if(count >= 0) {
                        //1000
                        char currencyNotesOfTHOUSANDRupeeCh = valueIntCurrencyToString.charAt(count);
                        NumberOfValuesScannedANDProcessed++;//4th
                        valueOfChar = String.valueOf(currencyNotesOfTHOUSANDRupeeCh);
                        int currencyNotesOfTHOUSANDRupee = Integer.parseInt(valueOfChar);


//        int currencyNotesOfTHOUSANDRupeeUpdated = (globalRemainderOfFiveThousandRupeesBecomesThousandRupee + currencyNotesOfTHOUSANDRupee);


                        count--;

                        if(count >= 0) {
                            //5000

                            char currencyNotesOfFIVETHOUSANDRupeeChar = valueIntCurrencyToString.charAt(count);
                            NumberOfValuesScannedANDProcessed++;//5th
                            //Converting a Character to int value.
                            valueOfChar = String.valueOf(currencyNotesOfFIVETHOUSANDRupeeChar);
                            int currencyNotesOfFIVETHOUSANDRupee = Integer.parseInt(valueOfChar); //finally a char to int is converted.

                            currencyNotesOfFIVETHOUSANDRupee = (currencyNotesOfFIVETHOUSANDRupee * 10);

                            if ((currencyNotesOfFIVETHOUSANDRupee % 5) == 0) {
                                resultFiveThousandCount = (currencyNotesOfFIVETHOUSANDRupee / 5);
                            }

                            count--; //count error handler.

                            if(count >= 0) {
                                int unScannedNumberOfValues = count + 1; //getting un scanned values.
                                int scannedNumberOfValues = (lengthOfCurrency - unScannedNumberOfValues);//total scanned values.
//        System.out.printf("Total digits (%d) in the value: %d",lengthOfCurrency,i.getUserInputNumber());
//        System.out.println();
//        System.out.printf("Total un scan digits (%d) in the value: %d",unScannedNumberOfValues,i.getUserInputNumber());
//        System.out.println();

                                //-------------Large value than our notes system-------------------------
//        System.out.println("Number Of Values Scanned AND Processed controller: "+NumberOfValuesScannedANDProcessed);
                                int remainingScanValues = (lengthOfCurrency - scannedNumberOfValues);
//        System.out.println("remaining to scan: "+remainingScanValues);

                                for (int j = 0; j < remainingScanValues; j++) {
                                    char valueatindex = valueIntCurrencyToString.charAt(j); //Orignal userinput value is converted to char at desired index
                                    valueOfChar = String.valueOf(valueatindex);
                                    int currencyValueObtained = Integer.parseInt(valueOfChar); //converted a character to integer.

                                    int NumberOfZeros = lengthOfCurrency - (j + 1);

                                    String currencyValueObtainedToString = Integer.toString(currencyValueObtained); //a value which is not included.
                                    StringBuilder sB = new StringBuilder(currencyValueObtainedToString);

//            System.out.println("To string: "+currencyValueObtainedToString);

                                    for (int k = 0; k < NumberOfZeros; k++) {
//                String changedToString=Integer.toString(currencyValueObtained);
                                        sB.append("0");
                                    }
                                    String valueAfterZeroPading = sB.toString();
                                    int paddedIntValue = Integer.parseInt(valueAfterZeroPading); //converting a padded String into int.
                                    int resultPaddedValueInFiveThousandNotes = (paddedIntValue / 5000);

//            System.out.println("currencyValueObtained padded value: "+paddedIntValue+" into Five thousand notes "+resultPaddedValueInFiveThousandNotes);


//            System.out.println(resultPaddedValueInFiveThousandNotes);
                                    resultFiveThousandCount = (resultFiveThousandCount + resultPaddedValueInFiveThousandNotes);
                                }
//        System.out.println("TOTAL:"+resultFiveThousandCount);
                                //-----------------------------------------------------------


                                System.out.println("-----------------------------------------------------------");
                                System.out.printf("You need one rupee notes: %s", currencyNotesOfOneRupee);
                                System.out.println();
                                System.out.printf("You need ten rupee notes: %s", currencyNotesOfTenRupee);
                                System.out.println();
                                System.out.printf("You need hundred rupee notes: %s", currencyNotesOfHUNDREDRupee);
                                System.out.println();
                                System.out.printf("You need five hundred rupee notes: %s", currencyNotesOfFIVEHUNDREDRupee);
                                System.out.println();
                                System.out.printf("You need thousand rupee notes: %s", currencyNotesOfTHOUSANDRupee);
                                System.out.println();
                                System.out.printf("You need five thousand rupee notes: %.0f", resultFiveThousandCount);
                                System.out.println();

                                System.exit(0); //will help not to execuse other else conditions.

                            } else System.out.println("-----------------------------------------------------------");
                            System.out.printf("You need five thousand rupee notes: %.0f", resultFiveThousandCount);
                            System.out.println();
                        } else System.out.println("-----------------------------------------------------------");
                        System.out.printf("You need thousand rupee notes: %s", currencyNotesOfTHOUSANDRupee);
                        System.out.println();
                    } else System.out.println("-----------------------------------------------------------");
                    System.out.printf("You need five hundred rupee notes: %s", currencyNotesOfFIVEHUNDREDRupee);
                    System.out.println();
                    System.out.printf("You need hundred rupee notes: %s", currencyNotesOfHUNDREDRupee);
                    System.out.println();
                }
                else System.out.println("-----------------------------------------------------------");
                System.out.printf("You need ten rupee notes: %s", currencyNotesOfTenRupee);
                System.out.println();
            }
            else System.out.println("-----------------------------------------------------------");
            System.out.printf("You need one rupee notes: %s", currencyNotesOfOneRupee);
        } else {
            switch (count) {
                case -1: {
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("Value Over Scan Completed.");
                    break;
                }
                case 0: {
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("Error: !!!Left most value is not scanned, check the code!!!");
                }
            }
        }
/**
 * above program cash teller program was superb, I enjoyed a lot.
 * */
        //question 31
        /*IfElseIf i = new IfElseIf();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number: ");
        i.setUserInputNumber(sc.nextInt());
        switch (i.getUserInputNumber()){
            case 1:
                System.out.println("number of days in Jan are 31");
                break;
            case 2:
                System.out.println("number of days in Feb are 28");
                break;
            case 3:
                System.out.println("number of days in Mar are 31");
                break;
            case 4:
                System.out.println("number of days in Apr are 30");
                break;
            case 5:
                System.out.println("number of days in May are 31");
                break;
            case 6:
                System.out.println("number of days in Jun are 30");
                break;
            case 7:
                System.out.println("number of days in Jul are 31");
                break;
            case 8:
                System.out.println("number of days in Aug are 31");
                break;
            case 9:
                System.out.println("number of days in Sep are 28");
                break;
            case 10:
                System.out.println("number of days in Oct are 31");
                break;
            case 11:
                System.out.println("number of days in Nov are 30");
                break;
            case 12:
                System.out.println("number of days in Dec are 31");
                break;
            default:
                System.out.println("!!!invalid number of month!!!");
        }*/


        //question 30
/*        IfElseIf i = new IfElseIf();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        i.setUserInputNumber(sc.nextInt());
        if ((i.getUserInputNumber() % 5) == 0 && (i.getUserInputNumber() % 11) == 0) {
            System.out.printf("%d is divisible by 5 and 11 ", i.getUserInputNumber());
        } else if ((i.getUserInputNumber() % 5) == 0) {
            System.out.printf("%d is divisible by 5 ", i.getUserInputNumber());
        } else if ((i.getUserInputNumber() % 11) == 0) {
            System.out.printf("%d is divisible by 11 ", i.getUserInputNumber());
        } else System.out.println("number is not divisible by 5 and 11.");*/


        //question 29
/*
        IfElseIf i = new IfElseIf();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        i.setUserInputNumber(sc.nextInt());

        if (i.getUserInputNumber() > 0) {
            System.out.println("it is positive number.");
        } else if (i.getUserInputNumber() < 0) {
            System.out.println("it is negative number.");
        } else System.out.println("it is zero.");
*/


        //question 28
        /*IfElseIf i = new IfElseIf();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer id: ");
        i.setCustomerId(sc.nextInt());
        if (i.getCustomerId() > i.ZERO) {
            System.out.print("Enter customer name: ");
            i.setCustomerName(sc.next());
            System.out.print("Enter customer units consumed: ");
            i.setCustomerUnitConsumed(sc.nextInt());
            if (i.getCustomerUnitConsumed() > i.ZERO && i.getCustomerUnitConsumed() <= i.ONE_NINTY_NINE) {
                i.setCustomerBillToPay(i.getCustomerUnitConsumed() * IfElseIf.UPTO199);
                System.out.println("customer name: "+i.getCustomerName());
                System.out.println("---------------------------------------------------");
                System.out.println("the total amount to pay by the customer: " + i.getCustomerBillToPay());
            } else if (i.getCustomerUnitConsumed() >= i.TWO_HUNDRED && i.getCustomerUnitConsumed() <= i.THREE_NINTY_NINE) {
                i.setCustomerBillToPay(i.getCustomerUnitConsumed() * IfElseIf.UPTO399);
                if (!(i.getCustomerBillToPay() > IfElseIf.SURCHARGE_LIMIT)) {//400 surchage limit
                    System.out.println("customer name: "+i.getCustomerName());
                    System.out.println("---------------------------------------------------");
                    System.out.println("the total amount to pay by the customer: " + i.getCustomerBillToPay());
                } else {
                    i.setCustomerSurcharge(i.getCustomerBillToPay() * IfElseIf.FIFTEEN_PERCENT);
                    i.setCustomerTotalBillWithSurcharge(i.getCustomerBillToPay() + i.getCustomerSurcharge());
                    System.out.println("customer name: "+i.getCustomerName());
                    System.out.println("the total bill to pay was              : " + i.getCustomerBillToPay());
                    System.out.println("the total surcharge to pay was         : " + i.getCustomerSurcharge());
                    System.out.println("---------------------------------------------------");
                    System.out.println("the total amount to pay by the customer: " + i.getCustomerTotalBillWithSurcharge());
                }
            } else if (i.getCustomerUnitConsumed() >= i.FOUR_HUNDRED && i.getCustomerUnitConsumed() <= i.FIVE_NINTY_NINE) {
                i.setCustomerBillToPay(i.getCustomerUnitConsumed() * IfElseIf.UPTO599);
                if (!(i.getCustomerBillToPay() > IfElseIf.SURCHARGE_LIMIT)) {
                    System.out.println("customer name: "+i.getCustomerName());
                    System.out.println("---------------------------------------------------");
                    System.out.println("the total amount to pay by the customer: " + i.getCustomerBillToPay());
                } else {
                    i.setCustomerSurcharge(i.getCustomerBillToPay() * IfElseIf.FIFTEEN_PERCENT);
                    i.setCustomerTotalBillWithSurcharge(i.getCustomerBillToPay() + i.getCustomerSurcharge());
                    System.out.println("customer name: "+i.getCustomerName());
                    System.out.println("the total bill to pay was              : " + i.getCustomerBillToPay());
                    System.out.println("the total surcharge to pay was         : " + i.getCustomerSurcharge());
                    System.out.println("---------------------------------------------------");
                    System.out.println("the total amount to pay by the customer: " + i.getCustomerTotalBillWithSurcharge());
                }
            } else if (i.getCustomerUnitConsumed() >= i.SIX_HUNDRED) {
                i.setCustomerBillToPay(i.getCustomerUnitConsumed() * IfElseIf.UPTOMAX);
                if (!(i.getCustomerBillToPay() > IfElseIf.SURCHARGE_LIMIT)) {
                    System.out.println("customer name: "+i.getCustomerName());
                    System.out.println("---------------------------------------------------");
                    System.out.println("the total amount to pay by the customer: " + i.getCustomerBillToPay());
                } else {
                    i.setCustomerSurcharge(i.getCustomerBillToPay() * IfElseIf.FIFTEEN_PERCENT);
                    i.setCustomerTotalBillWithSurcharge(i.getCustomerBillToPay() + i.getCustomerSurcharge());
                    System.out.println("customer name: "+i.getCustomerName());
                    System.out.println("the total bill to pay was              : " + i.getCustomerBillToPay());
                    System.out.println("the total surcharge to pay was         : " + i.getCustomerSurcharge());
                    System.out.println("---------------------------------------------------");
                    System.out.println("the total amount to pay by the customer: " + i.getCustomerTotalBillWithSurcharge());
                }
            } else System.out.println("!!! invalid customer units consumed !!!");
        } else {
            System.out.println("!!! invalid customer id !!!");
        }*/

        //question 27
        /*IfElseIf i = new IfElseIf();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        i.setIsCharacter(sc.next().charAt(0));
        if((i.getIsCharacter()>=65 && i.getIsCharacter()<=90) || (i.getIsCharacter()>=97 && i.getIsCharacter()<=122)) {
            {
                if ((i.getIsCharacter() == 'a') || (i.getIsCharacter() == 'A') || (i.getIsCharacter() == 'e') || (i.getIsCharacter() == 'E') || (i.getIsCharacter() == 'i') || (i.getIsCharacter() == 'I') || (i.getIsCharacter() == 'o') || (i.getIsCharacter() == 'O') || (i.getIsCharacter() == 'u') || (i.getIsCharacter() == 'U')) {
                System.out.println("it is vowel.");
                } else System.out.println("it is consonant.");
            }
        }else System.out.println("it is not a character.");
*/
        //question 26
        /*IfElseIf i = new IfElseIf();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any character: ");
        i.setIsCharacter(sc.next().charAt(0));
        if (i.getIsCharacter()>=48 && i.getIsCharacter()<=57){
            System.out.println("it is digit.");
        } else if ((i.getIsCharacter()>=65 && i.getIsCharacter()<=90) || (i.getIsCharacter()>=97 && i.getIsCharacter()<=122)) {
            System.out.println("it is an alphabet.");
        } else if ((i.getIsCharacter() >=33 && i.getIsCharacter()<=47) || (i.getIsCharacter()>=58 && i.getIsCharacter()<=64) || (i.getIsCharacter()>=91 && i.getIsCharacter()<=96) || (i.getIsCharacter()>=123 && i.getIsCharacter()<=126)) {
            System.out.println("it is special character.");
        } else {
            System.out.println("invalid key stroke.");
        }*/

        /**
         * NOW ONWARDS I AM USING OOP PROGRAMMING TECHNIQUE TO SOLVE QUESTIONS. BELOW
         * ALMOST ALL QUESTIONS ARE USING SEQUENTIAL APPROACH.
         * **/


        //question 25
        //sum of all angels is 180, angle cannot be 0,angle can never have more than 90 degree.
        /*int sideAValue,sideBValue,sideCValue;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of first side A: ");
        sideAValue=sc.nextInt();
        System.out.print("Enter the length of second side B: ");
        sideBValue=sc.nextInt();
        System.out.print("Enter the length of third side C: ");
        sideCValue=sc.nextInt();
        {
            if (sideAValue >90 && sideBValue>90  && sideCValue > 90) {
                System.out.println("Triangle cannot be formed.");
            } else if ((sideAValue==90 && sideBValue==90)|| (sideBValue==90 && sideCValue==90) || (sideCValue==90 && sideAValue==90)) {
                System.out.println("Triangle cannot be formed.");
            } else if (sideAValue==90 && sideBValue>0 && sideBValue<=45 && sideCValue>0 && sideCValue<=45) {
                System.out.println("Triangle can be formed.");
            }else if (sideBValue==90 && sideAValue>0 && sideAValue<=45 && sideCValue>0 && sideCValue<=45) {
                System.out.println("Triangle can be formed.");
            }else if (sideCValue==90 && sideAValue>0 && sideAValue<=45 && sideBValue>0 && sideBValue<=45) {
                System.out.println("Triangle can be formed.");
            } else if(sideAValue==60 && sideBValue==60 && sideCValue==60){
                System.out.println("Triangle can be formed.");
            } else if (sideAValue>0 && sideAValue<=60 && sideBValue>0 && sideBValue<=60 && sideCValue>0 && sideCValue<=60  ) {
                System.out.println("Triangle can be formed.");
            }
            else
                System.out.println("Triangle cannot be formed.");
        }*/


        //question 24  a triangle is Equilateral, Isosceles or Scalene
        /*int sideAValue,sideBValue,sideCValue;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of first side A: ");
        sideAValue=sc.nextInt();
        System.out.print("Enter the length of second side B: ");
        sideBValue=sc.nextInt();
        System.out.print("Enter the length of third side C: ");
        sideCValue=sc.nextInt();
        {
            if (sideAValue == sideBValue && sideAValue == sideCValue) {
                System.out.println("Equilateral triangle");//all sides are equal
            } else if (sideAValue == sideBValue || sideAValue == sideCValue || sideBValue == sideCValue) {
                System.out.println("Isosceles triangle");//two sides are same
            } else {
                System.out.println("A scalene triangle"); //all sides are diff
            }
        }*/

        //question 23
        /*int temp;
        final int ZERO=0,TEN=10,TWENTY=20,THIRTY=30,FORTY=40;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of temp: ");
        temp=sc.nextInt();
        {
            if (temp < ZERO) {
                System.out.println("Freezing weather");
            } else if (temp < TEN) {
                System.out.println("Very Cold weather");
            } else if (temp < TWENTY) {
                System.out.println("Cold weather");
            } else if (temp < THIRTY) {
                System.out.println("Normal in Temp");
            } else if (temp < FORTY) {
                System.out.println("Its Hot");
            } else {
                System.out.println("Its Very Hot");
            }
        }*/

        //question 22 total percentage division
        /*int rollNo, marksPhy, marksChem,marksMath;
        float percentage, division;
        final float HUNDRED_PERCENT=100f;
        final float totalMaximumOfMarks=300f, totalObtained;
        String name;
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the rollNo: ");
            rollNo = sc.nextInt();
            System.out.print("Enter the name: ");
            name = sc.next();
            System.out.print("Enter Physics marks: ");
            marksPhy = sc.nextInt();
            System.out.print("Enter Chemistry marks:  ");
            marksChem = sc.nextInt();
            System.out.print("Enter Math marks: ");
            marksMath = sc.nextInt();
            totalObtained = (marksChem + marksMath + marksPhy);
            System.out.println("Total marks are: " + totalObtained);
            division = (totalObtained / totalMaximumOfMarks);
            percentage = (division) * HUNDRED_PERCENT;
            System.out.printf("Percentage is: %.2f", percentage);
            System.out.println();
            System.out.printf("Result after division is: %.2f", division);
        }*/

        //question 21 MAZA A GYA KR K.
        /*int valueForA, valueForB, valueForC;
        int bSquare, resultOfExp4AC;
        double ResultOfSquareRoot, rootval1, rootval2, forRootval1, forRootval2;
        Scanner sc = new Scanner(System.in);
        final int ZERO=0, FOUR=4, TWO=2;
        //give a b c
        System.out.println("Enter a b c for ax2 + bx + c = 0");
        System.out.print("Enter value for a: ");
        valueForA = sc.nextInt();
        System.out.print("Enter value for b: ");
        valueForB = sc.nextInt();
        System.out.print("Enter value for c: ");
        valueForC = sc.nextInt();
        //below; i will be finding parts of expression:   (b2-4ac) etc
        bSquare = valueForB * valueForB;  //b2
        resultOfExp4AC = FOUR * valueForA * valueForC;
        System.out.println();
        if ((bSquare - resultOfExp4AC) > ZERO) {
            ResultOfSquareRoot = Math.sqrt((bSquare - resultOfExp4AC));
            forRootval1 = (((double) -valueForB) + (ResultOfSquareRoot));
            forRootval2 = (((double) -valueForB) - (ResultOfSquareRoot));

            rootval1 = (forRootval1 / (TWO * valueForA));
            rootval2 = (forRootval2 / (TWO * valueForA));

            System.out.print("1. Root: ");
            System.out.printf("%.2f", rootval1);
            System.out.println();
            System.out.print("2. Root: ");
            System.out.printf("%.2f", rootval2);
            System.out.println();
        } else if ((bSquare - resultOfExp4AC) <= ZERO) {

            ResultOfSquareRoot = Math.sqrt((bSquare - resultOfExp4AC));
            forRootval1 = (((double) -valueForB) + (ResultOfSquareRoot));
            forRootval2 = (((double) -valueForB) - (ResultOfSquareRoot));

            rootval1 = (forRootval1 / (TWO * valueForA));
            rootval2 = (forRootval2 / (TWO * valueForA));
            System.out.println("sqrt of -ve value will be null, so; roots are NaN");
            System.out.print("1. Root: ");
            System.out.println(rootval1);
            System.out.print("2. Root: ");
            System.out.println(rootval2);
        }*/


        //question 20
       /* int marksInMath, marksInPhys, marksInChem,totalInAllThreeSubject,totalInMathAndPhysics;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the marks obtained in Physics : ");
        marksInPhys=sc.nextInt();
        System.out.print("Input the marks obtained in Chemistry : ");
        marksInChem=sc.nextInt();
        System.out.print("Input the marks obtained in Mathematics : ");
        marksInMath=sc.nextInt();

        totalInAllThreeSubject=(marksInMath+marksInChem+marksInPhys);
        System.out.println("Total marks of Math, Physics and Chemistry : "+totalInAllThreeSubject);

        totalInMathAndPhysics=(marksInMath+marksInPhys);
        System.out.println("Total marks of Math and Physics : "+totalInMathAndPhysics);

        if((marksInMath) >=65 && (marksInPhys >=55) && (marksInChem>=50)){
            System.out.println("candidate is for admission in professional course");
        } else if (totalInAllThreeSubject >=190 || totalInMathAndPhysics >=140) {
            System.out.println("candidate is  eligible for admission in professional course");
        }else
        {
            System.out.println("candidate is not eligible for admission in professional course.");
        }*/


        /*//question 19 X Y coordinate system
        final int MIN_X=-10;
        final int MAX_X=10;
        final int CENTER_X=0;

        final int MIN_Y=-10;
        final int MAX_Y=10;
        final int CENTER_Y=0;

        IfElseIf i = new IfElseIf();
        Scanner sc = new Scanner(System.in);

        System.out.println("X or Y can be Maximum +10 and minimum -10");
        System.out.print("Enter value of X: ");
        i.setA(sc.nextInt()); //X set in A variable
        System.out.print("Enter value of Y: ");
        i.setB(sc.nextInt()); //Y set in B variable
        if (i.getA()>=CENTER_X && i.getA()<=MAX_X && i.getB()>=CENTER_Y && i.getB()<=MAX_Y){
            System.out.println("coordinates point lie in 1st quadrant +X +Y.");
        } if (i.getA()<=CENTER_X && i.getA()>=MIN_X && i.getB()>=CENTER_Y && i.getB()<=MAX_Y){
            System.out.println("coordinates point lie in 2nd quadrant -X +Y.");
        } if (i.getA()<=CENTER_X && i.getA()>=MIN_X && i.getB()<=CENTER_Y && i.getB()>=MIN_Y){
            System.out.println("coordinates point lie in 3rd quadrant -X -Y.");
        } if (i.getA()>=CENTER_X && i.getA()<=MAX_X  && i.getB()<=CENTER_Y && i.getB()>=MIN_Y){
            System.out.println("coordinates point lie in 4th quadrant +X -Y.");
        }else {
            System.out.println("invalid values, try again.");
        }*/


        //question 18
       /* int firstNumber=120938, secondNumber=25894, thirdNumber=52244562;
        System.out.printf("the numbers are firstNumber= %d  secondNumber= %d  thirdNumber= %d",firstNumber,secondNumber,thirdNumber);
        System.out.println();
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("firstNumber 120938 is the largest.");
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("secondNumber 25894 is the largest");
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            System.out.println("thirdNumber 52244562 is the largest");
        }*/


        //question 17   A=65 Z=90, a=97 z=122
        /*IfElseIf i = new IfElseIf();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        char ch =sc.next().charAt(0);
        if ((ch>=65) && (ch<=90)) {
            System.out.println("it is uppercase.");
        } else if ((ch>=97) && (ch<=122)) {
            System.out.println("it is lowercase");
        }*/


        //question 16
/*
        final int X=2, Y=5, Z=0;
        final int expValue1=2,expValue2=5,expValue3=0,expValue4=10;
        boolean boolValueOfExpression;
        System.out.printf("values of x=%d, y=%d,z=%d ",X,Y,Z);
        System.out.println();
        boolValueOfExpression=(X==expValue1);
        System.out.println("X==2 "+ boolValueOfExpression);
        boolValueOfExpression=(X!=expValue2);
        System.out.println("X!=5 "+ boolValueOfExpression);
        boolValueOfExpression=((X!=expValue2) && (Y>=expValue2));
        System.out.println("(X!=5) && (Y>=5) "+boolValueOfExpression);
        boolValueOfExpression=((Z !=expValue3) || (X==expValue1));
        System.out.println("(Z !=0) || (X==2) "+boolValueOfExpression);
        boolValueOfExpression=(Y<expValue4);
        System.out.println("Y<10 "+boolValueOfExpression);
*/

        //question 15 updating question 14
        /*char medicalCause;
        float numberOfClassesHeld, numberOfClassesAttended, obtainedPercentage; //variables
        final int TOTAL_PERCENTAGE = 100, PERCENTAGE_CRITERIA = 75; //constants
        {//compound statement just to enhance readability.
            IfElseIf i = new IfElseIf();
            Scanner sc = new Scanner(System.in);
            System.out.print("if he/she has medical cause or not ('Y' or 'N')?");
            medicalCause = sc.next().charAt(0);

            if (medicalCause == 'N' || medicalCause == 'n') {
                System.out.print("Enter number of classes held: ");
                numberOfClassesHeld = sc.nextInt();
                System.out.print("Enter number of classes attended: ");
                numberOfClassesAttended = sc.nextInt();

                obtainedPercentage = (numberOfClassesAttended / numberOfClassesHeld) * TOTAL_PERCENTAGE;

                if (obtainedPercentage < PERCENTAGE_CRITERIA) {
                    System.out.println("a student will not be allowed to sit in exam; his/her\n" +
                            "attendance is: " + obtainedPercentage + "%");
                } else
                    System.out.println("a student will be allowed to sit in exam; his/her\n" +
                            "attendance is satisfying the criteria: " + obtainedPercentage + "%");
            } else if (medicalCause == 'Y' || medicalCause == 'y') {
                System.out.println("a student will be allowed to sit in exam; his/her\n" +
                        "medical cause is satisfying the criteria.");
            } else
                System.out.println("invalid option! retry.");
    }*/


        //question 14
/*        float numberOfClassesHeld,numberOfClassesAttended, obtainedPercentage; //variables
        final int TOTAL_PERCENTAGE=100,PERCENTAGE_CRITERIA=75; //constants

        IfElseIf i = new IfElseIf();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of classes held: ");
        numberOfClassesHeld=sc.nextInt();
        System.out.print("Enter number of classes attended: ");
        numberOfClassesAttended=sc.nextInt();

        obtainedPercentage=(numberOfClassesAttended/numberOfClassesHeld)*TOTAL_PERCENTAGE;

        if(obtainedPercentage<PERCENTAGE_CRITERIA){
            System.out.println("a student will not be allowed to sit in exam; his/her\n" +
                    "attendance is: "+obtainedPercentage+"%");
        }
        else
            System.out.println("a student will be allowed to sit in exam; his/her\n" +
        "attendance is satisfying the criteria: "+obtainedPercentage+"%");*/

        //question 13
        /*int positiveInputAbsoluteValueIs=1, negativeInputAbsoluteValueIs=-1;
        IfElseIf i = new IfElseIf();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any int value: ");
        i.setA(sc.nextInt());
        {
            if (i.getA()>=0){ //considering zero as positive though it is not positive not negative
                System.out.println(positiveInputAbsoluteValueIs);
            }else
                System.out.println(negativeInputAbsoluteValueIs);
        }*/


        //question 12
        /*int aliAge,qasimAge,asimAge, optionSelected,firstOption=1,secondOption=2; // three peoples
        IfElseIf i = new IfElseIf();
        Scanner sc = new Scanner(System.in);

        System.out.print("chose the option 1) find eldest 2) find youngest: ");
        optionSelected=sc.nextInt();
        {
            if(optionSelected==firstOption) {
                System.out.print("Enter age of Ali person: ");
                aliAge=sc.nextInt();
                System.out.print("Enter age of Qasim person: ");
                qasimAge=sc.nextInt();
                System.out.print("Enter age of Asim person: ");
                asimAge=sc.nextInt();

                if (aliAge > qasimAge && aliAge > asimAge) {
                    System.out.println("Ali is the eldest.");
                } else if (qasimAge > aliAge && qasimAge > asimAge) {
                    System.out.println("Qasim is the eldest");
                } else if (asimAge > aliAge && asimAge > qasimAge) {
                    System.out.println("Asim is the eldest");
                }
            } else if (optionSelected==secondOption) {
                System.out.print("Enter age of Ali person: ");
                aliAge=sc.nextInt();
                System.out.print("Enter age of Qasim person: ");
                qasimAge=sc.nextInt();
                System.out.print("Enter age of Asim person: ");
                asimAge=sc.nextInt();

                if (aliAge < qasimAge && aliAge < asimAge) {
                    System.out.println("Ali is the youngest.");
                } else if (qasimAge < aliAge && qasimAge < asimAge) {
                    System.out.println("Qasim is the youngest");
                } else if (asimAge < aliAge && asimAge < qasimAge) {
                    System.out.println("Asim is the youngest");
                }
            }
            else
                System.out.println("invalid option, choose correct option.");
        }*/


        //question 11
        //for my ease i took these here, i will include these in other file.
        /*final String GRADE_F = "F";
        final String GRADE_E = "E";
        final String GRADE_D = "D";
        final String GRADE_C = "C";
        final String GRADE_B = "B";
        final String GRADE_A = "A";

        final int GRADE_F_CRITERIA = 25;
        final int GRADE_E_CRITERIA = 45;
        final int GRADE_D_CRITERIA = 50;
        final int GRADE_C_CRITERIA = 60;
        final int GRADE_B_CRITERIA = 80;


        IfElseIf i = new IfElseIf();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks: ");
        i.setA(sc.nextInt());
        int obtainedMarks=i.getA();
        {
            if (obtainedMarks<GRADE_F_CRITERIA){
                System.out.println(GRADE_F);
            } else if (obtainedMarks>GRADE_F_CRITERIA && obtainedMarks<=GRADE_E_CRITERIA) {
                System.out.println(GRADE_E);
            } else if (obtainedMarks>GRADE_E_CRITERIA && obtainedMarks<=GRADE_D_CRITERIA) {
                System.out.println(GRADE_D);
            } else if (obtainedMarks>GRADE_D_CRITERIA && obtainedMarks<=GRADE_C_CRITERIA) {
                System.out.println(GRADE_C);
            } else if (obtainedMarks>GRADE_C_CRITERIA && obtainedMarks<=GRADE_B_CRITERIA) {
                System.out.println(GRADE_B);
            } else if (obtainedMarks>GRADE_B_CRITERIA) {
                System.out.println(GRADE_A);
            }

        }*/


        //question 10
/*        int yearsOfService = 5;
        int serviceBonus=5;
        IfElseIf i = new IfElseIf();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your years of service: ");
        i.setA(sc.nextInt());
        {
            if (i.getA()>yearsOfService){
                System.out.println("Company decided to give bonus of: "+serviceBonus+"%");
            }
            else
                System.out.println("No Bonus: your years of service does not meet the criteria.");
        }*/


        //question 9
/*        IfElseIf i = new IfElseIf();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost of purchased quantity: ");
        i.setA(sc.nextInt());
        int costOfPurchasedQuantity=1000;

        {
            if (i.getA()>costOfPurchasedQuantity){
                System.out.println("Congratulations! Your total discount is 10%");
                int discount=((i.getA()*10)/100);
                int totalDiscountedCost=i.getA()-discount;
                System.out.println("10% discount is: "+totalDiscountedCost);
                System.out.println("Cost is: "+totalDiscountedCost);
            }
            else
                System.out.println("Your total discount is 0%");
        }*/


        //question 8
/*        IfElseIf i = new IfElseIf();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value A: ");
        i.setA(sc.nextInt());
        System.out.print("Enter value B: ");
        i.setB(sc.nextInt());

        {
            if (i.getA()>i.getB()){
                System.out.println(i.getA()+" A is greater than B "+i.getB());
            }
            else {
                System.out.println(i.getB()+" B is greater than A "+i.getA());
            }
        }*/


        //question7 varA is length and VarB is breadth
        /*IfElseIf i = new IfElseIf();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        i.setA(sc.nextInt());
        System.out.print("Enter breadth: ");
        i.setB(sc.nextInt());
        {
            if ((i.getA() == 0) && (i.getA() == 0)) {
                System.out.println("it is square.");
            } else {
                System.out.println("it is not square.");
            }
        }*/


        //question 6
        /*IfElseIf i = new IfElseIf();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your height in cm: ");
        i.setA(sc.nextInt());
        {
            if (i.getA() > 0 && i.getA() < 70) {
                System.out.println("you are lad.");
            } else if (i.getA() >= 70 && i.getA() < 185) {
                System.out.println("you are an elder.");
            } else if (i.getA() >= 185 && i.getA() < 201) {
                System.out.println("you are senior citizen.");
            } else {
                System.out.println("you are not human.");
            }
        }*/


        //question 5
        /*IfElseIf i = new IfElseIf();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        i.setA(sc.nextInt());
        {
            if(i.getA()==0){
                System.out.println("for digit "+i.getA()+" value is: "+0);
            }
            if(i.getA()>0){

                System.out.println("for digit "+i.getA()+" value is: "+ i.getA());
            }
            if(i.getA()<0){
                int result=i.getA()*(-1);
                System.out.println("for digit "+i.getA()+" value is: "+(result));
            }
        }*/


        //question 4 366 days in a leap year 365 in non leap year
        /*IfElseIf i = new IfElseIf();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of days of a year: ");
        i.setA(sc.nextInt());
        {
            if ((i.getA()>= 365) && (i.getA() <= 366) ){

                    if (!((i.getA() % 365)==0)) {
                        System.out.println("It is a leap year.");
                    } else {
                        System.out.println("It is Not a leap year.");
                    }
                    }
            else{
                System.out.println("invalid value");
            }
        }*/


        //question 3 18+years of age person is eligible to cast vote.
       /* IfElseIf i = new IfElseIf();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        i.setA(sc.nextInt());
        {
            if (i.getA() >= 18) {
                System.out.println("Eligible to cast vote.");
            } else {
                System.out.println("You are not eligible to cast vote.");
            }
        }*/


        //question 2 even odd
       /* IfElseIf i = new IfElseIf();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        i.setA(sc.nextInt());
        if((i.getA()%2)==0){
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd.");
        }*/


        //question 1
        /*IfElseIf i = new IfElseIf();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first value: ");
        i.setA(sc.nextInt());

        System.out.print("Enter second value: ");
        i.setB(sc.nextInt());

        if (i.getA()==i.getB()){
            System.out.println("Both are equal.");
        }
        else {
            System.out.println("Both are not equal.");
        }
*/

    }
}