
public class CaesarCiphorEncryptor{
    public static void main(String[] args) {
        String s = "abc";
        int key = 22;
        System.out.println(caesarCypherEncryptor(s, key));
    }
    public static String caesarCypherEncryptor(String input, int key) {
        StringBuilder result = new StringBuilder();
        int alphabetSize = 26;

        for (int i = 0; i < input.length(); i++) {
            char originalChar = input.charAt(i);
            char shiftedChar = originalChar;

            if (originalChar >= 'a' && originalChar <= 'z') {
                shiftedChar = (char) ('a' + (originalChar - 'a' + key) % alphabetSize);
            }

            result.append(shiftedChar);
        }

        return result.toString();
    }
}