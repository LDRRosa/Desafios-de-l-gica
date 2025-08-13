public class App {
    public static void main(String[] args) {
        double[] nums1 = { 1, 2, 6};
        double[] nums2 = { 3, 4, 5 };
        double[] mescla = new double[nums1.length + nums2.length];

        for (int i = 0; i < mescla.length; i++) {
            if (i < nums1.length) {
                mescla[i] = nums1[i];
            } else {
                mescla[i] = nums2[i - nums1.length];
            }
        }

        for (int i = 0; i < (mescla.length); i++) {
            for (int j = i + 1; j < mescla.length; j++) {
                if (mescla[i] > mescla[j]) {
                    double aux = mescla[i];
                    mescla[i] = mescla[j];
                    mescla[j] = aux;
                } else {
                }
            }

        }
        for (int j = 0; j < mescla.length; j++) {
            System.out.println(mescla[j]);
        }

        if (mescla.length % 2 != 0) {

            double mediana = mescla[mescla.length / 2];
            System.out.println("mediana= " + mediana);
        } else {
            double aux1 = mescla[mescla.length / 2] - 1;
            double aux2 = mescla[mescla.length / 2];
            double mediana = (aux1 + aux2) / 2;
            System.out.println("mediana= " + mediana);
        }

    }
}