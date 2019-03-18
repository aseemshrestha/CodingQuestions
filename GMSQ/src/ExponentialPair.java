public class ExponentialPair {

    public void exponentialPair(int[] a, int[] b) {
        int aLength = a.length;
        int bLength = b.length;
        for (int i = 0; i < aLength; i++) {
            for (int j = 0; j < bLength; j++) {
                if (Math.pow(a[i], b[j]) > Math.pow(b[j], a[i])) {
                    System.out.println(a[i] + " " + b[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        ExponentialPair ep = new ExponentialPair();
        int[] a = {2, 1, 6};
        int[] b = {1, 5};
        ep.exponentialPair(a, b);

    }
}
