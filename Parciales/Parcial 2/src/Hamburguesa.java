public class Hamburguesa extends Precio{
	private double unidades;
	
	public double calcularPrecio1() {
		double ham;
		ham = 3.50 * this.unidades;
		return ham;
}
		
	public double getUnidades() {
		return unidades;
	}

	public void setUnidades(double unidades) {
		this.unidades = unidades;

}
}
