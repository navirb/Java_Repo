import java.util.Scanner;

public class CharacterOccurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Read the character to count from the user
        System.out.print("Enter a character: ");
        char characterToCount = scanner.next().charAt(0);

        // Close the scanner
        scanner.close();

        // Call the countCharacterOccurrence method
        int occurrenceCount = countCharacterOccurrence(inputString, characterToCount);

        // Print the occurrence count
        System.out.println("The character '" + characterToCount + "' occurs " + occurrenceCount + " time(s) in the string.");
    }

    public static int countCharacterOccurrence(String inputString, char characterToCount) {
        int count = 0;

        // Convert the string to lowercase for case-insensitive comparison
        inputString = inputString.toLowerCase();

        // Convert the character to lowercase for case-insensitive comparison
        characterToCount = Character.toLowerCase(characterToCount);

        // Iterate through each character of the string
        for (int i = 0; i < inputString.length(); i++) {
            // If the current character matches the character to count, increment the count
            if (inputString.charAt(i) == characterToCount) {
                count++;
            }
        }

        return count;
    }
}
