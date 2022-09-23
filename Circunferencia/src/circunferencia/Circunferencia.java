package circunferencia;

import java.util.Scanner;

public class Circunferencia {

	public static void main(String[] args) {
		/*Diseñar una aplicación que calcule la longitud y el área de una circunferencia.
		Para ello, el usuario debe introducir el radio, que puede contener decimales. 
		Usa Math.PI para tomar el valor de PI.*/
		
		//declaramos nuestras variables
		double radio;
		double area;
		double longitud;
		
		//invocamos el escanner
		
		Scanner lectura = new Scanner(System.in);
		System.out.println("Por favor introduzca el radio: ");
		radio = lectura.nextDouble();
		
		//Introducimos las formulas matematicas
		
		area = Math.PI * radio;
		longitud = 2 * Math.PI * radio;
		
		//Imprimimos en pantalla
		
		System.out.println("El area es: " + area);
		System.out.println("La longitud es: " + longitud);
		
		lectura.close();
		
		// TODO Auto-generated method stub

	}

}
