
public class Lentejas extends Precio{
	private double uni;
	
	public double calcularPrecio() {
		double bean;
		bean = 0.35 * this.uni;
		return bean;
}
		
	public double getUni() {
		return uni;
	}

	public void setUni(double uni) {
		this.uni = uni;

}
}
