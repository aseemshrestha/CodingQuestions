import java.util.HashMap;
import java.util.Map;

public class Array_LongestSubArraySum {

    public void longestSubArraySum(int[] arr, int target) {
        int sum = 0;
        int maxLength = 0;
        int endIndex = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum == target) {
                maxLength = i + 1;
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
            if (map.containsKey(sum - target)) {
                if (maxLength < (i - map.get(sum - target))) {
                    maxLength = i - map.get(sum - target);
                    endIndex = i;
                }
            }
        }
        for (int j = endIndex - maxLength + 1; j <= endIndex; j++) {
            System.out.println(arr[j]);
        }

    }

    public void longestSubArraySumV2(int[] arr, int target) {
        int maxSofar = Integer.MIN_VALUE;
        int sum = 0;
        int s = 0;
        int start = 0, end = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (maxSofar < sum) {
                maxSofar = sum;
                start = s;
                end = i;
            }
            if (sum < 0) {
                sum = 0;
                s = i + 1;
            }
        }
        for (int i = start; i <= end; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(maxSofar);

    }

    public static void main(String[] args) {
        Array_LongestSubArraySum ls = new Array_LongestSubArraySum();
        int[] arr = new int[]{4, -2, -3, 4, -1, -2, 1, 5, -3};
        ls.longestSubArraySumV2(arr, 13);

    }
}

