import java.util.*;

public class GroupAnagrams {

    private List<String> anagramList = new ArrayList<>();

    public void findAllAnagrams(List<String> wordList) {
        for(int i=0;i < wordList.size();i++) {
            for(int j=i+1; j < wordList.size(); j++) {
                if(isAnagram(wordList.get(i), wordList.get(j))) {
                    anagramList.add(wordList.get(i));
                    anagramList.add(wordList.get(j));
                }
            }
        }
        System.out.println(anagramList);
    }



    public boolean isAnagram(String input1, String input2) {

        char[] input1Arr = input1.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        boolean isAnagram = true;
        if (input1.length() != input2.length()) {
            isAnagram = false;
        }
        for (int i = 0; i < input1Arr.length; i++) {
            if (!map.containsKey(input1Arr[i])) {
                map.put(input1Arr[i], 1);
            }
        }
        char[] input2Arr = input2.toCharArray();
        for (int i = 0; i < input2Arr.length; i++) {
            if (!map.containsKey(input2Arr[i])) {
                isAnagram = false;
            }
        }
        return isAnagram;
    }


    public static void main(String[] args) {
        GroupAnagrams anagrams = new GroupAnagrams();
       // System.out.println(anagrams.isAnagram("geeksquiz", "zuiqkeegs"));

        String[] wordsArray = new String[]{"geeksquiz", "geeksforgeeks", "abcd",
                "forgeeksgeeks", "zuiqkeegs","asda","asdadasd","aseem","seema","ateet","eetat"};

       List<String> wordList = Arrays.asList(wordsArray);
       anagrams.findAllAnagrams(wordList);
    }
}
