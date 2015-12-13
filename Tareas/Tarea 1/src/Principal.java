import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		int opc;
		
		System.out.println("MENU");
		System.out.println("----------------------------------------");
		System.out.println("1. Calcular Volumen");
		System.out.println("2. Calcular Superficie");
		
		BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("\nIngresa opcion: ");
		opc = Integer.parseInt(k.readLine());
		
		switch (opc) {
		case 1:
			System.out.println("Eligio calcular volumen");
			Volumen v = new Volumen();
			System.out.print("\nIngresa el radio: ");
			double radio = Double.parseDouble(k.readLine());
			v.setRadio(radio);
			System.out.print("\nIngresa la altura: ");
			double altura = Double.parseDouble(k.readLine());
			v.setAltura(altura);
			System.out.println("El Volumen es de " + v.calcularVolumen());
			break;
		case 2:
			System.out.println("Eligio calcular Superficie");
			Superficie s = new Superficie();
			System.out.print("\nIngresa el radio: ");
			double radio1 = Double.parseDouble(k.readLine());
			s.setRadio1(radio1);
			System.out.print("\nIngresa la altura: ");
			double altura1 = Double.parseDouble(k.readLine());
			s.setAltura1(altura1);
			System.out.println("La superficie es de " + s.calcularSuperficie());
			break;
		default:
			System.out.println("Opcion invalida");
			break;
		}

	}
}