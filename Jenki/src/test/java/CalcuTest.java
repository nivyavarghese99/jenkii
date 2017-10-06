import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class CalcuTest {
	int x,y;
	Calcu obj;
	
	

	@Before
	public void setUp() throws Exception {

		x=8;
		y=4;		
		obj= new Calcu();
	}

	@After
	public void tearDown() throws Exception {
		x=0;
		y=0;		
		obj=null;
	}

	@Test
	public void testSubstract() {
		assertEquals(4,obj.substract(x, y));
	}

	@Test
	public void testMultiply() {
		assertEquals(32,obj.multiply(x, y));
	}

	@Test
	public void testAddition() {
		assertEquals(12,obj.addition(x, y));
	}

}
