package DAY5;

import java.util.*;

public class ex {
    public static char namegive(char[] arr) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : arr) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : arr) {
            if (map.get(c) > 1) {
                return c;
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        
    }
}
