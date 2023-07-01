import java.util.HashSet;

public class UniqueWords {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "orange", "apple", "grape", "banana"};

        HashSet<String> uniqueWords = new HashSet<>();

        for (String word : words) {
            uniqueWords.add(word);
        }

        System.out.println("Unique words:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }
}
