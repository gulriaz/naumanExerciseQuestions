package AbstractClass;

public class CurrentAccount extends BankAccount {


    public CurrentAccount(){
        super(2,6);
        System.out.println("current account >>> abstract class constructor called.");
    }
    private final float taxOnCurrentTransactions = 0.5f;
    private double taxAmount = 0.0f;

    public float getTaxOnCurrentTransactions() {
        return taxOnCurrentTransactions;
    }

    @Override
    public void withdrawOperation(double mon) {
        if (mon > 0 && getMoneyVar() > 0) {
            taxAmount = (mon * taxOnCurrentTransactions) / 100;
            mon = mon + taxAmount;
            if ((getMoneyVar() - mon) >= 0) {
                setMoneyVar(getMoneyVar() - mon);

                System.out.printf("remaining balance is: %.2f", getMoneyVar());
                System.out.printf("\ntax: %.2f", taxAmount);
            } else {
                double balanceShow = getMoneyVar();
                double taxShow = taxAmount;
                System.out.printf("Money is insufficient balance: %.2f  \ntax: %.2f ", balanceShow, taxShow);
                taxShow = taxShow + balanceShow;
                System.out.printf("\namount deductible: %.2f", taxShow);
            }
        }
    }

    @Override
    public String user(String userName){
        return userName;
    }

}
