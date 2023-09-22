package AbstractClassAndFunctions;

import java.util.ArrayList;
import java.util.Scanner;

public class SavingAccount implements IUser{

    ArrayList<String> names = new ArrayList<>();
public void userName(){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name=s.next();
    names.add(name);
}
public String displayUserName(){
    String displayName = names.get(0);
    return displayName;
}

    @Override
    public void depositBanking() {
        System.out.println("tax on current account: 5%");
    }

    @Override
    public void withdrawBanking() {
        System.out.println("tax on current account: 3%");
    }
}
