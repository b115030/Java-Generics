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
    //Test Case 1.1
    @Test
    public void whenMaxIntegerIsFirstArgument_ShouldReturnFirstArgument() {
        Integer maxNumber = printMax.printMaxInteger(86, 85, 45);
        Assert.assertEquals((Integer) 86, maxNumber);
    }
    //test case 1.2
    @Test
    public void whenMaxIntegerIsSecondArgument_ShouldReturnSecondArgument() {
        Integer maxNumber = printMax.printMaxInteger(25, 268, 15);
        Assert.assertEquals((Integer) 268, maxNumber);
    }
    //test case 1.3
    @Test
    public void whenMaxIntegerIsThirdArgument_ShouldReturnThirdArgument() {
        Integer maxNumber = printMax.printMaxInteger(25, 26, 150);
        Assert.assertEquals((Integer) 150, maxNumber);
    }
}
