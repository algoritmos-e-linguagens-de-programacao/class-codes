package src;

/**
 * 
 */
public class Vetor {

    private int elements[];// = new int[5];
    private int lastIndex = 0;

    /**
     * 
     */
    Vetor() {
        elements = new int[5];
    }

    /**
     * 
     */
    Vetor(int size) {
        elements = new int[size];
    }

    /**
     * Método para adicionar um valor no vetor em uma determinadar posição.
     * 
     * @param index
     * @param value
     */
    public void adicionar(int index, int value) {
        if (index < elements.length && index >= 0) {
            elements[index] = value;
        } else {
            adicionar(value);
        }
    }

    /**
     * Método para adicionar um elemento ao vetor na [0, 0, 0, 0, 0]
     * 
     * @param valor
     */
    public void adicionar(int valor) {
        if (lastIndex == elements.length) {
            int newTotalElements = elements.length + 5;
            int newElements[] = new int[newTotalElements];
            for (int i = 0; i < elements.length; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }

        elements[lastIndex] = valor;
        lastIndex++;
    }

    /**
     * 
     * @param index
     * @return
     */
    public int get(int index) {
        return elements[index];
    }

    public Boolean contains(int element) {
        // busca aleatoria

        // busca binaria recursiva
        // int size = elements.length;
        // int min = 0;
        // int max = size - 1;

        // return search(elements, element, min, max);

        // Busca binaria iterativa
        // int size = elements.length;
        // int min = 0;
        // int max = size - 1;
        // while (min <= max) {
        // int mid = (min + max) / 2;
        // int current = elements[mid];
        // if (element == current) {
        // return true;
        // } else if (current < element) {
        // min = mid + 1;
        // } else {
        // max = mid - 1;
        // }
        // }
        // return false;

        // busca linear
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == element)
                return true;
        }
        return false;
    }

    public Boolean search(int[] elements, int element, int min, int max) {
        // busca binaria recursiva
        int mid = (min + max) / 2;
        int current = elements[mid];
        if (element == current) {
            return true;
        } else if (min > max) {
            return false;
        } else if (current < element) {
            return search(elements, element, mid + 1, max);
        } else {
            return search(elements, element, min, mid - 1);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < elements.length; i++) {
            if (i < (elements.length - 1)) {
                stringBuilder.append(elements[i] + ", ");
            } else {
                stringBuilder.append(elements[i] + "]");
            }
        }
        return stringBuilder.toString();
    }

}