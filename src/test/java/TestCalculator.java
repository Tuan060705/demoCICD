import org.example.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculator {

    @Test
    public void testSum(){
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.sum(2,3), 5);
    }

    @Test
    public void testSub(){
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.sub(2,2), 0);
    }
}
