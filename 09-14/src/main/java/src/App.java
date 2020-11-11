package src;

// import src.linked.ListaLigada;
// import src.linked.ListaLigadaCircular;
// import src.sorters.BubbleSorter;
// import src.sorters.InsertionSorter;
// import src.sorters.SelectionSorter;
import src.linked.duplamente.ListaDuplamenteLigada;

public class App {

    public static void main(String[] args) {
        ListaDuplamenteLigada lista = new ListaDuplamenteLigada();
        
        System.out.println(lista);
        lista.adicionar(21);
        lista.adicionar(41);
        lista.adicionar(1);
        lista.remocao(41);
        // lista.adicionar(7);
        // lista.adicionar(8);
        // lista.adicionar(11);
        System.out.println(lista);
        // int vetor[] = { 32, 5, 9, 1, 41 };
        // int resp[];
        // for (int i = 0; i < vetor.length; i++) {
        //     System.out.print(vetor[i] + " ");
        // }
        // InsertionSorter insertionSorter = new InsertionSorter();
        // resp = insertionSorter.sort(vetor);
        // System.out.println();
        // for (int i = 0; i < resp.length; i++) {
        //     System.out.print(resp[i] + " ");
        // }
        // vetor[3] = 3;
        // int vetor2[] = vetor;
        // vetor2[2] = 2;
        // Vetor vetor = new Vetor();
        // System.out.println(vetor);
        // vetor.adicionar(10);
        // vetor.adicionar(11);
        // vetor.adicionar(12);
        // vetor.adicionar(13);
        // vetor.adicionar(14);
        // // vetor.adicionar(20);
        // System.out.println(vetor);
    }
}
