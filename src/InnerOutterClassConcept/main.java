package InnerOutterClassConcept;

public class main {
    public static void main(String[] args) {
        /**
         *
         * inner class also called member class.
         * inner class will be written inside outer class.
         * inner class object will be created inside the heap space of outer class. e.g. Outer.InnerHoldingOuter i = Outer.new InnerHoldingOuter();
         * all data members of outer class will be accessible inside inner class.
         * there is an exceptional concept of shadowing when having the same name of variables. a, this.a, outer.a, outer.outer.a;
         * //SHADOWING>>>>Note when there are same variable names, priority will be given to local first. Then variable in scope, than variable if part of outer.
         *
         * ??????>>>>a private dataMember in outer class is available to inner class Only, not private methods.
         *
         * **/

        //first just accessing outer class and setting values for future purpose.
        InnerHoldingOuter i = new InnerHoldingOuter();
        //dear head variable is private and cannot be acessed by anyone outside this class.
        //but i need it, so i will acess it using Inner class, and encapsulation is basically increased by this way.
        //like we use getttersetter to acess it for encapsulation.

        InnerHoldingOuter.Inner1st i2 = new InnerHoldingOuter().new Inner1st(); //phly outer k object bna raha than us mein new inner object bna raha.

        InnerHoldingOuter.Inner1st i3 = i.new Inner1st(); //previous outer obj created ha us mein new create kiya ha.
//        i3.displayInner1stClass();

        InnerHoldingOuter.Inner1st.Inner2nd i4 = i3.new Inner2nd();
        i4.displayInner2ndClass();

    }
}
