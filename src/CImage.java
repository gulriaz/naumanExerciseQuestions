import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Scanner;

public class CImage {
    public static final int ZERO = 0;
    public static final int ALPHA_BITS_SHIFT = 24;
    public static final int RED_BITS_SHIFT = 16;
    public static final int GREEN_BITS_SHIFT = 8;
    public static final int MAX_BITS = 0XFF;
    public static int redI = 0;
    public static int greenI = 0;
    public static int blueI = 0;
    public static char status='y';
    public static int Alpha;
    public static int Red;
    public static int Green;
    public static int Blue;

    public static BufferedImage imagePathSet(String path) {
        File file = null;
        BufferedImage sourceImage = null;

        try {
            file = new File(path);
            sourceImage = ImageIO.read(file);
        } catch (Exception ex) {
            System.out.println("==> imagePathSet function error: " + ex.getMessage());
        }
        return sourceImage;
    }

    public static BufferedImage imageToPixel(BufferedImage image) {

        userShapeTheFilter();//creating filter function is called here.

        BufferedImage effectImage=null,sourceImage=null;
        sourceImage=image;

        effectImage = new BufferedImage(sourceImage.getWidth(), sourceImage.getHeight(), sourceImage.getType());
        for (int row = ZERO; row < sourceImage.getHeight(); row++) {
            for (int col = ZERO; col < sourceImage.getWidth(); col++) {
                int pixel = sourceImage.getRGB(col, row);
                userapplyFilter(pixel);
                int pixels=pixelPacking();
                effectImage.setRGB(col, row, pixels);
            }
        }
        return effectImage;
    }

    public static int pixelPacking(){
        int pixelPacked = Alpha << ALPHA_BITS_SHIFT | Red << RED_BITS_SHIFT | Green << GREEN_BITS_SHIFT | Blue; // new pixels are packed.
    return pixelPacked;
    }
    public static void userapplyFilter(int pixel){
        Alpha = pixel >> ALPHA_BITS_SHIFT;
        Red = pixel >> RED_BITS_SHIFT & MAX_BITS;
        Green = pixel >> GREEN_BITS_SHIFT & MAX_BITS;
        Blue = pixel & MAX_BITS;

        //applying filters
        Red = Red - redI;
        Green = Green - greenI;
        Blue = Blue - blueI;
    }

    public static void userShapeTheFilter(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter filter value (1-255) for red color: ");
        redI = sc.nextInt();
        System.out.print("Enter filter value (1-255) for green color: ");
        greenI = sc.nextInt();
        System.out.print("Enter filter value (1-255) for blue color: ");
        blueI = sc.nextInt();
    }

    public static void imageSavedToDisk(BufferedImage effectImage, String imageExtension, String pathToDisk){
        Scanner sc = new Scanner(System.in);
        try {
            ImageIO.write(effectImage, imageExtension, new File(pathToDisk));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("connection closed.");
            System.out.print("Do you want to continue; press y:");
            status=sc.next().charAt(0);
        }

    }

}
