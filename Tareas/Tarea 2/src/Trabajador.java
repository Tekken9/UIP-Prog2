public class Trabajador extends Persona {
	private double sueldoBruto;
	
	
	public double calcularSalarioNeto() {
		return this.sueldoBruto;
	}

	public double getSueldoBruto() {
		return sueldoBruto;
	}

	public void setSueldoBruto(double sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}

	public double calcularSalarioNeto1() {
		return this.sueldoBruto + (this.sueldoBruto/2);
	}

public double getSueldoBruto1() {
		return this.sueldoBruto + (this.sueldoBruto/2);
	}

	public void setSueldoBruto1(double sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}
	}
