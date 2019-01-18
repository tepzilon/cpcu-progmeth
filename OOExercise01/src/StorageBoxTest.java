import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class StorageBoxTest {

	@Test
	void testIsEmpty() {
		StorageBox a = new StorageBox();
		assertTrue(a.isEmpty());

		a.push(new Object());
		assertFalse(a.isEmpty());

		a.push(new Object());
		assertFalse(a.isEmpty());

		a.pop();
		assertFalse(a.isEmpty());

		a.pop();
		assertTrue(a.isEmpty());

		a.pop();
		assertTrue(a.isEmpty());

	}

	@Test
	void testIsFull() {
		StorageBox a = new StorageBox(3);
		a.push("Techid");
		a.push("Very");
		assertFalse(a.isFull());
		a.push("Handsome");
		assertTrue(a.isFull());
	}

	@Test
	void testPush() {
		StorageBox a = new StorageBox();
		Object[] xs = new Object[7];
		for (int i = 0; i < xs.length; i++) {
			xs[i] = new Integer(i);
		}

		for (int i = 0; i < xs.length; i++) {
			a.push(xs[i]);
			assertEquals(xs[i], a.top());
		}

	}

	@Test
	void testPopAndTop() {
		StorageBox a = new StorageBox();
		for(int i=1; i<=5; i++) {
			a.push(i);
		}
		int test = 5;
		while(!a.isEmpty()) {
			assertEquals(test, a.top());
			assertEquals(test, a.pop());
			--test;
			
		}
	}

}
