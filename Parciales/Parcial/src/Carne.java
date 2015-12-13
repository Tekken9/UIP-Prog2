public class Carne extends Precio{
	private double unid;
	
	public double calcularPrecio() {
		double meat;
		meat = 0.70 * this.unid;
		return meat;
}
		
	public double getUnid() {
		return unid;
	}

	public void setUnid(double unid) {
		this.unid = unid;

}
}
