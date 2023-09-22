package AbstractClass;

public abstract class BankAccount {

    public BankAccount(int x){
    }

    public BankAccount(int x, int y){

    }

    double moneyVar = 1.0d;

    public abstract String user(String userName);

    public double getMoneyVar() {
        return moneyVar;
    }

    public void setMoneyVar(double moneyVar) {
        this.moneyVar = moneyVar;
    }

    public void depositOperation(double mon) {
        setMoneyVar(getMoneyVar() + mon);

    }

    public void withdrawOperation(double mon) {
        if (mon > 0 && getMoneyVar() > 0) {
            if ((getMoneyVar() - mon) >= 0) {
                setMoneyVar(getMoneyVar() - mon);
                System.out.printf("remaining balance is: %.2f", getMoneyVar());
            } else System.out.println("money is insufficient");
        }
    }

}
