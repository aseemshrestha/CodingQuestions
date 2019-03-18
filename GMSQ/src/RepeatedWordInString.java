/* Find the first repeated word in a string. Input : "Ravi had been saying that he had been there" .Output : had*/
/*0(n)*/

import java.util.HashMap;
import java.util.Map;

public class RepeatedWordInString {

    public void printRepeatedWordInStrig(String sentence) {
        String[] words = sentence.split("\\s+");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                map.put(word, map.get(word) + 1);
            }
        }
        map.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        RepeatedWordInString rw = new RepeatedWordInString();
        rw.printRepeatedWordInStrig("Ravi had been saying that he had been there");
    }
}
