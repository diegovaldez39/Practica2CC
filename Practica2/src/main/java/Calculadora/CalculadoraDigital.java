package Calculadora;

import java.util.Scanner;

public class CalculadoraDigital {

	public static void main(String[] args) {
		Calcu c1 = new Calcu();
		Scanner leer = new Scanner(System.in);

		System.out.println(c1.Mensaje() + "\n");

		System.out.print("Ingrese el Primer Numero: ");
		String captura1 = leer.nextLine();
		System.out.print("Ingrese el Segundo Numero: ");
		String captura2 = leer.nextLine();

		try {
			int num1 = Integer.parseInt(captura1);
			int num2 = Integer.parseInt(captura2);
			Calcu c2 = new Calcu(num1, num2);
			c2.Resultado();
		} catch (NumberFormatException ex) {
			System.out.println("No es un número");
		}
	}

}
