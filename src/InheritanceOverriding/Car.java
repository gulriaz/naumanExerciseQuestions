package InheritanceOverriding;

public class Car extends Personal{
    public Car(){
        super(2);
    }


    String carMake = "BMW";

    @Override
    public String toString() {
        return "Car{" +
                "carMake='" + carMake + '\'' +
                '}';
    }
}
