public class Fibonacci {

    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
       // System.out.println();
        return fib(n - 1) + fib(n - 2);
    }

    public int fibIterative(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int x = 0, y = 1, z = 1;

        for (int i = 0; i < n; i++) {
            x = y;
            y = z;
            z = x + y;
        }
        return x;

    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        for(int i=0;i < 5;i++) {
            System.out.print(f.fibIterative(i)+" ");
        }
        //System.out.println(f.fibIterative(5));
    }
}
