public class CamelCaseRemoveSpace {

    public void camelCase(String input) {

        String inputNoSpace = input.replaceAll("\\s+", "");
        StringBuilder builder = new StringBuilder();
        Character c = inputNoSpace.charAt(0);
        String first = c.toString().toUpperCase();
        builder.append(first);
        builder.append(inputNoSpace.substring(1));
        System.out.println(builder.toString());

    }

    public static void main(String[] args) {
        CamelCaseRemoveSpace cc = new CamelCaseRemoveSpace();
        cc.camelCase("aseem shrestha");
    }
}
