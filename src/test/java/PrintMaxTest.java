import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrintMaxTest {
    PrintMax printMax;

    @Before
    public void setUp() {
        printMax = new PrintMax();
    }

    @Test
    public void whenCallprintWelcomeMethod_shouldReturnTrue() {
        boolean returnWeclome = printMax.printWelcome();
        Assert.assertTrue(returnWeclome);
    }

    //Test Case 1.1 prints max Integer when max Integer is at first position
    @Test
    public void whenMaxIntegerIsFirstArgument_ShouldReturnFirstArgument() {
        Integer maxNumber = printMax.printMaxInteger(86, 85, 45);
        Assert.assertEquals((Integer) 86, maxNumber);
    }

    //test case 1.2 prints max Integer when max Integer is at second position
    @Test
    public void whenMaxIntegerIsSecondArgument_ShouldReturnSecondArgument() {
        Integer maxNumber = printMax.printMaxInteger(25, 268, 15);
        Assert.assertEquals((Integer) 268, maxNumber);
    }

    //test case 1.3 prints max Integer when max Integer is at third position
    @Test
    public void whenMaxIntegerIsThirdArgument_ShouldReturnThirdArgument() {
        Integer maxNumber = printMax.printMaxInteger(25, 26, 150);
        Assert.assertEquals((Integer) 150, maxNumber);
    }

    //test case 2.1 prints max Float when max Float is at first position
    @Test
    public void whenMaxFloatIsFirstArgument_ShouldReturnFirstArgument() {
        Float maxNumber = printMax.printMaxFloat(26.1256f, 26.05268f, 26.124896f);
        Assert.assertEquals((Float) 26.1256f, maxNumber);
    }

    //test case 2.2 prints max Float when max Float is at second position
    @Test
    public void whenMaxFloatIsSecondArgument_ShouldReturnSecondArgument() {
        Float maxNumber = printMax.printMaxFloat(26.1256f, 26.35268f, 26.324896f);
        Assert.assertEquals((Float) 26.35268f, maxNumber);
    }

    //test case 2.3 prints max Float when max Float is at third position
    @Test
    public void whenMaxFloatIsThirdArgument_ShouldReturnThirdArgument() {
        Float maxNumber = printMax.printMaxFloat(26.1256f, 26.35268f, 26.374896f);
        Assert.assertEquals((Float) 26.374896f, maxNumber);
    }
}
