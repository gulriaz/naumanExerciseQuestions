package LinkedList;

public class LinkedlistMain {
public static void main(String[] args) {

    LinkedListOperation<String> list = new LinkedListOperation<>();
    list.addIntoList("gulraiz");
    list.addIntoList("ali");
    list.addIntoList("ibrahim");
    list.addIntoList("meerab");
    list.addIntoList("qasim");

    list.printList();

    list.deleteList();
    System.out.println();
    System.out.println();
    list.printList();
    System.out.println();
    System.out.println();
    list.recoverTheDeleteEntry();
    System.out.println();
    System.out.println();
    list.printList();

}

}
