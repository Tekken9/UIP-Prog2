
public class Arroz extends Precio{
	private double u;
	
	public double calcularPrecio() {
		double rice;
		rice = 0.50 * this.u;
		return rice;
		
	}
	
	public double getU() {
		return u;
	}

	public void setU(double u) {
		this.u = u;

}
}



