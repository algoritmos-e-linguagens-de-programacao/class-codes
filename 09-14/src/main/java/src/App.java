package src;

import javax.sound.midi.SysexMessage;

import src.sorters.BubbleSorter;
import src.sorters.InsertionSorter;
import src.sorters.SelectionSorter;

public class App {

    public static void main(String[] args) {
        int vetor[] = { 32, 5, 9, 1, 41 };
        int resp[];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        InsertionSorter insertionSorter = new InsertionSorter();
        resp = insertionSorter.sort(vetor);
        System.out.println();
        for (int i = 0; i < resp.length; i++) {
            System.out.print(resp[i] + " ");
        }
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
