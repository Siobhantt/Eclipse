package cuatroresultados;

import java.util.Scanner;

public class CuatroResultados {

	public static void main(String[] args) {
		//Declaramos el scanner
		Scanner resultados = new Scanner(System.in);
		
		//Pedimos un numero al usuario
		System.out.print("Introduzca un numero: ");
		float numero1 = resultados.nextInt();
		
		//Pedimos otro numero al usuario
		System.out.print("Introduzca otro numero: ");
		float numero2 = resultados.nextInt();
		
		//Realizamos las operaciones, primero la suma, asignamos la operacion a la variable suma
		float suma = numero1 + numero2;
		System.out.println("El resultado de la suma es: " + suma);
		
		//Continuamos con la resta.
		float resta = numero1 - numero2;
		System.out.println("El resultado de la resta es: " + resta);
		
		//Seguimos con la multiplicacion
		float multi = numero1 * numero2;
		System.out.println("El resultado de la multiplicacion es: " + multi);
		
		//Y concluimos con la division
		float divi = numero1 / numero2;
		System.out.println("El resultado de la division es: " + divi);
		
		
		
		resultados.close();
		
		
		
		// TODO Auto-generated method stub

	}

}
