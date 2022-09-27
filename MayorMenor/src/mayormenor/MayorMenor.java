package mayormenor;

import java.util.Scanner;

public class MayorMenor {

	public static void main(String[] args) {
		//Realizar una aplicación que solicite al usuario su edad y le indique si es mayor de edad 
		//(mediante un literal booleano: true o false).
		 
		//Zona de Variables
		int edad;
		final int MAYORIA_EDAD;
		int menoriaEdad;
		boolean comparar;
		boolean comparar2;
		
		//Establecemos la constante 18
		
		MAYORIA_EDAD = 18;
		
		//Establecemos el Scanner
		 
		Scanner sc = new Scanner(System.in); 
		
		//imprimimos en pantalla la solicitud
		System.out.println("Introduzca su edad: ");
		edad = sc.nextInt();
		 
		
		comparar = 18<edad?true:false;
		System.out.println("Eres menor de edad?: " + comparar);
		comparar2 = 18>=edad?false:true;
		System.out.println("Eres mayor de edad?: " + comparar2);
		
		
		System.out.println(comparar2);
		
		
		
		

		
		// TODO Auto-generated method stub

	}

}
