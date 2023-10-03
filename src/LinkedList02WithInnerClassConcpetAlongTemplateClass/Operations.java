package LinkedList02WithInnerClassConcpetAlongTemplateClass;

public class Operations<t> {
    private DataMembersClass<t> head;
    private t variableOuter;

//    DataMembersClass<t> current = new DataMembersClass<>();

    public void addNode(t x) {

        DataMembersClass<t> newNode = new DataMembersClass<>(x, null);

        if (head == null) {
            head = newNode;
            System.out.println("node added");
        } else {
            DataMembersClass<t> current = head;

            while (current.link != null) {

                current = current.link;
            }
            System.out.println("node added");
            System.out.println();
            current.link = newNode;
        }
    }

    private void displayLinkedList() {
        DataMembersClass<t> current = head;

        while (current != null) {
            System.out.println(current.NodeData + " = " + current.link);
            current = current.link;
        }
        System.out.println("list ended.");
    }

    public class Inner<T> {

        T variableInner;
        public void accessMethodInner(){

//            variableOuter=(t)variableInner;
            System.out.println("variable outer is accessed: "+variableOuter);
            System.out.println(">>>Accessing displaylinkedlist method.");
            displayLinkedList();

            System.out.println(">>>Accessing private head variable of linkedlist.");

            if(head!=null)
            System.out.println(head.NodeData +" == "+head.link);
            else
                System.out.println(">>>head of the list is null: "+head);
        }

    }

}
