import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestRepeatingString {

    /*Given a String “aabbbbddcc”
    find the longest first repeating index and its length.
    (Input: “aabbbbddcc” Output: [2,4] 2 is the index and 4 is the length
     */
    public void longestRepeating(String input){
        char[] charArr = input.toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(int i=0; i < charArr.length; i++) {
            if(!map.containsKey(charArr[i])) {
                map.put(charArr[i], 1);
            }
            else {
                map.put(charArr[i], map.get(charArr[i]) + 1);
            }
        }
       for(Map.Entry<Character, Integer> entry: map.entrySet()) {
           if(entry.getValue() > 1) {
              // System.out.println(entry.getKey());
               int max = Collections.max(map.values());
               char maxKey = Collections.max(map.keySet());
               System.out.println(maxKey +" " + max);
           }
           break;
       }

    }
    public static void main(String[] args) {
        LongestRepeatingString lr = new LongestRepeatingString();
        lr.longestRepeating("aaddddaaabbcc");
    }
}
