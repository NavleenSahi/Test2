import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FareTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	//R1: A one way trip inside Zone 1
	@Test
	void test1() {
		
		String[] from1 = new String[] {"Leslie"};
		String[] to1 = new String[] {"Don Mills"};
		
		Double fare = f.calculateTotal(from1,to1);
		assertEquals(2.5,fare,0.0);
		
	}
	
	
}
