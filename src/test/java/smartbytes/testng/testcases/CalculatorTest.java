package smartbytes.testng.testcases;

import static org.testng.Assert.assertEquals;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import smartbytes.testng.Calculator;

public class CalculatorTest {
  public static final Logger logger =  LogManager.getLogger("Calculator");
  Calculator calculator = new Calculator();
  
  @Test(groups= {"add","all"})
  public void addTest() {
   int result =  calculator.add(10, 5);
   assertEquals(result, 15);
   logger.info("addTest");
  }

  @Test(groups= {"all"})
  public void multiplyTest() {
	   int result =  calculator.multiply(10, 5);
	   assertEquals(result, 50);
	   logger.info("multiplyTest");
  }

  @Test(groups= {"sub","all"})
  public void subtractTest() {
	   int result =  calculator.subtract(10, 5);
	   assertEquals(result, 5);
	   logger.info("subtractTest");
  }
}
