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
}
