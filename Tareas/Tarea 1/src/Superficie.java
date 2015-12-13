
public class Superficie {
	
	private double altura1;
	private double radio1;
	
	public double getRadio1() {
		return getRadio1();
	}

	public void setRadio1(double radio1) {
		this.radio1 = radio1;
	}

	public double getAltura1() {
		return altura1;
	}

	public void setAltura1(double altura1) {
		this.altura1 = altura1;
	}
	

	public double calcularSuperficie(){
		double superficie;
		superficie= (2 * 3.1416) * (this.radio1 * this.radio1) + (2 * 3.1416) * (this.radio1 * this.altura1);
	return superficie;
	
	}

}
