public class ReverseWords {

    public void reverseWords(String sentence) {

        String[] words = sentence.split("\\s+");
        StringBuilder builder = new StringBuilder();
        for(int i = words.length-1; i >=0; i--) {
            builder.append(words[i]+" ");
        }
        System.out.println(builder.toString());
    }

    public static void main(String[] args) {
        ReverseWords rw = new ReverseWords();
        rw.reverseWords("I AM A TESTER");
    }
}
