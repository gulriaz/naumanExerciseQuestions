package InterfacingPractice02;

public class main {
    public static void main(String[] args) {

        IPlayable i1 = new Football();
        i1.play();
        System.out.println();

        IPlayable i2 = new Vollyball();
        i2.play();
        System.out.println();

        IPlayable i3 = new Cricket();
        i3.play();
        System.out.println();

    }
}
