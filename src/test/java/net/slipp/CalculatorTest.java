package net.slipp;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculatorTest {
	private static final Logger logger = LoggerFactory
			.getLogger(CalculatorTest.class);
	private Calculator calculator;

	@Before
	public void setup(){
		calculator = new Calculator();	
		
	}
	@Test
	public void add() {

		int result =calculator.add(1,2);
	//	Assert.assertThat(1, result);
	 
		Assert.assertEquals(3, result);
	}
	
	@Test
	public void subtract() throws Exception{
		int result =calculator.subtract(2,1);
		Assert.assertEquals(1, result);
	}
	
	@Test
	public void multiply(){
		assertThat( calculator.multiply(2, 3),is(6));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	@After
	public void teardown(){
		
		
	}
	

}
