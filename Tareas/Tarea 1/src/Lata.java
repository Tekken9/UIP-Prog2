public class Lata {
	
	private double altura;
	private double radio;
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}	
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}	
	
	public double calcularVolumen() {
		double volumen;
		volumen= 3.1416 * this.radio* this.radio* this.altura;
		return volumen;
	}
	
	public double calcularSuperficie(){
		double superficie;
		superficie= (2 * 3.1416) * (this.radio * this.radio) + (2 * 3.1416) * (this.radio * this.altura);
	return superficie;
	
	}

}
