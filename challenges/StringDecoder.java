

public class StringDecoder {
    public static String decode(String encodedString) {
        StringBuilder decodedString = new StringBuilder();
        int count = 0;

        for (int i = 0; i < encodedString.length(); i++) {
            if (encodedString.charAt(i) == '1') {
                count++;
            } else { // When we encounter '0'
                if (count > 0) {
                    decodedString.append((char) ('A' + count - 1));
                    count = 0; // Reset count for the next letter
                }
            }
        }

        // Append the last character if the string does not end with '0'
        if (count > 0) {
            decodedString.append((char) ('A' + count - 1));
        }

        return decodedString.toString();
    }

    public static void main(String[] args) {
        // Test examples
        String input1 = "101101110";
        String input2 = "111011110111111";

        System.out.println("Decoded output 1: " + decode(input1)); // Output: ABC
        System.out.println("Decoded output 2: " + decode(input2)); // Output: CDE
    }
}
