package InterfactingPractice04;

public class IndianArmy implements TacticalAtrributes {
static int number = 55;
int number2 =9;
    static {
        System.out.println("static block called IndianArmy.");
        number=87;
    }
//    static {
//        System.out.println("2nd indian army static block");
//    }
    {
        System.out.println("1st instance block.");
        int num=number+number2;
    }
    {
        System.out.println("2nd instance block.");
    }

    public IndianArmy(int x){

    }
    String flagIndian = "India Flag";

    String unitIndian = "Infantry Indian";

    @Override
    public void shoot() {

    }

    @Override
    public void fighting() {

    }

    @Override
    public void jump() {

    }

    @Override
    public void run() {

    }

    @Override
    public void walk() {

    }

    @Override
    public void crawl() {

    }

    @Override
    public void boxing() {
        System.out.println("IndianArmy method called.");
    }

}
