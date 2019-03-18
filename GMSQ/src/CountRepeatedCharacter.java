import java.util.LinkedHashMap;
import java.util.Map;

public class CountRepeatedCharacter {

    public String countRepeatedCharacters(String input) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (!map.containsKey(input.charAt(i))) {
                map.put(input.charAt(i), 1);
            } else {
                map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            builder.append(entry.getKey() + "" + entry.getValue());
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        CountRepeatedCharacter cr = new CountRepeatedCharacter();
        System.out.println(cr.countRepeatedCharacters("SSSSSTTPPQ"));

    }
}
