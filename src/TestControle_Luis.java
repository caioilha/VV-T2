import org.junit.Assert.*;

import static org.junit.Assert.*;

import org.junit.Before;
//import org.junit.Rule;
import org.junit.Test;
//import org.junit.rules.ExpectedException;

public class TestControle_Luis {
	private Controle c;


	@Before
	public void setUp() {
		c = new Controle();
	}

	// teste 11 Test Sequence 11 (34) : [setH(2), fecha(1), resetH(2)]
	@Test
	public void testSequence11() {
		assertEquals(true, c.setH(1));
		try {
			c.fecha(0); 
			assertEquals(1, 0);
		} catch (Exception e) {
			assertEquals(1, 1);
		}
		try {
		assertEquals(true, c.resetH(1));
		} catch (Exception e){
			assertEquals(1,0);//n eh pra dar erro
		}

	}

	// teste 12 Test Sequence 12 (137) : [setH(2), setH(1), open(1), resetH(2),
	// setH(1)]
	@Test
	public void testSequence12() {
		assertEquals(true, c.setH(1));
		assertEquals(true, c.setH(0));
		try {
			c.open(0);
			assertEquals(1, 1);
		} catch (Exception e) {
			assertEquals(1, 0);
		}
		try {
			c.resetH(1);
			assertEquals(1, 0);
		} catch (Exception e) {
			assertEquals(1, 1);
		}
		assertEquals(false, c.setH(0));
	}

	// teste 13 Test Sequence 13 (138) : [setH(2), setH(1), open(1), resetH(2),
	// open(2)]
	@Test
	public void testSequence13() {
		assertEquals(true, c.setH(1));
		assertEquals(true, c.setH(0));
		try {
			c.open(0);
			assertEquals(1, 1);
		} catch (Exception e) {
			assertEquals(1, 0);
		}
		try {
			c.resetH(1);
			assertEquals(1, 0);
		} catch (Exception e) {
			assertEquals(1, 1);
		}
		try {
			c.open(1);
			assertEquals(1, 1);
		} catch (Exception e) {
			assertEquals(1, 0);
		}
	}

	// teste 14 Test Sequence 14 (139) : [setH(2), setH(1), open(1), resetH(2),
	// open(1)]
	@Test
	public void testSequence14() {
		assertEquals(true, c.setH(1));
		assertEquals(true, c.setH(0));
		try {
			c.open(0);
			assertEquals(1, 1);
		} catch (Exception e) {
			assertEquals(1, 0);
		}
		try {
			c.resetH(1);
			assertEquals(1, 0);
		} catch (Exception e) {
			assertEquals(1, 1);
		}
		try {
			c.open(0);
			assertEquals(1, 0);
		} catch (Exception e) {
			assertEquals(1, 1);
		}
	}

	// teste 15 Test Sequence 15 (183) : [setH(2), setH(1), open(2), fecha(2),
	// setH(1)]
	@Test
	public void testSequence15() {
		assertEquals(true, c.setH(1));
		assertEquals(true, c.setH(0));
		try {
			c.open(1);
			assertEquals(1, 1);
		} catch (Exception e) {
			assertEquals(1, 0);
		}
		try {
			c.fecha(1);
			assertEquals(1, 1);
		} catch (Exception e) {
			assertEquals(1, 0);
		}
		assertEquals(false, c.setH(0));
	}

	// teste 16 Test Sequence 16 (184) : [setH(2), setH(1), open(2), fecha(2),
	// resetH(2)]
	@Test
	public void testSequence16() {
		assertEquals(true, c.setH(1));
		assertEquals(true, c.setH(0));
		try {
			c.open(1);
			assertEquals(1, 1);
		} catch (Exception e) {
			assertEquals(1, 0);
		}
		try {
			c.fecha(1);
			assertEquals(1, 1);
		} catch (Exception e) {
			assertEquals(1, 0);
		}
		try {
		assertEquals(true, c.resetH(1));
		} catch (Exception e){
			assertEquals(1,0);//n eh pra dar erro
		}
	}

	// teste 17 Test Sequence 17 (185) : [setH(2), setH(1), open(2), fecha(2),
	// open(2)]
	@Test
	public void testSequence17() {
		assertEquals(true, c.setH(1));
		assertEquals(true, c.setH(0));
		try {
			c.open(1);
			assertEquals(1, 1);
		} catch (Exception e) {
			assertEquals(1, 0);
		}
		try {
			c.fecha(1);
			assertEquals(1, 1);
		} catch (Exception e) {
			assertEquals(1, 0);
		}
		try {
			c.open(1);
			assertEquals(1, 1);
		} catch (Exception e) {
			assertEquals(1, 0);
		}
	}

	// teste 18 Test Sequence 18 (186) : [setH(2), setH(1), open(2), fecha(1),
	// open(1)]
	@Test
	public void testSequence18() {
		assertEquals(true, c.setH(1));
		assertEquals(true, c.setH(0));
		try {
			c.open(1);
			assertEquals(1, 1);
		} catch (Exception e) {
			assertEquals(1, 0);
		}
		try {
			c.fecha(0);
			assertEquals(1, 0);
		} catch (Exception e) {
			assertEquals(1, 1);
		}
		try {
			c.open(0);
			assertEquals(1, 1);
		} catch (Exception e) {
			assertEquals(1, 0);
		}
	}

	// teste 19 Test Sequence 19 (95) : [setH(2), setH(1), getV(1), open(2)]
	@Test
	public void testSequence19() {
		assertEquals(true, c.setH(1));
		assertEquals(true, c.setH(0));
		assertEquals(false, c.getV(0));
		try {
			c.open(1);
			assertEquals(1, 1);
		} catch (Exception e) {
			assertEquals(1, 0);
		}
	}

	// teste 20 Test Sequence 20 (96) : [setH(2), setH(1), getV(2), open(1)]
	@Test
	public void testSequence20() {
		assertEquals(true, c.setH(1));
		assertEquals(true, c.setH(0));
		assertEquals(false, c.getV(1));
		try {
			c.open(0);
			assertEquals(1, 1);
		} catch (Exception e) {
			assertEquals(1, 0);
		}
	}
}
