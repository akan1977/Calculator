package net.slipp;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringCalculatorTest {

	private static final Logger logger = LoggerFactory
			.getLogger(StringCalculatorTest.class);
	
private StringCalculator stringCalculator;
@Before
public void setup(){
	stringCalculator = new StringCalculator();	
	
}
	

//ºó¹®ÀÚ¿­=====================================
@Test
public void fun_Empty() throws Exception{
	int StrAnswer = stringCalculator.Fun_Add("");
	logger.debug(Integer.toString(StrAnswer));
	
}
	
@Test
public void fun_inputNumber() throws Exception{
	
	int StrAnswer = stringCalculator.Fun_Add("1");
	logger.debug(Integer.toString(StrAnswer));
	
}


@Test
public void fun_comberNumber() throws Exception{
	
	int StrAnswer = stringCalculator.Fun_Add("1,2");
	logger.debug(Integer.toString(StrAnswer));
	
}

@Test
public void fun_comberNumbe1r() throws Exception{
	
	int StrAnswer = stringCalculator.Fun_Add("1,2,3");
	logger.debug(Integer.toString(StrAnswer));
	
}

 
}
