import java.util.Arrays;

public class DotProduct {

    public void dotProduct(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            System.out.println("Arrays length should be equal");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] * arr2[i];
        }
        System.out.println(Arrays.toString(result));
    }

    public void dotProductUnequal(int[] arr1, int[] arr2) {
        int arrLength = 0;

        if (arr1.length < arr2.length) {
            arrLength = arr1.length;
        } else if (arr2.length < arrLength) {
            arrLength = arr2.length;
        } else {
            arrLength = arr1.length;
        }
        int result[] = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            result[i] = arr1[i] * arr2[i];
        }
        System.out.println(Arrays.toString(result));
    }


    public static void main(String[] args) {
        DotProduct dp = new DotProduct();
        int[] a = {2, 3, 4};
        int[] b = {5, 6, 7,9};
        dp.dotProduct(a, b);
        dp.dotProductUnequal(a, b);

    }
}
