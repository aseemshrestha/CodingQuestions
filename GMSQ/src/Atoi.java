public class Atoi {

    public int atoi(String input) {

        if (input == "" || input == null) {
            return 0;
        }
        int startIndex = 0;
        int result = 0;
        boolean isNegative = false;

        input = input.replaceAll(" ", "");

        if (input.charAt(0) == '+') {
            startIndex++;
        }

        if (input.charAt(0) == '-') {
            startIndex++;
            isNegative = true;
        }

        for (int i = startIndex; i < input.length(); i++) {
            int digitValue = input.charAt(i) - '0';
            result = result * 10 + digitValue;
        }

        if (isNegative) {
            result = -result;
        }

        if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return result;
    }

    public static void main(String[] args) {
        Atoi atoi = new Atoi();
        System.out.println(atoi.atoi("1 23 "));
        System.out.println(atoi.atoi("1234"));
        System.out.println(atoi.atoi("+123"));
        System.out.println(atoi.atoi("-123"));
    }
}
