package InterfactingPractice04;

public interface TacticalAtrributes {

    int RANGE_SOILDER = 500;

    void shoot();
    void fighting();
    void jump();
    void run();
    void walk();
    void crawl();

    default void boxing(){
        System.out.println("TacticalAttribute method called.");
    }

    static void TacticalTrainingRules(){
        System.out.println("rules are: ");
        System.out.println("No. 1  don't move");
        System.out.println("No. 2  don't laugh");
    }

}
