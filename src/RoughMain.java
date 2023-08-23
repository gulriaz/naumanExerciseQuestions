import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class RoughMain {
    public static void main(String[] args) {
       //image resizing.
        try {

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
    }

        //sir wala below
        /*BufferedImage sourceImage =null, effectImage=null;
        File file=null;

        try{
            file= new File("C:\\Users\\mypc\\Desktop\\Altis_Corolla.jpg");
sourceImage= ImageIO.read(file);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }finally {
            System.out.println("connection closed.");
        }
        effectImage = new BufferedImage(sourceImage.getWidth(),sourceImage.getHeight(),sourceImage.getType());
        for (int row=0,maxRow=sourceImage.getHeight()-1;row<sourceImage.getHeight();row++,maxRow--){
            for (int col=0; col<sourceImage.getWidth();col++){
                effectImage.setRGB(col,row,sourceImage.getRGB(col,maxRow));
            }
        }

        try{
            ImageIO.write(effectImage,"jpg",new File("C:\\Users\\mypc\\Desktop\\Copy_Altis_Corolla.jpg"));
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

