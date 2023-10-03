package InnerOuterClassPractice01;

public class main {
    public static void main(String[] args) {
        CIOuter c1 = new CIOuter();
        CIOuter.Inner i = c1.new Inner();
        System.out.println("name accessed: "+i.acceableDataMembersOuterClass());

//         class innerMain implements OnClick{
//             @Override
//             public void ClickClick() {
//                 System.out.println("innerMain clickclick implemented.");
//             }
//         }
//
//         innerMain im = new innerMain();
//         im.ClickClick();
//         innerMain im2 = new innerMain();
//         im2.ClickClick();

        System.out.println();

        OnClick o = new OnClick() {
            @Override
            public void ClickClick() {
                System.out.println("anonymously called innerMain Class.");
            }
        };
        o.ClickClick();



    }
}
