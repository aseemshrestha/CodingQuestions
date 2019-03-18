import java.util.Arrays;

public class MeanMedianArray {

    public void printMeanMedian(int[] arr) {
        double mean = 0.0;
        double median = 0.0;
        int arrLength = arr.length;
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        mean = sum / arrLength;
        System.out.println("Mean:" + mean);
        if (arrLength % 2 == 0) {
            int index1 = (arrLength - 1) / 2;
            int index2 = (arrLength) / 2;
            median = (arr[index1] + arr[index2]) / 2;
        } else {
            median = arr[(arrLength + 1) / 2];
        }

        System.out.println("Median:" + median);
    }

    public static void main(String[] args) {
        MeanMedianArray mm = new MeanMedianArray();
        int[] arr = {1, 2, 4, 7};
        mm.printMeanMedian(arr);
    }
}
