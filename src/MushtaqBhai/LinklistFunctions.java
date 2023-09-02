package MushtaqBhai;


public class LinklistFunctions<dataTypeRecievedGeneric> {
    private NodeMushtaq<dataTypeRecievedGeneric> head = null;

    public void addALinkInThelist(dataTypeRecievedGeneric nodeValue) {
       NodeMushtaq<dataTypeRecievedGeneric> newNodeCreated = new NodeMushtaq<>(nodeValue, null);
        if (head == null) {
            head = newNodeCreated;
            System.out.println(">>= head: " + head.dataPartOfNode);
        } else {
            NodeMushtaq<dataTypeRecievedGeneric> currentNode = head;
            while (currentNode.link != null) {
                currentNode = currentNode.link; //updated current node to with next node, if link part has the address.
            }
            currentNode.link = newNodeCreated;
            System.out.println(">>= next : " + currentNode.dataPartOfNode);
        }
    }

    public void printLinklist() {
        if (head == null) {
            System.out.println("list is empty.");
        } else {
            NodeMushtaq<dataTypeRecievedGeneric> currentTraversing = head;
//            System.out.println(currentTraversing.dataPartOfNode);
            while (head != null) {
                System.out.println("data: " + head.dataPartOfNode);
//            System.out.println("address of next node: " + head.link);
                head = head.link;
            }
            System.out.println("linklist ended.");
        }
    }
}
