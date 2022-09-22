package edadusuario;

import java.util.Scanner;

public class EdadUsuario {

	public static void main(String[] args) {
		int suma;
		int edad;
		
		Scanner edadPedida = new Scanner(System.in);
		System.out.println("Que edad tienes?  ");
		edad = edadPedida.nextInt();
		suma = edad + 1;
		System.out.println("El año que viene tu edad sera " + suma);
		
		edadPedida.close();
		// TODO Auto-generated method stub

	}

}
