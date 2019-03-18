public class PairIntegerEqualtoaGivenNumber {

    public void pairInteger(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            for(int j=0; j < arr.length; j++) {
                if(arr[i] + arr[j] == num) {
                    System.out.println(arr[i]+":"+arr[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        PairIntegerEqualtoaGivenNumber p = new PairIntegerEqualtoaGivenNumber();
        int[] arr = new int[] {2,3,4,5,6,7,8};
        p.pairInteger(arr,5);
    }
}
