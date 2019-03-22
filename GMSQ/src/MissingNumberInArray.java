import java.util.Arrays;

public class MissingNumberInArray {

    public int missingNumberInArray(int[] arr) {

        Arrays.sort(arr);

        int sumOfArr = 0;
        int sumOfNum = 1;

        for (int i = 0; i < arr.length; i++) {
            sumOfArr = sumOfArr + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            sumOfNum = sumOfNum + i;
        }

        return sumOfArr - sumOfNum;
    }

    public void missingSequentionalMissingNumbers(int[] arr) {

        Arrays.sort(arr);

        int start = 0;
        int end = 0;

        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] - arr[i - 1]) > 1) {
                start = arr[i - 1];
                end = arr[i];
            }
        }
        System.out.print("Missing interviews:");
        for (int i = start + 1; i < end; i++) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        MissingNumberInArray mn = new MissingNumberInArray();
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 8};
        int[] arr1 = new int[]{1, 2, 3, 4, 7, 8, 9};
        int missingNum = mn.missingNumberInArray(arr);
        System.out.println(missingNum);
        mn.missingSequentionalMissingNumbers(arr1);
    }
}
