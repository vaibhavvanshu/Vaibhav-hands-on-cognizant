import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        System.out.println("Setting up Calculator...");
        calculator = new Calculator();
    }

    @Test
    public void testAddition1() {
        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(30, result);
    }

    @Test
    public void testAddition2() {

        // Arrange
        int a = 40;
        int b = 60;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(100, result);
    }

    @After
    public void tearDown() {
        System.out.println("Cleaning up...");
        calculator = null;
    }
}