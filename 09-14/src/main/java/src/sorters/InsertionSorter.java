package src.sorters;

public class InsertionSorter implements Sorter {

    @Override
    public int[] sort(int[] elements) {
        int i, element;
        for (int j = 0; j < elements.length - 1; j++) {
            element = elements[j];
            i = j - 1;
            while (i >= 0 && elements[i] > element) {
                elements[i + 1] = elements[i];
                elements[i] = element;
                i = i - 1;
            }
        }
        return elements;
        // Programa INSERTION_SORT (A[], tamanho)
        // var i, j, elemento;

        // PARA j = 0 ATÉ tamanho - 1 FAÇA
        // elemento = A[j];
        // i = j – 1;

        // ENQUANTO ((i >= 0) e (A[i] > elemento)) FAÇA
        // A[i+1] = A[i]
        // A[i] = elemento
        // i = i–1
        // FIM_ENQUANTO
        // FIM_PARA
        // FIM

    }

}
