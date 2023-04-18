public class LinkedList {

    private Node head;
    private int size;

    // constructor for linked list with dummy node as head.
    public LinkedList(){
        head = null;
        size = 0;
    }

    public void add(int val){
        Node new_node = new Node(val);
        if (head == null)
            head = new_node;
        else {
            Node last = head;
            while (last.getNext() != null) {
                last = last.getNext();
            }
            last.setNext(new_node);
        }
        size += 1;
    }

    public int getSize(){
        return size;
    }

    public Node getHead(){
        return head;
    }

    // mainly for testing
    public String toString(){
        String res = "";
        Node current = head;
        for (int i = 0 ; i < size ; i++){
            res += ""+current.getVal();
            current = current.getNext();
        }
        return res;
    }

    // to get the actual number
    public String reverse(){
        String res = "";
        Node current = head;
        for (int i = 0 ; i < size ; i++) {
            res = "" + current.getVal() + res;
            current = current.getNext();
        }
        return res;
    }
    public boolean isOdd(){
        String res = "";
        Node current = head;
        for (int i = 0 ; i < size ; i++) {
            res = "" + current.getVal() + res;
            current = current.getNext();
        }
        return Integer.parseInt(res) % 2 != 0;
    }
}
