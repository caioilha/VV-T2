import org.junit.Assert.*;

import static org.junit.Assert.*;

import org.junit.Before;
//import org.junit.Rule;
import org.junit.Test;
//import org.junit.rules.ExpectedException;

public class TestControleFunc {
	private Controle c;

	@Before
	public void setUp() {
		c = new Controle();
	}
	
	@Test
	public void setH1(){
		try{
			c.setH(-1);
			assertEquals(0,1);
		} catch (ArrayIndexOutOfBoundsException e){
			assertEquals(1,1);
		}
	}
	
	@Test
	public void setH2(){
		try{
			c.setH(2);
			assertEquals(0,1);
		} catch (ArrayIndexOutOfBoundsException e){
			assertEquals(1,1);
		}
	}
	
	@Test
	public void resetH1(){
		try{
			c.resetH(-1);
			assertEquals(0,1);
		} catch (ArrayIndexOutOfBoundsException e){
			assertEquals(1,1);
		} catch(Exception e){
			assertEquals(0,1);
		}
	}
	
	@Test
	public void resetH2(){
		try{
			c.resetH(2);
			assertEquals(0,1);
		} catch (ArrayIndexOutOfBoundsException e){
			assertEquals(1,1);
		} catch(Exception e){
			assertEquals(0,1);
		}
	}
	
	@Test
	public void open1(){
		c.setH(0);
		c.setH(1);
		try{
			c.open(-1);
			assertEquals(0,1);
		} catch (ArrayIndexOutOfBoundsException e){
			assertEquals(1,1);
		} catch(Exception e){
			assertEquals(0,1);
		}
	}
	
	@Test
	public void open2(){
		c.setH(0);
		c.setH(1);
		try{
			c.open(2);
			assertEquals(0,1);
		} catch (ArrayIndexOutOfBoundsException e){
			assertEquals(1,1);
		} catch(Exception e){
			assertEquals(0,1);
		}
	}
	
	@Test
	public void fecha1(){
		try{
			c.fecha(-1);
			assertEquals(0,1);
		} catch (ArrayIndexOutOfBoundsException e){
			assertEquals(1,1);
		} catch(Exception e){
			assertEquals(0,1);
		}
	}
	
	public void fecha2(){
		try{
			c.fecha(2);
			assertEquals(0,1);
		} catch (ArrayIndexOutOfBoundsException e){
			assertEquals(1,1);
		} catch(Exception e){
			assertEquals(0,1);
		}
	}
	
	public void getV1(){
		try{
			c.getV(-1);
			assertEquals(0,1);
		} catch (ArrayIndexOutOfBoundsException e){
			assertEquals(1,1);
		}
	}
	public void getV2(){
		try{
			c.getV(2);
			assertEquals(0,1);
		} catch (ArrayIndexOutOfBoundsException e){
			assertEquals(1,1);
		}
	}
}
