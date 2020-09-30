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
            int newTotalElements = elements.length * 2;
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
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == element)
                return true;
        }
        return false;
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