package Ejercicio5;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int dni,sB,hsEx,totalVen,hsMes,porcenCom;
		String nom,ape,mail;
		Scanner lector = new Scanner(System.in);
				
		Empleado[] empleados = new Empleado[20];
		
		for (int i=0 ; i < empleados.length ; i++) {
			String letra;
			System.out.println("Ingrese A o V: ");
			letra = lector.nextLine();
			if (letra.equalsIgnoreCase("A")) {
				System.out.println("Ingrese nombre: ");
				nom = lector.nextLine();
				System.out.println("Ingrese apellido: ");
				ape = lector.nextLine();
				System.out.println("Ingrese mail: ");
				mail = lector.nextLine();
				System.out.println("Ingrese dni: ");
				dni = Integer.parseInt(lector.nextLine());
				System.out.println("Ingrese Sueldo base: ");
				sB = Integer.parseInt(lector.nextLine());
				System.out.println("Ingrese Horas extra: ");
				hsEx = Integer.parseInt(lector.nextLine());
				System.out.println("Ingrese Horas mes: ");
				hsMes = Integer.parseInt(lector.nextLine());
				empleados[i] = new Administrativo(dni,nom,ape,mail,sB,hsEx,hsMes);
			}
			
			if (letra.equalsIgnoreCase("V")) {
				System.out.println("Ingrese nombre: ");
				nom = lector.nextLine();
				System.out.println("Ingrese apellido: ");
				ape = lector.nextLine();
				System.out.println("Ingrese mail: ");
				mail = lector.nextLine();
				System.out.println("Ingrese dni: ");
				dni = Integer.parseInt(lector.nextLine());
				System.out.println("Ingrese Sueldo base: ");
				sB = Integer.parseInt(lector.nextLine());
				System.out.println("Ingrese porcentaje comision: ");
				porcenCom = Integer.parseInt(lector.nextLine());
				System.out.println("Ingrese total ventas: ");
				totalVen = Integer.parseInt(lector.nextLine());
				empleados[i] = new Vendedor(dni,nom,ape,mail,sB,porcenCom,totalVen);
			}
		}
		System.out.println("Empleados: ");
		for (Empleado empleado : empleados) {
			System.out.println(empleado.getDetalle());
		}

		lector.close();
		
	}

}
