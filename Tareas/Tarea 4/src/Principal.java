import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {

	private static Ajedrez a;
	private static Atletismo b;
	private static Baloncesto d;
	private static Futbol e;
	private static Karate f;
	private static Natacion g;
	private static Volleyball h;
	private static Flag i;
	private static PingPong j;
	private static Otros l;

	public static void main(String[] args) throws NumberFormatException, IOException {
		int opc;
		
		System.out.println("\tDeportes");
		System.out.println("---------------------------------------------------------------");
		System.out.println("Seleccione el deporte que usted practica");
		System.out.println("1.Ajedrez");
		System.out.println("2.Atletismo");
		System.out.println("3.Baloncesto");
		System.out.println("4.Futbol");
		System.out.println("5.Karate");
		System.out.println("6.Natación");
		System.out.println("7.Volleyball");
		System.out.println("8.Flag Football");
		System.out.println("9.Ping Pong");
		System.out.println("10.Otros");
		
		
		
		BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("\nIngresa opcion: ");
		opc = Integer.parseInt(k.readLine());
		
		
		switch (opc) {
		case 1:
			System.out.println("Eligio Ajedrez");
			a = new Ajedrez();
			int c = 1;
	        while (c ==1) {
	            c++;
		}
			break;
		case 2:
			System.out.println("Eligio Atletismo");
			b = new Atletismo();
			int co = 1;
	        while (co ==2) {
	            co++;
	        }
			break;
		case 3:
			System.out.println("Eligio Baloncesto");
			d = new Baloncesto();
			int con = 1;
	        while (con ==3) {
	            con++;
	        }
			break;
		case 4:
			System.out.println("Eligio Futbol");
			e = new Futbol();
			int cont = 1;
	        while (cont ==4) {
	            cont++;
	        }
			break;
		case 5:
			System.out.println("Eligio Karate");
			f = new Karate();
			int conta = 1;
	        while (conta ==5) {
	            conta++;
	        }
			break;
		case 6:
			System.out.println("Eligio natacion");
			g = new Natacion();
			int contado = 1;
	        while (contado ==6) {
	            contado++;
	        }
			break;
		case 7:
			System.out.println("Eligio Volleyball");
			h = new Volleyball();
			int contador = 1;
	        while (contador ==7) {
	            contador++;
	        }
			break;
	        case 8:
	        	System.out.println("Eligio Flag");
			i = new Flag();
				int contadore = 1;
		        while (contadore ==8) {
		            contadore++;
		        }
				break;
		        case 9:
		        	System.out.println("Eligio Ping Pong");
			j = new PingPong();
					int contadores = 1;
			        while (contadores ==9) {
			            contadores++;
			        }
					break;
			        case 10:
			        	System.out.println("Eligio Otros");
			l = new Otros();
						int contadoresa = 1;
				        while (contadoresa ==10) {
				            contadoresa++;
				        }
						break;
		default:
			System.out.println("Opcion invalida");
			break;
		}
		System.out.println("La cantidad de Personas que eligieron ajedrez fueron: " +a);
		System.out.println("La cantidad de Personas que eligieron ajedrez fueron: " +b);
		System.out.println("La cantidad de Personas que eligieron ajedrez fueron: " +d);
		System.out.println("La cantidad de Personas que eligieron ajedrez fueron: " +e);
		System.out.println("La cantidad de Personas que eligieron ajedrez fueron: " +f);
		System.out.println("La cantidad de Personas que eligieron ajedrez fueron: " +g);
		System.out.println("La cantidad de Personas que eligieron ajedrez fueron: " +h);
		System.out.println("La cantidad de Personas que eligieron ajedrez fueron: " +i);
		System.out.println("La cantidad de Personas que eligieron ajedrez fueron: " +j);
		System.out.println("La cantidad de Personas que eligieron ajedrez fueron: " +l);
		
	}
}
