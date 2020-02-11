import com.sun.org.apache.xpath.internal.operations.Equals;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void can_add(){
        assertEquals(7, calculator.add(1,6).intValue());
    }

    @Test
    public void can_subtract(){
        assertEquals(4, calculator.subtract(9, 5).intValue());
    }

    @Test
    public void can_multiply(){
        assertEquals(12, calculator.multiply(2, 6).intValue());
    }

    @Test
    public void can_divide(){
        assertEquals(3.5, calculator.divide(7.0, 2.0).doubleValue(), 0.01);
    }
}
