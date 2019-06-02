package alternatingCharacters;

public class Solution {

    static int alternatingCharacters(String s) {
        int noDeletions = 0;
        StringBuilder builder = new StringBuilder(s);

        if (s.length() < 2) {
            return 0;
        }

        int i = 1;
        while (i < builder.length()) {
            if (builder.charAt(i) == builder.charAt(i - 1)) {
                builder.deleteCharAt(i);
                noDeletions++;
            } else {
                i++;
            }
        }
        return noDeletions;
    }
}
