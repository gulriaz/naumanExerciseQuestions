package AbstractClassAndFunctions;

import AssignmentTwoIfElseIf.Main;

public class main {
    public static void main(String[] args) {

        IUser s = new SavingAccount();
        SavingAccount save = (SavingAccount)s;

        System.out.println("object of saving account in Interface: "+s);
        save.userName();
        System.out.println(save.displayUserName());

        System.out.println();

        SavingAccount s3 = new SavingAccount();
        System.out.println("object of saving account new created: "+s3);
        s3.userName();
        System.out.println(s3.displayUserName());






        ////        s.depositBanking();
////        s.withdrawBanking();
//        System.out.println("object of saving account in Interface: "+s);
//        SavingAccount s2 = (SavingAccount)s;
//        System.out.println("object of saving account in Interface EXPLICITLY TYPE CASTED TO SAVING: "+s2);
//
//        System.out.println();
//        System.out.println();
//
//        SavingAccount saving = new SavingAccount();
////        saving.userName();
//        System.out.println("object of saving account new created: "+saving);


    }

}
