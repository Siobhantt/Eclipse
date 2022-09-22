package lecturadatos;

import java.util.Scanner;

public class LecturaDatos {

	public static void main(String[] args) {
		// Le pedimos un numero al usuario
		Scanner lectura = new Scanner(System.in);
		
		//Declaro la variable num donde guardaré el numero 
		System.out.println("Introduzca un número:  ");
		double numero = lectura.nextDouble();
		
		System.out.println(numero);
		lectura.close();
		// TODO Auto-generated method stub

	}

}
