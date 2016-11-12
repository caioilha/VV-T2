import java.util.Random;

public class Sensor {
	String estado;
	float confiabilidade;
	Controle controle;
	final int numero;

	public Sensor(Controle controle, int numero) {
		estado = "desabilitado";
		confiabilidade = 1;
		this.controle = controle;
		this.numero = numero;
	}

	public boolean setH() {
		if (estado.equals("habilitado") || estado.equals("alerta")) {
			return false;
		}
		estado = "habilitado";
		return true;
	}

	public boolean resetH() {
		if (estado.equals("desabilitado")) {
			return false;
		}
		estado = "desabilitado";
		return true;
	}

	public void setR(float r) {
		if ((r > 1 || r < 0))
			System.out.println("r precisa ser entre 0 e 1");
		else
			confiabilidade = r;

	}

	public boolean getH() {
		if (estado.equals("habilitado") || estado.equals("alerta"))
			return true;
		return false;
	}

	public boolean setAlerta() {
		float teste = new Random().nextInt(11);
		teste = teste / 10;
		if (teste <= confiabilidade) {
			if (estado.equals("habilitado")) {
				estado = "alerta";
				controle.alerta(numero); 
				return true;
			}
		}

		return false;
	}

	public boolean resetAlerta() {
		if (estado.equals("alerta")) {
			estado = "habilitado";
			controle.resetAlerta(numero);
			return true;
		}
		return false;
	}

	public boolean getAlerta() {
		if (estado.equals("alerta"))
			return true;
		return false;
	}
}
