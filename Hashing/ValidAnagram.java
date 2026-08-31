import java.util.HashMap;
import java.util.Map;

/*
 * Problem: Valid Anagram
 * Platform: LeetCode
 * Difficulty: Easy
 *
 * Approach:
 * Count the frequency of each character in the first string.
 * Then decrease the frequency while traversing the second string.
 * If a character is missing or has an invalid frequency, the strings
 * are not anagrams.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n) in the worst case
 */

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> frequency = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            frequency.put(character, frequency.getOrDefault(character, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char character = t.charAt(i);

            if (!frequency.containsKey(character)) {
                return false;
            }

            frequency.put(character, frequency.get(character) - 1);

            if (frequency.get(character) == 0) {
                frequency.remove(character);
            }
        }

        return true;
    }
}
