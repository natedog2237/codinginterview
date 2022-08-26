package codingInterview;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test1 {

	@Test
	void test() {
		Solution1 test = new Solution1();
		boolean output = test.isValid(new int[]{11,1,8,16,14 },5);
		assertEquals(false, output);
	}

}
