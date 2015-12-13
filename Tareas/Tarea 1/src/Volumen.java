
public class Volumen {
	
	private double radio;
	private double altura;
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	

	public double calcularVolumen() {
		double volumen;
		volumen= 3.1416 * this.radio* this.radio* this.altura;
		return volumen;
	}

}
