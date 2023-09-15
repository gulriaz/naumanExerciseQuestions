package inheritanceRough;

import java.util.Objects;

public class CAnimal {
    String animalDanger="Dangerous/keep safety";
    public String animalPerfume="smelly";
    String animalTail = "Have Tail";

    CAnimal(int x, int y){

    }

    public void show(){
        System.out.println("Animal class.");
    }

    @Override
    public String toString() {
        System.out.println("^^^^^^^^^^^^^^^^^^^^^");
        return "inheritanceRough.CAnimal{" +
                "animalDanger='" + animalDanger + '\'' +
                ", animalPerfume='" + animalPerfume + '\'' +
                ", animalTail='" + animalTail + '\'' +
                '}';
    }
}
