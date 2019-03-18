public class TwoFractions {
    /*
        GCD of N / D is 0, the GCD is D
        otherwise, GCD is the GCD of D and the remainder of N/D
     */
    public void sumOfTwoFractions(int n1, int d1, int n2, int d2) {

        int d3 = gcd(d1, d2);
        // System.out.println(d3);
        d3 = (d1 * d2) / d3;
        int sum = (n1) * (d3 / d1) + (n2) * (d3 / d2);
      //  System.out.println(sum+"/"+d3);
        lowest(d3, sum);
    }

    private void lowest(int d3, int sum) {
        int cf = gcd(sum, d3);
        d3 = d3 / cf;
        sum = sum / cf;
        System.out.println(sum+"/"+ d3);
    }

    private int gcd(int n, int d) {
        if (n % d == 0) {
            return d;
        }
        return gcd(d, n % d);
    }

    public static void main(String[] args) {

        TwoFractions tf = new TwoFractions();
        tf.sumOfTwoFractions(1, 500, 2, 1500);
    }
}
