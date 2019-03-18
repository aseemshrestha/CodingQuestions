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
            if (sum >= target & start < n) {
                minLength = end - start;

            }
            sum = sum - arr[start++];
        }
        System.out.println("beyween " + start +" "+minLength);
        System.out.println(minLength);
    }

    public void printSmallestSubArrayEqualtoTarget(int[] arr, int target) {

        int sum = 0;
        int left = 0;
        int right = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum == target) {
                for (int j = left; j <= i; j++) {
                    System.out.print(arr[j] + " ");
                }
            }
            if (sum > target) {
                sum = sum - arr[left];
                left++;
            }


        }
    }

    public static void main(String[] args) {
        Array_SmallestSubarrayEqualOrGreaterThanTarget s = new Array_SmallestSubarrayEqualOrGreaterThanTarget();
        int[] arr = new int[]{25, 12, 14, 22, 19, 15, 10, 23};
        s.printSmallestSubArray(arr, 55);
    }
}
