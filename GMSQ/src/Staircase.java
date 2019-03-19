public class Staircase {

    public void print(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if((i+j) > n) {
                    System.out.print("#");
                }

                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Staircase st = new Staircase();
        st.print(10);

    }
}
