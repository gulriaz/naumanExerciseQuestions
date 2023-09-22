package InterfacingPractice03;

import java.util.function.LongUnaryOperator;
import java.util.function.Predicate;

public class main {
    public static void main(String[] args) {

//        IStringFunction exclamation = (n) -> n + "!";
//        IStringFunction questionMark = (n) -> n + "?";
//
//        OtherMethods o = new OtherMethods();
//
//        System.out.println(o.input("gulraiz", exclamation));
//        System.out.println(o.input("gulraiz", questionMark));
        Predicate<Integer> p = n -> {
            if (n >= 0) {
                return true;
            }
            return false;
        };

        int n = 7;
        boolean b = p.test(n);

        System.out.println(b);
    }
//    LongUnaryOperator factorial;

}
