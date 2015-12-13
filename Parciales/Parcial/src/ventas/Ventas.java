package ventas;
import javax.swing.JOptionPane;

// Programa que pida por teclado un numero de ventas a calcular y que sume 
// el total de la cantidad de ventas introducidas.

public class Ventas {
 
    public static void main(String[] args) {
 
        String texto=JOptionPane.showInputDialog("Introduce el número de ventas");
 
        int numVentas=Integer.parseInt(texto);
       
        int sumaVentas=0;
        for (int i=0;i<numVentas;i++){
            texto=JOptionPane.showInputDialog("Introduce el precio de la venta"+(i+1));
            int venta=Integer.parseInt(texto);
 
            sumaVentas=sumaVentas+venta;
            
            System.out.println("El valor de las ganancias es de:\t" + sumaVentas);
}
    }
}

    
  