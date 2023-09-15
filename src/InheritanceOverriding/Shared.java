package InheritanceOverriding;

public class Shared extends Vehicles{
    String sharedVeh = "public transportation system";

    public Shared() {
        super(2,3);
    }

    @Override
    public String toString() {
        System.out.println();
        System.out.println();
        return super.toString()+"\nShared{" +
                "sharedVeh='" + sharedVeh + '\'' +
                '}';
    }
}
