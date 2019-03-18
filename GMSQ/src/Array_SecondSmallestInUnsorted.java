public class Array_SecondSmallestInUnsorted {

    public int secondSmallest(int[] arr) {

        int smallest = arr[0];
        int secondSmallest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }

        }
        return secondSmallest;

    }

    public static void main(String[] args) {
        Array_SecondSmallestInUnsorted second = new Array_SecondSmallestInUnsorted();
        int[] arr = /*{1,2,3,4,5,19,8};*/ {5, 6, 3, 4, 5};
        int output = second.secondSmallest(arr);
        System.out.println(output);
    }
}
