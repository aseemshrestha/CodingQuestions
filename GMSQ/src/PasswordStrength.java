public class PasswordStrength {

    /*Program to check Strength of Password. A password is said to be strong if it satisfies the following criteria:
    It contains at least one lowercase English character.
    It contains at least one uppercase English character.
    It contains at least one special character. The special characters
    are: !@#$%^&*(
    Its length is at least 8.
    It contains at least one digit.
    Given a string, find its strength. Let a strong password is
    one that satisfies all above conditions. A moderate password is one
    that satisfies first three conditions and has length atleast 6 */

    public String passwordMeter(String input) {
        boolean hasNumber = input.matches(".*\\d.*");  // "a digit with anything before or after"
        boolean hasSpecial = input.matches(".*[!@#$%^&*(].*");
        boolean hasLower = input.matches(".*[a-z].*");
        boolean hasUpper = input.matches(".*[A-Z].*");
        boolean hasLength = input.length() >= 8;

        if (hasNumber && hasSpecial && hasLower && hasUpper && hasLength) {
            return "Strong";
        } else if (hasLower && hasUpper && hasSpecial) {
            return "Moderate";
        } else {
            return "Weak";
        }
    }

    public static void main(String[] args) {

        PasswordStrength ps = new PasswordStrength();
        System.out.println(ps.passwordMeter("gfg!@12"));
        System.out.println(ps.passwordMeter("SapientGlobalMarkets!@12"));
    }
}
