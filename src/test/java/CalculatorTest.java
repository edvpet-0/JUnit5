import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("2 + 1 = 3")
     void addTwoNumbers(){
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.add(2, 1), "2 + 1 should equal 3");
    }

    @Test
    @DisplayName("2 - 1 = 1")
    void subtractTwoNumbers(){
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(2, 1), "2 - 1 should equal 1");
    }

    @Test
    @DisplayName("Division Test")
    void divideTwoNumbers(){
        Calculator calculator = new Calculator();
        assertEquals(2,calculator.divide(4,2), " 4 / 2 = 2");

    }

    @Test
    @DisplayName("Multiplication test")
    void multiplyTwoNumbers(){
        Calculator calculator = new Calculator();
        assertEquals(20, calculator.subtract(2, 10), "2 * 10 = 21");
    }
}