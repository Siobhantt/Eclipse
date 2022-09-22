package calculoedadusuario;

import java.util.Scanner;

public class CalculoEdadUsuario {

	public static void main(String[] args) {
		
		Scanner calculoEdadUsuario = new Scanner(System.in); //el scanner es este, entonces cada vez que quiera scannear algo tengo que colocar el calculoEdadUsuario
		//meter el scanner en la variable para que lo lea
		System.out.println("En que año estas?: ");
		int añoActual = calculoEdadUsuario.nextInt();
		//Esto es la variable que debe leer un numero (por eso el "calculoedadusuario.nextint"
		System.out.println("En que año naciste?: ");
		int añoNac = calculoEdadUsuario.nextInt();
		int edadPersona =  añoActual - añoNac;
		System.out.println("Tu edad es: " + edadPersona );
		
		calculoEdadUsuario.close();
		}
		
		
		
		
				
		
		// TODO Auto-generated method stub

	}

