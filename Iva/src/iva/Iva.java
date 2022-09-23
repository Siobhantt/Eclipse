package iva;

import java.util.Scanner;

public class Iva {

	public static void main(String[] args) {
		/*Escribe un programa en el que declares una constante IVA de valor igual a 21.
		 *  A continuación, pídele un precio al usuario (recuerda que los precios contienen decimales) 
		 * y calcula cuál será el precio final con el IVA aplicado.*/
		
		//Declaramos la constante IVA y la variable en donde el usuario introducirá el precio
		final double valorIva = 1.21;
		double precioIntroducido;
		
		//Invocamos el Scanner
		
		Scanner porcentaje = new Scanner(System.in);
		
		//Solicitamos el precio al usuario
		
		System.out.println("Introduzca el precio :");
		precioIntroducido = porcentaje.nextDouble();
		
		//procedemos a imprimir en pantalla y hacer la multiplicacion 
		
		System.out.println("El precio con IVA es: " + precioIntroducido * valorIva);
		
		porcentaje.close();
		
		
		// TODO Auto-generated method stub

	}

}
