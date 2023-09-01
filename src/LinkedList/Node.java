package LinkedList;

public class Node <T>{

    T data;
    Node <T>  link;

    public Node() {
    }

    public Node(T data, Node<T> nodelink){
        this.data=data;
        this.link=nodelink;
    }
}
