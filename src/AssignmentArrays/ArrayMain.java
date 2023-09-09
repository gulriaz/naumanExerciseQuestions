package AssignmentArrays;

import java.util.*;
import java.util.function.Predicate;

public class ArrayMain {
    public static void main(String[] args) {


        //question not from exercise; delete an element from array.
        /*ArrayList<String> names = new ArrayList<>() {{
            add("ali");
            add("asim");

        }};
        Scanner sc = new Scanner(System.in);

        System.out.println(Arrays.toString(new ArrayList[]{names}));

        char ch='y';

        while (ch=='y') {

            System.out.print("do you want to delete an entry: ");
            String name = sc.next();

            if (!names.isEmpty()) {
                names.remove(name);
            } else {System.out.println("list is empty."); System.exit(0);}

            System.out.println(Arrays.toString(new ArrayList[]{names}));

            if(!names.isEmpty()){
            System.out.println("do you want to continue: press y");
            ch=sc.next().charAt(0);}else {System.out.println("list is empty."); System.exit(0);}
        }
        System.out.println("good bye!");*/


        /*String[] names = new String[]{"ali", "asim", "qasim", "mujtaba", "mustafa"};
        System.out.print("do you want to delete an entry: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        System.out.println(Arrays.toString(names));

        int len = names.length;
        for (int i = 0; i < len; i++) {

            if (names[i].equals(name)) {
                names[i] = names[names.length - 1];
                len = len - 1;
            }
        }
        System.out.print("[");
        for (int i = 0; i < len; i++) {
            if(i != len-1) {
                System.out.print(names[i] + ", ");
            }else
                System.out.print(names[i]);
            }
        System.out.print("]");*/


        //sum to two elements is equal to specified number.
/*        ArrayList<Integer> anArray = new ArrayList<>(){{add(1); add(3); add(4);add(12); add(-9); add(2);add(8); add(2); add(6);}};
        int specifiedNumber=4;

        for (int i = 0; i < anArray.size(); i++) {
            for (int j = 0; j < anArray.size(); j++) {

                if(i != j) {
                    if (specifiedNumber == (anArray.get(i) + anArray.get(j))) {
                        System.out.println("Pair: "+anArray.get(i)+" + "+ anArray.get(j)+" = "+specifiedNumber);
                    }
                }
            }
        }*/


        //question arraylist to array
        /*ArrayList<Integer> anArray = new ArrayList<>(){{add(1); add(3); add(4);}};
        int [] oneDimArray= new int[anArray.size()];

        System.out.println("ArrayList: "+Arrays.toString(new ArrayList[] {anArray}));

        for (int i = 0; i < anArray.size(); i++) {
            oneDimArray[i]=anArray.get(i);
            System.out.println("==>>ArrayList is converted to an 1D Array: "+oneDimArray[i]);
        }*/


        //question array to arraylist
        /*int[] numbers = new int[]{2, 4, 5, 8, 7};
        ArrayList<Integer> numbersToArrayList = new ArrayList<>();

        for (int i = 0; i <numbers.length; i++) {
            numbersToArrayList.add(numbers[i]);
        }
        System.out.println(Arrays.toString(new ArrayList[] {numbersToArrayList}) );*/


        //question add two matrices.
        /*ArrayList<Integer> matrices1 = new ArrayList<>() {{
            add(1);
            add(2);
            add(3);
        }};
        int[] matrices2 = new int[]{5, 6, 12};
        int[] sumOfMatrices = new int[matrices1.size()];
        System.out.println("================================");
        if (matrices1.size() == matrices2.length) {
            System.out.println("adding two metrices.");
            for (int i = 0; i < matrices1.size(); i++) {
                sumOfMatrices[i] = (matrices1.get(i) + matrices2[i]);
            }

            for (int i = 0; i < sumOfMatrices.length; i++) {
                System.out.println("[" + matrices1.get(i) + "] + " + "[" + matrices2[i] + "] = " + sumOfMatrices[i]);
            }
        } else System.out.println("Both matrices sizes are not equal.");


        //question 2nd largest.
        ArrayList<Integer> num = new ArrayList<Integer>() {
            {
                add(25);
                add(5);
                add(2);
                add(4);
                add(9);
                add(7);
            }
        };
        try {
            int max = num.get(0);
            for (int i = 0; i < num.size(); i++) {
                {
                    if ((max >= num.get(i))) { //just reverse the condition for minimum value
                    } else {
                        max = num.get(i);
                    }
                }
            }
            System.out.println("Collection is: " + Arrays.toString(new String[]{num.toString()}));
            System.out.println("1st maximum is: " + max);

            int indexOfLargest = num.indexOf(max);
            num.remove(indexOfLargest);

            max = num.get(0);
            for (int i = 0; i < num.size(); i++) {
                {
                    if ((max >= num.get(i))) {//just reverse the condition for minimum value

                    } else {
                        max = num.get(i);
                    }
                }
            }
            System.out.println("Collection is: " + Arrays.toString(new String[]{num.toString()}));
            System.out.println("2nd maximum is: " + max);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/


        //question String common between two arrays
        /*ArrayList<String> Array1 = new ArrayList<String>() {{
            add("25");//
            add("ali");
            add("5");//
            add("2");
            add("gulraiz");
            add("4");
            add("9");//
            add("7");
        }};
        ArrayList<String> Array2 = new ArrayList<String>() {{
            add("25");//
            add("5");//
            add("6");
            add("ali");
            add("6");
            add("6");
            add("9"); //
            add("gulraiz");
        }};
        int counter = 0;
        ArrayList<String> commonFound = new ArrayList<>();
        for (int i = 0; i < Array1.size(); i++) {
            for (int j = 0; j < Array2.size(); j++) {

                if (Array1.get(i).equals(Array2.get(j))) {
                    counter++;
                }

            }

            if (counter >= 1 && !(commonFound.contains(Array1.get(i)))) {
                commonFound.add(Array1.get(i));
            }else System.out.println("not common: "+ Array1.get(i));
            counter=0;
        }
        System.out.println("<============================================>");

        for (int i = 0; i < commonFound.size(); i++) {
            System.out.println(commonFound.get(i)+" is common.");
        }*/

        //question common between two arrays
        /*ArrayList<Integer> Array1 = new ArrayList<Integer>() {{
            add(25);//
            add(36);
            add(5);//
            add(2);
            add(0);
            add(4);
            add(9);//
            add(7);
        }};
        ArrayList<Integer> Array2 = new ArrayList<Integer>() {{
            add(25);//
            add(5);//
            add(6);
            add(6);
            add(6);
            add(6);
            add(9); //
            add(6);
        }};
        int counter = 0;
        ArrayList<Integer> commonFound = new ArrayList<>();
        for (int i = 0; i < Array1.size(); i++) {
            for (int j = 0; j < Array2.size(); j++) {

                if (Array1.get(i).equals(Array2.get(j))) {
                    counter++;
                }

            }

            if (counter >= 1 && !(commonFound.contains(Array1.get(i)))) {
                    commonFound.add(Array1.get(i));
            }
            counter=0;
        }

        for (int i = 0; i < commonFound.size(); i++) {
            System.out.println(commonFound.get(i)+" number is common.");
        }*/


        //check duplicate string.
        /*ArrayList<String> num = new ArrayList<String>() {{
            add("gulraiz");
            add("Javaid");
            add("gulraiz");
            add("gulraiz");
            add("javaid");
            add("gulraiz");

            add("Ali");
            add("Aslam");
            add("Aslam");
            add("Ali");
            add("Ali");
            add("Mustafa");
            add("Mujtaba");
        }};
        try {
            ArrayList<Integer> count = new ArrayList<>();
            ArrayList<String> dupValues = new ArrayList<>();
            ArrayList<String> unique = new ArrayList<>();
            int counter = 0, reset = 0;
            for (int i = 0; i < num.size(); i++) {
                for (int j = 0; j < num.size(); j++) {
                    if (num.get(i).equals(num.get(j))) {
                        counter++;
                    }
                }
                if (counter > 1 && !(dupValues.contains(num.get(i)))) {
                    dupValues.add(num.get(i)); //by default it will start from 0
                    count.add(counter);
                } else {
                    if (!(dupValues.contains(num.get(i)))) {
                        unique.add(num.get(i));
                    }
                }
                counter = reset;
            }

            for (int i = 0; i < dupValues.size(); i++) {
                System.out.println("==>> " + dupValues.get(i) + " is duplicate and has " + count.get(i) + " repetitions.");
            }
            System.out.println("=======================================");
            for (String s : unique) {
                System.out.println("==>> " + s + " is unique.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/


        //question check certain valuue. multiple questions done in this one, and commented.

       /* ArrayList<Integer> num = new ArrayList<Integer>() {{
            add(7);
            add(7);
            add(5);
            add(5);
            add(9);
            add(9);
            add(5);
            add(99);
        }};
//        Scanner sc = new Scanner(System.in);
        *//*for (int i = 0; i < 15; i++) {
            System.out.println("Save a value: ");
            num.add(sc.nextInt());
        }*//*
        try {
//            System.out.print("Enter value you want to search: ");
//            int valueSearch = sc.nextInt();

            //duplicate value in the array.
            ArrayList<Integer> count = new ArrayList<>();
            ArrayList<Integer> dupValues = new ArrayList<>();
            int counter = 0, reset = 0;
            for (int i = 0; i < num.size(); i++) {
                for (int j = 0; j < num.size(); j++) {

                    if (num.get(i).equals(num.get(j))) {
                        counter++;
                    }

                }
                if (counter > 1 && !(dupValues.contains(num.get(i)))) {
                    dupValues.add(num.get(i)); //by default it will start from 0
                    count.add(counter);
                    counter = reset;
                } else counter = reset;
            }

            for (int i = 0; i < dupValues.size(); i++) {
                System.out.println("==>> " + dupValues.get(i) + " is duplicate and has " + count.get(i) + " repetitions.");
            }


            //genaric logic to search a value.
            *//*for (int i = 0; i < num.size(); i++) {
                if (valueSearch == num.get(i)) {
                    System.out.println(valueSearch + " is found @ index: " + i);
                }
            }*//*

            //maximum and minimum of the array.
//            System.out.println("Maximum of the array: "+ Collections.max(num));
//            System.out.println("Minimum of the array: "+ Collections.min(num));

            //add an element at specific position.
            *//*num.add(1,valueSearch); //add value at index 1,
            System.out.println("new value added: "+Arrays.toString(new ArrayList[] {num}));*//*


            //removing an element.
            *//*if (!(num.isEmpty())) {
                if (num.contains(valueSearch)) {
                    System.out.println("value removed: "+num.remove(num.indexOf(valueSearch))); // return value at this index.
                    System.out.println(Arrays.toString(new ArrayList[] {num})); //new array

                }else System.out.println("REMOVE OPERATION==>> object not found.");
            }else System.out.println("Array is empty.");*//*

            //finding index of an element.
//            System.out.println("index of: "+num.indexOf(valueSearch));
            //built in function to find a value.

        *//*    if(num.contains(valueSearch)) {
                System.out.println("match found.");
            }else System.out.println("no found");*//*
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/


        //q sorting int/Strings
        /*ArrayList<Integer>num = new ArrayList<Integer>();;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a value: ");
            num.add(sc.nextInt());
        }
        try {
            System.out.print("without sorting: ");
            System.out.print(num);
            System.out.println();

            System.out.println("ascending order: ");
            Collections.sort(num); //ascending order.
            System.out.print(num);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }*/


    }
}
