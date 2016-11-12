
import org.junit.Assert.*;

import static org.junit.Assert.*;

import org.junit.Before;
//import org.junit.Rule;
import org.junit.Test;
//import org.junit.rules.ExpectedException;

public class TestSensor_Eduardo {

    private Sensor teste;

    //rule � utilizado para testar exce��es (n�o ocorrem em Sensor)
    //@Rule
    //public ExpectedException thrown = ExpectedException.none();
    @Before
    public void setUp() {
        Controle c = new Controle();
        teste = c.getSensor();
    }

    //teste 11
    @Test
    public void testSequence11() {
        assertEquals(true, teste.setH());
        assertEquals(false, teste.setH());
        assertEquals(true, teste.resetH());
    }

    //teste 12
    @Test
    public void testSequence12() {
        assertEquals(true, teste.setH());
        assertEquals(false, teste.setH());
        assertEquals(true, teste.setAlerta());
    }

    //teste 13
    @Test
    public void testSequence13() {
        assertEquals(true, teste.setH());
        assertEquals(false, teste.resetAlerta());
        assertEquals(true, teste.resetH());
    }

    //teste 14
    @Test
    public void testSequence14() {
        assertEquals(true, teste.setH());
        assertEquals(false, teste.resetAlerta());
        assertEquals(true, teste.setAlerta());
    }

    //teste 15
    @Test
    public void testSequence15() {
        assertEquals(true, teste.setH());
        assertEquals(false, teste.getAlerta());
        assertEquals(true, teste.resetH());
    }

    //teste 16
    @Test
    public void testSequence16() {
        assertEquals(true, teste.setH());
        assertEquals(false, teste.getAlerta());
        assertEquals(true, teste.setAlerta());
    }

    //teste 17
    @Test
    public void testSequence17() {
        assertEquals(true, teste.setH());
        assertEquals(true, teste.resetH());
        assertEquals(false, teste.resetH());
    }

    //teste 18
    @Test
    public void testSequence18() {
        assertEquals(true, teste.setH());
        assertEquals(true, teste.setAlerta());
        assertEquals(true, teste.resetAlerta());
        assertEquals(true, teste.resetH());
    }

    //teste 19
    @Test
    public void testSequence19() {
        assertEquals(true, teste.setH());
        assertEquals(true, teste.setAlerta());
        assertEquals(true, teste.resetAlerta());
        assertEquals(true, teste.setAlerta());
    }

    //teste 20
    @Test
    public void testSequence20() {
        assertEquals(true, teste.setH());
        assertEquals(true, teste.setAlerta());
        assertEquals(true, teste.getH());
        assertEquals(true, teste.resetH());
    }
}
