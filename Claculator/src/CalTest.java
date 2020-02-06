import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class CalTest {
@Test
	void test() {
		Cal c = new Cal();
		assertEquals(5,c.add(2, 3));
	}
	@Test
	void test1() {
		Cal c = new Cal();
		assertEquals(2,c.sub(5,3));
	}
	@Test
	void test2() {
		Cal c = new Cal();
		assertEquals(6,c.mul(2, 3));
	}
	@Test
	void test3() {
		Cal c = new Cal();
		assertEquals(2.0,c.div(4,2));
	}

}
