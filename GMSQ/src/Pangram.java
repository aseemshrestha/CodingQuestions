
public class Pangram {

    public void printMissingInPangram(String input) {
        StringBuilder builder = new StringBuilder();
        for (char c = 'a'; c <= 'z'; c++) {
            if (!input.contains(String.valueOf(c))) {
                builder.append(c);
            }
        }
        System.out.println(builder.toString());
    }

    public static void main(String[] args) {
        Pangram p = new Pangram();
        p.printMissingInPangram("a");
    }
}
