package Ejercicio2;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		
		System.out.println("Ejercicio 2");
		
		Scanner lector = new Scanner(System.in);
		
		String[] textos = new String[10];
		
		for (int i = 0; i < textos.length; i++) {
			textos[i] = lector.nextLine();
		}
		
		for (int i = textos.length-1; i >= 0; i--) {
			System.out.println(textos[i]);
		}

		lector.close();
	}

}
