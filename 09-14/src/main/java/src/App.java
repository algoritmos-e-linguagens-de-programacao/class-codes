package src;

public class App {

    public static void main(String[] args) {
        int[] valoresTeste = { 10, 100, 1000, 10000, 100000, 1000000, 10000000 };

        for (int i = 0; i < valoresTeste.length; i++) {
            System.out.println("vetor[" + valoresTeste[i] + "]");
            Vetor vetor = new Vetor();
            for (int j = 0; j < valoresTeste[i]; j++) {
                vetor.adicionar(j);
            }
            long startTime = System.currentTimeMillis();
            vetor.contains(valoresTeste[i] - 1);
            long stoppedTime = System.currentTimeMillis();
            System.out.println((stoppedTime - startTime));
        }

        // vetor[10,100,1000,10000,100000,1000000]

        // int vetor[] = { 1, 2, 3, 4, 5 };
        // int vetor2[] = new int[6];
        // for (int i = 0; i < vetor2.length; i++) {
        // vetor2[i] = vetor[i];
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
        // System.out.println(vetor);
        // vetor.adicionar(20);
        // vetor.adicionar(21);
        // vetor.adicionar(22);
        // vetor.adicionar(30);
        // vetor.adicionar(36);
        // System.out.println(vetor);
        // System.out.println(vetor.contains(13));
        // System.out.println(vetor.contains(43));

    }
}
