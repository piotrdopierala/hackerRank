package stringManipulation.sherlockValidString;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void Should_isValid_Return_NO() {
        final String sampleNotValidString = "aabbccddeefghi";

        String validCheckResult = Solution.isValid(sampleNotValidString);

        Assert.assertEquals("NO",validCheckResult);
    }

    @Test
    public void Should_isValid_Return_NO_aaaabbcc() {
        final String sampleNotValidString = "aaaabbcc";

        String validCheckResult = Solution.isValid(sampleNotValidString);

        Assert.assertEquals("NO",validCheckResult);
    }

    @Test
    public void Should_isValid_Return_YES() {
        final String sampleValidString = "abcdefghhgfeedcba";

        String validCheckResult = Solution.isValid(sampleValidString);

        Assert.assertEquals("YES",validCheckResult);
    }

    @Test
    public void Should_isValid_Return_YES_long_string(){
        final String sampleValidString = "ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfbiiedcabfihchdfabifahcbhagccbdfifhghcadfiadeeaheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbdacgfgfeeibgaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahgihbcbcaggebaaafgfedbfgagfediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaiccededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacbhbfgfddeceababbacgffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifdcbbbidfifhdaibgigebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbbfcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdiabcifgccdefabccdghehfibfiifdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihdheefbhffiageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfbaggiffbbfbecgaiiidccdceadbbdfgigibgcgchafccdchgifdeieicbaididhfcfdedbhaadedfageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehiidfcgahcdhcdhgchhiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd";

        String validCheckResult = Solution.isValid(sampleValidString);

        Assert.assertEquals("YES",validCheckResult);
    }
}