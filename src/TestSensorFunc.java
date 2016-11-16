
import org.junit.Assert.*;

import static org.junit.Assert.*;

import org.junit.Before;
//import org.junit.Rule;
import org.junit.Test;
//import org.junit.rules.ExpectedException;

public class TestSensorFunc {

    private Sensor teste;

    @Before
    public void setUp() {
        Controle c = new Controle();
        teste = c.getSensor();
    }


    
    @Test
    public void testFunc1() {//testando setAlerta com o r < 0;
        teste.setH();
        try {
		teste.setR(-1);
		assertEquals(0,1);
	} catch (Exception e) {
		assertEquals(1,1);	
	}
    }
    
    @Test
    public void testFunc2() {//testando setAlerta com o r > 1;
    	teste.setH();
	try {
		teste.setR(2);
		assertEquals(0,1);
	} catch (Exception e) {
		assertEquals(1,1);	
	}
    }
    
    @Test
    public void testFunc3() throws Exception{
    	teste.setH();
    	teste.setR(0);
    	assertEquals(false, teste.setAlerta());
    }
}
