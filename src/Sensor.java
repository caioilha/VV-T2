import java.util.Random;
public class Sensor{
	String estado; //string ou boolean? acho q string pq tem alerta, hab ou desab
	float confiabilidade;
	Controle controle;
	final int numero;

	public Sensor(Controle controle, int numero){
		estado = "desabilitado";
		confiabilidade = 1;
		this.controle = controle;
		this.numero = numero;
	}
	
	public boolean setH(){
		if (estado.equals("habilitado") || estado.equals("alerta")){
			return false;
		}
		estado = "habilitado";
		return true;
	}
	
	public boolean resetH(){
		if (estado.equals("desabilitado")){
			return false;
		}
		estado = "desabilitado";
		return true; //falta especificação disso
	}
	
	public void setR(float r){
		if ((r > 1 || r < 0))
			System.out.println("r precisa ser entre 0 e 1");
		else confiabilidade = r;
		
	}
	
	public boolean getH(){
		if (estado.equals("habilitado") || estado.equals("alerta"))
				return true;
		return false;
	}
	
	public boolean setAlerta(){
		float teste = new Random().nextInt(11);
		//discutir sobre a parada da calibração pela confiabilidade do sensor (botar um random que só coloca habilitado se cair dentro de uma faixa???)
		teste = teste / 10;
		if (teste<= confiabilidade){
			if (estado.equals("habilitado")){
				estado = "alerta";
				controle.alerta(numero); //discutir isso
				return true;
			}
		}

		return false;
	}
	
	public boolean resetAlerta(){
		if (estado.equals("alerta")){
			estado = "habilitado";
			controle.resetAlerta(numero); //discutir isso
			return true;
		}
		return false;
	}
	
	public boolean getAlerta(){
		if (estado.equals("alerta"))
			return true;
		return false;
	}
}
