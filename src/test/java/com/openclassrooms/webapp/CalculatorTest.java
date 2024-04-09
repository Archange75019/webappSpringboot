package com.openclassrooms.webapp;

import com.openclassrooms.webapp.controller.MyCalculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void testAddTwoPositiveNumbers() {
        // Arrange
        int a = 2;
        int b = 3;
        MyCalculator calculator = new MyCalculator();

        // Act
        int somme = calculator.add(a,b);

        // Assert
        assertEquals(5, somme);
    }
}
