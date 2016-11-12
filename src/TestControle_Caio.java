import org.junit.Assert.*;

import static org.junit.Assert.*;

import org.junit.Before;
//import org.junit.Rule;
import org.junit.Test;
//import org.junit.rules.ExpectedException;

public class TestControle_Caio {
	private Controle c;


	@Before
	public void setUp() {
		c = new Controle();

	}

	// teste 1 Test Sequence 1 (25) : [setH(2), open(1), resetH(2)]
	@Test
	public void testSequence1() {
		assertEquals(true, c.setH(1));
		try {
			c.open(1); 
			assertEquals(1, 0);
		} catch (Exception e) {
			assertEquals(1, 1);
		}
		assertEquals(false, c.resetH(1));

	}

	// teste 2 Test Sequence 2 (60) : [setH(1), open(2), open(1)]
	@Test
	public void testSequence2() {
		assertEquals(true, c.setH(0));
		try {
			c.open(2);
			assertEquals(1, 0);
		} catch (Exception e) {
			assertEquals(1, 1);
		}
		try {
			c.open(1);
			assertEquals(1, 0);
		} catch (Exception e) {
			assertEquals(1, 1);
		}

	}

	// teste 3 Test Sequence 3 (45) : [setH(1), open(1), open(1)]
	@Test
	public void testSequence3() {
		assertEquals(true, c.setH(0));
		try {
			c.open(1);
			assertEquals(1, 0);
		} catch (Exception e) {
			assertEquals(1, 1);
		}
		try {
			c.open(1);
			assertEquals(1, 0);
		} catch (Exception e) {
			assertEquals(1, 1);
		}
	}

	// teste 4 Test Sequence 4 (208) : [setH(2), setH(1), open(2), resetH(2),
	// open(1)]
	@Test
	public void testSequence4() {
		assertEquals(true, c.setH(1));
		assertEquals(true, c.setH(0));
		try {
			c.open(2);
			assertEquals(1, 1);
		} catch (Exception e) {
			assertEquals(1, 0);
		}
		assertEquals(true, c.resetH(1));
		try {
			c.open(1);
			assertEquals(1, 0);
		} catch (Exception e) {
			assertEquals(1, 1);
		}
	}

	// teste 5 Test Sequence 5 (209) : [setH(2), setH(1), open(2), resetH(2),
	// setH(1)]
	@Test
	public void testSequence5() {
		assertEquals(true, c.setH(1));
		assertEquals(true, c.setH(0));
		try {
			c.open(2);
			assertEquals(1, 1);
		} catch (Exception e) {
			assertEquals(1, 0);
		}
		assertEquals(true, c.resetH(1));
		assertEquals(false, c.setH(0));
	}

	// teste 6 Test Sequence 6 (193) : [setH(2), setH(1), open(2), resetH(1),
	// open(1)]
	@Test
	public void testSequence6() {
		assertEquals(true, c.setH(1));
		assertEquals(true, c.setH(0));
		try {
			c.open(2);
			assertEquals(1, 1);
		} catch (Exception e) {
			assertEquals(1, 0);
		}
		assertEquals(true, c.resetH(0));
		try {
			c.open(1);
			assertEquals(0, 1);
		} catch (Exception e) {
			assertEquals(1, 1);
		}
	}

	// teste 7 Test Sequence 7 (194) : [setH(2), setH(1), open(2), resetH(1),
	// setH(1)]
	@Test
	public void testSequence7() {
		assertEquals(true, c.setH(1));
		assertEquals(true, c.setH(0));
		try {
			c.open(2);
			assertEquals(1, 1);
		} catch (Exception e) {
			assertEquals(1, 0);
		}
		assertEquals(true, c.resetH(0));
		assertEquals(true, c.setH(0));
	}

	// teste 8 Test Sequence 8 (195) : [setH(2), setH(1), open(2), resetH(1),
	// open(2)]

	@Test
	public void testSequence8() {
		assertEquals(true, c.setH(1));
		assertEquals(true, c.setH(0));
		try {
			c.open(2);
			assertEquals(1, 1);
		} catch (Exception e) {
			assertEquals(1, 0);
		}
		assertEquals(true, c.resetH(0));
		try {
			c.open(2);
			assertEquals(1, 0);
		} catch (Exception e) {
			assertEquals(1, 1);
		}
	}

	// teste 9 Test Sequence 9 (32) : [setH(2), resetH(1), resetH(2)]
	@Test
	public void testSequence9() {
		assertEquals(true, c.setH(1));
		assertEquals(false, c.resetH(0));
		assertEquals(true, c.resetH(1));
	}

	// teste 10 Test Sequence 10 (33) : [setH(2), resetH(1), setH(1)]

	@Test
	public void testSequence10() {
		assertEquals(true, c.setH(1));
		assertEquals(false, c.resetH(0));
		assertEquals(true, c.setH(0));
	}
}
