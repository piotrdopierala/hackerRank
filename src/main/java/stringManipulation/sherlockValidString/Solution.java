package stringManipulation.sherlockValidString;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Solution {
    static String isValid(String s) {
        Map<Character, Integer> charactersCount = new HashMap<>();

        int minCount = 0;
        int maxCount = 0;
        int minValue = 0;
        int maxValue = 0;

        Character[] chars = s.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
        for (Character c : chars) {
            int charCount = charactersCount.merge(c, 1, (V1, V2) -> (++V1));
        }

        int lettersToBeRemoved = 0;
        int lastLetterCount = 0;
        int i = 0;
        for (Map.Entry<Character, Integer> charCount : charactersCount.entrySet()) {
            if (i == 0) {
                lastLetterCount = charCount.getValue();
                i++;
            } else {
                lettersToBeRemoved += Math.abs(lastLetterCount - charCount.getValue());
                if (lettersToBeRemoved > 1)
                    return "NO";
            }
        }
        return "YES";
    }
}
