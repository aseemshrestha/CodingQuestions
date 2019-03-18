import java.util.LinkedHashMap;
import java.util.Map;

/* e.g. aaabcbdeaf Output : cbdeaf*/

public class LongestSubstringWithUniqueCharacters {

    public void longestSubStringWithUniqueChars(String inputString) {

        char[] charArray = inputString.toCharArray();
        String longestSubstring = null;
        int longestSubstringLength = 0;
        Map<Character, Integer> charPosMap = new LinkedHashMap<>();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if (!charPosMap.containsKey(ch)) {
                charPosMap.put(ch, i);
            }
            //If ch is already present in charPosMap, reposioning the cursor i
            // to the position of ch and clearing the charPosMap
            else {
                i = charPosMap.get(ch);
                charPosMap.clear();
            }
            //if (charPosMap.size() > longestSubstringLength) {
            longestSubstringLength = charPosMap.size();
            longestSubstring = charPosMap.keySet().toString();
            // }
        }
        System.out.println("Input String : " + inputString);
        System.out.println("The longest substring : " + longestSubstring);
        System.out.println("The longest Substring Length : " + longestSubstringLength);
    }

    public void longestSubStringWithUniqueCharsV2(String input) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < input.length(); i++) {
            if (!map.containsKey(input.charAt(i))) {
                map.put(input.charAt(i), i);
            } else {
              //  System.out.println(input.charAt(i)+"::" + i);
                i = map.get(input.charAt(i));
                map.clear();
            }
        }
        System.out.println(map.keySet().toString());
    }

    public static void main(String[] args) {

        LongestSubstringWithUniqueCharacters ls = new LongestSubstringWithUniqueCharacters();
        String s = "abaef";
        ls.longestSubStringWithUniqueChars(s);
        ls.longestSubStringWithUniqueCharsV2(s);
    }
}
