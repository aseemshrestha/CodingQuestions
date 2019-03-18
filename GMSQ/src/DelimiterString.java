import java.util.ArrayList;
import java.util.List;

public class DelimiterString {

    public void printDelimiterString(String input, String delim) {
        List<String> list = new ArrayList<>();
        String[] words = input.split(delim);
        for (String word : words) {
            list.add(word);
        }
        System.out.println(list);

    }

    public static void main(String[] args) {
        DelimiterString ds = new DelimiterString();
        ds.printDelimiterString("hello how are you", " ");
    }
}
