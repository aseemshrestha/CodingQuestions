public class LargestPalindrome {

    public boolean isPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;
        while (end > start) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public String longestPalindromev2(String input) {
        int start, end;
        String cp, lp = "";
        for (int i = 0; i < input.length(); i++) {
            start = i;
            end = i + 2;
            while (start >= 0 && end < input.length()) {
                if (input.charAt(start) != input.charAt(end)) {
                    break;
                }
                cp = input.substring(start, end + 1);
                lp = cp.length() > lp.length() ? cp : lp;
                start--;
                end++;
            }
        }
        return lp;

    }

    public static void main(String[] args) {
        LargestPalindrome lp = new LargestPalindrome();
        String s = "abababa";
        String s1 = "zasxababababvret";
        System.out.println(lp.isPalindrome(s));
        System.out.println(lp.longestPalindromev2(s1));

    }
}
