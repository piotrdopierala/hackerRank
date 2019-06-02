package arrayLeftRotation;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void rotLeft() {
        final int noRotations = 4;
        final int[] arrayToRotate = {1,2,3,4,5};

        int[] rotateResult = Solution.rotLeft(arrayToRotate, noRotations);

        Assert.assertArrayEquals(rotateResult,new int[] {5,1,2,3,4});
    }
}