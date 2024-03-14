package codingProgramms;

import java.util.HashSet;
import java.util.Set;

public class RemoveRepeatedVowels {

    public static void main(String[] args) {
        // TO DO: Write a Java program to check if a vowel is present in a string.

        String name = "Sahil Shaikh";
        checkVowel(name);
    }

    static void checkVowel(String name) {
        Set<Character> vowelSet = new HashSet<>();
        StringBuilder result = new StringBuilder();


        int count = 0;

        for (int i = 0; i < name.length(); i++) {
            char c = Character.toLowerCase(name.charAt(i)); // Convert to lower-case for case-insensitive check
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            	if(vowelSet.add(c)) {
                vowelSet.add(c);
                result.append(c);
                count++;
            	}
            }
        }
        System.out.println("The total number of vowels are: " + count);
        System.out.println("The unique vowels are: " + result );
    }
}
