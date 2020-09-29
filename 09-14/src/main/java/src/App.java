package src;

public class App {

    public static void main(String[] args) {
        // int vetor[] = { 1, 2, 3, 4, 5 };
        // int vetor2[] = new int[6];
        // for (int i = 0; i < vetor2.length; i++) {
        // vetor2[i] = vetor[i];
        // }

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
        System.out.println(vetor);
        vetor.adicionar(20);
        System.out.println(vetor);
    }
}
