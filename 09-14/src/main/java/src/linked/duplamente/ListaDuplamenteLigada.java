package src.linked.duplamente;

public class ListaDuplamenteLigada {

    private Node init;
    private Node end;

    public void adicionar(int value){
        if(init == null){
            init = new Node(value);
            end = init;
        }else{
            end.setNext(new Node(value, null, end));
            end = end.getNext();
        }
    }


    public void remocao(int value){        
        Node aux = init;
        while(value != aux.getValue() && aux.getNext() != null){
            aux = aux.getNext();
        }
        if(aux.getNext() == null) return;

        aux.getAnt().setNext(aux.getNext());
        aux.getNext().setAnt(aux.getAnt());
        aux.setAnt(null);
        aux.setNext(null);
    }


    @Override
    public String toString() {
        if (init == null) return "[]";
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("[");
        Node aux = init;
        while(aux.getNext() != null){
            strBuilder.append(aux + " ");
            aux = aux.getNext();
        }        
        strBuilder.append(aux + "]");
        return strBuilder.toString();
    }

}
