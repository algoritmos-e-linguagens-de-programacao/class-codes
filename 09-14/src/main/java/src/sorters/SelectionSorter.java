package src.sorters;

public class SelectionSorter implements Sorter {

    @Override
    public int[] sort(int[] elements) {
        // programa selectionSort(a[],tamanho:inteiro)
        // var i, j, indice_min: inteiro
        int minIndex = 0;
        for (int i = 0; i < elements.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < elements.length - 1; j++) {
                if (elements[j] < elements[minIndex])
                    minIndex = j;
            }
            int aux = elements[i];
            elements[i] = elements[minIndex];
            elements[minIndex] = aux;
        }

        return elements;
        // i := 0;
        // para i até tamanho-1 faça
        // indice_min:= i;
        // para j de i+1 até j = tamanho-1 faça
        // se a[j] < a[indice_min]
        // indice_min:= j;
        // j++
        // fim_para;
        // i++;
        // troca(a[i], a[indice_min]);
        // fim_para;

    }

}
