import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String input = "Hello World";
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Convert the string to lowercase to ignore case sensitivity
        input = input.toLowerCase();

        // Iterate over each character in the string
        for (char c : input.toCharArray()) {
            // Ignore spaces
            if (c == ' ') {
                continue;
            }

            // Update the character count in the map
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        // Print duplicate characters
        System.out.println("Duplicate characters in the string:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
            }
        }
    }
}
