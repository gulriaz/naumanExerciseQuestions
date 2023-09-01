package LinkedList;

public class LinkedListOperation <T> {
    private Node<T> head=null;

    public void addIntoList(T t){

        Node<T> newNode = new Node<>(t,null);

        if(head==null){
            head=newNode;
        }else{
            Node<T> current = head;
            while (current.link!=null){
                current=current.link;
            }
            current.link=newNode;
        }
    }

    public void printList(){
        Node<T> current = head;
        while (current!=null){
            System.out.println(">"+current.data);
            current=current.link;
        }
    }
T savedNode;

    public void deleteList(){
        Node<T> current = head;

        if (current!=null){
            savedNode=current.data;
            head=current.link;
        }

    }

    public void recoverTheDeleteEntry(){
        addIntoList(savedNode);
    }


}
