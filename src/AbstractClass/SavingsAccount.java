package AbstractClass;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(){
        super(6);
        System.out.println("Saving account >>> abstract class constructor called.");
    }

    private final float taxOnSavingTransactions = 0.05f;
    private double taxAmount = 0.0f;


    public float getTaxOnSavingTransactions() {
        return taxOnSavingTransactions;
    }

    @Override
    public void withdrawOperation(double mon) {
        if (mon > 0 && getMoneyVar() > 0) {
            taxAmount = (mon * taxOnSavingTransactions) / 100;
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
