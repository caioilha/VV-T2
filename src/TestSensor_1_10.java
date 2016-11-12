
import org.junit.Assert.*;

import static org.junit.Assert.*;

import org.junit.Before;
//import org.junit.Rule;
import org.junit.Test;
//import org.junit.rules.ExpectedException;

public class TestSensor_1_10 {

    private Sensor teste;

    @Before
    public void setUp() {
        Controle c = new Controle();
        teste = c.getSensor();
    }

    //Test Sequence 1 :	[setR(float r), resetH()]
   
    @Test
    public void testSequence11() {
        teste.setR(0); //hmmmmmmm
        assertEquals(false, teste.resetH());
    }

    // Test Sequence 2 :	[resetH(), resetH()]
	
    @Test
    public void testSequence12() {
        assertEquals(false, teste.resetH());
        assertEquals(false, teste.resetH());
    }

    //Test Sequence 3 :	[getH(), resetH()]
	
    @Test
    public void testSequence13() {
    	assertEquals(false, teste.getH());
    	assertEquals(false, teste.resetH());
    }

    //Test Sequence 4 :	[resetAlerta(), resetH()]

    @Test
    public void testSequence14() {
    	assertEquals(false, teste.resetAlerta());
    	assertEquals(false, teste.resetH());
    }

    //	Test Sequence 5 :	[getAlerta(), resetH()]
	
    @Test
    public void testSequence15() {
        assertEquals(false, teste.getAlerta());
        assertEquals(false, teste.resetH());
    }

    //Test Sequence 6 :	[setAlerta(), resetH()]
	
    @Test
    public void testSequence16() {
    	assertEquals(false, teste.setAlerta());
    	assertEquals(false, teste.resetH());
    }

    //Test Sequence 7 :	[setH(), getH(), resetH()]
	
    @Test
    public void testSequence17() {
    	assertEquals(true, teste.setH());
    	assertEquals(true, teste.getH());
    	assertEquals(true, teste.resetH());
    }

    //Test Sequence 8 :	[setH(), getH(), setAlerta()]
	
    @Test
    public void testSequence18() {
        assertEquals(true, teste.setH());
        assertEquals(true, teste.getH());
        assertEquals(true, teste.setAlerta());

    }

    //Test Sequence 9 :	[setH(), setR(float r), resetH()]
    @Test
    public void testSequence19() {
        assertEquals(true, teste.setH());
        teste.setR(1);
        assertEquals(true, teste.resetH());
    }
    
    

    //Test Sequence 10 :	[setH(), setR(float r), setAlerta()]
    @Test
    public void testSequence20() {
    	 assertEquals(true, teste.setH());
         teste.setR(1);
         assertEquals(true, teste.setAlerta()); 
    }
    
    @Test
    public void testSequence20_2() {//testando setAlerta com o r == 0;
        assertEquals(true, teste.setH());
        teste.setR(0);
        assertEquals(false, teste.setAlerta()); 
    }
}