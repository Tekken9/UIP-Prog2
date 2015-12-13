package ventas;

import java.util.ArrayList;
import java.util.List;


public class Vendedores extends Persona {

	
	public static void main(String[] args) {
	
		System.out.println("Vendedores");
		
		Vendedores alfredo = new Vendedores();
		alfredo.setNombre("Alfredo Solis\t");
		alfredo.setEdad(18);
		
		Vendedores milagros = new Vendedores();
		milagros.setNombre("Milagros Carpio\t");
		milagros.setEdad(17);
		
		
		Vendedores luis = new Vendedores();
		luis.setNombre("Luis Rodriguez\t");
		luis.setEdad(19);
		
		List<String> Vendedores = new ArrayList<String>();
		Vendedores.add(alfredo.getNombre());
		Vendedores.add(milagros.getNombre());
		Vendedores.add(luis.getNombre());
		
		
		System.out.println("\nVendedor\tEdad");
		System.out.println("-------------------");
		System.out.println(alfredo.getNombre() + alfredo.getEdad());
		System.out.println(milagros.getNombre()+ milagros.getEdad());
		System.out.println(luis.getNombre()+ luis.getEdad());
	}
}

	
	