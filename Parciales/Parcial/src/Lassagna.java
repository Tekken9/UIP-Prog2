public class Lassagna extends Precio{
	private double unidade;
	
	public double calcularPrecio() {
		double lassag;
		 lassag = 2.25 * this.unidade;
		return lassag;
}
		
	public double getUnidade() {
		return unidade;
	}

	public void setUnidade(double unidade) {
		this.unidade = unidade;

}
}

