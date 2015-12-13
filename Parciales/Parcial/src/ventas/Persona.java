package ventas;

public abstract class Persona {
	private String nombre;
	private int edad;
	
	public void mostrar(){
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
	}

	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}