package Array01;

import java.util.ArrayList;

public class CArray <T>{
    ArrayList<T> nameStu = new ArrayList<>();
    ArrayList<T> regNumber = new ArrayList<>();

    public ArrayList<T> getNameStu() {
        return nameStu;
    }

    public void setNameStu(ArrayList<T> nameStu) {
        this.nameStu = nameStu;
    }

    public ArrayList<T> getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(ArrayList<T> regNumber) {
        this.regNumber = regNumber;
    }
}
