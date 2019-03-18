
/*
O(Logxy)
 */
public class PowerOf {

    public boolean isPower(int x, int y) {
        if (x == 1) {
            return y == 1;
        }
        int pow = 1;
        while (pow < y) {
            pow = x * pow;
        }
        return pow == y;
    }
    //O(Log Log y)
    boolean isPowerV2(int x, int y)
    {
        // logarithm function to
        // calculate value
        int res1 = (int)Math.log(y) /
                (int)Math.log(x);

        // Note : this is double
        double res2 = Math.log(y) /
                Math.log(x);

        // compare to the result1 or
        // result2 both are equal
        return (res1 == res2);
    }

    public static void main(String[] args) {

        PowerOf pf = new PowerOf();
        System.out.println(pf.isPower(2, 16));


    }
}
