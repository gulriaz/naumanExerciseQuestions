package inheritanceRough;

public class CMamels extends CAnimal {
    public String mamelsWalk = "can Run";
    public String mamelsEat = "Grass/Meat/Not Insects";
    public String mamelsBirth = "New Born Babies";
    public String nameOfClass = "Mammals ";
    CMamels() {
        super(5, 6); // super can call constructors and operations of all other classes.

    }
    @Override
    public void show(){
        System.out.println(nameOfClass+" class.");
    }

    @Override
    public String toString(){
        System.out.println("===========================");
        return super.toString()+">>>Mamels overided: "+mamelsWalk+" "+mamelsEat+" "+mamelsBirth;
    }

    public String toString(int x){
        System.out.println("===========================");
        return super.toString()+">>>Mamels overided: "+mamelsWalk+" "+mamelsEat+" "+mamelsBirth;
    }
}
