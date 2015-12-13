import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int opc;
		
		System.out.println("MENU");
		System.out.println("----");
		System.out.println("1.Arroz $0.50 x taza");
		System.out.println("2.Lentejas $0.35 x taza");
		System.out.println("3.Porotos $0.40 x taza");
		System.out.println("4.Carne $0.70 x unidad");
		System.out.println("5.Pollo $0.50 x unidad");
		System.out.println("6.Lasagna $2.25 x unidad");
		System.out.println("7.Hamburguesa con papas $3.50 x unidad");
		
		
		
		BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("\nIngresa opcion: ");
		opc = Integer.parseInt(k.readLine());
		
		switch (opc) {
		case 1:
			System.out.println("Eligio Arroz");
			Arroz a = new Arroz();
			System.out.print("\nIngresa la cantidad de tazas deseadas");
			double u = Double.parseDouble(k.readLine());
			a.setU(u);
			System.out.println("El valor total es " + a.calcularPrecio());
			break;
		case 2:
			System.out.println("Eligio Lentejas");
			Lentejas l = new Lentejas();
			System.out.print("\nIngresa la cantidad de tazas deseadas: ");
			double uni = Double.parseDouble(k.readLine());
			l.setUni(uni);
			System.out.println("El valor total es " + l.calcularPrecio());
			break;
		case 3:
			System.out.println("Eligio Porotos");
			Porotos p = new Porotos();
			System.out.print("\nIngresa la cantidad de tazas deseadas ");
			double un = Double.parseDouble(k.readLine());
			p.setUn(un);
			System.out.println("El valor total es " + p.calcularPrecio());
			break;
		case 4:
			System.out.println("Eligio Carne");
			Carne c = new Carne();
			System.out.print("\nIngresa la cantidad de unidades deseadas ");
			double unid = Double.parseDouble(k.readLine());
			c.setUnid(unid);
			System.out.println("El valor total es " + c.calcularPrecio());
			break;
		case 5:
			System.out.println("Eligio Pollo");
			Pollo q = new Pollo();
			System.out.print("\nIngresa la cantidad de unidades deseadas ");
			double unida = Double.parseDouble(k.readLine());
			q.setUnida(unida);
			System.out.println("El valor total es " + q.calcularPrecio());
			break;
		case 6:
			System.out.println("Eligio Lasagna");
			Lassagna m = new Lassagna();
			System.out.print("\nIngresa la cantidad de unidades deseadas ");
			double unidade = Double.parseDouble(k.readLine());
			m.setUnidade(unidade);
			System.out.println("El valor total es " + m.calcularPrecio());
			break;
		case 7:
			System.out.println("Eligio Hamburguesa con papas");
			Hamburguesa h = new Hamburguesa();
			System.out.print("\nIngresa la cantidad de unidades deseadas ");
			double unidades = Double.parseDouble(k.readLine());
			h.setUnidades(unidades);
			System.out.println("El valor total es " + h.calcularPrecio());
			break;
		default:
			System.out.println("Opcion invalida");
			break;
		}

	}
}
