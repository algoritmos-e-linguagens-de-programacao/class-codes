package src.linked;

public class ListaLigadaCircular {

    private Node init;
    private Node end;

    public void adicionar(int value){
        if(init == null){
            init = new Node(value);
            init.setNext(init);
            end = init;
            // end.setNext(init);
        }else{          
            Node novo = new Node(value, init);
            end.setNext(novo);
            end = end.getNext();
        }
    }


    public void remocao(int value){
        if(init == null){
            if(value == init.getValue()){

            }
        }else{
            Node aux = init;
            while(aux.getNext() != null || value == aux.getValue()){
                aux = aux.getNext();
            }
        }
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
