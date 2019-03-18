public class ArmstrongNumber {

    // 371 = 3*3*3 + 7*7*7 + 1*1*1 = 27 + 343 + 1 = 371
    // 153 = 1 + 125 + 27 = 153
    public boolean isArmstrong(int num) {
        int lastDigit;
        int numCopy = num;
        int result = 0;
        while(numCopy!=0) {
            lastDigit = numCopy % 10;
         //   System.out.println("last digit:" + lastDigit);
            result = result + (int)Math.pow(lastDigit, 3);
            numCopy = numCopy / 10;
           // System.out.println("numCopy:" + numCopy);
        }
       // System.out.println("result:" + result);
        if(result == num) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ArmstrongNumber an = new ArmstrongNumber();
        System.out.println(an.isArmstrong(371));
    }
}
