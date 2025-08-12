import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        int[] vet = { 1, 1, 2, 3, 4, 5, 5, 6 };
        ArrayList<int[]> list = new ArrayList<int[]>();

        for (int j = 0; j < vet.length; j++) {
            boolean encontrado = false;

            for (int i = 0; i < list.size(); i++) {

                if (list.get(i)[0] == vet[j]) {
                    list.get(i)[1]++;
                    encontrado = true;
                    break;
                }

            }

            if (encontrado == false) {

                int[] complementer = new int[2];
                complementer[0] = vet[j];
                complementer[1] = 1;
                list.add(complementer);
            }
        }
        System.out.println("contagem");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("[" + list.get(i)[0] + "]" + "[" + list.get(i)[1] + "]");
        }
    }
}
