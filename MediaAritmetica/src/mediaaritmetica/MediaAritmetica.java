package mediaaritmetica;

import java.util.Scanner;

public class MediaAritmetica {

	public static void main(String[] args) {
		Scanner media = new Scanner(System.in);
		
		System.out.println("Introduzca la primera nota: ");
		double nota1 = media.nextInt();
		
		System.out.println("Introduzca la segunda nota: ");
		double nota2 = media.nextInt();
		
		double notaA = nota1 + nota2;
		double notaB = notaA/2;
		System.out.println("LA NOTA MEDIA ES: " + notaB);
		
		
		media.close();
		// TODO Auto-generated method stub

	}

}
