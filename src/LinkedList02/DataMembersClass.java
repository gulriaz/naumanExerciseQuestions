package LinkedList02;

public class DataMembersClass<T> {
    T NodeData;
    DataMembersClass<T> link;

    public DataMembersClass(T n,DataMembersClass<T> l) {
        this.NodeData = n;
        this.link = l;
    }

}
