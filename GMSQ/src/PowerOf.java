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
    boolean isPowerV2(int x, int y) {
        // logarithm function to
        // calculate value
        int res1 = (int) Math.log(y) /
                (int) Math.log(x);

        // Note : this is double
        double res2 = Math.log(y) /
                Math.log(x);

        // compare to the result1 or
        // result2 both are equal
        return (res1 == res2);
    }

    // Given the set of numbers identify pairs such that a^b = b^a
    public boolean arePowerOfEqual(int a, int powera, int b, int powerb) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (Math.pow(a, powera) == Math.pow(b, powerb)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean arePowerOfEqualV2(int[] a, int[] b, int p1, int p2) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (Math.pow(a[i], p1) == Math.pow(b[j], p2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        PowerOf pf = new PowerOf();
        System.out.println(pf.isPower(2, 16));
        int[] arr1 = new int[]{2, 3, 4, 5};
        int[] arr2 = new int[]{2, 3, 4, 5};
        pf.arePowerOfEqualV2(arr1, arr2, 2, 2);
    }
}
