import java.util.Scanner;

public class RoughMain {
    public static void main(String[] args) {

        //random question sol 1
        int sum = 0, intval = 0, intValueForSum;
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
        System.out.println("sum is: " + sum);
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
