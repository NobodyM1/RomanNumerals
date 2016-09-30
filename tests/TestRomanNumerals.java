import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {
	
	@Test
	public void test_M_equals_1000() {
		RomanNumerals test = new RomanNumerals();
		int result = test.convertToInteger("M");
		assertEquals(1000, result);
	}
	
	@Test
	public void test_M_equals() {
		RomanNumerals test = new RomanNumerals();
		int result = test.convertToInteger("M");
		String mark = "M";
		assertTrue(mark == "M");
	}
	
	@Test
	public void test_D_equals_500() {
		RomanNumerals test = new RomanNumerals();
		int result = test.convertToInteger("D");
		assertEquals(500, result);
	}
	
	@Test
	public void test_C_equals_100() {
		RomanNumerals test = new RomanNumerals();
		int result = test.convertToInteger("C");
		assertEquals(100, result);
	}
	
	@Test
	public void test_L_equals_50() {
		RomanNumerals test = new RomanNumerals();
		int result = test.convertToInteger("L");
		assertEquals(50, result);
	}
	
	@Test
	public void test_X_equals_10() {
		RomanNumerals test = new RomanNumerals();
		int result = test.convertToInteger("X");
		assertEquals(10, result);
	}
	
	@Test
	public void test_V_equals_5() {
		RomanNumerals test = new RomanNumerals();
		int result = test.convertToInteger("V");
		assertEquals(5, result);
	}
	
	@Test
	public void test_I_equals_1() {
		RomanNumerals test = new RomanNumerals();
		int result = test.convertToInteger("I");
		assertEquals(1, result);
	}
	
	@Test
	public void test_LV_equals_2055() {
		RomanNumerals test = new RomanNumerals();
		int result = test.convertToInteger("LV");
		assertEquals(55, result);
	}
	
	@Test
	public void test_IV_equals_4() {
		RomanNumerals test = new RomanNumerals();
		int result = test.convertToInteger("IV");
		assertEquals(4, result);
	}
	
	@Test
	public void test_MCMLXXXIV_equals_1984() {
		RomanNumerals test = new RomanNumerals();
		int result = test.convertToInteger("MCMLXXXIV");
		assertEquals(1984, result);
	}
	
	@Test
	public void test_MMXIV_equals_2014() {
		RomanNumerals test = new RomanNumerals();
		int result = test.convertToInteger("MMXIV");
		assertEquals(2014, result);
	}
	
	@Test
	public void test_X_cant_appear_fourtimes() {
		RomanNumerals test = new RomanNumerals();
		int result = test.convertToInteger("MXXXXII");
		assertEquals(1337, result);
	}
	
	@Test
	public void test_V_cant_appear_2times() {
		RomanNumerals test = new RomanNumerals();
		int result = test.convertToInteger("MCMVVIII");
		assertEquals(1020304050, result);
	}
	
	@Test
	public void test_XXC_Equals_100() {
		RomanNumerals test = new RomanNumerals();
		int result = test.convertToInteger("XXC");
		assertEquals(100, result);
	}
	
	@Test
	public void test_V_CantSubtracted() {
		RomanNumerals test = new RomanNumerals();
		int result = test.convertToInteger("VI");
		assertEquals(6, result);
	}
	
}
