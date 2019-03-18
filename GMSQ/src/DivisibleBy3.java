public class DivisibleBy3 {

    public boolean divisibleBy3(int[] arr) {
        int remainder = 0;
        for (int i = 0; i < arr.length; i++) {
            remainder = (remainder + arr[i]) % 3;
        }
        return remainder == 0;
    }

    public static void main(String[] args) {
        DivisibleBy3 div = new DivisibleBy3();
        int[] arr = {3,12};
        System.out.println(div.divisibleBy3(arr));
    }
}
