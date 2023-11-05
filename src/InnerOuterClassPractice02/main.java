package InnerOuterClassPractice02;

public class main {
    public static void main(String[] args) {

        //concept of static class clear.
        TopLevelClass.fightingSkills f = new TopLevelClass.fightingSkills();
        f.combatSkills();

        TopLevelClass.skills s = new TopLevelClass.skills();
        s.displaySkills();


        /*TopLevelClass t = new TopLevelClass();

        class techers implements IMethodsXSkills {

            @Override
            public void knifeSkills() {

            }
        }

        techers t1 = new techers();
        t1.knifeSkills();

        IMethodsXSkills i = new techers();
        i.knifeSkills();*/

//TopLevelClass.skills s = t.new skills();
//TopLevelClass.skills s = new TopLevelClass().new skills();


    }
}
