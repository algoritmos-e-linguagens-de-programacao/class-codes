package src.linked.duplamente;

public class Node {
    private int value;
    private Node next;
    private Node ant;

    Node(int _value) {
        value = _value;
    }    

    Node(int _value, Node _next, Node _ant) {
        value = _value;
        next = _next;
        ant = _ant;
    }

    public Node getAnt() {
        return ant;
    }

    public void setAnt(Node ant) {
        this.ant = ant;
    }

    public int getValue(){
        return value;        
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
