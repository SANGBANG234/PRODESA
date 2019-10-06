import java.util.*;

public class Arreglos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
      		int i;
      		//arreglo de enteros
      		int numeros[] = new int[10];
      		//media
      		double promedio = 0;
      		//lectura de datos y llenar el arreglo
      		System.out.println("lectura de los elementos"
      			+ "del arreglo");
      			//vamos a nececistar un for para la lectura.
      			for (i=0; i<numeros.length ; i++) {

      			 	System.out.println("ANOTA TUS NUMEROS: [" + i + "] = ");
 					numeros[i] = leer.nextInt();
      			 } 
          
      		
      			 
      	   System.out.println("Media de los valores que "
      	   	  + "Se encuentran en la posicion par es:" + promedio );

    }
    
}
