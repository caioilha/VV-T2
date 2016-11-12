
public class Controle{
	
	Sensor sensores []; //1-temp 2- pressao
	boolean valvulas []; //valvula fica no sensor ou controlador?
						//pela descri��o � no sensor mas pelos metodos parece da controle
	
	public Controle(){
		Sensor s1 = new Sensor(this, 1);
		Sensor s2 = new Sensor(this, 2);
		sensores = new Sensor[2];
		sensores[0] = s1;
		sensores[1] = s2;
		valvulas = new boolean [2];
	}
	
	public Sensor getSensor(){
		return sensores[0];
	}
	
	public void setSensor(Sensor sensor, int tipo){
		sensores[tipo] = sensor;
	}
	
	public boolean setH(int n){
		return sensores[n].setH();
	}
	
	public boolean resetH(int n){
		return sensores[n].resetH();
	}
	
	public void alerta(int n){ 
		try {
			open(n);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void resetAlerta(int n){
		try {
			fecha(n);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void open(int n) throws Exception{
		if (sensores[0].getH() && sensores[1].getH())
			valvulas[n] = true;
		else throw new Exception();
	}
	
	public void fecha(int n) throws Exception{
		if (sensores[n].getAlerta())
			valvulas[n] = false;
		else throw new Exception();
	}
	
	public boolean getV(int n){
		return valvulas[n];
	}
}
