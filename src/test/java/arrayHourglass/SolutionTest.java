package arrayHourglass;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void hourglassSum() {
        int[][] input = new int[6][];

        input[0] = new int[] {1,1,1,0,0,0};
        input[1] = new int[] {0,1,0,0,0,0};
        input[2] = new int[] {1,1,1,0,0,0};
        input[3] = new int[] {0,0,2,4,4,0};
        input[4] = new int[] {0,0,0,2,0,0};
        input[5] = new int[] {0,0,1,2,4,0};


        int hourglassSum = Solution.hourglassSum(input);

        Assert.assertEquals(hourglassSum,19);

    }
}