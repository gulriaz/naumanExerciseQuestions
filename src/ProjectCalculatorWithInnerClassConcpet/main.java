package ProjectCalculatorWithInnerClassConcpet;

public class main {
    public static void main(String[] args) {
        CalcOperations cMainObject = new CalcOperations();
        CalcOperations.Inner01 c = cMainObject.new Inner01();

        try {
            c.accessMethodInner();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("PROGRAM FINISH.");
        }

    }

}
