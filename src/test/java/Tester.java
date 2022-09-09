import org.junit.Assert;
import org.junit.Test;

public class Tester {

    Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        Assert.assertEquals(50, calc.add(5, 45), 0);
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(5, calc.subtract(50, 45), 0);
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(50, calc.multiply(5, 10), 0);
    }

    @Test
    public void testDivide() {
        Assert.assertEquals(50, calc.divide(500, 10), 0);
    }

    @Test
    public void testExponent() {
        Assert.assertEquals(8, calc.exponent(2, 3), 0);
    }

}
