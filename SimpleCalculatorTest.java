import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculatorTest {

    @Test
    public void testAdd() {
        SimpleCalculator calculator = new SimpleCalculator();
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }
}
