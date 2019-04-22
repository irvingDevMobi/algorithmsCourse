package mx.irving.arrays;

import java.util.HashMap;

public class AnagramJ {

    public static boolean areAnagram(String sentence1, String sentence2) {
        String s1 = sentence1.replace(" ", "").toLowerCase();
        String s2 = sentence2.replace(" ", "").toLowerCase();
        if (s1.length() != s2.length()) return false;

        HashMap<Character, Integer> lettersMap = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char letter = s1.charAt(i);
            if (lettersMap.containsKey(letter)) {
                lettersMap.put(letter, lettersMap.get(letter) + 1);
            } else {
                lettersMap.put(letter, 1);
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            char letter = s2.charAt(i);
            if (lettersMap.containsKey(letter)) {
               lettersMap.put(letter, lettersMap.get(letter) - 1);
            } else return false;
        }
        for (int c : lettersMap.values()) {
            if (c != 0) return false;
        }
        return true;
    }
}
