package LinkedList02;

public class main {
    public static void main(String[] args) {
        Operations<Integer> s = new Operations<>();
        s.addNode(5);
        s.addNode(25);
        s.addNode(32);
        s.addNode(55);

        s.displayLinkedList();
    }
}
