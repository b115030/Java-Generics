import org.junit.Assert;
import org.junit.Test;

public class PrintMaxTest {

    @Test
    public void whenCallprintWelcomeMethod_shouldReturnTrue() {
        boolean returnWelcome = PrintMax.printWelcome();
        Assert.assertTrue(returnWelcome);
    }

    //Test Case 1.1 prints max Integer when max Integer is at first position
    @Test
    public void whenMaxIntegerIsFirstArgument_ShouldReturnFirstArgument() {
        Integer maxElement = new PrintMax<Integer>(86, 85, 45).testMaximum();
        Assert.assertEquals((Integer) 86, maxElement);
    }

    //test case 1.2 prints max Integer when max Integer is at second position
    @Test
    public void whenMaxIntegerIsSecondArgument_ShouldReturnSecondArgument() {
        Integer maxElement = new PrintMax<Integer>(25, 268, 15).testMaximum();
        Assert.assertEquals((Integer) 268, maxElement);
    }

    //test case 1.3 prints max Integer when max Integer is at third position
    @Test
    public void whenMaxIntegerIsThirdArgument_ShouldReturnThirdArgument() {
        Integer maxElement = new PrintMax<Integer>(25, 26, 150).testMaximum();
        Assert.assertEquals((Integer) 150, maxElement);
    }

    //test case 2.1 prints max Float when max Float is at first position
    @Test
    public void whenMaxFloatIsFirstArgument_ShouldReturnFirstArgument() {
        Float maxElement = new PrintMax<Float>(26.1256f, 26.05268f, 26.124896f).testMaximum();
        Assert.assertEquals((Float) 26.1256f, maxElement);
    }

    //test case 2.2 prints max Float when max Float is at Second position
    @Test
    public void whenMaxFloatIsSecondArgument_ShouldReturnSecondArgument() {
        Float maxElement = new PrintMax<Float>(26.1256f, 26.05268f, 26.124896f).testMaximum();
        Assert.assertEquals((Float) 26.1256f, maxElement);
    }

    //test case 2.3 prints max Float when max Float is at third position
    @Test
    public void whenMaxFloatIsThirdArgument_ShouldReturnThirdArgument() {
        Float maxElement = new PrintMax<Float>(26.1256f, 26.35268f, 26.374896f).testMaximum();
        Assert.assertEquals((Float) 26.374896f, maxElement);
    }

    //test case 3.1 prints max String when max String is at first position
    @Test
    public void whenMaxStringIsFirstArgument_ShouldReturnFirstArgument() {
        String maxElement = new PrintMax<String>("yddhdhdassa", "gudbdbdn", "assas").testMaximum();
        Assert.assertEquals("yddhdhdassa", maxElement);
    }

    //test case 3.2 prints max String when max String is at Second position
    @Test
    public void whenMaxStringIsSecondArgument_ShouldReturnSecondArgument() {
        String maxElement = new PrintMax<String>("aodlsdj", "bdhjdjhj", "ahhdhd").testMaximum();
        Assert.assertEquals("bdhjdjhj", maxElement);
    }

    //test case 3.3 prints max String when max String is at third position
    @Test
    public void whenMaxStringIsThirdArgument_ShouldReturnThirdArgument() {
        String maxElement = new PrintMax<String>("ahghddhdshj", "sjdskjkddd", "tewed").testMaximum();
        Assert.assertEquals("tewed", maxElement);
    }

    //test case 4.1 prints max Integer when more than three Integers passed
    @Test
    public void givenMoreThanThreeIntegers_ShouldReturnMaxInteger() {
        Integer maxElement = PrintMax.testMaximum(25, 26, 150, 655, 879, 15, 236, 17);
        Assert.assertEquals((Integer) 879, maxElement);
    }

    //test case 4.2 prints max Float when more than three Float passed
    @Test
    public void givenMoreThanThreeFloat_ShouldReturnMaxFloat() {
        Float maxElement = PrintMax.testMaximum(26.1256f, 26.35268f, 26.374896f, 26.58942f, 26.3655876595f, 26.455445f);
        Assert.assertEquals((Float) 26.58942f, maxElement);
    }

    //test case 4.3 prints max String when more than three Strings passed
    @Test
    public void givenMoreThanThreeString_ShoulReturnMaxString() {
        String maxElement = PrintMax.testMaximum("ahghddhdshj", "sjdskjkddd", "tewed", "fhkjhewf", "hiehie", "bwddw");
        Assert.assertEquals("tewed", maxElement);
    }
}
