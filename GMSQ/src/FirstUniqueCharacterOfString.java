/*First unique character of a string. E.g. aabdcce . Output : d*/

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterOfString {

    public void firstUniqueCharacterOfString(String word) {
        char[] charArr = word.toCharArray();
        Map<Character, Integer> charMap = new LinkedHashMap<>();
        for (int i = 0; i < charArr.length; i++) {
            if (!charMap.containsKey(charArr[i])) {
                charMap.put(charArr[i], 1);
            } else {
                charMap.put(charArr[i], charMap.get(charArr[i]) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            Character k = entry.getKey();
            Integer v = entry.getValue();
            if (v == 1) {
                System.out.println(k);
                break;
            }
        }
    }

    public static void main(String[] args) {
        FirstUniqueCharacterOfString fs = new FirstUniqueCharacterOfString();
        fs.firstUniqueCharacterOfString("aadbcce");
    }
}
