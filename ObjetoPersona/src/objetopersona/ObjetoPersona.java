package objetopersona;

import java.util.Scanner;

public class ObjetoPersona {

	public static void main(String[] args) {
		// Declaramos el scanner
		Scanner infop = new Scanner(System.in);

		// Pedimos el nombre a la persona

		System.out.print("Por favor introduzca su nombre: ");

		// y lo almacenamos en la variable nombre
		String nombre = infop.nextLine();

		// Pedimos la direccion

		System.out.print("Por favor introduzca su direccion: ");

		// lo almacenamos en la variable direcc
		String direcc = infop.nextLine();

		// Pedimos el numero de telefono

		System.out.print("Por favor introduzca su numero de telefono: ");

		// lo almacenamos en la variable num

		Long telefono = infop.nextLong();

		System.out.println("Sus datos son: " + "\n" + nombre + "\n" + direcc + "\n" + telefono);

		infop.close();
		// TODO Auto-generated method stub

	}

}
