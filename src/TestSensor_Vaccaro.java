import org.junit.Assert.*;

import static org.junit.Assert.*;

import org.junit.Before;
//import org.junit.Rule;
import org.junit.Test;
//import org.junit.rules.ExpectedException;


public class TestSensor_Vaccaro {
	private Sensor teste;
	private Controle controle;
	
	//rule é utilizado para testar exceções (não ocorrem em Sensor)
	//@Rule
    //public ExpectedException thrown = ExpectedException.none();
	
	@Before
	public void setUp(){
		controle = new Controle();
		teste = controle.getSensor();
	}	
	
	//teste 21
	@Test
	public void testSequence21(){ 
		boolean resultSetH = teste.setH();
		boolean resultSetAlerta = teste.setAlerta();
		boolean resultGetH = teste.getH();
		boolean resultSetAlerta2 = teste.setAlerta();
		
		assertEquals(true, resultSetH);
		assertEquals(true, resultSetAlerta);
		assertEquals(true, resultGetH);		
		assertEquals(false, resultSetAlerta2);
	}
	
	//teste 22
	@Test
	public void testSequence22(){
		boolean resultSetH = teste.setH();
		boolean resultSetAlerta = teste.setAlerta();
		boolean resultGetAlerta = teste.getAlerta();
		boolean resultResetH = teste.resetH();
		
		assertEquals(true, resultSetH);
		assertEquals(true, resultSetAlerta);
		assertEquals(true, resultGetAlerta);
		assertEquals(true, resultResetH);
	}
	
	//teste 23
	@Test
	public void testSequence23(){
		boolean resultSetH = teste.setH();
		boolean resultSetAlerta = teste.setAlerta();
		boolean resultGetAlerta = teste.getAlerta();
		boolean resultSetAlerta2 = teste.setAlerta();
		
		assertEquals(true, resultSetH);
		assertEquals(true, resultSetAlerta);
		assertEquals(true, resultGetAlerta);
		assertEquals(false, resultSetAlerta2);
	}
	
	//teste 24
	@Test
	public void testSequence24() throws Exception{
		boolean resultSetH = teste.setH();
		boolean resultSetAlerta = teste.setAlerta();
		teste.setR(1);
		boolean resultResetH = teste.resetH();
		
		assertEquals(true, resultSetH);
		assertEquals(true, resultSetAlerta);
		assertEquals(true, resultResetH);
	}	
	
	//teste 25
	@Test
	public void testSequence25() throws Exception{
		boolean resultSetH = teste.setH();
		boolean resultSetAlerta = teste.setAlerta();
		teste.setR(1);
		boolean resultSetAlerta2 = teste.setAlerta();
		
		assertEquals(true, resultSetH);
		assertEquals(true, resultSetAlerta);
		assertEquals(false, resultSetAlerta2);
	}
	
	//teste 26
	@Test
	public void testSequence26(){
		boolean resultSetH = teste.setH();
		boolean resultSetAlerta = teste.setAlerta();
		boolean resultSetH2 = teste.setH();
		boolean resultResetH = teste.resetH();
		
		assertEquals(true, resultSetH);
		assertEquals(true, resultSetAlerta);
		assertEquals(false, resultSetH2);
		assertEquals(true, resultResetH);
	}
	
	//teste 27
	@Test
	public void testSequence27(){
		boolean resultSetH = teste.setH();
		boolean resultSetAlerta = teste.setAlerta();
		boolean resultSetH2 = teste.setH();
		boolean resultSetAlerta2 = teste.setAlerta();
		
		assertEquals(true, resultSetH);
		assertEquals(true, resultSetAlerta);
		assertEquals(false, resultSetH2);
		assertEquals(false, resultSetAlerta2);
	}
	
	//teste 28
	@Test
	public void testSequence28(){
		boolean resultSetH = teste.setH();
		boolean resultSetAlerta = teste.setAlerta();
		boolean resultResetH = teste.resetH();
		boolean resultResetH2 = teste.resetH();
		
		assertEquals(true, resultSetH);
		assertEquals(true, resultSetAlerta);
		assertEquals(true, resultResetH);
		assertEquals(false, resultResetH2);
	}
	
	//teste 29
	@Test
	public void testSequence29(){
		boolean resultSetH = teste.setH();
		boolean resultSetAlerta = teste.setAlerta();
		boolean resultSetAlerta2 = teste.setAlerta();
		boolean resultResetH = teste.resetH();
		
		assertEquals(true, resultSetH);
		assertEquals(true, resultSetAlerta);
		assertEquals(false, resultSetAlerta2);
		assertEquals(true, resultResetH);
	}
	
	//teste 30
	@Test
	public void testSequence30(){
		boolean resultSetH = teste.setH();
		boolean resultSetAlerta = teste.setAlerta();
		boolean resultSetAlerta2 = teste.setAlerta();
		boolean resultSetAlerta3 = teste.setAlerta();
		
		assertEquals(true, resultSetH);
		assertEquals(true, resultSetAlerta);
		assertEquals(false, resultSetAlerta2);
		assertEquals(false, resultSetAlerta3);
	}
}
	

