package stringManipulation.sherlockValidString;

import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.Map;

public class Solution {
    static String isValid(String s) {

        if (s.length() < 2) {
            return "YES";
        }

        Map<Character, Integer> charactersCount = new HashMap<>();

        int minCount = 0;
        int maxCount = 0;
        int minValue = 0;
        int maxValue = 0;

        Character[] chars = s.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
        for (Character c : chars) {
            int charCount = charactersCount.merge(c, 1, (V1, V2) -> (++V1));
        }

        IntSummaryStatistics charCountStats = charactersCount.entrySet().stream().mapToInt(Map.Entry::getValue).summaryStatistics();
        maxValue = charCountStats.getMax();
        minValue = charCountStats.getMin();

        for (Map.Entry<Character, Integer> charCount : charactersCount.entrySet()) {
            int count = charCount.getValue();

            if (count == maxValue) {
                maxCount++;
            }
            if (count == minValue) {
                minCount++;
            }
        }

        if (minValue == maxValue)
            return "YES";
        if((minCount*minValue + maxCount*maxValue) != s.length())
            return "NO";
        if(minValue==1 && minCount==1)
            return "YES";
        if(maxCount==1 && maxValue==minValue+1)
            return "YES";
        return "NO";
    }
}
