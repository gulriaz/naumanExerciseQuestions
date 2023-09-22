package InheritanceOverriding;

import AbstractClass.BankAccount;
import AbstractClass.CurrentAccount;
import AbstractClass.SavingsAccount;

import java.util.Scanner;

public class main {
    public static void main(String[] args) throws RuntimeException, Exception {

        Scanner sc = new Scanner(System.in);

        SavingsAccount s = new SavingsAccount();
        CurrentAccount c = new CurrentAccount();


        System.out.print("1. Savings account \n2. Current account \nSelect the option for banking.");
        char ch = sc.next().charAt(0);
        String str = Character.toString(ch);
        int i = Integer.parseInt(str);
        char repeat = '0';
        while (repeat == '0') {
            try {
                switch (i) {
                    case 1 -> {
                        System.out.printf("tax rate for saving account is: %.2f", s.getTaxOnSavingTransactions());
                        System.out.println();
                        try {
                            System.out.println("Select the option for Savings account. \n 1. View balance \n2. Cash deposit \n3. Withdraw cash");
                            char chr = sc.next().charAt(0);
                            String str2 = Character.toString(chr);
                            int j = Integer.parseInt(str2);
                            switch (j) {
                                case 1 -> System.out.printf("Your balance is: %.2f", s.getMoneyVar());
                                case 2 -> {
                                    System.out.print("Enter the deposit cash value: ");
                                    double cashDeposit = sc.nextInt();
                                    s.depositOperation(cashDeposit);
                                }
                                case 3 -> {
                                    System.out.print("Enter the withdraw cash value: ");
                                    double cashWithdraw = sc.nextInt();
                                    s.withdrawOperation(cashWithdraw);
//                            System.out.printf("Your remaining balance is: %.2f", s.getMoneyVar());
                                }
                                default -> System.out.println("invalid option submenu of accounts.");
                            }
                        } catch (Exception e) {
                            System.out.println("invalid option: saving account");
                        }
                    }
                    case 2 -> {
                        System.out.printf("tax rate for current account is: %.2f", c.getTaxOnCurrentTransactions());
                        System.out.println();
                        try {
                            System.out.println("Select the option for Current account. \n 1. View balance \n2. Cash deposit \n3. Withdraw cash");
                            char chr = sc.next().charAt(0);
                            String str2 = Character.toString(chr);
                            int j = Integer.parseInt(str2);
                            switch (j) {
                                case 1 -> System.out.printf("Your balance is: %.2f", c.getMoneyVar());
                                case 2 -> {
                                    System.out.print("Enter the deposit cash value: ");
                                    double cashDeposit = sc.nextInt();
                                    c.depositOperation(cashDeposit);
                                }
                                case 3 -> {
                                    System.out.print("Enter the withdraw cash value: ");
                                    double cashWithdraw = sc.nextInt();
                                    c.withdrawOperation(cashWithdraw);
//                            System.out.printf("Your remaining balance is: %.2f", c.getMoneyVar());
                                }
                                default -> System.out.println("invalid option submenu of accounts.");
                            }
                        } catch (Exception e) {
                            System.out.println("!!!Outer While error!!!");
                        }
                    }
                    default -> {
                        System.out.println("invalid option: accounts.");
                    }
                }
            }catch (Exception e){
                System.out.println("invalid option: Accounts Saving 1, Current 2");
            }

            System.out.print("\nDo you want to continue; press 0 ");
            repeat = sc.next().charAt(0);
            if (repeat == '0') {
                System.out.print("\n1. Savings account \n2. Current account \nSelect the option for banking.");
                ch = sc.next().charAt(0);
                str = Character.toString(ch);
                i = Integer.parseInt(str);
            }else {
                System.out.println("good bye!");
            System.exit(100);
            }
        }
//        String userName="Gulraiz";
//        System.out.println(s.user(userName));  // calling user name from variables.




    }
}
