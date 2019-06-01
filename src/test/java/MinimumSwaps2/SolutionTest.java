package MinimumSwaps2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void minimumSwaps() {
        int[] arr = {1,3,5,2,4,6,7};
        int minSteps = Solution.minimumSwaps(arr);

        Assert.assertEquals(3,minSteps);
    }

    @Test
    public void minimumSwaps2() {
        int[] arr = {1,3,5,2,4,6,7};
        int minSteps = Solution.minimumSwaps2(arr);

        Assert.assertEquals(3,minSteps);
    }

    @Test
    public void minimumSwaps2_100(){
        int[] arr = {8, 45, 35, 84, 79, 12, 74, 92, 81, 82, 61, 32, 36, 1, 65, 44, 89, 40, 28, 20, 97, 90, 22, 87, 48, 26, 56, 18, 49, 71, 23, 34, 59, 54, 14, 16, 19, 76, 83, 95, 31, 30, 69, 7, 9, 60, 66, 25, 52, 5, 37, 27, 63, 80, 24, 42, 3, 50, 6, 11, 64, 10, 96, 47, 38, 57, 2, 88, 100, 4, 78, 85, 21, 29, 75, 94, 43, 77, 33, 86, 98, 68, 73, 72, 13, 91, 70, 41, 17, 15, 67, 93, 62, 39, 53, 51, 55, 58, 99, 46};
        int minSteps = Solution.minimumSwaps2(arr);

        Assert.assertEquals(91,minSteps);
    }

    @Test
    public void minimumSwaps_100(){
        int[] arr = {8, 45, 35, 84, 79, 12, 74, 92, 81, 82, 61, 32, 36, 1, 65, 44, 89, 40, 28, 20, 97, 90, 22, 87, 48, 26, 56, 18, 49, 71, 23, 34, 59, 54, 14, 16, 19, 76, 83, 95, 31, 30, 69, 7, 9, 60, 66, 25, 52, 5, 37, 27, 63, 80, 24, 42, 3, 50, 6, 11, 64, 10, 96, 47, 38, 57, 2, 88, 100, 4, 78, 85, 21, 29, 75, 94, 43, 77, 33, 86, 98, 68, 73, 72, 13, 91, 70, 41, 17, 15, 67, 93, 62, 39, 53, 51, 55, 58, 99, 46};
        int minSteps = Solution.minimumSwaps(arr);

        Assert.assertEquals(91,minSteps);
    }

    private int factorial(int a) {
        if(a==0)
            return 1;
        return a*(factorial(a-1));

    }
}