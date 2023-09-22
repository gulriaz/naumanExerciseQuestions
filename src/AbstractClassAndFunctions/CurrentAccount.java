package AbstractClassAndFunctions;

public class CurrentAccount implements IUser{


    public void foo(){

    }

    @Override
    public void depositBanking() {
        System.out.println("tax on current account: 50%");
    }

    @Override
    public void withdrawBanking() {
        System.out.println("tax on current account: 30%");
    }
}
