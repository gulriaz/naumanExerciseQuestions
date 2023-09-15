package InheritanceOverriding;

public class Personal extends Vehicles{
    String personalVeh = "Personal usage";

//    public Personal() {
//       super(2,3);
//    }

    public Personal(int x){
        super(2);

    }
    public void personalUse(){
        System.out.println("it is only for personal usage.");
    }

    @Override
    public void vehAvailable(){
        System.out.println(">>PUTAR: Personal Vehicle not available for public use.");
    }

    @Override
    public String toString() {
        return "Personal{" +
                "personalVeh='" + personalVeh + '\'' +
                '}';
    }
}
