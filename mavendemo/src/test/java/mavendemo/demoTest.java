package mavendemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class demoTest {

	@Test
	public void test() {
		
		Demo demotest = new Demo();
		assertEquals(null, "data", demotest.data());
		
//		fail("Not yet implemented");
	}

}
