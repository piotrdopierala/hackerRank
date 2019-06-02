package AlternatingCharacters;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void alternatingCharacters() {
        final String testString = "AABAAB";

        int noDeletions = Solution.alternatingCharacters(testString);

        Assert.assertEquals(2,noDeletions);
    }

    @Test
    public void alternatingCharactersAAABBB() {
        final String testString = "AAABBB";

        int noDeletions = Solution.alternatingCharacters(testString);

        Assert.assertEquals(4,noDeletions);
    }
}