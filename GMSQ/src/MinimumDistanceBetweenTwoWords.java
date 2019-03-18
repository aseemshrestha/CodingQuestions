import java.util.StringTokenizer;

public class MinimumDistanceBetweenTwoWords {

    public void findDistanceBetweenTwoWords(String sentence, String word1, String word2) {

        StringTokenizer tokenizer = new StringTokenizer(sentence);
        int wordCount = 0;
        boolean start = false;
        while (tokenizer.hasMoreTokens()) {
            String next = tokenizer.nextToken();
            if (next.equals(word1)) {
                start = true;
                continue;
            }
            if (start) {
                if (next.equals(word2)) {
                    start = false;
                } else {
                    wordCount++;
                }
            }
        }
        System.out.println(wordCount);


    }

    public void findMinimumDistanceBetweenTwoWords(String sentence, String word1, String word2) {

        int indexWord1 = -1;
        int indexWord2 = -1;
        int tempDistance;
        int minDistance = Integer.MAX_VALUE;

        String[] wordArr = sentence.split(" ");
        for (int i = 0; i < wordArr.length; i++) {
            if (word1.equals(wordArr[i])) {
                indexWord1 = i;
            }
            if (word2.equals(wordArr[i])) {
                indexWord2 = i;
            }
            if (indexWord1 != -1 && indexWord2 != -1) {
                System.out.println(indexWord2 + ":" + indexWord1);
                tempDistance = Math.abs(indexWord2 - indexWord1);
                if (tempDistance < minDistance) {
                    minDistance = tempDistance;
                }
            }
        }
        System.out.println(minDistance);
    }

    public void findMinimumDistanceBetweenTwoWordsV2(String sentence, String word1, String word2) {

        String[] arr = sentence.split("\\s+");
        int start = -1;
        int end = -1;
        int distance = 0;
        for (int i = 0; i < arr.length; i++) {
            if (word1.equals(arr[i])) {
                start = i;
            }
            if (word2.equals(arr[i])) {
                end = i;
            }
            distance = Math.abs(end - start);
        }
        System.out.println(distance);

    }

    public static void main(String[] args) {
        MinimumDistanceBetweenTwoWords md = new MinimumDistanceBetweenTwoWords();
        String sentence = "quality and quality The picture quality is great of this camera";
        String word1 = "quality";
        String word2 = "camera";
        md.findMinimumDistanceBetweenTwoWordsV2(sentence, word1, word2);

    }
}
