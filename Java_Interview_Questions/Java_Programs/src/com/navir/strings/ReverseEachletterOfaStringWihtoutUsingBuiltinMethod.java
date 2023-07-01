public class ReverseLetters {
    public static void main(String[] args) {
        String str = "Hello World!";
        String reversedString = reverseLetters(str);
        System.out.println(reversedString);
    }

    public static String reverseLetters(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        // Iterate through the string from both ends
        while (left < right) {
            // Skip non-alphabetic characters from the left
            if (!Character.isLetter(chars[left])) {
                left++;
            }
            // Skip non-alphabetic characters from the right
            else if (!Character.isLetter(chars[right])) {
                right--;
            }
            // Reverse alphabetic characters
            else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        // Return the reversed string
        return new String(chars);
    }
}
