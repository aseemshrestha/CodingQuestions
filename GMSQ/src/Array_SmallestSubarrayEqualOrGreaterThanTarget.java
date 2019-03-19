public class Array_SmallestSubarrayEqualOrGreaterThanTarget {

    public void printSmallestSubArray(int[] arr, int target) {

        int sum = 0;
        int minLength = arr.length + 1;
        int start = 0, end = 0;
        int n = arr.length;
        while (end < n) {
            while (sum < target && end < n) {
                sum = sum + arr[end++];
            }
            if (sum == target & start < n) {
                for (int i = start; i < end; i++) {
                    System.out.print(arr[i] + " ");
                }
                minLength = end - start;

            }
            sum = sum - arr[start++];
        }

        System.out.println(minLength);
    }

    public void printSmallestSubArrayEqualtoTarget(int[] arr, int target) {
        int start = -1;
        int end = -1;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length && (j - i + 1) < min; j++) {
                //   System.out.println(j - i + 1 );
                sum = sum + arr[j];
                if (sum == target) {
                    start = i;
                    end = j;
                    min = end - start + 1;
                }
            }
        }
        for (int i = start; i <= end; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Array_SmallestSubarrayEqualOrGreaterThanTarget s = new Array_SmallestSubarrayEqualOrGreaterThanTarget();
        int[] arr = new int[]{25, 12, 14, 22, 19, 15, 10, 23};
        s.printSmallestSubArray(arr, 55);
        s.printSmallestSubArrayEqualtoTarget(arr, 55);

    }
}
