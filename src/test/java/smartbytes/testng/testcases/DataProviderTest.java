package smartbytes.testng.testcases;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import smartbytes.testng.Calculator;

public class DataProviderTest {
	public static final Logger logger = LogManager.getLogger("Calculator");
	Calculator calculator = new Calculator();

	@Test(dataProvider="data_add",groups= {"add","all"})
	public void addTest(int[] dataSet) {
		int result = calculator.add(dataSet[0], dataSet[1]);
		assertEquals(result, dataSet[2]);

	}
	
	@Test(dataProvider="data_sub",groups= {"sub","all"})
	public void subtractTest(int[] dataSet) {
		int result = calculator.subtract(dataSet[0], dataSet[1]);
		assertEquals(result, dataSet[2]);
	}

	@DataProvider(name="data_add")
	public Object[][] data_add() {
		return new Object[][] { { 10, 5, 15 }, { -10, 5, -5 }, { 25, -5, 20 }, { 100, 50, 150 } ,
			{ 10, 5, 15 }, { -10, 5, -5 }, { 25, -5, 20 }, { 100, 50, 150 },
			{ 10, 5, 15 }, { -10, 5, -5 }, { 25, -5, 20 }, { 100, 50, 150 },
			{ 10, 5, 15 }, { -10, 5, -5 }, { 25, -5, 20 }, { 100, 50, 150 },
			{ 10, 5, 15 }, { -10, 5, -5 }, { 25, -5, 20 }, { 100, 50, 150 }};
	}
	@DataProvider(name="data_sub")
	public Object[][] data_sub() {
		return new Object[][] { { 10, 5, 5 }, { -10, 5, -15 }, { 25, -5, 30 }, { 100, 50, 50 } ,
			{ 10, 5, 5 }, { -10, 5, -15 }, { 25, -5, 30 }, { 100, 50, 50 },
			{ 10, 5, 5 }, { -10, 5, -15 }, { 25, -5, 30 }, { 100, 50, 50 },
			{ 10, 5, 5 }, { -10, 5, -15 }, { 25, -5, 30 }, { 100, 50, 50 },
			{ 10, 5, 5 }, { -10, 5, -15 }, { 25, -5, 30 }, { 100, 50, 50 }};
	}

}
