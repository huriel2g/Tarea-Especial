package transportes;

import java.util.Scanner;

public class Personal {

	public static void main(String[] args) {
		String Puesto; 
		String Depto;
		String Nombre;
		String Direccion;
		int DPI;

		Scanner tipo = new Scanner(System.in);
		System.out.println("Ingrese los datos: ");
		Puesto =tipo.next();
		Depto =tipo.next();
		Nombre =tipo.next();
		Direccion =tipo.next();
		DPI =tipo.nextInt();
	}

}
