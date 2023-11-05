package InnerOuterClassPractice02;

public class TopLevelClass {
int value;

public static class skills{
    int value;

    public void displaySkills(){
        System.out.println(value);
//        System.out.println(TopLevelClass.this.value);
    }

}


public static class fightingSkills{
    public void combatSkills(){
        System.out.println("combating");
    }
}

}
