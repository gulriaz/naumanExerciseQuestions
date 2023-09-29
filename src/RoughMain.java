import InheritanceOverriding.Bicycle;
import InheritanceOverriding.Personal;
import InheritanceOverriding.Plane;
import InheritanceOverriding.Shared;
import org.w3c.dom.Node;

import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.chrono.HijrahDate;
import java.time.chrono.HijrahEra;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalField;
import java.util.*;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RoughMain {
    {
        //initializer block
        int n = 3;
        System.out.println(n);
    }

    public static void main(String[] args) throws RuntimeException, Exception {

        System.out.println();


        //HashMap
        /*HashMap<String,String> hMap = new HashMap<>();
        hMap.put("x","y");
        hMap.put("javaid","gulraiz");
        hMap.put("a","b");

        System.out.println(hMap);*/


        //initializer block
        //we know if any class has initializer block than block is called with the
        //constructor of that class.

        /*  RoughMain r = new RoughMain();*/


        //revision of list outside main handling.
        /*Consumer<Integer> valueSet = n-> {

            if( n.equals(3)){
                System.out.println("valueSet is accessed & improved.");
                n = n+3;
                System.out.println("Now: "+n);
            }
        };

        List<Integer> l = Arrays.asList(3,5);
        l.forEach(valueSet);*/

/*
        //revision of list functions
        ZonedDateTime z = ZonedDateTime.now();
        System.out.println(z);
//        LocalTime l = LocalTime.now();
//        System.out.println(l);
        System.out.println();
        ArrayList<String> str = new ArrayList<>() {{
            add("Black");
            add("Indigo");
        }};

        String[] newArray = new String[str.size()];

        str.toArray(newArray); // Arraylist is saved into an array newArray

        Stream<String> stre = Arrays.stream(newArray); // converting array to stream.

        List<String> newListFromArrayList = stre.collect(Collectors.toList()); // finally converted to list.

        Consumer<String> toLowerCase = n -> {
            System.out.println("lowercase conversion: " + n.toLowerCase());
        };

        Consumer<String> toUpperCase = n -> {
            System.out.println("uppercase conversion: " + n.toUpperCase());
        };

        Consumer<String> toInItCap = n -> {
            System.out.println("No method implemented");
        };

        newListFromArrayList.forEach(toLowerCase);
        newListFromArrayList.forEach(toUpperCase);
        newListFromArrayList.forEach(toInItCap);*/

/*
        //revision List class.
        ZonedDateTime z = ZonedDateTime.now();
//        System.out.println(z);
        LocalTime l = LocalTime.now();
        System.out.println(l);

        ArrayList<String> str = new ArrayList<>() {{
            add("Black");
            add("Indigo");
        }};

//        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Orange", "White");
        List<String> colors = Arrays.asList("Red", "Red","Red", "White");
        //when list is created it size is fixed and cannot add any new item.

        String[] newArray = new String[str.size()];

        str.toArray(newArray); // Arraylist is saved into an array newArray

        Stream<String> stre = Arrays.stream(newArray); // converting array to stream.

        List<String> newListFromArrayList = stre.collect(Collectors.toList()); // finally converted to list.

        colors.addAll(0, newListFromArrayList);

        System.out.println("Arraylist Original "+str);
        for (int i = 0; i < colors.size(); i++) {

            if(str.contains(colors.get(i))){

            }else {
                str.add(colors.get(i));
            }
        }
        HashSet<String> h = new HashSet<>(str);

        System.out.println("HashSET: "+h);

        System.out.println("Colors list "+colors);*/


//        Collectors.toList();
//        colors.addAll(newArray);
//        if(colors.containsAll(str)) {
//            System.out.println("all match found.");
//        }
//        else System.out.println("all record not matched.");


        //learning HashSet table.
        /*LocalTime timeCurrent = LocalTime.now();
        DateTimeFormatter timeformat = DateTimeFormatter.ofPattern("HH:mm:ss");

        String newTimeCurrentFormatted = timeCurrent.format(timeformat);

        System.out.println("welcome! " + newTimeCurrentFormatted);

        //starting HashSet table

        HashSet<String> vehicles = new HashSet<>();
        vehicles.add("Boolan");
        vehicles.add("Honda city");
        vehicles.add("Honda civic");
        vehicles.add("Prius");

        System.out.println("Printing complete HashSet: ");
//        System.out.println(vehicles);

        Consumer<String> namesOfItems = n ->{
            String s = n + ".";
            System.out.println(s);
        };

        vehicles.forEach(namesOfItems);*/


        //creating hashmap key,value concept.  put, get, clear, remove, size

/*
        LocalTime timeCurrent = LocalTime.now();
        DateTimeFormatter timeformat = DateTimeFormatter.ofPattern("HH:mm:ss");

        String newTimeCurrentFormatted = timeCurrent.format(timeformat);

        System.out.println("welcome! "+ newTimeCurrentFormatted);

        HashMap<String,String> citiesOfCapitalStates = new HashMap<String,String>();
        citiesOfCapitalStates.put("Pakistan","Islamaabd");
        citiesOfCapitalStates.put("Germany","Berlin");

        System.out.println(citiesOfCapitalStates);
        System.out.println(citiesOfCapitalStates.size());
        System.out.println();

        System.out.print("searching hashmap for Pakistan capital:");
        System.out.print(citiesOfCapitalStates.get("Pakistan"));

        System.out.println();
        System.out.print("!!!Germany removed!!! ");
        citiesOfCapitalStates.remove("Germany");

        System.out.println(citiesOfCapitalStates);
        System.out.println(citiesOfCapitalStates.size());
        System.out.println();

        System.out.println("Clear all hashmap: ");
        citiesOfCapitalStates.clear();

        System.out.println(citiesOfCapitalStates);
        System.out.println(citiesOfCapitalStates.size());


        System.out.println("good bye!");
*/


        //date time settings: w3schools
//        LocalTime timeget = LocalTime.now();
//        DateTimeFormatter timeformat = DateTimeFormatter.ofPattern("HH:mm:ss");
//
//        String newTimeGetFormatted=timeget.format(timeformat);
//
//        System.out.println(newTimeGetFormatted);


        //holala jhingalala important.
        /*ArrayList<Integer> list = new ArrayList() {{add(12);add(26);}};
        list.add(25);
        list.add(26);
        list.add(0);
        list.add(2);
        list.add(30);

        list.sort(null);
        System.out.println(Arrays.toString(list.toArray()));

        Consumer<Integer> readingInt = n->{ System.out.println(n);};

        list.forEach(readingInt);


        System.out.println();
        for (int i: list) {
            System.out.println(i);
        }*/


        //practice
       /* ArrayList<inheritanceRough.CAnimal> animal = new ArrayList<>();
        animal.add(new inheritanceRough.CMamels());
        animal.add(new inheritanceRough.CRaptiles());

//        animal.add(new inheritanceRough.CCarnivor());
//        animal.add(new inheritanceRough.CHerbivore());

        animal.add(new inheritanceRough.Buffalo());


        for (inheritanceRough.CAnimal ani:animal) {

            if(ani instanceof inheritanceRough.Buffalo){
                inheritanceRough.Buffalo c = (inheritanceRough.Buffalo)ani;
                System.out.println("-----------------");
                c.show();
                System.out.println("-----------------");
            }else {
//                ani.show();
                System.out.println(ani.toString());
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
        inheritanceRough.CMamels c = new inheritanceRough.CMamels();
        //Object d = new Object();//
        //d.wait(200,0);//
        System.out.println(c.toString(0));
        System.out.println(c.toString());
*/

        //concept of inheritance with vehicles example.
        /*inheritanceRough.Vehicles v= new inheritanceRough.Vehicles();
        System.out.println(v.vehCat);
        inheritanceRough.Car v2 = new inheritanceRough.Car();
        System.out.println();*/


        //Concept of Inheritance with animal examples.
/*
        inheritanceRough.Buffalo b = new inheritanceRough.Buffalo();
        System.out.println("inheritanceRough.Buffalo digestive system produces: " + b.buffaloGas);
        System.out.println("inheritanceRough.Buffalo gives: " + b.buffaloMilk);
        System.out.println("Herbivore eats: " + b.herbivoreEats);
        System.out.println("Mammals birth: " + b.mamelsBirth);
        System.out.println("Mammals eat: " + b.mamelsEat);
        System.out.println("Mammals walk: " + b.mamelsWalk);
        System.out.println("Mammals Danger like: " + b.animalDanger);
        System.out.println("Mammals perfume like: " + b.animalPerfume);
        System.out.println("Mammals tail like: " + b.animalTail);
*/
//--------------------------------------------------------------------

//        inheritanceRough.CAnimal a = new inheritanceRough.CMamels();
//
//        //done casting animal to mamels just for using them.
//        inheritanceRough.CMamels a1 = (inheritanceRough.CMamels) a;


        //        inheritanceRough.CHerbivore c = new inheritanceRough.Buffalo();

        //parent class unable to access child variables.??? parent class holds the objects of child class.


        //arraylist  with mushtaq bhai.
        /*int len=5;
        int[] numbers = new int[len];
        int[] numbers2 = new int[len];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a value: ");
            numbers[i]=(sc.nextInt());
        }
        for (int i = 0; i < numbers.length; i++) {
            numbers2[i]=numbers[i];
        }
        System.out.println(Arrays.toString(numbers2));*/


        //qusetion umar bhai allamiqbal wala problems.
        /*Scanner sc = new Scanner(System.in);
        int valueInt;
        char status = 'y';

        while (status == 'y' || status == 'Y') {
            valueInt = 0;
            while (valueInt <= 0) {
                System.out.println("Enter a number: ");
                valueInt = sc.nextInt();
            }

            if (valueInt % 2 == 0) {
                System.out.println(valueInt + ": even entered.");
            } else System.out.println(valueInt + ": odd entered.");

            System.out.println("===============================");
            System.out.println(" press y to run again: ");
            status = sc.next().charAt(0);
        }
        System.out.println("programme forcefully stopped.");
*/

//again practice of getting part of image for mushtaq bhai
/*
        BufferedImage sourceImageTV =null, sourceImageButterfly=null;
        File file = null, file2=null;
        Scanner sc = new Scanner(System.in);
        try {
            file = new File("C:\\Users\\mypc\\Desktop\\horseImage.jpg");
            file2 = new File("C:\\Users\\mypc\\Desktop\\butterfly.jpeg");
            sourceImageTV = ImageIO.read(file);
            sourceImageButterfly = ImageIO.read(file2);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        if (sourceImageTV != null) {
            int widthPlusFive = sourceImageTV.getWidth();
            System.out.println("Max column: "+widthPlusFive);
            int heightPlusFive = sourceImageTV.getHeight();
            System.out.println("Max row: "+heightPlusFive);

            BufferedImage effectImage = new BufferedImage(widthPlusFive, heightPlusFive, sourceImageTV.getType());
            for (int row = 0; row < effectImage.getHeight(); row++) {
                for (int col = 0; col < effectImage.getWidth(); col++) {
                    if(row>=5 && row<=345 && col>=10 && col<=461) {

                        effectImage.setRGB(col,row,sourceImageTV.getRGB(col,row));

                    }
                    else
                        effectImage.setRGB(col,row,Color.GRAY.getRGB());
                }
            }
            try {
                ImageIO.write(effectImage, "png", new File("C:\\Users\\mypc\\Desktop\\Tv_cpy.png"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            } finally {
                System.out.println("connection closed.");
            }
        }*/


        //jagged array
/*
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of sections: ");
        int lengthSections=sc.nextInt();

        String [][] twoSectionsStuNames = new String[lengthSections][];

        for (int i = 0; i < twoSectionsStuNames.length; i++) {
            int j=i;
            System.out.printf("Enter the Number of students in section %d: ",(j+1));
            int lengthNumberOfStudents=sc.nextInt();
            twoSectionsStuNames[i] = new String[lengthNumberOfStudents];
            j=0;
        }

        for (int i = 0; i < twoSectionsStuNames.length; i++) {
            int students=twoSectionsStuNames[i].length;
            for (int j = 0; j < twoSectionsStuNames[i].length; j++) {
                System.out.print("Enter "+students+" students' names' in the section "+(i+1)+" : ");
                twoSectionsStuNames[i][j]=sc.next();
                students--;
            }
        }
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < twoSectionsStuNames.length; i++) {
            for (int j = 0; j < twoSectionsStuNames[i].length; j++) {

                System.out.print("The student name in section "+(i+1)+" : "+Arrays.toString(new String[] {twoSectionsStuNames[i][j]}));
                System.out.println();
            }
            System.out.println("==============================================");
        }*/


        //Array 3d accessing style.
        /*int[][][] list = new int[2][1][5];
        int count = 1, valueStored = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                for (int k = 0; k < list[i][j].length; k++) {
                    System.out.print(count + ". Enter the number: [" + i + "][" + j + "][" + k + "] ");
                    list[i][j][k] = sc.nextInt(); // value saved to index
                    valueStored = list[i][j][k]; //input is stored for use
                    count++;
                }
            }
        }
        System.out.println("Values in the array are: ");

        count = 1;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                for (int k = 0; k < list[i][j].length; k++) {
                    String valueRecievedFromArray = Arrays.toString(new int[] {list[i][j][k]}); //recieving array element.
                    System.out.print(count + ". value @ index [" + i + "][" + j + "][" + k + "] : " + valueRecievedFromArray);
                    System.out.println();
                    count++;
                }
            }
        }*/


        //adjusting image inside an image.
           /* BufferedImage sourceImageTV =null, sourceImageButterfly=null;
            File file = null, file2=null;
            Scanner sc = new Scanner(System.in);
            try {
                file = new File("C:\\Users\\mypc\\Desktop\\Mirai_LCD_TV222.jpeg");
                file2 = new File("C:\\Users\\mypc\\Desktop\\butterfly.jpeg");
                sourceImageTV = ImageIO.read(file);
                sourceImageButterfly = ImageIO.read(file2);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            if (sourceImageTV != null) {
                int widthPlusFive = sourceImageTV.getWidth();
                System.out.println("column: "+widthPlusFive);
                int heightPlusFive = sourceImageTV.getHeight();
                System.out.println("row: "+heightPlusFive);

                BufferedImage effectImage = new BufferedImage(widthPlusFive, heightPlusFive, sourceImageTV.getType());
                for (int row = 0; row < effectImage.getHeight(); row++) {
                    for (int col = 0; col < effectImage.getWidth(); col++) {
                        if(row>=150 && row<=1150 && col>=350 && col<=2100){
                            int j=row;
                            int k=col;
                            j=j-150;
                            k=k-350;
                            if(k<1751 && j<1001) {
                                effectImage.setRGB(col, row, sourceImageButterfly.getRGB(k, j));
                                System.out.println(j);
                                System.out.println(k);
                                j=0;
                                k=0;
                            }
                        }else
                            effectImage.setRGB(col,row,sourceImageTV.getRGB(col,row));
                    }
                }
                try {
                    ImageIO.write(effectImage, "png", new File("C:\\Users\\mypc\\Desktop\\Tv_cpy.png"));
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                } finally {
                    System.out.println("connection closed.");
                }
            }
*/

        //created image border pink
        /*char status = 'y';
        while (status == 'y') {
            BufferedImage effectImageGreen = null, sourceImageTiberium =null;
            File file = null, file2=null;
            Scanner sc = new Scanner(System.in);
            try {
                file = new File("C:\\Users\\mypc\\Desktop\\game.png");
//                file2 = new File("C:\\Users\\mypc\\Desktop\\Green.png");
                sourceImageTiberium = ImageIO.read(file);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            if (sourceImageTiberium != null) {
                int widthPlusFive = sourceImageTiberium.getWidth()+40;
                System.out.println(sourceImageTiberium.getWidth());
                System.out.println(widthPlusFive);
                int heightPlusFive = sourceImageTiberium.getHeight()+40;
                System.out.println(sourceImageTiberium.getHeight());
                System.out.println(heightPlusFive);

//                int innerRow=0, innerCol=0;
                BufferedImage effectImage = new BufferedImage(widthPlusFive, heightPlusFive, sourceImageTiberium.getType());
                for (int row = 0; row < effectImage.getHeight(); row++) {
                    for (int col = 0; col < effectImage.getWidth(); col++) {
//                        System.out.printf("row %d row+20 %d, col %d col+20 %d",row,row+20,col,col+20);
//                        System.out.println();
                        if(col<94 && row<95) {
                            effectImage.setRGB(col + 20, row + 20, sourceImageTiberium.getRGB(col, row));
                        }
                        if(col<20 || row<20) {
//                            System.out.println("==> <20");
//                            System.out.println("row "+row);
//                            System.out.println("col "+col);
                            effectImage.setRGB(col, row, Color.PINK.getRGB());
                        } else if ((col>=114 && col<134) || ((row>=115 && row<135))) {
//                            System.out.println("==> col >93");
//                            System.out.println("row "+row);
//                            System.out.println("col "+col);
                            effectImage.setRGB(col, row, Color.PINK.getRGB());
                        }
                    }
                }
                try {
                    ImageIO.write(effectImage, "png", new File("C:\\Users\\mypc\\Desktop\\game_cpy2.png"));
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                } finally {
                    System.out.println("connection closed.");
                    System.out.print("Do you want to continue; press y:");
                    status = sc.next().charAt(0);
                }
            }
        }*/


        //array 3d concept. not clear
        /*int [][][] rollNumber = new int[2][3][2];
        int counter = 0;
        for (int i = 0; i < rollNumber.length; i++) {
            for (int j = 0; j < rollNumber[0].length; j++) {
                for (int k = 0; k < rollNumber.length; k++) {
                    System.out.println((counter + 1) + " 2D array Index: " + i + " " + j+" "+k+" = "+rollNumber[i][j][k]);
                    counter++;
                }

            }

        }*/


        //array 2d concept.
        /*int[][] list = new int[2][3];
//        System.out.println(list.length);
  //      System.out.println(list[0].length);
    //    System.out.println(list[1].length);
        int counter = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                list[i][j]=((i%2==0)?6:9);
                System.out.println((counter + 1) + " 2D array Index: " + i + " " + j+" = "+list[i][j]);
                counter++;
            }

        }
*/

        //array: it is list of items of homogenous data types. Array is primitive datatype. contiguous memory
        //blocks of same datatype.

 /*       int[] inputNumber = new int[5];
        int status=0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < inputNumber.length; i++) {
            try{
            System.out.print("Enter a number to insert in the array: ");
            inputNumber[i] = sc.nextInt();
            } catch (Exception e) {
                throw new RuntimeException("==> Exception @ insert:Only enter integer value allowed. "+e);
            }
        }
        System.out.println();
try {
    System.out.print("Enter the number you want to search: ");
    int searchInt = sc.nextInt();
    System.out.println();
    for (int i = 0; i < inputNumber.length; i++) {
        if (searchInt == inputNumber[i]) {
            System.out.println("==> Number " + inputNumber[i] + " found in the array @ location" + (i+1));
            status=1;
        }
    }
    System.out.println();
} finally {
    if(status==1)
        System.out.println("searching completed: NUMBER FOUND.");
    else
        System.out.println("searching completed: NUMBER NOT FOUND.");
}*/

//question
        /*        int mayBeAPrimeNumberCounter=0,innerForLoopLimit=0,primeNumberCounter=0, nonPrimeNumberCounter=0, oddNumberCounter=0, evenNumberCounter=0;
        int [] numberInput = new int[5];
        Scanner sc = new Scanner(System.in);
//        System.out.println(numberInput.length);

        for (int i = 0; i < numberInput.length; i++) {
            System.out.print("Enter a number: ");
            numberInput[i]=sc.nextInt();

            if(numberInput[i]%2==0){
                evenNumberCounter++;
                System.out.println("==> EVEN NUMBER: "+numberInput[i]);

            } else if (numberInput[i]%2 != 0) {
                oddNumberCounter++;
                System.out.println("==> ODD NUMBER: "+numberInput[i]);
            }

            innerForLoopLimit=numberInput[i];

            for (int j=1;j<=innerForLoopLimit;j++){

                if(numberInput[i]==1){
                    mayBeAPrimeNumberCounter=2;
                } else if(numberInput[i]%j == 0){
                    mayBeAPrimeNumberCounter++;
                }
            }

            if(!(mayBeAPrimeNumberCounter < 2) && !(mayBeAPrimeNumberCounter>2) ) {
                mayBeAPrimeNumberCounter = 0;
                primeNumberCounter++;
                System.out.println("==> Prime NUMBER: " + numberInput[i]);
            }
            else if (mayBeAPrimeNumberCounter>2 || mayBeAPrimeNumberCounter<2) {
                mayBeAPrimeNumberCounter=0;
                nonPrimeNumberCounter++;
                System.out.println("==> Non-Prime NUMBER: "+numberInput[i]);
            }
        }
        System.out.println();
        System.out.println("==>> Total Even numbers: "+evenNumberCounter);
        System.out.println("==>> Total Odd numbers: "+oddNumberCounter);
        System.out.println("==>> Total Prime numbers: "+primeNumberCounter);
        System.out.println("==>> Total Non Prime numbers: "+nonPrimeNumberCounter);*/

//question
        /*int [] rollNo = new int[3];
        //int [] intNumbers = new int[] {};//outdated sytle or it may work.
        String stuName []={};
        String[] stuFatherName ={"Ali","Qasim"};
//        System.out.println(stuFatherName[0]);
//        System.out.println(stuFatherName[1]);
        String [] gifts = new String[5];
        String [] halls ;
//        halls = new String[];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter student name: ");
            stuName[i]=sc.next();
        }
        */

        /*int [] intNumbers = new int[5];
        int [] intNumbersCpy = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            intNumbers[i]=sc.nextInt();
        }
        System.out.println("Copying started . . . ");
        for (int i = 0,counter=0; i <5;) {

            if(counter<5){
                intNumbersCpy[i]=intNumbers[i];
                System.out.println("==> "+intNumbersCpy[i]+"=="+intNumbers[i]);
            }
            i++;
            counter++;
        }
        System.out.println("Copying completed.");
        System.out.println();
        System.out.println("Reversing numbers started.");
        for (int i = 4,counter=0; i >=0; i--,counter++) {

            if(counter<5){
                intNumbers[counter]=intNumbersCpy[i];
                System.out.println("==> Number @"+i+" "+intNumbersCpy[i]+" is Copied @"+counter+" "+intNumbers[counter]);
            }
        }
        System.out.println("Reversing numbers completed.");
        System.out.println();
        System.out.println("Printing New order of numbers: ");
        for (int i = 0; i <5; i++) {
            System.out.print((i+1)+". Number was: "+intNumbers[i]);
            System.out.println();
        }*/

//        Scanner sc = new Scanner(System.in);
//
//        for (int i = 0; i < 2; i++) {
//            System.out.print("Enter student Father name: ");
//            stuFatherName[i]=sc.next();
//        }
//        for (int i = 0; i < 2; i++) {
//            System.out.print((i+1)+". stero Father name is: "+stuFatherName[i]);
//            System.out.println();
//        }

//image processing.
        //same code using OOP technique.

        /*String sourceFile = "C:\\Users\\mypc\\Desktop\\game.png";
        String destinationFile = "C:\\Users\\mypc\\Desktop\\gamecpy.png";

        while (inheritanceRough.CImage.status=='y') {
            BufferedImage sourceImage = inheritanceRough.CImage.imagePathSet(sourceFile);
            BufferedImage effectImage = inheritanceRough.CImage.imageToPixel(sourceImage);
            inheritanceRough.CImage.imageSavedToDisk(effectImage, "png", destinationFile);
        }*/

        //color splashing without OOP.
        /*char status = 'y';
        while (status == 'y') {
            BufferedImage sourceImage = null, effectImage = null;
            File file = null;
            Scanner sc = new Scanner(System.in);
            int redI = 0, greenI = 0, blueI = 0;

            System.out.print("Enter filter value (1-255) for red color: ");
            redI = sc.nextInt();
            System.out.print("Enter filter value (1-255) for green color: ");
            greenI = sc.nextInt();
            System.out.print("Enter filter value (1-255) for blue color: ");
            blueI = sc.nextInt();


            try {
                file = new File("C:\\Users\\mypc\\Desktop\\game.png");
                sourceImage = ImageIO.read(file);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            effectImage = new BufferedImage(sourceImage.getWidth(), sourceImage.getHeight(), sourceImage.getType());
            for (int row = 0; row < sourceImage.getHeight(); row++) {
                for (int col = 0; col < sourceImage.getWidth(); col++) {
//                effectImage.setRGB(col,row,sourceImage.getRGB(col,row));
                    int pixel = sourceImage.getRGB(col, row);
                    int Alpha = pixel >> 24;
//                System.out.println(Integer.toBinaryString(Alpha));
                    int Red = pixel >> 16 & 0XFF;
//                System.out.println(Integer.toBinaryString(Red));
                    int Green = pixel >> 8 & 0XFF;
//                System.out.println(Integer.toBinaryString(Green));
                    int Blue = pixel & 0XFF;
//                System.out.println(Integer.toBinaryString(Blue));

                    //creating filters


                    Red = Red - redI;
                    Green = Green - greenI;
                    Blue = Blue - blueI;

                    int pixelPacking = Alpha << 24 | Red << 16 | Green << 8 | Blue;
//                System.out.println("All packed: "+Integer.toBinaryString(pixelPacking));

                    effectImage.setRGB(col, row, pixelPacking);


                }
            }

            try {
                ImageIO.write(effectImage, "png", new File("C:\\Users\\mypc\\Desktop\\game_cpy2.png"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            } finally {
                System.out.println("connection closed.");

                System.out.print("Do you want to continue; press y:");
                status = sc.next().charAt(0);

            }

        }*/


        //image resizing.
        /*try {

            BufferedImage originalImage = ImageIO.read(new File("C:\\Users\\mypc\\Desktop\\Altis_Corolla.jpg"));//change path to where file is located
            int type = originalImage.getType();

            BufferedImage resizeImageJpg = resizeImage(originalImage, type, 300, 100);
            ImageIO.write(resizeImageJpg, "jpg", new File("C:\\Users\\mypc\\Desktop\\testresized.jpg")); //change path where you want it saved

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
    private static BufferedImage resizeImage(BufferedImage originalImage, int type, int IMG_WIDTH, int IMG_HEIGHT) {
        BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type);
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(originalImage, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
        g.dispose();

        return resizedImage;
    }*/

        //sir wala below
        /*BufferedImage sourceImage =null, effectImage=null;
        File file=null;

        try{
            file= new File("C:\\Users\\mypc\\Desktop\\game.png");
            sourceImage= ImageIO.read(file);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }finally {
            System.out.println("connection closed.");
        }
        effectImage = new BufferedImage(sourceImage.getWidth(),sourceImage.getHeight(),sourceImage.getType());
        for (int row=0,maxRow=sourceImage.getHeight()-1;row<sourceImage.getHeight();row++,maxRow--){
            for (int col=0; col<sourceImage.getWidth();col++){
                effectImage.setRGB(col,row,sourceImage.getRGB(col,row));
            }
        }

        try{
            ImageIO.write(effectImage,"png",new File("C:\\Users\\mypc\\Desktop\\Copy_Altis_Corolla.png"));
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }*/


        //random question sol 1
        /*int sum = 0, intval = 0, intValueForSum;
        char ch;
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        intval = sc.nextInt();
        String strvalue = Integer.toString(intval);
        int length = strvalue.length()-1;
        while (length >= 0) {
            ch=strvalue.charAt(length);
            s=Character.toString(ch);
            intValueForSum=Integer.parseInt(s);
            sum=sum+intValueForSum;
            length--;
        }
        System.out.println("sum is: " + sum);*/
//random question sol2

        //Diamond shape problem
                /*int lengthOfDiamond;
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the length of diamond: ");
                lengthOfDiamond = sc.nextInt();
                int start,mid,end;
                start= mid = end = lengthOfDiamond/2;
                for(int row=1; row <=lengthOfDiamond; row++) {
                        for (int col = 1; col <= lengthOfDiamond; col++) {
                                if (col >= start && col <= end) {
                                        System.out.print("*");
                                } else {
                                        System.out.print(" ");
                                }
                        }
                        System.out.println("");
                        if (row < mid) {
                                start--;
                                end++;

                        } else {
                                start++;
                                end--;
                        }
                }*/

        //commando task by sir nauman
                /*RoughClassSideUsage r = new RoughClassSideUsage();
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a message: ");
                r.setMessage(sc.nextLine());
                System.out.printf("Your message Minimum starting range is: 0 and  Maximum ending range is: %d",r.getMessage().length()-1);
                System.out.print("\nEnter start range: ");
                r.setRangeStart(sc.nextInt());
                System.out.print("Enter End range: ");
                r.setRangeEnd(sc.nextInt());

                System.out.println("Your String is: "+RoughClassSideUsage.readValidIntFromRange(r.getMessage(),r.getRangeStart(),r.getRangeEnd()));
*/

    }
}

