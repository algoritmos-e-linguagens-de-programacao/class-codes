package src;

/**
 * 
 */
public class Vetor {

    private int elements[];// = new int[5];
    private int last_index = 0;

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
        // verificar o tamanho do vetor
        //
        // elements[last_index] = valor;
        // last_index++;
        if (last_index == elements.length) {
            int old_elements[] = elements;
            int new_index = elements.length + 1;
            int new_elements[] = new int[new_index];

        } else {
            elements[last_index] = valor;
            last_index++;
        }
        // elements
    }

    /**
     * 
     * @param index
     * @return
     */
    public int get(int index) {
        return elements[index];
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