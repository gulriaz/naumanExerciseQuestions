package InnerOutterClassConcept;

public class InnerHoldingOuter {

    private int head = 55555;

    public class Inner1st {
        private int head = 66666;

        public void displayInner1stClass() {   ///private method.
            int head = 77777;
            System.out.println("Inner1st " + head);

        }

        public class Inner2nd {
            int head = 88888;

            public void displayInner2ndClass() {
                int head = 9999;
                System.out.println("Inner2nd " + head);
            }

        }


    }
}
