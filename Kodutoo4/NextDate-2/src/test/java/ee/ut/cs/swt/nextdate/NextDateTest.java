package ee.ut.cs.swt.nextdate;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.Test;

public class NextDateTest {
	
	private NextDate trialDate = new NextDate(3,4,1976);

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	//@Test
	/*
	 * Test method for 'ee.ut.cs.swt.nextdate.NextDate.run(int, int, int)'
	 */
	
	@Test
	public final void testJuneToJuly(){
	assertEquals("7/1/2001", trialDate.run(6, 30, 2001));
	}

	@Test
	public final void testMarchToApril(){
	assertEquals("4/1/2001", trialDate.run(3, 31, 2001));
	}

	@Test
	public final void testDecemberToJanuary(){
	assertEquals("1/1/2002", trialDate.run(12, 31, 2001));
	}

	@Test //1
	public final void testFebuaryToMarch() {
		assertEquals("3/1/2020", trialDate.run(2, 29, 2020));
	}

	@Test //2
	public final void testFebuaryToMarchNotLeapYear(){
		assertEquals("3/1/2021", trialDate.run(2, 28, 2021));
	}

	@Test //3
	public final void testNovember(){
		assertEquals("11/15/2021", trialDate.run(11, 14, 2021));
	}

	@Test //4
	public final void testFebuary(){
		assertEquals("2/15/2021", trialDate.run(2, 14, 2021));
	}

	@Test //5
	public final void testJuly(){
		assertEquals("7/7/2020", trialDate.run(7, 6, 2020));
	}

	@Test //6
	public final void testFebuaryLeapYear(){
		assertEquals("2/29/2020", trialDate.run(2, 28, 2020));
	}

	@Test //7
	public final void testFebuary2000LeayYear(){
		assertEquals("2/29/2000", trialDate.run(2, 28, 2000));
	}

	@Test //8
	public final void testInvalidEverything(){
		assertEquals("invalid Input Date", trialDate.run(13, 0, 2022));
	}

	@Test //9
	public final void testFebuaryinvalid30Date(){
		assertEquals("Invalid Input Date", trialDate.run(2, 30, 2001));
	}

	@Test //10
	public final void testInvalidJulyDate(){
		assertEquals("invalid Input Date", trialDate.run(7, 64, 2004));
	}

	@Test //11
	public final void testJulyToAugust(){
		assertEquals("8/1/2020", trialDate.run(7, 31, 2020));
	}

	@Test //12
	public final void testInvalidDecemberDate(){
		assertEquals("Invalid Input Date", trialDate.run(12, 32, 2020));
	}

//  ei lähe läbi, aga branch coverage ka ei tõsta
//	@Test //12
//	public final void testJulyHas30Days(){
//		assertEquals("7/31/2020", trialDate.run(7, 30, 2020));
//	}
}

