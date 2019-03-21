public class PascalTriangle {

    public void printTriangle(int n) {
        int number;
        int space = n;
        for (int i = 0; i < n; i++) {
            for (int s = 1; s <= space; s++) {
                System.out.print(" ");
            }
            number = 1;
            for (int j = 0; j <= i; j++) {
                number = number * (i - j) / (j + 1);
            }
            space--;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PascalTriangle pt = new PascalTriangle();
        pt.printTriangle(5);
    }
}
