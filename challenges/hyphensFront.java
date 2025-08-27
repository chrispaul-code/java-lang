

import java.util.*;

public class hyphensFront {

    public static String moveHyphensToFront(String str) {
        if (str == null) {
            return null;
        }

        // StringBuilder to hold hyphens and characters separately
        StringBuilder hyphens = new StringBuilder();
        StringBuilder letters = new StringBuilder();

        // Loop through the string to separate hyphens and other characters
        for (char ch : str.toCharArray()) {
            if (ch == '-') {
                hyphens.append(ch);
            } else {
                letters.append(ch);
            }
        }

        // Concatenate hyphens at the front of other characters
        return hyphens.append(letters).toString();
    }

    public static void main(String[] args) {
        // Test the function with examples
        String input1 = "Mo----ve-Hyphens-to-Front";
        System.out.println(moveHyphensToFront(input1));  // Output: "---MoveHyphenstoFront"

        String input2 = "Str---------ing-Compar----------e";
        System.out.println(moveHyphensToFront(input2));  // Output: "-StringCompare"
    }
    
}
