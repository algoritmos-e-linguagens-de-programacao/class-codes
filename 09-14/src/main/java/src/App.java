package src;

public class App {

    public static void main(String[] args) {
        // int vetor[] = new int[5];
        // vetor[3] = 3;
        // int vetor2[] = vetor;
        // vetor2[2] = 2;
        Vetor vetor = new Vetor();
        System.out.println(vetor);
        vetor.adicionar(10);
        vetor.adicionar(11);
        vetor.adicionar(12);
        vetor.adicionar(13);
        vetor.adicionar(14);
        // vetor.adicionar(20);
        System.out.println(vetor);
    }
}
