package src.linked;

public class Node {
    int value;
    Node next;

    Node(int _value){
        value = _value;
    }

    Node(int _value,  Node _next){
        value = _value;
        next = _next;
    }

    public Node getNext(){
        return next;
    }

    public void setNext(Node _next){
        next = _next;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
