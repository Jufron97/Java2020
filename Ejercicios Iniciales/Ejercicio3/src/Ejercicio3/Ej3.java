package Ejercicio3;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		
		System.out.println("Ejercicio 3");
		
		Scanner lector = new Scanner(System.in);
		
		String[] textos = new String[10];
		String pal;
		
		for (int i = 0; i < textos.length; i++) {
			textos[i] = lector.nextLine();
		}
		
		System.out.println("Ingrese una palabra");
		
		pal = lector.nextLine();
		
		for (String palabra : textos) {
			if (palabra.equalsIgnoreCase(pal)) {
				System.out.println("La palabra ya ha sido ingresada");
			}		
		}
		
		lector.close();
	}

}
