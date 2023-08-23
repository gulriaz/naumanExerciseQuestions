package AssignmentWhileDoWhileLoops;

import java.util.Map;
import java.util.Scanner;

public class LoopsMain {
    public static void main(String[] args) {
        //==================FOR LOOP===================================

        

        /*LoopSideClass l = new LoopSideClass();
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter: ");
        int max=sc.nextInt(), min=0, singleIntValue,sum=0,count=0;
//        String num1,num2=" ";
        char ch;

        for (int i = min; i < max; i++) {
            System.out.print("Enter a number: ");
            singleIntValue=sc.nextInt();
//            ch=num1.charAt(i);
//            num2=Character.toString(ch);
//            singleIntValue=Integer.parseInt(num2);
            if (singleIntValue%2==0){
                    sum=sum+singleIntValue;
                    count++;
            }
        }
        System.out.printf("sum of even values (%d) is: %d",count,sum);*/

//questondsf
        /*LoopSideClass l = new LoopSideClass();
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter: ");
        int max=sc.nextInt(), min=0, singleIntValue,sum=0,count=0;
//        String num1,num2=" ";
        char ch;

        for (int i = min; i < max; i++) {
            System.out.print("Enter a number: ");
            singleIntValue=sc.nextInt();
//            ch=num1.charAt(i);
//            num2=Character.toString(ch);
//            singleIntValue=Integer.parseInt(num2);
            if (singleIntValue%2!=0){
                    sum=sum+singleIntValue;
                    count++;
            }
        }
        System.out.printf("sum of ODD values (%d) is: %d",count,sum);*/

        //==================Do While Loop Assignment===================
        //questionlast
        /*LoopSideClass l = new LoopSideClass();
        Scanner sc = new Scanner(System.in);
        int number1 = 0, previous = 0, largest=0, smallest=0, set = 1;
        int oldlargest=0,oldsmallest=0;
        boolean status = false;
        char ch = ' ';
        do {
            System.out.println("Enter a number: ");
            number1 = sc.nextInt();
            System.out.println("you have entered: " + number1);
            if(set==1){
                largest=smallest=number1;
                set++;
                System.out.println("=> largest: "+largest);
                System.out.println("=> smallest: "+ smallest);
            }else if(set==2) {

                if (!(largest > number1)) {
                    oldlargest=largest;
                    largest = number1;
                }
                if (oldlargest<smallest) {
                        smallest=oldlargest;
                }

                if (!(smallest < number1)) {
                    oldsmallest=smallest;
                    smallest = number1;
                }
                if(oldsmallest>largest){
                    largest=oldsmallest;
                }
                System.out.println("===> largest: "+largest);
                System.out.println("===> smallest: "+ smallest);

            }
            System.out.println("Do you wish to try again (press y): ");
            ch = sc.next().charAt(0);
            if (ch == 'y' || ch == 'Y') {
                status = true;

            } else status = false;

            System.out.println("=> " + status);

        } while (status == true);

        System.out.println("largest number is: " + largest);
        System.out.println("smallest number is: " + smallest);*/


        /*//q
        LoopSideClass l = new LoopSideClass();
        Scanner sc = new Scanner(System.in);
        int intValuePostive = 0,digitUsed=0,count=0,root=0;
        System.out.print("Enter a number: ");
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            System.out.println("=> " + number);
            if (number > 0) {
                intValuePostive = number;
                digitUsed=number;
            }
        }

        do {

            if((digitUsed%intValuePostive)==0){

                count++;
            }
            intValuePostive--;
        } while (intValuePostive >= 1);

        if(count>2){
            System.out.println("it is not a prime number.");
        }else System.out.println("it is a prime number.");*/

        //q4
        /*LoopSideClass l = new LoopSideClass();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number(base).");
        String fnumber=sc.next();

        int intvalue;
        int length=fnumber.length()-1;
        int sumOdd=0,sumEven=0;
        char ch;
        do{
            ch=fnumber.charAt(length);
            intvalue=Integer.parseInt(Character.toString(ch));
            if((intvalue%2)==0) {
                sumEven =sumEven+intvalue;
            }else
                sumOdd=sumOdd+intvalue;

            length--;
        } while (length>=0);
        System.out.println("total sum of even values: "+sumEven);
        System.out.println("total sum of odd values: "+sumOdd);*/

        //q2
        /*LoopSideClass l = new LoopSideClass();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number(base).");
        String fnumber=sc.next();
        int length=fnumber.length()-1;
        do{
            System.out.print(fnumber.charAt(length));

            length--;
        } while (length>=0);
*/


        //q1
/*
        LoopSideClass l = new LoopSideClass();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number(base).");
        int fnumber=sc.nextInt();
        System.out.print("Enter the second number(power).");
        int snumber=sc.nextInt(),product=1;
        do{
            product=product*fnumber;
            snumber--;
        } while(snumber>=1);
        System.out.println("value is: "+product);
*/
//==================While Loop Assignment======================
        //question28
        //highest common factor
        /*LoopSideClass l = new LoopSideClass();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int intValue1 = sc.nextInt();
        System.out.print("Enter a number : ");
        int intValue2 = sc.nextInt();
        int result1,result2,iterate=1,stopFlag,hcfResult=1,innerCounter=2;

        if(intValue1>intValue2){
            stopFlag=intValue1;
        }else stopFlag=intValue2;

        while ( iterate<= stopFlag) {
            while (innerCounter<=stopFlag) {
                result1 = (intValue1 % innerCounter);//checking if it is the root or not.
                result2 = (intValue2 % innerCounter);

                if (result1 == 0 && result2 == 0) {
                    intValue1 = intValue1 / innerCounter;//value1 is updated.
                    intValue2 = intValue2 / innerCounter;//value2 is updated.

                    System.out.println("=>val1 updated "+intValue1+" counter is:"+innerCounter);
                    System.out.println("=>val2 updated "+intValue2+" counter is:"+innerCounter);


                    hcfResult = hcfResult * innerCounter; //so, iterate value is the root, saving it.
                    System.out.println("=> hcf: "+hcfResult);

                    innerCounter=1;

                }else if(result1==0){
                    intValue1 = intValue1 / innerCounter;//value1 is updated.
                    System.out.println("=>val1 updated "+intValue1+" counter is:"+innerCounter);
                    System.out.println("=>val2 same "+intValue2);
                    innerCounter=1;
                }else if(result2==0){
                    intValue2 = intValue2 / innerCounter;//value1 is updated.
                    System.out.println("=>val2 updated "+intValue2+" counter is:"+innerCounter);
                    System.out.println("=>val1 same "+intValue1);
                    innerCounter=1;
                }if(intValue1==1 && intValue2==1){
                    System.out.println("Highest common factor is: "+hcfResult);
                    System.out.println("outer exit called.");
                    System.exit(0);
                }


                innerCounter++;

            }
            iterate++;
        }*/


        //Highest common multiple
        /*LoopSideClass l = new LoopSideClass();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int intValue1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int intValue2 = sc.nextInt();
        int startFlag = 1,stopFlag, resultOuter,resultInner, countInner = 1,notEqualCounter=0,hcfSaved=0;

        if(intValue1>intValue2){
            stopFlag=intValue1;
        }else stopFlag=intValue2;

        while (startFlag <= stopFlag) {//initially stop flag is 0.
            resultOuter = intValue1 * startFlag;
//            System.out.println("=> outer: "+resultOuter);
            while (countInner <= stopFlag) {//initially stop flag is 0.
                resultInner = intValue2 * countInner;
//                System.out.println("--> Inner: "+resultInner);
                if(resultOuter==resultInner){
                    hcfSaved=resultInner;
                }
                else {
//                    System.out.println("LCM found: "+resultInner);
                }
                countInner++;
//                System.out.println("++=>counter Inner: "+countInner);
            }
            countInner = 1;
            startFlag++;
//            System.out.println("++=>counter Outer: "+startFlag);
            if(startFlag==(stopFlag+1)){
                System.out.println("HCM found: "+hcfSaved);
            }

        }*/

        //question27
        /*LoopSideClass l = new LoopSideClass();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int intValue1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int intValue2 = sc.nextInt();
        int startFlag = 1,stopFlag, resultOuter,resultInner, countInner = 1;

        if(intValue1>intValue2){
            stopFlag=intValue1;
        }else stopFlag=intValue2;

        while (startFlag <= stopFlag) {//initially stop flag is 0.
            resultOuter = intValue1 * startFlag;
//            System.out.println("=> outer: "+resultOuter);
            while (countInner <= stopFlag) {//initially stop flag is 0.
                resultInner = intValue2 * countInner;
//                System.out.println("--> Inner: "+resultInner);
                if(resultOuter==resultInner){
                    System.out.println("LCM found: "+resultInner);
                    System.exit(0);
                }

                countInner++;
//                System.out.println("++=>counter Inner: "+countInner);

            }
            countInner = 1;
            startFlag++;
//            System.out.println("++=>counter Outer: "+startFlag);
            if(startFlag==(stopFlag+1)){
                System.out.println("LCM not found, after 10 iterations.");
            }

        }*/


        //question26
        /*LoopSideClass l = new LoopSideClass();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int intValue1 = sc.nextInt();
        int result1,rootCount=1,iterate=1;
        StringBuilder strB = new StringBuilder();
        //int length=stringVal.length()-1;
        String str;
        while ( iterate<= intValue1) {

            result1 = (intValue1 % iterate);//checking if it is the root or not.
            if (result1 == 0) {
                strB.append("root ");
                strB.append(rootCount);
                strB.append(": ");
                strB.append(iterate); //so, iterate value is the root, saving it.
                strB.append("\n");
                rootCount++;
            }
            iterate++;
        }
        str=strB.toString();

        System.out.println(str);*/


        //question25
        /*LoopSideClass l = new LoopSideClass();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        String stringVal=sc.next();
        int length=stringVal.length()-1, intValue1;
        char cZero=' ',cOne=' ',cTwo=' ',cThree=' ',cFour=' ',cFive=' ',cSix=' ',cSeven=' ',cEight=' ',cNine=' ';
        char ch;
        String str;
        while (length>=0) {
            ch=stringVal.charAt(length);
            str=Character.toString(ch);
            intValue1=Integer.parseInt(str);
            switch (intValue1) {
                case 0 -> cZero=(char)intValue1;
                case 1 -> cOne=(char)intValue1;
                case 2 -> cTwo=(char)intValue1;
                case 3 -> cThree=(char)intValue1;
                case 4 -> cFour=(char)intValue1;
                case 5 -> cFive=(char)intValue1;
                case 6 -> cSix=(char)intValue1;
                case 7 -> cSeven=(char)intValue1;
                case 8 -> cEight=(char)intValue1;
                case 9 -> cNine=(char)intValue1;
                default -> System.out.println("Switch ERROR: value is not int.");
            }
            length--;
        }
        System.out.println("there are: ");
        System.out.printf("zeros': %s",cZero);
        System.out.print(" ");
        System.out.printf("Ones': %s",cOne);
        System.out.print(" ");
        System.out.printf("Twos': %s",cTwo);
        System.out.println();
        System.out.printf("Threes': %s",cThree);
        System.out.print(" ");
        System.out.printf("Fours': %s",cFour);
        System.out.print(" ");
        System.out.printf("Fives': %s",cFive);
        System.out.println();
        System.out.printf("Sixes': %s",cSix);
        System.out.print(" ");
        System.out.printf("Sevens': %s",cSeven);
        System.out.print(" ");
        System.out.printf("Eights': %s",cEight);
        System.out.println();
        System.out.printf("Nines': %s",cNine);*/

        //question24
        /*LoopSideClass l = new LoopSideClass();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        String stringVal=sc.next();
        int length=stringVal.length()-1, intValue1;
        int cZero=0,cOne=0,cTwo=0,cThree=0,cFour=0,cFive=0,cSix=0,cSeven=0,cEight=0,cNine=0;
        char ch;
        String str;
        while (length>=0) {
            ch=stringVal.charAt(length);
            str=Character.toString(ch);
            intValue1=Integer.parseInt(str);
            switch (intValue1) {
                case 0 -> cZero++;
                case 1 -> cOne++;
                case 2 -> cTwo++;
                case 3 -> cThree++;
                case 4 -> cFour++;
                case 5 -> cFive++;
                case 6 -> cSix++;
                case 7 -> cSeven++;
                case 8 -> cEight++;
                case 9 -> cNine++;
                default -> System.out.println("Switch ERROR: value is not int.");
            }
            length--;
        }
        System.out.println("there are: ");
        System.out.printf("zeros': %d",cZero);
        System.out.print(" ");
        System.out.printf("Ones': %d",cOne);
        System.out.print(" ");
        System.out.printf("Twos': %d",cTwo);
        System.out.println();
        System.out.printf("Threes': %d",cThree);
        System.out.print(" ");
        System.out.printf("Fours': %d",cFour);
        System.out.print(" ");
        System.out.printf("Fives': %d",cFive);
        System.out.println();
        System.out.printf("Sixes': %d",cSix);
        System.out.print(" ");
        System.out.printf("Sevens': %d",cSeven);
        System.out.print(" ");
        System.out.printf("Eights': %d",cEight);
        System.out.println();
        System.out.printf("Nines': %d",cNine);*/

        //question23
        /*LoopSideClass l = new LoopSideClass();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        String intVal=sc.next();
        int val123=Integer.parseInt(intVal);

        int intValue1;
        String st;
        int length=intVal.length()-1;
        int sum=0;
        double result1=0;
        char ch;
        while (length>=0) {
            ch=intVal.charAt(length);
            st=Character.toString(ch);
            intValue1=Integer.parseInt(st);
            result1=Math.pow(intValue1,3);
            sum=sum+(int)result1;
            length--;
        }
        if(sum==val123) {
            System.out.println("This is an Armstrong number: "+val123);
        }else System.out.println("This is NOT an Armstrong number.");*/


        //question22
        /*LoopSideClass l = new LoopSideClass();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        String intVal=sc.next();
        int intValue1=Integer.parseInt(intVal);
        int length=intVal.length()-1;
        int sum=0;
        int product=1,var1=0;
        String st;
        while (length>=0) {
//            System.out.println("length: "+length);
                char ch=intVal.charAt(length);
                st=Character.toString(ch);
                int innerIntValue=Integer.parseInt(st);
                int i2=innerIntValue;
//            System.out.println("innerIntValue: "+innerIntValue);
            while (innerIntValue >= 1) {
                product = product * innerIntValue;
                var1=product;

                innerIntValue--;

            }
            System.out.println("factorial of: "+i2+" is: "+ var1);
            sum=sum+product;
            product=1;
            length--;
        }
        System.out.println("sum: "+sum);

        if(sum== intValue1){
            System.out.println("it is strong value.");
        }else System.out.println("it is not strong value.");*/


        //question21
/*        LoopSideClass l = new LoopSideClass();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a palindrome : ");
        String wordUserInput=sc.next();
        int wordLength=wordUserInput.length()-1;
        StringBuilder str = new StringBuilder();
        while (wordLength>=0){
            str.append(wordUserInput.charAt(wordLength));
            wordLength--;
        }
        String checkWord=str.toString();

        if(wordUserInput.equals(checkWord)){
            System.out.println("it is palindrome.");
        }else System.out.println("it is not palindrome.");*/


        //question20
        /*LoopSideClass l = new LoopSideClass();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a digit: ");
        int digitValue=sc.nextInt();
        int resetdigitValue=digitValue;
        int digitValueRemainder,counter=0,val1=0,val2=0,val3=0,set=0;

        while(digitValue>0){

            if(digitValue>=10) {
                digitValueRemainder=digitValue%10;
                digitValue = digitValue / 10;
            }else{
                digitValueRemainder=digitValue;
                digitValue=digitValue/10;
            }

            if(counter==0){
                val1=digitValueRemainder;
                set=1;
            }else {
                int innerCounter=counter;

                    if(set==1) {
                        val2 = digitValueRemainder * 10;
                        val3=val1+val2;

                        set=0;
                    } else {
                        int innerInnerCounter=innerCounter;
                        int val21=digitValueRemainder;
                        while (innerInnerCounter>=1) {
                            val21 = val21 * 10;
                            innerInnerCounter--;
                        }
                        val2=val21;
                        val3 = val3 + val2;

                    }

            }
//            System.out.println("reverse value is: "+digitValueRemainder);
            counter++;

        }

        int maxLength=counter;

        int cCounter=0, val39=0;

        digitValue=resetdigitValue;

        while(digitValue>0){

            if(digitValue>=10) {
                digitValueRemainder=digitValue%10;
                digitValue = digitValue / 10;
            }else{
                digitValueRemainder=digitValue;
                digitValue=digitValue/10;
            }

            if(cCounter==0){
                int innerInnerCounter=(maxLength-1);//maximum number of zeros
                val39=digitValueRemainder;
                while (innerInnerCounter>=1) {
                    val39 = val39 * 10;
                    innerInnerCounter--;
                }
                System.out.println("first value: "+val39);
//                val1=digitValueRemainder;
                set=1;
            }else {
                int innerCounter=cCounter;
                if(set==1) {
                    int innerInnerCounter=(maxLength-1)-innerCounter;//maximum number of zeros
                    int val22=digitValueRemainder;
                    while (innerInnerCounter>=1) {
                        val22 = val22 * 10;
                        innerInnerCounter--;
                    }
                    System.out.println("second value: "+val22);
//                    val2 = digitValueRemainder * 10;
                    val3=val39+val22;

                    System.out.println("sum of val21+22="+val3);

                    set=0;
                } else {
                    int innerInnerCounter=(maxLength-1)-innerCounter;
                    val39=digitValueRemainder;
                    while (innerInnerCounter>=1) {
                        val39 = val39 * 10;
                        innerInnerCounter--;
                    }

                    val3 = val3 + val39;

                    System.out.println("value next: "+val39);
                    System.out.println("sum of values uptill: "+val3);
                }

            }

//            System.out.println("reverse value is: "+digitValueRemainder);
            cCounter++;
        }

        System.out.println("total length: "+cCounter);
        System.out.println("reverse of value is: "+val3);*/


        //question19
        /*LoopSideClass l = new LoopSideClass();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a digit: ");
        int digitValue=sc.nextInt();
        String intToStr=Integer.toString(digitValue);
        int len=intToStr.length();
        len--;
        int productValue=1;
        while (len>=0){
            productValue=productValue*(Integer.parseInt(Character.toString(intToStr.charAt(len))));
            len--;
        }
        System.out.println("product of all digits is: "+productValue);*/


        //question18
       /* LoopSideClass l = new LoopSideClass();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a digit: ");
        int digitValue=sc.nextInt();
        String intToStr=Integer.toString(digitValue);
        int len=intToStr.length();
        len--;
        int sum=0;
        while (len>=0){
            sum=sum+(Integer.parseInt(Character.toString(intToStr.charAt(len))));
            len--;
        }
        System.out.println("Sum of all digits is: "+sum);*/


        //question17
        /*LoopSideClass l = new LoopSideClass();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        l.setStringNewValueUserInput(sc.next());
        int productValue = 0;
        char chAtIndex, tempFirstIndexChar=l.getStringNewValueUserInput().charAt(productValue);
        char tempSecondIndexChar=l.getStringNewValueUserInput().charAt((l.getStringNewValueUserInput().length() - 1));
        StringBuilder str=new StringBuilder();

        while (productValue <= (l.getStringNewValueUserInput().length() - 1)) {
            switch (productValue==0?0:(productValue==(l.getStringNewValueUserInput().length() - 1))?1:-1) {
                case 0-> {
                    str.append(tempSecondIndexChar);
                }
                case 1-> {
                    str.append(tempFirstIndexChar);
                }
                case -1 -> {
                    chAtIndex = l.getStringNewValueUserInput().charAt(productValue);
                    str.append(chAtIndex);
                }
            }
            productValue++;
        }
        l.setStringNewValueUserInput(str.toString());
        System.out.println("New String is: "+l.getStringNewValueUserInput());*/


        //question16
        /*LoopSideClass l = new LoopSideClass();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        l.setStringNewValueUserInput(sc.next());
        int productValue = 0,sum=0,intAtIndex;
        char chAtIndex;
        String strAtIndex;
        while (productValue <= (l.getStringNewValueUserInput().length() - 1)) {
            switch (productValue==0?0:(productValue==(l.getStringNewValueUserInput().length() - 1))?1:-1) {
                case 0-> {
                    chAtIndex = l.getStringNewValueUserInput().charAt(productValue);
                    System.out.print("first digit: "+chAtIndex);
                    System.out.println();
                    strAtIndex = Character.toString(chAtIndex);
                    intAtIndex=Integer.parseInt(strAtIndex);
                    sum=sum+intAtIndex;
                }
                case 1-> {
                    chAtIndex = l.getStringNewValueUserInput().charAt(productValue);
                    System.out.print("last digit: "+chAtIndex);
                    System.out.println();
                    strAtIndex = Character.toString(chAtIndex);
                    intAtIndex=Integer.parseInt(strAtIndex);
                    sum=sum+intAtIndex;
                }
            }
            productValue++;
        }
        System.out.println("Sum of first and last digit is: "+sum);*/


        //question15
        /*LoopSideClass l = new LoopSideClass();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        l.setStringNewValueUserInput(sc.next());
        int productValue = 0;
        while (productValue <= (l.getStringNewValueUserInput().length() - 1)) {
            switch (productValue==0?0:(productValue==(l.getStringNewValueUserInput().length() - 1))?1:-1) {
                case 0-> {
                    char chAtIndex = l.getStringNewValueUserInput().charAt(productValue);
                    System.out.print("first digit: "+chAtIndex);
                    System.out.println();
                }
                case 1-> {
                    char chAtIndex = l.getStringNewValueUserInput().charAt(productValue);
                    System.out.print("last digit: "+chAtIndex);
                    System.out.println();
                }
            }
            productValue++;
        }*/

        //question14
        /*LoopSideClass l = new LoopSideClass();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        l.setStringNewValueUserInput(sc.next());
        int productValue = 0;
        while (productValue <= (l.getStringNewValueUserInput().length() - 1)) {
            char chAtIndex = l.getStringNewValueUserInput().charAt(productValue);
            String strAtIndex = Character.toString(chAtIndex);
            int intAtIndex=Integer.parseInt(strAtIndex);


            switch (intAtIndex) {case 1-> System.out.print(" One ");
                case 2-> System.out.print(" Two ");
                case 3-> System.out.print(" Three ");
                case 4-> System.out.print(" Four ");
                case 5-> System.out.print(" Five ");
                case 6-> System.out.print(" Six ");
                case 7-> System.out.print(" Seven ");
                case 8-> System.out.print(" Eight ");
                case 9-> System.out.print(" Nine ");
                case 0-> System.out.print(" Zero ");
                default -> {System.out.println();
                    System.out.println("invalid digit.");
                }
            }
            productValue++;
        }
        System.out.println("\n");
        System.out.println("Total number of digits are: "+(productValue));*/


        //question13
/*
        LoopSideClass l = new LoopSideClass();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        l.setStringNewValueUserInput(sc.next());
        int productValue = 0;
        while (productValue <= (l.getStringNewValueUserInput().length() - 1)) {
            char chAtIndex = l.getStringNewValueUserInput().charAt(productValue);
            String strAtIndex = Character.toString(chAtIndex);
            int intAtIndex=Integer.parseInt(strAtIndex);


            switch (intAtIndex) {case 1-> System.out.print(" One ");
                case 2-> System.out.print(" Two ");
                case 3-> System.out.print(" Three ");
                case 4-> System.out.print(" Four ");
                case 5-> System.out.print(" Five ");
                case 6-> System.out.print(" Six ");
                case 7-> System.out.print(" Seven ");
                case 8-> System.out.print(" Eight ");
                case 9-> System.out.print(" Nine ");
                case 0-> System.out.print(" Zero ");
                default -> {System.out.println();
                    System.out.println("invalid digit.");
                }
            }
            productValue++;
        }
        System.out.println("\n");
        System.out.println("Loop Terminated.");
*/

        //question12
        /*LoopSideClass l = new LoopSideClass();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        l.setIntValueUserInput(sc.nextInt());
        int j = 1, counter=1;
        int value=0;
        while (j <= l.getIntValueUserInput()) {
                int k =(l.getIntValueUserInput() / j);
                if (((k*j) == l.getIntValueUserInput()) && counter<=l.getIntValueUserInput()) {
                    value = value+1;

                }
            counter++;
                j++;
        }
        if(value==2) System.out.println(l.getIntValueUserInput()+" is a prime number.");
        else System.out.println(l.getIntValueUserInput()+" it is not a prime number.");*/

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
        int productValue=1;
        while (productValue<=l.getMultiplicationRange()){
            l.setMultiplicationResult(l.getMultiplicationTable()*productValue);

            switch ((l.isDivisibleBy(l.getMultiplicationResult()))?l.getMultiplicationResult():0) {
                case 0 -> System.out.println("Not divisible by five: invalid result1.");
                default->
                {System.out.printf("%d x %d = %d", l.getMultiplicationTable(), productValue, l.getMultiplicationResult());
                    System.out.println();}}

            productValue++;
        }*/

        //question9
        /*LoopSideClass l = new LoopSideClass();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value for the table you want to display? ");
        l.setMultiplicationTable(sc.nextInt());
        int productValue=1;
        while (productValue<=12){
            l.setMultiplicationResult(l.getMultiplicationTable()*productValue);

        switch ((l.isDivisibleBy(l.getMultiplicationResult()))?l.getMultiplicationResult():0) {
            case 0 -> System.out.println("Not divisible by five: invalid result1.");
            default->
            {System.out.printf("%d x %d = %d", l.getMultiplicationTable(), productValue, l.getMultiplicationResult());
            System.out.println();}}

            productValue++;
        }*/

        //question8
        /*LoopSideClass l = new LoopSideClass();
        Scanner sc = new Scanner(System.in);
        int productValue,j=1,k=1;
        System.out.print("Enter an integer value: ");
        productValue=sc.nextInt();
        while (j<=3){
            k=productValue*k;
            j++;
        }
        System.out.printf("cube of an integer(%d) is: %d",productValue,k);*/

        //question7
        /*LoopSideClass l = new LoopSideClass();
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int productValue=1;
        while (productValue<=10){
            switch (productValue) {
                case 1 ->{
                System.out.printf("Enter %dst value: ", productValue);
                l.valueUserInput = sc.nextInt();
                sum = sum + l.valueUserInput;
            } case 2 -> {
                System.out.printf("Enter %dnd value: ", productValue);
                l.valueUserInput = sc.nextInt();
                sum = sum + l.valueUserInput;
            } case 3 -> {System.out.printf("Enter %drd value: ", productValue);
                    l.valueUserInput = sc.nextInt();
                    sum = sum + l.valueUserInput;
                }
                default -> {System.out.printf("Enter %dth value: ", productValue);
                    l.valueUserInput = sc.nextInt();
                    sum = sum + l.valueUserInput;
                }
            }

            productValue++;
        }
        productValue=productValue-1;
        System.out.printf("Total numbers(%d) and their sum is: %d",productValue,sum);
        System.out.println();
        System.out.printf("Total numbers(%d) and their avg is: %.2f",productValue,(float)(sum/productValue));*/

        //question6
        /*LoopSideClass l = new LoopSideClass();
        Scanner sc = new Scanner(System.in);

        int productValue=1;
        while (productValue<=10){
            int squareResult=productValue*productValue;
            System.out.printf("number(%d) square is: %d",productValue,squareResult);
            System.out.println();
            productValue++;
        }*/


        //question5
/*
        LoopSideClass loop = new LoopSideClass();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value you to find a factorial: ");
        loop.setFactorialUserInputInt(sc.nextInt());
        int userRequestedFactorialIntValue = loop.getFactorialUserInputInt();
        int productValue = 1;
        while (loop.getFactorialUserInputInt()>=productValue){
                    loop.setProductOfNaturalNumbers(loop.getFactorialUserInputInt()*loop.getProductOfNaturalNumbers());
            loop.setFactorialUserInputInt(loop.getFactorialUserInputInt()-1);
        }
        System.out.printf("factorial(%d) is: %d",userRequestedFactorialIntValue,loop.getProductOfNaturalNumbers());
*/

        //question4
        /*LoopSideClass loop = new LoopSideClass();
        int productValue = 1;
        while (productValue <= 10) {
            int oldSum = loop.getSumOfNaturalNumbers();
            if(!((productValue%2)==0)) {
                loop.setSumOfNaturalNumbers(loop.getSumOfNaturalNumbers() + productValue);
                System.out.println("Sum of " + productValue + " and " + oldSum + " is: " + loop.getSumOfNaturalNumbers());
            }
            productValue++;
        }*/

        //question3
        /*LoopSideClass loop = new LoopSideClass();
        int productValue = 1;
        while (productValue <= 10) {
            int oldSum = loop.getSumOfNaturalNumbers();
            loop.setSumOfNaturalNumbers(loop.getSumOfNaturalNumbers() + productValue);
            System.out.println("Sum of " + productValue + " and " + oldSum + " is: " + loop.getSumOfNaturalNumbers());
            productValue++;
        }*/

        //question2
        /*LoopSideClass loop = new LoopSideClass();
        int productValue = 1;
        while (productValue <= 10) {
            loop.setSumOfNaturalNumbers(loop.getSumOfNaturalNumbers() + productValue);
            productValue++;
        }
        System.out.println("Sum of first 10 natural numbers are: " + loop.getSumOfNaturalNumbers());*/

        //question1
        /*int productValue=1;
        while (productValue <=10) {
            System.out.println("Natural number: "+productValue);
            productValue++;
        }*/


    }
}
