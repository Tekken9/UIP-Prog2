public class Porotos extends Precio{
	private double un;
	
	public double calcularPrecio() {
		double beans;
		beans = 0.40 * this.un;
		return beans;
}
		
	public double getUn() {
		return un;
	}

	public void setUn(double un) {
		this.un = un;

}
}

