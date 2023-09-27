package LinkedList02;

import javax.xml.crypto.Data;

public class Operations<t> {
    DataMembersClass<t> head;

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

    public void displayLinkedList() {
        DataMembersClass<t> current = head;

        while (current != null) {
            System.out.println(current.NodeData + " = " + current.link);
            current = current.link;
        }
        System.out.println("list ended.");
    }

}
