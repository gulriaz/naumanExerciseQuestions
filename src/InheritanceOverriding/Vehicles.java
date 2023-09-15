package InheritanceOverriding;

public abstract class  Vehicles {
    String vehProperty = "Transportation";
    String VehFuel = "YES";

    public Vehicles(int x, int y){

    }
    public Vehicles(int x){

    }
    public void vehAvailable(){
        System.out.println(">>>PIO: vehicle is ready for use.");
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "vehProperty='" + vehProperty + '\'' +
                ", VehFuel='" + VehFuel + '\'' +
                '}';
    }
}
