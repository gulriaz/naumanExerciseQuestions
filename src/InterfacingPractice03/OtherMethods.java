package InterfacingPractice03;

public class OtherMethods {

    public String input(String i, IStringFunction type){

        String result=type.run(i);
        return result;
    }

}
