package br.com.lsilveira.math;

import static org.junit.jupiter.api.Assertions. *;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("Test Math Operations in SimpleMath Class")
class SimpleMathTest {
	
	// test[System Under Test]_[Condition or State Change]_[Expected Result]

    @Test
    @DisplayName(" Test 6.2 + 2 = 8.2")
    void testSum_When_SixDotTwoIsAddedByTwo_ShouldReturnEightDotwo() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double actual = math.sum(firstNumber, secondNumber);
        double expected = 8.2D;
        
        assertEquals(expected, actual,
        	() ->	firstNumber + "+"+ secondNumber +
        		" did not produce "+ expected+"!");
        assertNotEquals(9.2, actual);
        assertNotNull(actual);
        
        
    }
    
    @Test
    @DisplayName(" Test 6.2 - 2 = 4.2")
    void testSubtraction() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double actual = math.subtraction(firstNumber, secondNumber);
        double expected = 4.2D;
        
        assertEquals(expected, actual,
        	() ->	firstNumber + "-"+ secondNumber +
        		" did not produce "+ expected+"!");
        //assertNotEquals(9.2, actual);
        //assertNotNull(actual);
    
}
    @Test
    @DisplayName(" Test 2 * 2 = 4")
    void testMultiplication() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 2D;
		double secondNumber = 2D;
		Double actual = math.multiplication(firstNumber, secondNumber);
        double expected = 4D;
        
        assertEquals(expected, actual,
        	() ->	firstNumber + "*"+ secondNumber +
        		" did not produce "+ expected+"!");
        //assertNotEquals(9.2, actual);
        //assertNotNull(actual);
}
    @Test
    @DisplayName(" Test 10 / 2 = 5")
    void testDivision() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 10D;
		double secondNumber = 2D;
		Double actual = math.division(firstNumber, secondNumber);
        double expected = 5D;
        
        assertEquals(expected, actual,
        	() ->	firstNumber + "/"+ secondNumber +
        		" did not produce "+ expected+"!");
        //assertNotEquals(9.2, actual);
        //assertNotNull(actual);
}
    
    
    	// test[System Under Test]_[Condition or State Change]_[Expected Result]
    	@Test
    	@DisplayName(" Test Division By Zero")
        void testDivision_When_FirstNumberDividedByZero_ShouldThrowArithmecExpected() {
    		fail();
    	}
    
    
    @Test
    @DisplayName(" Test (6.2 + 2) / 2 = 4.1")
    void testMean() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double actual = math.mean(firstNumber, secondNumber);
        double expected = 4.1D;
        
        assertEquals(expected, actual,
        	() -> "(" +	firstNumber + "+"+ secondNumber + ")/2" +
        		" did not produce "+ expected+"!");
        //assertNotEquals(9.2, actual);
        //assertNotNull(actual);
    }
    @Test
    @DisplayName(" Square Root of 81 = 9")
    void testSquareRoot() {
        SimpleMath math = new SimpleMath();
        double number = 81D;
        double expected = 9D;
        
		Double actual = math.squareRoot(number);
       
        
        assertEquals(expected, actual,
        	() ->	"Square Root of" + number + 
        	"did not produce" + expected + "!");
        //assertNotEquals(9.2, actual);
        //assertNotNull(actual);
}
}