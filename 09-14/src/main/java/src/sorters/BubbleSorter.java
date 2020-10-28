package src.sorters;

public class BubbleSorter implements Sorter {

    @Override
    public int[] sort(int[] elements) {
        for (int i = 0; i < elements.length - 1; i++) { // Para i = 1 até tamanho( A ) faça:
            for (int j = 0; j < elements.length - 1; j++) { // Para j = 1 até tamanho( A ) faça:
                if (elements[j] > elements[j + 1]) { // Se A[ j ] > A[ j - 1 ] então
                    int aux = elements[j]; // Trocar( A[ j ], A[ j - 1 ] )
                    elements[j] = elements[j + 1];
                    elements[j + 1] = aux;
                } // Fim se
            } // Fim para
        } // Fim para

        return elements;
    }

}
