public class Node {
    private int val;
    private Node next;

    public Node(int val){
        this.val = val;
        this.next = null;
    }

    public Node getNext(){
        return next;
    }
    public void setNext(Node node) {
        next = node;
    }

    public int getVal(){
        return val;
    }
}
