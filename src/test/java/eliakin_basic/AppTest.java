package eliakin_basic;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void test() {
		App test = new App();
		
		// Test Greeting method		
		String greeting_test = test.Greeting();
		assertEquals("Hello Eliakin", greeting_test);
		
		// Test Age integer param
		int  age = test.Age(22);
		assertEquals(22, age);
				
		//		fail("Not yet implemented");
	}
	
	

}
