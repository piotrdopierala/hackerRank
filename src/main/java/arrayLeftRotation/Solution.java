package arrayLeftRotation;

public class Solution {
    static int[] rotLeft(int[] a, int d) {
        int[] result = new int[a.length];

        for (int i = 0; i < result.length; i++) {
            int rawTargetIndex = i - d;
            int targetIndex = rawTargetIndex < 0 ? rawTargetIndex + result.length : rawTargetIndex;
            result[targetIndex] = a[i];
        }
        return result;
    }
}
