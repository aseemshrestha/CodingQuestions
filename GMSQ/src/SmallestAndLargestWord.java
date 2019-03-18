import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SmallestAndLargestWord {

    public void smallestAndLargestWord(String input) {

        String[] words = input.split("\\s+");
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], words[i].length());
        }
        Integer max = Collections.max(map.values());
        Integer min = Collections.min(map.values());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                System.out.println(entry.getKey() + " " + max);
            }
            if (entry.getValue() == min) {
                System.out.println(entry.getKey() + " " + min);
            }
        }
    }

    public static void main(String[] args) {
        SmallestAndLargestWord sm = new SmallestAndLargestWord();
        sm.smallestAndLargestWord("This is a test string");

    }
}
