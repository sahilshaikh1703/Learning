package codingProgramms;
public class VowelCheck {

    public static void main(String[] args) {
        // TO DO: Write a Java program to check if a vowel is present in a string.

        String name = "Bhaskar";
        checkVowel(name);
    }

    static void checkVowel(String name) {
        int count = 0;

        System.out.print("The vowels are: ");
        for (int i = 0; i < name.length(); i++) {
            char c = Character.toLowerCase(name.charAt(i)); // Convert to lowercase for case-insensitive check
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.print(c + " ");
                count++;
            }
        }
        System.out.println("\nThe total number of vowels are: " + count);
    }
}