import java.util.*;

public class SortDescendingOrder {

    public String sortDescending(String input) {
        Character tempArr[] = new Character[input.length()];
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            tempArr[i] = input.charAt(i);
        }

        Arrays.sort(tempArr, new Comparator<Character>() {
            @Override
            public int compare(Character c1, Character c2) {
                return Character.compare(c2, c1);
            }
        });
        for (int i = 0; i < tempArr.length; i++) {
            builder.append(tempArr[i]);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        SortDescendingOrder sd = new SortDescendingOrder();
        System.out.println(sd.sortDescending("mupursingh"));
    }
}
