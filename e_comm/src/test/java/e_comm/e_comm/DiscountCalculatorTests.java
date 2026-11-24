package e_comm.e_comm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DiscountCalculatorTests{
	@Test
	public void testCalculateDiscountForRegular() 
	{
		int expected = 900;
		DiscountCalaculator calculator = new DiscountCalaculator();
		int actual = calculator.calculateDiscount(1000, "REGULAR", 10);
		assertEquals(expected, actual);
		
	}
	@Test
	public void testCalculateDiscountForRegular1() 
	{
		int expected = 800;
		DiscountCalaculator calculator = new DiscountCalaculator();
		int actual = calculator.calculateDiscount(1000, "GOLD", 10);
		assertEquals(expected, actual);
		
	}
	@Test
	public void testCalculateDiscountForRegular4() 
	{
		int expected = 850;
		DiscountCalaculator calculator = new DiscountCalaculator();
		int actual = calculator.calculateDiscount(1000, "PLATINUM", 10);
		assertEquals(expected, actual);
		
	}
	@Test
	public void testCalculateDiscountForRegular2() 
	{
		int expected = 1000;
		DiscountCalaculator calculator = new DiscountCalaculator();
		int actual = calculator.calculateDiscount(1000, "", 10);
		assertEquals(expected, actual);
		
	}
	
}