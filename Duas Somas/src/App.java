public class App {
    public static void main(String[] args) throws Exception {
        int[] vet = { 3, 2, 4, 7, 5, 20, 40, 3, 75, 1, 2, 15, 10, 9 };
        int alvo = 10;

        for (int i = 0; i < vet.length; i++) {
            int atual = vet[i];

            for (int j = 0; j < vet.length; j++) {
                if (atual + vet[j] == alvo) {
                    System.out.println("posições " + i + " e " + j);
                    break;
                }
            }

        }

    }
}
