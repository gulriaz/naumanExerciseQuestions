package inheritanceRough;

public class CRaptiles extends CAnimal{
    String raptilesWalk="They Crawl";
    String raptilesEat="Insects";
    String raptilesBirth="Eggs";
    String nameOfClass = "Raptiles";

    CRaptiles(){
        super(5,6);
    }


    @Override
    public void show(){
        System.out.println(nameOfClass+" class.");
    }

    @Override
    public String toString() {
        System.out.println("===========================");
        return super.toString()+"inheritanceRough.CRaptiles{" +
                "raptilesWalk='" + raptilesWalk + '\'' +
                ", raptilesEat='" + raptilesEat + '\'' +
                ", raptilesBirth='" + raptilesBirth + '\'' +
                ", nameOfClass='" + nameOfClass + '\'' +
                '}';
    }
}
