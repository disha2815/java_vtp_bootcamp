package DAY3;
import java.util.*;
public class pgm1 {
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        System.out.println("First non-repeating character using brute force: " + firstNonRepeatingCharacter("swiss"));
        System.out.println("First non-repeating character using hashing: " + firstNonRepeatingCharacterHashing("swiss"));
    }


    
    public static char firstNonRepeatingCharacterHashing(String str) {

            HashMap<Character, Integer> map = new HashMap<>();
            for(char c : str.toCharArray()){
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            for(char c : str.toCharArray()) {
                if(map.get(c) == 1){
                    return c;
                }
            }
            return '\0';
    }




        public static char firstNonRepeatingCharacter(String str) {
            int[] charCount = new int[256]; // Assuming ASCII characters

            // Count the occurrences of each character
            for (char c : str.toCharArray()) {
                charCount[c]++;
            }

            // Find the first non-repeating character
            for (char c : str.toCharArray()) {
                if (charCount[c] == 1) {
                    return c;
                }
            }

            return '\0'; // Return null character if no non-repeating character is found
    }
}
