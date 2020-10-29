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
        PrintMax maxElement = new PrintMax(86, 85, 45);
        Assert.assertEquals(86, maxElement.testMaximum());
    }

    //test case 1.2 prints max Integer when max Integer is at second position
    @Test
    public void whenMaxIntegerIsSecondArgument_ShouldReturnSecondArgument() {
        PrintMax maxElement = new PrintMax(25, 268, 15);
        Assert.assertEquals(268, maxElement.testMaximum());
    }

    //test case 1.3 prints max Integer when max Integer is at third position
    @Test
    public void whenMaxIntegerIsThirdArgument_ShouldReturnThirdArgument() {
        PrintMax maxElement = new PrintMax(25, 26, 150);
        Assert.assertEquals(150, maxElement.testMaximum());
    }

    //test case 2.1 prints max Float when max Float is at first position
    @Test
    public void whenMaxFloatIsFirstArgument_ShouldReturnFirstArgument() {
        PrintMax maxElement = new PrintMax(26.1256f, 26.05268f, 26.124896f);
        Assert.assertEquals(26.1256f, maxElement.testMaximum());
    }

    //test case 2.2 prints max Float when max Float is at Second position
    @Test
    public void whenMaxFloatIsSecondArgument_ShouldReturnSecondArgument() {
        PrintMax maxElement = new PrintMax(26.1256f, 26.05268f, 26.124896f);
        Assert.assertEquals(26.1256f, maxElement.testMaximum());
    }

    //test case 2.3 prints max Float when max Float is at third position
    @Test
    public void whenMaxFloatIsThirdArgument_ShouldReturnThirdArgument() {
        PrintMax maxElement = new PrintMax(26.1256f, 26.35268f, 26.374896f);
        Assert.assertEquals(26.374896f, maxElement.testMaximum());
    }

    //test case 3.1 prints max String when max String is at first position
    @Test
    public void whenMaxStringIsFirstArgument_ShouldReturnFirstArgument() {
        PrintMax maxElement = new PrintMax("yddhdhdassa", "gudbdbdn", "assas");
        Assert.assertEquals("yddhdhdassa", maxElement.testMaximum());
    }

    //test case 3.2 prints max String when max String is at Second position
    @Test
    public void whenMaxStringIsSecondArgument_ShouldReturnSecondArgument() {
        PrintMax maxElement = new PrintMax("aodlsdj", "bdhjdjhj", "ahhdhd");
        Assert.assertEquals("bdhjdjhj", maxElement.testMaximum());
    }

    //test case 3.3 prints max String when max String is at third position
    @Test
    public void whenMaxStringIsThirdArgument_ShouldReturnThirdArgument() {
        PrintMax maxElement = new PrintMax("ahghddhdshj", "sjdskjkddd", "tewed");
        Assert.assertEquals("tewed", maxElement.testMaximum());
    }
}
