import javax.swing.JOptionPane;
public class Principal {
 
    public static void main(String[] args) {
 
        int numero=0;
        int numero1=0;
        do{
            String texto=JOptionPane.showInputDialog("Introduce el primer numero");
            numero=Integer.parseInt(texto);
            
            String texto1=JOptionPane.showInputDialog("Introduce el segundo numero");
            numero1=Integer.parseInt(texto1);
            
        }while(numero<0 && numero1<0);
 
        int contador=0;
        for (int i=numero;i>0;i/=10){
            contador++;
         int contador1=0;
         for (int j=numero1;j>0;j/=10){
                contador1++;
        }
         
         int contadores=contador+contador1;
 
        if (contador==1){
            System.out.println("El numero "+numero+ " tiene "+contador+" cifra");
        }else{
            System.out.println("El numero "+numero+ " tiene "+contador+" cifras");
        }
        
        if (contador1==1){
            System.out.println("El numero "+numero1+ " tiene "+contador1+" cifra");
        }else{
            System.out.println("El numero "+numero1+ " tiene "+contador1+" cifras");
        }
        System.out.println("Los numeros suman "+numero+ "y" +numero1+ " tienen" +contadores+  " cifras");   
    }
    }
    
}
