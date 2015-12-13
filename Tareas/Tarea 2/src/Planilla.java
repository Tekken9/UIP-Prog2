import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Planilla {

		public static void main(String[] args) throws NumberFormatException, IOException {
			

			System.out.println("PLANILLA");
			
			BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
			
			int ht = 0;
	        while (ht < 40) {
	    
		System.out.println("Introduzca las horas trabajadas");
		ht = Integer.parseInt(k.readLine());
		
			Trabajador juan = new Trabajador();
			juan.setNombre("Juan Sanchez");
			juan.setEdad(35);
			juan.setSueldoBruto(850.00);
			
			System.out.println("Introduzca las horas trabajadas");
			ht = Integer.parseInt(k.readLine());
			
			Trabajador jose = new Trabajador();
			jose.setNombre("Jose Acevedo");
			jose.setEdad(27);
			jose.setSueldoBruto(1050.00);
			
			System.out.println("Introduzca las horas trabajadas");
			ht = Integer.parseInt(k.readLine());
			
			Trabajador luis = new Trabajador();
			luis.setNombre("Luis Perez");
			luis.setEdad(21);
			luis.setSueldoBruto(1200.00);
			
			System.out.println("Introduzca las horas trabajadas");
			ht = Integer.parseInt(k.readLine());
			
			Trabajador alfredo = new Trabajador();
			alfredo.setNombre("Alfredo Solis");
			alfredo.setEdad(18);
			alfredo.setSueldoBruto(700.00);
			
			System.out.println("Introduzca las horas trabajadas");
			ht = Integer.parseInt(k.readLine());
			
			Trabajador fernando = new Trabajador();
			fernando.setNombre("Fernando Torres");
			fernando.setEdad(30);
			fernando.setSueldoBruto(1500.00);
			
			
			System.out.println("\nEmpleado \t Salario Neto");
			System.out.println("-------- \t ------------");
			if (ht<40){
			System.out.println(juan.getNombre() + " \t " + juan.calcularSalarioNeto());
			}else if (ht>40){
			System.out.println(juan.getNombre() + " \t " + juan.calcularSalarioNeto1());
			}
			if (ht<40){
			System.out.println(jose.getNombre() + " \t " + jose.calcularSalarioNeto());
			}else if (ht<40){
			System.out.println(jose.getNombre() + " \t " + jose.calcularSalarioNeto1());
			}
			if (ht<40){
			System.out.println(luis.getNombre() + " \t " + luis.calcularSalarioNeto());
			}else if (ht>40){
			System.out.println(luis.getNombre() + " \t " + luis.calcularSalarioNeto1());
			if (ht<40){
			System.out.println(alfredo.getNombre() + " \t " + alfredo.calcularSalarioNeto());
			}else if (ht>40){
			System.out.println(alfredo.getNombre() + " \t " + alfredo.calcularSalarioNeto1());	
			}
			if (ht<40){
			System.out.println(fernando.getNombre() + "\t " + fernando.calcularSalarioNeto());
			}else if (ht>40){
			System.out.println(fernando.getNombre() + "\t " + fernando.calcularSalarioNeto1());	
			}
			
		}		
	        }
		}
}

	        

			
				
				

	
