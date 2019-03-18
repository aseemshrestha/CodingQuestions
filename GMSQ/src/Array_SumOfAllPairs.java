public class Array_SumOfAllPairs {

    public void sumOfAllPairs(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for(int j=i+1;j < arr.length;j++) {
               // System.out.println("Pairs:{"+ arr[i]+","+arr[j]+"}");
                sum = sum + (arr[i] * arr[j]);
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4};
        Array_SumOfAllPairs s = new Array_SumOfAllPairs();
        s.sumOfAllPairs(arr);
    }
}
