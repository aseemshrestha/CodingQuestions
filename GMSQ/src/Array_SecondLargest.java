public class Array_SecondLargest {

    public void secondLargestInArray(int[] arr) {
        int largest = arr[0];
        int secondLargest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }

    public static void main(String[] args) {
        int[] arr = {6, 7, 3, 4, 5, 11, 9, 12};
        Array_SecondLargest sl = new Array_SecondLargest();
        sl.secondLargestInArray(arr);
    }
}
