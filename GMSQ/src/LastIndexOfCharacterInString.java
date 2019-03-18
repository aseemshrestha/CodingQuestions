public class LastIndexOfCharacterInString {

    public void printLastIndex(String input, Character c) {
        int i = input.lastIndexOf(c);
        System.out.println(i);
    }

    public void printLastIndexV2(String input, Character c) {
        int lastIndex = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == c) {
                lastIndex = i;
            }
        }
        System.out.println(lastIndex);
    }

    public static void main(String[] args) {
        LastIndexOfCharacterInString li = new LastIndexOfCharacterInString();
        li.printLastIndexV2("aseem", 'e');
    }
}
