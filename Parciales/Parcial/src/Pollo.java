public class Pollo extends Precio{
	private double unida;
	
	public double calcularPrecio() {
		double chi;
		chi = 0.50 * this.unida;
		return chi;
}
		
	public double getUnida() {
		return unida;
	}

	public void setUnida(double unida) {
		this.unida = unida;

}
}

