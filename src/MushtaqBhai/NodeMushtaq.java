package MushtaqBhai;

public class NodeMushtaq<T>{
    public T dataPartOfNode;
    public NodeMushtaq<T> link;

    public NodeMushtaq(T node, NodeMushtaq<T> l){
        this.dataPartOfNode =node;
        this.link=l;
    }
}
