package Ejercicio4;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		int num = Integer.parseInt(lector.nextLine());
		int[] nums = new int[20];
		int[] numsMay = new int[20];
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println("Ingrese el numero "+(i+1)+": ");
			nums[i] = Integer.parseInt(lector.nextLine());
			if (nums[i]>num) {
				numsMay[i]= nums[i];
			}
		}
			
		for (int i : numsMay) {
			if (i!=0) {
				System.out.println(i);
			}
		}
		
		lector.close();
		
	}

}
