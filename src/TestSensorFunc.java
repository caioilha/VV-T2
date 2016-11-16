
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
    public void testFunc1() {//testando setAlerta com o r == 0;
        assertEquals(true, teste.setH());
        teste.setR(0);
        assertEquals(false, teste.setAlerta()); 
    }
    
    @Test
    public void testFunc2() {//testando setAlerta com o r < 0;
        assertEquals(true, teste.setH());
        teste.setR(-1);
        assertEquals(true, teste.setAlerta()); 
    }
    
    public void testFunc3() {//testando setAlerta com o r > 1;
        assertEquals(true, teste.setH());
        teste.setR(2);
        assertEquals(true, teste.setAlerta()); 
    }
}
